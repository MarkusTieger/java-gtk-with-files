/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GDBusObjectManagerServer.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusObjectManagerServerClass.html">https://docs.gtk.org/gio/struct.DBusObjectManagerServerClass.html</a></p>
*/
public class DBusObjectManagerServerClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectManagerServerClass.class.getCanonicalName());
    }

    public DBusObjectManagerServerClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusObjectManagerServerClass.Fields _fields;
    
    JnaDBusObjectManagerServerClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusObjectManagerServerClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectManagerServer.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectManagerServer.getParentTypeID());
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
