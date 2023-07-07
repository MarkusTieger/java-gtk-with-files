/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GSocketService is an object that represents a service that
 * <br>is provided to the network or over local sockets.  When a new
 * <br>connection is made to the service the &#35;GSocketService::incoming
 * <br>signal is emitted.
 * <br>
 * <br>A &#35;GSocketService is a subclass of &#35;GSocketListener and you need
 * <br>to add the addresses you want to accept connections on with the
 * <br>&#35;GSocketListener APIs.
 * <br>
 * <br>There are two options for implementing a network service based on
 * <br>&#35;GSocketService. The first is to create the service using
 * <br>g_socket_service_new() and to connect to the &#35;GSocketService::incoming
 * <br>signal. The second is to subclass &#35;GSocketService and override the
 * <br>default signal handler implementation.
 * <br>
 * <br>In either case, the handler must immediately return, or else it
 * <br>will block additional incoming connections from being serviced.
 * <br>If you are interested in writing connection handlers that contain
 * <br>blocking code then see &#35;GThreadedSocketService.
 * <br>
 * <br>The socket service runs on the main loop of the
 * <br>[thread-default context][g-main-context-push-thread-default-context]
 * <br>of the thread it is created in, and is not
 * <br>threadsafe in general. However, the calls to start and stop the
 * <br>service are thread-safe so these can be used from threads that
 * <br>handle incoming clients.
 * <p><a href="https://docs.gtk.org/gio/class.SocketService.html">https://docs.gtk.org/gio/class.SocketService.html</a></p>
*/
public class SocketService extends SocketListener {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketService.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIncoming {
        /**
         * The ::incoming signal is emitted when a new incoming connection
         * <br>to &#64;service needs to be handled. The handler must initiate the
         * <br>handling of &#64;connection, but may not block; in essence,
         * <br>asynchronous operations must be used.
         * <br>
         * <br>&#64;connection will be unreffed once the signal handler returns,
         * <br>so you need to ref it yourself if you are planning to use it.
         * @param connection a new &#35;GSocketConnection object
         * @param source_object the source_object passed to     g_socket_listener_add_address()
         * @return %TRUE to stop other handlers from being called
        */
        boolean onIncoming(@Nonnull SocketConnection connection, @Nullable ch.bailu.gtk.gobject.Object source_object);
    }
    
    private static com.sun.jna.Callback toOnIncoming(OnIncoming in) {
        return (in == null) ? null: (JnaSocketService.OnIncoming) (__self, _connection, _source_object, __data) -> in.onIncoming(new SocketConnection(new PointerContainer(_connection)), new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)));
    }

    public SocketService(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSocketService with no sockets to listen for.
     * <br>New listeners can be added with e.g. g_socket_listener_add_address()
     * <br>or g_socket_listener_add_inet_port().
     * <br>
     * <br>New services are created active, there is no need to call
     * <br>g_socket_service_start(), unless g_socket_service_stop() has been
     * <br>called before.
    */
    public SocketService() {
        super(cast(JnaSocketService.INST().g_socket_service_new()));
    }

    /**
     * Check whether the service is active or not. An active
     * <br>service will accept new clients that connect, while
     * <br>a non-active service will let connecting clients queue
     * <br>up until the service is started.
     * @return %TRUE if the service is active, %FALSE otherwise
    */
    public boolean isActive()  {
        return JnaSocketService.INST().g_socket_service_is_active(asCPointer());
    }

    /**
     * Restarts the service, i.e. start accepting connections
     * <br>from the added sockets when the mainloop runs. This only needs
     * <br>to be called after the service has been stopped from
     * <br>g_socket_service_stop().
     * <br>
     * <br>This call is thread-safe, so it may be called from a thread
     * <br>handling an incoming client request.
    */
    public void start()  {
        JnaSocketService.INST().g_socket_service_start(asCPointer());
    }

    /**
     * Stops the service, i.e. stops accepting connections
     * <br>from the added sockets when the mainloop runs.
     * <br>
     * <br>This call is thread-safe, so it may be called from a thread
     * <br>handling an incoming client request.
     * <br>
     * <br>Note that this only stops accepting new connections; it does not
     * <br>close the listening sockets, and you can call
     * <br>g_socket_service_start() again later to begin listening again. To
     * <br>close the listening sockets, call g_socket_listener_close(). (This
     * <br>will happen automatically when the &#35;GSocketService is finalized.)
     * <br>
     * <br>This must be called before calling g_socket_listener_close() as
     * <br>the socket service will start accepting connections immediately
     * <br>when a new socket is added.
    */
    public void stop()  {
        JnaSocketService.INST().g_socket_service_stop(asCPointer());
    }

    public final static String SIGNAL_ON_INCOMING = "incoming";
    
    /**
     * Connect to signal "incoming".
     * <br>See {@link OnIncoming#onIncoming} for signal description.
     * <br>Field {@link #SIGNAL_ON_INCOMING} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onIncoming(OnIncoming signal) {
        return connectSignal(SIGNAL_ON_INCOMING, toOnIncoming(signal));
    }

    public static long getTypeID() { 
        return JnaSocketService.INST().g_socket_service_get_type(); 
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
