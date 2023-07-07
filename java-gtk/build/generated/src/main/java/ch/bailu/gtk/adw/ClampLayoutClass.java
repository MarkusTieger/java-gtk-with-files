/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ClampLayoutClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ClampLayoutClass.html</a></p>
*/
public class ClampLayoutClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClampLayoutClass.class.getCanonicalName());
    }

    public ClampLayoutClass(PointerContainer pointer) {
        super(pointer);
    }

    public ClampLayoutClass() {
        super(cast(JnaClampLayoutClass.allocateStructure()));
    }

    private JnaClampLayoutClass.Fields _fields;
    
    JnaClampLayoutClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaClampLayoutClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ClampLayout.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ClampLayout.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
