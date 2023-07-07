/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * GFileInputStream provides input streams that take their
 * <br>content from a file.
 * <br>
 * <br>GFileInputStream implements &#35;GSeekable, which allows the input
 * <br>stream to jump to arbitrary positions in the file, provided the
 * <br>filesystem of the file allows it. To find the position of a file
 * <br>input stream, use g_seekable_tell(). To find out if a file input
 * <br>stream supports seeking, use g_seekable_can_seek().
 * <br>To position a file input stream, use g_seekable_seek().
 * <p><a href="https://docs.gtk.org/gio/class.FileInputStream.html">https://docs.gtk.org/gio/class.FileInputStream.html</a></p>
*/
public class FileInputStream extends InputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileInputStream.class.getCanonicalName());
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
    
    private static JnaFileInputStream.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaFileInputStream.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public FileInputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Queries a file input stream the given &#64;attributes. This function blocks
     * <br>while querying the stream. For the asynchronous (non-blocking) version
     * <br>of this function, see g_file_input_stream_query_info_async(). While the
     * <br>stream is blocked, the stream will set the pending flag internally, and
     * <br>any other operations on the stream will fail with %G_IO_ERROR_PENDING.
     * @param attributes a file attribute query string.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;GFileInfo, or %NULL on error.
    */
    public FileInfo queryInfo(@Nonnull ch.bailu.gtk.type.Str attributes, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFileInputStream.INST().g_file_input_stream_query_info(asCPointer(), asCPointerNotNull(attributes), asCPointer(cancellable), 0L)));
    }

    /**
     * Queries a file input stream the given &#64;attributes. This function blocks
     * <br>while querying the stream. For the asynchronous (non-blocking) version
     * <br>of this function, see g_file_input_stream_query_info_async(). While the
     * <br>stream is blocked, the stream will set the pending flag internally, and
     * <br>any other operations on the stream will fail with %G_IO_ERROR_PENDING.
     * @param attributes a file attribute query string.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;GFileInfo, or %NULL on error.
    */
    public FileInfo queryInfo(String attributes, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFileInputStream.INST().g_file_input_stream_query_info(asCPointer(), attributes, asCPointer(cancellable), 0L)));
    }

    /**
     * Queries the stream information asynchronously.
     * <br>When the operation is finished &#64;callback will be called.
     * <br>You can then call g_file_input_stream_query_info_finish()
     * <br>to get the result of the operation.
     * <br>
     * <br>For the synchronous version of this function,
     * <br>see g_file_input_stream_query_info().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be set
     * @param attributes a file attribute query string.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryInfoAsync(@Nonnull ch.bailu.gtk.type.Str attributes, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFileInputStream.INST().g_file_input_stream_query_info_async(asCPointer(), asCPointerNotNull(attributes), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Queries the stream information asynchronously.
     * <br>When the operation is finished &#64;callback will be called.
     * <br>You can then call g_file_input_stream_query_info_finish()
     * <br>to get the result of the operation.
     * <br>
     * <br>For the synchronous version of this function,
     * <br>see g_file_input_stream_query_info().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be set
     * @param attributes a file attribute query string.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryInfoAsync(String attributes, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFileInputStream.INST().g_file_input_stream_query_info_async(asCPointer(), attributes, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous info query operation.
     * @param result a &#35;GAsyncResult.
     * @return &#35;GFileInfo.
    */
    public FileInfo queryInfoFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFileInputStream.INST().g_file_input_stream_query_info_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaFileInputStream.INST().g_file_input_stream_get_type(); 
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
