/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GDBusConnection type is used for D-Bus connections to remote
 * <br>peers such as a message buses. It is a low-level API that offers a
 * <br>lot of flexibility. For instance, it lets you establish a connection
 * <br>over any transport that can by represented as a &#35;GIOStream.
 * <br>
 * <br>This class is rarely used directly in D-Bus clients. If you are writing
 * <br>a D-Bus client, it is often easier to use the g_bus_own_name(),
 * <br>g_bus_watch_name() or g_dbus_proxy_new_for_bus() APIs.
 * <br>
 * <br>As an exception to the usual GLib rule that a particular object must not
 * <br>be used by two threads at the same time, &#35;GDBusConnection's methods may be
 * <br>called from any thread. This is so that g_bus_get() and g_bus_get_sync()
 * <br>can safely return the same &#35;GDBusConnection when called from any thread.
 * <br>
 * <br>Most of the ways to obtain a &#35;GDBusConnection automatically initialize it
 * <br>(i.e. connect to D-Bus): for instance, g_dbus_connection_new() and
 * <br>g_bus_get(), and the synchronous versions of those methods, give you an
 * <br>initialized connection. Language bindings for GIO should use
 * <br>g_initable_new() or g_async_initable_new_async(), which also initialize the
 * <br>connection.
 * <br>
 * <br>If you construct an uninitialized &#35;GDBusConnection, such as via
 * <br>g_object_new(), you must initialize it via g_initable_init() or
 * <br>g_async_initable_init_async() before using its methods or properties.
 * <br>Calling methods or accessing properties on a &#35;GDBusConnection that has not
 * <br>completed initialization successfully is considered to be invalid, and leads
 * <br>to undefined behaviour. In particular, if initialization fails with a
 * <br>&#35;GError, the only valid thing you can do with that &#35;GDBusConnection is to
 * <br>free it with g_object_unref().
 * <br>
 * <br>&#35;&#35; An example D-Bus server &#35; {&#35;gdbus-server}
 * <br>
 * <br>Here is an example for a D-Bus server:
 * <br>[gdbus-example-server.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-server.c)
 * <br>
 * <br>&#35;&#35; An example for exporting a subtree &#35; {&#35;gdbus-subtree-server}
 * <br>
 * <br>Here is an example for exporting a subtree:
 * <br>[gdbus-example-subtree.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-subtree.c)
 * <br>
 * <br>&#35;&#35; An example for file descriptor passing &#35; {&#35;gdbus-unix-fd-client}
 * <br>
 * <br>Here is an example for passing UNIX file descriptors:
 * <br>[gdbus-unix-fd-client.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-unix-fd-client.c)
 * <br>
 * <br>&#35;&#35; An example for exporting a GObject &#35; {&#35;gdbus-export}
 * <br>
 * <br>Here is an example for exporting a &#35;GObject:
 * <br>[gdbus-example-export.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-export.c)
 * <p><a href="https://docs.gtk.org/gio/class.DBusConnection.html">https://docs.gtk.org/gio/class.DBusConnection.html</a></p>
*/
public class DBusConnection extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusConnection.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDBusMessageFilterFunction {
        /**
         * Signature for function used in g_dbus_connection_add_filter().
         * <br>
         * <br>A filter function is passed a &#35;GDBusMessage and expected to return
         * <br>a &#35;GDBusMessage too. Passive filter functions that don't modify the
         * <br>message can simply return the &#64;message object:
         * <pre>
         * static GDBusMessage *
         * passive_filter (GDBusConnection *connection
         *                 GDBusMessage    *message,
         *                 gboolean         incoming,
         *                 gpointer         user_data)
         * {
         *   // inspect &#64;message
         *   return message;
         * }
         * </pre>
         * <br>Filter functions that wants to drop a message can simply return %NULL:
         * <pre>
         * static GDBusMessage *
         * drop_filter (GDBusConnection *connection
         *              GDBusMessage    *message,
         *              gboolean         incoming,
         *              gpointer         user_data)
         * {
         *   if (should_drop_message)
         *     {
         *       g_object_unref (message);
         *       message = NULL;
         *     }
         *   return message;
         * }
         * </pre>
         * <br>Finally, a filter function may modify a message by copying it:
         * <pre>
         * static GDBusMessage *
         * modifying_filter (GDBusConnection *connection
         *                   GDBusMessage    *message,
         *                   gboolean         incoming,
         *                   gpointer         user_data)
         * {
         *   GDBusMessage *copy;
         *   GError *error;
         * 
         *   error = NULL;
         *   copy = g_dbus_message_copy (message, &amp;error);
         *   // handle &#64;error being set
         *   g_object_unref (message);
         * 
         *   // modify &#64;copy
         * 
         *   return copy;
         * }
         * </pre>
         * <br>If the returned &#35;GDBusMessage is different from &#64;message and cannot
         * <br>be sent on &#64;connection (it could use features, such as file
         * <br>descriptors, not compatible with &#64;connection), then a warning is
         * <br>logged to standard error. Applications can
         * <br>check this ahead of time using g_dbus_message_to_blob() passing a
         * <br>&#35;GDBusCapabilityFlags value obtained from &#64;connection.
         * @param connection A &#35;GDBusConnection.
         * @param message A locked &#35;GDBusMessage that the filter function takes ownership of.
         * @param incoming %TRUE if it is a message received from the other peer, %FALSE if it is a message to be sent to the other peer.
         * @param user_data User data passed when adding the filter.
         * @return A &#35;GDBusMessage that will be freed with g_object_unref() or %NULL to drop the message. Passive filter functions can simply return the passed &#64;message object.
        */
        DBusMessage onDBusMessageFilterFunction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nonnull DBusMessage message, boolean incoming, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDBusConnection.OnDBusMessageFilterFunction toOnDBusMessageFilterFunction(ch.bailu.gtk.type.Pointer instance, String methodName, OnDBusMessageFilterFunction in) {
        JnaDBusConnection.OnDBusMessageFilterFunction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _message, _incoming, _user_data) -> in.onDBusMessageFilterFunction(__callback, new DBusConnection(new PointerContainer(_connection)), new DBusMessage(new PointerContainer(_message)), _incoming, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
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
    
    private static JnaDBusConnection.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaDBusConnection.OnDestroyNotify out = null;
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
    
    private static JnaDBusConnection.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaDBusConnection.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDBusSignalCallback {
        /**
         * Signature for callback function used in g_dbus_connection_signal_subscribe().
         * @param connection A &#35;GDBusConnection.
         * @param sender_name The unique bus name of the sender of the signal,    or %NULL on a peer-to-peer D-Bus connection.
         * @param object_path The object path that the signal was emitted on.
         * @param interface_name The name of the interface.
         * @param signal_name The name of the signal.
         * @param parameters A &#35;GVariant tuple with parameters for the signal.
         * @param user_data User data passed when subscribing to the signal.
        */
        void onDBusSignalCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nullable ch.bailu.gtk.type.Str sender_name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nonnull ch.bailu.gtk.type.Str signal_name, @Nonnull ch.bailu.gtk.glib.Variant parameters, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDBusConnection.OnDBusSignalCallback toOnDBusSignalCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnDBusSignalCallback in) {
        JnaDBusConnection.OnDBusSignalCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _sender_name, _object_path, _interface_name, _signal_name, _parameters, _user_data) -> in.onDBusSignalCallback(__callback, new DBusConnection(new PointerContainer(_connection)), new ch.bailu.gtk.type.Str(new PointerContainer(_sender_name)), new ch.bailu.gtk.type.Str(new PointerContainer(_object_path)), new ch.bailu.gtk.type.Str(new PointerContainer(_interface_name)), new ch.bailu.gtk.type.Str(new PointerContainer(_signal_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameters)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClosed {
        /**
         * Emitted when the connection is closed.
         * <br>
         * <br>The cause of this event can be
         * <br>
         * <br>- If g_dbus_connection_close() is called. In this case
         * <br>  &#64;remote_peer_vanished is set to %FALSE and &#64;error is %NULL.
         * <br>
         * <br>- If the remote peer closes the connection. In this case
         * <br>  &#64;remote_peer_vanished is set to %TRUE and &#64;error is set.
         * <br>
         * <br>- If the remote peer sends invalid or malformed data. In this
         * <br>  case &#64;remote_peer_vanished is set to %FALSE and &#64;error is set.
         * <br>
         * <br>Upon receiving this signal, you should give up your reference to
         * <br>&#64;connection. You are guaranteed that this signal is emitted only
         * <br>once.
         * @param remote_peer_vanished %TRUE if &#64;connection is closed because the     remote peer closed its end of the connection
         * @param error a &#35;GError with more details about the event or %NULL
        */
        void onClosed(boolean remote_peer_vanished, @Nullable ch.bailu.gtk.glib.Error error);
    }
    
    private static com.sun.jna.Callback toOnClosed(OnClosed in) {
        return (in == null) ? null: (JnaDBusConnection.OnClosed) (__self, _remote_peer_vanished, _error, __data) -> in.onClosed(_remote_peer_vanished, new ch.bailu.gtk.glib.Error(new PointerContainer(_error)));
    }

    public DBusConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Finishes an operation started with g_dbus_connection_new().
     * @param res a &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback     passed to g_dbus_connection_new().
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set. Free     with g_object_unref().
    */
    public static DBusConnection newFinishDBusConnection(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusConnection.INST().g_dbus_connection_new_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusConnection:newFinish");
        }
        return new DBusConnection(__self);
    }        
    

    /**
     * Finishes an operation started with g_dbus_connection_new_for_address().
     * @param res a &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed     to g_dbus_connection_new()
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public static DBusConnection newForAddressFinishDBusConnection(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusConnection.INST().g_dbus_connection_new_for_address_finish(asCPointerNotNull(res), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusConnection:newForAddressFinish");
        }
        return new DBusConnection(__self);
    }        
    

    /**
     * Synchronously connects and sets up a D-Bus client connection for
     * <br>exchanging D-Bus messages with an endpoint specified by &#64;address
     * <br>which must be in the
     * <br>[D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses).
     * <br>
     * <br>This constructor can only be used to initiate client-side
     * <br>connections - use g_dbus_connection_new_sync() if you need to act
     * <br>as the server. In particular, &#64;flags cannot contain the
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS or
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flags.
     * <br>
     * <br>This is a synchronous failable constructor. See
     * <br>g_dbus_connection_new_for_address() for the asynchronous version.
     * <br>
     * <br>If &#64;observer is not %NULL it may be used to control the
     * <br>authentication process.
     * @param address a D-Bus address
     * @param flags flags describing how to make the connection
     * @param observer a &#35;GDBusAuthObserver or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public static DBusConnection newForAddressSyncDBusConnection(@Nonnull ch.bailu.gtk.type.Str address, int flags, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusConnection.INST().g_dbus_connection_new_for_address_sync(asCPointerNotNull(address), flags, asCPointer(observer), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusConnection:newForAddressSync");
        }
        return new DBusConnection(__self);
    }        
    

    /**
     * Synchronously connects and sets up a D-Bus client connection for
     * <br>exchanging D-Bus messages with an endpoint specified by &#64;address
     * <br>which must be in the
     * <br>[D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses).
     * <br>
     * <br>This constructor can only be used to initiate client-side
     * <br>connections - use g_dbus_connection_new_sync() if you need to act
     * <br>as the server. In particular, &#64;flags cannot contain the
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS or
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flags.
     * <br>
     * <br>This is a synchronous failable constructor. See
     * <br>g_dbus_connection_new_for_address() for the asynchronous version.
     * <br>
     * <br>If &#64;observer is not %NULL it may be used to control the
     * <br>authentication process.
     * @param address a D-Bus address
     * @param flags flags describing how to make the connection
     * @param observer a &#35;GDBusAuthObserver or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public static DBusConnection newForAddressSyncDBusConnection(String address, int flags, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusConnection.INST().g_dbus_connection_new_for_address_sync(address, flags, asCPointer(observer), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusConnection:newForAddressSync");
        }
        return new DBusConnection(__self);
    }        
    

    /**
     * Synchronously sets up a D-Bus connection for exchanging D-Bus messages
     * <br>with the end represented by &#64;stream.
     * <br>
     * <br>If &#64;stream is a &#35;GSocketConnection, then the corresponding &#35;GSocket
     * <br>will be put into non-blocking mode.
     * <br>
     * <br>The D-Bus connection will interact with &#64;stream from a worker thread.
     * <br>As a result, the caller should not interact with &#64;stream after this
     * <br>method has been called, except by calling g_object_unref() on it.
     * <br>
     * <br>If &#64;observer is not %NULL it may be used to control the
     * <br>authentication process.
     * <br>
     * <br>This is a synchronous failable constructor. See
     * <br>g_dbus_connection_new() for the asynchronous version.
     * @param stream a &#35;GIOStream
     * @param guid the GUID to use if authenticating as a server or %NULL
     * @param flags flags describing how to make the connection
     * @param observer a &#35;GDBusAuthObserver or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public static DBusConnection newSyncDBusConnection(@Nonnull IOStream stream, @Nullable ch.bailu.gtk.type.Str guid, int flags, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusConnection.INST().g_dbus_connection_new_sync(asCPointerNotNull(stream), asCPointer(guid), flags, asCPointer(observer), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusConnection:newSync");
        }
        return new DBusConnection(__self);
    }        
    

    /**
     * Synchronously sets up a D-Bus connection for exchanging D-Bus messages
     * <br>with the end represented by &#64;stream.
     * <br>
     * <br>If &#64;stream is a &#35;GSocketConnection, then the corresponding &#35;GSocket
     * <br>will be put into non-blocking mode.
     * <br>
     * <br>The D-Bus connection will interact with &#64;stream from a worker thread.
     * <br>As a result, the caller should not interact with &#64;stream after this
     * <br>method has been called, except by calling g_object_unref() on it.
     * <br>
     * <br>If &#64;observer is not %NULL it may be used to control the
     * <br>authentication process.
     * <br>
     * <br>This is a synchronous failable constructor. See
     * <br>g_dbus_connection_new() for the asynchronous version.
     * @param stream a &#35;GIOStream
     * @param guid the GUID to use if authenticating as a server or %NULL
     * @param flags flags describing how to make the connection
     * @param observer a &#35;GDBusAuthObserver or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public static DBusConnection newSyncDBusConnection(@Nonnull IOStream stream, String guid, int flags, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusConnection.INST().g_dbus_connection_new_sync(asCPointerNotNull(stream), guid, flags, asCPointer(observer), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusConnection:newSync");
        }
        return new DBusConnection(__self);
    }        
    

    /**
     * Adds a message filter. Filters are handlers that are run on all
     * <br>incoming and outgoing messages, prior to standard dispatch. Filters
     * <br>are run in the order that they were added.  The same handler can be
     * <br>added as a filter more than once, in which case it will be run more
     * <br>than once.  Filters added during a filter callback won't be run on
     * <br>the message being processed. Filter functions are allowed to modify
     * <br>and even drop messages.
     * <br>
     * <br>Note that filters are run in a dedicated message handling thread so
     * <br>they can't block and, generally, can't do anything but signal a
     * <br>worker thread. Also note that filters are rarely needed - use API
     * <br>such as g_dbus_connection_send_message_with_reply(),
     * <br>g_dbus_connection_signal_subscribe() or g_dbus_connection_call() instead.
     * <br>
     * <br>If a filter consumes an incoming message the message is not
     * <br>dispatched anywhere else - not even the standard dispatch machinery
     * <br>(that API such as g_dbus_connection_signal_subscribe() and
     * <br>g_dbus_connection_send_message_with_reply() relies on) will see the
     * <br>message. Similarly, if a filter consumes an outgoing message, the
     * <br>message will not be sent to the other peer.
     * <br>
     * <br>If &#64;user_data_free_func is non-%NULL, it will be called (in the
     * <br>thread-default main context of the thread you are calling this
     * <br>method from) at some point after &#64;user_data is no longer
     * <br>needed. (It is not guaranteed to be called synchronously when the
     * <br>filter is removed, and may be called after &#64;connection has been
     * <br>destroyed.)
     * @param filter_function a filter function
     * @param user_data user data to pass to &#64;filter_function
     * @param user_data_free_func function to free &#64;user_data with when filter     is removed or %NULL
     * @return a filter identifier that can be used with     g_dbus_connection_remove_filter()
    */
    public int addFilter(OnDBusMessageFilterFunction filter_function, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        return JnaDBusConnection.INST().g_dbus_connection_add_filter(asCPointer(), toOnDBusMessageFilterFunction(this, "addFilter", filter_function), asCPointer(user_data), toOnDestroyNotify(this, "addFilter", user_data_free_func));
    }

    /**
     * Asynchronously invokes the &#64;method_name method on the
     * <br>&#64;interface_name D-Bus interface on the remote object at
     * <br>&#64;object_path owned by &#64;bus_name.
     * <br>
     * <br>If &#64;connection is closed then the operation will fail with
     * <br>%G_IO_ERROR_CLOSED. If &#64;cancellable is canceled, the operation will
     * <br>fail with %G_IO_ERROR_CANCELLED. If &#64;parameters contains a value
     * <br>not compatible with the D-Bus protocol, the operation fails with
     * <br>%G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If &#64;reply_type is non-%NULL then the reply will be checked for having this type and an
     * <br>error will be raised if it does not match.  Said another way, if you give a &#64;reply_type
     * <br>then any non-%NULL return value will be of this type. Unless it’s
     * <br>%G_VARIANT_TYPE_UNIT, the &#64;reply_type will be a tuple containing one or more
     * <br>values.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_connection_call (connection,
     *                          &quot;org.freedesktop.StringThings&quot;,
     *                          &quot;/org/freedesktop/StringThings&quot;,
     *                          &quot;org.freedesktop.StringThings&quot;,
     *                          &quot;TwoStrings&quot;,
     *                          g_variant_new (&quot;(ss)&quot;,
     *                                         &quot;Thing One&quot;,
     *                                         &quot;Thing Two&quot;),
     *                          NULL,
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          (GAsyncReadyCallback) two_strings_done,
     *                          NULL);
     * </pre>
     * <br>
     * <br>This is an asynchronous method. When the operation is finished,
     * <br>&#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from. You can then call
     * <br>g_dbus_connection_call_finish() to get the result of the operation.
     * <br>See g_dbus_connection_call_sync() for the synchronous version of this
     * <br>function.
     * <br>
     * <br>If &#64;callback is %NULL then the D-Bus method call message will be sent with
     * <br>the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
     * @param bus_name a unique or well-known bus name or %NULL if     &#64;connection is not a message bus connection
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to invoke method on
     * @param method_name the name of the method to invoke
     * @param parameters a &#35;GVariant tuple with parameters for the method     or %NULL if not passing parameters
     * @param reply_type the expected type of the reply (which will be a     tuple), or %NULL
     * @param flags flags from the &#35;GDBusCallFlags enumeration
     * @param timeout_msec the timeout in milliseconds, -1 to use the default     timeout or %G_MAXINT for no timeout
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request     is satisfied or %NULL if you don't care about the result of the     method invocation
     * @param user_data the data to pass to &#64;callback
    */
    public void call(@Nullable ch.bailu.gtk.type.Str bus_name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nonnull ch.bailu.gtk.type.Str method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, @Nullable ch.bailu.gtk.glib.VariantType reply_type, int flags, int timeout_msec, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_call(asCPointer(), asCPointer(bus_name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointerNotNull(method_name), asCPointer(parameters), asCPointer(reply_type), flags, timeout_msec, asCPointer(cancellable), toOnAsyncReadyCallback(this, "call", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously invokes the &#64;method_name method on the
     * <br>&#64;interface_name D-Bus interface on the remote object at
     * <br>&#64;object_path owned by &#64;bus_name.
     * <br>
     * <br>If &#64;connection is closed then the operation will fail with
     * <br>%G_IO_ERROR_CLOSED. If &#64;cancellable is canceled, the operation will
     * <br>fail with %G_IO_ERROR_CANCELLED. If &#64;parameters contains a value
     * <br>not compatible with the D-Bus protocol, the operation fails with
     * <br>%G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If &#64;reply_type is non-%NULL then the reply will be checked for having this type and an
     * <br>error will be raised if it does not match.  Said another way, if you give a &#64;reply_type
     * <br>then any non-%NULL return value will be of this type. Unless it’s
     * <br>%G_VARIANT_TYPE_UNIT, the &#64;reply_type will be a tuple containing one or more
     * <br>values.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed. This allows
     * <br>convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_connection_call (connection,
     *                          &quot;org.freedesktop.StringThings&quot;,
     *                          &quot;/org/freedesktop/StringThings&quot;,
     *                          &quot;org.freedesktop.StringThings&quot;,
     *                          &quot;TwoStrings&quot;,
     *                          g_variant_new (&quot;(ss)&quot;,
     *                                         &quot;Thing One&quot;,
     *                                         &quot;Thing Two&quot;),
     *                          NULL,
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          (GAsyncReadyCallback) two_strings_done,
     *                          NULL);
     * </pre>
     * <br>
     * <br>This is an asynchronous method. When the operation is finished,
     * <br>&#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from. You can then call
     * <br>g_dbus_connection_call_finish() to get the result of the operation.
     * <br>See g_dbus_connection_call_sync() for the synchronous version of this
     * <br>function.
     * <br>
     * <br>If &#64;callback is %NULL then the D-Bus method call message will be sent with
     * <br>the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
     * @param bus_name a unique or well-known bus name or %NULL if     &#64;connection is not a message bus connection
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to invoke method on
     * @param method_name the name of the method to invoke
     * @param parameters a &#35;GVariant tuple with parameters for the method     or %NULL if not passing parameters
     * @param reply_type the expected type of the reply (which will be a     tuple), or %NULL
     * @param flags flags from the &#35;GDBusCallFlags enumeration
     * @param timeout_msec the timeout in milliseconds, -1 to use the default     timeout or %G_MAXINT for no timeout
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request     is satisfied or %NULL if you don't care about the result of the     method invocation
     * @param user_data the data to pass to &#64;callback
    */
    public void call(String bus_name, String object_path, String interface_name, String method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, @Nullable ch.bailu.gtk.glib.VariantType reply_type, int flags, int timeout_msec, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_call(asCPointer(), bus_name, object_path, interface_name, method_name, asCPointer(parameters), asCPointer(reply_type), flags, timeout_msec, asCPointer(cancellable), toOnAsyncReadyCallback(this, "call", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with g_dbus_connection_call().
     * @param res a &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to g_dbus_connection_call()
     * @return %NULL if &#64;error is set. Otherwise a non-floating     &#35;GVariant tuple with return values. Free with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant callFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_call_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Synchronously invokes the &#64;method_name method on the
     * <br>&#64;interface_name D-Bus interface on the remote object at
     * <br>&#64;object_path owned by &#64;bus_name.
     * <br>
     * <br>If &#64;connection is closed then the operation will fail with
     * <br>%G_IO_ERROR_CLOSED. If &#64;cancellable is canceled, the
     * <br>operation will fail with %G_IO_ERROR_CANCELLED. If &#64;parameters
     * <br>contains a value not compatible with the D-Bus protocol, the operation
     * <br>fails with %G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If &#64;reply_type is non-%NULL then the reply will be checked for having
     * <br>this type and an error will be raised if it does not match.  Said
     * <br>another way, if you give a &#64;reply_type then any non-%NULL return
     * <br>value will be of this type.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed.
     * <br>This allows convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_connection_call_sync (connection,
     *                               &quot;org.freedesktop.StringThings&quot;,
     *                               &quot;/org/freedesktop/StringThings&quot;,
     *                               &quot;org.freedesktop.StringThings&quot;,
     *                               &quot;TwoStrings&quot;,
     *                               g_variant_new (&quot;(ss)&quot;,
     *                                              &quot;Thing One&quot;,
     *                                              &quot;Thing Two&quot;),
     *                               NULL,
     *                               G_DBUS_CALL_FLAGS_NONE,
     *                               -1,
     *                               NULL,
     *                               &amp;error);
     * </pre>
     * <br>
     * <br>The calling thread is blocked until a reply is received. See
     * <br>g_dbus_connection_call() for the asynchronous version of
     * <br>this method.
     * @param bus_name a unique or well-known bus name or %NULL if     &#64;connection is not a message bus connection
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to invoke method on
     * @param method_name the name of the method to invoke
     * @param parameters a &#35;GVariant tuple with parameters for the method     or %NULL if not passing parameters
     * @param reply_type the expected type of the reply, or %NULL
     * @param flags flags from the &#35;GDBusCallFlags enumeration
     * @param timeout_msec the timeout in milliseconds, -1 to use the default     timeout or %G_MAXINT for no timeout
     * @param cancellable a &#35;GCancellable or %NULL
     * @return %NULL if &#64;error is set. Otherwise a non-floating     &#35;GVariant tuple with return values. Free with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant callSync(@Nullable ch.bailu.gtk.type.Str bus_name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nonnull ch.bailu.gtk.type.Str method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, @Nullable ch.bailu.gtk.glib.VariantType reply_type, int flags, int timeout_msec, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_call_sync(asCPointer(), asCPointer(bus_name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointerNotNull(method_name), asCPointer(parameters), asCPointer(reply_type), flags, timeout_msec, asCPointer(cancellable), 0L)));
    }

    /**
     * Synchronously invokes the &#64;method_name method on the
     * <br>&#64;interface_name D-Bus interface on the remote object at
     * <br>&#64;object_path owned by &#64;bus_name.
     * <br>
     * <br>If &#64;connection is closed then the operation will fail with
     * <br>%G_IO_ERROR_CLOSED. If &#64;cancellable is canceled, the
     * <br>operation will fail with %G_IO_ERROR_CANCELLED. If &#64;parameters
     * <br>contains a value not compatible with the D-Bus protocol, the operation
     * <br>fails with %G_IO_ERROR_INVALID_ARGUMENT.
     * <br>
     * <br>If &#64;reply_type is non-%NULL then the reply will be checked for having
     * <br>this type and an error will be raised if it does not match.  Said
     * <br>another way, if you give a &#64;reply_type then any non-%NULL return
     * <br>value will be of this type.
     * <br>
     * <br>If the &#64;parameters &#35;GVariant is floating, it is consumed.
     * <br>This allows convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_dbus_connection_call_sync (connection,
     *                               &quot;org.freedesktop.StringThings&quot;,
     *                               &quot;/org/freedesktop/StringThings&quot;,
     *                               &quot;org.freedesktop.StringThings&quot;,
     *                               &quot;TwoStrings&quot;,
     *                               g_variant_new (&quot;(ss)&quot;,
     *                                              &quot;Thing One&quot;,
     *                                              &quot;Thing Two&quot;),
     *                               NULL,
     *                               G_DBUS_CALL_FLAGS_NONE,
     *                               -1,
     *                               NULL,
     *                               &amp;error);
     * </pre>
     * <br>
     * <br>The calling thread is blocked until a reply is received. See
     * <br>g_dbus_connection_call() for the asynchronous version of
     * <br>this method.
     * @param bus_name a unique or well-known bus name or %NULL if     &#64;connection is not a message bus connection
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to invoke method on
     * @param method_name the name of the method to invoke
     * @param parameters a &#35;GVariant tuple with parameters for the method     or %NULL if not passing parameters
     * @param reply_type the expected type of the reply, or %NULL
     * @param flags flags from the &#35;GDBusCallFlags enumeration
     * @param timeout_msec the timeout in milliseconds, -1 to use the default     timeout or %G_MAXINT for no timeout
     * @param cancellable a &#35;GCancellable or %NULL
     * @return %NULL if &#64;error is set. Otherwise a non-floating     &#35;GVariant tuple with return values. Free with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant callSync(String bus_name, String object_path, String interface_name, String method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, @Nullable ch.bailu.gtk.glib.VariantType reply_type, int flags, int timeout_msec, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_call_sync(asCPointer(), bus_name, object_path, interface_name, method_name, asCPointer(parameters), asCPointer(reply_type), flags, timeout_msec, asCPointer(cancellable), 0L)));
    }

    /**
     * Like g_dbus_connection_call() but also takes a &#35;GUnixFDList object.
     * <br>
     * <br>The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE
     * <br>values in the body of the message. For example, if a message contains
     * <br>two file descriptors, &#64;fd_list would have length 2, and
     * <br>`g_variant_new_handle (0)` and `g_variant_new_handle (1)` would appear
     * <br>somewhere in the body of the message (not necessarily in that order!)
     * <br>to represent the file descriptors at indexes 0 and 1 respectively.
     * <br>
     * <br>When designing D-Bus APIs that are intended to be interoperable,
     * <br>please note that non-GDBus implementations of D-Bus can usually only
     * <br>access file descriptors if they are referenced in this way by a
     * <br>value of type %G_VARIANT_TYPE_HANDLE in the body of the message.
     * <br>
     * <br>This method is only available on UNIX.
     * @param bus_name a unique or well-known bus name or %NULL if     &#64;connection is not a message bus connection
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to invoke method on
     * @param method_name the name of the method to invoke
     * @param parameters a &#35;GVariant tuple with parameters for the method     or %NULL if not passing parameters
     * @param reply_type the expected type of the reply, or %NULL
     * @param flags flags from the &#35;GDBusCallFlags enumeration
     * @param timeout_msec the timeout in milliseconds, -1 to use the default     timeout or %G_MAXINT for no timeout
     * @param fd_list a &#35;GUnixFDList or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request is     satisfied or %NULL if you don't * care about the result of the     method invocation
     * @param user_data The data to pass to &#64;callback.
    */
    public void callWithUnixFdList(@Nullable ch.bailu.gtk.type.Str bus_name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nonnull ch.bailu.gtk.type.Str method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, @Nullable ch.bailu.gtk.glib.VariantType reply_type, int flags, int timeout_msec, @Nullable UnixFDList fd_list, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_call_with_unix_fd_list(asCPointer(), asCPointer(bus_name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointerNotNull(method_name), asCPointer(parameters), asCPointer(reply_type), flags, timeout_msec, asCPointer(fd_list), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callWithUnixFdList", callback), asCPointer(user_data));
    }

    /**
     * Like g_dbus_connection_call() but also takes a &#35;GUnixFDList object.
     * <br>
     * <br>The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE
     * <br>values in the body of the message. For example, if a message contains
     * <br>two file descriptors, &#64;fd_list would have length 2, and
     * <br>`g_variant_new_handle (0)` and `g_variant_new_handle (1)` would appear
     * <br>somewhere in the body of the message (not necessarily in that order!)
     * <br>to represent the file descriptors at indexes 0 and 1 respectively.
     * <br>
     * <br>When designing D-Bus APIs that are intended to be interoperable,
     * <br>please note that non-GDBus implementations of D-Bus can usually only
     * <br>access file descriptors if they are referenced in this way by a
     * <br>value of type %G_VARIANT_TYPE_HANDLE in the body of the message.
     * <br>
     * <br>This method is only available on UNIX.
     * @param bus_name a unique or well-known bus name or %NULL if     &#64;connection is not a message bus connection
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to invoke method on
     * @param method_name the name of the method to invoke
     * @param parameters a &#35;GVariant tuple with parameters for the method     or %NULL if not passing parameters
     * @param reply_type the expected type of the reply, or %NULL
     * @param flags flags from the &#35;GDBusCallFlags enumeration
     * @param timeout_msec the timeout in milliseconds, -1 to use the default     timeout or %G_MAXINT for no timeout
     * @param fd_list a &#35;GUnixFDList or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request is     satisfied or %NULL if you don't * care about the result of the     method invocation
     * @param user_data The data to pass to &#64;callback.
    */
    public void callWithUnixFdList(String bus_name, String object_path, String interface_name, String method_name, @Nullable ch.bailu.gtk.glib.Variant parameters, @Nullable ch.bailu.gtk.glib.VariantType reply_type, int flags, int timeout_msec, @Nullable UnixFDList fd_list, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_call_with_unix_fd_list(asCPointer(), bus_name, object_path, interface_name, method_name, asCPointer(parameters), asCPointer(reply_type), flags, timeout_msec, asCPointer(fd_list), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callWithUnixFdList", callback), asCPointer(user_data));
    }

    /**
     * Closes &#64;connection. Note that this never causes the process to
     * <br>exit (this might only happen if the other end of a shared message
     * <br>bus connection disconnects, see &#35;GDBusConnection:exit-on-close).
     * <br>
     * <br>Once the connection is closed, operations such as sending a message
     * <br>will return with the error %G_IO_ERROR_CLOSED. Closing a connection
     * <br>will not automatically flush the connection so queued messages may
     * <br>be lost. Use g_dbus_connection_flush() if you need such guarantees.
     * <br>
     * <br>If &#64;connection is already closed, this method fails with
     * <br>%G_IO_ERROR_CLOSED.
     * <br>
     * <br>When &#64;connection has been closed, the &#35;GDBusConnection::closed
     * <br>signal is emitted in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread that &#64;connection was constructed in.
     * <br>
     * <br>This is an asynchronous method. When the operation is finished,
     * <br>&#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from. You can
     * <br>then call g_dbus_connection_close_finish() to get the result of the
     * <br>operation. See g_dbus_connection_close_sync() for the synchronous
     * <br>version.
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request is     satisfied or %NULL if you don't care about the result
     * @param user_data The data to pass to &#64;callback
    */
    public void close(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_close(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "close", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with g_dbus_connection_close().
     * @param res a &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed     to g_dbus_connection_close()
     * @return %TRUE if the operation succeeded, %FALSE if &#64;error is set
    */
    public boolean closeFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_close_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Synchronously closes &#64;connection. The calling thread is blocked
     * <br>until this is done. See g_dbus_connection_close() for the
     * <br>asynchronous version of this method and more details about what it
     * <br>does.
     * @param cancellable a &#35;GCancellable or %NULL
     * @return %TRUE if the operation succeeded, %FALSE if &#64;error is set
    */
    public boolean closeSync(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_close_sync(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Emits a signal.
     * <br>
     * <br>If the parameters GVariant is floating, it is consumed.
     * <br>
     * <br>This can only fail if &#64;parameters is not compatible with the D-Bus protocol
     * <br>(%G_IO_ERROR_INVALID_ARGUMENT), or if &#64;connection has been closed
     * <br>(%G_IO_ERROR_CLOSED).
     * @param destination_bus_name the unique bus name for the destination     for the signal or %NULL to emit to all listeners
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to emit a signal on
     * @param signal_name the name of the signal to emit
     * @param parameters a &#35;GVariant tuple with parameters for the signal              or %NULL if not passing parameters
     * @return %TRUE unless &#64;error is set
    */
    public boolean emitSignal(@Nullable ch.bailu.gtk.type.Str destination_bus_name, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name, @Nonnull ch.bailu.gtk.type.Str signal_name, @Nullable ch.bailu.gtk.glib.Variant parameters) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_emit_signal(asCPointer(), asCPointer(destination_bus_name), asCPointerNotNull(object_path), asCPointerNotNull(interface_name), asCPointerNotNull(signal_name), asCPointer(parameters), 0L);
    }

    /**
     * Emits a signal.
     * <br>
     * <br>If the parameters GVariant is floating, it is consumed.
     * <br>
     * <br>This can only fail if &#64;parameters is not compatible with the D-Bus protocol
     * <br>(%G_IO_ERROR_INVALID_ARGUMENT), or if &#64;connection has been closed
     * <br>(%G_IO_ERROR_CLOSED).
     * @param destination_bus_name the unique bus name for the destination     for the signal or %NULL to emit to all listeners
     * @param object_path path of remote object
     * @param interface_name D-Bus interface to emit a signal on
     * @param signal_name the name of the signal to emit
     * @param parameters a &#35;GVariant tuple with parameters for the signal              or %NULL if not passing parameters
     * @return %TRUE unless &#64;error is set
    */
    public boolean emitSignal(String destination_bus_name, String object_path, String interface_name, String signal_name, @Nullable ch.bailu.gtk.glib.Variant parameters) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_emit_signal(asCPointer(), destination_bus_name, object_path, interface_name, signal_name, asCPointer(parameters), 0L);
    }

    /**
     * Exports &#64;action_group on &#64;connection at &#64;object_path.
     * <br>
     * <br>The implemented D-Bus API should be considered private.  It is
     * <br>subject to change in the future.
     * <br>
     * <br>A given object path can only have one action group exported on it.
     * <br>If this constraint is violated, the export will fail and 0 will be
     * <br>returned (with &#64;error set accordingly).
     * <br>
     * <br>You can unexport the action group using
     * <br>g_dbus_connection_unexport_action_group() with the return value of
     * <br>this function.
     * <br>
     * <br>The thread default main context is taken at the time of this call.
     * <br>All incoming action activations and state change requests are
     * <br>reported from this context.  Any changes on the action group that
     * <br>cause it to emit signals must also come from this same context.
     * <br>Since incoming action activations and state change requests are
     * <br>rather likely to cause changes on the action group, this effectively
     * <br>limits a given action group to being exported from only one main
     * <br>context.
     * @param object_path a D-Bus object path
     * @param action_group a &#35;GActionGroup
     * @return the ID of the export (never zero), or 0 in case of failure
    */
    public int exportActionGroup(@Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ActionGroup action_group) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_export_action_group(asCPointer(), asCPointerNotNull(object_path), asCPointerNotNull(action_group), 0L);
    }

    /**
     * Exports &#64;action_group on &#64;connection at &#64;object_path.
     * <br>
     * <br>The implemented D-Bus API should be considered private.  It is
     * <br>subject to change in the future.
     * <br>
     * <br>A given object path can only have one action group exported on it.
     * <br>If this constraint is violated, the export will fail and 0 will be
     * <br>returned (with &#64;error set accordingly).
     * <br>
     * <br>You can unexport the action group using
     * <br>g_dbus_connection_unexport_action_group() with the return value of
     * <br>this function.
     * <br>
     * <br>The thread default main context is taken at the time of this call.
     * <br>All incoming action activations and state change requests are
     * <br>reported from this context.  Any changes on the action group that
     * <br>cause it to emit signals must also come from this same context.
     * <br>Since incoming action activations and state change requests are
     * <br>rather likely to cause changes on the action group, this effectively
     * <br>limits a given action group to being exported from only one main
     * <br>context.
     * @param object_path a D-Bus object path
     * @param action_group a &#35;GActionGroup
     * @return the ID of the export (never zero), or 0 in case of failure
    */
    public int exportActionGroup(String object_path, @Nonnull ActionGroup action_group) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_export_action_group(asCPointer(), object_path, asCPointerNotNull(action_group), 0L);
    }

    /**
     * Exports &#64;menu on &#64;connection at &#64;object_path.
     * <br>
     * <br>The implemented D-Bus API should be considered private.
     * <br>It is subject to change in the future.
     * <br>
     * <br>An object path can only have one menu model exported on it. If this
     * <br>constraint is violated, the export will fail and 0 will be
     * <br>returned (with &#64;error set accordingly).
     * <br>
     * <br>You can unexport the menu model using
     * <br>g_dbus_connection_unexport_menu_model() with the return value of
     * <br>this function.
     * @param object_path a D-Bus object path
     * @param menu a &#35;GMenuModel
     * @return the ID of the export (never zero), or 0 in case of failure
    */
    public int exportMenuModel(@Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull MenuModel menu) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_export_menu_model(asCPointer(), asCPointerNotNull(object_path), asCPointerNotNull(menu), 0L);
    }

    /**
     * Exports &#64;menu on &#64;connection at &#64;object_path.
     * <br>
     * <br>The implemented D-Bus API should be considered private.
     * <br>It is subject to change in the future.
     * <br>
     * <br>An object path can only have one menu model exported on it. If this
     * <br>constraint is violated, the export will fail and 0 will be
     * <br>returned (with &#64;error set accordingly).
     * <br>
     * <br>You can unexport the menu model using
     * <br>g_dbus_connection_unexport_menu_model() with the return value of
     * <br>this function.
     * @param object_path a D-Bus object path
     * @param menu a &#35;GMenuModel
     * @return the ID of the export (never zero), or 0 in case of failure
    */
    public int exportMenuModel(String object_path, @Nonnull MenuModel menu) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_export_menu_model(asCPointer(), object_path, asCPointerNotNull(menu), 0L);
    }

    /**
     * Asynchronously flushes &#64;connection, that is, writes all queued
     * <br>outgoing message to the transport and then flushes the transport
     * <br>(using g_output_stream_flush_async()). This is useful in programs
     * <br>that wants to emit a D-Bus signal and then exit immediately. Without
     * <br>flushing the connection, there is no guaranteed that the message has
     * <br>been sent to the networking buffers in the OS kernel.
     * <br>
     * <br>This is an asynchronous method. When the operation is finished,
     * <br>&#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from. You can
     * <br>then call g_dbus_connection_flush_finish() to get the result of the
     * <br>operation. See g_dbus_connection_flush_sync() for the synchronous
     * <br>version.
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the     request is satisfied or %NULL if you don't care about the result
     * @param user_data The data to pass to &#64;callback
    */
    public void flush(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_flush(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "flush", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with g_dbus_connection_flush().
     * @param res a &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed     to g_dbus_connection_flush()
     * @return %TRUE if the operation succeeded, %FALSE if &#64;error is set
    */
    public boolean flushFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_flush_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Synchronously flushes &#64;connection. The calling thread is blocked
     * <br>until this is done. See g_dbus_connection_flush() for the
     * <br>asynchronous version of this method and more details about what it
     * <br>does.
     * @param cancellable a &#35;GCancellable or %NULL
     * @return %TRUE if the operation succeeded, %FALSE if &#64;error is set
    */
    public boolean flushSync(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_flush_sync(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Gets the capabilities negotiated with the remote peer
     * @return zero or more flags from the &#35;GDBusCapabilityFlags enumeration
    */
    public int getCapabilities()  {
        return JnaDBusConnection.INST().g_dbus_connection_get_capabilities(asCPointer());
    }

    /**
     * Gets whether the process is terminated when &#64;connection is
     * <br>closed by the remote peer. See
     * <br>&#35;GDBusConnection:exit-on-close for more details.
     * @return whether the process is terminated when &#64;connection is     closed by the remote peer
    */
    public boolean getExitOnClose()  {
        return JnaDBusConnection.INST().g_dbus_connection_get_exit_on_close(asCPointer());
    }

    /**
     * Gets the flags used to construct this connection
     * @return zero or more flags from the &#35;GDBusConnectionFlags enumeration
    */
    public int getFlags()  {
        return JnaDBusConnection.INST().g_dbus_connection_get_flags(asCPointer());
    }

    /**
     * The GUID of the peer performing the role of server when
     * <br>authenticating. See &#35;GDBusConnection:guid for more details.
     * @return The GUID. Do not free this string, it is owned by     &#64;connection.
    */
    public ch.bailu.gtk.type.Str getGuid()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_get_guid(asCPointer())));
    }

    /**
     * Retrieves the last serial number assigned to a &#35;GDBusMessage on
     * <br>the current thread. This includes messages sent via both low-level
     * <br>API such as g_dbus_connection_send_message() as well as
     * <br>high-level API such as g_dbus_connection_emit_signal(),
     * <br>g_dbus_connection_call() or g_dbus_proxy_call().
     * @return the last used serial or zero when no message has been sent     within the current thread
    */
    public int getLastSerial()  {
        return JnaDBusConnection.INST().g_dbus_connection_get_last_serial(asCPointer());
    }

    /**
     * Gets the credentials of the authenticated peer. This will always
     * <br>return %NULL unless &#64;connection acted as a server
     * <br>(e.g. %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER was passed)
     * <br>when set up and the client passed credentials as part of the
     * <br>authentication process.
     * <br>
     * <br>In a message bus setup, the message bus is always the server and
     * <br>each application is a client. So this method will always return
     * <br>%NULL for message bus clients.
     * @return a &#35;GCredentials or %NULL if not     available. Do not free this object, it is owned by &#64;connection.
    */
    public Credentials getPeerCredentials()  {
        return new Credentials(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_get_peer_credentials(asCPointer())));
    }

    /**
     * Gets the underlying stream used for IO.
     * <br>
     * <br>While the &#35;GDBusConnection is active, it will interact with this
     * <br>stream from a worker thread, so it is not safe to interact with
     * <br>the stream directly.
     * @return the stream used for IO
    */
    public IOStream getStream()  {
        return new IOStream(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_get_stream(asCPointer())));
    }

    /**
     * Gets the unique name of &#64;connection as assigned by the message
     * <br>bus. This can also be used to figure out if &#64;connection is a
     * <br>message bus connection.
     * @return the unique name or %NULL if &#64;connection is not a message     bus connection. Do not free this string, it is owned by     &#64;connection.
    */
    public ch.bailu.gtk.type.Str getUniqueName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_get_unique_name(asCPointer())));
    }

    /**
     * Gets whether &#64;connection is closed.
     * @return %TRUE if the connection is closed, %FALSE otherwise
    */
    public boolean isClosed()  {
        return JnaDBusConnection.INST().g_dbus_connection_is_closed(asCPointer());
    }

    /**
     * Registers callbacks for exported objects at &#64;object_path with the
     * <br>D-Bus interface that is described in &#64;interface_info.
     * <br>
     * <br>Calls to functions in &#64;vtable (and &#64;user_data_free_func) will happen
     * <br>in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>
     * <br>Note that all &#35;GVariant values passed to functions in &#64;vtable will match
     * <br>the signature given in &#64;interface_info - if a remote caller passes
     * <br>incorrect values, the `org.freedesktop.DBus.Error.InvalidArgs`
     * <br>is returned to the remote caller.
     * <br>
     * <br>Additionally, if the remote caller attempts to invoke methods or
     * <br>access properties not mentioned in &#64;interface_info the
     * <br>`org.freedesktop.DBus.Error.UnknownMethod` resp.
     * <br>`org.freedesktop.DBus.Error.InvalidArgs` errors
     * <br>are returned to the caller.
     * <br>
     * <br>It is considered a programming error if the
     * <br>&#35;GDBusInterfaceGetPropertyFunc function in &#64;vtable returns a
     * <br>&#35;GVariant of incorrect type.
     * <br>
     * <br>If an existing callback is already registered at &#64;object_path and
     * <br>&#64;interface_name, then &#64;error is set to %G_IO_ERROR_EXISTS.
     * <br>
     * <br>GDBus automatically implements the standard D-Bus interfaces
     * <br>org.freedesktop.DBus.Properties, org.freedesktop.DBus.Introspectable
     * <br>and org.freedesktop.Peer, so you don't have to implement those for the
     * <br>objects you export. You can implement org.freedesktop.DBus.Properties
     * <br>yourself, e.g. to handle getting and setting of properties asynchronously.
     * <br>
     * <br>Note that the reference count on &#64;interface_info will be
     * <br>incremented by 1 (unless allocated statically, e.g. if the
     * <br>reference count is -1, see g_dbus_interface_info_ref()) for as long
     * <br>as the object is exported. Also note that &#64;vtable will be copied.
     * <br>
     * <br>See this [server][gdbus-server] for an example of how to use this method.
     * @param object_path the object path to register at
     * @param interface_info introspection data for the interface
     * @param vtable a &#35;GDBusInterfaceVTable to call into or %NULL
     * @param user_data data to pass to functions in &#64;vtable
     * @param user_data_free_func function to call when the object path is unregistered
     * @return 0 if &#64;error is set, otherwise a registration id (never 0)     that can be used with g_dbus_connection_unregister_object()
    */
    public int registerObject(@Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull DBusInterfaceInfo interface_info, @Nullable DBusInterfaceVTable vtable, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_register_object(asCPointer(), asCPointerNotNull(object_path), asCPointerNotNull(interface_info), asCPointer(vtable), asCPointer(user_data), toOnDestroyNotify(this, "registerObject", user_data_free_func), 0L);
    }

    /**
     * Registers callbacks for exported objects at &#64;object_path with the
     * <br>D-Bus interface that is described in &#64;interface_info.
     * <br>
     * <br>Calls to functions in &#64;vtable (and &#64;user_data_free_func) will happen
     * <br>in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>
     * <br>Note that all &#35;GVariant values passed to functions in &#64;vtable will match
     * <br>the signature given in &#64;interface_info - if a remote caller passes
     * <br>incorrect values, the `org.freedesktop.DBus.Error.InvalidArgs`
     * <br>is returned to the remote caller.
     * <br>
     * <br>Additionally, if the remote caller attempts to invoke methods or
     * <br>access properties not mentioned in &#64;interface_info the
     * <br>`org.freedesktop.DBus.Error.UnknownMethod` resp.
     * <br>`org.freedesktop.DBus.Error.InvalidArgs` errors
     * <br>are returned to the caller.
     * <br>
     * <br>It is considered a programming error if the
     * <br>&#35;GDBusInterfaceGetPropertyFunc function in &#64;vtable returns a
     * <br>&#35;GVariant of incorrect type.
     * <br>
     * <br>If an existing callback is already registered at &#64;object_path and
     * <br>&#64;interface_name, then &#64;error is set to %G_IO_ERROR_EXISTS.
     * <br>
     * <br>GDBus automatically implements the standard D-Bus interfaces
     * <br>org.freedesktop.DBus.Properties, org.freedesktop.DBus.Introspectable
     * <br>and org.freedesktop.Peer, so you don't have to implement those for the
     * <br>objects you export. You can implement org.freedesktop.DBus.Properties
     * <br>yourself, e.g. to handle getting and setting of properties asynchronously.
     * <br>
     * <br>Note that the reference count on &#64;interface_info will be
     * <br>incremented by 1 (unless allocated statically, e.g. if the
     * <br>reference count is -1, see g_dbus_interface_info_ref()) for as long
     * <br>as the object is exported. Also note that &#64;vtable will be copied.
     * <br>
     * <br>See this [server][gdbus-server] for an example of how to use this method.
     * @param object_path the object path to register at
     * @param interface_info introspection data for the interface
     * @param vtable a &#35;GDBusInterfaceVTable to call into or %NULL
     * @param user_data data to pass to functions in &#64;vtable
     * @param user_data_free_func function to call when the object path is unregistered
     * @return 0 if &#64;error is set, otherwise a registration id (never 0)     that can be used with g_dbus_connection_unregister_object()
    */
    public int registerObject(String object_path, @Nonnull DBusInterfaceInfo interface_info, @Nullable DBusInterfaceVTable vtable, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_register_object(asCPointer(), object_path, asCPointerNotNull(interface_info), asCPointer(vtable), asCPointer(user_data), toOnDestroyNotify(this, "registerObject", user_data_free_func), 0L);
    }

    /**
     * Version of g_dbus_connection_register_object() using closures instead of a
     * <br>&#35;GDBusInterfaceVTable for easier binding in other languages.
     * @param object_path The object path to register at.
     * @param interface_info Introspection data for the interface.
     * @param method_call_closure &#35;GClosure for handling incoming method calls.
     * @param get_property_closure &#35;GClosure for getting a property.
     * @param set_property_closure &#35;GClosure for setting a property.
     * @return 0 if &#64;error is set, otherwise a registration ID (never 0) that can be used with g_dbus_connection_unregister_object() .
    */
    public int registerObjectWithClosures(@Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull DBusInterfaceInfo interface_info, @Nullable ch.bailu.gtk.gobject.Closure method_call_closure, @Nullable ch.bailu.gtk.gobject.Closure get_property_closure, @Nullable ch.bailu.gtk.gobject.Closure set_property_closure) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_register_object_with_closures(asCPointer(), asCPointerNotNull(object_path), asCPointerNotNull(interface_info), asCPointer(method_call_closure), asCPointer(get_property_closure), asCPointer(set_property_closure), 0L);
    }

    /**
     * Version of g_dbus_connection_register_object() using closures instead of a
     * <br>&#35;GDBusInterfaceVTable for easier binding in other languages.
     * @param object_path The object path to register at.
     * @param interface_info Introspection data for the interface.
     * @param method_call_closure &#35;GClosure for handling incoming method calls.
     * @param get_property_closure &#35;GClosure for getting a property.
     * @param set_property_closure &#35;GClosure for setting a property.
     * @return 0 if &#64;error is set, otherwise a registration ID (never 0) that can be used with g_dbus_connection_unregister_object() .
    */
    public int registerObjectWithClosures(String object_path, @Nonnull DBusInterfaceInfo interface_info, @Nullable ch.bailu.gtk.gobject.Closure method_call_closure, @Nullable ch.bailu.gtk.gobject.Closure get_property_closure, @Nullable ch.bailu.gtk.gobject.Closure set_property_closure) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_register_object_with_closures(asCPointer(), object_path, asCPointerNotNull(interface_info), asCPointer(method_call_closure), asCPointer(get_property_closure), asCPointer(set_property_closure), 0L);
    }

    /**
     * Registers a whole subtree of dynamic objects.
     * <br>
     * <br>The &#64;enumerate and &#64;introspection functions in &#64;vtable are used to
     * <br>convey, to remote callers, what nodes exist in the subtree rooted
     * <br>by &#64;object_path.
     * <br>
     * <br>When handling remote calls into any node in the subtree, first the
     * <br>&#64;enumerate function is used to check if the node exists. If the node exists
     * <br>or the %G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES flag is set
     * <br>the &#64;introspection function is used to check if the node supports the
     * <br>requested method. If so, the &#64;dispatch function is used to determine
     * <br>where to dispatch the call. The collected &#35;GDBusInterfaceVTable and
     * <br>&#35;gpointer will be used to call into the interface vtable for processing
     * <br>the request.
     * <br>
     * <br>All calls into user-provided code will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>
     * <br>If an existing subtree is already registered at &#64;object_path or
     * <br>then &#64;error is set to %G_IO_ERROR_EXISTS.
     * <br>
     * <br>Note that it is valid to register regular objects (using
     * <br>g_dbus_connection_register_object()) in a subtree registered with
     * <br>g_dbus_connection_register_subtree() - if so, the subtree handler
     * <br>is tried as the last resort. One way to think about a subtree
     * <br>handler is to consider it a fallback handler for object paths not
     * <br>registered via g_dbus_connection_register_object() or other bindings.
     * <br>
     * <br>Note that &#64;vtable will be copied so you cannot change it after
     * <br>registration.
     * <br>
     * <br>See this [server][gdbus-subtree-server] for an example of how to use
     * <br>this method.
     * @param object_path the object path to register the subtree at
     * @param vtable a &#35;GDBusSubtreeVTable to enumerate, introspect and     dispatch nodes in the subtree
     * @param flags flags used to fine tune the behavior of the subtree
     * @param user_data data to pass to functions in &#64;vtable
     * @param user_data_free_func function to call when the subtree is unregistered
     * @return 0 if &#64;error is set, otherwise a subtree registration ID (never 0) that can be used with g_dbus_connection_unregister_subtree()
    */
    public int registerSubtree(@Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull DBusSubtreeVTable vtable, int flags, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_register_subtree(asCPointer(), asCPointerNotNull(object_path), asCPointerNotNull(vtable), flags, asCPointer(user_data), toOnDestroyNotify(this, "registerSubtree", user_data_free_func), 0L);
    }

    /**
     * Registers a whole subtree of dynamic objects.
     * <br>
     * <br>The &#64;enumerate and &#64;introspection functions in &#64;vtable are used to
     * <br>convey, to remote callers, what nodes exist in the subtree rooted
     * <br>by &#64;object_path.
     * <br>
     * <br>When handling remote calls into any node in the subtree, first the
     * <br>&#64;enumerate function is used to check if the node exists. If the node exists
     * <br>or the %G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES flag is set
     * <br>the &#64;introspection function is used to check if the node supports the
     * <br>requested method. If so, the &#64;dispatch function is used to determine
     * <br>where to dispatch the call. The collected &#35;GDBusInterfaceVTable and
     * <br>&#35;gpointer will be used to call into the interface vtable for processing
     * <br>the request.
     * <br>
     * <br>All calls into user-provided code will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>
     * <br>If an existing subtree is already registered at &#64;object_path or
     * <br>then &#64;error is set to %G_IO_ERROR_EXISTS.
     * <br>
     * <br>Note that it is valid to register regular objects (using
     * <br>g_dbus_connection_register_object()) in a subtree registered with
     * <br>g_dbus_connection_register_subtree() - if so, the subtree handler
     * <br>is tried as the last resort. One way to think about a subtree
     * <br>handler is to consider it a fallback handler for object paths not
     * <br>registered via g_dbus_connection_register_object() or other bindings.
     * <br>
     * <br>Note that &#64;vtable will be copied so you cannot change it after
     * <br>registration.
     * <br>
     * <br>See this [server][gdbus-subtree-server] for an example of how to use
     * <br>this method.
     * @param object_path the object path to register the subtree at
     * @param vtable a &#35;GDBusSubtreeVTable to enumerate, introspect and     dispatch nodes in the subtree
     * @param flags flags used to fine tune the behavior of the subtree
     * @param user_data data to pass to functions in &#64;vtable
     * @param user_data_free_func function to call when the subtree is unregistered
     * @return 0 if &#64;error is set, otherwise a subtree registration ID (never 0) that can be used with g_dbus_connection_unregister_subtree()
    */
    public int registerSubtree(String object_path, @Nonnull DBusSubtreeVTable vtable, int flags, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusConnection.INST().g_dbus_connection_register_subtree(asCPointer(), object_path, asCPointerNotNull(vtable), flags, asCPointer(user_data), toOnDestroyNotify(this, "registerSubtree", user_data_free_func), 0L);
    }

    /**
     * Removes a filter.
     * <br>
     * <br>Note that since filters run in a different thread, there is a race
     * <br>condition where it is possible that the filter will be running even
     * <br>after calling g_dbus_connection_remove_filter(), so you cannot just
     * <br>free data that the filter might be using. Instead, you should pass
     * <br>a &#35;GDestroyNotify to g_dbus_connection_add_filter(), which will be
     * <br>called when it is guaranteed that the data is no longer needed.
     * @param filter_id an identifier obtained from g_dbus_connection_add_filter()
    */
    public void removeFilter(int filter_id)  {
        JnaDBusConnection.INST().g_dbus_connection_remove_filter(asCPointer(), filter_id);
    }

    /**
     * Finishes an operation started with g_dbus_connection_send_message_with_reply().
     * <br>
     * <br>Note that &#64;error is only set if a local in-process error
     * <br>occurred. That is to say that the returned &#35;GDBusMessage object may
     * <br>be of type %G_DBUS_MESSAGE_TYPE_ERROR. Use
     * <br>g_dbus_message_to_gerror() to transcode this to a &#35;GError.
     * <br>
     * <br>See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * <br>for an example of how to use this low-level API to send and receive
     * <br>UNIX file descriptors.
     * @param res a &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to     g_dbus_connection_send_message_with_reply()
     * @return a locked &#35;GDBusMessage or %NULL if &#64;error is set
    */
    public DBusMessage sendMessageWithReplyFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DBusMessage(new PointerContainer(JnaDBusConnection.INST().g_dbus_connection_send_message_with_reply_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Sets whether the process should be terminated when &#64;connection is
     * <br>closed by the remote peer. See &#35;GDBusConnection:exit-on-close for
     * <br>more details.
     * <br>
     * <br>Note that this function should be used with care. Most modern UNIX
     * <br>desktops tie the notion of a user session with the session bus, and expect
     * <br>all of a user's applications to quit when their bus connection goes away.
     * <br>If you are setting &#64;exit_on_close to %FALSE for the shared session
     * <br>bus connection, you should make sure that your application exits
     * <br>when the user session ends.
     * @param exit_on_close whether the process should be terminated     when &#64;connection is closed by the remote peer
    */
    public void setExitOnClose(boolean exit_on_close)  {
        JnaDBusConnection.INST().g_dbus_connection_set_exit_on_close(asCPointer(), exit_on_close);
    }

    /**
     * Subscribes to signals on &#64;connection and invokes &#64;callback with a whenever
     * <br>the signal is received. Note that &#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>
     * <br>If &#64;connection is not a message bus connection, &#64;sender must be
     * <br>%NULL.
     * <br>
     * <br>If &#64;sender is a well-known name note that &#64;callback is invoked with
     * <br>the unique name for the owner of &#64;sender, not the well-known name
     * <br>as one would expect. This is because the message bus rewrites the
     * <br>name. As such, to avoid certain race conditions, users should be
     * <br>tracking the name owner of the well-known name and use that when
     * <br>processing the received signal.
     * <br>
     * <br>If one of %G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE or
     * <br>%G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH are given, &#64;arg0 is
     * <br>interpreted as part of a namespace or path.  The first argument
     * <br>of a signal is matched against that part as specified by D-Bus.
     * <br>
     * <br>If &#64;user_data_free_func is non-%NULL, it will be called (in the
     * <br>thread-default main context of the thread you are calling this
     * <br>method from) at some point after &#64;user_data is no longer
     * <br>needed. (It is not guaranteed to be called synchronously when the
     * <br>signal is unsubscribed from, and may be called after &#64;connection
     * <br>has been destroyed.)
     * <br>
     * <br>As &#64;callback is potentially invoked in a different thread from where it’s
     * <br>emitted, it’s possible for this to happen after
     * <br>g_dbus_connection_signal_unsubscribe() has been called in another thread.
     * <br>Due to this, &#64;user_data should have a strong reference which is freed with
     * <br>&#64;user_data_free_func, rather than pointing to data whose lifecycle is tied
     * <br>to the signal subscription. For example, if a &#35;GObject is used to store the
     * <br>subscription ID from g_dbus_connection_signal_subscribe(), a strong reference
     * <br>to that &#35;GObject must be passed to &#64;user_data, and g_object_unref() passed to
     * <br>&#64;user_data_free_func. You are responsible for breaking the resulting
     * <br>reference count cycle by explicitly unsubscribing from the signal when
     * <br>dropping the last external reference to the &#35;GObject. Alternatively, a weak
     * <br>reference may be used.
     * <br>
     * <br>It is guaranteed that if you unsubscribe from a signal using
     * <br>g_dbus_connection_signal_unsubscribe() from the same thread which made the
     * <br>corresponding g_dbus_connection_signal_subscribe() call, &#64;callback will not
     * <br>be invoked after g_dbus_connection_signal_unsubscribe() returns.
     * <br>
     * <br>The returned subscription identifier is an opaque value which is guaranteed
     * <br>to never be zero.
     * <br>
     * <br>This function can never fail.
     * @param sender sender name to match on (unique or well-known name)     or %NULL to listen from all senders
     * @param interface_name D-Bus interface name to match on or %NULL to     match on all interfaces
     * @param member D-Bus signal name to match on or %NULL to match on     all signals
     * @param object_path object path to match on or %NULL to match on     all object paths
     * @param arg0 contents of first string argument to match on or %NULL     to match on all kinds of arguments
     * @param flags &#35;GDBusSignalFlags describing how arg0 is used in subscribing to the     signal
     * @param callback callback to invoke when there is a signal matching the requested data
     * @param user_data user data to pass to &#64;callback
     * @param user_data_free_func function to free &#64;user_data with when     subscription is removed or %NULL
     * @return a subscription identifier that can be used with g_dbus_connection_signal_unsubscribe()
    */
    public int signalSubscribe(@Nullable ch.bailu.gtk.type.Str sender, @Nullable ch.bailu.gtk.type.Str interface_name, @Nullable ch.bailu.gtk.type.Str member, @Nullable ch.bailu.gtk.type.Str object_path, @Nullable ch.bailu.gtk.type.Str arg0, int flags, OnDBusSignalCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        return JnaDBusConnection.INST().g_dbus_connection_signal_subscribe(asCPointer(), asCPointer(sender), asCPointer(interface_name), asCPointer(member), asCPointer(object_path), asCPointer(arg0), flags, toOnDBusSignalCallback(this, "signalSubscribe", callback), asCPointer(user_data), toOnDestroyNotify(this, "signalSubscribe", user_data_free_func));
    }

    /**
     * Subscribes to signals on &#64;connection and invokes &#64;callback with a whenever
     * <br>the signal is received. Note that &#64;callback will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this method from.
     * <br>
     * <br>If &#64;connection is not a message bus connection, &#64;sender must be
     * <br>%NULL.
     * <br>
     * <br>If &#64;sender is a well-known name note that &#64;callback is invoked with
     * <br>the unique name for the owner of &#64;sender, not the well-known name
     * <br>as one would expect. This is because the message bus rewrites the
     * <br>name. As such, to avoid certain race conditions, users should be
     * <br>tracking the name owner of the well-known name and use that when
     * <br>processing the received signal.
     * <br>
     * <br>If one of %G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE or
     * <br>%G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH are given, &#64;arg0 is
     * <br>interpreted as part of a namespace or path.  The first argument
     * <br>of a signal is matched against that part as specified by D-Bus.
     * <br>
     * <br>If &#64;user_data_free_func is non-%NULL, it will be called (in the
     * <br>thread-default main context of the thread you are calling this
     * <br>method from) at some point after &#64;user_data is no longer
     * <br>needed. (It is not guaranteed to be called synchronously when the
     * <br>signal is unsubscribed from, and may be called after &#64;connection
     * <br>has been destroyed.)
     * <br>
     * <br>As &#64;callback is potentially invoked in a different thread from where it’s
     * <br>emitted, it’s possible for this to happen after
     * <br>g_dbus_connection_signal_unsubscribe() has been called in another thread.
     * <br>Due to this, &#64;user_data should have a strong reference which is freed with
     * <br>&#64;user_data_free_func, rather than pointing to data whose lifecycle is tied
     * <br>to the signal subscription. For example, if a &#35;GObject is used to store the
     * <br>subscription ID from g_dbus_connection_signal_subscribe(), a strong reference
     * <br>to that &#35;GObject must be passed to &#64;user_data, and g_object_unref() passed to
     * <br>&#64;user_data_free_func. You are responsible for breaking the resulting
     * <br>reference count cycle by explicitly unsubscribing from the signal when
     * <br>dropping the last external reference to the &#35;GObject. Alternatively, a weak
     * <br>reference may be used.
     * <br>
     * <br>It is guaranteed that if you unsubscribe from a signal using
     * <br>g_dbus_connection_signal_unsubscribe() from the same thread which made the
     * <br>corresponding g_dbus_connection_signal_subscribe() call, &#64;callback will not
     * <br>be invoked after g_dbus_connection_signal_unsubscribe() returns.
     * <br>
     * <br>The returned subscription identifier is an opaque value which is guaranteed
     * <br>to never be zero.
     * <br>
     * <br>This function can never fail.
     * @param sender sender name to match on (unique or well-known name)     or %NULL to listen from all senders
     * @param interface_name D-Bus interface name to match on or %NULL to     match on all interfaces
     * @param member D-Bus signal name to match on or %NULL to match on     all signals
     * @param object_path object path to match on or %NULL to match on     all object paths
     * @param arg0 contents of first string argument to match on or %NULL     to match on all kinds of arguments
     * @param flags &#35;GDBusSignalFlags describing how arg0 is used in subscribing to the     signal
     * @param callback callback to invoke when there is a signal matching the requested data
     * @param user_data user data to pass to &#64;callback
     * @param user_data_free_func function to free &#64;user_data with when     subscription is removed or %NULL
     * @return a subscription identifier that can be used with g_dbus_connection_signal_unsubscribe()
    */
    public int signalSubscribe(String sender, String interface_name, String member, String object_path, String arg0, int flags, OnDBusSignalCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        return JnaDBusConnection.INST().g_dbus_connection_signal_subscribe(asCPointer(), sender, interface_name, member, object_path, arg0, flags, toOnDBusSignalCallback(this, "signalSubscribe", callback), asCPointer(user_data), toOnDestroyNotify(this, "signalSubscribe", user_data_free_func));
    }

    /**
     * Unsubscribes from signals.
     * <br>
     * <br>Note that there may still be D-Bus traffic to process (relating to this
     * <br>signal subscription) in the current thread-default &#35;GMainContext after this
     * <br>function has returned. You should continue to iterate the &#35;GMainContext
     * <br>until the &#35;GDestroyNotify function passed to
     * <br>g_dbus_connection_signal_subscribe() is called, in order to avoid memory
     * <br>leaks through callbacks queued on the &#35;GMainContext after it’s stopped being
     * <br>iterated.
     * <br>Alternatively, any idle source with a priority lower than %G_PRIORITY_DEFAULT
     * <br>that was scheduled after unsubscription, also indicates that all resources
     * <br>of this subscription are released.
     * @param subscription_id a subscription id obtained from     g_dbus_connection_signal_subscribe()
    */
    public void signalUnsubscribe(int subscription_id)  {
        JnaDBusConnection.INST().g_dbus_connection_signal_unsubscribe(asCPointer(), subscription_id);
    }

    /**
     * If &#64;connection was created with
     * <br>%G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING, this method
     * <br>starts processing messages. Does nothing on if &#64;connection wasn't
     * <br>created with this flag or if the method has already been called.
    */
    public void startMessageProcessing()  {
        JnaDBusConnection.INST().g_dbus_connection_start_message_processing(asCPointer());
    }

    /**
     * Reverses the effect of a previous call to
     * <br>g_dbus_connection_export_action_group().
     * <br>
     * <br>It is an error to call this function with an ID that wasn't returned
     * <br>from g_dbus_connection_export_action_group() or to call it with the
     * <br>same ID more than once.
     * @param export_id the ID from g_dbus_connection_export_action_group()
    */
    public void unexportActionGroup(int export_id)  {
        JnaDBusConnection.INST().g_dbus_connection_unexport_action_group(asCPointer(), export_id);
    }

    /**
     * Reverses the effect of a previous call to
     * <br>g_dbus_connection_export_menu_model().
     * <br>
     * <br>It is an error to call this function with an ID that wasn't returned
     * <br>from g_dbus_connection_export_menu_model() or to call it with the
     * <br>same ID more than once.
     * @param export_id the ID from g_dbus_connection_export_menu_model()
    */
    public void unexportMenuModel(int export_id)  {
        JnaDBusConnection.INST().g_dbus_connection_unexport_menu_model(asCPointer(), export_id);
    }

    /**
     * Unregisters an object.
     * @param registration_id a registration id obtained from     g_dbus_connection_register_object()
     * @return %TRUE if the object was unregistered, %FALSE otherwise
    */
    public boolean unregisterObject(int registration_id)  {
        return JnaDBusConnection.INST().g_dbus_connection_unregister_object(asCPointer(), registration_id);
    }

    /**
     * Unregisters a subtree.
     * @param registration_id a subtree registration id obtained from     g_dbus_connection_register_subtree()
     * @return %TRUE if the subtree was unregistered, %FALSE otherwise
    */
    public boolean unregisterSubtree(int registration_id)  {
        return JnaDBusConnection.INST().g_dbus_connection_unregister_subtree(asCPointer(), registration_id);
    }

    public final static String SIGNAL_ON_CLOSED = "closed";
    
    /**
     * Connect to signal "closed".
     * <br>See {@link OnClosed#onClosed} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClosed(OnClosed signal) {
        return connectSignal(SIGNAL_ON_CLOSED, toOnClosed(signal));
    }

    /**
     * Asynchronously sets up a D-Bus connection for exchanging D-Bus messages
     * <br>with the end represented by &#64;stream.
     * <br>
     * <br>If &#64;stream is a &#35;GSocketConnection, then the corresponding &#35;GSocket
     * <br>will be put into non-blocking mode.
     * <br>
     * <br>The D-Bus connection will interact with &#64;stream from a worker thread.
     * <br>As a result, the caller should not interact with &#64;stream after this
     * <br>method has been called, except by calling g_object_unref() on it.
     * <br>
     * <br>If &#64;observer is not %NULL it may be used to control the
     * <br>authentication process.
     * <br>
     * <br>When the operation is finished, &#64;callback will be invoked. You can
     * <br>then call g_dbus_connection_new_finish() to get the result of the
     * <br>operation.
     * <br>
     * <br>This is an asynchronous failable constructor. See
     * <br>g_dbus_connection_new_sync() for the synchronous
     * <br>version.
     * @param stream a &#35;GIOStream
     * @param guid the GUID to use if authenticating as a server or %NULL
     * @param flags flags describing how to make the connection
     * @param observer a &#35;GDBusAuthObserver or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to &#64;callback
    */
    public static void _new(@Nonnull IOStream stream, @Nullable ch.bailu.gtk.type.Str guid, int flags, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_new(asCPointerNotNull(stream), asCPointer(guid), flags, asCPointer(observer), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "_new", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously connects and sets up a D-Bus client connection for
     * <br>exchanging D-Bus messages with an endpoint specified by &#64;address
     * <br>which must be in the
     * <br>[D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses).
     * <br>
     * <br>This constructor can only be used to initiate client-side
     * <br>connections - use g_dbus_connection_new() if you need to act as the
     * <br>server. In particular, &#64;flags cannot contain the
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS or
     * <br>%G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flags.
     * <br>
     * <br>When the operation is finished, &#64;callback will be invoked. You can
     * <br>then call g_dbus_connection_new_for_address_finish() to get the result of
     * <br>the operation.
     * <br>
     * <br>If &#64;observer is not %NULL it may be used to control the
     * <br>authentication process.
     * <br>
     * <br>This is an asynchronous failable constructor. See
     * <br>g_dbus_connection_new_for_address_sync() for the synchronous
     * <br>version.
     * @param address a D-Bus address
     * @param flags flags describing how to make the connection
     * @param observer a &#35;GDBusAuthObserver or %NULL
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to &#64;callback
    */
    public static void newForAddress(@Nonnull ch.bailu.gtk.type.Str address, int flags, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDBusConnection.INST().g_dbus_connection_new_for_address(asCPointerNotNull(address), flags, asCPointer(observer), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newForAddress", callback), asCPointer(user_data));
    }

    /**
     * Implements interface {@link AsyncInitable}. Call this to get access to interface functions.
     * @return {@link AsyncInitable}
    */
    public AsyncInitable asAsyncInitable() {
        return new AsyncInitable(cast());
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaDBusConnection.INST().g_dbus_connection_get_type(); 
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
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]
        [ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDBusCallFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:UnixFDList:{c:GUnixFDList*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GUnixFDList**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:sendMessage:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:DBusMessage:{c:GDBusMessage*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDBusSendMessageFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile guint32*}}:{j:}]

[MethodModel:java-type-not-supported:sendMessageWithReply:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:DBusMessage:{c:GDBusMessage*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDBusSendMessageFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile guint32*}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:sendMessageWithReplySync:[ParameterModel:Supported:{Gg:DBusMessage:{c:GDBusMessage*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:DBusMessage:{c:GDBusMessage*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDBusSendMessageFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile guint32*}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
