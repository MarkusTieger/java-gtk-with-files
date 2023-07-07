/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ComboRowClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ComboRowClass.html</a></p>
*/
public class ComboRowClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ComboRowClass.class.getCanonicalName());
    }

    public ComboRowClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaComboRowClass.Fields _fields;
    
    JnaComboRowClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaComboRowClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ComboRow.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ComboRow.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
