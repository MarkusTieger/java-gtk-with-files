/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.FixedLayoutClass.html">https://docs.gtk.org/gtk4/struct.FixedLayoutClass.html</a></p>
*/
public class FixedLayoutClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FixedLayoutClass.class.getCanonicalName());
    }

    public FixedLayoutClass(PointerContainer pointer) {
        super(pointer);
    }

    public FixedLayoutClass() {
        super(cast(JnaFixedLayoutClass.allocateStructure()));
    }

    private JnaFixedLayoutClass.Fields _fields;
    
    JnaFixedLayoutClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFixedLayoutClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FixedLayout.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FixedLayout.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
