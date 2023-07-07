/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GInputStream has functions to read from a stream (g_input_stream_read()),
 * <br>to close a stream (g_input_stream_close()) and to skip some content
 * <br>(g_input_stream_skip()).
 * <br>
 * <br>To copy the content of an input stream to an output stream without
 * <br>manually handling the reads and writes, use g_output_stream_splice().
 * <br>
 * <br>See the documentation for &#35;GIOStream for details of thread safety of
 * <br>streaming APIs.
 * <br>
 * <br>All of these functions have async variants too.
 * <p><a href="https://docs.gtk.org/gio/class.InputStream.html">https://docs.gtk.org/gio/class.InputStream.html</a></p>
*/
public class InputStream extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InputStream.class.getCanonicalName());
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
    
    private static JnaInputStream.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaInputStream.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public InputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Clears the pending flag on &#64;stream.
    */
    public void clearPending()  {
        JnaInputStream.INST().g_input_stream_clear_pending(asCPointer());
    }

    /**
     * Closes the stream, releasing resources related to it.
     * <br>
     * <br>Once the stream is closed, all other operations will return %G_IO_ERROR_CLOSED.
     * <br>Closing a stream multiple times will not return an error.
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
     * <br>is important to check and report the error to the user.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>Cancelling a close will still leave the stream closed, but some streams
     * <br>can use a faster close that doesn't block to e.g. check errors.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE on success, %FALSE on failure
    */
    public boolean close(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_close(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Requests an asynchronous closes of the stream, releasing resources related to it.
     * <br>When the operation is finished &#64;callback will be called.
     * <br>You can then call g_input_stream_close_finish() to get the result of the
     * <br>operation.
     * <br>
     * <br>For behaviour details see g_input_stream_close().
     * <br>
     * <br>The asynchronous methods have a default fallback that uses threads to implement
     * <br>asynchronicity, so they are optional for inheriting classes. However, if you
     * <br>override one you must override all.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional cancellable object
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void closeAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaInputStream.INST().g_input_stream_close_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "closeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes closing a stream asynchronously, started from g_input_stream_close_async().
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the stream was closed successfully.
    */
    public boolean closeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_close_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Checks if an input stream has pending actions.
     * @return %TRUE if &#64;stream has pending actions.
    */
    public boolean hasPending()  {
        return JnaInputStream.INST().g_input_stream_has_pending(asCPointer());
    }

    /**
     * Checks if an input stream is closed.
     * @return %TRUE if the stream is closed.
    */
    public boolean isClosed()  {
        return JnaInputStream.INST().g_input_stream_is_closed(asCPointer());
    }

    /**
     * Tries to read &#64;count bytes from the stream into the buffer starting at
     * <br>&#64;buffer. Will block during this read.
     * <br>
     * <br>If count is zero returns zero and does nothing. A value of &#64;count
     * <br>larger than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, the number of bytes read into the buffer is returned.
     * <br>It is not an error if this is not the same as the requested size, as it
     * <br>can happen e.g. near the end of a file. Zero is returned on end of file
     * <br>(or if &#64;count is zero),  but never otherwise.
     * <br>
     * <br>The returned &#64;buffer is not a nul-terminated string, it can contain nul bytes
     * <br>at any position, and this function doesn't nul-terminate the &#64;buffer.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * <br>operation was partially finished when the operation was cancelled the
     * <br>partial result will be returned, without an error.
     * <br>
     * <br>On error -1 is returned and &#64;error is set accordingly.
     * @param buffer      a buffer to read data into (which should be at least count bytes long).
     * @param count the number of bytes that will be read from the stream
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return Number of bytes read, or -1 on error, or 0 on end of file.
    */
    public long read(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_read(asCPointer(), asCPointerNotNull(buffer), count, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to read &#64;count bytes from the stream into the buffer starting at
     * <br>&#64;buffer. Will block during this read.
     * <br>
     * <br>This function is similar to g_input_stream_read(), except it tries to
     * <br>read as many bytes as requested, only stopping on an error or end of stream.
     * <br>
     * <br>On a successful read of &#64;count bytes, or if we reached the end of the
     * <br>stream,  %TRUE is returned, and &#64;bytes_read is set to the number of bytes
     * <br>read into &#64;buffer.
     * <br>
     * <br>If there is an error during the operation %FALSE is returned and &#64;error
     * <br>is set to indicate the error status.
     * <br>
     * <br>As a special exception to the normal conventions for functions that
     * <br>use &#35;GError, if this function returns %FALSE (and sets &#64;error) then
     * <br>&#64;bytes_read will be set to the number of bytes that were successfully
     * <br>read before the error was encountered.  This functionality is only
     * <br>available from C.  If you need it from another language then you must
     * <br>write your own loop around g_input_stream_read().
     * @param buffer      a buffer to read data into (which should be at least count bytes long).
     * @param count the number of bytes that will be read from the stream
     * @param bytes_read location to store the number of bytes that was read from the stream
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE on success, %FALSE if there was an error
    */
    public boolean readAll(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, @Nonnull ch.bailu.gtk.type.Int64 bytes_read, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_read_all(asCPointer(), asCPointerNotNull(buffer), count, asCPointerNotNull(bytes_read), asCPointer(cancellable), 0L);
    }

    /**
     * Request an asynchronous read of &#64;count bytes from the stream into the
     * <br>buffer starting at &#64;buffer.
     * <br>
     * <br>This is the asynchronous equivalent of g_input_stream_read_all().
     * <br>
     * <br>Call g_input_stream_read_all_finish() to collect the result.
     * <br>
     * <br>Any outstanding I/O request with higher priority (lower numerical
     * <br>value) will be executed before an outstanding request with lower
     * <br>priority. Default priority is %G_PRIORITY_DEFAULT.
     * @param buffer      a buffer to read data into (which should be at least count bytes long)
     * @param count the number of bytes that will be read from the stream
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readAllAsync(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaInputStream.INST().g_input_stream_read_all_async(asCPointer(), asCPointerNotNull(buffer), count, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readAllAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous stream read operation started with
     * <br>g_input_stream_read_all_async().
     * <br>
     * <br>As a special exception to the normal conventions for functions that
     * <br>use &#35;GError, if this function returns %FALSE (and sets &#64;error) then
     * <br>&#64;bytes_read will be set to the number of bytes that were successfully
     * <br>read before the error was encountered.  This functionality is only
     * <br>available from C.  If you need it from another language then you must
     * <br>write your own loop around g_input_stream_read_async().
     * @param result a &#35;GAsyncResult
     * @param bytes_read location to store the number of bytes that was read from the stream
     * @return %TRUE on success, %FALSE if there was an error
    */
    public boolean readAllFinish(@Nonnull AsyncResult result, @Nonnull ch.bailu.gtk.type.Int64 bytes_read) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_read_all_finish(asCPointer(), asCPointerNotNull(result), asCPointerNotNull(bytes_read), 0L);
    }

    /**
     * Request an asynchronous read of &#64;count bytes from the stream into the buffer
     * <br>starting at &#64;buffer. When the operation is finished &#64;callback will be called.
     * <br>You can then call g_input_stream_read_finish() to get the result of the
     * <br>operation.
     * <br>
     * <br>During an async request no other sync and async calls are allowed on &#64;stream, and will
     * <br>result in %G_IO_ERROR_PENDING errors.
     * <br>
     * <br>A value of &#64;count larger than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, the number of bytes read into the buffer will be passed to the
     * <br>callback. It is not an error if this is not the same as the requested size, as it
     * <br>can happen e.g. near the end of a file, but generally we try to read
     * <br>as many bytes as requested. Zero is returned on end of file
     * <br>(or if &#64;count is zero),  but never otherwise.
     * <br>
     * <br>Any outstanding i/o request with higher priority (lower numerical value) will
     * <br>be executed before an outstanding request with lower priority. Default
     * <br>priority is %G_PRIORITY_DEFAULT.
     * <br>
     * <br>The asynchronous methods have a default fallback that uses threads to implement
     * <br>asynchronicity, so they are optional for inheriting classes. However, if you
     * <br>override one you must override all.
     * @param buffer      a buffer to read data into (which should be at least count bytes long).
     * @param count the number of bytes that will be read from the stream
     * @param io_priority the [I/O priority][io-priority] of the request.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readAsync(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaInputStream.INST().g_input_stream_read_async(asCPointer(), asCPointerNotNull(buffer), count, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readAsync", callback), asCPointer(user_data));
    }

    /**
     * Like g_input_stream_read(), this tries to read &#64;count bytes from
     * <br>the stream in a blocking fashion. However, rather than reading into
     * <br>a user-supplied buffer, this will create a new &#35;GBytes containing
     * <br>the data that was read. This may be easier to use from language
     * <br>bindings.
     * <br>
     * <br>If count is zero, returns a zero-length &#35;GBytes and does nothing. A
     * <br>value of &#64;count larger than %G_MAXSSIZE will cause a
     * <br>%G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, a new &#35;GBytes is returned. It is not an error if the
     * <br>size of this object is not the same as the requested size, as it
     * <br>can happen e.g. near the end of a file. A zero-length &#35;GBytes is
     * <br>returned on end of file (or if &#64;count is zero), but never
     * <br>otherwise.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * <br>operation was partially finished when the operation was cancelled the
     * <br>partial result will be returned, without an error.
     * <br>
     * <br>On error %NULL is returned and &#64;error is set accordingly.
     * @param count maximum number of bytes that will be read from the stream. Common values include 4096 and 8192.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a new &#35;GBytes, or %NULL on error
    */
    public ch.bailu.gtk.glib.Bytes readBytes(long count, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaInputStream.INST().g_input_stream_read_bytes(asCPointer(), count, asCPointer(cancellable), 0L)));
    }

    /**
     * Request an asynchronous read of &#64;count bytes from the stream into a
     * <br>new &#35;GBytes. When the operation is finished &#64;callback will be
     * <br>called. You can then call g_input_stream_read_bytes_finish() to get the
     * <br>result of the operation.
     * <br>
     * <br>During an async request no other sync and async calls are allowed
     * <br>on &#64;stream, and will result in %G_IO_ERROR_PENDING errors.
     * <br>
     * <br>A value of &#64;count larger than %G_MAXSSIZE will cause a
     * <br>%G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, the new &#35;GBytes will be passed to the callback. It is
     * <br>not an error if this is smaller than the requested size, as it can
     * <br>happen e.g. near the end of a file, but generally we try to read as
     * <br>many bytes as requested. Zero is returned on end of file (or if
     * <br>&#64;count is zero), but never otherwise.
     * <br>
     * <br>Any outstanding I/O request with higher priority (lower numerical
     * <br>value) will be executed before an outstanding request with lower
     * <br>priority. Default priority is %G_PRIORITY_DEFAULT.
     * @param count the number of bytes that will be read from the stream
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readBytesAsync(long count, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaInputStream.INST().g_input_stream_read_bytes_async(asCPointer(), count, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readBytesAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous stream read-into-&#35;GBytes operation.
     * @param result a &#35;GAsyncResult.
     * @return the newly-allocated &#35;GBytes, or %NULL on error
    */
    public ch.bailu.gtk.glib.Bytes readBytesFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaInputStream.INST().g_input_stream_read_bytes_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Finishes an asynchronous stream read operation.
     * @param result a &#35;GAsyncResult.
     * @return number of bytes read in, or -1 on error, or 0 on end of file.
    */
    public long readFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_read_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Sets &#64;stream to have actions pending. If the pending flag is
     * <br>already set or &#64;stream is closed, it will return %FALSE and set
     * <br>&#64;error.
     * @return %TRUE if pending was previously unset and is now set.
    */
    public boolean setPending() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_set_pending(asCPointer(), 0L);
    }

    /**
     * Tries to skip &#64;count bytes from the stream. Will block during the operation.
     * <br>
     * <br>This is identical to g_input_stream_read(), from a behaviour standpoint,
     * <br>but the bytes that are skipped are not returned to the user. Some
     * <br>streams have an implementation that is more efficient than reading the data.
     * <br>
     * <br>This function is optional for inherited classes, as the default implementation
     * <br>emulates it using read.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * <br>operation was partially finished when the operation was cancelled the
     * <br>partial result will be returned, without an error.
     * @param count the number of bytes that will be skipped from the stream
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return Number of bytes skipped, or -1 on error
    */
    public long skip(long count, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_skip(asCPointer(), count, asCPointer(cancellable), 0L);
    }

    /**
     * Request an asynchronous skip of &#64;count bytes from the stream.
     * <br>When the operation is finished &#64;callback will be called.
     * <br>You can then call g_input_stream_skip_finish() to get the result
     * <br>of the operation.
     * <br>
     * <br>During an async request no other sync and async calls are allowed,
     * <br>and will result in %G_IO_ERROR_PENDING errors.
     * <br>
     * <br>A value of &#64;count larger than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, the number of bytes skipped will be passed to the callback.
     * <br>It is not an error if this is not the same as the requested size, as it
     * <br>can happen e.g. near the end of a file, but generally we try to skip
     * <br>as many bytes as requested. Zero is returned on end of file
     * <br>(or if &#64;count is zero), but never otherwise.
     * <br>
     * <br>Any outstanding i/o request with higher priority (lower numerical value)
     * <br>will be executed before an outstanding request with lower priority.
     * <br>Default priority is %G_PRIORITY_DEFAULT.
     * <br>
     * <br>The asynchronous methods have a default fallback that uses threads to
     * <br>implement asynchronicity, so they are optional for inheriting classes.
     * <br>However, if you override one, you must override all.
     * @param count the number of bytes that will be skipped from the stream
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void skipAsync(long count, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaInputStream.INST().g_input_stream_skip_async(asCPointer(), count, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "skipAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a stream skip operation.
     * @param result a &#35;GAsyncResult.
     * @return the size of the bytes skipped, or `-1` on error.
    */
    public long skipFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInputStream.INST().g_input_stream_skip_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    public static long getTypeID() { 
        return JnaInputStream.INST().g_input_stream_get_type(); 
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
