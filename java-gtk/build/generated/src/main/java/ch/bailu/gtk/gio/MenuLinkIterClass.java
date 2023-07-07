/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.MenuLinkIterClass.html">https://docs.gtk.org/gio/struct.MenuLinkIterClass.html</a></p>
*/
public class MenuLinkIterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuLinkIterClass.class.getCanonicalName());
    }

    public MenuLinkIterClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaMenuLinkIterClass.Fields _fields;
    
    JnaMenuLinkIterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMenuLinkIterClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MenuLinkIter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MenuLinkIter.getParentTypeID());
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
