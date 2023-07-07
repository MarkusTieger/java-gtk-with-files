/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure used as the base of all interface types.
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeInterface.html">https://docs.gtk.org/gobject/struct.TypeInterface.html</a></p>
*/
public class TypeInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeInterface.class.getCanonicalName());
    }

    public TypeInterface(PointerContainer pointer) {
        super(pointer);
    }

    public TypeInterface() {
        super(cast(JnaTypeInterface.allocateStructure()));
    }

    private JnaTypeInterface.Fields _fields;
    
    JnaTypeInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String G_TYPE = "g_type";

    /**
     * 
    */
    public long getFieldGType() {
       toFields().readField(G_TYPE);
       return toFields().g_type;
    } 

    /**
     * 
    */
    public static final String G_INSTANCE_TYPE = "g_instance_type";

    /**
     * 
    */
    public long getFieldGInstanceType() {
       toFields().readField(G_INSTANCE_TYPE);
       return toFields().g_instance_type;
    } 

    /**
     * Returns the corresponding &#35;GTypeInterface structure of the parent type
     * <br>of the instance type to which &#64;g_iface belongs. This is useful when
     * <br>deriving the implementation of an interface from the parent type and
     * <br>then possibly overriding some methods.
     * @return the     corresponding &#35;GTypeInterface structure of the parent type of the     instance type to which &#64;g_iface belongs, or %NULL if the parent     type doesn't conform to the interface
    */
    public ch.bailu.gtk.type.Pointer peekParent()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeInterface.INST().g_type_interface_peek_parent(asCPointer())));
    }

    /**
     * Adds &#64;prerequisite_type to the list of prerequisites of &#64;interface_type.
     * <br>This means that any type implementing &#64;interface_type must also implement
     * <br>&#64;prerequisite_type. Prerequisites can be thought of as an alternative to
     * <br>interface derivation (which GType doesn't support). An interface can have
     * <br>at most one instantiatable prerequisite type.
     * @param interface_type &#35;GType value of an interface type
     * @param prerequisite_type &#35;GType value of an interface or instantiatable type
    */
    public static void addPrerequisite(long interface_type, long prerequisite_type)  {
        JnaTypeInterface.INST().g_type_interface_add_prerequisite(interface_type, prerequisite_type);
    }

    /**
     * Returns the &#35;GTypePlugin structure for the dynamic interface
     * <br>&#64;interface_type which has been added to &#64;instance_type, or %NULL
     * <br>if &#64;interface_type has not been added to &#64;instance_type or does
     * <br>not have a &#35;GTypePlugin structure. See g_type_add_interface_dynamic().
     * @param instance_type &#35;GType of an instantiatable type
     * @param interface_type &#35;GType of an interface type
     * @return the &#35;GTypePlugin for the dynamic     interface &#64;interface_type of &#64;instance_type
    */
    public static TypePlugin getPlugin(long instance_type, long interface_type)  {
        return new TypePlugin(new PointerContainer(JnaTypeInterface.INST().g_type_interface_get_plugin(instance_type, interface_type)));
    }

    /**
     * Returns the most specific instantiatable prerequisite of an
     * <br>interface type. If the interface type has no instantiatable
     * <br>prerequisite, %G_TYPE_INVALID is returned.
     * <br>
     * <br>See g_type_interface_add_prerequisite() for more information
     * <br>about prerequisites.
     * @param interface_type an interface type
     * @return the instantiatable prerequisite type or %G_TYPE_INVALID if none
    */
    public static long instantiatablePrerequisite(long interface_type)  {
        return JnaTypeInterface.INST().g_type_interface_instantiatable_prerequisite(interface_type);
    }

    /**
     * Returns the &#35;GTypeInterface structure of an interface to which the
     * <br>passed in class conforms.
     * @param instance_class a &#35;GTypeClass structure
     * @param iface_type an interface ID which this class conforms to
     * @return the &#35;GTypeInterface     structure of &#64;iface_type if implemented by &#64;instance_class, %NULL     otherwise
    */
    public static ch.bailu.gtk.type.Pointer peek(@Nonnull ch.bailu.gtk.type.Pointer instance_class, long iface_type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeInterface.INST().g_type_interface_peek(asCPointerNotNull(instance_class), iface_type)));
    }

    public static int getInstanceSize() {
        return 16;
    }

}

/*
record-type
all-fields-supported

[MethodModel:java-type-not-supported:prerequisites:[ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
