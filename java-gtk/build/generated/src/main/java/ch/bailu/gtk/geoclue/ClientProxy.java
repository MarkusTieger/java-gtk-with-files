/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GClueClientProxy structure contains only private data and should only be accessed using the provided API.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class ClientProxy extends ch.bailu.gtk.gio.DBusProxy {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClientProxy.class.getCanonicalName());
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
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull ch.bailu.gtk.gio.AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaClientProxy.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaClientProxy.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public ClientProxy(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Finishes an operation started with gclue_client_proxy_new().
     * @param res The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to gclue_client_proxy_new().
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy newFinishClientProxy(@Nonnull ch.bailu.gtk.gio.AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaClientProxy.INST().gclue_client_proxy_new_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("ClientProxy:newFinish");
        }
        return new ClientProxy(__self);
    }        
    

    /**
     * Finishes an operation started with gclue_client_proxy_new_for_bus().
     * @param res The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to gclue_client_proxy_new_for_bus().
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy newForBusFinishClientProxy(@Nonnull ch.bailu.gtk.gio.AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaClientProxy.INST().gclue_client_proxy_new_for_bus_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("ClientProxy:newForBusFinish");
        }
        return new ClientProxy(__self);
    }        
    

    /**
     * Like gclue_client_proxy_new_sync() but takes a &#35;GBusType instead of a &#35;GDBusConnection.
     * <br>
     * <br>The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_client_proxy_new_for_bus() for the asynchronous version of this constructor.
     * @param bus_type A &#35;GBusType.
     * @param flags Flags from the &#35;GDBusProxyFlags enumeration.
     * @param name A bus name (well-known or unique).
     * @param object_path An object path.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy newForBusSyncClientProxy(int bus_type, int flags, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaClientProxy.INST().gclue_client_proxy_new_for_bus_sync(bus_type, flags, asCPointerNotNull(name), asCPointerNotNull(object_path), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("ClientProxy:newForBusSync");
        }
        return new ClientProxy(__self);
    }        
    

    /**
     * Like gclue_client_proxy_new_sync() but takes a &#35;GBusType instead of a &#35;GDBusConnection.
     * <br>
     * <br>The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_client_proxy_new_for_bus() for the asynchronous version of this constructor.
     * @param bus_type A &#35;GBusType.
     * @param flags Flags from the &#35;GDBusProxyFlags enumeration.
     * @param name A bus name (well-known or unique).
     * @param object_path An object path.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy newForBusSyncClientProxy(int bus_type, int flags, String name, String object_path, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaClientProxy.INST().gclue_client_proxy_new_for_bus_sync(bus_type, flags, name, object_path, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("ClientProxy:newForBusSync");
        }
        return new ClientProxy(__self);
    }        
    

    /**
     * Synchronously creates a proxy for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Client.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Client&lt;/link&gt;. See g_dbus_proxy_new_sync() for more details.
     * <br>
     * <br>The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_client_proxy_new() for the asynchronous version of this constructor.
     * @param connection A &#35;GDBusConnection.
     * @param flags Flags from the &#35;GDBusProxyFlags enumeration.
     * @param name A bus name (well-known or unique) or %NULL if &#64;connection is not a message bus connection.
     * @param object_path An object path.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy newSyncClientProxy(@Nonnull ch.bailu.gtk.gio.DBusConnection connection, int flags, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaClientProxy.INST().gclue_client_proxy_new_sync(asCPointerNotNull(connection), flags, asCPointer(name), asCPointerNotNull(object_path), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("ClientProxy:newSync");
        }
        return new ClientProxy(__self);
    }        
    

    /**
     * Synchronously creates a proxy for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Client.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Client&lt;/link&gt;. See g_dbus_proxy_new_sync() for more details.
     * <br>
     * <br>The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_client_proxy_new() for the asynchronous version of this constructor.
     * @param connection A &#35;GDBusConnection.
     * @param flags Flags from the &#35;GDBusProxyFlags enumeration.
     * @param name A bus name (well-known or unique) or %NULL if &#64;connection is not a message bus connection.
     * @param object_path An object path.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy newSyncClientProxy(@Nonnull ch.bailu.gtk.gio.DBusConnection connection, int flags, String name, String object_path, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaClientProxy.INST().gclue_client_proxy_new_sync(asCPointerNotNull(connection), flags, name, object_path, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("ClientProxy:newSync");
        }
        return new ClientProxy(__self);
    }        
    

    /**
     * A utility function to create a &#35;GClueClientProxy without having to deal with
     * <br>a &#35;GClueManager. See also gclue_client_proxy_create_full() which improves
     * <br>resource management.
     * <br>
     * <br>This is identitcal to calling gclue_client_proxy_create_full() without any
     * <br>flags set.
     * <br>
     * <br>See &#35;gclue_client_proxy_create_sync() for the synchronous, blocking version
     * <br>of this function.
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the results are ready.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void create(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClientProxy.INST().gclue_client_proxy_create(asCPointerNotNull(desktop_id), accuracy_level, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "create", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with gclue_client_proxy_create().
     * @param result The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to          gclue_client_proxy_create().
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy createFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ClientProxy(new PointerContainer(JnaClientProxy.INST().gclue_client_proxy_create_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * A utility function to create a &#35;GClueClientProxy without having to deal with
     * <br>a &#35;GClueManager.
     * <br>
     * <br>By setting the &#35;GCLUE_CLIENT_PROXY_CREATE_AUTO_DELETE flag you can ensure
     * <br>that the client will be deleted again from the geoclue service when
     * <br>it is destroyed. This flag should be used unless you are doing explicit
     * <br>resource management.
     * <br>
     * <br>See &#35;gclue_client_proxy_create_full_sync() for the synchronous, blocking
     * <br>version of this function.
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param flags &#35;GClueClientProxyCreateFlags to modify the creation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the results are ready.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void createFull(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, int flags, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClientProxy.INST().gclue_client_proxy_create_full(asCPointerNotNull(desktop_id), accuracy_level, flags, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "createFull", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with gclue_client_proxy_create_full().
     * @param result The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to          gclue_client_proxy_create().
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy createFullFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ClientProxy(new PointerContainer(JnaClientProxy.INST().gclue_client_proxy_create_full_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * The synchronous and blocking version of &#35;gclue_client_proxy_create_full().
     * <br>
     * <br>By setting the &#35;GCLUE_CLIENT_PROXY_CREATE_AUTO_DELETE flag you can ensure
     * <br>that the client will be deleted again from the geoclue service when
     * <br>it is destroyed. This flag should be used unless you are doing explicit
     * <br>resource management.
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param flags &#35;GClueClientProxyCreateFlags to modify the creation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy createFullSync(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, int flags, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ClientProxy(new PointerContainer(JnaClientProxy.INST().gclue_client_proxy_create_full_sync(asCPointerNotNull(desktop_id), accuracy_level, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * The synchronous and blocking version of &#35;gclue_client_proxy_create().
     * <br>See also gclue_client_proxy_create_full_sync() which improves resource
     * <br>management.
     * <br>
     * <br>This function is identical to calling gclue_client_proxy_create_full_sync()
     * <br>without any flags set.
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static ClientProxy createSync(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ClientProxy(new PointerContainer(JnaClientProxy.INST().gclue_client_proxy_create_sync(asCPointerNotNull(desktop_id), accuracy_level, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously creates a proxy for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Client.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Client&lt;/link&gt;. See g_dbus_proxy_new() for more details.
     * <br>
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_client_proxy_new_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_client_proxy_new_sync() for the synchronous, blocking version of this constructor.
     * @param connection A &#35;GDBusConnection.
     * @param flags Flags from the &#35;GDBusProxyFlags enumeration.
     * @param name A bus name (well-known or unique) or %NULL if &#64;connection is not a message bus connection.
     * @param object_path An object path.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void _new(@Nonnull ch.bailu.gtk.gio.DBusConnection connection, int flags, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClientProxy.INST().gclue_client_proxy_new(asCPointerNotNull(connection), flags, asCPointer(name), asCPointerNotNull(object_path), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "_new", callback), asCPointer(user_data));
    }

    /**
     * Like gclue_client_proxy_new() but takes a &#35;GBusType instead of a &#35;GDBusConnection.
     * <br>
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_client_proxy_new_for_bus_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_client_proxy_new_for_bus_sync() for the synchronous, blocking version of this constructor.
     * @param bus_type A &#35;GBusType.
     * @param flags Flags from the &#35;GDBusProxyFlags enumeration.
     * @param name A bus name (well-known or unique).
     * @param object_path An object path.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void newForBus(int bus_type, int flags, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClientProxy.INST().gclue_client_proxy_new_for_bus(bus_type, flags, asCPointerNotNull(name), asCPointerNotNull(object_path), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newForBus", callback), asCPointer(user_data));
    }

    /**
     * Implements interface {@link Client}. Call this to get access to interface functions.
     * @return {@link Client}
    */
    public Client asClient() {
        return new Client(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.AsyncInitable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.AsyncInitable}
    */
    public ch.bailu.gtk.gio.AsyncInitable asAsyncInitable() {
        return new ch.bailu.gtk.gio.AsyncInitable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.DBusInterface}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.DBusInterface}
    */
    public ch.bailu.gtk.gio.DBusInterface asDBusInterface() {
        return new ch.bailu.gtk.gio.DBusInterface(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.Initable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.Initable}
    */
    public ch.bailu.gtk.gio.Initable asInitable() {
        return new ch.bailu.gtk.gio.Initable(cast());
    }

    public static long getTypeID() { 
        return JnaClientProxy.INST().gclue_client_proxy_get_type(); 
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
*/
