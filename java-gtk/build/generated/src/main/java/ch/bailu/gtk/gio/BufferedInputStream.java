/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Buffered input stream implements &#35;GFilterInputStream and provides
 * <br>for buffered reads.
 * <br>
 * <br>By default, &#35;GBufferedInputStream's buffer size is set at 4 kilobytes.
 * <br>
 * <br>To create a buffered input stream, use g_buffered_input_stream_new(),
 * <br>or g_buffered_input_stream_new_sized() to specify the buffer's size at
 * <br>construction.
 * <br>
 * <br>To get the size of a buffer within a buffered input stream, use
 * <br>g_buffered_input_stream_get_buffer_size(). To change the size of a
 * <br>buffered input stream's buffer, use
 * <br>g_buffered_input_stream_set_buffer_size(). Note that the buffer's size
 * <br>cannot be reduced below the size of the data within the buffer.
 * <p><a href="https://docs.gtk.org/gio/class.BufferedInputStream.html">https://docs.gtk.org/gio/class.BufferedInputStream.html</a></p>
*/
public class BufferedInputStream extends FilterInputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BufferedInputStream.class.getCanonicalName());
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
    
    private static JnaBufferedInputStream.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaBufferedInputStream.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public BufferedInputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GBufferedInputStream from the given &#64;base_stream,
     * <br>with a buffer set to &#64;size.
     * @param base_stream a &#35;GInputStream
     * @param size a &#35;gsize
     * @return a &#35;GInputStream.
    */
    public static BufferedInputStream newSizedBufferedInputStream(@Nonnull InputStream base_stream, long size)  {
        PointerContainer __self = cast(JnaBufferedInputStream.INST().g_buffered_input_stream_new_sized(asCPointerNotNull(base_stream), size));
        if (__self.isNull()) {
            throw new NullPointerException("BufferedInputStream:newSized");
        }
        return new BufferedInputStream(__self);
    }        
    

    /**
     * Creates a new &#35;GInputStream from the given &#64;base_stream, with
     * <br>a buffer set to the default size (4 kilobytes).
     * @param base_stream a &#35;GInputStream
    */
    public BufferedInputStream(@Nonnull InputStream base_stream) {
        super(cast(JnaBufferedInputStream.INST().g_buffered_input_stream_new(asCPointerNotNull(base_stream))));
    }

    /**
     * Tries to read &#64;count bytes from the stream into the buffer.
     * <br>Will block during this read.
     * <br>
     * <br>If &#64;count is zero, returns zero and does nothing. A value of &#64;count
     * <br>larger than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
     * <br>
     * <br>On success, the number of bytes read into the buffer is returned.
     * <br>It is not an error if this is not the same as the requested size, as it
     * <br>can happen e.g. near the end of a file. Zero is returned on end of file
     * <br>(or if &#64;count is zero),  but never otherwise.
     * <br>
     * <br>If &#64;count is -1 then the attempted read size is equal to the number of
     * <br>bytes that are required to fill the buffer.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * <br>operation was partially finished when the operation was cancelled the
     * <br>partial result will be returned, without an error.
     * <br>
     * <br>On error -1 is returned and &#64;error is set accordingly.
     * <br>
     * <br>For the asynchronous, non-blocking, version of this function, see
     * <br>g_buffered_input_stream_fill_async().
     * @param count the number of bytes that will be read from the stream
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return the number of bytes read into &#64;stream's buffer, up to &#64;count,     or -1 on error.
    */
    public long fill(long count, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBufferedInputStream.INST().g_buffered_input_stream_fill(asCPointer(), count, asCPointer(cancellable), 0L);
    }

    /**
     * Reads data into &#64;stream's buffer asynchronously, up to &#64;count size.
     * <br>&#64;io_priority can be used to prioritize reads. For the synchronous
     * <br>version of this function, see g_buffered_input_stream_fill().
     * <br>
     * <br>If &#64;count is -1 then the attempted read size is equal to the number
     * <br>of bytes that are required to fill the buffer.
     * @param count the number of bytes that will be read from the stream
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data a &#35;gpointer
    */
    public void fillAsync(long count, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaBufferedInputStream.INST().g_buffered_input_stream_fill_async(asCPointer(), count, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "fillAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous read.
     * @param result a &#35;GAsyncResult
     * @return a &#35;gssize of the read stream, or `-1` on an error.
    */
    public long fillFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBufferedInputStream.INST().g_buffered_input_stream_fill_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets the size of the available data within the stream.
     * @return size of the available stream.
    */
    public long getAvailable()  {
        return JnaBufferedInputStream.INST().g_buffered_input_stream_get_available(asCPointer());
    }

    /**
     * Gets the size of the input buffer.
     * @return the current buffer size.
    */
    public long getBufferSize()  {
        return JnaBufferedInputStream.INST().g_buffered_input_stream_get_buffer_size(asCPointer());
    }

    /**
     * Peeks in the buffer, copying data of size &#64;count into &#64;buffer,
     * <br>offset &#64;offset bytes.
     * @param buffer a pointer to   an allocated chunk of memory
     * @param offset a &#35;gsize
     * @param count a &#35;gsize
     * @return a &#35;gsize of the number of bytes peeked, or -1 on error.
    */
    public long peek(@Nonnull ch.bailu.gtk.type.Pointer buffer, long offset, long count)  {
        return JnaBufferedInputStream.INST().g_buffered_input_stream_peek(asCPointer(), asCPointerNotNull(buffer), offset, count);
    }

    /**
     * Returns the buffer with the currently available bytes. The returned
     * <br>buffer must not be modified and will become invalid when reading from
     * <br>the stream or filling the buffer.
     * @param count a &#35;gsize to get the number of bytes available in the buffer
     * @return           read-only buffer
    */
    public ch.bailu.gtk.type.Pointer peekBuffer(@Nonnull ch.bailu.gtk.type.Int64 count)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaBufferedInputStream.INST().g_buffered_input_stream_peek_buffer(asCPointer(), asCPointerNotNull(count))));
    }

    /**
     * Tries to read a single byte from the stream or the buffer. Will block
     * <br>during this read.
     * <br>
     * <br>On success, the byte read from the stream is returned. On end of stream
     * <br>-1 is returned but it's not an exceptional error and &#64;error is not set.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * <br>operation was partially finished when the operation was cancelled the
     * <br>partial result will be returned, without an error.
     * <br>
     * <br>On error -1 is returned and &#64;error is set accordingly.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return the byte read from the &#64;stream, or -1 on end of stream or error.
    */
    public int readByte(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBufferedInputStream.INST().g_buffered_input_stream_read_byte(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Sets the size of the internal buffer of &#64;stream to &#64;size, or to the
     * <br>size of the contents of the buffer. The buffer can never be resized
     * <br>smaller than its current contents.
     * @param size a &#35;gsize
    */
    public void setBufferSize(long size)  {
        JnaBufferedInputStream.INST().g_buffered_input_stream_set_buffer_size(asCPointer(), size);
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaBufferedInputStream.INST().g_buffered_input_stream_get_type(); 
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
