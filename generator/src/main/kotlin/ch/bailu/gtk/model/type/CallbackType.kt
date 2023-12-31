package ch.bailu.gtk.model.type

import ch.bailu.gtk.log.DebugPrint
import ch.bailu.gtk.parser.tag.CallbackTag
import ch.bailu.gtk.table.AliasTable
import ch.bailu.gtk.table.CallbackTable
import ch.bailu.gtk.writer.Names

class CallbackType(namespace: String, typeName: String): Type() {
    val type =  AliasTable.convert(NamespaceType(namespace, typeName))
    val callbackTag = CallbackTable[type.namespace, type.name]
    val valid: Boolean = callbackTag is CallbackTag

    fun getApiTypeName(namespace: String = ""): String {
        return Names.getApiTypeName(type, namespace)
    }

    override fun getDebugIdentifier(): String {
        return "cb"
    }

    override fun toString(): String {
        return DebugPrint.colon(this, type.name)
    }
}
