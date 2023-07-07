/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Data input stream implements &#35;GInputStream and includes functions for
 * <br>reading structured data directly from a binary input stream.
 * <p><a href="https://docs.gtk.org/gio/class.DataInputStream.html">https://docs.gtk.org/gio/class.DataInputStream.html</a></p>
*/
public class DataInputStream extends BufferedInputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DataInputStream.class.getCanonicalName());
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
    
    private static JnaDataInputStream.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaDataInputStream.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public DataInputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new data input stream for the &#64;base_stream.
     * @param base_stream a &#35;GInputStream.
    */
    public DataInputStream(@Nonnull InputStream base_stream) {
        super(cast(JnaDataInputStream.INST().g_data_input_stream_new(asCPointerNotNull(base_stream))));
    }

    /**
     * Gets the byte order for the data input stream.
     * @return the &#64;stream's current &#35;GDataStreamByteOrder.
    */
    public int getByteOrder()  {
        return JnaDataInputStream.INST().g_data_input_stream_get_byte_order(asCPointer());
    }

    /**
     * Gets the current newline type for the &#64;stream.
     * @return &#35;GDataStreamNewlineType for the given &#64;stream.
    */
    public int getNewlineType()  {
        return JnaDataInputStream.INST().g_data_input_stream_get_newline_type(asCPointer());
    }

    /**
     * Reads a 16-bit/2-byte value from &#64;stream.
     * <br>
     * <br>In order to get the correct byte order for this read operation,
     * <br>see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a signed 16-bit/2-byte value read from &#64;stream or `0` if an error occurred.
    */
    public int readInt16(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataInputStream.INST().g_data_input_stream_read_int16(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Reads a signed 32-bit/4-byte value from &#64;stream.
     * <br>
     * <br>In order to get the correct byte order for this read operation,
     * <br>see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a signed 32-bit/4-byte value read from the &#64;stream or `0` if an error occurred.
    */
    public int readInt32(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataInputStream.INST().g_data_input_stream_read_int32(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Reads a 64-bit/8-byte value from &#64;stream.
     * <br>
     * <br>In order to get the correct byte order for this read operation,
     * <br>see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a signed 64-bit/8-byte value read from &#64;stream or `0` if an error occurred.
    */
    public long readInt64(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataInputStream.INST().g_data_input_stream_read_int64(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Reads a line from the data input stream.  Note that no encoding
     * <br>checks or conversion is performed; the input is not guaranteed to
     * <br>be UTF-8, and may in fact have embedded NUL characters.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param length a &#35;gsize to get the length of the data read in.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return   a NUL terminated byte array with the line that was read in  (without the newlines).  Set &#64;length to a &#35;gsize to get the length  of the read line.  On an error, it will return %NULL and &#64;error  will be set. If there's no content to read, it will still return  %NULL, but &#64;error won't be set.
    */
    public ch.bailu.gtk.type.Str readLine(@Nullable ch.bailu.gtk.type.Int64 length, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDataInputStream.INST().g_data_input_stream_read_line(asCPointer(), asCPointer(length), asCPointer(cancellable), 0L)));
    }

    /**
     * The asynchronous version of g_data_input_stream_read_line().  It is
     * <br>an error to have two outstanding calls to this function.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You
     * <br>can then call g_data_input_stream_read_line_finish() to get
     * <br>the result of the operation.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied.
     * @param user_data the data to pass to callback function.
    */
    public void readLineAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDataInputStream.INST().g_data_input_stream_read_line_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readLineAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous call started by
     * <br>g_data_input_stream_read_line_async().  Note the warning about
     * <br>string encoding in g_data_input_stream_read_line() applies here as
     * <br>well.
     * @param result the &#35;GAsyncResult that was provided to the callback.
     * @param length a &#35;gsize to get the length of the data read in.
     * @return   a NUL-terminated byte array with the line that was read in  (without the newlines).  Set &#64;length to a &#35;gsize to get the length  of the read line.  On an error, it will return %NULL and &#64;error  will be set. If there's no content to read, it will still return  %NULL, but &#64;error won't be set.
    */
    public ch.bailu.gtk.type.Str readLineFinish(@Nonnull AsyncResult result, @Nullable ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDataInputStream.INST().g_data_input_stream_read_line_finish(asCPointer(), asCPointerNotNull(result), asCPointer(length), 0L)));
    }

    /**
     * Finish an asynchronous call started by
     * <br>g_data_input_stream_read_line_async().
     * @param result the &#35;GAsyncResult that was provided to the callback.
     * @param length a &#35;gsize to get the length of the data read in.
     * @return a string with the line that  was read in (without the newlines).  Set &#64;length to a &#35;gsize to  get the length of the read line.  On an error, it will return  %NULL and &#64;error will be set. For UTF-8 conversion errors, the set  error domain is %G_CONVERT_ERROR.  If there's no content to read,  it will still return %NULL, but &#64;error won't be set.
    */
    public ch.bailu.gtk.type.Str readLineFinishUtf8(@Nonnull AsyncResult result, @Nullable ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDataInputStream.INST().g_data_input_stream_read_line_finish_utf8(asCPointer(), asCPointerNotNull(result), asCPointer(length), 0L)));
    }

    /**
     * Reads a UTF-8 encoded line from the data input stream.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param length a &#35;gsize to get the length of the data read in.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a NUL terminated UTF-8 string  with the line that was read in (without the newlines).  Set  &#64;length to a &#35;gsize to get the length of the read line.  On an  error, it will return %NULL and &#64;error will be set.  For UTF-8  conversion errors, the set error domain is %G_CONVERT_ERROR.  If  there's no content to read, it will still return %NULL, but &#64;error  won't be set.
    */
    public ch.bailu.gtk.type.Str readLineUtf8(@Nullable ch.bailu.gtk.type.Int64 length, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDataInputStream.INST().g_data_input_stream_read_line_utf8(asCPointer(), asCPointer(length), asCPointer(cancellable), 0L)));
    }

    /**
     * Reads an unsigned 16-bit/2-byte value from &#64;stream.
     * <br>
     * <br>In order to get the correct byte order for this read operation,
     * <br>see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return an unsigned 16-bit/2-byte value read from the &#64;stream or `0` if an error occurred.
    */
    public int readUint16(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataInputStream.INST().g_data_input_stream_read_uint16(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Reads an unsigned 32-bit/4-byte value from &#64;stream.
     * <br>
     * <br>In order to get the correct byte order for this read operation,
     * <br>see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return an unsigned 32-bit/4-byte value read from the &#64;stream or `0` if an error occurred.
    */
    public int readUint32(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataInputStream.INST().g_data_input_stream_read_uint32(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Reads an unsigned 64-bit/8-byte value from &#64;stream.
     * <br>
     * <br>In order to get the correct byte order for this read operation,
     * <br>see g_data_input_stream_get_byte_order().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return an unsigned 64-bit/8-byte read from &#64;stream or `0` if an error occurred.
    */
    public long readUint64(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataInputStream.INST().g_data_input_stream_read_uint64(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Reads a string from the data input stream, up to the first
     * <br>occurrence of any of the stop characters.
     * <br>
     * <br>In contrast to g_data_input_stream_read_until(), this function
     * <br>does not consume the stop character. You have to use
     * <br>g_data_input_stream_read_byte() to get it before calling
     * <br>g_data_input_stream_read_upto() again.
     * <br>
     * <br>Note that &#64;stop_chars may contain '&#92;0' if &#64;stop_chars_len is
     * <br>specified.
     * <br>
     * <br>The returned string will always be nul-terminated on success.
     * @param stop_chars characters to terminate the read
     * @param stop_chars_len length of &#64;stop_chars. May be -1 if &#64;stop_chars is     nul-terminated
     * @param length a &#35;gsize to get the length of the data read in
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return a string with the data that was read     before encountering any of the stop characters. Set &#64;length to     a &#35;gsize to get the length of the string. This function will     return %NULL on an error
    */
    public ch.bailu.gtk.type.Str readUpto(@Nonnull ch.bailu.gtk.type.Str stop_chars, long stop_chars_len, @Nullable ch.bailu.gtk.type.Int64 length, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDataInputStream.INST().g_data_input_stream_read_upto(asCPointer(), asCPointerNotNull(stop_chars), stop_chars_len, asCPointer(length), asCPointer(cancellable), 0L)));
    }

    /**
     * Reads a string from the data input stream, up to the first
     * <br>occurrence of any of the stop characters.
     * <br>
     * <br>In contrast to g_data_input_stream_read_until(), this function
     * <br>does not consume the stop character. You have to use
     * <br>g_data_input_stream_read_byte() to get it before calling
     * <br>g_data_input_stream_read_upto() again.
     * <br>
     * <br>Note that &#64;stop_chars may contain '&#92;0' if &#64;stop_chars_len is
     * <br>specified.
     * <br>
     * <br>The returned string will always be nul-terminated on success.
     * @param stop_chars characters to terminate the read
     * @param stop_chars_len length of &#64;stop_chars. May be -1 if &#64;stop_chars is     nul-terminated
     * @param length a &#35;gsize to get the length of the data read in
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return a string with the data that was read     before encountering any of the stop characters. Set &#64;length to     a &#35;gsize to get the length of the string. This function will     return %NULL on an error
    */
    public ch.bailu.gtk.type.Str readUpto(String stop_chars, long stop_chars_len, @Nullable ch.bailu.gtk.type.Int64 length, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDataInputStream.INST().g_data_input_stream_read_upto(asCPointer(), stop_chars, stop_chars_len, asCPointer(length), asCPointer(cancellable), 0L)));
    }

    /**
     * The asynchronous version of g_data_input_stream_read_upto().
     * <br>It is an error to have two outstanding calls to this function.
     * <br>
     * <br>In contrast to g_data_input_stream_read_until(), this function
     * <br>does not consume the stop character. You have to use
     * <br>g_data_input_stream_read_byte() to get it before calling
     * <br>g_data_input_stream_read_upto() again.
     * <br>
     * <br>Note that &#64;stop_chars may contain '&#92;0' if &#64;stop_chars_len is
     * <br>specified.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You
     * <br>can then call g_data_input_stream_read_upto_finish() to get
     * <br>the result of the operation.
     * @param stop_chars characters to terminate the read
     * @param stop_chars_len length of &#64;stop_chars. May be -1 if &#64;stop_chars is     nul-terminated
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readUptoAsync(@Nonnull ch.bailu.gtk.type.Str stop_chars, long stop_chars_len, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDataInputStream.INST().g_data_input_stream_read_upto_async(asCPointer(), asCPointerNotNull(stop_chars), stop_chars_len, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readUptoAsync", callback), asCPointer(user_data));
    }

    /**
     * The asynchronous version of g_data_input_stream_read_upto().
     * <br>It is an error to have two outstanding calls to this function.
     * <br>
     * <br>In contrast to g_data_input_stream_read_until(), this function
     * <br>does not consume the stop character. You have to use
     * <br>g_data_input_stream_read_byte() to get it before calling
     * <br>g_data_input_stream_read_upto() again.
     * <br>
     * <br>Note that &#64;stop_chars may contain '&#92;0' if &#64;stop_chars_len is
     * <br>specified.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You
     * <br>can then call g_data_input_stream_read_upto_finish() to get
     * <br>the result of the operation.
     * @param stop_chars characters to terminate the read
     * @param stop_chars_len length of &#64;stop_chars. May be -1 if &#64;stop_chars is     nul-terminated
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readUptoAsync(String stop_chars, long stop_chars_len, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDataInputStream.INST().g_data_input_stream_read_upto_async(asCPointer(), stop_chars, stop_chars_len, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readUptoAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous call started by
     * <br>g_data_input_stream_read_upto_async().
     * <br>
     * <br>Note that this function does not consume the stop character. You
     * <br>have to use g_data_input_stream_read_byte() to get it before calling
     * <br>g_data_input_stream_read_upto_async() again.
     * <br>
     * <br>The returned string will always be nul-terminated on success.
     * @param result the &#35;GAsyncResult that was provided to the callback
     * @param length a &#35;gsize to get the length of the data read in
     * @return a string with the data that was read     before encountering any of the stop characters. Set &#64;length to     a &#35;gsize to get the length of the string. This function will     return %NULL on an error.
    */
    public ch.bailu.gtk.type.Str readUptoFinish(@Nonnull AsyncResult result, @Nullable ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDataInputStream.INST().g_data_input_stream_read_upto_finish(asCPointer(), asCPointerNotNull(result), asCPointer(length), 0L)));
    }

    /**
     * This function sets the byte order for the given &#64;stream. All subsequent
     * <br>reads from the &#64;stream will be read in the given &#64;order.
     * @param order a &#35;GDataStreamByteOrder to set.
    */
    public void setByteOrder(int order)  {
        JnaDataInputStream.INST().g_data_input_stream_set_byte_order(asCPointer(), order);
    }

    /**
     * Sets the newline type for the &#64;stream.
     * <br>
     * <br>Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a read
     * <br>chunk ends in &quot;CR&quot; we must read an additional byte to know if this is &quot;CR&quot; or
     * <br>&quot;CR LF&quot;, and this might block if there is no more data available.
     * @param type the type of new line return as &#35;GDataStreamNewlineType.
    */
    public void setNewlineType(int type)  {
        JnaDataInputStream.INST().g_data_input_stream_set_newline_type(asCPointer(), type);
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaDataInputStream.INST().g_data_input_stream_get_type(); 
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

[MethodModel:cb-return-value-not-supported:readByte:[ParameterModel:java-type-not-supported:{G_::{c:guchar}}:{j:}]]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:readUntil:[ParameterModel:Supported:{Gw:Str:{c:char*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:readUntilAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:readUntilFinish:[ParameterModel:Supported:{Gw:Str:{c:char*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
