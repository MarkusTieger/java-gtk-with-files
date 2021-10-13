package ch.bailu.gtk.model

import ch.bailu.gtk.converter.NamespaceType
import ch.bailu.gtk.converter.RelativeNamespaceType
import ch.bailu.gtk.model.compose.CodeComposer
import ch.bailu.gtk.model.filter.*
import ch.bailu.gtk.model.list.ModelLists
import ch.bailu.gtk.model.type.StructureType
import ch.bailu.gtk.table.AliasTable.convert
import ch.bailu.gtk.parser.tag.EnumerationTag
import ch.bailu.gtk.parser.tag.NamespaceTag
import ch.bailu.gtk.parser.tag.ParameterTag
import ch.bailu.gtk.parser.tag.StructureTag
import ch.bailu.gtk.writer.CodeWriter
import ch.bailu.gtk.writer.getJavaClassName
import ch.bailu.gtk.writer.getJavaImpClassName
import ch.bailu.gtk.writer.getJavaPackageConstantsInterfaceName
import java.io.IOException


class StructureModel : Model {
    val apiName: String
    val nameSpaceModel: NamespaceModel
    
    private var parent: StructureModel
    private var models = ModelLists()

    val structureType: StructureType
    
    val cType: String
    val doc: String

    constructor(structure: StructureTag, nameSpace: NamespaceModel) {
        cType = structure.getType()
        nameSpaceModel = nameSpace
        structureType = StructureType(structure.getStructureType())
        apiName = convert(nameSpace.getNamespace(), structure.getName())
        parent = StructureModel(nameSpace.getNamespace(), structure.getParentName(), structureType)
        doc = structure.getDoc()
        for (m in structure.getConstructors()) {
            models.privateFactories.addIfSupported(filterConstructor(MethodModel(nameSpace.getNamespace(), m)))
        }

        models.privateFactories.forEach {
            if (it.isConstructorType) {
                models.constructors.add(it)
            } else {
                models.factories.add(it)
            }
        }

        for (method in structure.getMethods()) {
            models.addIfSupportedWithCallbacks(models.methods, filter(MethodModel(nameSpace.getNamespace(), method)))
        }
        for (signal in structure.getSignals()) {
            models.signals.addIfSupported(MethodModel(nameSpace.getNamespace(), signal))
        }
        for (field in structure.getFields()) {
            val fieldModel = ParameterModel(nameSpace.getNamespace(), field, false, filterFieldDirectAccess(this))
            models.fields.addIfSupported(filterField(fieldModel))
        }
        for (m in structure.getFunctions()) {
            models.addIfSupportedWithCallbacks(models.functions, filter(MethodModel(nameSpace.getNamespace(), m)))
        }
    }

    private fun convert(namespace: String, name: String): String {
        val from = NamespaceType(namespace, name)
        return convert(from).getName()
    }

    private fun filterField(parameterModel: ParameterModel): ParameterModel {
        parameterModel.setSupported("Callback", !parameterModel.isCallback)
        parameterModel.setSupported("Filter", filterField(this))
        return parameterModel
    }

    private fun filterConstructor(methodModel: MethodModel): MethodModel {
        methodModel.setSupported("Callback", !methodModel.hasCallback())
        return filter(methodModel)
    }

    private fun filter(methodModel: MethodModel): MethodModel {
        methodModel.setSupported("Filter", filterMethod(this, methodModel))
        return methodModel
    }

    /**
     * Gets called from builder when namespace ends
     * Create static class for package scoped functions
     * @param namespace
     */
    constructor(namespace: NamespaceTag) {
        doc=""
        cType = ""
        nameSpaceModel = NamespaceModel(namespace)
        structureType = StructureType(StructureType.Types.PACKAGE)
        apiName = getJavaClassName(nameSpaceModel.getNamespace())
        parent = StructureModel(nameSpaceModel.getNamespace(), "", structureType)
        for (m in namespace.getFunctions()) {
            models.addIfSupportedWithCallbacks(models.functions, filter(MethodModel(nameSpaceModel.getNamespace(), m)))
        }
    }

    /**
     * This gets called from builder when namespace ends
     * Create interface with package scoped constants
     * @param namespace
     * @param members
     */
    constructor(namespace: NamespaceModel, members: List<ParameterTag>) : this(namespace, getJavaPackageConstantsInterfaceName(namespace.getNamespace()), members, false)

    /**
     * Gets called from ModelBuilder
     * Create interface with constants
     * @param namespace
     * @param enumeration
     */
    constructor(namespace: NamespaceModel, enumeration: EnumerationTag) : this(namespace, enumeration.getName(), enumeration.getMembers(), true) {}

    /**
     * Create interface with constants
     * @param namespace
     * @param name
     * @param members
     */
    private constructor(namespace: NamespaceModel, name: String, members: List<ParameterTag>, toUpper: Boolean) {
        nameSpaceModel = namespace
        structureType = StructureType(StructureType.Types.ENUMERATION)
        apiName = name
        doc = ""
        cType = ""
        parent = this

        for (parameterTag in members) {
            models.constants.addIfSupported(ParameterModel(namespace.getNamespace(), parameterTag, toUpper, false))
        }
    }

    // parent initializer
    private constructor(defaultNamespace: String, className: String, structType: StructureType) {
        doc = ""
        cType = ""
        structureType = structType
        parent = this

        if (className == "") {
            nameSpaceModel = NamespaceModel()
            if (structType.isRecord) {
                apiName = nameSpaceModel.getFullNamespace() + ".type.Record"
            } else if (structType.isPackage) {
                apiName = nameSpaceModel.getFullNamespace() + ".type.Package"
            } else if (structType.isCallback) {
                apiName = nameSpaceModel.getFullNamespace() + ".type.Callback"
            } else {
                apiName = nameSpaceModel.getFullNamespace() + ".type.Pointer"
            }
        } else {
            val type = RelativeNamespaceType(defaultNamespace, className)
            val typeNamespaceModel = NamespaceModel(type)
            if (typeNamespaceModel.isSupported) {
                nameSpaceModel = typeNamespaceModel
                if (type.hasCurrentNamespace()) {
                    apiName = type.getName()
                } else {
                    apiName = nameSpaceModel.getFullNamespace() + "." + type.getName()
                }
            } else {
                nameSpaceModel = NamespaceModel()
                apiName = nameSpaceModel.getFullNamespace() + ".type.Outsider"
            }
        }
    }

    fun hasNativeCalls(): Boolean {
        if (isSupported) {
            if (structureType.isRecord && filterCreateMallocConstructor(this)) {
                return true
            } else if (structureType.isPackage || structureType.isClassType) {
                return models.hasNativeCalls()
            }
        }
        return false
    }

    val isClassType: Boolean
        get()  = structureType.isClassType


    @Throws(IOException::class)
    fun write(writer: CodeWriter) {
        CodeComposer.factory(structureType).write(writer, this, models)
    }


    val isRecord: Boolean
        get() = structureType.isRecord

    val impName: String
        get() = getJavaImpClassName(apiName)

    val apiParentName: String
        get() = parent.apiName


    fun hasDefaultConstructor(): Boolean {
        return models.constructors.find { return it.getParameters().isEmpty() } != null
    }
}