/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDBusObjectManagerClient is used to create, monitor and delete object
 * <br>proxies for remote objects exported by a &#35;GDBusObjectManagerServer (or any
 * <br>code implementing the
 * <br>[org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html&#35;standard-interfaces-objectmanager)
 * <br>interface).
 * <br>
 * <br>Once an instance of this type has been created, you can connect to
 * <br>the &#35;GDBusObjectManager::object-added and
 * <br>&#35;GDBusObjectManager::object-removed signals and inspect the
 * <br>&#35;GDBusObjectProxy objects returned by
 * <br>g_dbus_object_manager_get_objects().
 * <br>
 * <br>If the name for a &#35;GDBusObjectManagerClient is not owned by anyone at
 * <br>object construction time, the default behavior is to request the
 * <br>message bus to launch an owner for the name. This behavior can be
 * <br>disabled using the %G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START
 * <br>flag. It's also worth noting that this only works if the name of
 * <br>interest is activatable in the first place. E.g. in some cases it
 * <br>is not possible to launch an owner for the requested name. In this
 * <br>case, &#35;GDBusObjectManagerClient object construction still succeeds but
 * <br>there will be no object proxies
 * <br>(e.g. g_dbus_object_manager_get_objects() returns the empty list) and
 * <br>the &#35;GDBusObjectManagerClient:name-owner property is %NULL.
 * <br>
 * <br>The owner of the requested name can come and go (for example
 * <br>consider a system service being restarted) – &#35;GDBusObjectManagerClient
 * <br>handles this case too; simply connect to the &#35;GObject::notify
 * <br>signal to watch for changes on the &#35;GDBusObjectManagerClient:name-owner
 * <br>property. When the name owner vanishes, the behavior is that
 * <br>&#35;GDBusObjectManagerClient:name-owner is set to %NULL (this includes
 * <br>emission of the &#35;GObject::notify signal) and then
 * <br>&#35;GDBusObjectManager::object-removed signals are synthesized
 * <br>for all currently existing object proxies. Since
 * <br>&#35;GDBusObjectManagerClient:name-owner is %NULL when this happens, you can
 * <br>use this information to disambiguate a synthesized signal from a
 * <br>genuine signal caused by object removal on the remote
 * <br>&#35;GDBusObjectManager. Similarly, when a new name owner appears,
 * <br>&#35;GDBusObjectManager::object-added signals are synthesized
 * <br>while &#35;GDBusObjectManagerClient:name-owner is still %NULL. Only when all
 * <br>object proxies have been added, the &#35;GDBusObjectManagerClient:name-owner
 * <br>is set to the new name owner (this includes emission of the
 * <br>&#35;GObject::notify signal).  Furthermore, you are guaranteed that
 * <br>&#35;GDBusObjectManagerClient:name-owner will alternate between a name owner
 * <br>(e.g. `:1.42`) and %NULL even in the case where
 * <br>the name of interest is atomically replaced
 * <br>
 * <br>Ultimately, &#35;GDBusObjectManagerClient is used to obtain &#35;GDBusProxy
 * <br>instances. All signals (including the
 * <br>org.freedesktop.DBus.Properties::PropertiesChanged signal)
 * <br>delivered to &#35;GDBusProxy instances are guaranteed to originate
 * <br>from the name owner. This guarantee along with the behavior
 * <br>described above, means that certain race conditions including the
 * <br>&quot;half the proxy is from the old owner and the other half is from
 * <br>the new owner&quot; problem cannot happen.
 * <br>
 * <br>To avoid having the application connect to signals on the returned
 * <br>&#35;GDBusObjectProxy and &#35;GDBusProxy objects, the
 * <br>&#35;GDBusObject::interface-added,
 * <br>&#35;GDBusObject::interface-removed,
 * <br>&#35;GDBusProxy::g-properties-changed and
 * <br>&#35;GDBusProxy::g-signal signals
 * <br>are also emitted on the &#35;GDBusObjectManagerClient instance managing these
 * <br>objects. The signals emitted are
 * <br>&#35;GDBusObjectManager::interface-added,
 * <br>&#35;GDBusObjectManager::interface-removed,
 * <br>&#35;GDBusObjectManagerClient::interface-proxy-properties-changed and
 * <br>&#35;GDBusObjectManagerClient::interface-proxy-signal.
 * <br>
 * <br>Note that all callbacks and signals are emitted in the
 * <br>[thread-default main context][g-main-context-push-thread-default]
 * <br>that the &#35;GDBusObjectManagerClient object was constructed
 * <br>in. Additionally, the &#35;GDBusObjectProxy and &#35;GDBusProxy objects
 * <br>originating from the &#35;GDBusObjectManagerClient object will be created in
 * <br>the same context and, consequently, will deliver signals in the
 * <br>same main loop.
 * <p><a href="https://docs.gtk.org/gio/class.DBusObjectManagerClient.html">https://docs.gtk.org/gio/class.DBusObjectManagerClient.html</a></p>
*/
public class DBusObjectManagerClient extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectManagerClient.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDBusProxyTypeFunc {
        /**
         * Function signature for a function used to determine the &#35;GType to
         * <br>use for an interface proxy (if &#64;interface_name is not %NULL) or
         * <br>object proxy (if &#64;interface_name is %NULL).
         * <br>
         * <br>This function is called in the
         * <br>[thread-default main loop][g-main-context-push-thread-default]
         * <br>that &#64;manager was constructed in.
         * @param manager A &#35;GDBusObjectManagerClient.
         * @param object_path The object path of the remote object.
         * @param interface_name The interface name of the remote object or %NULL if a &#35;GDBusObjectProxy &#35;GType is requested.
         * @param user_data User data.
         * @return A &#35;GType to use for the remote object. The returned type   must be a &#35;GDBusProxy or &#35;GDBusObjectProxy -derived   type.
        */
        long onDBusProxyTypeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManagerClient manager, @Nonnull ch.bailu.gtk.type.Str object_path, @Nullable ch.bailu.gtk.type.Str interface_name, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDBusObjectManagerClient.OnDBusProxyTypeFunc toOnDBusProxyTypeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnDBusProxyTypeFunc in) {
        JnaDBusObjectManagerClient.OnDBusProxyTypeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object_path, _interface_name, _user_data) -> in.onDBusProxyTypeFunc(__callback, new DBusObjectManagerClient(new PointerContainer(_manager)), new ch.bailu.gtk.type.Str(new PointerContainer(_object_path)), new ch.bailu.gtk.type.Str(new PointerContainer(_interface_name)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaDBusObjectManagerClient.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaDBusObjectManagerClient.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
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
    
    private static JnaDBusObjectManagerClient.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaDBusObjectManagerClient.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInterfaceProxySignal {
        /**
         * Emitted when a D-Bus signal is received on &#64;interface_proxy.
         * <br>
         * <br>This signal exists purely as a convenience to avoid having to
         * <br>connect signals to all interface proxies managed by &#64;manager.
         * <br>
         * <br>This signal is emitted in the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>that &#64;manager was constructed in.
         * @param object_proxy The &#35;GDBusObjectProxy on which an interface is emitting a D-Bus signal.
         * @param interface_proxy The &#35;GDBusProxy that is emitting a D-Bus signal.
         * @param sender_name The sender of the signal or NULL if the connection is not a bus connection.
         * @param signal_name The signal name.
         * @param parameters A &#35;GVariant tuple with parameters for the signal.
        */
        void onInterfaceProxySignal(@Nonnull DBusObjectProxy object_proxy, @Nonnull DBusProxy interface_proxy, @Nonnull ch.bailu.gtk.type.Str sender_name, @Nonnull ch.bailu.gtk.type.Str signal_name, @Nonnull ch.bailu.gtk.glib.Variant parameters);
    }
    
    private static com.sun.jna.Callback toOnInterfaceProxySignal(OnInterfaceProxySignal in) {
        return (in == null) ? null: (JnaDBusObjectManagerClient.OnInterfaceProxySignal) (__self, _object_proxy, _interface_proxy, _sender_name, _signal_name, _parameters, __data) -> in.onInterfaceProxySignal(new DBusObjectProxy(new PointerContainer(_object_proxy)), new DBusProxy(new PointerContainer(_interface_proxy)), new ch.bailu.gtk.type.Str(new PointerContainer(_sender_name)), new ch.bailu.gtk.type.Str(new PointerContainer(_signal_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameters)));
    }

    public DBusObjectManagerClient(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Finishes an operation started with g_dbus_object_manager_client_new().
     * @param res A &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to g_dbus_object_manager_client_new().
     * @return A   &#35;GDBusObjectManagerClient object or %NULL if &#64;error is set. Free   with g_object_unref().
    */
    public static DBusObjectManagerClient newFinishDBusObjectManagerClient(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusObjectManagerClient:newFinish");
        }
        return new DBusObjectManagerClient(__self);
    }        
    

    /**
     * Finishes an operation started with g_dbus_object_manager_client_new_for_bus().
     * @param res A &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to g_dbus_object_manager_client_new_for_bus().
     * @return A   &#35;GDBusObjectManagerClient object or %NULL if &#64;error is set. Free   with g_object_unref().
    */
    public static DBusObjectManagerClient newForBusFinishDBusObjectManagerClient(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new_for_bus_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusObjectManagerClient:newForBusFinish");
        }
        return new DBusObjectManagerClient(__self);
    }        
    

    /**
     * Like g_dbus_object_manager_client_new_sync() but takes a &#35;GBusType instead
     * <br>of a &#35;GDBusConnection.
     * <br>
     * <br>This is a synchronous failable constructor - the calling thread is
     * <br>blocked until a reply is received. See g_dbus_object_manager_client_new_for_bus()
     * <br>for the asynchronous version.
     * @param bus_type A &#35;GBusType.
     * @param flags Zero or more flags from the &#35;GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param object_path The object path of the control object.
     * @param get_proxy_type_func A &#35;GDBusProxyTypeFunc function or %NULL to always construct &#35;GDBusProxy proxies.
     * @param get_proxy_type_user_data User data to pass to &#64;get_proxy_type_func.
     * @param get_proxy_type_destroy_notify Free function for &#64;get_proxy_type_user_data or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL
     * @return A   &#35;GDBusObjectManagerClient object or %NULL if &#64;error is set. Free   with g_object_unref().
    */
    public static DBusObjectManagerClient newForBusSyncDBusObjectManagerClient(int bus_type, int flags, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, OnDBusProxyTypeFunc get_proxy_type_func, @Nullable ch.bailu.gtk.type.Pointer get_proxy_type_user_data, OnDestroyNotify get_proxy_type_destroy_notify, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new_for_bus_sync(bus_type, flags, asCPointerNotNull(name), asCPointerNotNull(object_path), toOnDBusProxyTypeFunc(getClassHandler().getInstance(), "newForBusSync", get_proxy_type_func), asCPointer(get_proxy_type_user_data), toOnDestroyNotify(getClassHandler().getInstance(), "newForBusSync", get_proxy_type_destroy_notify), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusObjectManagerClient:newForBusSync");
        }
        return new DBusObjectManagerClient(__self);
    }        
    

    /**
     * Like g_dbus_object_manager_client_new_sync() but takes a &#35;GBusType instead
     * <br>of a &#35;GDBusConnection.
     * <br>
     * <br>This is a synchronous failable constructor - the calling thread is
     * <br>blocked until a reply is received. See g_dbus_object_manager_client_new_for_bus()
     * <br>for the asynchronous version.
     * @param bus_type A &#35;GBusType.
     * @param flags Zero or more flags from the &#35;GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param object_path The object path of the control object.
     * @param get_proxy_type_func A &#35;GDBusProxyTypeFunc function or %NULL to always construct &#35;GDBusProxy proxies.
     * @param get_proxy_type_user_data User data to pass to &#64;get_proxy_type_func.
     * @param get_proxy_type_destroy_notify Free function for &#64;get_proxy_type_user_data or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL
     * @return A   &#35;GDBusObjectManagerClient object or %NULL if &#64;error is set. Free   with g_object_unref().
    */
    public static DBusObjectManagerClient newForBusSyncDBusObjectManagerClient(int bus_type, int flags, String name, String object_path, OnDBusProxyTypeFunc get_proxy_type_func, @Nullable ch.bailu.gtk.type.Pointer get_proxy_type_user_data, OnDestroyNotify get_proxy_type_destroy_notify, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new_for_bus_sync(bus_type, flags, name, object_path, toOnDBusProxyTypeFunc(getClassHandler().getInstance(), "newForBusSync", get_proxy_type_func), asCPointer(get_proxy_type_user_data), toOnDestroyNotify(getClassHandler().getInstance(), "newForBusSync", get_proxy_type_destroy_notify), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusObjectManagerClient:newForBusSync");
        }
        return new DBusObjectManagerClient(__self);
    }        
    

    /**
     * Creates a new &#35;GDBusObjectManagerClient object.
     * <br>
     * <br>This is a synchronous failable constructor - the calling thread is
     * <br>blocked until a reply is received. See g_dbus_object_manager_client_new()
     * <br>for the asynchronous version.
     * @param connection A &#35;GDBusConnection.
     * @param flags Zero or more flags from the &#35;GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name), or %NULL when not using a message bus connection.
     * @param object_path The object path of the control object.
     * @param get_proxy_type_func A &#35;GDBusProxyTypeFunc function or %NULL to always construct &#35;GDBusProxy proxies.
     * @param get_proxy_type_user_data User data to pass to &#64;get_proxy_type_func.
     * @param get_proxy_type_destroy_notify Free function for &#64;get_proxy_type_user_data or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL
     * @return A   &#35;GDBusObjectManagerClient object or %NULL if &#64;error is set. Free   with g_object_unref().
    */
    public static DBusObjectManagerClient newSyncDBusObjectManagerClient(@Nonnull DBusConnection connection, int flags, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, OnDBusProxyTypeFunc get_proxy_type_func, @Nullable ch.bailu.gtk.type.Pointer get_proxy_type_user_data, OnDestroyNotify get_proxy_type_destroy_notify, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new_sync(asCPointerNotNull(connection), flags, asCPointer(name), asCPointerNotNull(object_path), toOnDBusProxyTypeFunc(getClassHandler().getInstance(), "newSync", get_proxy_type_func), asCPointer(get_proxy_type_user_data), toOnDestroyNotify(getClassHandler().getInstance(), "newSync", get_proxy_type_destroy_notify), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusObjectManagerClient:newSync");
        }
        return new DBusObjectManagerClient(__self);
    }        
    

    /**
     * Creates a new &#35;GDBusObjectManagerClient object.
     * <br>
     * <br>This is a synchronous failable constructor - the calling thread is
     * <br>blocked until a reply is received. See g_dbus_object_manager_client_new()
     * <br>for the asynchronous version.
     * @param connection A &#35;GDBusConnection.
     * @param flags Zero or more flags from the &#35;GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name), or %NULL when not using a message bus connection.
     * @param object_path The object path of the control object.
     * @param get_proxy_type_func A &#35;GDBusProxyTypeFunc function or %NULL to always construct &#35;GDBusProxy proxies.
     * @param get_proxy_type_user_data User data to pass to &#64;get_proxy_type_func.
     * @param get_proxy_type_destroy_notify Free function for &#64;get_proxy_type_user_data or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL
     * @return A   &#35;GDBusObjectManagerClient object or %NULL if &#64;error is set. Free   with g_object_unref().
    */
    public static DBusObjectManagerClient newSyncDBusObjectManagerClient(@Nonnull DBusConnection connection, int flags, String name, String object_path, OnDBusProxyTypeFunc get_proxy_type_func, @Nullable ch.bailu.gtk.type.Pointer get_proxy_type_user_data, OnDestroyNotify get_proxy_type_destroy_notify, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new_sync(asCPointerNotNull(connection), flags, name, object_path, toOnDBusProxyTypeFunc(getClassHandler().getInstance(), "newSync", get_proxy_type_func), asCPointer(get_proxy_type_user_data), toOnDestroyNotify(getClassHandler().getInstance(), "newSync", get_proxy_type_destroy_notify), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusObjectManagerClient:newSync");
        }
        return new DBusObjectManagerClient(__self);
    }        
    

    /**
     * Gets the &#35;GDBusConnection used by &#64;manager.
     * @return A &#35;GDBusConnection object. Do not free,   the object belongs to &#64;manager.
    */
    public DBusConnection getConnection()  {
        return new DBusConnection(new PointerContainer(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_get_connection(asCPointer())));
    }

    /**
     * Gets the flags that &#64;manager was constructed with.
     * @return Zero of more flags from the &#35;GDBusObjectManagerClientFlags enumeration.
    */
    public int getFlags()  {
        return JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_get_flags(asCPointer());
    }

    /**
     * Gets the name that &#64;manager is for, or %NULL if not a message bus
     * <br>connection.
     * @return A unique or well-known name. Do not free, the string belongs to &#64;manager.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_get_name(asCPointer())));
    }

    /**
     * The unique name that owns the name that &#64;manager is for or %NULL if
     * <br>no-one currently owns that name. You can connect to the
     * <br>&#35;GObject::notify signal to track changes to the
     * <br>&#35;GDBusObjectManagerClient:name-owner property.
     * @return The name owner or %NULL if no name owner exists. Free with g_free().
    */
    public ch.bailu.gtk.type.Str getNameOwner()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_get_name_owner(asCPointer())));
    }

    public final static String SIGNAL_ON_INTERFACE_PROXY_SIGNAL = "interface-proxy-signal";
    
    /**
     * Connect to signal "interface-proxy-signal".
     * <br>See {@link OnInterfaceProxySignal#onInterfaceProxySignal} for signal description.
     * <br>Field {@link #SIGNAL_ON_INTERFACE_PROXY_SIGNAL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInterfaceProxySignal(OnInterfaceProxySignal signal) {
        return connectSignal(SIGNAL_ON_INTERFACE_PROXY_SIGNAL, toOnInterfaceProxySignal(signal));
    }

    /**
     * Asynchronously creates a new &#35;GDBusObjectManagerClient object.
     * <br>
     * <br>This is an asynchronous failable constructor. When the result is
     * <br>ready, &#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from. You can
     * <br>then call g_dbus_object_manager_client_new_finish() to get the result. See
     * <br>g_dbus_object_manager_client_new_sync() for the synchronous version.
     * @param connection A &#35;GDBusConnection.
     * @param flags Zero or more flags from the &#35;GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param object_path The object path of the control object.
     * @param get_proxy_type_func A &#35;GDBusProxyTypeFunc function or %NULL to always construct &#35;GDBusProxy proxies.
     * @param get_proxy_type_user_data User data to pass to &#64;get_proxy_type_func.
     * @param get_proxy_type_destroy_notify Free function for &#64;get_proxy_type_user_data or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied.
     * @param user_data The data to pass to &#64;callback.
    */
    public static void _new(@Nonnull DBusConnection connection, int flags, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, OnDBusProxyTypeFunc get_proxy_type_func, @Nullable ch.bailu.gtk.type.Pointer get_proxy_type_user_data, OnDestroyNotify get_proxy_type_destroy_notify, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new(asCPointerNotNull(connection), flags, asCPointerNotNull(name), asCPointerNotNull(object_path), toOnDBusProxyTypeFunc(getClassHandler().getInstance(), "_new", get_proxy_type_func), asCPointer(get_proxy_type_user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", get_proxy_type_destroy_notify), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "_new", callback), asCPointer(user_data));
    }

    /**
     * Like g_dbus_object_manager_client_new() but takes a &#35;GBusType instead of a
     * <br>&#35;GDBusConnection.
     * <br>
     * <br>This is an asynchronous failable constructor. When the result is
     * <br>ready, &#64;callback will be invoked in the
     * <br>[thread-default main loop][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from. You can
     * <br>then call g_dbus_object_manager_client_new_for_bus_finish() to get the result. See
     * <br>g_dbus_object_manager_client_new_for_bus_sync() for the synchronous version.
     * @param bus_type A &#35;GBusType.
     * @param flags Zero or more flags from the &#35;GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param object_path The object path of the control object.
     * @param get_proxy_type_func A &#35;GDBusProxyTypeFunc function or %NULL to always construct &#35;GDBusProxy proxies.
     * @param get_proxy_type_user_data User data to pass to &#64;get_proxy_type_func.
     * @param get_proxy_type_destroy_notify Free function for &#64;get_proxy_type_user_data or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied.
     * @param user_data The data to pass to &#64;callback.
    */
    public static void newForBus(int bus_type, int flags, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, OnDBusProxyTypeFunc get_proxy_type_func, @Nullable ch.bailu.gtk.type.Pointer get_proxy_type_user_data, OnDestroyNotify get_proxy_type_destroy_notify, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_new_for_bus(bus_type, flags, asCPointerNotNull(name), asCPointerNotNull(object_path), toOnDBusProxyTypeFunc(getClassHandler().getInstance(), "newForBus", get_proxy_type_func), asCPointer(get_proxy_type_user_data), toOnDestroyNotify(getClassHandler().getInstance(), "newForBus", get_proxy_type_destroy_notify), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newForBus", callback), asCPointer(user_data));
    }

    /**
     * Implements interface {@link AsyncInitable}. Call this to get access to interface functions.
     * @return {@link AsyncInitable}
    */
    public AsyncInitable asAsyncInitable() {
        return new AsyncInitable(cast());
    }

    /**
     * Implements interface {@link DBusObjectManager}. Call this to get access to interface functions.
     * @return {@link DBusObjectManager}
    */
    public DBusObjectManager asDBusObjectManager() {
        return new DBusObjectManager(cast());
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaDBusObjectManagerClient.INST().g_dbus_object_manager_client_get_type(); 
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

[MethodModel:java-type-not-supported:interfaceProxyPropertiesChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:DBusObjectProxy:{c:void*}}:{j:long}]
        [ParameterModel:Supported:{Gg:DBusProxy:{c:void*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:void*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
