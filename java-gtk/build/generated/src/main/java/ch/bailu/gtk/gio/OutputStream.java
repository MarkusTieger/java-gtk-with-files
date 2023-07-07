/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GOutputStream has functions to write to a stream (g_output_stream_write()),
 * <br>to close a stream (g_output_stream_close()) and to flush pending writes
 * <br>(g_output_stream_flush()).
 * <br>
 * <br>To copy the content of an input stream to an output stream without
 * <br>manually handling the reads and writes, use g_output_stream_splice().
 * <br>
 * <br>See the documentation for &#35;GIOStream for details of thread safety of
 * <br>streaming APIs.
 * <br>
 * <br>All of these functions have async variants too.
 * <p><a href="https://docs.gtk.org/gio/class.OutputStream.html">https://docs.gtk.org/gio/class.OutputStream.html</a></p>
*/
public class OutputStream extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OutputStream.class.getCanonicalName());
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
    
    private static JnaOutputStream.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaOutputStream.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public OutputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Clears the pending flag on &#64;stream.
    */
    public void clearPending()  {
        JnaOutputStream.INST().g_output_stream_clear_pending(asCPointer());
    }

    /**
     * Closes the stream, releasing resources related to it.
     * <br>
     * <br>Once the stream is closed, all other operations will return %G_IO_ERROR_CLOSED.
     * <br>Closing a stream multiple times will not return an error.
     * <br>
     * <br>Closing a stream will automatically flush any outstanding buffers in the
     * <br>stream.
     * <br>
     * <br>Streams will be automatically closed when the last reference
     * <br>is dropped, but you might want to call this function to make sure
     * <br>resources are released as early as possible.
     * <br>
     * <br>Some streams might keep the backing store of the stream (e.g. a file descriptor)
     * <br>open after the stream is closed. See the documentation for the individual
     * <br>stream for details.
     * <br>
     * <br>On failure the first error that happened will be reported, but the close
     * <br>operation will finish as much as possible. A stream that failed to
     * <br>close will still return %G_IO_ERROR_CLOSED for all operations. Still, it
     * <br>is important to check and report the error to the user, otherwise
     * <br>there might be a loss of data as all data might not be written.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>Cancelling a close will still leave the stream closed, but there some streams
     * <br>can use a faster close that doesn't block to e.g. check errors. On
     * <br>cancellation (as with any error) there is no guarantee that all written
     * <br>data will reach the target.
     * @param cancellable optional cancellable object
     * @return %TRUE on success, %FALSE on failure
    */
    public boolean close(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_close(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Requests an asynchronous close of the stream, releasing resources
     * <br>related to it. When the operation is finished &#64;callback will be
     * <br>called. You can then call g_output_stream_close_finish() to get
     * <br>the result of the operation.
     * <br>
     * <br>For behaviour details see g_output_stream_close().
     * <br>
     * <br>The asynchronous methods have a default fallback that uses threads
     * <br>to implement asynchronicity, so they are optional for inheriting
     * <br>classes. However, if you override one you must override all.
     * @param io_priority the io priority of the request.
     * @param cancellable optional cancellable object
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void closeAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaOutputStream.INST().g_output_stream_close_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "closeAsync", callback), asCPointer(user_data));
    }

    /**
     * Closes an output stream.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if stream was successfully closed, %FALSE otherwise.
    */
    public boolean closeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_close_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Forces a write of all user-space buffered data for the given
     * <br>&#64;stream. Will block during the operation. Closing the stream will
     * <br>implicitly cause a flush.
     * <br>
     * <br>This function is optional for inherited classes.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional cancellable object
     * @return %TRUE on success, %FALSE on error
    */
    public boolean flush(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_flush(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Forces an asynchronous write of all user-space buffered data for
     * <br>the given &#64;stream.
     * <br>For behaviour details see g_output_stream_flush().
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_output_stream_flush_finish() to get the
     * <br>result of the operation.
     * @param io_priority the io priority of the request.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void flushAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaOutputStream.INST().g_output_stream_flush_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "flushAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes flushing an output stream.
     * @param result a GAsyncResult.
     * @return %TRUE if flush operation succeeded, %FALSE otherwise.
    */
    public boolean flushFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_flush_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Checks if an output stream has pending actions.
     * @return %TRUE if &#64;stream has pending actions.
    */
    public boolean hasPending()  {
        return JnaOutputStream.INST().g_output_stream_has_pending(asCPointer());
    }

    /**
     * Checks if an output stream has already been closed.
     * @return %TRUE if &#64;stream is closed. %FALSE otherwise.
    */
    public boolean isClosed()  {
        return JnaOutputStream.INST().g_output_stream_is_closed(asCPointer());
    }

    /**
     * Checks if an output stream is being closed. This can be
     * <br>used inside e.g. a flush implementation to see if the
     * <br>flush (or other i/o operation) is called from within
     * <br>the closing operation.
     * @return %TRUE if &#64;stream is being closed. %FALSE otherwise.
    */
    public boolean isClosing()  {
        return JnaOutputStream.INST().g_output_stream_is_closing(asCPointer());
    }

    /**
     * Sets &#64;stream to have actions pending. If the pending flag is
     * <br>already set or &#64;stream is closed, it will return %FALSE and set
     * <br>&#64;error.
     * @return %TRUE if pending was previously unset and is now set.
    */
    public boolean setPending() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_set_pending(asCPointer(), 0L);
    }

    /**
     * Splices an input stream into an output stream.
     * @param source a &#35;GInputStream.
     * @param flags a set of &#35;GOutputStreamSpliceFlags.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;gssize containing the size of the data spliced, or     -1 if an error occurred. Note that if the number of bytes     spliced is greater than %G_MAXSSIZE, then that will be     returned, and there is no way to determine the actual number     of bytes spliced.
    */
    public long splice(@Nonnull InputStream source, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_splice(asCPointer(), asCPointerNotNull(source), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Splices a stream asynchronously.
     * <br>When the operation is finished &#64;callback will be called.
     * <br>You can then call g_output_stream_splice_finish() to get the
     * <br>result of the operation.
     * <br>
     * <br>For the synchronous, blocking version of this function, see
     * <br>g_output_stream_splice().
     * @param source a &#35;GInputStream.
     * @param flags a set of &#35;GOutputStreamSpliceFlags.
     * @param io_priority the io priority of the request.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback.
     * @param user_data user data passed to &#64;callback.
    */
    public void spliceAsync(@Nonnull InputStream source, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaOutputStream.INST().g_output_stream_splice_async(asCPointer(), asCPointerNotNull(source), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "spliceAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous stream splice operation.
     * @param result a &#35;GAsyncResult.
     * @return a &#35;gssize of the number of bytes spliced. Note that if the     number of bytes spliced is greater than %G_MAXSSIZE, then that     will be returned, and there is no way to determine the actual     number of bytes spliced.
    */
    public long spliceFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_splice_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Tries to write &#64;count bytes from &#64;buffer into the stream. Will block
     * <br>during the operation.
     * <br>
     * <br>If count is 0, returns 0 and does nothing. A value of &#64;count
     * <br>larger than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, the number of bytes written to the stream is returned.
     * <br>It is not an error if this is not the same as the requested size, as it
     * <br>can happen e.g. on a partial I/O error, or if there is not enough
     * <br>storage in the stream. All writes block until at least one byte
     * <br>is written or an error occurs; 0 is never returned (unless
     * <br>&#64;count is 0).
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * <br>operation was partially finished when the operation was cancelled the
     * <br>partial result will be returned, without an error.
     * <br>
     * <br>On error -1 is returned and &#64;error is set accordingly.
     * @param buffer the buffer containing the data to write.
     * @param count the number of bytes to write
     * @param cancellable optional cancellable object
     * @return Number of bytes written, or -1 on error
    */
    public long write(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_write(asCPointer(), asCPointerNotNull(buffer), count, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to write &#64;count bytes from &#64;buffer into the stream. Will block
     * <br>during the operation.
     * <br>
     * <br>This function is similar to g_output_stream_write(), except it tries to
     * <br>write as many bytes as requested, only stopping on an error.
     * <br>
     * <br>On a successful write of &#64;count bytes, %TRUE is returned, and &#64;bytes_written
     * <br>is set to &#64;count.
     * <br>
     * <br>If there is an error during the operation %FALSE is returned and &#64;error
     * <br>is set to indicate the error status.
     * <br>
     * <br>As a special exception to the normal conventions for functions that
     * <br>use &#35;GError, if this function returns %FALSE (and sets &#64;error) then
     * <br>&#64;bytes_written will be set to the number of bytes that were
     * <br>successfully written before the error was encountered.  This
     * <br>functionality is only available from C.  If you need it from another
     * <br>language then you must write your own loop around
     * <br>g_output_stream_write().
     * @param buffer the buffer containing the data to write.
     * @param count the number of bytes to write
     * @param bytes_written location to store the number of bytes that was     written to the stream
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE on success, %FALSE if there was an error
    */
    public boolean writeAll(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, @Nullable ch.bailu.gtk.type.Int64 bytes_written, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_write_all(asCPointer(), asCPointerNotNull(buffer), count, asCPointer(bytes_written), asCPointer(cancellable), 0L);
    }

    /**
     * Request an asynchronous write of &#64;count bytes from &#64;buffer into
     * <br>the stream. When the operation is finished &#64;callback will be called.
     * <br>You can then call g_output_stream_write_all_finish() to get the result of the
     * <br>operation.
     * <br>
     * <br>This is the asynchronous version of g_output_stream_write_all().
     * <br>
     * <br>Call g_output_stream_write_all_finish() to collect the result.
     * <br>
     * <br>Any outstanding I/O request with higher priority (lower numerical
     * <br>value) will be executed before an outstanding request with lower
     * <br>priority. Default priority is %G_PRIORITY_DEFAULT.
     * <br>
     * <br>Note that no copy of &#64;buffer will be made, so it must stay valid
     * <br>until &#64;callback is called.
     * @param buffer the buffer containing the data to write
     * @param count the number of bytes to write
     * @param io_priority the io priority of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void writeAllAsync(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaOutputStream.INST().g_output_stream_write_all_async(asCPointer(), asCPointerNotNull(buffer), count, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "writeAllAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous stream write operation started with
     * <br>g_output_stream_write_all_async().
     * <br>
     * <br>As a special exception to the normal conventions for functions that
     * <br>use &#35;GError, if this function returns %FALSE (and sets &#64;error) then
     * <br>&#64;bytes_written will be set to the number of bytes that were
     * <br>successfully written before the error was encountered.  This
     * <br>functionality is only available from C.  If you need it from another
     * <br>language then you must write your own loop around
     * <br>g_output_stream_write_async().
     * @param result a &#35;GAsyncResult
     * @param bytes_written location to store the number of bytes that was written to the stream
     * @return %TRUE on success, %FALSE if there was an error
    */
    public boolean writeAllFinish(@Nonnull AsyncResult result, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_write_all_finish(asCPointer(), asCPointerNotNull(result), asCPointer(bytes_written), 0L);
    }

    /**
     * Request an asynchronous write of &#64;count bytes from &#64;buffer into
     * <br>the stream. When the operation is finished &#64;callback will be called.
     * <br>You can then call g_output_stream_write_finish() to get the result of the
     * <br>operation.
     * <br>
     * <br>During an async request no other sync and async calls are allowed,
     * <br>and will result in %G_IO_ERROR_PENDING errors.
     * <br>
     * <br>A value of &#64;count larger than %G_MAXSSIZE will cause a
     * <br>%G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, the number of bytes written will be passed to the
     * <br>&#64;callback. It is not an error if this is not the same as the
     * <br>requested size, as it can happen e.g. on a partial I/O error,
     * <br>but generally we try to write as many bytes as requested.
     * <br>
     * <br>You are guaranteed that this method will never fail with
     * <br>%G_IO_ERROR_WOULD_BLOCK - if &#64;stream can't accept more data, the
     * <br>method will just wait until this changes.
     * <br>
     * <br>Any outstanding I/O request with higher priority (lower numerical
     * <br>value) will be executed before an outstanding request with lower
     * <br>priority. Default priority is %G_PRIORITY_DEFAULT.
     * <br>
     * <br>The asynchronous methods have a default fallback that uses threads
     * <br>to implement asynchronicity, so they are optional for inheriting
     * <br>classes. However, if you override one you must override all.
     * <br>
     * <br>For the synchronous, blocking version of this function, see
     * <br>g_output_stream_write().
     * <br>
     * <br>Note that no copy of &#64;buffer will be made, so it must stay valid
     * <br>until &#64;callback is called. See g_output_stream_write_bytes_async()
     * <br>for a &#35;GBytes version that will automatically hold a reference to
     * <br>the contents (without copying) for the duration of the call.
     * @param buffer the buffer containing the data to write.
     * @param count the number of bytes to write
     * @param io_priority the io priority of the request.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void writeAsync(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaOutputStream.INST().g_output_stream_write_async(asCPointer(), asCPointerNotNull(buffer), count, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "writeAsync", callback), asCPointer(user_data));
    }

    /**
     * A wrapper function for g_output_stream_write() which takes a
     * <br>&#35;GBytes as input.  This can be more convenient for use by language
     * <br>bindings or in other cases where the refcounted nature of &#35;GBytes
     * <br>is helpful over a bare pointer interface.
     * <br>
     * <br>However, note that this function may still perform partial writes,
     * <br>just like g_output_stream_write().  If that occurs, to continue
     * <br>writing, you will need to create a new &#35;GBytes containing just the
     * <br>remaining bytes, using g_bytes_new_from_bytes(). Passing the same
     * <br>&#35;GBytes instance multiple times potentially can result in duplicated
     * <br>data in the output stream.
     * @param bytes the &#35;GBytes to write
     * @param cancellable optional cancellable object
     * @return Number of bytes written, or -1 on error
    */
    public long writeBytes(@Nonnull ch.bailu.gtk.glib.Bytes bytes, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_write_bytes(asCPointer(), asCPointerNotNull(bytes), asCPointer(cancellable), 0L);
    }

    /**
     * This function is similar to g_output_stream_write_async(), but
     * <br>takes a &#35;GBytes as input.  Due to the refcounted nature of &#35;GBytes,
     * <br>this allows the stream to avoid taking a copy of the data.
     * <br>
     * <br>However, note that this function may still perform partial writes,
     * <br>just like g_output_stream_write_async(). If that occurs, to continue
     * <br>writing, you will need to create a new &#35;GBytes containing just the
     * <br>remaining bytes, using g_bytes_new_from_bytes(). Passing the same
     * <br>&#35;GBytes instance multiple times potentially can result in duplicated
     * <br>data in the output stream.
     * <br>
     * <br>For the synchronous, blocking version of this function, see
     * <br>g_output_stream_write_bytes().
     * @param bytes The bytes to write
     * @param io_priority the io priority of the request.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void writeBytesAsync(@Nonnull ch.bailu.gtk.glib.Bytes bytes, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaOutputStream.INST().g_output_stream_write_bytes_async(asCPointer(), asCPointerNotNull(bytes), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "writeBytesAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a stream write-from-&#35;GBytes operation.
     * @param result a &#35;GAsyncResult.
     * @return a &#35;gssize containing the number of bytes written to the stream.
    */
    public long writeBytesFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_write_bytes_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Finishes a stream write operation.
     * @param result a &#35;GAsyncResult.
     * @return a &#35;gssize containing the number of bytes written to the stream.
    */
    public long writeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_write_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Finishes an asynchronous stream write operation started with
     * <br>g_output_stream_writev_all_async().
     * <br>
     * <br>As a special exception to the normal conventions for functions that
     * <br>use &#35;GError, if this function returns %FALSE (and sets &#64;error) then
     * <br>&#64;bytes_written will be set to the number of bytes that were
     * <br>successfully written before the error was encountered.  This
     * <br>functionality is only available from C.  If you need it from another
     * <br>language then you must write your own loop around
     * <br>g_output_stream_writev_async().
     * @param result a &#35;GAsyncResult
     * @param bytes_written location to store the number of bytes that were written to the stream
     * @return %TRUE on success, %FALSE if there was an error
    */
    public boolean writevAllFinish(@Nonnull AsyncResult result, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_writev_all_finish(asCPointer(), asCPointerNotNull(result), asCPointer(bytes_written), 0L);
    }

    /**
     * Finishes a stream writev operation.
     * @param result a &#35;GAsyncResult.
     * @param bytes_written location to store the number of bytes that were written to the stream
     * @return %TRUE on success, %FALSE if there was an error
    */
    public boolean writevFinish(@Nonnull AsyncResult result, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaOutputStream.INST().g_output_stream_writev_finish(asCPointer(), asCPointerNotNull(result), asCPointer(bytes_written), 0L);
    }

    public static long getTypeID() { 
        return JnaOutputStream.INST().g_output_stream_get_type(); 
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

[MethodModel:java-type-not-supported:printf:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:java-type-not-supported:vprintf:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:writev:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GOutputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:writevAll:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GOutputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:writevAllAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GOutputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:writevAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GOutputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
