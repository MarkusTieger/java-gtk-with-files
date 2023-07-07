/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ViewStackClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ViewStackClass.html</a></p>
*/
public class ViewStackClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ViewStackClass.class.getCanonicalName());
    }

    public ViewStackClass(PointerContainer pointer) {
        super(pointer);
    }

    public ViewStackClass() {
        super(cast(JnaViewStackClass.allocateStructure()));
    }

    private JnaViewStackClass.Fields _fields;
    
    JnaViewStackClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaViewStackClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ViewStack.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ViewStack.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
