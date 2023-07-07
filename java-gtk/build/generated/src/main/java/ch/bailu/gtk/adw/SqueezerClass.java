/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.SqueezerClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.SqueezerClass.html</a></p>
*/
public class SqueezerClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SqueezerClass.class.getCanonicalName());
    }

    public SqueezerClass(PointerContainer pointer) {
        super(pointer);
    }

    public SqueezerClass() {
        super(cast(JnaSqueezerClass.allocateStructure()));
    }

    private JnaSqueezerClass.Fields _fields;
    
    JnaSqueezerClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSqueezerClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Squeezer.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Squeezer.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
