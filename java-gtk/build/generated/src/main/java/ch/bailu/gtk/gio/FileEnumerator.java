/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GFileEnumerator allows you to operate on a set of &#35;GFiles,
 * <br>returning a &#35;GFileInfo structure for each file enumerated (e.g.
 * <br>g_file_enumerate_children() will return a &#35;GFileEnumerator for each
 * <br>of the children within a directory).
 * <br>
 * <br>To get the next file's information from a &#35;GFileEnumerator, use
 * <br>g_file_enumerator_next_file() or its asynchronous version,
 * <br>g_file_enumerator_next_files_async(). Note that the asynchronous
 * <br>version will return a list of &#35;GFileInfos, whereas the
 * <br>synchronous will only return the next file in the enumerator.
 * <br>
 * <br>The ordering of returned files is unspecified for non-Unix
 * <br>platforms; for more information, see g_dir_read_name().  On Unix,
 * <br>when operating on local files, returned files will be sorted by
 * <br>inode number.  Effectively you can assume that the ordering of
 * <br>returned files will be stable between successive calls (and
 * <br>applications) assuming the directory is unchanged.
 * <br>
 * <br>If your application needs a specific ordering, such as by name or
 * <br>modification time, you will have to implement that in your
 * <br>application code.
 * <br>
 * <br>To close a &#35;GFileEnumerator, use g_file_enumerator_close(), or
 * <br>its asynchronous version, g_file_enumerator_close_async(). Once
 * <br>a &#35;GFileEnumerator is closed, no further actions may be performed
 * <br>on it, and it should be freed with g_object_unref().
 * <p><a href="https://docs.gtk.org/gio/class.FileEnumerator.html">https://docs.gtk.org/gio/class.FileEnumerator.html</a></p>
*/
public class FileEnumerator extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileEnumerator.class.getCanonicalName());
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
    
    private static JnaFileEnumerator.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaFileEnumerator.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public FileEnumerator(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Releases all resources used by this enumerator, making the
     * <br>enumerator return %G_IO_ERROR_CLOSED on all calls.
     * <br>
     * <br>This will be automatically called when the last reference
     * <br>is dropped, but you might want to call this function to make
     * <br>sure resources are released as early as possible.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return &#35;TRUE on success or &#35;FALSE on error.
    */
    public boolean close(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFileEnumerator.INST().g_file_enumerator_close(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously closes the file enumerator.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned in
     * <br>g_file_enumerator_close_finish().
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void closeAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFileEnumerator.INST().g_file_enumerator_close_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "closeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes closing a file enumerator, started from g_file_enumerator_close_async().
     * <br>
     * <br>If the file enumerator was already closed when g_file_enumerator_close_async()
     * <br>was called, then this function will report %G_IO_ERROR_CLOSED in &#64;error, and
     * <br>return %FALSE. If the file enumerator had pending operation when the close
     * <br>operation was started, then this function will report %G_IO_ERROR_PENDING, and
     * <br>return %FALSE.  If &#64;cancellable was not %NULL, then the operation may have been
     * <br>cancelled by triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and %FALSE will be
     * <br>returned.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the close operation has finished successfully.
    */
    public boolean closeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFileEnumerator.INST().g_file_enumerator_close_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Return a new &#35;GFile which refers to the file named by &#64;info in the source
     * <br>directory of &#64;enumerator.  This function is primarily intended to be used
     * <br>inside loops with g_file_enumerator_next_file().
     * <br>
     * <br>To use this, %G_FILE_ATTRIBUTE_STANDARD_NAME must have been listed in the
     * <br>attributes list used when creating the &#35;GFileEnumerator.
     * <br>
     * <br>This is a convenience method that's equivalent to:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   gchar *name = g_file_info_get_name (info);
     *   GFile *child = g_file_get_child (g_file_enumerator_get_container (enumr),
     *                                    name);
     * </pre>
     * @param info a &#35;GFileInfo gotten from g_file_enumerator_next_file()   or the async equivalents.
     * @return a &#35;GFile for the &#35;GFileInfo passed it.
    */
    public File getChild(@Nonnull FileInfo info)  {
        return new File(new PointerContainer(JnaFileEnumerator.INST().g_file_enumerator_get_child(asCPointer(), asCPointerNotNull(info))));
    }

    /**
     * Get the &#35;GFile container which is being enumerated.
     * @return the &#35;GFile which is being enumerated.
    */
    public File getContainer()  {
        return new File(new PointerContainer(JnaFileEnumerator.INST().g_file_enumerator_get_container(asCPointer())));
    }

    /**
     * Checks if the file enumerator has pending operations.
     * @return %TRUE if the &#64;enumerator has pending operations.
    */
    public boolean hasPending()  {
        return JnaFileEnumerator.INST().g_file_enumerator_has_pending(asCPointer());
    }

    /**
     * Checks if the file enumerator has been closed.
     * @return %TRUE if the &#64;enumerator is closed.
    */
    public boolean isClosed()  {
        return JnaFileEnumerator.INST().g_file_enumerator_is_closed(asCPointer());
    }

    /**
     * Returns information for the next file in the enumerated object.
     * <br>Will block until the information is available. The &#35;GFileInfo
     * <br>returned from this function will contain attributes that match the
     * <br>attribute string that was passed when the &#35;GFileEnumerator was created.
     * <br>
     * <br>See the documentation of &#35;GFileEnumerator for information about the
     * <br>order of returned files.
     * <br>
     * <br>On error, returns %NULL and sets &#64;error to the error. If the
     * <br>enumerator is at the end, %NULL will be returned and &#64;error will
     * <br>be unset.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return A &#35;GFileInfo or %NULL on error    or end of enumerator.  Free the returned object with    g_object_unref() when no longer needed.
    */
    public FileInfo nextFile(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFileEnumerator.INST().g_file_enumerator_next_file(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Request information for a number of files from the enumerator asynchronously.
     * <br>When all i/o for the operation is finished the &#64;callback will be called with
     * <br>the requested information.
     * <br>
     * <br>See the documentation of &#35;GFileEnumerator for information about the
     * <br>order of returned files.
     * <br>
     * <br>The callback can be called with less than &#64;num_files files in case of error
     * <br>or at the end of the enumerator. In case of a partial error the callback will
     * <br>be called with any succeeding items and no error, and on the next request the
     * <br>error will be reported. If a request is cancelled the callback will be called
     * <br>with %G_IO_ERROR_CANCELLED.
     * <br>
     * <br>During an async request no other sync and async calls are allowed, and will
     * <br>result in %G_IO_ERROR_PENDING errors.
     * <br>
     * <br>Any outstanding i/o request with higher priority (lower numerical value) will
     * <br>be executed before an outstanding request with lower priority. Default
     * <br>priority is %G_PRIORITY_DEFAULT.
     * @param num_files the number of file info objects to request
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void nextFilesAsync(int num_files, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFileEnumerator.INST().g_file_enumerator_next_files_async(asCPointer(), num_files, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "nextFilesAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes the asynchronous operation started with g_file_enumerator_next_files_async().
     * @param result a &#35;GAsyncResult.
     * @return a &#35;GList of &#35;GFileInfos. You must free the list with     g_list_free() and unref the infos with g_object_unref() when you're     done with them.
    */
    public ch.bailu.gtk.glib.List nextFilesFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaFileEnumerator.INST().g_file_enumerator_next_files_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Sets the file enumerator as having pending operations.
     * @param pending a boolean value.
    */
    public void setPending(boolean pending)  {
        JnaFileEnumerator.INST().g_file_enumerator_set_pending(asCPointer(), pending);
    }

    public static long getTypeID() { 
        return JnaFileEnumerator.INST().g_file_enumerator_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:iterate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GFileInfo**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GFile**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
