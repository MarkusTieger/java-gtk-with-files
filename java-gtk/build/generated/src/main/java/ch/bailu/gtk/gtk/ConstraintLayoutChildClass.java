/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ConstraintLayoutChildClass.html">https://docs.gtk.org/gtk4/struct.ConstraintLayoutChildClass.html</a></p>
*/
public class ConstraintLayoutChildClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConstraintLayoutChildClass.class.getCanonicalName());
    }

    public ConstraintLayoutChildClass(PointerContainer pointer) {
        super(pointer);
    }

    public ConstraintLayoutChildClass() {
        super(cast(JnaConstraintLayoutChildClass.allocateStructure()));
    }

    private JnaConstraintLayoutChildClass.Fields _fields;
    
    JnaConstraintLayoutChildClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaConstraintLayoutChildClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ConstraintLayoutChild.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ConstraintLayoutChild.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
