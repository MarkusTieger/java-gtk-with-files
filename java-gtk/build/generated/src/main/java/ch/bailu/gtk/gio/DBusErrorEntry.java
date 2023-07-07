/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Struct used in g_dbus_error_register_error_domain().
 * <p><a href="https://docs.gtk.org/gio/struct.DBusErrorEntry.html">https://docs.gtk.org/gio/struct.DBusErrorEntry.html</a></p>
*/
public class DBusErrorEntry extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusErrorEntry.class.getCanonicalName());
    }

    public DBusErrorEntry(PointerContainer pointer) {
        super(pointer);
    }

    public DBusErrorEntry() {
        super(cast(JnaDBusErrorEntry.allocateStructure()));
    }

    private JnaDBusErrorEntry.Fields _fields;
    
    JnaDBusErrorEntry.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusErrorEntry.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * An error code.
    */
    public static final String ERROR_CODE = "error_code";

    /**
     * An error code.
    */
    public void setFieldErrorCode(int error_code) {
        toFields().error_code = error_code;
        toFields().writeField(ERROR_CODE);
    }

    /**
     * An error code.
    */
    public int getFieldErrorCode() {
       toFields().readField(ERROR_CODE);
       return toFields().error_code;
    } 

    /**
     * The D-Bus error name to associate with &#64;error_code.
    */
    public static final String DBUS_ERROR_NAME = "dbus_error_name";

    /**
     * The D-Bus error name to associate with &#64;error_code.
    */
    public void setFieldDbusErrorName(ch.bailu.gtk.type.Str dbus_error_name) {
        toFields().dbus_error_name = dbus_error_name.asCPointer();
        toFields().writeField(DBUS_ERROR_NAME);
    }

    /**
     * The D-Bus error name to associate with &#64;error_code.
    */
    public ch.bailu.gtk.type.Str getFieldDbusErrorName() {
       toFields().readField(DBUS_ERROR_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().dbus_error_name));
    } 

}

/*
record-type
all-fields-supported
*/
