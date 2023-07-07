/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure used as the base of all type instances.
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeInstance.html">https://docs.gtk.org/gobject/struct.TypeInstance.html</a></p>
*/
public class TypeInstance extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeInstance.class.getCanonicalName());
    }

    public TypeInstance(PointerContainer pointer) {
        super(pointer);
    }

    public TypeInstance() {
        super(cast(JnaTypeInstance.allocateStructure()));
    }

    private JnaTypeInstance.Fields _fields;
    
    JnaTypeInstance.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeInstance.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String G_CLASS = "g_class";

    /**
     * 
    */
    public TypeClass getFieldGClass() {
       toFields().readField(G_CLASS);
       return new TypeClass(new PointerContainer(toFields().g_class));
    } 

    /**
     * 
     * @param private_type 
     * @return 
    */
    public ch.bailu.gtk.type.Pointer getPrivate(long private_type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeInstance.INST().g_type_instance_get_private(asCPointer(), private_type)));
    }

}

/*
record-type
all-fields-supported
*/
