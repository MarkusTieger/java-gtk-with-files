package ch.bailu.gtk.parser.tag

import ch.bailu.gtk.validator.Validator
import java.io.IOException

class StructureTag(parent: TagWithParent, val structureType: String): NamedWithDocTag(parent) {

    var parent = ""
        private set

    var disguised = false
        private set

    var type = ""
        private set

    var getType = ""
        private set

    var isTypeStructFor = ""
        private set

    val implements = TagList<NamedWithDocTag>()
    val constructors = TagList<MethodTag>()
    val functions = TagList<MethodTag>()


    val virtuals = TagList<MethodTag>()
    val methods = TagList<MethodTag>()

    val signals = TagList<MethodTag>()
    val fields = TagList<FieldTag>()

    override fun getChild(name: String): TagWithParent {
        if ("field" == name) {
            return fields.addTag(FieldTag(this))
        }
        if ("implements" == name) {
            return implements.addTag(NamedWithDocTag(this))
        }
        if ("constructor" == name) {
            return constructors.addTag(MethodTag(this))
        }
        if ("virtual-method" == name) {
            return virtuals.addTag(MethodTag(this))
        }
        if ("method" == name) {
            return methods.addTag(MethodTag(this))
        }
        if ("glib:signal" == name) {
            return signals.addTag(MethodTag(this))
        }
        if ("function" == name) {
            val f = MethodTag(this)
            functions.add(f)
            return f
        }
        return super.getChild(name)
    }

    @Throws(IOException::class)
    override fun end() {
        Validator.giveUp("name is empty $this", getName().isEmpty())
        getBuilder().buildStructure(this)
    }

    override fun setAttribute(name: String, value: String) {
        if ("parent" == name) {
            parent = value
        } else if ("disguised" == name) {
            disguised = "1" == value
        } else if ("c:type" == name) {
            type = value
        } else if ("glib:get-type" == name) {
            getType = value
        } else if ("glib:is-gtype-struct-for" == name) {
            isTypeStructFor = value
        } else {
            super.setAttribute(name, value)
        }
    }
}
