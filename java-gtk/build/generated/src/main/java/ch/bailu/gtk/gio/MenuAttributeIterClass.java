/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.MenuAttributeIterClass.html">https://docs.gtk.org/gio/struct.MenuAttributeIterClass.html</a></p>
*/
public class MenuAttributeIterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuAttributeIterClass.class.getCanonicalName());
    }

    public MenuAttributeIterClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaMenuAttributeIterClass.Fields _fields;
    
    JnaMenuAttributeIterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMenuAttributeIterClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MenuAttributeIter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MenuAttributeIter.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:get_next:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
