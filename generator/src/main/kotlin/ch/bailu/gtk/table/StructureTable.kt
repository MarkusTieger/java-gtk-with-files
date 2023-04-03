package ch.bailu.gtk.table

import ch.bailu.gtk.log.Logable
import ch.bailu.gtk.model.type.NamespaceType
import ch.bailu.gtk.validator.Validator
import java.io.Writer

object StructureTable : Logable {
    private val table: MutableMap<String, MutableMap<String, Introspection>> = HashMap()

    fun add(namespace: String, name: String, getType: Boolean) {
        Validator.giveUp("name is empty", name.isEmpty())
        val map = getTable(namespace)
        if (map[name] == null) {
            map[name] = Introspection(getType)
        } else {
            Validator.giveUp("Type with same name")
        }
    }

    private fun getTable(namespace: String): MutableMap<String, Introspection> {
        var result = table[namespace]
        if (result == null) {
            result = HashMap()
            table[namespace] = result
        }
        return result
    }

    fun contains(namespace: String, name: String): Boolean {
        return getTable(namespace)[name] != null
    }

    fun contains(namespaceType: NamespaceType): Boolean {
        return contains(namespaceType.namespace, namespaceType.name)
    }

    fun hasGetType(namespace: String, name: String): Boolean {
        return getTable(namespace)[name]?.hasGetType ?: false
    }

    override fun log(writer: Writer) {
        table.onEach { namespace ->
            writer.write("{${namespace.key}\n")
            namespace.value.forEach { structure ->
                val getType = if (structure.value.hasGetType) "get-type" else ""

                writer.write(String.format("    %-40s%s\n", structure.key, getType))
            }
            writer.write("}\n\n")

        }
    }

    /**
     * To clean up after unit test
     */
    fun clear() {
        table.clear()
    }
}

/**
glib:get-type="adw_animation_target_get_type" -> size
glib:type-struct="AnimationTargetClass" -> type-struct --> indirect size
 */
data class Introspection(val hasGetType: Boolean)
