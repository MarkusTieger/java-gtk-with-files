/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDBusProxy is a base class used for proxies to access a D-Bus
 * <br>interface on a remote object. A &#35;GDBusProxy can be constructed for
 * <br>both well-known and unique names.
 * <br>
 * <br>By default, &#35;GDBusProxy will cache all properties (and listen to
 * <br>changes) of the remote object, and proxy all signals that get
 * <br>emitted. This behaviour can be changed by passing suitable
 * <br>&#35;GDBusProxyFlags when the proxy is created. If the proxy is for a
 * <br>well-known name, the property cache is flushed when the name owner
 * <br>vanishes and reloaded when a name owner appears.
 * <br>
 * <br>The unique name owner of the proxy's name is tracked and can be read from
 * <br>&#35;GDBusProxy:g-name-owner. Connect to the &#35;GObject::notify signal to
 * <br>get notified of changes. Additionally, only signals and property
 * <br>changes emitted from the current name owner are considered and
 * <br>calls are always sent to the current name owner. This avoids a
 * <br>number of race conditions when the name is lost by one owner and
 * <br>claimed by another. However, if no name owner currently exists,
 * <br>then calls will be sent to the well-known name which may result in
 * <br>the message bus launching an owner (unless
 * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is set).
 * <br>
 * <br>If the proxy is for a stateless D-Bus service, where the name owner may
 * <br>be started and stopped between calls, the &#35;GDBusProxy:g-name-owner tracking
 * <br>of &#35;GDBusProxy will cause the proxy to drop signal and property changes from
 * <br>the service after it has restarted for the first time. When interacting
 * <br>with a stateless D-Bus service, do not use &#35;GDBusProxy — use direct D-Bus
 * <br>method calls and signal connections.
 * <br>
 * <br>The generic &#35;GDBusProxy::g-properties-changed and
 * <br>&#35;GDBusProxy::g-signal signals are not very convenient to work with.
 * <br>Therefore, the recommended way of working with proxies is to subclass
 * <br>&#35;GDBusProxy, and have more natural properties and signals in your derived
 * <br>class. This [example][gdbus-example-gdbus-codegen] shows how this can
 * <br>easily be done using the [gdbus-codegen][gdbus-codegen] tool.
 * <br>
 * <br>A &#35;GDBusProxy instance can be used from multiple threads but note
 * <br>that all signals (e.g. &#35;GDBusProxy::g-signal, &#35;GDBusProxy::g-properties-changed
 * <br>and &#35;GObject::notify) are emitted in the
 * <br>[thread-default main context][g-main-context-push-thread-default]
 * <br>of the thread where the instance was constructed.
 * <br>
 * <br>An example using a proxy for a well-known name can be found in
 * <br>[gdbus-example-watch-proxy.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-watch-proxy.c)
 * <p><a href="https://docs.gtk.org/gio/class.DBusProxy.html">https://docs.gtk.org/gio/class.DBusProxy.html</a></p>
*/
public class DBusProxy extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusProxy.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDBusProxy.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaDBusProxy.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGSignal {
        /**
         * Emitted when a signal from the remote object and interface that &#64;proxy is for, has been received.
         * <br>
         * <br>Since 2.72 this signal supports detailed connections. You can connect to
         * <br>the detailed signal `g-signal::x` in order to receive callbacks only when
         * <br>signal `x` is received from the remote object.
         * @param sender_name The sender of the signal or %NULL if the connection is not a bus connection.
         * @param signal_name The name of the signal.
         * @param parameters A &#35;GVariant tuple with parameters for the signal.
        */
        void onGSignal(@Nullable ch.bailu.gtk.type.Str sender_name, @Nonnull ch.bailu.gtk.type.Str signal_name, @Nonnull ch.bailu.gtk.glib.Variant parameters);
    }
    
    private static com.sun.jna.Callback toOnGSignal(OnGSignal in) {
        return (in == null) ? null: (JnaDBusProxy.OnGSignal) (__self, _sender_name, _signal_name, _parameters, __data) -> in.onGSignal(new ch.bailu.gtk.type.Str(new PointerContainer(_sender_name)), new ch.bailu.gtk.type.Str(new PointerContainer(_signal_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameters)));
    }

    public DBusProxy(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Finishes creating a &#35;GDBusProxy.
     * @param res A &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback function passed to g_dbus_proxy_new().
     * @return A &#35;GDBusProxy or %NULL if &#64;error is set.    Free with g_object_unref().
    */
    public static DBusProxy newFinishDBusProxy(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusProxy.INST().g_dbus_proxy_new_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusProxy:newFinish");
        }
        return new DBusProxy(__self);
    }        
    

    /**
     * Finishes creating a &#35;GDBusProxy.
     * @param res A &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback function passed to g_dbus_proxy_new_for_bus().
     * @return A &#35;GDBusProxy or %NULL if &#64;error is set.    Free with g_object_unref().
    */
    public static DBusProxy newForBusFinishDBusProxy(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusProxy.INST().g_dbus_proxy_new_for_bus_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusProxy:newForBusFinish");
        }
        return new DBusProxy(__self);
    }        
    

    /**
     * Like g_dbus_proxy_new_sync() but takes a &#35;GBusType instead of a &#35;GDBusConnection.
     * <br>
     * <br>&#35;GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     * @param bus_type A &#35;GBusType.
     * @param flags Flags used when constructing the proxy.
     * @param info A &#35;GDBusInterfaceInfo specifying the minimal interface        that &#64;proxy conforms to or %NULL.
     * @param name A bus name (well-known or unique).
     * @param object_path An object path.
     * @param interface_name A D-Bus interface name.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return A &#35;GDBusProxy or %NULL if error is set.    Free with g_object_unref().
    */
    public static DBusProxy newForBusSyncDBusProxy(int bus_type, int flags, @Nullable DBusInterfaceInfo info, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusProxy.INST().g_dbus_proxy_new_for_bus_sync(bus_type, flags, asCPointer(info), asCPointerNotNull(name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusProxy:newForBusSync");
        }
        return new DBusProxy(__self);
    }        
    

    /**
     * Like g_dbus_proxy_new_sync() but takes a &#35;GBusType instead of a &#35;GDBusConnection.
     * <br>
     * <br>&#35;GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     * @param bus_type A &#35;GBusType.
     * @param flags Flags used when constructing the proxy.
     * @param info A &#35;GDBusInterfaceInfo specifying the minimal interface        that &#64;proxy conforms to or %NULL.
     * @param name A bus name (well-known or unique).
     * @param object_path An object path.
     * @param interface_name A D-Bus interface name.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return A &#35;GDBusProxy or %NULL if error is set.    Free with g_object_unref().
    */
    public static DBusProxy newForBusSyncDBusProxy(int bus_type, int flags, @Nullable DBusInterfaceInfo info, String name, String object_path, String interface_name, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusProxy.INST().g_dbus_proxy_new_for_bus_sync(bus_type, flags, asCPointer(info), name, object_path, interface_name, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusProxy:newForBusSync");
        }
        return new DBusProxy(__self);
    }        
    

    /**
     * Creates a proxy for accessing &#64;interface_name on the remote object
     * <br>at &#64;object_path owned by &#64;name at &#64;connection and synchronously
     * <br>loads D-Bus properties unless the
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES flag is used.
     * <br>
     * <br>If the %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS flag is not set, also sets up
     * <br>match rules for signals. Connect to the &#35;GDBusProxy::g-signal signal
     * <br>to handle signals from the remote object.
     * <br>
     * <br>If both %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES and
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS are set, this constructor is
     * <br>guaranteed to return immediately without blocking.
     * <br>
     * <br>If &#64;name is a well-known name and the
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START and %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION
     * <br>flags aren't set and no name owner currently exists, the message bus
     * <br>will be requested to launch a name owner for the name.
     * <br>
     * <br>This is a synchronous failable constructor. See g_dbus_proxy_new()
     * <br>and g_dbus_proxy_new_finish() for the asynchronous version.
     * <br>
     * <br>&#35;GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     * @param connection A &#35;GDBusConnection.
     * @param flags Flags used when constructing the proxy.
     * @param info A &#35;GDBusInterfaceInfo specifying the minimal interface that &#64;proxy conforms to or %NULL.
     * @param name A bus name (well-known or unique) or %NULL if &#64;connection is not a message bus connection.
     * @param object_path An object path.
     * @param interface_name A D-Bus interface name.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return A &#35;GDBusProxy or %NULL if error is set.    Free with g_object_unref().
    */
    public static DBusProxy newSyncDBusProxy(@Nonnull DBusConnection connection, int flags, @Nullable DBusInterfaceInfo info, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusProxy.INST().g_dbus_proxy_new_sync(asCPointerNotNull(connection), flags, asCPointer(info), asCPointer(name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusProxy:newSync");
        }
        return new DBusProxy(__self);
    }        
    

    /**
     * Creates a proxy for accessing &#64;interface_name on the remote object
     * <br>at &#64;object_path owned by &#64;name at &#64;connection and synchronously
     * <br>loads D-Bus properties unless the
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES flag is used.
     * <br>
     * <br>If the %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS flag is not set, also sets up
     * <br>match rules for signals. Connect to the &#35;GDBusProxy::g-signal signal
     * <br>to handle signals from the remote object.
     * <br>
     * <br>If both %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES and
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS are set, this constructor is
     * <br>guaranteed to return immediately without blocking.
     * <br>
     * <br>If &#64;name is a well-known name and the
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START and %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION
     * <br>flags aren't set and no name owner currently exists, the message bus
     * <br>will be requested to launch a name owner for the name.
     * <br>
     * <br>This is a synchronous failable constructor. See g_dbus_proxy_new()
     * <br>and g_dbus_proxy_new_finish() for the asynchronous version.
     * <br>
     * <br>&#35;GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     * @param connection A &#35;GDBusConnection.
     * @param flags Flags used when constructing the proxy.
     * @param info A &#35;GDBusInterfaceInfo specifying the minimal interface that &#64;proxy conforms to or %NULL.
     * @param name A bus name (well-known or unique) or %NULL if &#64;connection is not a message bus connection.
     * @param object_path An object path.
     * @param interface_name A D-Bus interface name.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return A &#35;GDBusProxy or %NULL if error is set.    Free with g_object_unref().
    */
    public static DBusProxy newSyncDBusProxy(@Nonnull DBusConnection connection, int flags, @Nullable DBusInterfaceInfo info, String name, String object_path, String interface_name, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusProxy.INST().g_dbus_proxy_new_sync(asCPointerNotNull(connection), flags, asCPointer(info), name, object_path, interface_name, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusProxy:newSync");
        }
        return new DBusProxy(__self);
    }        
    

    /**
     * Asynchronously invokes the &#64;method_name method on &#64;proxy.
     * <br>
     * <br>If &#64;method_name contains any dots, then &#64;name is split into interface and
     * <br>method name parts. This allows using &#64;proxy for invoking methods on
     * <br>other interfaces.
     * <br>
     * <br>If the &#35;GDBusConnection associated with &#64;proxy is closed then
     * <br>the operation will fail with %G_IO_ERROR_CLOSED. If
     * <br>&#64;cancellable is canceled, the operation will fail with
     * <br>%G_IO_ERROR_CANCELLED. If &#64;parameters contains a value not
     * <br>compatible with the D-Bus protocol, the operation fails with
     * <br>%G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_proxy_call (proxy,
     *                     &quot;TwoStrings&quot;,
     *                     g_variant_new (&quot;(ss)&quot;,
     *                                    &quot;Thing One&quot;,
     *                                    &quot;Thing Two&quot;),
     *                     G_DBUS_CALL_FLAGS_NONE,
     *                     -1,
     *                     NULL,
     *                     (GAsyncReadyCallback) two_strings_done,
     *                     &amp;data);
     * </pre>
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;method_name is referenced by it,
     * <br>then the return value is checked against the return type.
     * <br>
     * <br>This is an asynchronous method. When the operation is finished,
     * <br>&#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>You can then call g_dbus_proxy_call_finish() to get the result of
     * <br>the operation. See g_dbus_proxy_call_sync() for the synchronous
     * <br>version of this method.
     * <br>
     * <br>If &#64;callback is %NULL then the D-Bus method call message will be sent with
     * <br>the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
     * @param method_name Name of method to invoke.
     * @param parameters A &#35;GVariant tuple with parameters for the signal or %NULL if not passing parameters.
     * @param flags Flags from the &#35;GDBusCallFlags enumeration.
     * @param timeout_msec The timeout in milliseconds (with %G_MAXINT meaning                &quot;infinite&quot;) or -1 to use the proxy default timeout.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL if you don't care about the result of the method invocation.
     * @param user_data The data to pass to &#64;callback.
    */
    public void call(@Nonnull ch.bailu.gtk.type.Str method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, int flags, int timeout_msec, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusProxy.INST().g_dbus_proxy_call(asCPointer(), asCPointerNotNull(method_name), asCPointer(parameters), flags, timeout_msec, asCPointer(cancellable), toOnAsyncReadyCallback(this, "call", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously invokes the &#64;method_name method on &#64;proxy.
     * <br>
     * <br>If &#64;method_name contains any dots, then &#64;name is split into interface and
     * <br>method name parts. This allows using &#64;proxy for invoking methods on
     * <br>other interfaces.
     * <br>
     * <br>If the &#35;GDBusConnection associated with &#64;proxy is closed then
     * <br>the operation will fail with %G_IO_ERROR_CLOSED. If
     * <br>&#64;cancellable is canceled, the operation will fail with
     * <br>%G_IO_ERROR_CANCELLED. If &#64;parameters contains a value not
     * <br>compatible with the D-Bus protocol, the operation fails with
     * <br>%G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_proxy_call (proxy,
     *                     &quot;TwoStrings&quot;,
     *                     g_variant_new (&quot;(ss)&quot;,
     *                                    &quot;Thing One&quot;,
     *                                    &quot;Thing Two&quot;),
     *                     G_DBUS_CALL_FLAGS_NONE,
     *                     -1,
     *                     NULL,
     *                     (GAsyncReadyCallback) two_strings_done,
     *                     &amp;data);
     * </pre>
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;method_name is referenced by it,
     * <br>then the return value is checked against the return type.
     * <br>
     * <br>This is an asynchronous method. When the operation is finished,
     * <br>&#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>You can then call g_dbus_proxy_call_finish() to get the result of
     * <br>the operation. See g_dbus_proxy_call_sync() for the synchronous
     * <br>version of this method.
     * <br>
     * <br>If &#64;callback is %NULL then the D-Bus method call message will be sent with
     * <br>the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
     * @param method_name Name of method to invoke.
     * @param parameters A &#35;GVariant tuple with parameters for the signal or %NULL if not passing parameters.
     * @param flags Flags from the &#35;GDBusCallFlags enumeration.
     * @param timeout_msec The timeout in milliseconds (with %G_MAXINT meaning                &quot;infinite&quot;) or -1 to use the proxy default timeout.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL if you don't care about the result of the method invocation.
     * @param user_data The data to pass to &#64;callback.
    */
    public void call(String method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, int flags, int timeout_msec, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusProxy.INST().g_dbus_proxy_call(asCPointer(), method_name, asCPointer(parameters), flags, timeout_msec, asCPointer(cancellable), toOnAsyncReadyCallback(this, "call", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with g_dbus_proxy_call().
     * @param res A &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to g_dbus_proxy_call().
     * @return %NULL if &#64;error is set. Otherwise a &#35;GVariant tuple with return values. Free with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant callFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_call_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Synchronously invokes the &#64;method_name method on &#64;proxy.
     * <br>
     * <br>If &#64;method_name contains any dots, then &#64;name is split into interface and
     * <br>method name parts. This allows using &#64;proxy for invoking methods on
     * <br>other interfaces.
     * <br>
     * <br>If the &#35;GDBusConnection associated with &#64;proxy is disconnected then
     * <br>the operation will fail with %G_IO_ERROR_CLOSED. If
     * <br>&#64;cancellable is canceled, the operation will fail with
     * <br>%G_IO_ERROR_CANCELLED. If &#64;parameters contains a value not
     * <br>compatible with the D-Bus protocol, the operation fails with
     * <br>%G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_proxy_call_sync (proxy,
     *                          &quot;TwoStrings&quot;,
     *                          g_variant_new (&quot;(ss)&quot;,
     *                                         &quot;Thing One&quot;,
     *                                         &quot;Thing Two&quot;),
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          &amp;error);
     * </pre>
     * <br>
     * <br>The calling thread is blocked until a reply is received. See
     * <br>g_dbus_proxy_call() for the asynchronous version of this
     * <br>method.
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;method_name is referenced by it,
     * <br>then the return value is checked against the return type.
     * @param method_name Name of method to invoke.
     * @param parameters A &#35;GVariant tuple with parameters for the signal              or %NULL if not passing parameters.
     * @param flags Flags from the &#35;GDBusCallFlags enumeration.
     * @param timeout_msec The timeout in milliseconds (with %G_MAXINT meaning                &quot;infinite&quot;) or -1 to use the proxy default timeout.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %NULL if &#64;error is set. Otherwise a &#35;GVariant tuple with return values. Free with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant callSync(@Nonnull ch.bailu.gtk.type.Str method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, int flags, int timeout_msec, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_call_sync(asCPointer(), asCPointerNotNull(method_name), asCPointer(parameters), flags, timeout_msec, asCPointer(cancellable), 0L)));
    }

    /**
     * Synchronously invokes the &#64;method_name method on &#64;proxy.
     * <br>
     * <br>If &#64;method_name contains any dots, then &#64;name is split into interface and
     * <br>method name parts. This allows using &#64;proxy for invoking methods on
     * <br>other interfaces.
     * <br>
     * <br>If the &#35;GDBusConnection associated with &#64;proxy is disconnected then
     * <br>the operation will fail with %G_IO_ERROR_CLOSED. If
     * <br>&#64;cancellable is canceled, the operation will fail with
     * <br>%G_IO_ERROR_CANCELLED. If &#64;parameters contains a value not
     * <br>compatible with the D-Bus protocol, the operation fails with
     * <br>%G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_proxy_call_sync (proxy,
     *                          &quot;TwoStrings&quot;,
     *                          g_variant_new (&quot;(ss)&quot;,
     *                                         &quot;Thing One&quot;,
     *                                         &quot;Thing Two&quot;),
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          &amp;error);
     * </pre>
     * <br>
     * <br>The calling thread is blocked until a reply is received. See
     * <br>g_dbus_proxy_call() for the asynchronous version of this
     * <br>method.
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;method_name is referenced by it,
     * <br>then the return value is checked against the return type.
     * @param method_name Name of method to invoke.
     * @param parameters A &#35;GVariant tuple with parameters for the signal              or %NULL if not passing parameters.
     * @param flags Flags from the &#35;GDBusCallFlags enumeration.
     * @param timeout_msec The timeout in milliseconds (with %G_MAXINT meaning                &quot;infinite&quot;) or -1 to use the proxy default timeout.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %NULL if &#64;error is set. Otherwise a &#35;GVariant tuple with return values. Free with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant callSync(String method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, int flags, int timeout_msec, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_call_sync(asCPointer(), method_name, asCPointer(parameters), flags, timeout_msec, asCPointer(cancellable), 0L)));
    }

    /**
     * Like g_dbus_proxy_call() but also takes a &#35;GUnixFDList object.
     * <br>
     * <br>This method is only available on UNIX.
     * @param method_name Name of method to invoke.
     * @param parameters A &#35;GVariant tuple with parameters for the signal or %NULL if not passing parameters.
     * @param flags Flags from the &#35;GDBusCallFlags enumeration.
     * @param timeout_msec The timeout in milliseconds (with %G_MAXINT meaning                &quot;infinite&quot;) or -1 to use the proxy default timeout.
     * @param fd_list A &#35;GUnixFDList or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL if you don't care about the result of the method invocation.
     * @param user_data The data to pass to &#64;callback.
    */
    public void callWithUnixFdList(@Nonnull ch.bailu.gtk.type.Str method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, int flags, int timeout_msec, @Nullable UnixFDList fd_list, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusProxy.INST().g_dbus_proxy_call_with_unix_fd_list(asCPointer(), asCPointerNotNull(method_name), asCPointer(parameters), flags, timeout_msec, asCPointer(fd_list), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callWithUnixFdList", callback), asCPointer(user_data));
    }

    /**
     * Like g_dbus_proxy_call() but also takes a &#35;GUnixFDList object.
     * <br>
     * <br>This method is only available on UNIX.
     * @param method_name Name of method to invoke.
     * @param parameters A &#35;GVariant tuple with parameters for the signal or %NULL if not passing parameters.
     * @param flags Flags from the &#35;GDBusCallFlags enumeration.
     * @param timeout_msec The timeout in milliseconds (with %G_MAXINT meaning                &quot;infinite&quot;) or -1 to use the proxy default timeout.
     * @param fd_list A &#35;GUnixFDList or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL if you don't care about the result of the method invocation.
     * @param user_data The data to pass to &#64;callback.
    */
    public void callWithUnixFdList(String method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, int flags, int timeout_msec, @Nullable UnixFDList fd_list, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusProxy.INST().g_dbus_proxy_call_with_unix_fd_list(asCPointer(), method_name, asCPointer(parameters), flags, timeout_msec, asCPointer(fd_list), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callWithUnixFdList", callback), asCPointer(user_data));
    }

    /**
     * Looks up the value for a property from the cache. This call does no
     * <br>blocking IO.
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;property_name is referenced by
     * <br>it, then &#64;value is checked against the type of the property.
     * @param property_name Property name.
     * @return A reference to the &#35;GVariant instance    that holds the value for &#64;property_name or %NULL if the value is not in    the cache. The returned reference must be freed with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant getCachedProperty(@Nonnull ch.bailu.gtk.type.Str property_name)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_cached_property(asCPointer(), asCPointerNotNull(property_name))));
    }

    /**
     * Looks up the value for a property from the cache. This call does no
     * <br>blocking IO.
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;property_name is referenced by
     * <br>it, then &#64;value is checked against the type of the property.
     * @param property_name Property name.
     * @return A reference to the &#35;GVariant instance    that holds the value for &#64;property_name or %NULL if the value is not in    the cache. The returned reference must be freed with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant getCachedProperty(String property_name)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_cached_property(asCPointer(), property_name)));
    }

    /**
     * Gets the connection &#64;proxy is for.
     * @return A &#35;GDBusConnection owned by &#64;proxy. Do not free.
    */
    public DBusConnection getConnection()  {
        return new DBusConnection(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_connection(asCPointer())));
    }

    /**
     * Gets the timeout to use if -1 (specifying default timeout) is
     * <br>passed as &#64;timeout_msec in the g_dbus_proxy_call() and
     * <br>g_dbus_proxy_call_sync() functions.
     * <br>
     * <br>See the &#35;GDBusProxy:g-default-timeout property for more details.
     * @return Timeout to use for &#64;proxy.
    */
    public int getDefaultTimeout()  {
        return JnaDBusProxy.INST().g_dbus_proxy_get_default_timeout(asCPointer());
    }

    /**
     * Gets the flags that &#64;proxy was constructed with.
     * @return Flags from the &#35;GDBusProxyFlags enumeration.
    */
    public int getFlags()  {
        return JnaDBusProxy.INST().g_dbus_proxy_get_flags(asCPointer());
    }

    /**
     * Returns the &#35;GDBusInterfaceInfo, if any, specifying the interface
     * <br>that &#64;proxy conforms to. See the &#35;GDBusProxy:g-interface-info
     * <br>property for more details.
     * @return A &#35;GDBusInterfaceInfo or %NULL.    Do not unref the returned object, it is owned by &#64;proxy.
    */
    public DBusInterfaceInfo getInterfaceInfo()  {
        return new DBusInterfaceInfo(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_interface_info(asCPointer())));
    }

    /**
     * Gets the D-Bus interface name &#64;proxy is for.
     * @return A string owned by &#64;proxy. Do not free.
    */
    public ch.bailu.gtk.type.Str getInterfaceName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_interface_name(asCPointer())));
    }

    /**
     * Gets the name that &#64;proxy was constructed for.
     * <br>
     * <br>When connected to a message bus, this will usually be non-%NULL.
     * <br>However, it may be %NULL for a proxy that communicates using a peer-to-peer
     * <br>pattern.
     * @return A string owned by &#64;proxy. Do not free.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_name(asCPointer())));
    }

    /**
     * The unique name that owns the name that &#64;proxy is for or %NULL if
     * <br>no-one currently owns that name. You may connect to the
     * <br>&#35;GObject::notify signal to track changes to the
     * <br>&#35;GDBusProxy:g-name-owner property.
     * @return The name owner or %NULL if no name    owner exists. Free with g_free().
    */
    public ch.bailu.gtk.type.Str getNameOwner()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_name_owner(asCPointer())));
    }

    /**
     * Gets the object path &#64;proxy is for.
     * @return A string owned by &#64;proxy. Do not free.
    */
    public ch.bailu.gtk.type.Str getObjectPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusProxy.INST().g_dbus_proxy_get_object_path(asCPointer())));
    }

    /**
     * If &#64;value is not %NULL, sets the cached value for the property with
     * <br>name &#64;property_name to the value in &#64;value.
     * <br>
     * <br>If &#64;value is %NULL, then the cached value is removed from the
     * <br>property cache.
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;property_name is referenced by
     * <br>it, then &#64;value is checked against the type of the property.
     * <br>
     * <br>If the &#64;value &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_proxy_set_cached_property (proxy,
     *                                    &quot;SomeProperty&quot;,
     *                                    g_variant_new (&quot;(si)&quot;,
     *                                                  &quot;A String&quot;,
     *                                                  42));
     * </pre>
     * <br>
     * <br>Normally you will not need to use this method since &#64;proxy
     * <br>is tracking changes using the
     * <br>`org.freedesktop.DBus.Properties.PropertiesChanged`
     * <br>D-Bus signal. However, for performance reasons an object may
     * <br>decide to not use this signal for some properties and instead
     * <br>use a proprietary out-of-band mechanism to transmit changes.
     * <br>
     * <br>As a concrete example, consider an object with a property
     * <br>`ChatroomParticipants` which is an array of strings. Instead of
     * <br>transmitting the same (long) array every time the property changes,
     * <br>it is more efficient to only transmit the delta using e.g. signals
     * <br>`ChatroomParticipantJoined(String name)` and
     * <br>`ChatroomParticipantParted(String name)`.
     * @param property_name Property name.
     * @param value Value for the property or %NULL to remove it from the cache.
    */
    public void setCachedProperty(@Nonnull ch.bailu.gtk.type.Str property_name, @Nullable ch.bailu.gtk.glib.Variant value)  {
        JnaDBusProxy.INST().g_dbus_proxy_set_cached_property(asCPointer(), asCPointerNotNull(property_name), asCPointer(value));
    }

    /**
     * If &#64;value is not %NULL, sets the cached value for the property with
     * <br>name &#64;property_name to the value in &#64;value.
     * <br>
     * <br>If &#64;value is %NULL, then the cached value is removed from the
     * <br>property cache.
     * <br>
     * <br>If &#64;proxy has an expected interface (see
     * <br>&#35;GDBusProxy:g-interface-info) and &#64;property_name is referenced by
     * <br>it, then &#64;value is checked against the type of the property.
     * <br>
     * <br>If the &#64;value &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_proxy_set_cached_property (proxy,
     *                                    &quot;SomeProperty&quot;,
     *                                    g_variant_new (&quot;(si)&quot;,
     *                                                  &quot;A String&quot;,
     *                                                  42));
     * </pre>
     * <br>
     * <br>Normally you will not need to use this method since &#64;proxy
     * <br>is tracking changes using the
     * <br>`org.freedesktop.DBus.Properties.PropertiesChanged`
     * <br>D-Bus signal. However, for performance reasons an object may
     * <br>decide to not use this signal for some properties and instead
     * <br>use a proprietary out-of-band mechanism to transmit changes.
     * <br>
     * <br>As a concrete example, consider an object with a property
     * <br>`ChatroomParticipants` which is an array of strings. Instead of
     * <br>transmitting the same (long) array every time the property changes,
     * <br>it is more efficient to only transmit the delta using e.g. signals
     * <br>`ChatroomParticipantJoined(String name)` and
     * <br>`ChatroomParticipantParted(String name)`.
     * @param property_name Property name.
     * @param value Value for the property or %NULL to remove it from the cache.
    */
    public void setCachedProperty(String property_name, @Nullable ch.bailu.gtk.glib.Variant value)  {
        JnaDBusProxy.INST().g_dbus_proxy_set_cached_property(asCPointer(), property_name, asCPointer(value));
    }

    /**
     * Sets the timeout to use if -1 (specifying default timeout) is
     * <br>passed as &#64;timeout_msec in the g_dbus_proxy_call() and
     * <br>g_dbus_proxy_call_sync() functions.
     * <br>
     * <br>See the &#35;GDBusProxy:g-default-timeout property for more details.
     * @param timeout_msec Timeout in milliseconds.
    */
    public void setDefaultTimeout(int timeout_msec)  {
        JnaDBusProxy.INST().g_dbus_proxy_set_default_timeout(asCPointer(), timeout_msec);
    }

    /**
     * Ensure that interactions with &#64;proxy conform to the given
     * <br>interface. See the &#35;GDBusProxy:g-interface-info property for more
     * <br>details.
     * @param info Minimum interface this proxy conforms to    or %NULL to unset.
    */
    public void setInterfaceInfo(@Nullable DBusInterfaceInfo info)  {
        JnaDBusProxy.INST().g_dbus_proxy_set_interface_info(asCPointer(), asCPointer(info));
    }

    public final static String SIGNAL_ON_G_SIGNAL = "g-signal";
    
    /**
     * Connect to signal "g-signal".
     * <br>See {@link OnGSignal#onGSignal} for signal description.
     * <br>Field {@link #SIGNAL_ON_G_SIGNAL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onGSignal(OnGSignal signal) {
        return connectSignal(SIGNAL_ON_G_SIGNAL, toOnGSignal(signal));
    }

    /**
     * Creates a proxy for accessing &#64;interface_name on the remote object
     * <br>at &#64;object_path owned by &#64;name at &#64;connection and asynchronously
     * <br>loads D-Bus properties unless the
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES flag is used. Connect to
     * <br>the &#35;GDBusProxy::g-properties-changed signal to get notified about
     * <br>property changes.
     * <br>
     * <br>If the %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS flag is not set, also sets up
     * <br>match rules for signals. Connect to the &#35;GDBusProxy::g-signal signal
     * <br>to handle signals from the remote object.
     * <br>
     * <br>If both %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES and
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS are set, this constructor is
     * <br>guaranteed to complete immediately without blocking.
     * <br>
     * <br>If &#64;name is a well-known name and the
     * <br>%G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START and %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION
     * <br>flags aren't set and no name owner currently exists, the message bus
     * <br>will be requested to launch a name owner for the name.
     * <br>
     * <br>This is a failable asynchronous constructor - when the proxy is
     * <br>ready, &#64;callback will be invoked and you can use
     * <br>g_dbus_proxy_new_finish() to get the result.
     * <br>
     * <br>See g_dbus_proxy_new_sync() and for a synchronous version of this constructor.
     * <br>
     * <br>&#35;GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     * @param connection A &#35;GDBusConnection.
     * @param flags Flags used when constructing the proxy.
     * @param info A &#35;GDBusInterfaceInfo specifying the minimal interface that &#64;proxy conforms to or %NULL.
     * @param name A bus name (well-known or unique) or %NULL if &#64;connection is not a message bus connection.
     * @param object_path An object path.
     * @param interface_name A D-Bus interface name.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback Callback function to invoke when the proxy is ready.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void _new(@Nonnull DBusConnection connection, int flags, @Nullable DBusInterfaceInfo info, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusProxy.INST().g_dbus_proxy_new(asCPointerNotNull(connection), flags, asCPointer(info), asCPointer(name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "_new", callback), asCPointer(user_data));
    }

    /**
     * Like g_dbus_proxy_new() but takes a &#35;GBusType instead of a &#35;GDBusConnection.
     * <br>
     * <br>&#35;GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     * @param bus_type A &#35;GBusType.
     * @param flags Flags used when constructing the proxy.
     * @param info A &#35;GDBusInterfaceInfo specifying the minimal interface that &#64;proxy conforms to or %NULL.
     * @param name A bus name (well-known or unique).
     * @param object_path An object path.
     * @param interface_name A D-Bus interface name.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback Callback function to invoke when the proxy is ready.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void newForBus(int bus_type, int flags, @Nullable DBusInterfaceInfo info, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusProxy.INST().g_dbus_proxy_new_for_bus(bus_type, flags, asCPointer(info), asCPointerNotNull(name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newForBus", callback), asCPointer(user_data));
    }

    /**
     * Implements interface {@link AsyncInitable}. Call this to get access to interface functions.
     * @return {@link AsyncInitable}
    */
    public AsyncInitable asAsyncInitable() {
        return new AsyncInitable(cast());
    }

    /**
     * Implements interface {@link DBusInterface}. Call this to get access to interface functions.
     * @return {@link DBusInterface}
    */
    public DBusInterface asDBusInterface() {
        return new DBusInterface(cast());
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaDBusProxy.INST().g_dbus_proxy_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type

[MethodModel:java-type-not-supported:callWithUnixFdListFinish:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GUnixFDList**}}:{j:}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[MethodModel:java-type-not-supported:callWithUnixFdListSync:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDBusCallFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:UnixFDList:{c:GUnixFDList*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GUnixFDList**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getCachedPropertyNames:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:java-type-not-supported:gPropertiesChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Variant:{c:void*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
