/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSocketConnection is a &#35;GIOStream for a connected socket. They
 * <br>can be created either by &#35;GSocketClient when connecting to a host,
 * <br>or by &#35;GSocketListener when accepting a new client.
 * <br>
 * <br>The type of the &#35;GSocketConnection object returned from these calls
 * <br>depends on the type of the underlying socket that is in use. For
 * <br>instance, for a TCP/IP connection it will be a &#35;GTcpConnection.
 * <br>
 * <br>Choosing what type of object to construct is done with the socket
 * <br>connection factory, and it is possible for 3rd parties to register
 * <br>custom socket connection types for specific combination of socket
 * <br>family/type/protocol using g_socket_connection_factory_register_type().
 * <br>
 * <br>To close a &#35;GSocketConnection, use g_io_stream_close(). Closing both
 * <br>substreams of the &#35;GIOStream separately will not close the underlying
 * <br>&#35;GSocket.
 * <p><a href="https://docs.gtk.org/gio/class.SocketConnection.html">https://docs.gtk.org/gio/class.SocketConnection.html</a></p>
*/
public class SocketConnection extends IOStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketConnection.class.getCanonicalName());
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
    
    private static JnaSocketConnection.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaSocketConnection.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public SocketConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Connect &#64;connection to the specified remote address.
     * @param address a &#35;GSocketAddress specifying the remote address.
     * @param cancellable a %GCancellable or %NULL
     * @return %TRUE if the connection succeeded, %FALSE on error
    */
    public boolean connect(@Nonnull SocketAddress address, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocketConnection.INST().g_socket_connection_connect(asCPointer(), asCPointerNotNull(address), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously connect &#64;connection to the specified remote address.
     * <br>
     * <br>This clears the &#35;GSocket:blocking flag on &#64;connection's underlying
     * <br>socket if it is currently set.
     * <br>
     * <br>Use g_socket_connection_connect_finish() to retrieve the result.
     * @param address a &#35;GSocketAddress specifying the remote address.
     * @param cancellable a %GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectAsync(@Nonnull SocketAddress address, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketConnection.INST().g_socket_connection_connect_async(asCPointer(), asCPointerNotNull(address), asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectAsync", callback), asCPointer(user_data));
    }

    /**
     * Gets the result of a g_socket_connection_connect_async() call.
     * @param result the &#35;GAsyncResult
     * @return %TRUE if the connection succeeded, %FALSE on error
    */
    public boolean connectFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocketConnection.INST().g_socket_connection_connect_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Try to get the local address of a socket connection.
     * @return a &#35;GSocketAddress or %NULL on error.     Free the returned object with g_object_unref().
    */
    public SocketAddress getLocalAddress() throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketAddress(new PointerContainer(JnaSocketConnection.INST().g_socket_connection_get_local_address(asCPointer(), 0L)));
    }

    /**
     * Try to get the remote address of a socket connection.
     * <br>
     * <br>Since GLib 2.40, when used with g_socket_client_connect() or
     * <br>g_socket_client_connect_async(), during emission of
     * <br>%G_SOCKET_CLIENT_CONNECTING, this function will return the remote
     * <br>address that will be used for the connection.  This allows
     * <br>applications to print e.g. &quot;Connecting to example.com
     * <br>(10.42.77.3)...&quot;.
     * @return a &#35;GSocketAddress or %NULL on error.     Free the returned object with g_object_unref().
    */
    public SocketAddress getRemoteAddress() throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketAddress(new PointerContainer(JnaSocketConnection.INST().g_socket_connection_get_remote_address(asCPointer(), 0L)));
    }

    /**
     * Gets the underlying &#35;GSocket object of the connection.
     * <br>This can be useful if you want to do something unusual on it
     * <br>not supported by the &#35;GSocketConnection APIs.
     * @return a &#35;GSocket or %NULL on error.
    */
    public Socket getSocket()  {
        return new Socket(new PointerContainer(JnaSocketConnection.INST().g_socket_connection_get_socket(asCPointer())));
    }

    /**
     * Checks if &#64;connection is connected. This is equivalent to calling
     * <br>g_socket_is_connected() on &#64;connection's underlying &#35;GSocket.
     * @return whether &#64;connection is connected
    */
    public boolean isConnected()  {
        return JnaSocketConnection.INST().g_socket_connection_is_connected(asCPointer());
    }

    /**
     * Looks up the &#35;GType to be used when creating socket connections on
     * <br>sockets with the specified &#64;family, &#64;type and &#64;protocol_id.
     * <br>
     * <br>If no type is registered, the &#35;GSocketConnection base type is returned.
     * @param family a &#35;GSocketFamily
     * @param type a &#35;GSocketType
     * @param protocol_id a protocol id
     * @return a &#35;GType
    */
    public static long factoryLookupType(int family, int type, int protocol_id)  {
        return JnaSocketConnection.INST().g_socket_connection_factory_lookup_type(family, type, protocol_id);
    }

    /**
     * Looks up the &#35;GType to be used when creating socket connections on
     * <br>sockets with the specified &#64;family, &#64;type and &#64;protocol.
     * <br>
     * <br>If no type is registered, the &#35;GSocketConnection base type is returned.
     * @param g_type a &#35;GType, inheriting from %G_TYPE_SOCKET_CONNECTION
     * @param family a &#35;GSocketFamily
     * @param type a &#35;GSocketType
     * @param protocol a protocol id
    */
    public static void factoryRegisterType(long g_type, int family, int type, int protocol)  {
        JnaSocketConnection.INST().g_socket_connection_factory_register_type(g_type, family, type, protocol);
    }

    public static long getTypeID() { 
        return JnaSocketConnection.INST().g_socket_connection_get_type(); 
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
