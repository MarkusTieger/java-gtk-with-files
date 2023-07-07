/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GSocketListener is an object that keeps track of a set
 * <br>of server sockets and helps you accept sockets from any of the
 * <br>socket, either sync or async.
 * <br>
 * <br>Add addresses and ports to listen on using g_socket_listener_add_address()
 * <br>and g_socket_listener_add_inet_port(). These will be listened on until
 * <br>g_socket_listener_close() is called. Dropping your final reference to the
 * <br>&#35;GSocketListener will not cause g_socket_listener_close() to be called
 * <br>implicitly, as some references to the &#35;GSocketListener may be held
 * <br>internally.
 * <br>
 * <br>If you want to implement a network server, also look at &#35;GSocketService
 * <br>and &#35;GThreadedSocketService which are subclasses of &#35;GSocketListener
 * <br>that make this even easier.
 * <p><a href="https://docs.gtk.org/gio/class.SocketListener.html">https://docs.gtk.org/gio/class.SocketListener.html</a></p>
*/
public class SocketListener extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketListener.class.getCanonicalName());
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
    
    private static JnaSocketListener.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaSocketListener.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEvent {
        /**
         * Emitted when &#64;listener's activity on &#64;socket changes state.
         * <br>Note that when &#64;listener is used to listen on both IPv4 and
         * <br>IPv6, a separate set of signals will be emitted for each, and
         * <br>the order they happen in is undefined.
         * @param event the event that is occurring
         * @param socket the &#35;GSocket the event is occurring on
        */
        void onEvent(int event, @Nonnull Socket socket);
    }
    
    private static com.sun.jna.Callback toOnEvent(OnEvent in) {
        return (in == null) ? null: (JnaSocketListener.OnEvent) (__self, _event, _socket, __data) -> in.onEvent(_event, new Socket(new PointerContainer(_socket)));
    }

    public SocketListener(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSocketListener with no sockets to listen for.
     * <br>New listeners can be added with e.g. g_socket_listener_add_address()
     * <br>or g_socket_listener_add_inet_port().
    */
    public SocketListener() {
        super(cast(JnaSocketListener.INST().g_socket_listener_new()));
    }

    /**
     * This is the asynchronous version of g_socket_listener_accept().
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_socket_listener_accept_finish()
     * <br>to get the result of the operation.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void acceptAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketListener.INST().g_socket_listener_accept_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "acceptAsync", callback), asCPointer(user_data));
    }

    /**
     * This is the asynchronous version of g_socket_listener_accept_socket().
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_socket_listener_accept_socket_finish()
     * <br>to get the result of the operation.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void acceptSocketAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketListener.INST().g_socket_listener_accept_socket_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "acceptSocketAsync", callback), asCPointer(user_data));
    }

    /**
     * Listens for TCP connections on any available port number for both
     * <br>IPv6 and IPv4 (if each is available).
     * <br>
     * <br>This is useful if you need to have a socket for incoming connections
     * <br>but don't care about the specific port number.
     * <br>
     * <br>&#64;source_object will be passed out in the various calls
     * <br>to accept to identify this particular source, which is
     * <br>useful if you're listening on multiple addresses and do
     * <br>different things depending on what address is connected to.
     * @param source_object Optional &#35;GObject identifying this source
     * @return the port number, or 0 in case of failure.
    */
    public int addAnyInetPort(@Nullable ch.bailu.gtk.gobject.Object source_object) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocketListener.INST().g_socket_listener_add_any_inet_port(asCPointer(), asCPointer(source_object), 0L);
    }

    /**
     * Helper function for g_socket_listener_add_address() that
     * <br>creates a TCP/IP socket listening on IPv4 and IPv6 (if
     * <br>supported) on the specified port on all interfaces.
     * <br>
     * <br>&#64;source_object will be passed out in the various calls
     * <br>to accept to identify this particular source, which is
     * <br>useful if you're listening on multiple addresses and do
     * <br>different things depending on what address is connected to.
     * <br>
     * <br>Call g_socket_listener_close() to stop listening on &#64;port; this will not
     * <br>be done automatically when you drop your final reference to &#64;listener, as
     * <br>references may be held internally.
     * @param port an IP port number (non-zero)
     * @param source_object Optional &#35;GObject identifying this source
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean addInetPort(int port, @Nullable ch.bailu.gtk.gobject.Object source_object) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocketListener.INST().g_socket_listener_add_inet_port(asCPointer(), port, asCPointer(source_object), 0L);
    }

    /**
     * Adds &#64;socket to the set of sockets that we try to accept
     * <br>new clients from. The socket must be bound to a local
     * <br>address and listened to.
     * <br>
     * <br>&#64;source_object will be passed out in the various calls
     * <br>to accept to identify this particular source, which is
     * <br>useful if you're listening on multiple addresses and do
     * <br>different things depending on what address is connected to.
     * <br>
     * <br>The &#64;socket will not be automatically closed when the &#64;listener is finalized
     * <br>unless the listener held the final reference to the socket. Before GLib 2.42,
     * <br>the &#64;socket was automatically closed on finalization of the &#64;listener, even
     * <br>if references to it were held elsewhere.
     * @param socket a listening &#35;GSocket
     * @param source_object Optional &#35;GObject identifying this source
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean addSocket(@Nonnull Socket socket, @Nullable ch.bailu.gtk.gobject.Object source_object) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocketListener.INST().g_socket_listener_add_socket(asCPointer(), asCPointerNotNull(socket), asCPointer(source_object), 0L);
    }

    /**
     * Closes all the sockets in the listener.
    */
    public void close()  {
        JnaSocketListener.INST().g_socket_listener_close(asCPointer());
    }

    /**
     * Sets the listen backlog on the sockets in the listener. This must be called
     * <br>before adding any sockets, addresses or ports to the &#35;GSocketListener (for
     * <br>example, by calling g_socket_listener_add_inet_port()) to be effective.
     * <br>
     * <br>See g_socket_set_listen_backlog() for details
     * @param listen_backlog an integer
    */
    public void setBacklog(int listen_backlog)  {
        JnaSocketListener.INST().g_socket_listener_set_backlog(asCPointer(), listen_backlog);
    }

    public final static String SIGNAL_ON_EVENT = "event";
    
    /**
     * Connect to signal "event".
     * <br>See {@link OnEvent#onEvent} for signal description.
     * <br>Field {@link #SIGNAL_ON_EVENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEvent(OnEvent signal) {
        return connectSignal(SIGNAL_ON_EVENT, toOnEvent(signal));
    }

    public static long getTypeID() { 
        return JnaSocketListener.INST().g_socket_listener_get_type(); 
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

[MethodModel:java-type-not-supported:accept:[ParameterModel:Supported:{Gg:SocketConnection:{c:GSocketConnection*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GObject**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:acceptFinish:[ParameterModel:Supported:{Gg:SocketConnection:{c:GSocketConnection*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GObject**}}:{j:}]

[MethodModel:java-type-not-supported:acceptSocket:[ParameterModel:Supported:{Gg:Socket:{c:GSocket*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GObject**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:acceptSocketFinish:[ParameterModel:Supported:{Gg:Socket:{c:GSocket*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GObject**}}:{j:}]

[MethodModel:java-type-not-supported:addAddress:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:SocketAddress:{c:GSocketAddress*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSocketType}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GSocketProtocol}}:{j:int}]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GSocketAddress**}}:{j:}]
*/
