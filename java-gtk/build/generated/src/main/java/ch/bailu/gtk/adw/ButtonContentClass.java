/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ButtonContentClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ButtonContentClass.html</a></p>
*/
public class ButtonContentClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ButtonContentClass.class.getCanonicalName());
    }

    public ButtonContentClass(PointerContainer pointer) {
        super(pointer);
    }

    public ButtonContentClass() {
        super(cast(JnaButtonContentClass.allocateStructure()));
    }

    private JnaButtonContentClass.Fields _fields;
    
    JnaButtonContentClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaButtonContentClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ButtonContent.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ButtonContent.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
