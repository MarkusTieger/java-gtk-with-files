package ch.bailu.gtk.model

import ch.bailu.gtk.log.DebugPrint
import ch.bailu.gtk.model.filter.filterValues
import ch.bailu.gtk.model.type.CType
import ch.bailu.gtk.model.type.CallbackType
import ch.bailu.gtk.model.type.ClassType
import ch.bailu.gtk.model.type.JavaType
import ch.bailu.gtk.validator.Validator
import ch.bailu.gtk.parser.tag.ParameterTag
import ch.bailu.gtk.table.EnumTable
import ch.bailu.gtk.writer.Names

class ParameterModel(namespace: String,
                     private val parameterTag: ParameterTag,
                     isConstant: Boolean,
                     preferNative: Boolean) : Model() {

    private val cType: CType
    private val classType = ClassType(namespace, parameterTag)
    private val callbackType = CallbackType(namespace, parameterTag.getTypeName())
    private val jType: JavaType
    val hasNativeVariant: Boolean
    val isNativeVariant: Boolean

    var name: String = if (isConstant) {
        Names.getJavaConstantName(parameterTag.getName())
    } else {
        Names.getJavaVariableName(parameterTag.getName())
    }

    val callbackModel: MethodModel?

    init {
        if (!classType.valid && EnumTable.isEnum(namespace, parameterTag)) {
            this.cType = CType("int")
            this.jType = JavaType("int")
            hasNativeVariant = false

        } else {
            val cType = CType(parameterTag.getType())
            val jType = JavaType(parameterTag.getType())
            hasNativeVariant = classType.valid && jType.valid

            if (hasNativeVariant && preferNative) {
                this.cType = cType
                this.jType = jType

            } else if (classType.valid) {
                this.cType = CType("void*")
                this.jType = JavaType("long")

            } else if (parameterTag.isVarargs) {
                this.cType = CType("Object...")
                this.jType = JavaType("...")
            } else {
                this.cType = cType
                this.jType = jType
            }
        }

        isNativeVariant = hasNativeVariant && preferNative

        callbackModel = createCallbackModel(classType, namespace)

        setSupported("value-not-supported", filterValues(parameterTag.value))
        setSupported("java-type-not-supported", jType.valid || isCallback)
        setSupported("direct-type", classType.referenceType || classType.wrapper || isCallback)
        setCallbackSupported()
    }

    private fun createCallbackModel(classType: ClassType, namespace: String): MethodModel? {
        val parameterNamespace = classType.namespace.ifEmpty {
            namespace
        }

        if (callbackType.valid) {
            if (callbackType.callbackTag != null) {
                return MethodModel(namespace, parameterNamespace, callbackType.callbackTag, preferNative = false)
            }
        }
        return null
    }

    private fun setCallbackSupported() {
        if (isCallback) {
            if (callbackModel == null) {
                Validator.giveUp("no-cb-model")
            } else if (!callbackModel.isSupported) {
                setSupported("cb-not-supported", false)
            } else if (callbackModel.hasCallback()) {
                setSupported("cb-with-cb", false)
            }
        }
    }

    /**
     * Return valid and conventional Java type name or native type name
     * Add namespace to classes if they are in a different namespace
     * @param namespace namespace where other namespace is relative for
     */
    fun getApiTypeName(namespace: String): String {
        return if (isCallback && callbackModel != null) {
            Names.getJavaCallbackInterfaceName(callbackModel.name)
        } else if (classType.valid && !isNativeVariant) {
            classType.getApiTypeName(namespace)
        } else {
            jType.getApiTypeName()
        }
    }

    val impType: String
        get() {
            return jType.getApiTypeName()
        }

    val isVoid: Boolean
        get() = jType.isVoid()

    val isJavaNative: Boolean
        get() {
            return !classType.valid || isNativeVariant
        }

    private val gtkType: String
        get() {
            return cType.type
        }

    override fun toString(): String {
        return if (isCallback) {
            val cb = DebugPrint.colon(supportedState, callbackModel.toString())
            "<cb>\n${" ".repeat(8)}${cb}\n${" ".repeat(8)}<cb>}"

        } else {
            DebugPrint.colon(
                supportedState,
                parameterTag.toString(),
                gtkType,
                getApiTypeName("")
            )
        }
    }

    val isCallback: Boolean
        get() = callbackType.valid

    val value: String
        get() = parameterTag.value

    val doc: String
        get() = parameterTag.getDoc()

    val nullable: Boolean
        get() = parameterTag.nullable
}
