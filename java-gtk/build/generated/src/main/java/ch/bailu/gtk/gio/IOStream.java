/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * GIOStream represents an object that has both read and write streams.
 * <br>Generally the two streams act as separate input and output streams,
 * <br>but they share some common resources and state. For instance, for
 * <br>seekable streams, both streams may use the same position.
 * <br>
 * <br>Examples of &#35;GIOStream objects are &#35;GSocketConnection, which represents
 * <br>a two-way network connection; and &#35;GFileIOStream, which represents a
 * <br>file handle opened in read-write mode.
 * <br>
 * <br>To do the actual reading and writing you need to get the substreams
 * <br>with g_io_stream_get_input_stream() and g_io_stream_get_output_stream().
 * <br>
 * <br>The &#35;GIOStream object owns the input and the output streams, not the other
 * <br>way around, so keeping the substreams alive will not keep the &#35;GIOStream
 * <br>object alive. If the &#35;GIOStream object is freed it will be closed, thus
 * <br>closing the substreams, so even if the substreams stay alive they will
 * <br>always return %G_IO_ERROR_CLOSED for all operations.
 * <br>
 * <br>To close a stream use g_io_stream_close() which will close the common
 * <br>stream object and also the individual substreams. You can also close
 * <br>the substreams themselves. In most cases this only marks the
 * <br>substream as closed, so further I/O on it fails but common state in the
 * <br>&#35;GIOStream may still be open. However, some streams may support
 * <br>&quot;half-closed&quot; states where one direction of the stream is actually shut down.
 * <br>
 * <br>Operations on &#35;GIOStreams cannot be started while another operation on the
 * <br>&#35;GIOStream or its substreams is in progress. Specifically, an application can
 * <br>read from the &#35;GInputStream and write to the &#35;GOutputStream simultaneously
 * <br>(either in separate threads, or as asynchronous operations in the same
 * <br>thread), but an application cannot start any &#35;GIOStream operation while there
 * <br>is a &#35;GIOStream, &#35;GInputStream or &#35;GOutputStream operation in progress, and
 * <br>an application can’t start any &#35;GInputStream or &#35;GOutputStream operation
 * <br>while there is a &#35;GIOStream operation in progress.
 * <br>
 * <br>This is a product of individual stream operations being associated with a
 * <br>given &#35;GMainContext (the thread-default context at the time the operation was
 * <br>started), rather than entire streams being associated with a single
 * <br>&#35;GMainContext.
 * <br>
 * <br>GIO may run operations on &#35;GIOStreams from other (worker) threads, and this
 * <br>may be exposed to application code in the behaviour of wrapper streams, such
 * <br>as &#35;GBufferedInputStream or &#35;GTlsConnection. With such wrapper APIs,
 * <br>application code may only run operations on the base (wrapped) stream when
 * <br>the wrapper stream is idle. Note that the semantics of such operations may
 * <br>not be well-defined due to the state the wrapper stream leaves the base
 * <br>stream in (though they are guaranteed not to crash).
 * <p><a href="https://docs.gtk.org/gio/class.IOStream.html">https://docs.gtk.org/gio/class.IOStream.html</a></p>
*/
public class IOStream extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOStream.class.getCanonicalName());
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
    
    private static JnaIOStream.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaIOStream.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public IOStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Clears the pending flag on &#64;stream.
    */
    public void clearPending()  {
        JnaIOStream.INST().g_io_stream_clear_pending(asCPointer());
    }

    /**
     * Closes the stream, releasing resources related to it. This will also
     * <br>close the individual input and output streams, if they are not already
     * <br>closed.
     * <br>
     * <br>Once the stream is closed, all other operations will return
     * <br>%G_IO_ERROR_CLOSED. Closing a stream multiple times will not
     * <br>return an error.
     * <br>
     * <br>Closing a stream will automatically flush any outstanding buffers
     * <br>in the stream.
     * <br>
     * <br>Streams will be automatically closed when the last reference
     * <br>is dropped, but you might want to call this function to make sure
     * <br>resources are released as early as possible.
     * <br>
     * <br>Some streams might keep the backing store of the stream (e.g. a file
     * <br>descriptor) open after the stream is closed. See the documentation for
     * <br>the individual stream for details.
     * <br>
     * <br>On failure the first error that happened will be reported, but the
     * <br>close operation will finish as much as possible. A stream that failed
     * <br>to close will still return %G_IO_ERROR_CLOSED for all operations.
     * <br>Still, it is important to check and report the error to the user,
     * <br>otherwise there might be a loss of data as all data might not be written.
     * <br>
     * <br>If &#64;cancellable is not NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>Cancelling a close will still leave the stream closed, but some streams
     * <br>can use a faster close that doesn't block to e.g. check errors.
     * <br>
     * <br>The default implementation of this method just calls close on the
     * <br>individual input/output streams.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return %TRUE on success, %FALSE on failure
    */
    public boolean close(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOStream.INST().g_io_stream_close(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Requests an asynchronous close of the stream, releasing resources
     * <br>related to it. When the operation is finished &#64;callback will be
     * <br>called. You can then call g_io_stream_close_finish() to get
     * <br>the result of the operation.
     * <br>
     * <br>For behaviour details see g_io_stream_close().
     * <br>
     * <br>The asynchronous methods have a default fallback that uses threads
     * <br>to implement asynchronicity, so they are optional for inheriting
     * <br>classes. However, if you override one you must override all.
     * @param io_priority the io priority of the request
     * @param cancellable optional cancellable object
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void closeAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaIOStream.INST().g_io_stream_close_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "closeAsync", callback), asCPointer(user_data));
    }

    /**
     * Closes a stream.
     * @param result a &#35;GAsyncResult
     * @return %TRUE if stream was successfully closed, %FALSE otherwise.
    */
    public boolean closeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOStream.INST().g_io_stream_close_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets the input stream for this object. This is used
     * <br>for reading.
     * @return a &#35;GInputStream, owned by the &#35;GIOStream. Do not free.
    */
    public InputStream getInputStream()  {
        return new InputStream(new PointerContainer(JnaIOStream.INST().g_io_stream_get_input_stream(asCPointer())));
    }

    /**
     * Gets the output stream for this object. This is used for
     * <br>writing.
     * @return a &#35;GOutputStream, owned by the &#35;GIOStream. Do not free.
    */
    public OutputStream getOutputStream()  {
        return new OutputStream(new PointerContainer(JnaIOStream.INST().g_io_stream_get_output_stream(asCPointer())));
    }

    /**
     * Checks if a stream has pending actions.
     * @return %TRUE if &#64;stream has pending actions.
    */
    public boolean hasPending()  {
        return JnaIOStream.INST().g_io_stream_has_pending(asCPointer());
    }

    /**
     * Checks if a stream is closed.
     * @return %TRUE if the stream is closed.
    */
    public boolean isClosed()  {
        return JnaIOStream.INST().g_io_stream_is_closed(asCPointer());
    }

    /**
     * Sets &#64;stream to have actions pending. If the pending flag is
     * <br>already set or &#64;stream is closed, it will return %FALSE and set
     * <br>&#64;error.
     * @return %TRUE if pending was previously unset and is now set.
    */
    public boolean setPending() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOStream.INST().g_io_stream_set_pending(asCPointer(), 0L);
    }

    /**
     * Asynchronously splice the output stream of &#64;stream1 to the input stream of
     * <br>&#64;stream2, and splice the output stream of &#64;stream2 to the input stream of
     * <br>&#64;stream1.
     * <br>
     * <br>When the operation is finished &#64;callback will be called.
     * <br>You can then call g_io_stream_splice_finish() to get the
     * <br>result of the operation.
     * @param stream2 a &#35;GIOStream.
     * @param flags a set of &#35;GIOStreamSpliceFlags.
     * @param io_priority the io priority of the request.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback.
     * @param user_data user data passed to &#64;callback.
    */
    public void spliceAsync(@Nonnull IOStream stream2, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaIOStream.INST().g_io_stream_splice_async(asCPointer(), asCPointerNotNull(stream2), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "spliceAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous io stream splice operation.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE on success, %FALSE otherwise.
    */
    public static boolean spliceFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOStream.INST().g_io_stream_splice_finish(asCPointerNotNull(result), 0L);
    }

    public static long getTypeID() { 
        return JnaIOStream.INST().g_io_stream_get_type(); 
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
