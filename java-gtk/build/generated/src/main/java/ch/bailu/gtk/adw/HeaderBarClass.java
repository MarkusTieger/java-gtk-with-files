/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.HeaderBarClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.HeaderBarClass.html</a></p>
*/
public class HeaderBarClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(HeaderBarClass.class.getCanonicalName());
    }

    public HeaderBarClass(PointerContainer pointer) {
        super(pointer);
    }

    public HeaderBarClass() {
        super(cast(JnaHeaderBarClass.allocateStructure()));
    }

    private JnaHeaderBarClass.Fields _fields;
    
    JnaHeaderBarClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaHeaderBarClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(HeaderBar.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(HeaderBar.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
