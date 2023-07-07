/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ConstraintGuideClass.html">https://docs.gtk.org/gtk4/struct.ConstraintGuideClass.html</a></p>
*/
public class ConstraintGuideClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConstraintGuideClass.class.getCanonicalName());
    }

    public ConstraintGuideClass(PointerContainer pointer) {
        super(pointer);
    }

    public ConstraintGuideClass() {
        super(cast(JnaConstraintGuideClass.allocateStructure()));
    }

    private JnaConstraintGuideClass.Fields _fields;
    
    JnaConstraintGuideClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaConstraintGuideClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ConstraintGuide.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ConstraintGuide.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
