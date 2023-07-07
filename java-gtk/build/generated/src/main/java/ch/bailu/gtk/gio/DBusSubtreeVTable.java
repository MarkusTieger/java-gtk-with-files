/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 * <p><a href="https://docs.gtk.org/gio/struct.DBusSubtreeVTable.html">https://docs.gtk.org/gio/struct.DBusSubtreeVTable.html</a></p>
*/
public class DBusSubtreeVTable extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusSubtreeVTable.class.getCanonicalName());
    }

    public DBusSubtreeVTable(PointerContainer pointer) {
        super(pointer);
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:enumerate:java-type-not-supported:{G_::{c:GDBusSubtreeEnumerateFunc}}:{j:}]

[FieldModel:introspect:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusSubtreeIntrospectFunc}}:{j:}]

[FieldModel:dispatch:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusSubtreeDispatchFunc}}:{j:}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
