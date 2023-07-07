/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Virtual table for handling properties and method calls for a D-Bus
 * <br>interface.
 * <br>
 * <br>Since 2.38, if you want to handle getting/setting D-Bus properties
 * <br>asynchronously, give %NULL as your get_property() or set_property()
 * <br>function. The D-Bus call will be directed to your &#64;method_call function,
 * <br>with the provided &#64;interface_name set to &quot;org.freedesktop.DBus.Properties&quot;.
 * <br>
 * <br>Ownership of the &#35;GDBusMethodInvocation object passed to the
 * <br>method_call() function is transferred to your handler; you must
 * <br>call one of the methods of &#35;GDBusMethodInvocation to return a reply
 * <br>(possibly empty), or an error. These functions also take ownership
 * <br>of the passed-in invocation object, so unless the invocation
 * <br>object has otherwise been referenced, it will be then be freed.
 * <br>Calling one of these functions may be done within your
 * <br>method_call() implementation but it also can be done at a later
 * <br>point to handle the method asynchronously.
 * <br>
 * <br>The usual checks on the validity of the calls is performed. For
 * <br>`Get` calls, an error is automatically returned if the property does
 * <br>not exist or the permissions do not allow access. The same checks are
 * <br>performed for `Set` calls, and the provided value is also checked for
 * <br>being the correct type.
 * <br>
 * <br>For both `Get` and `Set` calls, the &#35;GDBusMethodInvocation
 * <br>passed to the &#64;method_call handler can be queried with
 * <br>g_dbus_method_invocation_get_property_info() to get a pointer
 * <br>to the &#35;GDBusPropertyInfo of the property.
 * <br>
 * <br>If you have readable properties specified in your interface info,
 * <br>you must ensure that you either provide a non-%NULL &#64;get_property()
 * <br>function or provide implementations of both the `Get` and `GetAll`
 * <br>methods on org.freedesktop.DBus.Properties interface in your &#64;method_call
 * <br>function. Note that the required return type of the `Get` call is
 * <br>`(v)`, not the type of the property. `GetAll` expects a return value
 * <br>of type `a{sv}`.
 * <br>
 * <br>If you have writable properties specified in your interface info,
 * <br>you must ensure that you either provide a non-%NULL &#64;set_property()
 * <br>function or provide an implementation of the `Set` call. If implementing
 * <br>the call, you must return the value of type %G_VARIANT_TYPE_UNIT.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusInterfaceVTable.html">https://docs.gtk.org/gio/struct.DBusInterfaceVTable.html</a></p>
*/
public class DBusInterfaceVTable extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusInterfaceVTable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDBusInterfaceMethodCallFunc {
        /**
         * The type of the &#64;method_call function in &#35;GDBusInterfaceVTable.
         * @param connection A &#35;GDBusConnection.
         * @param sender The unique bus name of the remote caller.
         * @param object_path The object path that the method was invoked on.
         * @param interface_name The D-Bus interface name the method was invoked on.
         * @param method_name The name of the method that was invoked.
         * @param parameters A &#35;GVariant tuple with parameters.
         * @param invocation A &#35;GDBusMethodInvocation object that must be used to return a value or error.
         * @param user_data The &#64;user_data &#35;gpointer passed to g_dbus_connection_register_object().
        */
        void onDBusInterfaceMethodCallFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str sender, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nonnull ch.bailu.gtk.type.Str method_name, @Nonnull ch.bailu.gtk.glib.Variant parameters, @Nonnull DBusMethodInvocation invocation, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDBusInterfaceVTable.OnDBusInterfaceMethodCallFunc toOnDBusInterfaceMethodCallFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnDBusInterfaceMethodCallFunc in) {
        JnaDBusInterfaceVTable.OnDBusInterfaceMethodCallFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _sender, _object_path, _interface_name, _method_name, _parameters, _invocation, _user_data) -> in.onDBusInterfaceMethodCallFunc(__callback, new DBusConnection(new PointerContainer(_connection)), new ch.bailu.gtk.type.Str(new PointerContainer(_sender)), new ch.bailu.gtk.type.Str(new PointerContainer(_object_path)), new ch.bailu.gtk.type.Str(new PointerContainer(_interface_name)), new ch.bailu.gtk.type.Str(new PointerContainer(_method_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameters)), new DBusMethodInvocation(new PointerContainer(_invocation)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public DBusInterfaceVTable(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusInterfaceVTable.Fields _fields;
    
    JnaDBusInterfaceVTable.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusInterfaceVTable.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * Function for handling incoming method calls.
     * <br>See {@link OnDBusInterfaceMethodCallFunc#onDBusInterfaceMethodCallFunc}
    */
    public static final String METHOD_CALL = "method_call";

    /**
     * Function for handling incoming method calls.
     * <br>See {@link OnDBusInterfaceMethodCallFunc#onDBusInterfaceMethodCallFunc}
    */
    public void setFieldMethodCall(OnDBusInterfaceMethodCallFunc method_call) {
        toFields().method_call = toOnDBusInterfaceMethodCallFunc(this, METHOD_CALL, method_call);
        toFields().writeField(METHOD_CALL);
    }

    /**
     * Function for handling incoming method calls.
     * <br>See {@link OnDBusInterfaceMethodCallFunc#onDBusInterfaceMethodCallFunc}
    */
    public JnaDBusInterfaceVTable.OnDBusInterfaceMethodCallFunc getFieldMethodCall() {
       toFields().readField(METHOD_CALL);
       return toFields().method_call;
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:get_property:java-type-not-supported:{G_::{c:GDBusInterfaceGetPropertyFunc}}:{j:}]

[FieldModel:set_property:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusInterfaceSetPropertyFunc}}:{j:}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
