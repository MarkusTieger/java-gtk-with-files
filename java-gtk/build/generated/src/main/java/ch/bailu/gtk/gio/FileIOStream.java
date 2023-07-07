/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * GFileIOStream provides io streams that both read and write to the same
 * <br>file handle.
 * <br>
 * <br>GFileIOStream implements &#35;GSeekable, which allows the io
 * <br>stream to jump to arbitrary positions in the file and to truncate
 * <br>the file, provided the filesystem of the file supports these
 * <br>operations.
 * <br>
 * <br>To find the position of a file io stream, use
 * <br>g_seekable_tell().
 * <br>
 * <br>To find out if a file io stream supports seeking, use g_seekable_can_seek().
 * <br>To position a file io stream, use g_seekable_seek().
 * <br>To find out if a file io stream supports truncating, use
 * <br>g_seekable_can_truncate(). To truncate a file io
 * <br>stream, use g_seekable_truncate().
 * <br>
 * <br>The default implementation of all the &#35;GFileIOStream operations
 * <br>and the implementation of &#35;GSeekable just call into the same operations
 * <br>on the output stream.
 * <p><a href="https://docs.gtk.org/gio/class.FileIOStream.html">https://docs.gtk.org/gio/class.FileIOStream.html</a></p>
*/
public class FileIOStream extends IOStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileIOStream.class.getCanonicalName());
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
    
    private static JnaFileIOStream.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaFileIOStream.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public FileIOStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the entity tag for the file when it has been written.
     * <br>This must be called after the stream has been written
     * <br>and closed, as the etag can change while writing.
     * @return the entity tag for the stream.
    */
    public ch.bailu.gtk.type.Str getEtag()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileIOStream.INST().g_file_io_stream_get_etag(asCPointer())));
    }

    /**
     * Queries a file io stream for the given &#64;attributes.
     * <br>This function blocks while querying the stream. For the asynchronous
     * <br>version of this function, see g_file_io_stream_query_info_async().
     * <br>While the stream is blocked, the stream will set the pending flag
     * <br>internally, and any other operations on the stream will fail with
     * <br>%G_IO_ERROR_PENDING.
     * <br>
     * <br>Can fail if the stream was already closed (with &#64;error being set to
     * <br>%G_IO_ERROR_CLOSED), the stream has pending operations (with &#64;error being
     * <br>set to %G_IO_ERROR_PENDING), or if querying info is not supported for
     * <br>the stream's interface (with &#64;error being set to %G_IO_ERROR_NOT_SUPPORTED). I
     * <br>all cases of failure, %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and %NULL will
     * <br>be returned.
     * @param attributes a file attribute query string.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;GFileInfo for the &#64;stream, or %NULL on error.
    */
    public FileInfo queryInfo(@Nonnull ch.bailu.gtk.type.Str attributes, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFileIOStream.INST().g_file_io_stream_query_info(asCPointer(), asCPointerNotNull(attributes), asCPointer(cancellable), 0L)));
    }

    /**
     * Queries a file io stream for the given &#64;attributes.
     * <br>This function blocks while querying the stream. For the asynchronous
     * <br>version of this function, see g_file_io_stream_query_info_async().
     * <br>While the stream is blocked, the stream will set the pending flag
     * <br>internally, and any other operations on the stream will fail with
     * <br>%G_IO_ERROR_PENDING.
     * <br>
     * <br>Can fail if the stream was already closed (with &#64;error being set to
     * <br>%G_IO_ERROR_CLOSED), the stream has pending operations (with &#64;error being
     * <br>set to %G_IO_ERROR_PENDING), or if querying info is not supported for
     * <br>the stream's interface (with &#64;error being set to %G_IO_ERROR_NOT_SUPPORTED). I
     * <br>all cases of failure, %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and %NULL will
     * <br>be returned.
     * @param attributes a file attribute query string.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;GFileInfo for the &#64;stream, or %NULL on error.
    */
    public FileInfo queryInfo(String attributes, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFileIOStream.INST().g_file_io_stream_query_info(asCPointer(), attributes, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously queries the &#64;stream for a &#35;GFileInfo. When completed,
     * <br>&#64;callback will be called with a &#35;GAsyncResult which can be used to
     * <br>finish the operation with g_file_io_stream_query_info_finish().
     * <br>
     * <br>For the synchronous version of this function, see
     * <br>g_file_io_stream_query_info().
     * @param attributes a file attribute query string.
     * @param io_priority the [I/O priority][gio-GIOScheduler] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryInfoAsync(@Nonnull ch.bailu.gtk.type.Str attributes, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFileIOStream.INST().g_file_io_stream_query_info_async(asCPointer(), asCPointerNotNull(attributes), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously queries the &#64;stream for a &#35;GFileInfo. When completed,
     * <br>&#64;callback will be called with a &#35;GAsyncResult which can be used to
     * <br>finish the operation with g_file_io_stream_query_info_finish().
     * <br>
     * <br>For the synchronous version of this function, see
     * <br>g_file_io_stream_query_info().
     * @param attributes a file attribute query string.
     * @param io_priority the [I/O priority][gio-GIOScheduler] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryInfoAsync(String attributes, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFileIOStream.INST().g_file_io_stream_query_info_async(asCPointer(), attributes, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Finalizes the asynchronous query started
     * <br>by g_file_io_stream_query_info_async().
     * @param result a &#35;GAsyncResult.
     * @return A &#35;GFileInfo for the finished query.
    */
    public FileInfo queryInfoFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFileIOStream.INST().g_file_io_stream_query_info_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaFileIOStream.INST().g_file_io_stream_get_type(); 
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
