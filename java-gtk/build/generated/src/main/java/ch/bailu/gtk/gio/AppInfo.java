/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GAppInfo and &#35;GAppLaunchContext are used for describing and launching
 * <br>applications installed on the system.
 * <br>
 * <br>As of GLib 2.20, URIs will always be converted to POSIX paths
 * <br>(using g_file_get_path()) when using g_app_info_launch() even if
 * <br>the application requested an URI and not a POSIX path. For example
 * <br>for a desktop-file based application with Exec key `totem
 * <br>%U` and a single URI, `sftp://foo/file.avi`, then
 * <br>`/home/user/.gvfs/sftp on foo/file.avi` will be passed. This will
 * <br>only work if a set of suitable GIO extensions (such as gvfs 2.26
 * <br>compiled with FUSE support), is available and operational; if this
 * <br>is not the case, the URI will be passed unmodified to the application.
 * <br>Some URIs, such as `mailto:`, of course cannot be mapped to a POSIX
 * <br>path (in gvfs there's no FUSE mount for it); such URIs will be
 * <br>passed unmodified to the application.
 * <br>
 * <br>Specifically for gvfs 2.26 and later, the POSIX URI will be mapped
 * <br>back to the GIO URI in the &#35;GFile constructors (since gvfs
 * <br>implements the &#35;GVfs extension point). As such, if the application
 * <br>needs to examine the URI, it needs to use g_file_get_uri() or
 * <br>similar on &#35;GFile. In other words, an application cannot assume
 * <br>that the URI passed to e.g. g_file_new_for_commandline_arg() is
 * <br>equal to the result of g_file_get_uri(). The following snippet
 * <br>illustrates this:
 * <br>
 * <pre>
 * GFile *f;
 * char *uri;
 * 
 * file = g_file_new_for_commandline_arg (uri_from_commandline);
 * 
 * uri = g_file_get_uri (file);
 * strcmp (uri, uri_from_commandline) == 0;
 * g_free (uri);
 * 
 * if (g_file_has_uri_scheme (file, &quot;cdda&quot;))
 *   {
 *     // do something special with uri
 *   }
 * g_object_unref (file);
 * </pre>
 * <br>
 * <br>This code will work when both `cdda://sr0/Track 1.wav` and
 * <br>`/home/user/.gvfs/cdda on sr0/Track 1.wav` is passed to the
 * <br>application. It should be noted that it's generally not safe
 * <br>for applications to rely on the format of a particular URIs.
 * <br>Different launcher applications (e.g. file managers) may have
 * <br>different ideas of what a given URI means.
 * <p><a href="https://docs.gtk.org/gio/iface.AppInfo.html">https://docs.gtk.org/gio/iface.AppInfo.html</a></p>
*/
public class AppInfo extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppInfo.class.getCanonicalName());
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
    
    private static JnaAppInfo.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaAppInfo.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public AppInfo(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds a content type to the application information to indicate the
     * <br>application is capable of opening files with the given content type.
     * @param content_type a string.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean addSupportsType(@Nonnull ch.bailu.gtk.type.Str content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_add_supports_type(asCPointer(), asCPointerNotNull(content_type), 0L);
    }

    /**
     * Adds a content type to the application information to indicate the
     * <br>application is capable of opening files with the given content type.
     * @param content_type a string.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean addSupportsType(String content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_add_supports_type(asCPointer(), content_type, 0L);
    }

    /**
     * Obtains the information whether the &#35;GAppInfo can be deleted.
     * <br>See g_app_info_delete().
     * @return %TRUE if &#64;appinfo can be deleted
    */
    public boolean canDelete()  {
        return JnaAppInfo.INST().g_app_info_can_delete(asCPointer());
    }

    /**
     * Checks if a supported content type can be removed from an application.
     * @return %TRUE if it is possible to remove supported     content types from a given &#64;appinfo, %FALSE if not.
    */
    public boolean canRemoveSupportsType()  {
        return JnaAppInfo.INST().g_app_info_can_remove_supports_type(asCPointer());
    }

    /**
     * Tries to delete a &#35;GAppInfo.
     * <br>
     * <br>On some platforms, there may be a difference between user-defined
     * <br>&#35;GAppInfos which can be deleted, and system-wide ones which cannot.
     * <br>See g_app_info_can_delete().
     * @return %TRUE if &#64;appinfo has been deleted
    */
    public boolean delete()  {
        return JnaAppInfo.INST().g_app_info_delete(asCPointer());
    }

    /**
     * Creates a duplicate of a &#35;GAppInfo.
     * @return a duplicate of &#64;appinfo.
    */
    public AppInfo dup()  {
        return new AppInfo(new PointerContainer(JnaAppInfo.INST().g_app_info_dup(asCPointer())));
    }

    /**
     * Checks if two &#35;GAppInfos are equal.
     * <br>
     * <br>Note that the check *may not* compare each individual
     * <br>field, and only does an identity check. In case detecting changes in the
     * <br>contents is needed, program code must additionally compare relevant fields.
     * @param appinfo2 the second &#35;GAppInfo.
     * @return %TRUE if &#64;appinfo1 is equal to &#64;appinfo2. %FALSE otherwise.
    */
    public boolean equal(@Nonnull AppInfo appinfo2)  {
        return JnaAppInfo.INST().g_app_info_equal(asCPointer(), asCPointerNotNull(appinfo2));
    }

    /**
     * Gets the commandline with which the application will be
     * <br>started.
     * @return a string containing the &#64;appinfo's commandline,     or %NULL if this information is not available
    */
    public ch.bailu.gtk.type.Str getCommandline()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppInfo.INST().g_app_info_get_commandline(asCPointer())));
    }

    /**
     * Gets a human-readable description of an installed application.
     * @return a string containing a description of the application &#64;appinfo, or %NULL if none.
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppInfo.INST().g_app_info_get_description(asCPointer())));
    }

    /**
     * Gets the display name of the application. The display name is often more
     * <br>descriptive to the user than the name itself.
     * @return the display name of the application for &#64;appinfo, or the name if no display name is available.
    */
    public ch.bailu.gtk.type.Str getDisplayName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppInfo.INST().g_app_info_get_display_name(asCPointer())));
    }

    /**
     * Gets the executable's name for the installed application.
     * @return a string containing the &#64;appinfo's application binaries name
    */
    public ch.bailu.gtk.type.Str getExecutable()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppInfo.INST().g_app_info_get_executable(asCPointer())));
    }

    /**
     * Gets the icon for the application.
     * @return the default &#35;GIcon for &#64;appinfo or %NULL if there is no default icon.
    */
    public Icon getIcon()  {
        return new Icon(new PointerContainer(JnaAppInfo.INST().g_app_info_get_icon(asCPointer())));
    }

    /**
     * Gets the ID of an application. An id is a string that
     * <br>identifies the application. The exact format of the id is
     * <br>platform dependent. For instance, on Unix this is the
     * <br>desktop file id from the xdg menu specification.
     * <br>
     * <br>Note that the returned ID may be %NULL, depending on how
     * <br>the &#64;appinfo has been constructed.
     * @return a string containing the application's ID.
    */
    public ch.bailu.gtk.type.Str getId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppInfo.INST().g_app_info_get_id(asCPointer())));
    }

    /**
     * Gets the installed name of the application.
     * @return the name of the application for &#64;appinfo.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppInfo.INST().g_app_info_get_name(asCPointer())));
    }

    /**
     * Retrieves the list of content types that &#64;app_info claims to support.
     * <br>If this information is not provided by the environment, this function
     * <br>will return %NULL.
     * <br>This function does not take in consideration associations added with
     * <br>g_app_info_add_supports_type(), but only those exported directly by
     * <br>the application.
     * @return     a list of content types.
    */
    public ch.bailu.gtk.type.Strs getSupportedTypes()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAppInfo.INST().g_app_info_get_supported_types(asCPointer())));
    }

    /**
     * Launches the application. Passes &#64;files to the launched application
     * <br>as arguments, using the optional &#64;context to get information
     * <br>about the details of the launcher (like what screen it is on).
     * <br>On error, &#64;error will be set accordingly.
     * <br>
     * <br>To launch the application without arguments pass a %NULL &#64;files list.
     * <br>
     * <br>Note that even if the launch is successful the application launched
     * <br>can fail to start if it runs into problems during startup. There is
     * <br>no way to detect this.
     * <br>
     * <br>Some URIs can be changed when passed through a GFile (for instance
     * <br>unsupported URIs with strange formats like mailto:), so if you have
     * <br>a textual URI you want to pass in as argument, consider using
     * <br>g_app_info_launch_uris() instead.
     * <br>
     * <br>The launched application inherits the environment of the launching
     * <br>process, but it can be modified with g_app_launch_context_setenv()
     * <br>and g_app_launch_context_unsetenv().
     * <br>
     * <br>On UNIX, this function sets the `GIO_LAUNCHED_DESKTOP_FILE`
     * <br>environment variable with the path of the launched desktop file and
     * <br>`GIO_LAUNCHED_DESKTOP_FILE_PID` to the process id of the launched
     * <br>process. This can be used to ignore `GIO_LAUNCHED_DESKTOP_FILE`,
     * <br>should it be inherited by further processes. The `DISPLAY` and
     * <br>`DESKTOP_STARTUP_ID` environment variables are also set, based
     * <br>on information provided in &#64;context.
     * @param files a &#35;GList of &#35;GFile objects
     * @param context a &#35;GAppLaunchContext or %NULL
     * @return %TRUE on successful launch, %FALSE otherwise.
    */
    public boolean launch(@Nullable ch.bailu.gtk.glib.List files, @Nullable AppLaunchContext context) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_launch(asCPointer(), asCPointer(files), asCPointer(context), 0L);
    }

    /**
     * Launches the application. This passes the &#64;uris to the launched application
     * <br>as arguments, using the optional &#64;context to get information
     * <br>about the details of the launcher (like what screen it is on).
     * <br>On error, &#64;error will be set accordingly. If the application only supports
     * <br>one URI per invocation as part of their command-line, multiple instances
     * <br>of the application will be spawned.
     * <br>
     * <br>To launch the application without arguments pass a %NULL &#64;uris list.
     * <br>
     * <br>Note that even if the launch is successful the application launched
     * <br>can fail to start if it runs into problems during startup. There is
     * <br>no way to detect this.
     * @param uris a &#35;GList containing URIs to launch.
     * @param context a &#35;GAppLaunchContext or %NULL
     * @return %TRUE on successful launch, %FALSE otherwise.
    */
    public boolean launchUris(@Nullable ch.bailu.gtk.glib.List uris, @Nullable AppLaunchContext context) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_launch_uris(asCPointer(), asCPointer(uris), asCPointer(context), 0L);
    }

    /**
     * Async version of g_app_info_launch_uris().
     * <br>
     * <br>The &#64;callback is invoked immediately after the application launch, but it
     * <br>waits for activation in case of D-Bus–activated applications and also provides
     * <br>extended error information for sandboxed applications, see notes for
     * <br>g_app_info_launch_default_for_uri_async().
     * @param uris a &#35;GList containing URIs to launch.
     * @param context a &#35;GAppLaunchContext or %NULL
     * @param cancellable a &#35;GCancellable
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public void launchUrisAsync(@Nullable ch.bailu.gtk.glib.List uris, @Nullable AppLaunchContext context, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAppInfo.INST().g_app_info_launch_uris_async(asCPointer(), asCPointer(uris), asCPointer(context), asCPointer(cancellable), toOnAsyncReadyCallback(this, "launchUrisAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a g_app_info_launch_uris_async() operation.
     * @param result a &#35;GAsyncResult
     * @return %TRUE on successful launch, %FALSE otherwise.
    */
    public boolean launchUrisFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_launch_uris_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Removes a supported type from an application, if possible.
     * @param content_type a string.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean removeSupportsType(@Nonnull ch.bailu.gtk.type.Str content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_remove_supports_type(asCPointer(), asCPointerNotNull(content_type), 0L);
    }

    /**
     * Removes a supported type from an application, if possible.
     * @param content_type a string.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean removeSupportsType(String content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_remove_supports_type(asCPointer(), content_type, 0L);
    }

    /**
     * Sets the application as the default handler for the given file extension.
     * @param extension a string containing the file extension     (without the dot).
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean setAsDefaultForExtension(@Nonnull ch.bailu.gtk.type.Str extension) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_set_as_default_for_extension(asCPointer(), asCPointerNotNull(extension), 0L);
    }

    /**
     * Sets the application as the default handler for the given file extension.
     * @param extension a string containing the file extension     (without the dot).
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean setAsDefaultForExtension(String extension) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_set_as_default_for_extension(asCPointer(), extension, 0L);
    }

    /**
     * Sets the application as the default handler for a given type.
     * @param content_type the content type.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean setAsDefaultForType(@Nonnull ch.bailu.gtk.type.Str content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_set_as_default_for_type(asCPointer(), asCPointerNotNull(content_type), 0L);
    }

    /**
     * Sets the application as the default handler for a given type.
     * @param content_type the content type.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean setAsDefaultForType(String content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_set_as_default_for_type(asCPointer(), content_type, 0L);
    }

    /**
     * Sets the application as the last used application for a given type.
     * <br>This will make the application appear as first in the list returned
     * <br>by g_app_info_get_recommended_for_type(), regardless of the default
     * <br>application for that content type.
     * @param content_type the content type.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean setAsLastUsedForType(@Nonnull ch.bailu.gtk.type.Str content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_set_as_last_used_for_type(asCPointer(), asCPointerNotNull(content_type), 0L);
    }

    /**
     * Sets the application as the last used application for a given type.
     * <br>This will make the application appear as first in the list returned
     * <br>by g_app_info_get_recommended_for_type(), regardless of the default
     * <br>application for that content type.
     * @param content_type the content type.
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean setAsLastUsedForType(String content_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_set_as_last_used_for_type(asCPointer(), content_type, 0L);
    }

    /**
     * Checks if the application info should be shown in menus that
     * <br>list available applications.
     * @return %TRUE if the &#64;appinfo should be shown, %FALSE otherwise.
    */
    public boolean shouldShow()  {
        return JnaAppInfo.INST().g_app_info_should_show(asCPointer());
    }

    /**
     * Checks if the application accepts files as arguments.
     * @return %TRUE if the &#64;appinfo supports files.
    */
    public boolean supportsFiles()  {
        return JnaAppInfo.INST().g_app_info_supports_files(asCPointer());
    }

    /**
     * Checks if the application supports reading files and directories from URIs.
     * @return %TRUE if the &#64;appinfo supports URIs.
    */
    public boolean supportsUris()  {
        return JnaAppInfo.INST().g_app_info_supports_uris(asCPointer());
    }

    /**
     * Creates a new &#35;GAppInfo from the given information.
     * <br>
     * <br>Note that for &#64;commandline, the quoting rules of the Exec key of the
     * <br>[freedesktop.org Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec)
     * <br>are applied. For example, if the &#64;commandline contains
     * <br>percent-encoded URIs, the percent-character must be doubled in order to prevent it from
     * <br>being swallowed by Exec key unquoting. See the specification for exact quoting rules.
     * @param commandline the commandline to use
     * @param application_name the application name, or %NULL to use &#64;commandline
     * @param flags flags that can specify details of the created &#35;GAppInfo
     * @return new &#35;GAppInfo for given command.
    */
    public static AppInfo createFromCommandline(@Nonnull ch.bailu.gtk.type.Str commandline, @Nullable ch.bailu.gtk.type.Str application_name, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaAppInfo.INST().g_app_info_create_from_commandline(asCPointerNotNull(commandline), asCPointer(application_name), flags, 0L)));
    }

    /**
     * Gets a list of all of the applications currently registered
     * <br>on this system.
     * <br>
     * <br>For desktop files, this includes applications that have
     * <br>`NoDisplay=true` set or are excluded from display by means
     * <br>of `OnlyShowIn` or `NotShowIn`. See g_app_info_should_show().
     * <br>The returned list does not include applications which have
     * <br>the `Hidden` key set.
     * @return a newly allocated &#35;GList of references to &#35;GAppInfos.
    */
    public static ch.bailu.gtk.glib.List getAll()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaAppInfo.INST().g_app_info_get_all()));
    }

    /**
     * Gets a list of all &#35;GAppInfos for a given content type,
     * <br>including the recommended and fallback &#35;GAppInfos. See
     * <br>g_app_info_get_recommended_for_type() and
     * <br>g_app_info_get_fallback_for_type().
     * @param content_type the content type to find a &#35;GAppInfo for
     * @return &#35;GList of &#35;GAppInfos     for given &#64;content_type or %NULL on error.
    */
    public static ch.bailu.gtk.glib.List getAllForType(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaAppInfo.INST().g_app_info_get_all_for_type(asCPointerNotNull(content_type))));
    }

    /**
     * Gets the default &#35;GAppInfo for a given content type.
     * @param content_type the content type to find a &#35;GAppInfo for
     * @param must_support_uris if %TRUE, the &#35;GAppInfo is expected to     support URIs
     * @return &#35;GAppInfo for given &#64;content_type or     %NULL on error.
    */
    public static AppInfo getDefaultForType(@Nonnull ch.bailu.gtk.type.Str content_type, boolean must_support_uris)  {
        return new AppInfo(new PointerContainer(JnaAppInfo.INST().g_app_info_get_default_for_type(asCPointerNotNull(content_type), must_support_uris)));
    }

    /**
     * Asynchronously gets the default &#35;GAppInfo for a given content type.
     * @param content_type the content type to find a &#35;GAppInfo for
     * @param must_support_uris if %TRUE, the &#35;GAppInfo is expected to     support URIs
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public static void getDefaultForTypeAsync(@Nonnull ch.bailu.gtk.type.Str content_type, boolean must_support_uris, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAppInfo.INST().g_app_info_get_default_for_type_async(asCPointerNotNull(content_type), must_support_uris, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "getDefaultForTypeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a default &#35;GAppInfo lookup started by
     * <br>g_app_info_get_default_for_type_async().
     * <br>
     * <br>If no &#35;GAppInfo is found, then &#64;error will be set to %G_IO_ERROR_NOT_FOUND.
     * @param result a &#35;GAsyncResult
     * @return &#35;GAppInfo for given &#64;content_type or     %NULL on error.
    */
    public static AppInfo getDefaultForTypeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaAppInfo.INST().g_app_info_get_default_for_type_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * Gets the default application for handling URIs with
     * <br>the given URI scheme. A URI scheme is the initial part
     * <br>of the URI, up to but not including the ':', e.g. &quot;http&quot;,
     * <br>&quot;ftp&quot; or &quot;sip&quot;.
     * @param uri_scheme a string containing a URI scheme.
     * @return &#35;GAppInfo for given &#64;uri_scheme or     %NULL on error.
    */
    public static AppInfo getDefaultForUriScheme(@Nonnull ch.bailu.gtk.type.Str uri_scheme)  {
        return new AppInfo(new PointerContainer(JnaAppInfo.INST().g_app_info_get_default_for_uri_scheme(asCPointerNotNull(uri_scheme))));
    }

    /**
     * Asynchronously gets the default application for handling URIs with
     * <br>the given URI scheme. A URI scheme is the initial part
     * <br>of the URI, up to but not including the ':', e.g. &quot;http&quot;,
     * <br>&quot;ftp&quot; or &quot;sip&quot;.
     * @param uri_scheme a string containing a URI scheme.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public static void getDefaultForUriSchemeAsync(@Nonnull ch.bailu.gtk.type.Str uri_scheme, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAppInfo.INST().g_app_info_get_default_for_uri_scheme_async(asCPointerNotNull(uri_scheme), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "getDefaultForUriSchemeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a default &#35;GAppInfo lookup started by
     * <br>g_app_info_get_default_for_uri_scheme_async().
     * <br>
     * <br>If no &#35;GAppInfo is found, then &#64;error will be set to %G_IO_ERROR_NOT_FOUND.
     * @param result a &#35;GAsyncResult
     * @return &#35;GAppInfo for given &#64;uri_scheme or     %NULL on error.
    */
    public static AppInfo getDefaultForUriSchemeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaAppInfo.INST().g_app_info_get_default_for_uri_scheme_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * Gets a list of fallback &#35;GAppInfos for a given content type, i.e.
     * <br>those applications which claim to support the given content type
     * <br>by MIME type subclassing and not directly.
     * @param content_type the content type to find a &#35;GAppInfo for
     * @return &#35;GList of &#35;GAppInfos     for given &#64;content_type or %NULL on error.
    */
    public static ch.bailu.gtk.glib.List getFallbackForType(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaAppInfo.INST().g_app_info_get_fallback_for_type(asCPointerNotNull(content_type))));
    }

    /**
     * Gets a list of recommended &#35;GAppInfos for a given content type, i.e.
     * <br>those applications which claim to support the given content type exactly,
     * <br>and not by MIME type subclassing.
     * <br>Note that the first application of the list is the last used one, i.e.
     * <br>the last one for which g_app_info_set_as_last_used_for_type() has been
     * <br>called.
     * @param content_type the content type to find a &#35;GAppInfo for
     * @return &#35;GList of &#35;GAppInfos     for given &#64;content_type or %NULL on error.
    */
    public static ch.bailu.gtk.glib.List getRecommendedForType(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaAppInfo.INST().g_app_info_get_recommended_for_type(asCPointerNotNull(content_type))));
    }

    /**
     * Utility function that launches the default application
     * <br>registered to handle the specified uri. Synchronous I/O
     * <br>is done on the uri to detect the type of the file if
     * <br>required.
     * <br>
     * <br>The D-Bus–activated applications don't have to be started if your application
     * <br>terminates too soon after this function. To prevent this, use
     * <br>g_app_info_launch_default_for_uri_async() instead.
     * @param uri the uri to show
     * @param context an optional &#35;GAppLaunchContext
     * @return %TRUE on success, %FALSE on error.
    */
    public static boolean launchDefaultForUri(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable AppLaunchContext context) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_launch_default_for_uri(asCPointerNotNull(uri), asCPointer(context), 0L);
    }

    /**
     * Async version of g_app_info_launch_default_for_uri().
     * <br>
     * <br>This version is useful if you are interested in receiving
     * <br>error information in the case where the application is
     * <br>sandboxed and the portal may present an application chooser
     * <br>dialog to the user.
     * <br>
     * <br>This is also useful if you want to be sure that the D-Bus–activated
     * <br>applications are really started before termination and if you are interested
     * <br>in receiving error information from their activation.
     * @param uri the uri to show
     * @param context an optional &#35;GAppLaunchContext
     * @param cancellable a &#35;GCancellable
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public static void launchDefaultForUriAsync(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable AppLaunchContext context, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAppInfo.INST().g_app_info_launch_default_for_uri_async(asCPointerNotNull(uri), asCPointer(context), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "launchDefaultForUriAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous launch-default-for-uri operation.
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the launch was successful, %FALSE if &#64;error is set
    */
    public static boolean launchDefaultForUriFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAppInfo.INST().g_app_info_launch_default_for_uri_finish(asCPointerNotNull(result), 0L);
    }

    /**
     * Removes all changes to the type associations done by
     * <br>g_app_info_set_as_default_for_type(),
     * <br>g_app_info_set_as_default_for_extension(),
     * <br>g_app_info_add_supports_type() or
     * <br>g_app_info_remove_supports_type().
     * @param content_type a content type
    */
    public static void resetTypeAssociations(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        JnaAppInfo.INST().g_app_info_reset_type_associations(asCPointerNotNull(content_type));
    }

    public static long getTypeID() { 
        return JnaAppInfo.INST().g_app_info_get_type(); 
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
*/
