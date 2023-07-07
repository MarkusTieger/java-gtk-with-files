/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GThreadedSocketService is a simple subclass of &#35;GSocketService
 * <br>that handles incoming connections by creating a worker thread and
 * <br>dispatching the connection to it by emitting the
 * <br>&#35;GThreadedSocketService::run signal in the new thread.
 * <br>
 * <br>The signal handler may perform blocking IO and need not return
 * <br>until the connection is closed.
 * <br>
 * <br>The service is implemented using a thread pool, so there is a
 * <br>limited amount of threads available to serve incoming requests.
 * <br>The service automatically stops the &#35;GSocketService from accepting
 * <br>new connections when all threads are busy.
 * <br>
 * <br>As with &#35;GSocketService, you may connect to &#35;GThreadedSocketService::run,
 * <br>or subclass and override the default handler.
 * <p><a href="https://docs.gtk.org/gio/class.ThreadedSocketService.html">https://docs.gtk.org/gio/class.ThreadedSocketService.html</a></p>
*/
public class ThreadedSocketService extends SocketService {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ThreadedSocketService.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRun {
        /**
         * The ::run signal is emitted in a worker thread in response to an
         * <br>incoming connection. This thread is dedicated to handling
         * <br>&#64;connection and may perform blocking IO. The signal handler need
         * <br>not return until the connection is closed.
         * @param connection a new &#35;GSocketConnection object.
         * @param source_object the source_object passed to g_socket_listener_add_address().
         * @return %TRUE to stop further signal handlers from being called
        */
        boolean onRun(@Nonnull SocketConnection connection, @Nullable ch.bailu.gtk.gobject.Object source_object);
    }
    
    private static com.sun.jna.Callback toOnRun(OnRun in) {
        return (in == null) ? null: (JnaThreadedSocketService.OnRun) (__self, _connection, _source_object, __data) -> in.onRun(new SocketConnection(new PointerContainer(_connection)), new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)));
    }

    public ThreadedSocketService(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GThreadedSocketService with no listeners. Listeners
     * <br>must be added with one of the &#35;GSocketListener &quot;add&quot; methods.
     * @param max_threads the maximal number of threads to execute concurrently   handling incoming clients, -1 means no limit
    */
    public ThreadedSocketService(int max_threads) {
        super(cast(JnaThreadedSocketService.INST().g_threaded_socket_service_new(max_threads)));
    }

    public final static String SIGNAL_ON_RUN = "run";
    
    /**
     * Connect to signal "run".
     * <br>See {@link OnRun#onRun} for signal description.
     * <br>Field {@link #SIGNAL_ON_RUN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRun(OnRun signal) {
        return connectSignal(SIGNAL_ON_RUN, toOnRun(signal));
    }

    public static long getTypeID() { 
        return JnaThreadedSocketService.INST().g_threaded_socket_service_get_type(); 
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
