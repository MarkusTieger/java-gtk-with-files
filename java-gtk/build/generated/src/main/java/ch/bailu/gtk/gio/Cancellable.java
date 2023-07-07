/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * GCancellable is a thread-safe operation cancellation stack used
 * <br>throughout GIO to allow for cancellation of synchronous and
 * <br>asynchronous operations.
 * <p><a href="https://docs.gtk.org/gio/class.Cancellable.html">https://docs.gtk.org/gio/class.Cancellable.html</a></p>
*/
public class Cancellable extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Cancellable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCallback {
        /**
         * The type used for callback functions in structure definitions and function
         * <br>signatures.
         * <br>
         * <br>This doesn't mean that all callback functions must take no  parameters and
         * <br>return void. The required signature of a callback function is determined by
         * <br>the context in which is used (e.g. the signal to which it is connected).
         * <br>
         * <br>Use G_CALLBACK() to cast the callback function to a &#35;GCallback.
        */
        void onCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaCancellable.OnCallback toOnCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCallback in) {
        JnaCancellable.OnCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onCallback(__callback);
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
    
    private static JnaCancellable.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaCancellable.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCancelled {
        /**
         * Emitted when the operation has been cancelled.
         * <br>
         * <br>Can be used by implementations of cancellable operations. If the
         * <br>operation is cancelled from another thread, the signal will be
         * <br>emitted in the thread that cancelled the operation, not the
         * <br>thread that is running the operation.
         * <br>
         * <br>Note that disconnecting from this signal (or any signal) in a
         * <br>multi-threaded program is prone to race conditions. For instance
         * <br>it is possible that a signal handler may be invoked even after
         * <br>a call to g_signal_handler_disconnect() for that handler has
         * <br>already returned.
         * <br>
         * <br>There is also a problem when cancellation happens right before
         * <br>connecting to the signal. If this happens the signal will
         * <br>unexpectedly not be emitted, and checking before connecting to
         * <br>the signal leaves a race condition where this is still happening.
         * <br>
         * <br>In order to make it safe and easy to connect handlers there
         * <br>are two helper functions: g_cancellable_connect() and
         * <br>g_cancellable_disconnect() which protect against problems
         * <br>like this.
         * <br>
         * <br>An example of how to us this:
         * <pre>&lt;!-- language=&quot;C&quot; --&gt;
         *     // Make sure we don't do unnecessary work if already cancelled
         *     if (g_cancellable_set_error_if_cancelled (cancellable, error))
         *       return;
         * 
         *     // Set up all the data needed to be able to handle cancellation
         *     // of the operation
         *     my_data = my_data_new (...);
         * 
         *     id = 0;
         *     if (cancellable)
         *       id = g_cancellable_connect (cancellable,
         *     			      G_CALLBACK (cancelled_handler)
         *     			      data, NULL);
         * 
         *     // cancellable operation here...
         * 
         *     g_cancellable_disconnect (cancellable, id);
         * 
         *     // cancelled_handler is never called after this, it is now safe
         *     // to free the data
         *     my_data_free (my_data);
         * </pre>
         * <br>
         * <br>Note that the cancelled signal is emitted in the thread that
         * <br>the user cancelled from, which may be the main thread. So, the
         * <br>cancellable signal should not do something that can block.
        */
        void onCancelled();
    }
    
    private static com.sun.jna.Callback toOnCancelled(OnCancelled in) {
        return (in == null) ? null: (JnaCancellable.OnCancelled) (__self, __data) -> in.onCancelled();
    }

    public Cancellable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GCancellable object.
     * <br>
     * <br>Applications that want to start one or more operations
     * <br>that should be cancellable should create a &#35;GCancellable
     * <br>and pass it to the operations.
     * <br>
     * <br>One &#35;GCancellable can be used in multiple consecutive
     * <br>operations or in multiple concurrent operations.
    */
    public Cancellable() {
        super(cast(JnaCancellable.INST().g_cancellable_new()));
    }

    /**
     * Will set &#64;cancellable to cancelled, and will emit the
     * <br>&#35;GCancellable::cancelled signal. (However, see the warning about
     * <br>race conditions in the documentation for that signal if you are
     * <br>planning to connect to it.)
     * <br>
     * <br>This function is thread-safe. In other words, you can safely call
     * <br>it from a thread other than the one running the operation that was
     * <br>passed the &#64;cancellable.
     * <br>
     * <br>If &#64;cancellable is %NULL, this function returns immediately for convenience.
     * <br>
     * <br>The convention within GIO is that cancelling an asynchronous
     * <br>operation causes it to complete asynchronously. That is, if you
     * <br>cancel the operation from the same thread in which it is running,
     * <br>then the operation's &#35;GAsyncReadyCallback will not be invoked until
     * <br>the application returns to the main loop.
    */
    public void cancel()  {
        JnaCancellable.INST().g_cancellable_cancel(asCPointer());
    }

    /**
     * Convenience function to connect to the &#35;GCancellable::cancelled
     * <br>signal. Also handles the race condition that may happen
     * <br>if the cancellable is cancelled right before connecting.
     * <br>
     * <br>&#64;callback is called at most once, either directly at the
     * <br>time of the connect if &#64;cancellable is already cancelled,
     * <br>or when &#64;cancellable is cancelled in some thread.
     * <br>
     * <br>&#64;data_destroy_func will be called when the handler is
     * <br>disconnected, or immediately if the cancellable is already
     * <br>cancelled.
     * <br>
     * <br>See &#35;GCancellable::cancelled for details on how to use this.
     * <br>
     * <br>Since GLib 2.40, the lock protecting &#64;cancellable is not held when
     * <br>&#64;callback is invoked.  This lifts a restriction in place for
     * <br>earlier GLib versions which now makes it easier to write cleanup
     * <br>code that unconditionally invokes e.g. g_cancellable_cancel().
     * @param callback The &#35;GCallback to connect.
     * @param data Data to pass to &#64;callback.
     * @param data_destroy_func Free function for &#64;data or %NULL.
     * @return The id of the signal handler or 0 if &#64;cancellable has already          been cancelled.
    */
    public long connect(OnCallback callback, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify data_destroy_func)  {
        return JnaCancellable.INST().g_cancellable_connect(asCPointer(), toOnCallback(this, "connect", callback), asCPointer(data), toOnDestroyNotify(this, "connect", data_destroy_func));
    }

    /**
     * Disconnects a handler from a cancellable instance similar to
     * <br>g_signal_handler_disconnect().  Additionally, in the event that a
     * <br>signal handler is currently running, this call will block until the
     * <br>handler has finished.  Calling this function from a
     * <br>&#35;GCancellable::cancelled signal handler will therefore result in a
     * <br>deadlock.
     * <br>
     * <br>This avoids a race condition where a thread cancels at the
     * <br>same time as the cancellable operation is finished and the
     * <br>signal handler is removed. See &#35;GCancellable::cancelled for
     * <br>details on how to use this.
     * <br>
     * <br>If &#64;cancellable is %NULL or &#64;handler_id is `0` this function does
     * <br>nothing.
     * @param handler_id Handler id of the handler to be disconnected, or `0`.
    */
    public void disconnect(long handler_id)  {
        JnaCancellable.INST().g_cancellable_disconnect(asCPointer(), handler_id);
    }

    /**
     * Gets the file descriptor for a cancellable job. This can be used to
     * <br>implement cancellable operations on Unix systems. The returned fd will
     * <br>turn readable when &#64;cancellable is cancelled.
     * <br>
     * <br>You are not supposed to read from the fd yourself, just check for
     * <br>readable status. Reading to unset the readable status is done
     * <br>with g_cancellable_reset().
     * <br>
     * <br>After a successful return from this function, you should use
     * <br>g_cancellable_release_fd() to free up resources allocated for
     * <br>the returned file descriptor.
     * <br>
     * <br>See also g_cancellable_make_pollfd().
     * @return A valid file descriptor. `-1` if the file descriptor is not supported, or on errors.
    */
    public int getFd()  {
        return JnaCancellable.INST().g_cancellable_get_fd(asCPointer());
    }

    /**
     * Checks if a cancellable job has been cancelled.
     * @return %TRUE if &#64;cancellable is cancelled, FALSE if called with %NULL or if item is not cancelled.
    */
    public boolean isCancelled()  {
        return JnaCancellable.INST().g_cancellable_is_cancelled(asCPointer());
    }

    /**
     * Creates a &#35;GPollFD corresponding to &#64;cancellable; this can be passed
     * <br>to g_poll() and used to poll for cancellation. This is useful both
     * <br>for unix systems without a native poll and for portability to
     * <br>windows.
     * <br>
     * <br>When this function returns %TRUE, you should use
     * <br>g_cancellable_release_fd() to free up resources allocated for the
     * <br>&#64;pollfd. After a %FALSE return, do not call g_cancellable_release_fd().
     * <br>
     * <br>If this function returns %FALSE, either no &#64;cancellable was given or
     * <br>resource limits prevent this function from allocating the necessary
     * <br>structures for polling. (On Linux, you will likely have reached
     * <br>the maximum number of file descriptors.) The suggested way to handle
     * <br>these cases is to ignore the &#64;cancellable.
     * <br>
     * <br>You are not supposed to read from the fd yourself, just check for
     * <br>readable status. Reading to unset the readable status is done
     * <br>with g_cancellable_reset().
     * @param pollfd a pointer to a &#35;GPollFD
     * @return %TRUE if &#64;pollfd was successfully initialized, %FALSE on          failure to prepare the cancellable.
    */
    public boolean makePollfd(@Nonnull ch.bailu.gtk.glib.PollFD pollfd)  {
        return JnaCancellable.INST().g_cancellable_make_pollfd(asCPointer(), asCPointerNotNull(pollfd));
    }

    /**
     * Pops &#64;cancellable off the cancellable stack (verifying that &#64;cancellable
     * <br>is on the top of the stack).
    */
    public void popCurrent()  {
        JnaCancellable.INST().g_cancellable_pop_current(asCPointer());
    }

    /**
     * Pushes &#64;cancellable onto the cancellable stack. The current
     * <br>cancellable can then be received using g_cancellable_get_current().
     * <br>
     * <br>This is useful when implementing cancellable operations in
     * <br>code that does not allow you to pass down the cancellable object.
     * <br>
     * <br>This is typically called automatically by e.g. &#35;GFile operations,
     * <br>so you rarely have to call this yourself.
    */
    public void pushCurrent()  {
        JnaCancellable.INST().g_cancellable_push_current(asCPointer());
    }

    /**
     * Releases a resources previously allocated by g_cancellable_get_fd()
     * <br>or g_cancellable_make_pollfd().
     * <br>
     * <br>For compatibility reasons with older releases, calling this function
     * <br>is not strictly required, the resources will be automatically freed
     * <br>when the &#64;cancellable is finalized. However, the &#64;cancellable will
     * <br>block scarce file descriptors until it is finalized if this function
     * <br>is not called. This can cause the application to run out of file
     * <br>descriptors when many &#35;GCancellables are used at the same time.
    */
    public void releaseFd()  {
        JnaCancellable.INST().g_cancellable_release_fd(asCPointer());
    }

    /**
     * Resets &#64;cancellable to its uncancelled state.
     * <br>
     * <br>If cancellable is currently in use by any cancellable operation
     * <br>then the behavior of this function is undefined.
     * <br>
     * <br>Note that it is generally not a good idea to reuse an existing
     * <br>cancellable for more operations after it has been cancelled once,
     * <br>as this function might tempt you to do. The recommended practice
     * <br>is to drop the reference to a cancellable after cancelling it,
     * <br>and let it die with the outstanding async operations. You should
     * <br>create a fresh cancellable for further async operations.
    */
    public void reset()  {
        JnaCancellable.INST().g_cancellable_reset(asCPointer());
    }

    /**
     * If the &#64;cancellable is cancelled, sets the error to notify
     * <br>that the operation was cancelled.
     * @return %TRUE if &#64;cancellable was cancelled, %FALSE if it was not
    */
    public boolean setErrorIfCancelled() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaCancellable.INST().g_cancellable_set_error_if_cancelled(asCPointer(), 0L);
    }

    /**
     * Creates a source that triggers if &#64;cancellable is cancelled and
     * <br>calls its callback of type &#35;GCancellableSourceFunc. This is
     * <br>primarily useful for attaching to another (non-cancellable) source
     * <br>with g_source_add_child_source() to add cancellability to it.
     * <br>
     * <br>For convenience, you can call this with a %NULL &#35;GCancellable,
     * <br>in which case the source will never trigger.
     * <br>
     * <br>The new &#35;GSource will hold a reference to the &#35;GCancellable.
     * @return the new &#35;GSource.
    */
    public ch.bailu.gtk.glib.Source sourceNew()  {
        return new ch.bailu.gtk.glib.Source(new PointerContainer(JnaCancellable.INST().g_cancellable_source_new(asCPointer())));
    }

    public final static String SIGNAL_ON_CANCELLED = "cancelled";
    
    /**
     * Connect to signal "cancelled".
     * <br>See {@link OnCancelled#onCancelled} for signal description.
     * <br>Field {@link #SIGNAL_ON_CANCELLED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCancelled(OnCancelled signal) {
        return connectSignal(SIGNAL_ON_CANCELLED, toOnCancelled(signal));
    }

    /**
     * Gets the top cancellable from the stack.
     * @return a &#35;GCancellable from the top of the stack, or %NULL if the stack is empty.
    */
    public static Cancellable getCurrent()  {
        return new Cancellable(new PointerContainer(JnaCancellable.INST().g_cancellable_get_current()));
    }

    public static long getTypeID() { 
        return JnaCancellable.INST().g_cancellable_get_type(); 
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
