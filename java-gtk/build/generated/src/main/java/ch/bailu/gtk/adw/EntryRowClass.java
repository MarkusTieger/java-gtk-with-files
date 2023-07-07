/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.EntryRowClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.EntryRowClass.html</a></p>
*/
public class EntryRowClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EntryRowClass.class.getCanonicalName());
    }

    public EntryRowClass(PointerContainer pointer) {
        super(pointer);
    }

    public EntryRowClass() {
        super(cast(JnaEntryRowClass.allocateStructure()));
    }

    private JnaEntryRowClass.Fields _fields;
    
    JnaEntryRowClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaEntryRowClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(EntryRow.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(EntryRow.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
