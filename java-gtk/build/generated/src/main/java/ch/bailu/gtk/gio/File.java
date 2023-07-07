/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GFile is a high level abstraction for manipulating files on a
 * <br>virtual file system. &#35;GFiles are lightweight, immutable objects
 * <br>that do no I/O upon creation. It is necessary to understand that
 * <br>&#35;GFile objects do not represent files, merely an identifier for a
 * <br>file. All file content I/O is implemented as streaming operations
 * <br>(see &#35;GInputStream and &#35;GOutputStream).
 * <br>
 * <br>To construct a &#35;GFile, you can use:
 * <br>- g_file_new_for_path() if you have a path.
 * <br>- g_file_new_for_uri() if you have a URI.
 * <br>- g_file_new_for_commandline_arg() for a command line argument.
 * <br>- g_file_new_tmp() to create a temporary file from a template.
 * <br>- g_file_new_tmp_async() to asynchronously create a temporary file.
 * <br>- g_file_new_tmp_dir_async() to asynchronously create a temporary directory.
 * <br>- g_file_parse_name() from a UTF-8 string gotten from g_file_get_parse_name().
 * <br>- g_file_new_build_filename() to create a file from path elements.
 * <br>
 * <br>One way to think of a &#35;GFile is as an abstraction of a pathname. For
 * <br>normal files the system pathname is what is stored internally, but as
 * <br>&#35;GFiles are extensible it could also be something else that corresponds
 * <br>to a pathname in a userspace implementation of a filesystem.
 * <br>
 * <br>&#35;GFiles make up hierarchies of directories and files that correspond to
 * <br>the files on a filesystem. You can move through the file system with
 * <br>&#35;GFile using g_file_get_parent() to get an identifier for the parent
 * <br>directory, g_file_get_child() to get a child within a directory,
 * <br>g_file_resolve_relative_path() to resolve a relative path between two
 * <br>&#35;GFiles. There can be multiple hierarchies, so you may not end up at
 * <br>the same root if you repeatedly call g_file_get_parent() on two different
 * <br>files.
 * <br>
 * <br>All &#35;GFiles have a basename (get with g_file_get_basename()). These names
 * <br>are byte strings that are used to identify the file on the filesystem
 * <br>(relative to its parent directory) and there is no guarantees that they
 * <br>have any particular charset encoding or even make any sense at all. If
 * <br>you want to use filenames in a user interface you should use the display
 * <br>name that you can get by requesting the
 * <br>%G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME attribute with g_file_query_info().
 * <br>This is guaranteed to be in UTF-8 and can be used in a user interface.
 * <br>But always store the real basename or the &#35;GFile to use to actually
 * <br>access the file, because there is no way to go from a display name to
 * <br>the actual name.
 * <br>
 * <br>Using &#35;GFile as an identifier has the same weaknesses as using a path
 * <br>in that there may be multiple aliases for the same file. For instance,
 * <br>hard or soft links may cause two different &#35;GFiles to refer to the same
 * <br>file. Other possible causes for aliases are: case insensitive filesystems,
 * <br>short and long names on FAT/NTFS, or bind mounts in Linux. If you want to
 * <br>check if two &#35;GFiles point to the same file you can query for the
 * <br>%G_FILE_ATTRIBUTE_ID_FILE attribute. Note that &#35;GFile does some trivial
 * <br>canonicalization of pathnames passed in, so that trivial differences in
 * <br>the path string used at creation (duplicated slashes, slash at end of
 * <br>path, &quot;.&quot; or &quot;..&quot; path segments, etc) does not create different &#35;GFiles.
 * <br>
 * <br>Many &#35;GFile operations have both synchronous and asynchronous versions
 * <br>to suit your application. Asynchronous versions of synchronous functions
 * <br>simply have _async() appended to their function names. The asynchronous
 * <br>I/O functions call a &#35;GAsyncReadyCallback which is then used to finalize
 * <br>the operation, producing a GAsyncResult which is then passed to the
 * <br>function's matching _finish() operation.
 * <br>
 * <br>It is highly recommended to use asynchronous calls when running within a
 * <br>shared main loop, such as in the main thread of an application. This avoids
 * <br>I/O operations blocking other sources on the main loop from being dispatched.
 * <br>Synchronous I/O operations should be performed from worker threads. See the
 * <br>[introduction to asynchronous programming section][async-programming] for
 * <br>more.
 * <br>
 * <br>Some &#35;GFile operations almost always take a noticeable amount of time, and
 * <br>so do not have synchronous analogs. Notable cases include:
 * <br>- g_file_mount_mountable() to mount a mountable file.
 * <br>- g_file_unmount_mountable_with_operation() to unmount a mountable file.
 * <br>- g_file_eject_mountable_with_operation() to eject a mountable file.
 * <br>
 * <br>&#35;&#35; Entity Tags &#35; {&#35;gfile-etag}
 * <br>
 * <br>One notable feature of &#35;GFiles are entity tags, or &quot;etags&quot; for
 * <br>short. Entity tags are somewhat like a more abstract version of the
 * <br>traditional mtime, and can be used to quickly determine if the file
 * <br>has been modified from the version on the file system. See the
 * <br>HTTP 1.1
 * <br>[specification](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html)
 * <br>for HTTP Etag headers, which are a very similar concept.
 * <p><a href="https://docs.gtk.org/gio/iface.File.html">https://docs.gtk.org/gio/iface.File.html</a></p>
*/
public class File extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(File.class.getCanonicalName());
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
    
    private static JnaFile.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaFile.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFileMeasureProgressCallback {
        /**
         * This callback type is used by g_file_measure_disk_usage() to make
         * <br>periodic progress reports when measuring the amount of disk spaced
         * <br>used by a directory.
         * <br>
         * <br>These calls are made on a best-effort basis and not all types of
         * <br>&#35;GFile will support them.  At the minimum, however, one call will
         * <br>always be made immediately.
         * <br>
         * <br>In the case that there is no support, &#64;reporting will be set to
         * <br>%FALSE (and the other values undefined) and no further calls will be
         * <br>made.  Otherwise, the &#64;reporting will be %TRUE and the other values
         * <br>all-zeros during the first (immediate) call.  In this way, you can
         * <br>know which type of progress UI to show without a delay.
         * <br>
         * <br>For g_file_measure_disk_usage() the callback is made directly.  For
         * <br>g_file_measure_disk_usage_async() the callback is made via the
         * <br>default main context of the calling thread (ie: the same way that the
         * <br>final async result would be reported).
         * <br>
         * <br>&#64;current_size is in the same units as requested by the operation (see
         * <br>%G_FILE_MEASURE_APPARENT_SIZE).
         * <br>
         * <br>The frequency of the updates is implementation defined, but is
         * <br>ideally about once every 200ms.
         * <br>
         * <br>The last progress callback may or may not be equal to the final
         * <br>result.  Always check the async result to get the final value.
         * @param reporting %TRUE if more reports will come
         * @param current_size the current cumulative size measurement
         * @param num_dirs the number of directories visited so far
         * @param num_files the number of non-directory files encountered
         * @param user_data the data passed to the original request for this callback
        */
        void onFileMeasureProgressCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, boolean reporting, long current_size, long num_dirs, long num_files, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaFile.OnFileMeasureProgressCallback toOnFileMeasureProgressCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnFileMeasureProgressCallback in) {
        JnaFile.OnFileMeasureProgressCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_reporting, _current_size, _num_dirs, _num_files, _user_data) -> in.onFileMeasureProgressCallback(__callback, _reporting, _current_size, _num_dirs, _num_files, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public File(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets an output stream for appending data to the file.
     * <br>If the file doesn't already exist it is created.
     * <br>
     * <br>By default files created are generally readable by everyone,
     * <br>but if you pass %G_FILE_CREATE_PRIVATE in &#64;flags the file
     * <br>will be made readable only to the current user, to the level that
     * <br>is supported on the target filesystem.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>Some file systems don't allow all file names, and may return an
     * <br>%G_IO_ERROR_INVALID_FILENAME error. If the file is a directory the
     * <br>%G_IO_ERROR_IS_DIRECTORY error will be returned. Other errors are
     * <br>possible too, and depend on what kind of filesystem the file is on.
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileOutputStream, or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileOutputStream appendTo(int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileOutputStream(new PointerContainer(JnaFile.INST().g_file_append_to(asCPointer(), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously opens &#64;file for appending.
     * <br>
     * <br>For more details, see g_file_append_to() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_append_to_finish() to get the result
     * <br>of the operation.
     * @param flags a set of &#35;GFileCreateFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void appendToAsync(int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_append_to_async(asCPointer(), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "appendToAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file append operation started with
     * <br>g_file_append_to_async().
     * @param res &#35;GAsyncResult
     * @return a valid &#35;GFileOutputStream   or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileOutputStream appendToFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileOutputStream(new PointerContainer(JnaFile.INST().g_file_append_to_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Prepares the file attribute query string for copying to &#64;file.
     * <br>
     * <br>This function prepares an attribute query string to be
     * <br>passed to g_file_query_info() to get a list of attributes
     * <br>normally copied with the file (see g_file_copy_attributes()
     * <br>for the detailed description). This function is used by the
     * <br>implementation of g_file_copy_attributes() and is useful
     * <br>when one needs to query and set the attributes in two
     * <br>stages (e.g., for recursive move of a directory).
     * @param flags a set of &#35;GFileCopyFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return an attribute query string for g_file_query_info(),   or %NULL if an error occurs.
    */
    public ch.bailu.gtk.type.Str buildAttributeListForCopy(int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_build_attribute_list_for_copy(asCPointer(), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Copies the file attributes from &#64;source to &#64;destination.
     * <br>
     * <br>Normally only a subset of the file attributes are copied,
     * <br>those that are copies in a normal file copy operation
     * <br>(which for instance does not include e.g. owner). However
     * <br>if %G_FILE_COPY_ALL_METADATA is specified in &#64;flags, then
     * <br>all the metadata that is possible to copy is copied. This
     * <br>is useful when implementing move by copy + delete source.
     * @param destination a &#35;GFile to copy attributes to
     * @param flags a set of &#35;GFileCopyFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the attributes were copied successfully,   %FALSE otherwise.
    */
    public boolean copyAttributes(@Nonnull File destination, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_copy_attributes(asCPointer(), asCPointerNotNull(destination), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Finishes copying the file started with g_file_copy_async().
     * @param res a &#35;GAsyncResult
     * @return a %TRUE on success, %FALSE on error.
    */
    public boolean copyFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_copy_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Creates a new file and returns an output stream for writing to it.
     * <br>The file must not already exist.
     * <br>
     * <br>By default files created are generally readable by everyone,
     * <br>but if you pass %G_FILE_CREATE_PRIVATE in &#64;flags the file
     * <br>will be made readable only to the current user, to the level
     * <br>that is supported on the target filesystem.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If a file or directory with this name already exists the
     * <br>%G_IO_ERROR_EXISTS error will be returned. Some file systems don't
     * <br>allow all file names, and may return an %G_IO_ERROR_INVALID_FILENAME
     * <br>error, and if the name is to long %G_IO_ERROR_FILENAME_TOO_LONG will
     * <br>be returned. Other errors are possible too, and depend on what kind
     * <br>of filesystem the file is on.
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileOutputStream for the newly created   file, or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileOutputStream create(int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileOutputStream(new PointerContainer(JnaFile.INST().g_file_create(asCPointer(), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously creates a new file and returns an output stream
     * <br>for writing to it. The file must not already exist.
     * <br>
     * <br>For more details, see g_file_create() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_create_finish() to get the result
     * <br>of the operation.
     * @param flags a set of &#35;GFileCreateFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void createAsync(int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_create_async(asCPointer(), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "createAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file create operation started with
     * <br>g_file_create_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFileOutputStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileOutputStream createFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileOutputStream(new PointerContainer(JnaFile.INST().g_file_create_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Creates a new file and returns a stream for reading and
     * <br>writing to it. The file must not already exist.
     * <br>
     * <br>By default files created are generally readable by everyone,
     * <br>but if you pass %G_FILE_CREATE_PRIVATE in &#64;flags the file
     * <br>will be made readable only to the current user, to the level
     * <br>that is supported on the target filesystem.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If a file or directory with this name already exists, the
     * <br>%G_IO_ERROR_EXISTS error will be returned. Some file systems don't
     * <br>allow all file names, and may return an %G_IO_ERROR_INVALID_FILENAME
     * <br>error, and if the name is too long, %G_IO_ERROR_FILENAME_TOO_LONG
     * <br>will be returned. Other errors are possible too, and depend on what
     * <br>kind of filesystem the file is on.
     * <br>
     * <br>Note that in many non-local file cases read and write streams are
     * <br>not supported, so make sure you really need to do read and write
     * <br>streaming, rather than just opening for reading or writing.
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileIOStream for the newly created   file, or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileIOStream createReadwrite(int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileIOStream(new PointerContainer(JnaFile.INST().g_file_create_readwrite(asCPointer(), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously creates a new file and returns a stream
     * <br>for reading and writing to it. The file must not already exist.
     * <br>
     * <br>For more details, see g_file_create_readwrite() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_create_readwrite_finish() to get
     * <br>the result of the operation.
     * @param flags a set of &#35;GFileCreateFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void createReadwriteAsync(int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_create_readwrite_async(asCPointer(), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "createReadwriteAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file create operation started with
     * <br>g_file_create_readwrite_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFileIOStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileIOStream createReadwriteFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileIOStream(new PointerContainer(JnaFile.INST().g_file_create_readwrite_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Deletes a file. If the &#64;file is a directory, it will only be
     * <br>deleted if it is empty. This has the same semantics as g_unlink().
     * <br>
     * <br>If &#64;file doesn’t exist, %G_IO_ERROR_NOT_FOUND will be returned. This allows
     * <br>for deletion to be implemented avoiding
     * <br>[time-of-check to time-of-use races](https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use):
     * <pre>
     * g_autoptr(GError) local_error = NULL;
     * if (!g_file_delete (my_file, my_cancellable, &amp;local_error) &amp;&amp;
     *     !g_error_matches (local_error, G_IO_ERROR, G_IO_ERROR_NOT_FOUND))
     *   {
     *     // deletion failed for some reason other than the file not existing:
     *     // so report the error
     *     g_warning (&quot;Failed to delete %s: %s&quot;,
     *                g_file_peek_path (my_file), local_error-&gt;message);
     *   }
     * </pre>
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the file was deleted. %FALSE otherwise.
    */
    public boolean delete(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_delete(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously delete a file. If the &#64;file is a directory, it will
     * <br>only be deleted if it is empty.  This has the same semantics as
     * <br>g_unlink().
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void deleteAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_delete_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "deleteAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes deleting a file started with g_file_delete_async().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the file was deleted. %FALSE otherwise.
    */
    public boolean deleteFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_delete_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Duplicates a &#35;GFile handle. This operation does not duplicate
     * <br>the actual file or directory represented by the &#35;GFile; see
     * <br>g_file_copy() if attempting to copy a file.
     * <br>
     * <br>g_file_dup() is useful when a second handle is needed to the same underlying
     * <br>file, for use in a separate thread (&#35;GFile is not thread-safe). For use
     * <br>within the same thread, use g_object_ref() to increment the existing object’s
     * <br>reference count.
     * <br>
     * <br>This call does no blocking I/O.
     * @return a new &#35;GFile that is a duplicate   of the given &#35;GFile.
    */
    public File dup()  {
        return new File(new PointerContainer(JnaFile.INST().g_file_dup(asCPointer())));
    }

    /**
     * Starts an asynchronous eject on a mountable.
     * <br>When this operation has completed, &#64;callback will be called with
     * <br>&#64;user_user data, and the operation can be finalized with
     * <br>g_file_eject_mountable_with_operation_finish().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation,   or %NULL to avoid user interaction
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied, or %NULL
     * @param user_data the data to pass to callback function
    */
    public void ejectMountableWithOperation(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_eject_mountable_with_operation(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "ejectMountableWithOperation", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous eject operation started by
     * <br>g_file_eject_mountable_with_operation().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the &#64;file was ejected successfully.   %FALSE otherwise.
    */
    public boolean ejectMountableWithOperationFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_eject_mountable_with_operation_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets the requested information about the files in a directory.
     * <br>The result is a &#35;GFileEnumerator object that will give out
     * <br>&#35;GFileInfo objects for all the files in the directory.
     * <br>
     * <br>The &#64;attributes value is a string that specifies the file
     * <br>attributes that should be gathered. It is not an error if
     * <br>it's not possible to read a particular requested attribute
     * <br>from a file - it just won't be set. &#64;attributes should
     * <br>be a comma-separated list of attributes or attribute wildcards.
     * <br>The wildcard &quot;*&quot; means all attributes, and a wildcard like
     * <br>&quot;standard::*&quot; means all attributes in the standard namespace.
     * <br>An example attribute query be &quot;standard::*,owner::user&quot;.
     * <br>The standard attributes are available as defines, like
     * <br>%G_FILE_ATTRIBUTE_STANDARD_NAME. %G_FILE_ATTRIBUTE_STANDARD_NAME should
     * <br>always be specified if you plan to call g_file_enumerator_get_child() or
     * <br>g_file_enumerator_iterate() on the returned enumerator.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * <br>be returned. If the file is not a directory, the %G_IO_ERROR_NOT_DIRECTORY
     * <br>error will be returned. Other errors are possible too.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return A &#35;GFileEnumerator if successful,   %NULL on error. Free the returned object with g_object_unref().
    */
    public FileEnumerator enumerateChildren(@Nonnull ch.bailu.gtk.type.Str attributes, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileEnumerator(new PointerContainer(JnaFile.INST().g_file_enumerate_children(asCPointer(), asCPointerNotNull(attributes), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Gets the requested information about the files in a directory.
     * <br>The result is a &#35;GFileEnumerator object that will give out
     * <br>&#35;GFileInfo objects for all the files in the directory.
     * <br>
     * <br>The &#64;attributes value is a string that specifies the file
     * <br>attributes that should be gathered. It is not an error if
     * <br>it's not possible to read a particular requested attribute
     * <br>from a file - it just won't be set. &#64;attributes should
     * <br>be a comma-separated list of attributes or attribute wildcards.
     * <br>The wildcard &quot;*&quot; means all attributes, and a wildcard like
     * <br>&quot;standard::*&quot; means all attributes in the standard namespace.
     * <br>An example attribute query be &quot;standard::*,owner::user&quot;.
     * <br>The standard attributes are available as defines, like
     * <br>%G_FILE_ATTRIBUTE_STANDARD_NAME. %G_FILE_ATTRIBUTE_STANDARD_NAME should
     * <br>always be specified if you plan to call g_file_enumerator_get_child() or
     * <br>g_file_enumerator_iterate() on the returned enumerator.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * <br>be returned. If the file is not a directory, the %G_IO_ERROR_NOT_DIRECTORY
     * <br>error will be returned. Other errors are possible too.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return A &#35;GFileEnumerator if successful,   %NULL on error. Free the returned object with g_object_unref().
    */
    public FileEnumerator enumerateChildren(String attributes, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileEnumerator(new PointerContainer(JnaFile.INST().g_file_enumerate_children(asCPointer(), attributes, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously gets the requested information about the files
     * <br>in a directory. The result is a &#35;GFileEnumerator object that will
     * <br>give out &#35;GFileInfo objects for all the files in the directory.
     * <br>
     * <br>For more details, see g_file_enumerate_children() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can
     * <br>then call g_file_enumerate_children_finish() to get the result of
     * <br>the operation.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the   request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void enumerateChildrenAsync(@Nonnull ch.bailu.gtk.type.Str attributes, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_enumerate_children_async(asCPointer(), asCPointerNotNull(attributes), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "enumerateChildrenAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously gets the requested information about the files
     * <br>in a directory. The result is a &#35;GFileEnumerator object that will
     * <br>give out &#35;GFileInfo objects for all the files in the directory.
     * <br>
     * <br>For more details, see g_file_enumerate_children() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can
     * <br>then call g_file_enumerate_children_finish() to get the result of
     * <br>the operation.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the   request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void enumerateChildrenAsync(String attributes, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_enumerate_children_async(asCPointer(), attributes, flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "enumerateChildrenAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async enumerate children operation.
     * <br>See g_file_enumerate_children_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFileEnumerator or %NULL   if an error occurred.   Free the returned object with g_object_unref().
    */
    public FileEnumerator enumerateChildrenFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileEnumerator(new PointerContainer(JnaFile.INST().g_file_enumerate_children_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Checks if the two given &#35;GFiles refer to the same file.
     * <br>
     * <br>Note that two &#35;GFiles that differ can still refer to the same
     * <br>file on the filesystem due to various forms of filename
     * <br>aliasing.
     * <br>
     * <br>This call does no blocking I/O.
     * @param file2 the second &#35;GFile
     * @return %TRUE if &#64;file1 and &#64;file2 are equal.
    */
    public boolean equal(@Nonnull File file2)  {
        return JnaFile.INST().g_file_equal(asCPointer(), asCPointerNotNull(file2));
    }

    /**
     * Gets a &#35;GMount for the &#35;GFile.
     * <br>
     * <br>&#35;GMount is returned only for user interesting locations, see
     * <br>&#35;GVolumeMonitor. If the &#35;GFileIface for &#64;file does not have a &#35;mount,
     * <br>&#64;error will be set to %G_IO_ERROR_NOT_FOUND and %NULL &#35;will be returned.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GMount where the &#64;file is located   or %NULL on error.   Free the returned object with g_object_unref().
    */
    public Mount findEnclosingMount(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Mount(new PointerContainer(JnaFile.INST().g_file_find_enclosing_mount(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously gets the mount for the file.
     * <br>
     * <br>For more details, see g_file_find_enclosing_mount() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_find_enclosing_mount_finish() to
     * <br>get the result of the operation.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void findEnclosingMountAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_find_enclosing_mount_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "findEnclosingMountAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous find mount request.
     * <br>See g_file_find_enclosing_mount_async().
     * @param res a &#35;GAsyncResult
     * @return &#35;GMount for given &#64;file or %NULL on error.   Free the returned object with g_object_unref().
    */
    public Mount findEnclosingMountFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Mount(new PointerContainer(JnaFile.INST().g_file_find_enclosing_mount_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Gets the base name (the last component of the path) for a given &#35;GFile.
     * <br>
     * <br>If called for the top level of a system (such as the filesystem root
     * <br>or a uri like sftp://host/) it will return a single directory separator
     * <br>(and on Windows, possibly a drive letter).
     * <br>
     * <br>The base name is a byte string (not UTF-8). It has no defined encoding
     * <br>or rules other than it may not contain zero bytes.  If you want to use
     * <br>filenames in a user interface you should use the display name that you
     * <br>can get by requesting the %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME
     * <br>attribute with g_file_query_info().
     * <br>
     * <br>This call does no blocking I/O.
     * @return string containing the &#35;GFile's   base name, or %NULL if given &#35;GFile is invalid. The returned string   should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Str getBasename()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_get_basename(asCPointer())));
    }

    /**
     * Gets a child of &#64;file with basename equal to &#64;name.
     * <br>
     * <br>Note that the file with that specific name might not exist, but
     * <br>you can still have a &#35;GFile that points to it. You can use this
     * <br>for instance to create that file.
     * <br>
     * <br>This call does no blocking I/O.
     * @param name string containing the child's basename
     * @return a &#35;GFile to a child specified by &#64;name.   Free the returned object with g_object_unref().
    */
    public File getChild(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_get_child(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Gets a child of &#64;file with basename equal to &#64;name.
     * <br>
     * <br>Note that the file with that specific name might not exist, but
     * <br>you can still have a &#35;GFile that points to it. You can use this
     * <br>for instance to create that file.
     * <br>
     * <br>This call does no blocking I/O.
     * @param name string containing the child's basename
     * @return a &#35;GFile to a child specified by &#64;name.   Free the returned object with g_object_unref().
    */
    public File getChild(String name)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_get_child(asCPointer(), name)));
    }

    /**
     * Gets the child of &#64;file for a given &#64;display_name (i.e. a UTF-8
     * <br>version of the name). If this function fails, it returns %NULL
     * <br>and &#64;error will be set. This is very useful when constructing a
     * <br>&#35;GFile for a new file and the user entered the filename in the
     * <br>user interface, for instance when you select a directory and
     * <br>type a filename in the file selector.
     * <br>
     * <br>This call does no blocking I/O.
     * @param display_name string to a possible child
     * @return a &#35;GFile to the specified child, or   %NULL if the display name couldn't be converted.   Free the returned object with g_object_unref().
    */
    public File getChildForDisplayName(@Nonnull ch.bailu.gtk.type.Str display_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaFile.INST().g_file_get_child_for_display_name(asCPointer(), asCPointerNotNull(display_name), 0L)));
    }

    /**
     * Gets the child of &#64;file for a given &#64;display_name (i.e. a UTF-8
     * <br>version of the name). If this function fails, it returns %NULL
     * <br>and &#64;error will be set. This is very useful when constructing a
     * <br>&#35;GFile for a new file and the user entered the filename in the
     * <br>user interface, for instance when you select a directory and
     * <br>type a filename in the file selector.
     * <br>
     * <br>This call does no blocking I/O.
     * @param display_name string to a possible child
     * @return a &#35;GFile to the specified child, or   %NULL if the display name couldn't be converted.   Free the returned object with g_object_unref().
    */
    public File getChildForDisplayName(String display_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaFile.INST().g_file_get_child_for_display_name(asCPointer(), display_name, 0L)));
    }

    /**
     * Gets the parent directory for the &#64;file.
     * <br>If the &#64;file represents the root directory of the
     * <br>file system, then %NULL will be returned.
     * <br>
     * <br>This call does no blocking I/O.
     * @return a &#35;GFile structure to the   parent of the given &#35;GFile or %NULL if there is no parent. Free   the returned object with g_object_unref().
    */
    public File getParent()  {
        return new File(new PointerContainer(JnaFile.INST().g_file_get_parent(asCPointer())));
    }

    /**
     * Gets the parse name of the &#64;file.
     * <br>A parse name is a UTF-8 string that describes the
     * <br>file such that one can get the &#35;GFile back using
     * <br>g_file_parse_name().
     * <br>
     * <br>This is generally used to show the &#35;GFile as a nice
     * <br>full-pathname kind of string in a user interface,
     * <br>like in a location entry.
     * <br>
     * <br>For local files with names that can safely be converted
     * <br>to UTF-8 the pathname is used, otherwise the IRI is used
     * <br>(a form of URI that allows UTF-8 characters unescaped).
     * <br>
     * <br>This call does no blocking I/O.
     * @return a string containing the &#35;GFile's parse name.   The returned string should be freed with g_free()   when no longer needed.
    */
    public ch.bailu.gtk.type.Str getParseName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_get_parse_name(asCPointer())));
    }

    /**
     * Gets the local pathname for &#35;GFile, if one exists. If non-%NULL, this is
     * <br>guaranteed to be an absolute, canonical path. It might contain symlinks.
     * <br>
     * <br>This call does no blocking I/O.
     * @return string containing the &#35;GFile's path,   or %NULL if no such path exists. The returned string should be freed   with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Str getPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_get_path(asCPointer())));
    }

    /**
     * Gets the path for &#64;descendant relative to &#64;parent.
     * <br>
     * <br>This call does no blocking I/O.
     * @param descendant input &#35;GFile
     * @return string with the relative path from   &#64;descendant to &#64;parent, or %NULL if &#64;descendant doesn't have &#64;parent as   prefix. The returned string should be freed with g_free() when   no longer needed.
    */
    public ch.bailu.gtk.type.Str getRelativePath(@Nonnull File descendant)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_get_relative_path(asCPointer(), asCPointerNotNull(descendant))));
    }

    /**
     * Gets the URI for the &#64;file.
     * <br>
     * <br>This call does no blocking I/O.
     * @return a string containing the &#35;GFile's URI. If the &#35;GFile was constructed   with an invalid URI, an invalid URI is returned.   The returned string should be freed with g_free()   when no longer needed.
    */
    public ch.bailu.gtk.type.Str getUri()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_get_uri(asCPointer())));
    }

    /**
     * Gets the URI scheme for a &#35;GFile.
     * <br>RFC 3986 decodes the scheme as:
     * <pre>
     * URI = scheme &quot;:&quot; hier-part [ &quot;?&quot; query ] [ &quot;&#35;&quot; fragment ]
     * </pre>
     * <br>Common schemes include &quot;file&quot;, &quot;http&quot;, &quot;ftp&quot;, etc.
     * <br>
     * <br>The scheme can be different from the one used to construct the &#35;GFile,
     * <br>in that it might be replaced with one that is logically equivalent to the &#35;GFile.
     * <br>
     * <br>This call does no blocking I/O.
     * @return a string containing the URI scheme for the given   &#35;GFile or %NULL if the &#35;GFile was constructed with an invalid URI. The   returned string should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Str getUriScheme()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_get_uri_scheme(asCPointer())));
    }

    /**
     * Checks if &#64;file has a parent, and optionally, if it is &#64;parent.
     * <br>
     * <br>If &#64;parent is %NULL then this function returns %TRUE if &#64;file has any
     * <br>parent at all.  If &#64;parent is non-%NULL then %TRUE is only returned
     * <br>if &#64;file is an immediate child of &#64;parent.
     * @param parent the parent to check for, or %NULL
     * @return %TRUE if &#64;file is an immediate child of &#64;parent (or any parent in   the case that &#64;parent is %NULL).
    */
    public boolean hasParent(@Nullable File parent)  {
        return JnaFile.INST().g_file_has_parent(asCPointer(), asCPointer(parent));
    }

    /**
     * Checks whether &#64;file has the prefix specified by &#64;prefix.
     * <br>
     * <br>In other words, if the names of initial elements of &#64;file's
     * <br>pathname match &#64;prefix. Only full pathname elements are matched,
     * <br>so a path like /foo is not considered a prefix of /foobar, only
     * <br>of /foo/bar.
     * <br>
     * <br>A &#35;GFile is not a prefix of itself. If you want to check for
     * <br>equality, use g_file_equal().
     * <br>
     * <br>This call does no I/O, as it works purely on names. As such it can
     * <br>sometimes return %FALSE even if &#64;file is inside a &#64;prefix (from a
     * <br>filesystem point of view), because the prefix of &#64;file is an alias
     * <br>of &#64;prefix.
     * @param prefix input &#35;GFile
     * @return %TRUE if the &#64;file's parent, grandparent, etc is &#64;prefix,   %FALSE otherwise.
    */
    public boolean hasPrefix(@Nonnull File prefix)  {
        return JnaFile.INST().g_file_has_prefix(asCPointer(), asCPointerNotNull(prefix));
    }

    /**
     * Checks to see if a &#35;GFile has a given URI scheme.
     * <br>
     * <br>This call does no blocking I/O.
     * @param uri_scheme a string containing a URI scheme
     * @return %TRUE if &#35;GFile's backend supports the   given URI scheme, %FALSE if URI scheme is %NULL,   not supported, or &#35;GFile is invalid.
    */
    public boolean hasUriScheme(@Nonnull ch.bailu.gtk.type.Str uri_scheme)  {
        return JnaFile.INST().g_file_has_uri_scheme(asCPointer(), asCPointerNotNull(uri_scheme));
    }

    /**
     * Checks to see if a &#35;GFile has a given URI scheme.
     * <br>
     * <br>This call does no blocking I/O.
     * @param uri_scheme a string containing a URI scheme
     * @return %TRUE if &#35;GFile's backend supports the   given URI scheme, %FALSE if URI scheme is %NULL,   not supported, or &#35;GFile is invalid.
    */
    public boolean hasUriScheme(String uri_scheme)  {
        return JnaFile.INST().g_file_has_uri_scheme(asCPointer(), uri_scheme);
    }

    /**
     * Creates a hash value for a &#35;GFile.
     * <br>
     * <br>This call does no blocking I/O.
     * @return 0 if &#64;file is not a valid &#35;GFile, otherwise an   integer that can be used as hash value for the &#35;GFile.   This function is intended for easily hashing a &#35;GFile to   add to a &#35;GHashTable or similar data structure.
    */
    public int hash()  {
        return JnaFile.INST().g_file_hash(asCPointer());
    }

    /**
     * Checks to see if a file is native to the platform.
     * <br>
     * <br>A native file is one expressed in the platform-native filename format,
     * <br>e.g. &quot;C:&#92;Windows&quot; or &quot;/usr/bin/&quot;. This does not mean the file is local,
     * <br>as it might be on a locally mounted remote filesystem.
     * <br>
     * <br>On some systems non-native files may be available using the native
     * <br>filesystem via a userspace filesystem (FUSE), in these cases this call
     * <br>will return %FALSE, but g_file_get_path() will still return a native path.
     * <br>
     * <br>This call does no blocking I/O.
     * @return %TRUE if &#64;file is native
    */
    public boolean isNative()  {
        return JnaFile.INST().g_file_is_native(asCPointer());
    }

    /**
     * Asynchronously loads the contents of &#64;file as &#35;GBytes.
     * <br>
     * <br>If &#64;file is a resource:// based URI, the resulting bytes will reference the
     * <br>embedded resource instead of a copy. Otherwise, this is equivalent to calling
     * <br>g_file_load_contents_async() and g_bytes_new_take().
     * <br>
     * <br>&#64;callback should call g_file_load_bytes_finish() to get the result of this
     * <br>asynchronous operation.
     * <br>
     * <br>See g_file_load_bytes() for more information.
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the   request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void loadBytesAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_load_bytes_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "loadBytesAsync", callback), asCPointer(user_data));
    }

    /**
     * Loads the content of the file into memory. The data is always
     * <br>zero-terminated, but this is not included in the resultant &#64;length.
     * <br>The returned &#64;contents should be freed with g_free() when no longer
     * <br>needed.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param contents a location to place the contents of the file
     * @param length a location to place the length of the contents of the file,   or %NULL if the length is not needed
     * @param etag_out a location to place the current entity tag for the file,   or %NULL if the entity tag is not needed
     * @return %TRUE if the &#64;file's contents were successfully loaded.   %FALSE if there were errors.
    */
    public boolean loadContents(@Nullable Cancellable cancellable, @Nonnull ch.bailu.gtk.type.Strs contents, @Nullable ch.bailu.gtk.type.Int64 length, @Nullable ch.bailu.gtk.type.Strs etag_out) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_load_contents(asCPointer(), asCPointer(cancellable), asCPointerNotNull(contents), asCPointer(length), asCPointer(etag_out), 0L);
    }

    /**
     * Starts an asynchronous load of the &#64;file's contents.
     * <br>
     * <br>For more details, see g_file_load_contents() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the load operation has completed, &#64;callback will be called
     * <br>with &#64;user data. To finish the operation, call
     * <br>g_file_load_contents_finish() with the &#35;GAsyncResult returned by
     * <br>the &#64;callback.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void loadContentsAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_load_contents_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "loadContentsAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous load of the &#64;file's contents.
     * <br>The contents are placed in &#64;contents, and &#64;length is set to the
     * <br>size of the &#64;contents string. The &#64;contents should be freed with
     * <br>g_free() when no longer needed. If &#64;etag_out is present, it will be
     * <br>set to the new entity tag for the &#64;file.
     * @param res a &#35;GAsyncResult
     * @param contents a location to place the contents of the file
     * @param length a location to place the length of the contents of the file,   or %NULL if the length is not needed
     * @param etag_out a location to place the current entity tag for the file,   or %NULL if the entity tag is not needed
     * @return %TRUE if the load was successful. If %FALSE and &#64;error is   present, it will be set appropriately.
    */
    public boolean loadContentsFinish(@Nonnull AsyncResult res, @Nonnull ch.bailu.gtk.type.Strs contents, @Nullable ch.bailu.gtk.type.Int64 length, @Nullable ch.bailu.gtk.type.Strs etag_out) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_load_contents_finish(asCPointer(), asCPointerNotNull(res), asCPointerNotNull(contents), asCPointer(length), asCPointer(etag_out), 0L);
    }

    /**
     * Finishes an asynchronous partial load operation that was started
     * <br>with g_file_load_partial_contents_async(). The data is always
     * <br>zero-terminated, but this is not included in the resultant &#64;length.
     * <br>The returned &#64;contents should be freed with g_free() when no longer
     * <br>needed.
     * @param res a &#35;GAsyncResult
     * @param contents a location to place the contents of the file
     * @param length a location to place the length of the contents of the file,   or %NULL if the length is not needed
     * @param etag_out a location to place the current entity tag for the file,   or %NULL if the entity tag is not needed
     * @return %TRUE if the load was successful. If %FALSE and &#64;error is   present, it will be set appropriately.
    */
    public boolean loadPartialContentsFinish(@Nonnull AsyncResult res, @Nonnull ch.bailu.gtk.type.Strs contents, @Nullable ch.bailu.gtk.type.Int64 length, @Nullable ch.bailu.gtk.type.Strs etag_out) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_load_partial_contents_finish(asCPointer(), asCPointerNotNull(res), asCPointerNotNull(contents), asCPointer(length), asCPointer(etag_out), 0L);
    }

    /**
     * Creates a directory. Note that this will only create a child directory
     * <br>of the immediate parent directory of the path or URI given by the &#35;GFile.
     * <br>To recursively create directories, see g_file_make_directory_with_parents().
     * <br>This function will fail if the parent directory does not exist, setting
     * <br>&#64;error to %G_IO_ERROR_NOT_FOUND. If the file system doesn't support
     * <br>creating directories, this function will fail, setting &#64;error to
     * <br>%G_IO_ERROR_NOT_SUPPORTED.
     * <br>
     * <br>For a local &#35;GFile the newly created directory will have the default
     * <br>(current) ownership and permissions of the current process.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE on successful creation, %FALSE otherwise.
    */
    public boolean makeDirectory(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_make_directory(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously creates a directory.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void makeDirectoryAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_make_directory_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "makeDirectoryAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous directory creation, started with
     * <br>g_file_make_directory_async().
     * @param result a &#35;GAsyncResult
     * @return %TRUE on successful directory creation, %FALSE otherwise.
    */
    public boolean makeDirectoryFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_make_directory_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Creates a directory and any parent directories that may not
     * <br>exist similar to 'mkdir -p'. If the file system does not support
     * <br>creating directories, this function will fail, setting &#64;error to
     * <br>%G_IO_ERROR_NOT_SUPPORTED. If the directory itself already exists,
     * <br>this function will fail setting &#64;error to %G_IO_ERROR_EXISTS, unlike
     * <br>the similar g_mkdir_with_parents().
     * <br>
     * <br>For a local &#35;GFile the newly created directories will have the default
     * <br>(current) ownership and permissions of the current process.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if all directories have been successfully created, %FALSE otherwise.
    */
    public boolean makeDirectoryWithParents(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_make_directory_with_parents(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Creates a symbolic link named &#64;file which contains the string
     * <br>&#64;symlink_value.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param symlink_value a string with the path for the target   of the new symlink
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE on the creation of a new symlink, %FALSE otherwise.
    */
    public boolean makeSymbolicLink(@Nonnull ch.bailu.gtk.type.Str symlink_value, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_make_symbolic_link(asCPointer(), asCPointerNotNull(symlink_value), asCPointer(cancellable), 0L);
    }

    /**
     * Creates a symbolic link named &#64;file which contains the string
     * <br>&#64;symlink_value.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param symlink_value a string with the path for the target   of the new symlink
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE on the creation of a new symlink, %FALSE otherwise.
    */
    public boolean makeSymbolicLink(String symlink_value, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_make_symbolic_link(asCPointer(), symlink_value, asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously creates a symbolic link named &#64;file which contains the
     * <br>string &#64;symlink_value.
     * @param symlink_value a string with the path for the target   of the new symlink
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void makeSymbolicLinkAsync(@Nonnull ch.bailu.gtk.type.Str symlink_value, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_make_symbolic_link_async(asCPointer(), asCPointerNotNull(symlink_value), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "makeSymbolicLinkAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously creates a symbolic link named &#64;file which contains the
     * <br>string &#64;symlink_value.
     * @param symlink_value a string with the path for the target   of the new symlink
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void makeSymbolicLinkAsync(String symlink_value, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_make_symbolic_link_async(asCPointer(), symlink_value, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "makeSymbolicLinkAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous symbolic link creation, started with
     * <br>g_file_make_symbolic_link_async().
     * @param result a &#35;GAsyncResult
     * @return %TRUE on successful directory creation, %FALSE otherwise.
    */
    public boolean makeSymbolicLinkFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_make_symbolic_link_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Recursively measures the disk usage of &#64;file.
     * <br>
     * <br>This is the asynchronous version of g_file_measure_disk_usage().  See
     * <br>there for more information.
     * @param flags &#35;GFileMeasureFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable
     * @param progress_callback a &#35;GFileMeasureProgressCallback
     * @param progress_data user_data for &#64;progress_callback
     * @param callback a &#35;GAsyncReadyCallback to call when complete
     * @param user_data the data to pass to callback function
    */
    public void measureDiskUsageAsync(int flags, int io_priority, @Nullable Cancellable cancellable, OnFileMeasureProgressCallback progress_callback, @Nullable ch.bailu.gtk.type.Pointer progress_data, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_measure_disk_usage_async(asCPointer(), flags, io_priority, asCPointer(cancellable), toOnFileMeasureProgressCallback(this, "measureDiskUsageAsync", progress_callback), asCPointer(progress_data), toOnAsyncReadyCallback(this, "measureDiskUsageAsync", callback), asCPointer(user_data));
    }

    /**
     * Obtains a file or directory monitor for the given file,
     * <br>depending on the type of the file.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param flags a set of &#35;GFileMonitorFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileMonitor for the given &#64;file,   or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileMonitor monitor(int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileMonitor(new PointerContainer(JnaFile.INST().g_file_monitor(asCPointer(), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Obtains a directory monitor for the given file.
     * <br>This may fail if directory monitoring is not supported.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>It does not make sense for &#64;flags to contain
     * <br>%G_FILE_MONITOR_WATCH_HARD_LINKS, since hard links can not be made to
     * <br>directories.  It is not possible to monitor all the files in a
     * <br>directory for changes made via hard links; if you want to do this then
     * <br>you must register individual watches with g_file_monitor().
     * @param flags a set of &#35;GFileMonitorFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileMonitor for the given &#64;file,   or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileMonitor monitorDirectory(int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileMonitor(new PointerContainer(JnaFile.INST().g_file_monitor_directory(asCPointer(), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Obtains a file monitor for the given file. If no file notification
     * <br>mechanism exists, then regular polling of the file is used.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>If &#64;flags contains %G_FILE_MONITOR_WATCH_HARD_LINKS then the monitor
     * <br>will also attempt to report changes made to the file via another
     * <br>filename (ie, a hard link). Without this flag, you can only rely on
     * <br>changes made through the filename contained in &#64;file to be
     * <br>reported. Using this flag may result in an increase in resource
     * <br>usage, and may not have any effect depending on the &#35;GFileMonitor
     * <br>backend and/or filesystem type.
     * @param flags a set of &#35;GFileMonitorFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileMonitor for the given &#64;file,   or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileMonitor monitorFile(int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileMonitor(new PointerContainer(JnaFile.INST().g_file_monitor_file(asCPointer(), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Starts a &#64;mount_operation, mounting the volume that contains
     * <br>the file &#64;location.
     * <br>
     * <br>When this operation has completed, &#64;callback will be called with
     * <br>&#64;user_user data, and the operation can be finalized with
     * <br>g_file_mount_enclosing_volume_finish().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation   or %NULL to avoid user interaction
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied, or %NULL
     * @param user_data the data to pass to callback function
    */
    public void mountEnclosingVolume(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_mount_enclosing_volume(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "mountEnclosingVolume", callback), asCPointer(user_data));
    }

    /**
     * Finishes a mount operation started by g_file_mount_enclosing_volume().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if successful. If an error has occurred,   this function will return %FALSE and set &#64;error   appropriately if present.
    */
    public boolean mountEnclosingVolumeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_mount_enclosing_volume_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Mounts a file of type G_FILE_TYPE_MOUNTABLE.
     * <br>Using &#64;mount_operation, you can request callbacks when, for instance,
     * <br>passwords are needed during authentication.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_mount_mountable_finish() to get
     * <br>the result of the operation.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation,   or %NULL to avoid user interaction
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied, or %NULL
     * @param user_data the data to pass to callback function
    */
    public void mountMountable(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_mount_mountable(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "mountMountable", callback), asCPointer(user_data));
    }

    /**
     * Finishes a mount operation. See g_file_mount_mountable() for details.
     * <br>
     * <br>Finish an asynchronous mount operation that was started
     * <br>with g_file_mount_mountable().
     * @param result a &#35;GAsyncResult
     * @return a &#35;GFile or %NULL on error.   Free the returned object with g_object_unref().
    */
    public File mountMountableFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaFile.INST().g_file_mount_mountable_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Finishes an asynchronous file movement, started with
     * <br>g_file_move_async().
     * @param result a &#35;GAsyncResult
     * @return %TRUE on successful file move, %FALSE otherwise.
    */
    public boolean moveFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_move_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Opens an existing file for reading and writing. The result is
     * <br>a &#35;GFileIOStream that can be used to read and write the contents
     * <br>of the file.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * <br>be returned. If the file is a directory, the %G_IO_ERROR_IS_DIRECTORY
     * <br>error will be returned. Other errors are possible too, and depend on
     * <br>what kind of filesystem the file is on. Note that in many non-local
     * <br>file cases read and write streams are not supported, so make sure you
     * <br>really need to do read and write streaming, rather than just opening
     * <br>for reading or writing.
     * @param cancellable a &#35;GCancellable
     * @return &#35;GFileIOStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileIOStream openReadwrite(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileIOStream(new PointerContainer(JnaFile.INST().g_file_open_readwrite(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously opens &#64;file for reading and writing.
     * <br>
     * <br>For more details, see g_file_open_readwrite() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_open_readwrite_finish() to get
     * <br>the result of the operation.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void openReadwriteAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_open_readwrite_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "openReadwriteAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file read operation started with
     * <br>g_file_open_readwrite_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFileIOStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileIOStream openReadwriteFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileIOStream(new PointerContainer(JnaFile.INST().g_file_open_readwrite_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Exactly like g_file_get_path(), but caches the result via
     * <br>g_object_set_qdata_full().  This is useful for example in C
     * <br>applications which mix `g_file_*` APIs with native ones.  It
     * <br>also avoids an extra duplicated string when possible, so will be
     * <br>generally more efficient.
     * <br>
     * <br>This call does no blocking I/O.
     * @return string containing the &#35;GFile's path,   or %NULL if no such path exists. The returned string is owned by &#64;file.
    */
    public ch.bailu.gtk.type.Str peekPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFile.INST().g_file_peek_path(asCPointer())));
    }

    /**
     * Polls a file of type %G_FILE_TYPE_MOUNTABLE.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_mount_mountable_finish() to get
     * <br>the result of the operation.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied, or %NULL
     * @param user_data the data to pass to callback function
    */
    public void pollMountable(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_poll_mountable(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "pollMountable", callback), asCPointer(user_data));
    }

    /**
     * Finishes a poll operation. See g_file_poll_mountable() for details.
     * <br>
     * <br>Finish an asynchronous poll operation that was polled
     * <br>with g_file_poll_mountable().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the operation finished successfully. %FALSE otherwise.
    */
    public boolean pollMountableFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_poll_mountable_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Returns the &#35;GAppInfo that is registered as the default
     * <br>application to handle the file specified by &#64;file.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return a &#35;GAppInfo if the handle was found,   %NULL if there were errors.   When you are done with it, release it with g_object_unref()
    */
    public AppInfo queryDefaultHandler(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaFile.INST().g_file_query_default_handler(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Async version of g_file_query_default_handler().
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public void queryDefaultHandlerAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_query_default_handler_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryDefaultHandlerAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a g_file_query_default_handler_async() operation.
     * @param result a &#35;GAsyncResult
     * @return a &#35;GAppInfo if the handle was found,   %NULL if there were errors.   When you are done with it, release it with g_object_unref()
    */
    public AppInfo queryDefaultHandlerFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaFile.INST().g_file_query_default_handler_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Utility function to check if a particular file exists. This is
     * <br>implemented using g_file_query_info() and as such does blocking I/O.
     * <br>
     * <br>Note that in many cases it is [racy to first check for file existence](https://en.wikipedia.org/wiki/Time_of_check_to_time_of_use)
     * <br>and then execute something based on the outcome of that, because the
     * <br>file might have been created or removed in between the operations. The
     * <br>general approach to handling that is to not check, but just do the
     * <br>operation and handle the errors as they come.
     * <br>
     * <br>As an example of race-free checking, take the case of reading a file,
     * <br>and if it doesn't exist, creating it. There are two racy versions: read
     * <br>it, and on error create it; and: check if it exists, if not create it.
     * <br>These can both result in two processes creating the file (with perhaps
     * <br>a partially written file as the result). The correct approach is to
     * <br>always try to create the file with g_file_create() which will either
     * <br>atomically create the file or fail with a %G_IO_ERROR_EXISTS error.
     * <br>
     * <br>However, in many cases an existence check is useful in a user interface,
     * <br>for instance to make a menu item sensitive/insensitive, so that you don't
     * <br>have to fool users that something is possible and then just show an error
     * <br>dialog. If you do this, you should make sure to also handle the errors
     * <br>that can happen due to races when you execute the operation.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the file exists (and can be detected without error),   %FALSE otherwise (or if cancelled).
    */
    public boolean queryExists(@Nullable Cancellable cancellable)  {
        return JnaFile.INST().g_file_query_exists(asCPointer(), asCPointer(cancellable));
    }

    /**
     * Utility function to inspect the &#35;GFileType of a file. This is
     * <br>implemented using g_file_query_info() and as such does blocking I/O.
     * <br>
     * <br>The primary use case of this method is to check if a file is
     * <br>a regular file, directory, or symlink.
     * @param flags a set of &#35;GFileQueryInfoFlags passed to g_file_query_info()
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return The &#35;GFileType of the file and %G_FILE_TYPE_UNKNOWN   if the file does not exist
    */
    public int queryFileType(int flags, @Nullable Cancellable cancellable)  {
        return JnaFile.INST().g_file_query_file_type(asCPointer(), flags, asCPointer(cancellable));
    }

    /**
     * Similar to g_file_query_info(), but obtains information
     * <br>about the filesystem the &#64;file is on, rather than the file itself.
     * <br>For instance the amount of space available and the type of
     * <br>the filesystem.
     * <br>
     * <br>The &#64;attributes value is a string that specifies the attributes
     * <br>that should be gathered. It is not an error if it's not possible
     * <br>to read a particular requested attribute from a file - it just
     * <br>won't be set. &#64;attributes should be a comma-separated list of
     * <br>attributes or attribute wildcards. The wildcard &quot;*&quot; means all
     * <br>attributes, and a wildcard like &quot;filesystem::*&quot; means all attributes
     * <br>in the filesystem namespace. The standard namespace for filesystem
     * <br>attributes is &quot;filesystem&quot;. Common attributes of interest are
     * <br>%G_FILE_ATTRIBUTE_FILESYSTEM_SIZE (the total size of the filesystem
     * <br>in bytes), %G_FILE_ATTRIBUTE_FILESYSTEM_FREE (number of bytes available),
     * <br>and %G_FILE_ATTRIBUTE_FILESYSTEM_TYPE (type of the filesystem).
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * <br>be returned. Other errors are possible too, and depend on what
     * <br>kind of filesystem the file is on.
     * @param attributes an attribute query string
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileInfo or %NULL if there was an error.   Free the returned object with g_object_unref().
    */
    public FileInfo queryFilesystemInfo(@Nonnull ch.bailu.gtk.type.Str attributes, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFile.INST().g_file_query_filesystem_info(asCPointer(), asCPointerNotNull(attributes), asCPointer(cancellable), 0L)));
    }

    /**
     * Similar to g_file_query_info(), but obtains information
     * <br>about the filesystem the &#64;file is on, rather than the file itself.
     * <br>For instance the amount of space available and the type of
     * <br>the filesystem.
     * <br>
     * <br>The &#64;attributes value is a string that specifies the attributes
     * <br>that should be gathered. It is not an error if it's not possible
     * <br>to read a particular requested attribute from a file - it just
     * <br>won't be set. &#64;attributes should be a comma-separated list of
     * <br>attributes or attribute wildcards. The wildcard &quot;*&quot; means all
     * <br>attributes, and a wildcard like &quot;filesystem::*&quot; means all attributes
     * <br>in the filesystem namespace. The standard namespace for filesystem
     * <br>attributes is &quot;filesystem&quot;. Common attributes of interest are
     * <br>%G_FILE_ATTRIBUTE_FILESYSTEM_SIZE (the total size of the filesystem
     * <br>in bytes), %G_FILE_ATTRIBUTE_FILESYSTEM_FREE (number of bytes available),
     * <br>and %G_FILE_ATTRIBUTE_FILESYSTEM_TYPE (type of the filesystem).
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * <br>be returned. Other errors are possible too, and depend on what
     * <br>kind of filesystem the file is on.
     * @param attributes an attribute query string
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileInfo or %NULL if there was an error.   Free the returned object with g_object_unref().
    */
    public FileInfo queryFilesystemInfo(String attributes, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFile.INST().g_file_query_filesystem_info(asCPointer(), attributes, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously gets the requested information about the filesystem
     * <br>that the specified &#64;file is on. The result is a &#35;GFileInfo object
     * <br>that contains key-value attributes (such as type or size for the
     * <br>file).
     * <br>
     * <br>For more details, see g_file_query_filesystem_info() which is the
     * <br>synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can
     * <br>then call g_file_query_info_finish() to get the result of the
     * <br>operation.
     * @param attributes an attribute query string
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryFilesystemInfoAsync(@Nonnull ch.bailu.gtk.type.Str attributes, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_query_filesystem_info_async(asCPointer(), asCPointerNotNull(attributes), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryFilesystemInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously gets the requested information about the filesystem
     * <br>that the specified &#64;file is on. The result is a &#35;GFileInfo object
     * <br>that contains key-value attributes (such as type or size for the
     * <br>file).
     * <br>
     * <br>For more details, see g_file_query_filesystem_info() which is the
     * <br>synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can
     * <br>then call g_file_query_info_finish() to get the result of the
     * <br>operation.
     * @param attributes an attribute query string
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryFilesystemInfoAsync(String attributes, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_query_filesystem_info_async(asCPointer(), attributes, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryFilesystemInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous filesystem info query.
     * <br>See g_file_query_filesystem_info_async().
     * @param res a &#35;GAsyncResult
     * @return &#35;GFileInfo for given &#64;file   or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileInfo queryFilesystemInfoFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFile.INST().g_file_query_filesystem_info_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Gets the requested information about specified &#64;file.
     * <br>The result is a &#35;GFileInfo object that contains key-value
     * <br>attributes (such as the type or size of the file).
     * <br>
     * <br>The &#64;attributes value is a string that specifies the file
     * <br>attributes that should be gathered. It is not an error if
     * <br>it's not possible to read a particular requested attribute
     * <br>from a file - it just won't be set. &#64;attributes should be a
     * <br>comma-separated list of attributes or attribute wildcards.
     * <br>The wildcard &quot;*&quot; means all attributes, and a wildcard like
     * <br>&quot;standard::*&quot; means all attributes in the standard namespace.
     * <br>An example attribute query be &quot;standard::*,owner::user&quot;.
     * <br>The standard attributes are available as defines, like
     * <br>%G_FILE_ATTRIBUTE_STANDARD_NAME.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>For symlinks, normally the information about the target of the
     * <br>symlink is returned, rather than information about the symlink
     * <br>itself. However if you pass %G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS
     * <br>in &#64;flags the information about the symlink itself will be returned.
     * <br>Also, for symlinks that point to non-existing files the information
     * <br>about the symlink itself will be returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
     * <br>returned. Other errors are possible too, and depend on what kind of
     * <br>filesystem the file is on.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileInfo for the given &#64;file, or %NULL   on error. Free the returned object with g_object_unref().
    */
    public FileInfo queryInfo(@Nonnull ch.bailu.gtk.type.Str attributes, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFile.INST().g_file_query_info(asCPointer(), asCPointerNotNull(attributes), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Gets the requested information about specified &#64;file.
     * <br>The result is a &#35;GFileInfo object that contains key-value
     * <br>attributes (such as the type or size of the file).
     * <br>
     * <br>The &#64;attributes value is a string that specifies the file
     * <br>attributes that should be gathered. It is not an error if
     * <br>it's not possible to read a particular requested attribute
     * <br>from a file - it just won't be set. &#64;attributes should be a
     * <br>comma-separated list of attributes or attribute wildcards.
     * <br>The wildcard &quot;*&quot; means all attributes, and a wildcard like
     * <br>&quot;standard::*&quot; means all attributes in the standard namespace.
     * <br>An example attribute query be &quot;standard::*,owner::user&quot;.
     * <br>The standard attributes are available as defines, like
     * <br>%G_FILE_ATTRIBUTE_STANDARD_NAME.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>For symlinks, normally the information about the target of the
     * <br>symlink is returned, rather than information about the symlink
     * <br>itself. However if you pass %G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS
     * <br>in &#64;flags the information about the symlink itself will be returned.
     * <br>Also, for symlinks that point to non-existing files the information
     * <br>about the symlink itself will be returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
     * <br>returned. Other errors are possible too, and depend on what kind of
     * <br>filesystem the file is on.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileInfo for the given &#64;file, or %NULL   on error. Free the returned object with g_object_unref().
    */
    public FileInfo queryInfo(String attributes, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFile.INST().g_file_query_info(asCPointer(), attributes, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously gets the requested information about specified &#64;file.
     * <br>The result is a &#35;GFileInfo object that contains key-value attributes
     * <br>(such as type or size for the file).
     * <br>
     * <br>For more details, see g_file_query_info() which is the synchronous
     * <br>version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can
     * <br>then call g_file_query_info_finish() to get the result of the operation.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the   request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryInfoAsync(@Nonnull ch.bailu.gtk.type.Str attributes, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_query_info_async(asCPointer(), asCPointerNotNull(attributes), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously gets the requested information about specified &#64;file.
     * <br>The result is a &#35;GFileInfo object that contains key-value attributes
     * <br>(such as type or size for the file).
     * <br>
     * <br>For more details, see g_file_query_info() which is the synchronous
     * <br>version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can
     * <br>then call g_file_query_info_finish() to get the result of the operation.
     * @param attributes an attribute query string
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the   request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void queryInfoAsync(String attributes, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_query_info_async(asCPointer(), attributes, flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "queryInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file info query.
     * <br>See g_file_query_info_async().
     * @param res a &#35;GAsyncResult
     * @return &#35;GFileInfo for given &#64;file   or %NULL on error. Free the returned object with   g_object_unref().
    */
    public FileInfo queryInfoFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInfo(new PointerContainer(JnaFile.INST().g_file_query_info_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Obtain the list of settable attributes for the file.
     * <br>
     * <br>Returns the type and full attribute name of all the attributes
     * <br>that can be set on this file. This doesn't mean setting it will
     * <br>always succeed though, you might get an access failure, or some
     * <br>specific file may not support a specific attribute.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileAttributeInfoList describing the settable attributes.   When you are done with it, release it with   g_file_attribute_info_list_unref()
    */
    public FileAttributeInfoList querySettableAttributes(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileAttributeInfoList(new PointerContainer(JnaFile.INST().g_file_query_settable_attributes(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Obtain the list of attribute namespaces where new attributes
     * <br>can be created by a user. An example of this is extended
     * <br>attributes (in the &quot;xattr&quot; namespace).
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileAttributeInfoList describing the writable namespaces.   When you are done with it, release it with   g_file_attribute_info_list_unref()
    */
    public FileAttributeInfoList queryWritableNamespaces(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileAttributeInfoList(new PointerContainer(JnaFile.INST().g_file_query_writable_namespaces(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Opens a file for reading. The result is a &#35;GFileInputStream that
     * <br>can be used to read the contents of the file.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
     * <br>returned. If the file is a directory, the %G_IO_ERROR_IS_DIRECTORY
     * <br>error will be returned. Other errors are possible too, and depend
     * <br>on what kind of filesystem the file is on.
     * @param cancellable a &#35;GCancellable
     * @return &#35;GFileInputStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileInputStream read(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInputStream(new PointerContainer(JnaFile.INST().g_file_read(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously opens &#64;file for reading.
     * <br>
     * <br>For more details, see g_file_read() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_read_finish() to get the result
     * <br>of the operation.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_read_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file read operation started with
     * <br>g_file_read_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFileInputStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileInputStream readFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileInputStream(new PointerContainer(JnaFile.INST().g_file_read_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Returns an output stream for overwriting the file, possibly
     * <br>creating a backup copy of the file first. If the file doesn't exist,
     * <br>it will be created.
     * <br>
     * <br>This will try to replace the file in the safest way possible so
     * <br>that any errors during the writing will not affect an already
     * <br>existing copy of the file. For instance, for local files it
     * <br>may write to a temporary file and then atomically rename over
     * <br>the destination when the stream is closed.
     * <br>
     * <br>By default files created are generally readable by everyone,
     * <br>but if you pass %G_FILE_CREATE_PRIVATE in &#64;flags the file
     * <br>will be made readable only to the current user, to the level that
     * <br>is supported on the target filesystem.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If you pass in a non-%NULL &#64;etag value and &#64;file already exists, then
     * <br>this value is compared to the current entity tag of the file, and if
     * <br>they differ an %G_IO_ERROR_WRONG_ETAG error is returned. This
     * <br>generally means that the file has been changed since you last read
     * <br>it. You can get the new etag from g_file_output_stream_get_etag()
     * <br>after you've finished writing and closed the &#35;GFileOutputStream. When
     * <br>you load a new file you can use g_file_input_stream_query_info() to
     * <br>get the etag of the file.
     * <br>
     * <br>If &#64;make_backup is %TRUE, this function will attempt to make a
     * <br>backup of the current file before overwriting it. If this fails
     * <br>a %G_IO_ERROR_CANT_CREATE_BACKUP error will be returned. If you
     * <br>want to replace anyway, try again with &#64;make_backup set to %FALSE.
     * <br>
     * <br>If the file is a directory the %G_IO_ERROR_IS_DIRECTORY error will
     * <br>be returned, and if the file is some other form of non-regular file
     * <br>then a %G_IO_ERROR_NOT_REGULAR_FILE error will be returned. Some
     * <br>file systems don't allow all file names, and may return an
     * <br>%G_IO_ERROR_INVALID_FILENAME error, and if the name is to long
     * <br>%G_IO_ERROR_FILENAME_TOO_LONG will be returned. Other errors are
     * <br>possible too, and depend on what kind of filesystem the file is on.
     * @param etag an optional [entity tag][gfile-etag]   for the current &#35;GFile, or &#35;NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileOutputStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileOutputStream replace(@Nullable ch.bailu.gtk.type.Str etag, boolean make_backup, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileOutputStream(new PointerContainer(JnaFile.INST().g_file_replace(asCPointer(), asCPointer(etag), make_backup, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Returns an output stream for overwriting the file, possibly
     * <br>creating a backup copy of the file first. If the file doesn't exist,
     * <br>it will be created.
     * <br>
     * <br>This will try to replace the file in the safest way possible so
     * <br>that any errors during the writing will not affect an already
     * <br>existing copy of the file. For instance, for local files it
     * <br>may write to a temporary file and then atomically rename over
     * <br>the destination when the stream is closed.
     * <br>
     * <br>By default files created are generally readable by everyone,
     * <br>but if you pass %G_FILE_CREATE_PRIVATE in &#64;flags the file
     * <br>will be made readable only to the current user, to the level that
     * <br>is supported on the target filesystem.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled
     * <br>by triggering the cancellable object from another thread. If the
     * <br>operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * <br>returned.
     * <br>
     * <br>If you pass in a non-%NULL &#64;etag value and &#64;file already exists, then
     * <br>this value is compared to the current entity tag of the file, and if
     * <br>they differ an %G_IO_ERROR_WRONG_ETAG error is returned. This
     * <br>generally means that the file has been changed since you last read
     * <br>it. You can get the new etag from g_file_output_stream_get_etag()
     * <br>after you've finished writing and closed the &#35;GFileOutputStream. When
     * <br>you load a new file you can use g_file_input_stream_query_info() to
     * <br>get the etag of the file.
     * <br>
     * <br>If &#64;make_backup is %TRUE, this function will attempt to make a
     * <br>backup of the current file before overwriting it. If this fails
     * <br>a %G_IO_ERROR_CANT_CREATE_BACKUP error will be returned. If you
     * <br>want to replace anyway, try again with &#64;make_backup set to %FALSE.
     * <br>
     * <br>If the file is a directory the %G_IO_ERROR_IS_DIRECTORY error will
     * <br>be returned, and if the file is some other form of non-regular file
     * <br>then a %G_IO_ERROR_NOT_REGULAR_FILE error will be returned. Some
     * <br>file systems don't allow all file names, and may return an
     * <br>%G_IO_ERROR_INVALID_FILENAME error, and if the name is to long
     * <br>%G_IO_ERROR_FILENAME_TOO_LONG will be returned. Other errors are
     * <br>possible too, and depend on what kind of filesystem the file is on.
     * @param etag an optional [entity tag][gfile-etag]   for the current &#35;GFile, or &#35;NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileOutputStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileOutputStream replace(String etag, boolean make_backup, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileOutputStream(new PointerContainer(JnaFile.INST().g_file_replace(asCPointer(), etag, make_backup, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously overwrites the file, replacing the contents,
     * <br>possibly creating a backup copy of the file first.
     * <br>
     * <br>For more details, see g_file_replace() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_replace_finish() to get the result
     * <br>of the operation.
     * @param etag an [entity tag][gfile-etag] for the current &#35;GFile,   or %NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceAsync(@Nullable ch.bailu.gtk.type.Str etag, boolean make_backup, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_async(asCPointer(), asCPointer(etag), make_backup, flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously overwrites the file, replacing the contents,
     * <br>possibly creating a backup copy of the file first.
     * <br>
     * <br>For more details, see g_file_replace() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_replace_finish() to get the result
     * <br>of the operation.
     * @param etag an [entity tag][gfile-etag] for the current &#35;GFile,   or %NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceAsync(String etag, boolean make_backup, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_async(asCPointer(), etag, make_backup, flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceAsync", callback), asCPointer(user_data));
    }

    /**
     * Replaces the contents of &#64;file with &#64;contents of &#64;length bytes.
     * <br>
     * <br>If &#64;etag is specified (not %NULL), any existing file must have that etag,
     * <br>or the error %G_IO_ERROR_WRONG_ETAG will be returned.
     * <br>
     * <br>If &#64;make_backup is %TRUE, this function will attempt to make a backup
     * <br>of &#64;file. Internally, it uses g_file_replace(), so will try to replace the
     * <br>file contents in the safest way possible. For example, atomic renames are
     * <br>used when replacing local files’ contents.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>The returned &#64;new_etag can be used to verify that the file hasn't
     * <br>changed the next time it is saved over.
     * @param contents a string containing the new contents for &#64;file
     * @param length the length of &#64;contents in bytes
     * @param etag the old [entity-tag][gfile-etag] for the document,   or %NULL
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param new_etag a location to a new [entity tag][gfile-etag]   for the document. This should be freed with g_free() when no longer   needed, or %NULL
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return %TRUE if successful. If an error has occurred, this function   will return %FALSE and set &#64;error appropriately if present.
    */
    public boolean replaceContents(@Nonnull ch.bailu.gtk.type.Str contents, long length, @Nullable ch.bailu.gtk.type.Str etag, boolean make_backup, int flags, @Nullable ch.bailu.gtk.type.Strs new_etag, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_replace_contents(asCPointer(), asCPointerNotNull(contents), length, asCPointer(etag), make_backup, flags, asCPointer(new_etag), asCPointer(cancellable), 0L);
    }

    /**
     * Replaces the contents of &#64;file with &#64;contents of &#64;length bytes.
     * <br>
     * <br>If &#64;etag is specified (not %NULL), any existing file must have that etag,
     * <br>or the error %G_IO_ERROR_WRONG_ETAG will be returned.
     * <br>
     * <br>If &#64;make_backup is %TRUE, this function will attempt to make a backup
     * <br>of &#64;file. Internally, it uses g_file_replace(), so will try to replace the
     * <br>file contents in the safest way possible. For example, atomic renames are
     * <br>used when replacing local files’ contents.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>The returned &#64;new_etag can be used to verify that the file hasn't
     * <br>changed the next time it is saved over.
     * @param contents a string containing the new contents for &#64;file
     * @param length the length of &#64;contents in bytes
     * @param etag the old [entity-tag][gfile-etag] for the document,   or %NULL
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param new_etag a location to a new [entity tag][gfile-etag]   for the document. This should be freed with g_free() when no longer   needed, or %NULL
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return %TRUE if successful. If an error has occurred, this function   will return %FALSE and set &#64;error appropriately if present.
    */
    public boolean replaceContents(String contents, long length, String etag, boolean make_backup, int flags, @Nullable ch.bailu.gtk.type.Strs new_etag, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_replace_contents(asCPointer(), contents, length, etag, make_backup, flags, asCPointer(new_etag), asCPointer(cancellable), 0L);
    }

    /**
     * Starts an asynchronous replacement of &#64;file with the given
     * <br>&#64;contents of &#64;length bytes. &#64;etag will replace the document's
     * <br>current entity tag.
     * <br>
     * <br>When this operation has completed, &#64;callback will be called with
     * <br>&#64;user_user data, and the operation can be finalized with
     * <br>g_file_replace_contents_finish().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>If &#64;make_backup is %TRUE, this function will attempt to
     * <br>make a backup of &#64;file.
     * <br>
     * <br>Note that no copy of &#64;contents will be made, so it must stay valid
     * <br>until &#64;callback is called. See g_file_replace_contents_bytes_async()
     * <br>for a &#35;GBytes version that will automatically hold a reference to the
     * <br>contents (without copying) for the duration of the call.
     * @param contents string of contents to replace the file with
     * @param length the length of &#64;contents in bytes
     * @param etag a new [entity tag][gfile-etag] for the &#64;file, or %NULL
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceContentsAsync(@Nonnull ch.bailu.gtk.type.Str contents, long length, @Nullable ch.bailu.gtk.type.Str etag, boolean make_backup, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_contents_async(asCPointer(), asCPointerNotNull(contents), length, asCPointer(etag), make_backup, flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceContentsAsync", callback), asCPointer(user_data));
    }

    /**
     * Starts an asynchronous replacement of &#64;file with the given
     * <br>&#64;contents of &#64;length bytes. &#64;etag will replace the document's
     * <br>current entity tag.
     * <br>
     * <br>When this operation has completed, &#64;callback will be called with
     * <br>&#64;user_user data, and the operation can be finalized with
     * <br>g_file_replace_contents_finish().
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>If &#64;make_backup is %TRUE, this function will attempt to
     * <br>make a backup of &#64;file.
     * <br>
     * <br>Note that no copy of &#64;contents will be made, so it must stay valid
     * <br>until &#64;callback is called. See g_file_replace_contents_bytes_async()
     * <br>for a &#35;GBytes version that will automatically hold a reference to the
     * <br>contents (without copying) for the duration of the call.
     * @param contents string of contents to replace the file with
     * @param length the length of &#64;contents in bytes
     * @param etag a new [entity tag][gfile-etag] for the &#64;file, or %NULL
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceContentsAsync(String contents, long length, String etag, boolean make_backup, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_contents_async(asCPointer(), contents, length, etag, make_backup, flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceContentsAsync", callback), asCPointer(user_data));
    }

    /**
     * Same as g_file_replace_contents_async() but takes a &#35;GBytes input instead.
     * <br>This function will keep a ref on &#64;contents until the operation is done.
     * <br>Unlike g_file_replace_contents_async() this allows forgetting about the
     * <br>content without waiting for the callback.
     * <br>
     * <br>When this operation has completed, &#64;callback will be called with
     * <br>&#64;user_user data, and the operation can be finalized with
     * <br>g_file_replace_contents_finish().
     * @param contents a &#35;GBytes
     * @param etag a new [entity tag][gfile-etag] for the &#64;file, or %NULL
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceContentsBytesAsync(@Nonnull ch.bailu.gtk.glib.Bytes contents, @Nullable ch.bailu.gtk.type.Str etag, boolean make_backup, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_contents_bytes_async(asCPointer(), asCPointerNotNull(contents), asCPointer(etag), make_backup, flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceContentsBytesAsync", callback), asCPointer(user_data));
    }

    /**
     * Same as g_file_replace_contents_async() but takes a &#35;GBytes input instead.
     * <br>This function will keep a ref on &#64;contents until the operation is done.
     * <br>Unlike g_file_replace_contents_async() this allows forgetting about the
     * <br>content without waiting for the callback.
     * <br>
     * <br>When this operation has completed, &#64;callback will be called with
     * <br>&#64;user_user data, and the operation can be finalized with
     * <br>g_file_replace_contents_finish().
     * @param contents a &#35;GBytes
     * @param etag a new [entity tag][gfile-etag] for the &#64;file, or %NULL
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceContentsBytesAsync(@Nonnull ch.bailu.gtk.glib.Bytes contents, String etag, boolean make_backup, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_contents_bytes_async(asCPointer(), asCPointerNotNull(contents), etag, make_backup, flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceContentsBytesAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous replace of the given &#64;file. See
     * <br>g_file_replace_contents_async(). Sets &#64;new_etag to the new entity
     * <br>tag for the document, if present.
     * @param res a &#35;GAsyncResult
     * @param new_etag a location of a new [entity tag][gfile-etag]   for the document. This should be freed with g_free() when it is no   longer needed, or %NULL
     * @return %TRUE on success, %FALSE on failure.
    */
    public boolean replaceContentsFinish(@Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Strs new_etag) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_replace_contents_finish(asCPointer(), asCPointerNotNull(res), asCPointer(new_etag), 0L);
    }

    /**
     * Finishes an asynchronous file replace operation started with
     * <br>g_file_replace_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFileOutputStream, or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileOutputStream replaceFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileOutputStream(new PointerContainer(JnaFile.INST().g_file_replace_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Returns an output stream for overwriting the file in readwrite mode,
     * <br>possibly creating a backup copy of the file first. If the file doesn't
     * <br>exist, it will be created.
     * <br>
     * <br>For details about the behaviour, see g_file_replace() which does the
     * <br>same thing but returns an output stream only.
     * <br>
     * <br>Note that in many non-local file cases read and write streams are not
     * <br>supported, so make sure you really need to do read and write streaming,
     * <br>rather than just opening for reading or writing.
     * @param etag an optional [entity tag][gfile-etag]   for the current &#35;GFile, or &#35;NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileIOStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileIOStream replaceReadwrite(@Nullable ch.bailu.gtk.type.Str etag, boolean make_backup, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileIOStream(new PointerContainer(JnaFile.INST().g_file_replace_readwrite(asCPointer(), asCPointer(etag), make_backup, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Returns an output stream for overwriting the file in readwrite mode,
     * <br>possibly creating a backup copy of the file first. If the file doesn't
     * <br>exist, it will be created.
     * <br>
     * <br>For details about the behaviour, see g_file_replace() which does the
     * <br>same thing but returns an output stream only.
     * <br>
     * <br>Note that in many non-local file cases read and write streams are not
     * <br>supported, so make sure you really need to do read and write streaming,
     * <br>rather than just opening for reading or writing.
     * @param etag an optional [entity tag][gfile-etag]   for the current &#35;GFile, or &#35;NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFileIOStream or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileIOStream replaceReadwrite(String etag, boolean make_backup, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileIOStream(new PointerContainer(JnaFile.INST().g_file_replace_readwrite(asCPointer(), etag, make_backup, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously overwrites the file in read-write mode,
     * <br>replacing the contents, possibly creating a backup copy
     * <br>of the file first.
     * <br>
     * <br>For more details, see g_file_replace_readwrite() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_replace_readwrite_finish() to get
     * <br>the result of the operation.
     * @param etag an [entity tag][gfile-etag] for the current &#35;GFile,   or %NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceReadwriteAsync(@Nullable ch.bailu.gtk.type.Str etag, boolean make_backup, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_readwrite_async(asCPointer(), asCPointer(etag), make_backup, flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceReadwriteAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously overwrites the file in read-write mode,
     * <br>replacing the contents, possibly creating a backup copy
     * <br>of the file first.
     * <br>
     * <br>For more details, see g_file_replace_readwrite() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_replace_readwrite_finish() to get
     * <br>the result of the operation.
     * @param etag an [entity tag][gfile-etag] for the current &#35;GFile,   or %NULL to ignore
     * @param make_backup %TRUE if a backup should be created
     * @param flags a set of &#35;GFileCreateFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void replaceReadwriteAsync(String etag, boolean make_backup, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_replace_readwrite_async(asCPointer(), etag, make_backup, flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "replaceReadwriteAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file replace operation started with
     * <br>g_file_replace_readwrite_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFileIOStream, or %NULL on error.   Free the returned object with g_object_unref().
    */
    public FileIOStream replaceReadwriteFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new FileIOStream(new PointerContainer(JnaFile.INST().g_file_replace_readwrite_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Resolves a relative path for &#64;file to an absolute path.
     * <br>
     * <br>This call does no blocking I/O.
     * <br>
     * <br>If the &#64;relative_path is an absolute path name, the resolution
     * <br>is done absolutely (without taking &#64;file path as base).
     * @param relative_path a given relative path string
     * @return a &#35;GFile for the resolved path.
    */
    public File resolveRelativePath(@Nonnull ch.bailu.gtk.type.Str relative_path)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_resolve_relative_path(asCPointer(), asCPointerNotNull(relative_path))));
    }

    /**
     * Resolves a relative path for &#64;file to an absolute path.
     * <br>
     * <br>This call does no blocking I/O.
     * <br>
     * <br>If the &#64;relative_path is an absolute path name, the resolution
     * <br>is done absolutely (without taking &#64;file path as base).
     * @param relative_path a given relative path string
     * @return a &#35;GFile for the resolved path.
    */
    public File resolveRelativePath(String relative_path)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_resolve_relative_path(asCPointer(), relative_path)));
    }

    /**
     * Sets an attribute in the file with attribute name &#64;attribute to &#64;value_p.
     * <br>
     * <br>Some attributes can be unset by setting &#64;type to
     * <br>%G_FILE_ATTRIBUTE_TYPE_INVALID and &#64;value_p to %NULL.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param type The type of the attribute
     * @param value_p a pointer to the value (or the pointer   itself if the type is a pointer type)
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the attribute was set, %FALSE otherwise.
    */
    public boolean setAttribute(@Nonnull ch.bailu.gtk.type.Str attribute, int type, @Nullable ch.bailu.gtk.type.Pointer value_p, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute(asCPointer(), asCPointerNotNull(attribute), type, asCPointer(value_p), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets an attribute in the file with attribute name &#64;attribute to &#64;value_p.
     * <br>
     * <br>Some attributes can be unset by setting &#64;type to
     * <br>%G_FILE_ATTRIBUTE_TYPE_INVALID and &#64;value_p to %NULL.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param type The type of the attribute
     * @param value_p a pointer to the value (or the pointer   itself if the type is a pointer type)
     * @param flags a set of &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the attribute was set, %FALSE otherwise.
    */
    public boolean setAttribute(String attribute, int type, @Nullable ch.bailu.gtk.type.Pointer value_p, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute(asCPointer(), attribute, type, asCPointer(value_p), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail,
     * <br>returning %FALSE.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeByteString(@Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.type.Str value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_byte_string(asCPointer(), asCPointerNotNull(attribute), asCPointerNotNull(value), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail,
     * <br>returning %FALSE.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeByteString(String attribute, String value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_byte_string(asCPointer(), attribute, value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_INT32 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;gint32 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeInt32(@Nonnull ch.bailu.gtk.type.Str attribute, int value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_int32(asCPointer(), asCPointerNotNull(attribute), value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_INT32 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;gint32 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeInt32(String attribute, int value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_int32(asCPointer(), attribute, value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_INT64 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;guint64 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set, %FALSE otherwise.
    */
    public boolean setAttributeInt64(@Nonnull ch.bailu.gtk.type.Str attribute, long value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_int64(asCPointer(), asCPointerNotNull(attribute), value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_INT64 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;guint64 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set, %FALSE otherwise.
    */
    public boolean setAttributeInt64(String attribute, long value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_int64(asCPointer(), attribute, value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_STRING to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's value
     * @param flags &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set, %FALSE otherwise.
    */
    public boolean setAttributeString(@Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.type.Str value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_string(asCPointer(), asCPointerNotNull(attribute), asCPointerNotNull(value), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_STRING to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's value
     * @param flags &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set, %FALSE otherwise.
    */
    public boolean setAttributeString(String attribute, String value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_string(asCPointer(), attribute, value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT32 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;guint32 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeUint32(@Nonnull ch.bailu.gtk.type.Str attribute, int value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_uint32(asCPointer(), asCPointerNotNull(attribute), value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT32 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;guint32 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeUint32(String attribute, int value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_uint32(asCPointer(), attribute, value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT64 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;guint64 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeUint64(@Nonnull ch.bailu.gtk.type.Str attribute, long value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_uint64(asCPointer(), asCPointerNotNull(attribute), value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Sets &#64;attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT64 to &#64;value.
     * <br>If &#64;attribute is of a different type, this operation will fail.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a &#35;guint64 containing the attribute's new value
     * @param flags a &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE if the &#64;attribute was successfully set to &#64;value   in the &#64;file, %FALSE otherwise.
    */
    public boolean setAttributeUint64(String attribute, long value, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attribute_uint64(asCPointer(), attribute, value, flags, asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously sets the attributes of &#64;file with &#64;info.
     * <br>
     * <br>For more details, see g_file_set_attributes_from_info(),
     * <br>which is the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_set_attributes_finish() to get
     * <br>the result of the operation.
     * @param info a &#35;GFileInfo
     * @param flags a &#35;GFileQueryInfoFlags
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data a &#35;gpointer
    */
    public void setAttributesAsync(@Nonnull FileInfo info, int flags, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_set_attributes_async(asCPointer(), asCPointerNotNull(info), flags, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "setAttributesAsync", callback), asCPointer(user_data));
    }

    /**
     * Tries to set all attributes in the &#35;GFileInfo on the target
     * <br>values, not stopping on the first error.
     * <br>
     * <br>If there is any error during this operation then &#64;error will
     * <br>be set to the first error. Error on particular fields are flagged
     * <br>by setting the &quot;status&quot; field in the attribute value to
     * <br>%G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING, which means you can
     * <br>also detect further errors.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param info a &#35;GFileInfo
     * @param flags &#35;GFileQueryInfoFlags
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %FALSE if there was any error, %TRUE otherwise.
    */
    public boolean setAttributesFromInfo(@Nonnull FileInfo info, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_set_attributes_from_info(asCPointer(), asCPointerNotNull(info), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Renames &#64;file to the specified display name.
     * <br>
     * <br>The display name is converted from UTF-8 to the correct encoding
     * <br>for the target filesystem if possible and the &#64;file is renamed to this.
     * <br>
     * <br>If you want to implement a rename operation in the user interface the
     * <br>edit name (%G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME) should be used as the
     * <br>initial value in the rename widget, and then the result after editing
     * <br>should be passed to g_file_set_display_name().
     * <br>
     * <br>On success the resulting converted filename is returned.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param display_name a string
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFile specifying what &#64;file was renamed to,   or %NULL if there was an error.   Free the returned object with g_object_unref().
    */
    public File setDisplayName(@Nonnull ch.bailu.gtk.type.Str display_name, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaFile.INST().g_file_set_display_name(asCPointer(), asCPointerNotNull(display_name), asCPointer(cancellable), 0L)));
    }

    /**
     * Renames &#64;file to the specified display name.
     * <br>
     * <br>The display name is converted from UTF-8 to the correct encoding
     * <br>for the target filesystem if possible and the &#64;file is renamed to this.
     * <br>
     * <br>If you want to implement a rename operation in the user interface the
     * <br>edit name (%G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME) should be used as the
     * <br>initial value in the rename widget, and then the result after editing
     * <br>should be passed to g_file_set_display_name().
     * <br>
     * <br>On success the resulting converted filename is returned.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param display_name a string
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return a &#35;GFile specifying what &#64;file was renamed to,   or %NULL if there was an error.   Free the returned object with g_object_unref().
    */
    public File setDisplayName(String display_name, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaFile.INST().g_file_set_display_name(asCPointer(), display_name, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously sets the display name for a given &#35;GFile.
     * <br>
     * <br>For more details, see g_file_set_display_name() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_set_display_name_finish() to get
     * <br>the result of the operation.
     * @param display_name a string
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void setDisplayNameAsync(@Nonnull ch.bailu.gtk.type.Str display_name, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_set_display_name_async(asCPointer(), asCPointerNotNull(display_name), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "setDisplayNameAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously sets the display name for a given &#35;GFile.
     * <br>
     * <br>For more details, see g_file_set_display_name() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_set_display_name_finish() to get
     * <br>the result of the operation.
     * @param display_name a string
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void setDisplayNameAsync(String display_name, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_set_display_name_async(asCPointer(), display_name, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "setDisplayNameAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes setting a display name started with
     * <br>g_file_set_display_name_async().
     * @param res a &#35;GAsyncResult
     * @return a &#35;GFile or %NULL on error.   Free the returned object with g_object_unref().
    */
    public File setDisplayNameFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaFile.INST().g_file_set_display_name_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Starts a file of type %G_FILE_TYPE_MOUNTABLE.
     * <br>Using &#64;start_operation, you can request callbacks when, for instance,
     * <br>passwords are needed during authentication.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_mount_mountable_finish() to get
     * <br>the result of the operation.
     * @param flags flags affecting the operation
     * @param start_operation a &#35;GMountOperation, or %NULL to avoid user interaction
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied, or %NULL
     * @param user_data the data to pass to callback function
    */
    public void startMountable(int flags, @Nullable MountOperation start_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_start_mountable(asCPointer(), flags, asCPointer(start_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "startMountable", callback), asCPointer(user_data));
    }

    /**
     * Finishes a start operation. See g_file_start_mountable() for details.
     * <br>
     * <br>Finish an asynchronous start operation that was started
     * <br>with g_file_start_mountable().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the operation finished successfully. %FALSE otherwise.
    */
    public boolean startMountableFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_start_mountable_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Stops a file of type %G_FILE_TYPE_MOUNTABLE.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_stop_mountable_finish() to get
     * <br>the result of the operation.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation,   or %NULL to avoid user interaction.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied, or %NULL
     * @param user_data the data to pass to callback function
    */
    public void stopMountable(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_stop_mountable(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "stopMountable", callback), asCPointer(user_data));
    }

    /**
     * Finishes a stop operation, see g_file_stop_mountable() for details.
     * <br>
     * <br>Finish an asynchronous stop operation that was started
     * <br>with g_file_stop_mountable().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the operation finished successfully.   %FALSE otherwise.
    */
    public boolean stopMountableFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_stop_mountable_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Checks if &#64;file supports
     * <br>[thread-default contexts][g-main-context-push-thread-default-context].
     * <br>If this returns %FALSE, you cannot perform asynchronous operations on
     * <br>&#64;file in a thread that has a thread-default context.
     * @return Whether or not &#64;file supports thread-default contexts.
    */
    public boolean supportsThreadContexts()  {
        return JnaFile.INST().g_file_supports_thread_contexts(asCPointer());
    }

    /**
     * Sends &#64;file to the &quot;Trashcan&quot;, if possible. This is similar to
     * <br>deleting it, but the user can recover it before emptying the trashcan.
     * <br>Not all file systems support trashing, so this call can return the
     * <br>%G_IO_ERROR_NOT_SUPPORTED error. Since GLib 2.66, the `x-gvfs-notrash` unix
     * <br>mount option can be used to disable g_file_trash() support for certain
     * <br>mounts, the %G_IO_ERROR_NOT_SUPPORTED error will be returned in that case.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @return %TRUE on successful trash, %FALSE otherwise.
    */
    public boolean trash(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_trash(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously sends &#64;file to the Trash location, if possible.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void trashAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_trash_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "trashAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous file trashing operation, started with
     * <br>g_file_trash_async().
     * @param result a &#35;GAsyncResult
     * @return %TRUE on successful trash, %FALSE otherwise.
    */
    public boolean trashFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_trash_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Unmounts a file of type %G_FILE_TYPE_MOUNTABLE.
     * <br>
     * <br>If &#64;cancellable is not %NULL, then the operation can be cancelled by
     * <br>triggering the cancellable object from another thread. If the operation
     * <br>was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_file_unmount_mountable_finish() to get
     * <br>the result of the operation.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation,   or %NULL to avoid user interaction
     * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call   when the request is satisfied, or %NULL
     * @param user_data the data to pass to callback function
    */
    public void unmountMountableWithOperation(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_unmount_mountable_with_operation(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "unmountMountableWithOperation", callback), asCPointer(user_data));
    }

    /**
     * Finishes an unmount operation,
     * <br>see g_file_unmount_mountable_with_operation() for details.
     * <br>
     * <br>Finish an asynchronous unmount operation that was started
     * <br>with g_file_unmount_mountable_with_operation().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the operation finished successfully.   %FALSE otherwise.
    */
    public boolean unmountMountableWithOperationFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFile.INST().g_file_unmount_mountable_with_operation_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Constructs a &#35;GFile from a series of elements using the correct
     * <br>separator for filenames.
     * <br>
     * <br>Using this function is equivalent to calling g_build_filename(),
     * <br>followed by g_file_new_for_path() on the result.
     * @param first_element the first element in the path
     * @param _elipse remaining elements in path, terminated by %NULL
     * @return a new &#35;GFile
    */
    public static File newBuildFilename(@Nonnull ch.bailu.gtk.type.Str first_element, java.lang.Object... _elipse)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_new_build_filename(asCPointerNotNull(first_element), _elipse)));
    }

    /**
     * Creates a &#35;GFile with the given argument from the command line.
     * <br>The value of &#64;arg can be either a URI, an absolute path or a
     * <br>relative path resolved relative to the current working directory.
     * <br>This operation never fails, but the returned object might not
     * <br>support any I/O operation if &#64;arg points to a malformed path.
     * <br>
     * <br>Note that on Windows, this function expects its argument to be in
     * <br>UTF-8 -- not the system code page.  This means that you
     * <br>should not use this function with string from argv as it is passed
     * <br>to main().  g_win32_get_command_line() will return a UTF-8 version of
     * <br>the commandline.  &#35;GApplication also uses UTF-8 but
     * <br>g_application_command_line_create_file_for_arg() may be more useful
     * <br>for you there.  It is also always possible to use this function with
     * <br>&#35;GOptionContext arguments of type %G_OPTION_ARG_FILENAME.
     * @param arg a command line string
     * @return a new &#35;GFile.   Free the returned object with g_object_unref().
    */
    public static File newForCommandlineArg(@Nonnull ch.bailu.gtk.type.Str arg)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_new_for_commandline_arg(asCPointerNotNull(arg))));
    }

    /**
     * Creates a &#35;GFile with the given argument from the command line.
     * <br>
     * <br>This function is similar to g_file_new_for_commandline_arg() except
     * <br>that it allows for passing the current working directory as an
     * <br>argument instead of using the current working directory of the
     * <br>process.
     * <br>
     * <br>This is useful if the commandline argument was given in a context
     * <br>other than the invocation of the current process.
     * <br>
     * <br>See also g_application_command_line_create_file_for_arg().
     * @param arg a command line string
     * @param cwd the current working directory of the commandline
     * @return a new &#35;GFile
    */
    public static File newForCommandlineArgAndCwd(@Nonnull ch.bailu.gtk.type.Str arg, @Nonnull ch.bailu.gtk.type.Str cwd)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_new_for_commandline_arg_and_cwd(asCPointerNotNull(arg), asCPointerNotNull(cwd))));
    }

    /**
     * Constructs a &#35;GFile for a given path. This operation never
     * <br>fails, but the returned object might not support any I/O
     * <br>operation if &#64;path is malformed.
     * @param path a string containing a relative or absolute path.   The string must be encoded in the glib filename encoding.
     * @return a new &#35;GFile for the given &#64;path.   Free the returned object with g_object_unref().
    */
    public static File newForPath(@Nonnull ch.bailu.gtk.type.Str path)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_new_for_path(asCPointerNotNull(path))));
    }

    /**
     * Constructs a &#35;GFile for a given URI. This operation never
     * <br>fails, but the returned object might not support any I/O
     * <br>operation if &#64;uri is malformed or if the uri type is
     * <br>not supported.
     * @param uri a UTF-8 string containing a URI
     * @return a new &#35;GFile for the given &#64;uri.   Free the returned object with g_object_unref().
    */
    public static File newForUri(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_new_for_uri(asCPointerNotNull(uri))));
    }

    /**
     * Asynchronously opens a file in the preferred directory for temporary files
     * <br> (as returned by g_get_tmp_dir()) as g_file_new_tmp().
     * <br>
     * <br>&#64;tmpl should be a string in the GLib file name encoding
     * <br>containing a sequence of six 'X' characters, and containing no
     * <br>directory components. If it is %NULL, a default template is used.
     * @param tmpl Template for the file   name, as in g_file_open_tmp(), or %NULL for a default template
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public static void newTmpAsync(@Nullable ch.bailu.gtk.type.Str tmpl, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_new_tmp_async(asCPointer(tmpl), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newTmpAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously creates a directory in the preferred directory for
     * <br>temporary files (as returned by g_get_tmp_dir()) as g_dir_make_tmp().
     * <br>
     * <br>&#64;tmpl should be a string in the GLib file name encoding
     * <br>containing a sequence of six 'X' characters, and containing no
     * <br>directory components. If it is %NULL, a default template is used.
     * @param tmpl Template for the file   name, as in g_dir_make_tmp(), or %NULL for a default template
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public static void newTmpDirAsync(@Nullable ch.bailu.gtk.type.Str tmpl, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaFile.INST().g_file_new_tmp_dir_async(asCPointer(tmpl), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newTmpDirAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a temporary directory creation started by
     * <br>g_file_new_tmp_dir_async().
     * @param result a &#35;GAsyncResult
     * @return a new &#35;GFile.   Free the returned object with g_object_unref().
    */
    public static File newTmpDirFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaFile.INST().g_file_new_tmp_dir_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * Constructs a &#35;GFile with the given &#64;parse_name (i.e. something
     * <br>given by g_file_get_parse_name()). This operation never fails,
     * <br>but the returned object might not support any I/O operation if
     * <br>the &#64;parse_name cannot be parsed.
     * @param parse_name a file name or path to be parsed
     * @return a new &#35;GFile.
    */
    public static File parseName(@Nonnull ch.bailu.gtk.type.Str parse_name)  {
        return new File(new PointerContainer(JnaFile.INST().g_file_parse_name(asCPointerNotNull(parse_name))));
    }

    public static long getTypeID() { 
        return JnaFile.INST().g_file_get_type(); 
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
interface-type

[MethodModel:cb-not-supported:copy:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCopyFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:java-type-not-supported:FileProgressCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-not-supported:copyAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCopyFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:java-type-not-supported:FileProgressCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:ejectMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:ejectMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[MethodModel:java-type-not-supported:loadBytes:[ParameterModel:Supported:{Gg:Bytes:{c:GBytes*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:loadBytesFinish:[ParameterModel:Supported:{Gg:Bytes:{c:GBytes*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-not-supported:loadPartialContentsAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:FileReadMoreCallback:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:measureDiskUsage:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:GFileMeasureFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:FileMeasureProgressCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:measureDiskUsageFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]

[MethodModel:cb-not-supported:move:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCopyFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:java-type-not-supported:FileProgressCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-not-supported:moveAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCopyFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:java-type-not-supported:FileProgressCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:setAttributesFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GFileInfo**}}:{j:}]

[MethodModel:cb-deprecated:unmountMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:unmountMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[MethodModel:java-type-not-supported:newTmp:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GFileIOStream**}}:{j:}]

[MethodModel:java-type-not-supported:newTmpFinish:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GFileIOStream**}}:{j:}]
*/
