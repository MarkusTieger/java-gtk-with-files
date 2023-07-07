/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ViewSwitcherBarClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ViewSwitcherBarClass.html</a></p>
*/
public class ViewSwitcherBarClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ViewSwitcherBarClass.class.getCanonicalName());
    }

    public ViewSwitcherBarClass(PointerContainer pointer) {
        super(pointer);
    }

    public ViewSwitcherBarClass() {
        super(cast(JnaViewSwitcherBarClass.allocateStructure()));
    }

    private JnaViewSwitcherBarClass.Fields _fields;
    
    JnaViewSwitcherBarClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaViewSwitcherBarClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ViewSwitcherBar.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ViewSwitcherBar.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
