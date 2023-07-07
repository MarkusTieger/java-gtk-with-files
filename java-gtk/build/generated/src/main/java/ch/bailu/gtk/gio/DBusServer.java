/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDBusServer is a helper for listening to and accepting D-Bus
 * <br>connections. This can be used to create a new D-Bus server, allowing two
 * <br>peers to use the D-Bus protocol for their own specialized communication.
 * <br>A server instance provided in this way will not perform message routing or
 * <br>implement the org.freedesktop.DBus interface.
 * <br>
 * <br>To just export an object on a well-known name on a message bus, such as the
 * <br>session or system bus, you should instead use g_bus_own_name().
 * <br>
 * <br>An example of peer-to-peer communication with GDBus can be found
 * <br>in [gdbus-example-peer.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-peer.c).
 * <br>
 * <br>Note that a minimal &#35;GDBusServer will accept connections from any
 * <br>peer. In many use-cases it will be necessary to add a &#35;GDBusAuthObserver
 * <br>that only accepts connections that have successfully authenticated
 * <br>as the same user that is running the &#35;GDBusServer. Since GLib 2.68 this can
 * <br>be achieved more simply by passing the
 * <br>%G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flag to the server.
 * <p><a href="https://docs.gtk.org/gio/class.DBusServer.html">https://docs.gtk.org/gio/class.DBusServer.html</a></p>
*/
public class DBusServer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusServer.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnNewConnection {
        /**
         * Emitted when a new authenticated connection has been made. Use
         * <br>g_dbus_connection_get_peer_credentials() to figure out what
         * <br>identity (if any), was authenticated.
         * <br>
         * <br>If you want to accept the connection, take a reference to the
         * <br>&#64;connection object and return %TRUE. When you are done with the
         * <br>connection call g_dbus_connection_close() and give up your
         * <br>reference. Note that the other peer may disconnect at any time -
         * <br>a typical thing to do when accepting a connection is to listen to
         * <br>the &#35;GDBusConnection::closed signal.
         * <br>
         * <br>If &#35;GDBusServer:flags contains %G_DBUS_SERVER_FLAGS_RUN_IN_THREAD
         * <br>then the signal is emitted in a new thread dedicated to the
         * <br>connection. Otherwise the signal is emitted in the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>of the thread that &#64;server was constructed in.
         * <br>
         * <br>You are guaranteed that signal handlers for this signal runs
         * <br>before incoming messages on &#64;connection are processed. This means
         * <br>that it's suitable to call g_dbus_connection_register_object() or
         * <br>similar from the signal handler.
         * @param connection A &#35;GDBusConnection for the new connection.
         * @return %TRUE to claim &#64;connection, %FALSE to let other handlers run.
        */
        boolean onNewConnection(@Nonnull DBusConnection connection);
    }
    
    private static com.sun.jna.Callback toOnNewConnection(OnNewConnection in) {
        return (in == null) ? null: (JnaDBusServer.OnNewConnection) (__self, _connection, __data) -> in.onNewConnection(new DBusConnection(new PointerContainer(_connection)));
    }

    public DBusServer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new D-Bus server that listens on the first address in
     * <br>&#64;address that works.
     * <br>
     * <br>Once constructed, you can use g_dbus_server_get_client_address() to
     * <br>get a D-Bus address string that clients can use to connect.
     * <br>
     * <br>To have control over the available authentication mechanisms and
     * <br>the users that are authorized to connect, it is strongly recommended
     * <br>to provide a non-%NULL &#35;GDBusAuthObserver.
     * <br>
     * <br>Connect to the &#35;GDBusServer::new-connection signal to handle
     * <br>incoming connections.
     * <br>
     * <br>The returned &#35;GDBusServer isn't active - you have to start it with
     * <br>g_dbus_server_start().
     * <br>
     * <br>&#35;GDBusServer is used in this [example][gdbus-peer-to-peer].
     * <br>
     * <br>This is a synchronous failable constructor. There is currently no
     * <br>asynchronous version.
     * @param address A D-Bus address.
     * @param flags Flags from the &#35;GDBusServerFlags enumeration.
     * @param guid A D-Bus GUID.
     * @param observer A &#35;GDBusAuthObserver or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return A &#35;GDBusServer or %NULL if &#64;error is set. Free with g_object_unref().
    */
    public static DBusServer newSyncDBusServer(@Nonnull ch.bailu.gtk.type.Str address, int flags, @Nonnull ch.bailu.gtk.type.Str guid, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusServer.INST().g_dbus_server_new_sync(asCPointerNotNull(address), flags, asCPointerNotNull(guid), asCPointer(observer), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusServer:newSync");
        }
        return new DBusServer(__self);
    }        
    

    /**
     * Creates a new D-Bus server that listens on the first address in
     * <br>&#64;address that works.
     * <br>
     * <br>Once constructed, you can use g_dbus_server_get_client_address() to
     * <br>get a D-Bus address string that clients can use to connect.
     * <br>
     * <br>To have control over the available authentication mechanisms and
     * <br>the users that are authorized to connect, it is strongly recommended
     * <br>to provide a non-%NULL &#35;GDBusAuthObserver.
     * <br>
     * <br>Connect to the &#35;GDBusServer::new-connection signal to handle
     * <br>incoming connections.
     * <br>
     * <br>The returned &#35;GDBusServer isn't active - you have to start it with
     * <br>g_dbus_server_start().
     * <br>
     * <br>&#35;GDBusServer is used in this [example][gdbus-peer-to-peer].
     * <br>
     * <br>This is a synchronous failable constructor. There is currently no
     * <br>asynchronous version.
     * @param address A D-Bus address.
     * @param flags Flags from the &#35;GDBusServerFlags enumeration.
     * @param guid A D-Bus GUID.
     * @param observer A &#35;GDBusAuthObserver or %NULL.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return A &#35;GDBusServer or %NULL if &#64;error is set. Free with g_object_unref().
    */
    public static DBusServer newSyncDBusServer(String address, int flags, String guid, @Nullable DBusAuthObserver observer, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusServer.INST().g_dbus_server_new_sync(address, flags, guid, asCPointer(observer), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusServer:newSync");
        }
        return new DBusServer(__self);
    }        
    

    /**
     * Gets a
     * <br>[D-Bus address](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses)
     * <br>string that can be used by clients to connect to &#64;server.
     * <br>
     * <br>This is valid and non-empty if initializing the &#35;GDBusServer succeeded.
     * @return A D-Bus address string. Do not free, the string is owned by &#64;server.
    */
    public ch.bailu.gtk.type.Str getClientAddress()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusServer.INST().g_dbus_server_get_client_address(asCPointer())));
    }

    /**
     * Gets the flags for &#64;server.
     * @return A set of flags from the &#35;GDBusServerFlags enumeration.
    */
    public int getFlags()  {
        return JnaDBusServer.INST().g_dbus_server_get_flags(asCPointer());
    }

    /**
     * Gets the GUID for &#64;server, as provided to g_dbus_server_new_sync().
     * @return A D-Bus GUID. Do not free this string, it is owned by &#64;server.
    */
    public ch.bailu.gtk.type.Str getGuid()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusServer.INST().g_dbus_server_get_guid(asCPointer())));
    }

    /**
     * Gets whether &#64;server is active.
     * @return %TRUE if server is active, %FALSE otherwise.
    */
    public boolean isActive()  {
        return JnaDBusServer.INST().g_dbus_server_is_active(asCPointer());
    }

    /**
     * Starts &#64;server.
    */
    public void start()  {
        JnaDBusServer.INST().g_dbus_server_start(asCPointer());
    }

    /**
     * Stops &#64;server.
    */
    public void stop()  {
        JnaDBusServer.INST().g_dbus_server_stop(asCPointer());
    }

    public final static String SIGNAL_ON_NEW_CONNECTION = "new-connection";
    
    /**
     * Connect to signal "new-connection".
     * <br>See {@link OnNewConnection#onNewConnection} for signal description.
     * <br>Field {@link #SIGNAL_ON_NEW_CONNECTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNewConnection(OnNewConnection signal) {
        return connectSignal(SIGNAL_ON_NEW_CONNECTION, toOnNewConnection(signal));
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaDBusServer.INST().g_dbus_server_get_type(); 
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
