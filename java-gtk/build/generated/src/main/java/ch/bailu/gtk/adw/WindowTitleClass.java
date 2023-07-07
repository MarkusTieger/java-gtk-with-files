/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.WindowTitleClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.WindowTitleClass.html</a></p>
*/
public class WindowTitleClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WindowTitleClass.class.getCanonicalName());
    }

    public WindowTitleClass(PointerContainer pointer) {
        super(pointer);
    }

    public WindowTitleClass() {
        super(cast(JnaWindowTitleClass.allocateStructure()));
    }

    private JnaWindowTitleClass.Fields _fields;
    
    JnaWindowTitleClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaWindowTitleClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(WindowTitle.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(WindowTitle.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
