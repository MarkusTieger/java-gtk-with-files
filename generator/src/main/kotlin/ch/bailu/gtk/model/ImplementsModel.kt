package ch.bailu.gtk.model

import ch.bailu.gtk.log.DebugPrint
import ch.bailu.gtk.model.type.ClassType
import ch.bailu.gtk.parser.tag.NamedWithDocTag

/**
 * A class can implement interfaces:
 * <implements name="Gtk.Accessible"/>
 */
class ImplementsModel(private val currentNamespace: String, tag: NamedWithDocTag): Model() {
    private val classType: ClassType =
        ClassType(currentNamespace, tag.getName(), tag.getName())

    /**
     * API Type name including namespace if not current namespace
     */
    val apiTypeName: String
        get() = classType.getApiTypeName(currentNamespace)

    /**
     * API Type name without namespace
     */
    val name: String
        get() = classType.type.name

    init {
        setSupported("type-not-supported", classType.valid)
    }

    override fun toString(): String {
        return DebugPrint.colon(this, supportedState, classType.toString())
    }
}
