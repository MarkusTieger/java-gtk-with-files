/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Gio extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Gio.class.getCanonicalName());
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
    
    private static JnaGio.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaGio.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBusAcquiredCallback {
        /**
         * Invoked when a connection to a message bus has been obtained.
         * @param connection The &#35;GDBusConnection to a message bus.
         * @param name The name that is requested to be owned.
         * @param user_data User data passed to g_bus_own_name().
        */
        void onBusAcquiredCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGio.OnBusAcquiredCallback toOnBusAcquiredCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnBusAcquiredCallback in) {
        JnaGio.OnBusAcquiredCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _name, _user_data) -> in.onBusAcquiredCallback(__callback, new DBusConnection(new PointerContainer(_connection)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBusNameAcquiredCallback {
        /**
         * Invoked when the name is acquired.
         * @param connection The &#35;GDBusConnection on which to acquired the name.
         * @param name The name being owned.
         * @param user_data User data passed to g_bus_own_name() or g_bus_own_name_on_connection().
        */
        void onBusNameAcquiredCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGio.OnBusNameAcquiredCallback toOnBusNameAcquiredCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnBusNameAcquiredCallback in) {
        JnaGio.OnBusNameAcquiredCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _name, _user_data) -> in.onBusNameAcquiredCallback(__callback, new DBusConnection(new PointerContainer(_connection)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBusNameLostCallback {
        /**
         * Invoked when the name is lost or &#64;connection has been closed.
         * @param connection The &#35;GDBusConnection on which to acquire the name or %NULL if the connection was disconnected.
         * @param name The name being owned.
         * @param user_data User data passed to g_bus_own_name() or g_bus_own_name_on_connection().
        */
        void onBusNameLostCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGio.OnBusNameLostCallback toOnBusNameLostCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnBusNameLostCallback in) {
        JnaGio.OnBusNameLostCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _name, _user_data) -> in.onBusNameLostCallback(__callback, new DBusConnection(new PointerContainer(_connection)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaGio.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaGio.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBusNameAppearedCallback {
        /**
         * Invoked when the name being watched is known to have to have an owner.
         * @param connection The &#35;GDBusConnection the name is being watched on.
         * @param name The name being watched.
         * @param name_owner Unique name of the owner of the name being watched.
         * @param user_data User data passed to g_bus_watch_name().
        */
        void onBusNameAppearedCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str name_owner, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGio.OnBusNameAppearedCallback toOnBusNameAppearedCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnBusNameAppearedCallback in) {
        JnaGio.OnBusNameAppearedCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _name, _name_owner, _user_data) -> in.onBusNameAppearedCallback(__callback, new DBusConnection(new PointerContainer(_connection)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)), new ch.bailu.gtk.type.Str(new PointerContainer(_name_owner)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBusNameVanishedCallback {
        /**
         * Invoked when the name being watched is known not to have to have an owner.
         * <br>
         * <br>This is also invoked when the &#35;GDBusConnection on which the watch was
         * <br>established has been closed.  In that case, &#64;connection will be
         * <br>%NULL.
         * @param connection The &#35;GDBusConnection the name is being watched on, or     %NULL.
         * @param name The name being watched.
         * @param user_data User data passed to g_bus_watch_name().
        */
        void onBusNameVanishedCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGio.OnBusNameVanishedCallback toOnBusNameVanishedCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnBusNameVanishedCallback in) {
        JnaGio.OnBusNameVanishedCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _name, _user_data) -> in.onBusNameVanishedCallback(__callback, new DBusConnection(new PointerContainer(_connection)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    /**
     * Checks if &#64;action_name is valid.
     * <br>
     * <br>&#64;action_name is valid if it consists only of alphanumeric characters,
     * <br>plus '-' and '.'.  The empty string is not a valid action name.
     * <br>
     * <br>It is an error to call this function with a non-utf8 &#64;action_name.
     * <br>&#64;action_name must not be %NULL.
     * @param action_name a potential action name
     * @return %TRUE if &#64;action_name is valid
    */
    public static boolean actionNameIsValid(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return JnaGio.INST().g_action_name_is_valid(asCPointerNotNull(action_name));
    }

    /**
     * Formats a detailed action name from &#64;action_name and &#64;target_value.
     * <br>
     * <br>It is an error to call this function with an invalid action name.
     * <br>
     * <br>This function is the opposite of g_action_parse_detailed_name().
     * <br>It will produce a string that can be parsed back to the &#64;action_name
     * <br>and &#64;target_value by that function.
     * <br>
     * <br>See that function for the types of strings that will be printed by
     * <br>this function.
     * @param action_name a valid action name
     * @param target_value a &#35;GVariant target value, or %NULL
     * @return a detailed format string
    */
    public static ch.bailu.gtk.type.Str actionPrintDetailedName(@Nonnull ch.bailu.gtk.type.Str action_name, @Nullable ch.bailu.gtk.glib.Variant target_value)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_action_print_detailed_name(asCPointerNotNull(action_name), asCPointer(target_value))));
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
    public static AppInfo appInfoCreateFromCommandline(@Nonnull ch.bailu.gtk.type.Str commandline, @Nullable ch.bailu.gtk.type.Str application_name, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaGio.INST().g_app_info_create_from_commandline(asCPointerNotNull(commandline), asCPointer(application_name), flags, 0L)));
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
    public static ch.bailu.gtk.glib.List appInfoGetAll()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_app_info_get_all()));
    }

    /**
     * Gets a list of all &#35;GAppInfos for a given content type,
     * <br>including the recommended and fallback &#35;GAppInfos. See
     * <br>g_app_info_get_recommended_for_type() and
     * <br>g_app_info_get_fallback_for_type().
     * @param content_type the content type to find a &#35;GAppInfo for
     * @return &#35;GList of &#35;GAppInfos     for given &#64;content_type or %NULL on error.
    */
    public static ch.bailu.gtk.glib.List appInfoGetAllForType(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_app_info_get_all_for_type(asCPointerNotNull(content_type))));
    }

    /**
     * Gets the default &#35;GAppInfo for a given content type.
     * @param content_type the content type to find a &#35;GAppInfo for
     * @param must_support_uris if %TRUE, the &#35;GAppInfo is expected to     support URIs
     * @return &#35;GAppInfo for given &#64;content_type or     %NULL on error.
    */
    public static AppInfo appInfoGetDefaultForType(@Nonnull ch.bailu.gtk.type.Str content_type, boolean must_support_uris)  {
        return new AppInfo(new PointerContainer(JnaGio.INST().g_app_info_get_default_for_type(asCPointerNotNull(content_type), must_support_uris)));
    }

    /**
     * Asynchronously gets the default &#35;GAppInfo for a given content type.
     * @param content_type the content type to find a &#35;GAppInfo for
     * @param must_support_uris if %TRUE, the &#35;GAppInfo is expected to     support URIs
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback to call when the request is done
     * @param user_data data to pass to &#64;callback
    */
    public static void appInfoGetDefaultForTypeAsync(@Nonnull ch.bailu.gtk.type.Str content_type, boolean must_support_uris, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGio.INST().g_app_info_get_default_for_type_async(asCPointerNotNull(content_type), must_support_uris, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "appInfoGetDefaultForTypeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a default &#35;GAppInfo lookup started by
     * <br>g_app_info_get_default_for_type_async().
     * <br>
     * <br>If no &#35;GAppInfo is found, then &#64;error will be set to %G_IO_ERROR_NOT_FOUND.
     * @param result a &#35;GAsyncResult
     * @return &#35;GAppInfo for given &#64;content_type or     %NULL on error.
    */
    public static AppInfo appInfoGetDefaultForTypeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaGio.INST().g_app_info_get_default_for_type_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * Gets the default application for handling URIs with
     * <br>the given URI scheme. A URI scheme is the initial part
     * <br>of the URI, up to but not including the ':', e.g. &quot;http&quot;,
     * <br>&quot;ftp&quot; or &quot;sip&quot;.
     * @param uri_scheme a string containing a URI scheme.
     * @return &#35;GAppInfo for given &#64;uri_scheme or     %NULL on error.
    */
    public static AppInfo appInfoGetDefaultForUriScheme(@Nonnull ch.bailu.gtk.type.Str uri_scheme)  {
        return new AppInfo(new PointerContainer(JnaGio.INST().g_app_info_get_default_for_uri_scheme(asCPointerNotNull(uri_scheme))));
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
    public static void appInfoGetDefaultForUriSchemeAsync(@Nonnull ch.bailu.gtk.type.Str uri_scheme, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGio.INST().g_app_info_get_default_for_uri_scheme_async(asCPointerNotNull(uri_scheme), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "appInfoGetDefaultForUriSchemeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a default &#35;GAppInfo lookup started by
     * <br>g_app_info_get_default_for_uri_scheme_async().
     * <br>
     * <br>If no &#35;GAppInfo is found, then &#64;error will be set to %G_IO_ERROR_NOT_FOUND.
     * @param result a &#35;GAsyncResult
     * @return &#35;GAppInfo for given &#64;uri_scheme or     %NULL on error.
    */
    public static AppInfo appInfoGetDefaultForUriSchemeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new AppInfo(new PointerContainer(JnaGio.INST().g_app_info_get_default_for_uri_scheme_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * Gets a list of fallback &#35;GAppInfos for a given content type, i.e.
     * <br>those applications which claim to support the given content type
     * <br>by MIME type subclassing and not directly.
     * @param content_type the content type to find a &#35;GAppInfo for
     * @return &#35;GList of &#35;GAppInfos     for given &#64;content_type or %NULL on error.
    */
    public static ch.bailu.gtk.glib.List appInfoGetFallbackForType(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_app_info_get_fallback_for_type(asCPointerNotNull(content_type))));
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
    public static ch.bailu.gtk.glib.List appInfoGetRecommendedForType(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_app_info_get_recommended_for_type(asCPointerNotNull(content_type))));
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
    public static boolean appInfoLaunchDefaultForUri(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable AppLaunchContext context) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGio.INST().g_app_info_launch_default_for_uri(asCPointerNotNull(uri), asCPointer(context), 0L);
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
    public static void appInfoLaunchDefaultForUriAsync(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable AppLaunchContext context, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGio.INST().g_app_info_launch_default_for_uri_async(asCPointerNotNull(uri), asCPointer(context), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "appInfoLaunchDefaultForUriAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous launch-default-for-uri operation.
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the launch was successful, %FALSE if &#64;error is set
    */
    public static boolean appInfoLaunchDefaultForUriFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGio.INST().g_app_info_launch_default_for_uri_finish(asCPointerNotNull(result), 0L);
    }

    /**
     * Removes all changes to the type associations done by
     * <br>g_app_info_set_as_default_for_type(),
     * <br>g_app_info_set_as_default_for_extension(),
     * <br>g_app_info_add_supports_type() or
     * <br>g_app_info_remove_supports_type().
     * @param content_type a content type
    */
    public static void appInfoResetTypeAssociations(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        JnaGio.INST().g_app_info_reset_type_associations(asCPointerNotNull(content_type));
    }

    /**
     * Asynchronously connects to the message bus specified by &#64;bus_type.
     * <br>
     * <br>When the operation is finished, &#64;callback will be invoked. You can
     * <br>then call g_bus_get_finish() to get the result of the operation.
     * <br>
     * <br>This is an asynchronous failable function. See g_bus_get_sync() for
     * <br>the synchronous version.
     * @param bus_type a &#35;GBusType
     * @param cancellable a &#35;GCancellable or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to &#64;callback
    */
    public static void busGet(int bus_type, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGio.INST().g_bus_get(bus_type, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "busGet", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with g_bus_get().
     * <br>
     * <br>The returned object is a singleton, that is, shared with other
     * <br>callers of g_bus_get() and g_bus_get_sync() for &#64;bus_type. In the
     * <br>event that you need a private message bus connection, use
     * <br>g_dbus_address_get_for_bus_sync() and
     * <br>g_dbus_connection_new_for_address() with
     * <br>G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * <br>G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     * <br>
     * <br>Note that the returned &#35;GDBusConnection object will (usually) have
     * <br>the &#35;GDBusConnection:exit-on-close property set to %TRUE.
     * @param res a &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed     to g_bus_get()
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public static DBusConnection busGetFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DBusConnection(new PointerContainer(JnaGio.INST().g_bus_get_finish(asCPointerNotNull(res), 0L)));
    }

    /**
     * Synchronously connects to the message bus specified by &#64;bus_type.
     * <br>Note that the returned object may shared with other callers,
     * <br>e.g. if two separate parts of a process calls this function with
     * <br>the same &#64;bus_type, they will share the same object.
     * <br>
     * <br>This is a synchronous failable function. See g_bus_get() and
     * <br>g_bus_get_finish() for the asynchronous version.
     * <br>
     * <br>The returned object is a singleton, that is, shared with other
     * <br>callers of g_bus_get() and g_bus_get_sync() for &#64;bus_type. In the
     * <br>event that you need a private message bus connection, use
     * <br>g_dbus_address_get_for_bus_sync() and
     * <br>g_dbus_connection_new_for_address() with
     * <br>G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * <br>G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     * <br>
     * <br>Note that the returned &#35;GDBusConnection object will (usually) have
     * <br>the &#35;GDBusConnection:exit-on-close property set to %TRUE.
     * @param bus_type a &#35;GBusType
     * @param cancellable a &#35;GCancellable or %NULL
     * @return a &#35;GDBusConnection or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public static DBusConnection busGetSync(int bus_type, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DBusConnection(new PointerContainer(JnaGio.INST().g_bus_get_sync(bus_type, asCPointer(cancellable), 0L)));
    }

    /**
     * Starts acquiring &#64;name on the bus specified by &#64;bus_type and calls
     * <br>&#64;name_acquired_handler and &#64;name_lost_handler when the name is
     * <br>acquired respectively lost. Callbacks will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this function from.
     * <br>
     * <br>You are guaranteed that one of the &#64;name_acquired_handler and &#64;name_lost_handler
     * <br>callbacks will be invoked after calling this function - there are three
     * <br>possible cases:
     * <br>
     * <br>- &#64;name_lost_handler with a %NULL connection (if a connection to the bus
     * <br>  can't be made).
     * <br>
     * <br>- &#64;bus_acquired_handler then &#64;name_lost_handler (if the name can't be
     * <br>  obtained)
     * <br>
     * <br>- &#64;bus_acquired_handler then &#64;name_acquired_handler (if the name was
     * <br>  obtained).
     * <br>
     * <br>When you are done owning the name, just call g_bus_unown_name()
     * <br>with the owner id this function returns.
     * <br>
     * <br>If the name is acquired or lost (for example another application
     * <br>could acquire the name if you allow replacement or the application
     * <br>currently owning the name exits), the handlers are also invoked.
     * <br>If the &#35;GDBusConnection that is used for attempting to own the name
     * <br>closes, then &#64;name_lost_handler is invoked since it is no longer
     * <br>possible for other processes to access the process.
     * <br>
     * <br>You cannot use g_bus_own_name() several times for the same name (unless
     * <br>interleaved with calls to g_bus_unown_name()) - only the first call
     * <br>will work.
     * <br>
     * <br>Another guarantee is that invocations of &#64;name_acquired_handler
     * <br>and &#64;name_lost_handler are guaranteed to alternate; that
     * <br>is, if &#64;name_acquired_handler is invoked then you are
     * <br>guaranteed that the next time one of the handlers is invoked, it
     * <br>will be &#64;name_lost_handler. The reverse is also true.
     * <br>
     * <br>If you plan on exporting objects (using e.g.
     * <br>g_dbus_connection_register_object()), note that it is generally too late
     * <br>to export the objects in &#64;name_acquired_handler. Instead, you can do this
     * <br>in &#64;bus_acquired_handler since you are guaranteed that this will run
     * <br>before &#64;name is requested from the bus.
     * <br>
     * <br>This behavior makes it very simple to write applications that wants
     * <br>to [own names][gdbus-owning-names] and export objects.
     * <br>Simply register objects to be exported in &#64;bus_acquired_handler and
     * <br>unregister the objects (if any) in &#64;name_lost_handler.
     * @param bus_type the type of bus to own a name on
     * @param name the well-known name to own
     * @param flags a set of flags from the &#35;GBusNameOwnerFlags enumeration
     * @param bus_acquired_handler handler to invoke when connected to the bus of type &#64;bus_type or %NULL
     * @param name_acquired_handler handler to invoke when &#64;name is acquired or %NULL
     * @param name_lost_handler handler to invoke when &#64;name is lost or %NULL
     * @param user_data user data to pass to handlers
     * @param user_data_free_func function for freeing &#64;user_data or %NULL
     * @return an identifier (never 0) that can be used with     g_bus_unown_name() to stop owning the name.
    */
    public static int busOwnName(int bus_type, @Nonnull ch.bailu.gtk.type.Str name, int flags, OnBusAcquiredCallback bus_acquired_handler, OnBusNameAcquiredCallback name_acquired_handler, OnBusNameLostCallback name_lost_handler, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        return JnaGio.INST().g_bus_own_name(bus_type, asCPointerNotNull(name), flags, toOnBusAcquiredCallback(getClassHandler().getInstance(), "busOwnName", bus_acquired_handler), toOnBusNameAcquiredCallback(getClassHandler().getInstance(), "busOwnName", name_acquired_handler), toOnBusNameLostCallback(getClassHandler().getInstance(), "busOwnName", name_lost_handler), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "busOwnName", user_data_free_func));
    }

    /**
     * Like g_bus_own_name() but takes a &#35;GDBusConnection instead of a
     * <br>&#35;GBusType.
     * @param connection a &#35;GDBusConnection
     * @param name the well-known name to own
     * @param flags a set of flags from the &#35;GBusNameOwnerFlags enumeration
     * @param name_acquired_handler handler to invoke when &#64;name is acquired or %NULL
     * @param name_lost_handler handler to invoke when &#64;name is lost or %NULL
     * @param user_data user data to pass to handlers
     * @param user_data_free_func function for freeing &#64;user_data or %NULL
     * @return an identifier (never 0) that can be used with     g_bus_unown_name() to stop owning the name
    */
    public static int busOwnNameOnConnection(@Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, int flags, OnBusNameAcquiredCallback name_acquired_handler, OnBusNameLostCallback name_lost_handler, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        return JnaGio.INST().g_bus_own_name_on_connection(asCPointerNotNull(connection), asCPointerNotNull(name), flags, toOnBusNameAcquiredCallback(getClassHandler().getInstance(), "busOwnNameOnConnection", name_acquired_handler), toOnBusNameLostCallback(getClassHandler().getInstance(), "busOwnNameOnConnection", name_lost_handler), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "busOwnNameOnConnection", user_data_free_func));
    }

    /**
     * Version of g_bus_own_name_on_connection() using closures instead of
     * <br>callbacks for easier binding in other languages.
     * @param connection a &#35;GDBusConnection
     * @param name the well-known name to own
     * @param flags a set of flags from the &#35;GBusNameOwnerFlags enumeration
     * @param name_acquired_closure &#35;GClosure to invoke when &#64;name is     acquired or %NULL
     * @param name_lost_closure &#35;GClosure to invoke when &#64;name is lost     or %NULL
     * @return an identifier (never 0) that can be used with     g_bus_unown_name() to stop owning the name.
    */
    public static int busOwnNameOnConnectionWithClosures(@Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, int flags, @Nullable ch.bailu.gtk.gobject.Closure name_acquired_closure, @Nullable ch.bailu.gtk.gobject.Closure name_lost_closure)  {
        return JnaGio.INST().g_bus_own_name_on_connection_with_closures(asCPointerNotNull(connection), asCPointerNotNull(name), flags, asCPointer(name_acquired_closure), asCPointer(name_lost_closure));
    }

    /**
     * Version of g_bus_own_name() using closures instead of callbacks for
     * <br>easier binding in other languages.
     * @param bus_type the type of bus to own a name on
     * @param name the well-known name to own
     * @param flags a set of flags from the &#35;GBusNameOwnerFlags enumeration
     * @param bus_acquired_closure &#35;GClosure to invoke when connected to     the bus of type &#64;bus_type or %NULL
     * @param name_acquired_closure &#35;GClosure to invoke when &#64;name is     acquired or %NULL
     * @param name_lost_closure &#35;GClosure to invoke when &#64;name is lost or     %NULL
     * @return an identifier (never 0) that can be used with     g_bus_unown_name() to stop owning the name.
    */
    public static int busOwnNameWithClosures(int bus_type, @Nonnull ch.bailu.gtk.type.Str name, int flags, @Nullable ch.bailu.gtk.gobject.Closure bus_acquired_closure, @Nullable ch.bailu.gtk.gobject.Closure name_acquired_closure, @Nullable ch.bailu.gtk.gobject.Closure name_lost_closure)  {
        return JnaGio.INST().g_bus_own_name_with_closures(bus_type, asCPointerNotNull(name), flags, asCPointer(bus_acquired_closure), asCPointer(name_acquired_closure), asCPointer(name_lost_closure));
    }

    /**
     * Stops owning a name.
     * <br>
     * <br>Note that there may still be D-Bus traffic to process (relating to owning
     * <br>and unowning the name) in the current thread-default &#35;GMainContext after
     * <br>this function has returned. You should continue to iterate the &#35;GMainContext
     * <br>until the &#35;GDestroyNotify function passed to g_bus_own_name() is called, in
     * <br>order to avoid memory leaks through callbacks queued on the &#35;GMainContext
     * <br>after it’s stopped being iterated.
     * @param owner_id an identifier obtained from g_bus_own_name()
    */
    public static void busUnownName(int owner_id)  {
        JnaGio.INST().g_bus_unown_name(owner_id);
    }

    /**
     * Stops watching a name.
     * <br>
     * <br>Note that there may still be D-Bus traffic to process (relating to watching
     * <br>and unwatching the name) in the current thread-default &#35;GMainContext after
     * <br>this function has returned. You should continue to iterate the &#35;GMainContext
     * <br>until the &#35;GDestroyNotify function passed to g_bus_watch_name() is called, in
     * <br>order to avoid memory leaks through callbacks queued on the &#35;GMainContext
     * <br>after it’s stopped being iterated.
     * @param watcher_id An identifier obtained from g_bus_watch_name()
    */
    public static void busUnwatchName(int watcher_id)  {
        JnaGio.INST().g_bus_unwatch_name(watcher_id);
    }

    /**
     * Starts watching &#64;name on the bus specified by &#64;bus_type and calls
     * <br>&#64;name_appeared_handler and &#64;name_vanished_handler when the name is
     * <br>known to have an owner respectively known to lose its
     * <br>owner. Callbacks will be invoked in the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>of the thread you are calling this function from.
     * <br>
     * <br>You are guaranteed that one of the handlers will be invoked after
     * <br>calling this function. When you are done watching the name, just
     * <br>call g_bus_unwatch_name() with the watcher id this function
     * <br>returns.
     * <br>
     * <br>If the name vanishes or appears (for example the application owning
     * <br>the name could restart), the handlers are also invoked. If the
     * <br>&#35;GDBusConnection that is used for watching the name disconnects, then
     * <br>&#64;name_vanished_handler is invoked since it is no longer
     * <br>possible to access the name.
     * <br>
     * <br>Another guarantee is that invocations of &#64;name_appeared_handler
     * <br>and &#64;name_vanished_handler are guaranteed to alternate; that
     * <br>is, if &#64;name_appeared_handler is invoked then you are
     * <br>guaranteed that the next time one of the handlers is invoked, it
     * <br>will be &#64;name_vanished_handler. The reverse is also true.
     * <br>
     * <br>This behavior makes it very simple to write applications that want
     * <br>to take action when a certain [name exists][gdbus-watching-names].
     * <br>Basically, the application should create object proxies in
     * <br>&#64;name_appeared_handler and destroy them again (if any) in
     * <br>&#64;name_vanished_handler.
     * @param bus_type The type of bus to watch a name on.
     * @param name The name (well-known or unique) to watch.
     * @param flags Flags from the &#35;GBusNameWatcherFlags enumeration.
     * @param name_appeared_handler Handler to invoke when &#64;name is known to exist or %NULL.
     * @param name_vanished_handler Handler to invoke when &#64;name is known to not exist or %NULL.
     * @param user_data User data to pass to handlers.
     * @param user_data_free_func Function for freeing &#64;user_data or %NULL.
     * @return An identifier (never 0) that can be used with g_bus_unwatch_name() to stop watching the name.
    */
    public static int busWatchName(int bus_type, @Nonnull ch.bailu.gtk.type.Str name, int flags, OnBusNameAppearedCallback name_appeared_handler, OnBusNameVanishedCallback name_vanished_handler, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        return JnaGio.INST().g_bus_watch_name(bus_type, asCPointerNotNull(name), flags, toOnBusNameAppearedCallback(getClassHandler().getInstance(), "busWatchName", name_appeared_handler), toOnBusNameVanishedCallback(getClassHandler().getInstance(), "busWatchName", name_vanished_handler), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "busWatchName", user_data_free_func));
    }

    /**
     * Like g_bus_watch_name() but takes a &#35;GDBusConnection instead of a
     * <br>&#35;GBusType.
     * @param connection A &#35;GDBusConnection.
     * @param name The name (well-known or unique) to watch.
     * @param flags Flags from the &#35;GBusNameWatcherFlags enumeration.
     * @param name_appeared_handler Handler to invoke when &#64;name is known to exist or %NULL.
     * @param name_vanished_handler Handler to invoke when &#64;name is known to not exist or %NULL.
     * @param user_data User data to pass to handlers.
     * @param user_data_free_func Function for freeing &#64;user_data or %NULL.
     * @return An identifier (never 0) that can be used with g_bus_unwatch_name() to stop watching the name.
    */
    public static int busWatchNameOnConnection(@Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, int flags, OnBusNameAppearedCallback name_appeared_handler, OnBusNameVanishedCallback name_vanished_handler, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        return JnaGio.INST().g_bus_watch_name_on_connection(asCPointerNotNull(connection), asCPointerNotNull(name), flags, toOnBusNameAppearedCallback(getClassHandler().getInstance(), "busWatchNameOnConnection", name_appeared_handler), toOnBusNameVanishedCallback(getClassHandler().getInstance(), "busWatchNameOnConnection", name_vanished_handler), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "busWatchNameOnConnection", user_data_free_func));
    }

    /**
     * Version of g_bus_watch_name_on_connection() using closures instead of callbacks for
     * <br>easier binding in other languages.
     * @param connection A &#35;GDBusConnection.
     * @param name The name (well-known or unique) to watch.
     * @param flags Flags from the &#35;GBusNameWatcherFlags enumeration.
     * @param name_appeared_closure &#35;GClosure to invoke when &#64;name is known to exist or %NULL.
     * @param name_vanished_closure &#35;GClosure to invoke when &#64;name is known to not exist or %NULL.
     * @return An identifier (never 0) that can be used with g_bus_unwatch_name() to stop watching the name.
    */
    public static int busWatchNameOnConnectionWithClosures(@Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str name, int flags, @Nullable ch.bailu.gtk.gobject.Closure name_appeared_closure, @Nullable ch.bailu.gtk.gobject.Closure name_vanished_closure)  {
        return JnaGio.INST().g_bus_watch_name_on_connection_with_closures(asCPointerNotNull(connection), asCPointerNotNull(name), flags, asCPointer(name_appeared_closure), asCPointer(name_vanished_closure));
    }

    /**
     * Version of g_bus_watch_name() using closures instead of callbacks for
     * <br>easier binding in other languages.
     * @param bus_type The type of bus to watch a name on.
     * @param name The name (well-known or unique) to watch.
     * @param flags Flags from the &#35;GBusNameWatcherFlags enumeration.
     * @param name_appeared_closure &#35;GClosure to invoke when &#64;name is known to exist or %NULL.
     * @param name_vanished_closure &#35;GClosure to invoke when &#64;name is known to not exist or %NULL.
     * @return An identifier (never 0) that can be used with g_bus_unwatch_name() to stop watching the name.
    */
    public static int busWatchNameWithClosures(int bus_type, @Nonnull ch.bailu.gtk.type.Str name, int flags, @Nullable ch.bailu.gtk.gobject.Closure name_appeared_closure, @Nullable ch.bailu.gtk.gobject.Closure name_vanished_closure)  {
        return JnaGio.INST().g_bus_watch_name_with_closures(bus_type, asCPointerNotNull(name), flags, asCPointer(name_appeared_closure), asCPointer(name_vanished_closure));
    }

    /**
     * Checks if a content type can be executable. Note that for instance
     * <br>things like text files can be executables (i.e. scripts and batch files).
     * @param type a content type string
     * @return %TRUE if the file type corresponds to a type that     can be executable, %FALSE otherwise.
    */
    public static boolean contentTypeCanBeExecutable(@Nonnull ch.bailu.gtk.type.Str type)  {
        return JnaGio.INST().g_content_type_can_be_executable(asCPointerNotNull(type));
    }

    /**
     * Compares two content types for equality.
     * @param type1 a content type string
     * @param type2 a content type string
     * @return %TRUE if the two strings are identical or equivalent,     %FALSE otherwise.
    */
    public static boolean contentTypeEquals(@Nonnull ch.bailu.gtk.type.Str type1, @Nonnull ch.bailu.gtk.type.Str type2)  {
        return JnaGio.INST().g_content_type_equals(asCPointerNotNull(type1), asCPointerNotNull(type2));
    }

    /**
     * Tries to find a content type based on the mime type name.
     * @param mime_type a mime type string
     * @return Newly allocated string with content type or     %NULL. Free with g_free()
    */
    public static ch.bailu.gtk.type.Str contentTypeFromMimeType(@Nonnull ch.bailu.gtk.type.Str mime_type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_content_type_from_mime_type(asCPointerNotNull(mime_type))));
    }

    /**
     * Gets the human readable description of the content type.
     * @param type a content type string
     * @return a short description of the content type &#64;type. Free the     returned string with g_free()
    */
    public static ch.bailu.gtk.type.Str contentTypeGetDescription(@Nonnull ch.bailu.gtk.type.Str type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_content_type_get_description(asCPointerNotNull(type))));
    }

    /**
     * Gets the generic icon name for a content type.
     * <br>
     * <br>See the
     * <br>[shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * <br>specification for more on the generic icon name.
     * @param type a content type string
     * @return the registered generic icon name for the given &#64;type,     or %NULL if unknown. Free with g_free()
    */
    public static ch.bailu.gtk.type.Str contentTypeGetGenericIconName(@Nonnull ch.bailu.gtk.type.Str type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_content_type_get_generic_icon_name(asCPointerNotNull(type))));
    }

    /**
     * Gets the icon for a content type.
     * @param type a content type string
     * @return &#35;GIcon corresponding to the content type. Free the returned     object with g_object_unref()
    */
    public static Icon contentTypeGetIcon(@Nonnull ch.bailu.gtk.type.Str type)  {
        return new Icon(new PointerContainer(JnaGio.INST().g_content_type_get_icon(asCPointerNotNull(type))));
    }

    /**
     * Gets the mime type for the content type, if one is registered.
     * @param type a content type string
     * @return the registered mime type for the     given &#64;type, or %NULL if unknown; free with g_free().
    */
    public static ch.bailu.gtk.type.Str contentTypeGetMimeType(@Nonnull ch.bailu.gtk.type.Str type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_content_type_get_mime_type(asCPointerNotNull(type))));
    }

    /**
     * Gets the symbolic icon for a content type.
     * @param type a content type string
     * @return symbolic &#35;GIcon corresponding to the content type.     Free the returned object with g_object_unref()
    */
    public static Icon contentTypeGetSymbolicIcon(@Nonnull ch.bailu.gtk.type.Str type)  {
        return new Icon(new PointerContainer(JnaGio.INST().g_content_type_get_symbolic_icon(asCPointerNotNull(type))));
    }

    /**
     * Determines if &#64;type is a subset of &#64;supertype.
     * @param type a content type string
     * @param supertype a content type string
     * @return %TRUE if &#64;type is a kind of &#64;supertype,     %FALSE otherwise.
    */
    public static boolean contentTypeIsA(@Nonnull ch.bailu.gtk.type.Str type, @Nonnull ch.bailu.gtk.type.Str supertype)  {
        return JnaGio.INST().g_content_type_is_a(asCPointerNotNull(type), asCPointerNotNull(supertype));
    }

    /**
     * Determines if &#64;type is a subset of &#64;mime_type.
     * <br>Convenience wrapper around g_content_type_is_a().
     * @param type a content type string
     * @param mime_type a mime type string
     * @return %TRUE if &#64;type is a kind of &#64;mime_type,     %FALSE otherwise.
    */
    public static boolean contentTypeIsMimeType(@Nonnull ch.bailu.gtk.type.Str type, @Nonnull ch.bailu.gtk.type.Str mime_type)  {
        return JnaGio.INST().g_content_type_is_mime_type(asCPointerNotNull(type), asCPointerNotNull(mime_type));
    }

    /**
     * Checks if the content type is the generic &quot;unknown&quot; type.
     * <br>On UNIX this is the &quot;application/octet-stream&quot; mimetype,
     * <br>while on win32 it is &quot;*&quot; and on OSX it is a dynamic type
     * <br>or octet-stream.
     * @param type a content type string
     * @return %TRUE if the type is the unknown type.
    */
    public static boolean contentTypeIsUnknown(@Nonnull ch.bailu.gtk.type.Str type)  {
        return JnaGio.INST().g_content_type_is_unknown(asCPointerNotNull(type));
    }

    /**
     * Gets a list of strings containing all the registered content types
     * <br>known to the system. The list and its data should be freed using
     * <br>`g_list_free_full (list, g_free)`.
     * @return list of the registered     content types
    */
    public static ch.bailu.gtk.glib.List contentTypesGetRegistered()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_content_types_get_registered()));
    }

    /**
     * Escape &#64;string so it can appear in a D-Bus address as the value
     * <br>part of a key-value pair.
     * <br>
     * <br>For instance, if &#64;string is `/run/bus-for-:0`,
     * <br>this function would return `/run/bus-for-%3A0`,
     * <br>which could be used in a D-Bus address like
     * <br>`unix:nonce-tcp:host=127.0.0.1,port=42,noncefile=/run/bus-for-%3A0`.
     * @param string an unescaped string to be included in a D-Bus address     as the value in a key-value pair
     * @return a copy of &#64;string with all     non-optionally-escaped bytes escaped
    */
    public static ch.bailu.gtk.type.Str dbusAddressEscapeValue(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_dbus_address_escape_value(asCPointerNotNull(string))));
    }

    /**
     * Synchronously looks up the D-Bus address for the well-known message
     * <br>bus instance specified by &#64;bus_type. This may involve using various
     * <br>platform specific mechanisms.
     * <br>
     * <br>The returned address will be in the
     * <br>[D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses).
     * @param bus_type a &#35;GBusType
     * @param cancellable a &#35;GCancellable or %NULL
     * @return a valid D-Bus address string for &#64;bus_type or     %NULL if &#64;error is set
    */
    public static ch.bailu.gtk.type.Str dbusAddressGetForBusSync(int bus_type, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_dbus_address_get_for_bus_sync(bus_type, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously connects to an endpoint specified by &#64;address and
     * <br>sets up the connection so it is in a state to run the client-side
     * <br>of the D-Bus authentication conversation. &#64;address must be in the
     * <br>[D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses).
     * <br>
     * <br>When the operation is finished, &#64;callback will be invoked. You can
     * <br>then call g_dbus_address_get_stream_finish() to get the result of
     * <br>the operation.
     * <br>
     * <br>This is an asynchronous failable function. See
     * <br>g_dbus_address_get_stream_sync() for the synchronous version.
     * @param address A valid D-Bus address.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied.
     * @param user_data Data to pass to &#64;callback.
    */
    public static void dbusAddressGetStream(@Nonnull ch.bailu.gtk.type.Str address, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGio.INST().g_dbus_address_get_stream(asCPointerNotNull(address), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "dbusAddressGetStream", callback), asCPointer(user_data));
    }

    /**
     * Creates a D-Bus error name to use for &#64;error. If &#64;error matches
     * <br>a registered error (cf. g_dbus_error_register_error()), the corresponding
     * <br>D-Bus error name will be returned.
     * <br>
     * <br>Otherwise the a name of the form
     * <br>`org.gtk.GDBus.UnmappedGError.Quark._ESCAPED_QUARK_NAME.Code_ERROR_CODE`
     * <br>will be used. This allows other GDBus applications to map the error
     * <br>on the wire back to a &#35;GError using g_dbus_error_new_for_dbus_error().
     * <br>
     * <br>This function is typically only used in object mappings to put a
     * <br>&#35;GError on the wire. Regular applications should not use it.
     * @param error A &#35;GError.
     * @return A D-Bus error name (never %NULL).     Free with g_free().
    */
    public static ch.bailu.gtk.type.Str dbusErrorEncodeGerror(@Nonnull ch.bailu.gtk.glib.Error error)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_dbus_error_encode_gerror(asCPointerNotNull(error))));
    }

    /**
     * Gets the D-Bus error name used for &#64;error, if any.
     * <br>
     * <br>This function is guaranteed to return a D-Bus error name for all
     * <br>&#35;GErrors returned from functions handling remote method calls
     * <br>(e.g. g_dbus_connection_call_finish()) unless
     * <br>g_dbus_error_strip_remote_error() has been used on &#64;error.
     * @param error a &#35;GError
     * @return an allocated string or %NULL if the     D-Bus error name could not be found. Free with g_free().
    */
    public static ch.bailu.gtk.type.Str dbusErrorGetRemoteError(@Nonnull ch.bailu.gtk.glib.Error error)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_dbus_error_get_remote_error(asCPointerNotNull(error))));
    }

    /**
     * Checks if &#64;error represents an error received via D-Bus from a remote peer. If so,
     * <br>use g_dbus_error_get_remote_error() to get the name of the error.
     * @param error A &#35;GError.
     * @return %TRUE if &#64;error represents an error from a remote peer, %FALSE otherwise.
    */
    public static boolean dbusErrorIsRemoteError(@Nonnull ch.bailu.gtk.glib.Error error)  {
        return JnaGio.INST().g_dbus_error_is_remote_error(asCPointerNotNull(error));
    }

    /**
     * Creates a &#35;GError based on the contents of &#64;dbus_error_name and
     * <br>&#64;dbus_error_message.
     * <br>
     * <br>Errors registered with g_dbus_error_register_error() will be looked
     * <br>up using &#64;dbus_error_name and if a match is found, the error domain
     * <br>and code is used. Applications can use g_dbus_error_get_remote_error()
     * <br>to recover &#64;dbus_error_name.
     * <br>
     * <br>If a match against a registered error is not found and the D-Bus
     * <br>error name is in a form as returned by g_dbus_error_encode_gerror()
     * <br>the error domain and code encoded in the name is used to
     * <br>create the &#35;GError. Also, &#64;dbus_error_name is added to the error message
     * <br>such that it can be recovered with g_dbus_error_get_remote_error().
     * <br>
     * <br>Otherwise, a &#35;GError with the error code %G_IO_ERROR_DBUS_ERROR
     * <br>in the %G_IO_ERROR error domain is returned. Also, &#64;dbus_error_name is
     * <br>added to the error message such that it can be recovered with
     * <br>g_dbus_error_get_remote_error().
     * <br>
     * <br>In all three cases, &#64;dbus_error_name can always be recovered from the
     * <br>returned &#35;GError using the g_dbus_error_get_remote_error() function
     * <br>(unless g_dbus_error_strip_remote_error() hasn't been used on the returned error).
     * <br>
     * <br>This function is typically only used in object mappings to prepare
     * <br>&#35;GError instances for applications. Regular applications should not use
     * <br>it.
     * @param dbus_error_name D-Bus error name.
     * @param dbus_error_message D-Bus error message.
     * @return An allocated &#35;GError. Free with g_error_free().
    */
    public static ch.bailu.gtk.glib.Error dbusErrorNewForDbusError(@Nonnull ch.bailu.gtk.type.Str dbus_error_name, @Nonnull ch.bailu.gtk.type.Str dbus_error_message)  {
        return new ch.bailu.gtk.glib.Error(new PointerContainer(JnaGio.INST().g_dbus_error_new_for_dbus_error(asCPointerNotNull(dbus_error_name), asCPointerNotNull(dbus_error_message))));
    }

    /**
     * 
     * @return 
    */
    public static int dbusErrorQuark()  {
        return JnaGio.INST().g_dbus_error_quark();
    }

    /**
     * Creates an association to map between &#64;dbus_error_name and
     * <br>&#35;GErrors specified by &#64;error_domain and &#64;error_code.
     * <br>
     * <br>This is typically done in the routine that returns the &#35;GQuark for
     * <br>an error domain.
     * @param error_domain A &#35;GQuark for an error domain.
     * @param error_code An error code.
     * @param dbus_error_name A D-Bus error name.
     * @return %TRUE if the association was created, %FALSE if it already exists.
    */
    public static boolean dbusErrorRegisterError(int error_domain, int error_code, @Nonnull ch.bailu.gtk.type.Str dbus_error_name)  {
        return JnaGio.INST().g_dbus_error_register_error(error_domain, error_code, asCPointerNotNull(dbus_error_name));
    }

    /**
     * Looks for extra information in the error message used to recover
     * <br>the D-Bus error name and strips it if found. If stripped, the
     * <br>message field in &#64;error will correspond exactly to what was
     * <br>received on the wire.
     * <br>
     * <br>This is typically used when presenting errors to the end user.
     * @param error A &#35;GError.
     * @return %TRUE if information was stripped, %FALSE otherwise.
    */
    public static boolean dbusErrorStripRemoteError(@Nonnull ch.bailu.gtk.glib.Error error)  {
        return JnaGio.INST().g_dbus_error_strip_remote_error(asCPointerNotNull(error));
    }

    /**
     * Destroys an association previously set up with g_dbus_error_register_error().
     * @param error_domain A &#35;GQuark for an error domain.
     * @param error_code An error code.
     * @param dbus_error_name A D-Bus error name.
     * @return %TRUE if the association was destroyed, %FALSE if it wasn't found.
    */
    public static boolean dbusErrorUnregisterError(int error_domain, int error_code, @Nonnull ch.bailu.gtk.type.Str dbus_error_name)  {
        return JnaGio.INST().g_dbus_error_unregister_error(error_domain, error_code, asCPointerNotNull(dbus_error_name));
    }

    /**
     * This is a language binding friendly version of g_dbus_escape_object_path_bytestring().
     * @param s the string to escape
     * @return an escaped version of &#64;s. Free with g_free().
    */
    public static ch.bailu.gtk.type.Str dbusEscapeObjectPath(@Nonnull ch.bailu.gtk.type.Str s)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_dbus_escape_object_path(asCPointerNotNull(s))));
    }

    /**
     * Generate a D-Bus GUID that can be used with
     * <br>e.g. g_dbus_connection_new().
     * <br>
     * <br>See the
     * <br>[D-Bus specification](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;uuids)
     * <br>regarding what strings are valid D-Bus GUIDs. The specification refers to
     * <br>these as ‘UUIDs’ whereas GLib (for historical reasons) refers to them as
     * <br>‘GUIDs’. The terms are interchangeable.
     * <br>
     * <br>Note that D-Bus GUIDs do not follow
     * <br>[RFC 4122](https://datatracker.ietf.org/doc/html/rfc4122).
     * @return A valid D-Bus GUID. Free with g_free().
    */
    public static ch.bailu.gtk.type.Str dbusGenerateGuid()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_dbus_generate_guid()));
    }

    /**
     * Converts a &#35;GValue to a &#35;GVariant of the type indicated by the &#64;type
     * <br>parameter.
     * <br>
     * <br>The conversion is using the following rules:
     * <br>
     * <br>- `G_TYPE_STRING`: 's', 'o', 'g' or 'ay'
     * <br>- `G_TYPE_STRV`: 'as', 'ao' or 'aay'
     * <br>- `G_TYPE_BOOLEAN`: 'b'
     * <br>- `G_TYPE_UCHAR`: 'y'
     * <br>- `G_TYPE_INT`: 'i', 'n'
     * <br>- `G_TYPE_UINT`: 'u', 'q'
     * <br>- `G_TYPE_INT64`: 'x'
     * <br>- `G_TYPE_UINT64`: 't'
     * <br>- `G_TYPE_DOUBLE`: 'd'
     * <br>- `G_TYPE_VARIANT`: Any &#35;GVariantType
     * <br>
     * <br>This can fail if e.g. &#64;gvalue is of type %G_TYPE_STRING and &#64;type
     * <br>is 'i', i.e. %G_VARIANT_TYPE_INT32. It will also fail for any &#35;GType
     * <br>(including e.g. %G_TYPE_OBJECT and %G_TYPE_BOXED derived-types) not
     * <br>in the table above.
     * <br>
     * <br>Note that if &#64;gvalue is of type %G_TYPE_VARIANT and its value is
     * <br>%NULL, the empty &#35;GVariant instance (never %NULL) for &#64;type is
     * <br>returned (e.g. 0 for scalar types, the empty string for string types,
     * <br>'/' for object path types, the empty array for any array type and so on).
     * <br>
     * <br>See the g_dbus_gvariant_to_gvalue() function for how to convert a
     * <br>&#35;GVariant to a &#35;GValue.
     * @param gvalue A &#35;GValue to convert to a &#35;GVariant
     * @param type A &#35;GVariantType
     * @return A &#35;GVariant (never floating) of     &#35;GVariantType &#64;type holding the data from &#64;gvalue or an empty &#35;GVariant     in case of failure. Free with g_variant_unref().
    */
    public static ch.bailu.gtk.glib.Variant dbusGvalueToGvariant(@Nonnull ch.bailu.gtk.gobject.Value gvalue, @Nonnull ch.bailu.gtk.glib.VariantType type)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaGio.INST().g_dbus_gvalue_to_gvariant(asCPointerNotNull(gvalue), asCPointerNotNull(type))));
    }

    /**
     * Converts a &#35;GVariant to a &#35;GValue. If &#64;value is floating, it is consumed.
     * <br>
     * <br>The rules specified in the g_dbus_gvalue_to_gvariant() function are
     * <br>used - this function is essentially its reverse form. So, a &#35;GVariant
     * <br>containing any basic or string array type will be converted to a &#35;GValue
     * <br>containing a basic value or string array. Any other &#35;GVariant (handle,
     * <br>variant, tuple, dict entry) will be converted to a &#35;GValue containing that
     * <br>&#35;GVariant.
     * <br>
     * <br>The conversion never fails - a valid &#35;GValue is always returned in
     * <br>&#64;out_gvalue.
     * @param value A &#35;GVariant.
     * @param out_gvalue Return location pointing to a zero-filled (uninitialized) &#35;GValue.
    */
    public static void dbusGvariantToGvalue(@Nonnull ch.bailu.gtk.glib.Variant value, @Nonnull ch.bailu.gtk.gobject.Value out_gvalue)  {
        JnaGio.INST().g_dbus_gvariant_to_gvalue(asCPointerNotNull(value), asCPointerNotNull(out_gvalue));
    }

    /**
     * Checks if &#64;string is a
     * <br>[D-Bus address](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses).
     * <br>
     * <br>This doesn't check if &#64;string is actually supported by &#35;GDBusServer
     * <br>or &#35;GDBusConnection - use g_dbus_is_supported_address() to do more
     * <br>checks.
     * @param string A string.
     * @return %TRUE if &#64;string is a valid D-Bus address, %FALSE otherwise.
    */
    public static boolean dbusIsAddress(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGio.INST().g_dbus_is_address(asCPointerNotNull(string));
    }

    /**
     * Check whether &#64;string is a valid D-Bus error name.
     * <br>
     * <br>This function returns the same result as g_dbus_is_interface_name(),
     * <br>because D-Bus error names are defined to have exactly the
     * <br>same syntax as interface names.
     * @param string The string to check.
     * @return %TRUE if valid, %FALSE otherwise.
    */
    public static boolean dbusIsErrorName(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGio.INST().g_dbus_is_error_name(asCPointerNotNull(string));
    }

    /**
     * Checks if &#64;string is a D-Bus GUID.
     * <br>
     * <br>See the documentation for g_dbus_generate_guid() for more information about
     * <br>the format of a GUID.
     * @param string The string to check.
     * @return %TRUE if &#64;string is a GUID, %FALSE otherwise.
    */
    public static boolean dbusIsGuid(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGio.INST().g_dbus_is_guid(asCPointerNotNull(string));
    }

    /**
     * Checks if &#64;string is a valid D-Bus interface name.
     * @param string The string to check.
     * @return %TRUE if valid, %FALSE otherwise.
    */
    public static boolean dbusIsInterfaceName(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGio.INST().g_dbus_is_interface_name(asCPointerNotNull(string));
    }

    /**
     * Checks if &#64;string is a valid D-Bus member (e.g. signal or method) name.
     * @param string The string to check.
     * @return %TRUE if valid, %FALSE otherwise.
    */
    public static boolean dbusIsMemberName(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGio.INST().g_dbus_is_member_name(asCPointerNotNull(string));
    }

    /**
     * Checks if &#64;string is a valid D-Bus bus name (either unique or well-known).
     * @param string The string to check.
     * @return %TRUE if valid, %FALSE otherwise.
    */
    public static boolean dbusIsName(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGio.INST().g_dbus_is_name(asCPointerNotNull(string));
    }

    /**
     * Like g_dbus_is_address() but also checks if the library supports the
     * <br>transports in &#64;string and that key/value pairs for each transport
     * <br>are valid. See the specification of the
     * <br>[D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;addresses).
     * @param string A string.
     * @return %TRUE if &#64;string is a valid D-Bus address that is supported by this library, %FALSE if &#64;error is set.
    */
    public static boolean dbusIsSupportedAddress(@Nonnull ch.bailu.gtk.type.Str string) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGio.INST().g_dbus_is_supported_address(asCPointerNotNull(string), 0L);
    }

    /**
     * Checks if &#64;string is a valid D-Bus unique bus name.
     * @param string The string to check.
     * @return %TRUE if valid, %FALSE otherwise.
    */
    public static boolean dbusIsUniqueName(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGio.INST().g_dbus_is_unique_name(asCPointerNotNull(string));
    }

    /**
     * Creates a new &#35;GDtlsClientConnection wrapping &#64;base_socket which is
     * <br>assumed to communicate with the server identified by &#64;server_identity.
     * @param base_socket the &#35;GDatagramBased to wrap
     * @param server_identity the expected identity of the server
     * @return the new   &#35;GDtlsClientConnection, or %NULL on error
    */
    public static DtlsClientConnection dtlsClientConnectionNew(@Nonnull DatagramBased base_socket, @Nullable SocketConnectable server_identity) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DtlsClientConnection(new PointerContainer(JnaGio.INST().g_dtls_client_connection_new(asCPointerNotNull(base_socket), asCPointer(server_identity), 0L)));
    }

    /**
     * Creates a new &#35;GDtlsServerConnection wrapping &#64;base_socket.
     * @param base_socket the &#35;GDatagramBased to wrap
     * @param certificate the default server certificate, or %NULL
     * @return the new   &#35;GDtlsServerConnection, or %NULL on error
    */
    public static DtlsServerConnection dtlsServerConnectionNew(@Nonnull DatagramBased base_socket, @Nullable TlsCertificate certificate) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DtlsServerConnection(new PointerContainer(JnaGio.INST().g_dtls_server_connection_new(asCPointerNotNull(base_socket), asCPointer(certificate), 0L)));
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
    public static File fileNewForCommandlineArg(@Nonnull ch.bailu.gtk.type.Str arg)  {
        return new File(new PointerContainer(JnaGio.INST().g_file_new_for_commandline_arg(asCPointerNotNull(arg))));
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
    public static File fileNewForCommandlineArgAndCwd(@Nonnull ch.bailu.gtk.type.Str arg, @Nonnull ch.bailu.gtk.type.Str cwd)  {
        return new File(new PointerContainer(JnaGio.INST().g_file_new_for_commandline_arg_and_cwd(asCPointerNotNull(arg), asCPointerNotNull(cwd))));
    }

    /**
     * Constructs a &#35;GFile for a given path. This operation never
     * <br>fails, but the returned object might not support any I/O
     * <br>operation if &#64;path is malformed.
     * @param path a string containing a relative or absolute path.   The string must be encoded in the glib filename encoding.
     * @return a new &#35;GFile for the given &#64;path.   Free the returned object with g_object_unref().
    */
    public static File fileNewForPath(@Nonnull ch.bailu.gtk.type.Str path)  {
        return new File(new PointerContainer(JnaGio.INST().g_file_new_for_path(asCPointerNotNull(path))));
    }

    /**
     * Constructs a &#35;GFile for a given URI. This operation never
     * <br>fails, but the returned object might not support any I/O
     * <br>operation if &#64;uri is malformed or if the uri type is
     * <br>not supported.
     * @param uri a UTF-8 string containing a URI
     * @return a new &#35;GFile for the given &#64;uri.   Free the returned object with g_object_unref().
    */
    public static File fileNewForUri(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return new File(new PointerContainer(JnaGio.INST().g_file_new_for_uri(asCPointerNotNull(uri))));
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
    public static void fileNewTmpAsync(@Nullable ch.bailu.gtk.type.Str tmpl, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGio.INST().g_file_new_tmp_async(asCPointer(tmpl), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "fileNewTmpAsync", callback), asCPointer(user_data));
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
    public static void fileNewTmpDirAsync(@Nullable ch.bailu.gtk.type.Str tmpl, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGio.INST().g_file_new_tmp_dir_async(asCPointer(tmpl), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "fileNewTmpDirAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a temporary directory creation started by
     * <br>g_file_new_tmp_dir_async().
     * @param result a &#35;GAsyncResult
     * @return a new &#35;GFile.   Free the returned object with g_object_unref().
    */
    public static File fileNewTmpDirFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new File(new PointerContainer(JnaGio.INST().g_file_new_tmp_dir_finish(asCPointerNotNull(result), 0L)));
    }

    /**
     * Constructs a &#35;GFile with the given &#64;parse_name (i.e. something
     * <br>given by g_file_get_parse_name()). This operation never fails,
     * <br>but the returned object might not support any I/O operation if
     * <br>the &#64;parse_name cannot be parsed.
     * @param parse_name a file name or path to be parsed
     * @return a new &#35;GFile.
    */
    public static File fileParseName(@Nonnull ch.bailu.gtk.type.Str parse_name)  {
        return new File(new PointerContainer(JnaGio.INST().g_file_parse_name(asCPointerNotNull(parse_name))));
    }

    /**
     * Deserializes a &#35;GIcon previously serialized using g_icon_serialize().
     * @param value a &#35;GVariant created with g_icon_serialize()
     * @return a &#35;GIcon, or %NULL when deserialization fails.
    */
    public static Icon iconDeserialize(@Nonnull ch.bailu.gtk.glib.Variant value)  {
        return new Icon(new PointerContainer(JnaGio.INST().g_icon_deserialize(asCPointerNotNull(value))));
    }

    /**
     * Gets a hash for an icon.
     * @param icon &#35;gconstpointer to an icon object.
     * @return a &#35;guint containing a hash for the &#64;icon, suitable for use in a &#35;GHashTable or similar data structure.
    */
    public static int iconHash(@Nonnull ch.bailu.gtk.type.Pointer icon)  {
        return JnaGio.INST().g_icon_hash(asCPointerNotNull(icon));
    }

    /**
     * Generate a &#35;GIcon instance from &#64;str. This function can fail if
     * <br>&#64;str is not valid - see g_icon_to_string() for discussion.
     * <br>
     * <br>If your application or library provides one or more &#35;GIcon
     * <br>implementations you need to ensure that each &#35;GType is registered
     * <br>with the type system prior to calling g_icon_new_for_string().
     * @param str A string obtained via g_icon_to_string().
     * @return An object implementing the &#35;GIcon          interface or %NULL if &#64;error is set.
    */
    public static Icon iconNewForString(@Nonnull ch.bailu.gtk.type.Str str) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Icon(new PointerContainer(JnaGio.INST().g_icon_new_for_string(asCPointerNotNull(str), 0L)));
    }

    /**
     * Converts errno.h error codes into GIO error codes. The fallback
     * <br>value %G_IO_ERROR_FAILED is returned for error codes not currently
     * <br>handled (but note that future GLib releases may return a more
     * <br>specific value instead).
     * <br>
     * <br>As %errno is global and may be modified by intermediate function
     * <br>calls, you should save its value as soon as the call which sets it
     * @param err_no Error number as defined in errno.h.
     * @return &#35;GIOErrorEnum value for the given errno.h error number.
    */
    public static int ioErrorFromErrno(int err_no)  {
        return JnaGio.INST().g_io_error_from_errno(err_no);
    }

    /**
     * Converts &#35;GFileError error codes into GIO error codes.
     * @param file_error a &#35;GFileError.
     * @return &#35;GIOErrorEnum value for the given &#35;GFileError error value.
    */
    public static int ioErrorFromFileError(int file_error)  {
        return JnaGio.INST().g_io_error_from_file_error(file_error);
    }

    /**
     * Gets the GIO Error Quark.
     * @return a &#35;GQuark.
    */
    public static int ioErrorQuark()  {
        return JnaGio.INST().g_io_error_quark();
    }

    /**
     * Registers &#64;type as extension for the extension point with name
     * <br>&#64;extension_point_name.
     * <br>
     * <br>If &#64;type has already been registered as an extension for this
     * <br>extension point, the existing &#35;GIOExtension object is returned.
     * @param extension_point_name the name of the extension point
     * @param type the &#35;GType to register as extension
     * @param extension_name the name for the extension
     * @param priority the priority for the extension
     * @return a &#35;GIOExtension object for &#35;GType
    */
    public static IOExtension ioExtensionPointImplement(@Nonnull ch.bailu.gtk.type.Str extension_point_name, long type, @Nonnull ch.bailu.gtk.type.Str extension_name, int priority)  {
        return new IOExtension(new PointerContainer(JnaGio.INST().g_io_extension_point_implement(asCPointerNotNull(extension_point_name), type, asCPointerNotNull(extension_name), priority)));
    }

    /**
     * Looks up an existing extension point.
     * @param name the name of the extension point
     * @return the &#35;GIOExtensionPoint, or %NULL if there    is no registered extension point with the given name.
    */
    public static IOExtensionPoint ioExtensionPointLookup(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new IOExtensionPoint(new PointerContainer(JnaGio.INST().g_io_extension_point_lookup(asCPointerNotNull(name))));
    }

    /**
     * Registers an extension point.
     * @param name The name of the extension point
     * @return the new &#35;GIOExtensionPoint. This object is    owned by GIO and should not be freed.
    */
    public static IOExtensionPoint ioExtensionPointRegister(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new IOExtensionPoint(new PointerContainer(JnaGio.INST().g_io_extension_point_register(asCPointerNotNull(name))));
    }

    /**
     * Loads all the modules in the specified directory.
     * <br>
     * <br>If don't require all modules to be initialized (and thus registering
     * <br>all gtypes) then you can use g_io_modules_scan_all_in_directory()
     * <br>which allows delayed/lazy loading of modules.
     * @param dirname pathname for a directory containing modules     to load.
     * @return a list of &#35;GIOModules loaded      from the directory,      All the modules are loaded into memory, if you want to      unload them (enabling on-demand loading) you must call      g_type_module_unuse() on all the modules. Free the list      with g_list_free().
    */
    public static ch.bailu.gtk.glib.List ioModulesLoadAllInDirectory(@Nonnull ch.bailu.gtk.type.Str dirname)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_io_modules_load_all_in_directory(asCPointerNotNull(dirname))));
    }

    /**
     * Loads all the modules in the specified directory.
     * <br>
     * <br>If don't require all modules to be initialized (and thus registering
     * <br>all gtypes) then you can use g_io_modules_scan_all_in_directory()
     * <br>which allows delayed/lazy loading of modules.
     * @param dirname pathname for a directory containing modules     to load.
     * @param scope a scope to use when scanning the modules.
     * @return a list of &#35;GIOModules loaded      from the directory,      All the modules are loaded into memory, if you want to      unload them (enabling on-demand loading) you must call      g_type_module_unuse() on all the modules. Free the list      with g_list_free().
    */
    public static ch.bailu.gtk.glib.List ioModulesLoadAllInDirectoryWithScope(@Nonnull ch.bailu.gtk.type.Str dirname, @Nonnull IOModuleScope scope)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_io_modules_load_all_in_directory_with_scope(asCPointerNotNull(dirname), asCPointerNotNull(scope))));
    }

    /**
     * Scans all the modules in the specified directory, ensuring that
     * <br>any extension point implemented by a module is registered.
     * <br>
     * <br>This may not actually load and initialize all the types in each
     * <br>module, some modules may be lazily loaded and initialized when
     * <br>an extension point it implements is used with e.g.
     * <br>g_io_extension_point_get_extensions() or
     * <br>g_io_extension_point_get_extension_by_name().
     * <br>
     * <br>If you need to guarantee that all types are loaded in all the modules,
     * <br>use g_io_modules_load_all_in_directory().
     * @param dirname pathname for a directory containing modules     to scan.
    */
    public static void ioModulesScanAllInDirectory(@Nonnull ch.bailu.gtk.type.Str dirname)  {
        JnaGio.INST().g_io_modules_scan_all_in_directory(asCPointerNotNull(dirname));
    }

    /**
     * Scans all the modules in the specified directory, ensuring that
     * <br>any extension point implemented by a module is registered.
     * <br>
     * <br>This may not actually load and initialize all the types in each
     * <br>module, some modules may be lazily loaded and initialized when
     * <br>an extension point it implements is used with e.g.
     * <br>g_io_extension_point_get_extensions() or
     * <br>g_io_extension_point_get_extension_by_name().
     * <br>
     * <br>If you need to guarantee that all types are loaded in all the modules,
     * <br>use g_io_modules_load_all_in_directory().
     * @param dirname pathname for a directory containing modules     to scan.
     * @param scope a scope to use when scanning the modules
    */
    public static void ioModulesScanAllInDirectoryWithScope(@Nonnull ch.bailu.gtk.type.Str dirname, @Nonnull IOModuleScope scope)  {
        JnaGio.INST().g_io_modules_scan_all_in_directory_with_scope(asCPointerNotNull(dirname), asCPointerNotNull(scope));
    }

    /**
     * Creates a keyfile-backed &#35;GSettingsBackend.
     * <br>
     * <br>The filename of the keyfile to use is given by &#64;filename.
     * <br>
     * <br>All settings read to or written from the backend must fall under the
     * <br>path given in &#64;root_path (which must start and end with a slash and
     * <br>not contain two consecutive slashes).  &#64;root_path may be &quot;/&quot;.
     * <br>
     * <br>If &#64;root_group is non-%NULL then it specifies the name of the keyfile
     * <br>group used for keys that are written directly below &#64;root_path.  For
     * <br>example, if &#64;root_path is &quot;/apps/example/&quot; and &#64;root_group is
     * <br>&quot;toplevel&quot;, then settings the key &quot;/apps/example/enabled&quot; to a value
     * <br>of %TRUE will cause the following to appear in the keyfile:
     * <br>
     * <pre>
     *   [toplevel]
     *   enabled=true
     * </pre>
     * <br>
     * <br>If &#64;root_group is %NULL then it is not permitted to store keys
     * <br>directly below the &#64;root_path.
     * <br>
     * <br>For keys not stored directly below &#64;root_path (ie: in a sub-path),
     * <br>the name of the subpath (with the final slash stripped) is used as
     * <br>the name of the keyfile group.  To continue the example, if
     * <br>&quot;/apps/example/profiles/default/font-size&quot; were set to
     * <br>12 then the following would appear in the keyfile:
     * <br>
     * <pre>
     *   [profiles/default]
     *   font-size=12
     * </pre>
     * <br>
     * <br>The backend will refuse writes (and return writability as being
     * <br>%FALSE) for keys outside of &#64;root_path and, in the event that
     * <br>&#64;root_group is %NULL, also for keys directly under &#64;root_path.
     * <br>Writes will also be refused if the backend detects that it has the
     * <br>inability to rewrite the keyfile (ie: the containing directory is not
     * <br>writable).
     * <br>
     * <br>There is no checking done for your key namespace clashing with the
     * <br>syntax of the key file format.  For example, if you have '[' or ']'
     * <br>characters in your path names or '=' in your key names you may be in
     * <br>trouble.
     * <br>
     * <br>The backend reads default values from a keyfile called `defaults` in
     * <br>the directory specified by the &#35;GKeyfileSettingsBackend:defaults-dir property,
     * <br>and a list of locked keys from a text file with the name `locks` in
     * <br>the same location.
     * @param filename the filename of the keyfile
     * @param root_path the path under which all settings keys appear
     * @param root_group the group name corresponding to              &#64;root_path, or %NULL
     * @return a keyfile-backed &#35;GSettingsBackend
    */
    public static SettingsBackend keyfileSettingsBackendNew(@Nonnull ch.bailu.gtk.type.Str filename, @Nonnull ch.bailu.gtk.type.Str root_path, @Nullable ch.bailu.gtk.type.Str root_group)  {
        return new SettingsBackend(new PointerContainer(JnaGio.INST().g_keyfile_settings_backend_new(asCPointerNotNull(filename), asCPointerNotNull(root_path), asCPointer(root_group))));
    }

    /**
     * Gets a reference to the default &#35;GMemoryMonitor for the system.
     * @return a new reference to the default &#35;GMemoryMonitor
    */
    public static MemoryMonitor memoryMonitorDupDefault()  {
        return new MemoryMonitor(new PointerContainer(JnaGio.INST().g_memory_monitor_dup_default()));
    }

    /**
     * Creates a memory-backed &#35;GSettingsBackend.
     * <br>
     * <br>This backend allows changes to settings, but does not write them
     * <br>to any backing storage, so the next time you run your application,
     * <br>the memory backend will start out with the default values again.
     * @return a newly created &#35;GSettingsBackend
    */
    public static SettingsBackend memorySettingsBackendNew()  {
        return new SettingsBackend(new PointerContainer(JnaGio.INST().g_memory_settings_backend_new()));
    }

    /**
     * Gets the default &#35;GNetworkMonitor for the system.
     * @return a &#35;GNetworkMonitor, which will be     a dummy object if no network monitor is available
    */
    public static NetworkMonitor networkMonitorGetDefault()  {
        return new NetworkMonitor(new PointerContainer(JnaGio.INST().g_network_monitor_get_default()));
    }

    /**
     * Initializes the platform networking libraries (eg, on Windows, this
     * <br>calls WSAStartup()). GLib will call this itself if it is needed, so
     * <br>you only need to call it if you directly call system networking
     * <br>functions (without calling any GLib networking functions first).
    */
    public static void networkingInit()  {
        JnaGio.INST().g_networking_init();
    }

    /**
     * Creates a readonly &#35;GSettingsBackend.
     * <br>
     * <br>This backend does not allow changes to settings, so all settings
     * <br>will always have their default values.
     * @return a newly created &#35;GSettingsBackend
    */
    public static SettingsBackend nullSettingsBackendNew()  {
        return new SettingsBackend(new PointerContainer(JnaGio.INST().g_null_settings_backend_new()));
    }

    /**
     * Utility method for &#35;GPollableInputStream and &#35;GPollableOutputStream
     * <br>implementations. Creates a new &#35;GSource that expects a callback of
     * <br>type &#35;GPollableSourceFunc. The new source does not actually do
     * <br>anything on its own; use g_source_add_child_source() to add other
     * <br>sources to it to cause it to trigger.
     * @param pollable_stream the stream associated with the new source
     * @return the new &#35;GSource.
    */
    public static ch.bailu.gtk.glib.Source pollableSourceNew(@Nonnull ch.bailu.gtk.gobject.Object pollable_stream)  {
        return new ch.bailu.gtk.glib.Source(new PointerContainer(JnaGio.INST().g_pollable_source_new(asCPointerNotNull(pollable_stream))));
    }

    /**
     * Utility method for &#35;GPollableInputStream and &#35;GPollableOutputStream
     * <br>implementations. Creates a new &#35;GSource, as with
     * <br>g_pollable_source_new(), but also attaching &#64;child_source (with a
     * <br>dummy callback), and &#64;cancellable, if they are non-%NULL.
     * @param pollable_stream the stream associated with the   new source
     * @param child_source optional child source to attach
     * @param cancellable optional &#35;GCancellable to attach
     * @return the new &#35;GSource.
    */
    public static ch.bailu.gtk.glib.Source pollableSourceNewFull(@Nonnull ch.bailu.gtk.type.Pointer pollable_stream, @Nullable ch.bailu.gtk.glib.Source child_source, @Nullable Cancellable cancellable)  {
        return new ch.bailu.gtk.glib.Source(new PointerContainer(JnaGio.INST().g_pollable_source_new_full(asCPointerNotNull(pollable_stream), asCPointer(child_source), asCPointer(cancellable))));
    }

    /**
     * Tries to read from &#64;stream, as with g_input_stream_read() (if
     * <br>&#64;blocking is %TRUE) or g_pollable_input_stream_read_nonblocking()
     * <br>(if &#64;blocking is %FALSE). This can be used to more easily share
     * <br>code between blocking and non-blocking implementations of a method.
     * <br>
     * <br>If &#64;blocking is %FALSE, then &#64;stream must be a
     * <br>&#35;GPollableInputStream for which g_pollable_input_stream_can_poll()
     * <br>returns %TRUE, or else the behavior is undefined. If &#64;blocking is
     * <br>%TRUE, then &#64;stream does not need to be a &#35;GPollableInputStream.
     * @param stream a &#35;GInputStream
     * @param buffer a buffer to   read data into
     * @param count the number of bytes to read
     * @param blocking whether to do blocking I/O
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return the number of bytes read, or -1 on error.
    */
    public static long pollableStreamRead(@Nonnull InputStream stream, @Nonnull ch.bailu.gtk.type.Pointer buffer, long count, boolean blocking, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGio.INST().g_pollable_stream_read(asCPointerNotNull(stream), asCPointerNotNull(buffer), count, blocking, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to write to &#64;stream, as with g_output_stream_write() (if
     * <br>&#64;blocking is %TRUE) or g_pollable_output_stream_write_nonblocking()
     * <br>(if &#64;blocking is %FALSE). This can be used to more easily share
     * <br>code between blocking and non-blocking implementations of a method.
     * <br>
     * <br>If &#64;blocking is %FALSE, then &#64;stream must be a
     * <br>&#35;GPollableOutputStream for which
     * <br>g_pollable_output_stream_can_poll() returns %TRUE or else the
     * <br>behavior is undefined. If &#64;blocking is %TRUE, then &#64;stream does not
     * <br>need to be a &#35;GPollableOutputStream.
     * @param stream a &#35;GOutputStream.
     * @param buffer the buffer   containing the data to write.
     * @param count the number of bytes to write
     * @param blocking whether to do blocking I/O
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return the number of bytes written, or -1 on error.
    */
    public static long pollableStreamWrite(@Nonnull OutputStream stream, @Nonnull ch.bailu.gtk.type.Pointer buffer, long count, boolean blocking, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGio.INST().g_pollable_stream_write(asCPointerNotNull(stream), asCPointerNotNull(buffer), count, blocking, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to write &#64;count bytes to &#64;stream, as with
     * <br>g_output_stream_write_all(), but using g_pollable_stream_write()
     * <br>rather than g_output_stream_write().
     * <br>
     * <br>On a successful write of &#64;count bytes, %TRUE is returned, and
     * <br>&#64;bytes_written is set to &#64;count.
     * <br>
     * <br>If there is an error during the operation (including
     * <br>%G_IO_ERROR_WOULD_BLOCK in the non-blocking case), %FALSE is
     * <br>returned and &#64;error is set to indicate the error status,
     * <br>&#64;bytes_written is updated to contain the number of bytes written
     * <br>into the stream before the error occurred.
     * <br>
     * <br>As with g_pollable_stream_write(), if &#64;blocking is %FALSE, then
     * <br>&#64;stream must be a &#35;GPollableOutputStream for which
     * <br>g_pollable_output_stream_can_poll() returns %TRUE or else the
     * <br>behavior is undefined. If &#64;blocking is %TRUE, then &#64;stream does not
     * <br>need to be a &#35;GPollableOutputStream.
     * @param stream a &#35;GOutputStream.
     * @param buffer the buffer   containing the data to write.
     * @param count the number of bytes to write
     * @param blocking whether to do blocking I/O
     * @param bytes_written location to store the number of bytes that was   written to the stream
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE on success, %FALSE if there was an error
    */
    public static boolean pollableStreamWriteAll(@Nonnull OutputStream stream, @Nonnull ch.bailu.gtk.type.Pointer buffer, long count, boolean blocking, @Nonnull ch.bailu.gtk.type.Int64 bytes_written, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGio.INST().g_pollable_stream_write_all(asCPointerNotNull(stream), asCPointerNotNull(buffer), count, blocking, asCPointerNotNull(bytes_written), asCPointer(cancellable), 0L);
    }

    /**
     * Gets a reference to the default &#35;GPowerProfileMonitor for the system.
     * @return a new reference to the default &#35;GPowerProfileMonitor
    */
    public static PowerProfileMonitor powerProfileMonitorDupDefault()  {
        return new PowerProfileMonitor(new PointerContainer(JnaGio.INST().g_power_profile_monitor_dup_default()));
    }

    /**
     * Find the `gio-proxy` extension point for a proxy implementation that supports
     * <br>the specified protocol.
     * @param protocol the proxy protocol name (e.g. http, socks, etc)
     * @return return a &#35;GProxy or NULL if protocol               is not supported.
    */
    public static Proxy proxyGetDefaultForProtocol(@Nonnull ch.bailu.gtk.type.Str protocol)  {
        return new Proxy(new PointerContainer(JnaGio.INST().g_proxy_get_default_for_protocol(asCPointerNotNull(protocol))));
    }

    /**
     * Gets the default &#35;GProxyResolver for the system.
     * @return the default &#35;GProxyResolver, which     will be a dummy object if no proxy resolver is available
    */
    public static ProxyResolver proxyResolverGetDefault()  {
        return new ProxyResolver(new PointerContainer(JnaGio.INST().g_proxy_resolver_get_default()));
    }

    /**
     * Gets the &#35;GResolver Error Quark.
     * @return a &#35;GQuark.
    */
    public static int resolverErrorQuark()  {
        return JnaGio.INST().g_resolver_error_quark();
    }

    /**
     * Gets the &#35;GResource Error Quark.
     * @return a &#35;GQuark
    */
    public static int resourceErrorQuark()  {
        return JnaGio.INST().g_resource_error_quark();
    }

    /**
     * Loads a binary resource bundle and creates a &#35;GResource representation of it, allowing
     * <br>you to query it for data.
     * <br>
     * <br>If you want to use this resource in the global resource namespace you need
     * <br>to register it with g_resources_register().
     * <br>
     * <br>If &#64;filename is empty or the data in it is corrupt,
     * <br>%G_RESOURCE_ERROR_INTERNAL will be returned. If &#64;filename doesn’t exist, or
     * <br>there is an error in reading it, an error from g_mapped_file_new() will be
     * <br>returned.
     * @param filename the path of a filename to load, in the GLib filename encoding
     * @return a new &#35;GResource, or %NULL on error
    */
    public static Resource resourceLoad(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Resource(new PointerContainer(JnaGio.INST().g_resource_load(asCPointerNotNull(filename), 0L)));
    }

    /**
     * Returns all the names of children at the specified &#64;path in the set of
     * <br>globally registered resources.
     * <br>The return result is a %NULL terminated list of strings which should
     * <br>be released with g_strfreev().
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return an array of constant strings
    */
    public static ch.bailu.gtk.type.Strs resourcesEnumerateChildren(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaGio.INST().g_resources_enumerate_children(asCPointerNotNull(path), lookup_flags, 0L)));
    }

    /**
     * Looks for a file at the specified &#64;path in the set of
     * <br>globally registered resources and if found returns information about it.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @param size a location to place the length of the contents of the file,    or %NULL if the length is not needed
     * @param flags a location to place the &#35;GResourceFlags about the file,    or %NULL if the flags are not needed
     * @return %TRUE if the file was found. %FALSE if there were errors
    */
    public static boolean resourcesGetInfo(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags, @Nullable ch.bailu.gtk.type.Int64 size, @Nullable ch.bailu.gtk.type.Int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGio.INST().g_resources_get_info(asCPointerNotNull(path), lookup_flags, asCPointer(size), asCPointer(flags), 0L);
    }

    /**
     * Looks for a file at the specified &#64;path in the set of
     * <br>globally registered resources and returns a &#35;GBytes that
     * <br>lets you directly access the data in memory.
     * <br>
     * <br>The data is always followed by a zero byte, so you
     * <br>can safely use the data as a C string. However, that byte
     * <br>is not included in the size of the GBytes.
     * <br>
     * <br>For uncompressed resource files this is a pointer directly into
     * <br>the resource bundle, which is typically in some readonly data section
     * <br>in the program binary. For compressed files we allocate memory on
     * <br>the heap and automatically uncompress the data.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return &#35;GBytes or %NULL on error.     Free the returned object with g_bytes_unref()
    */
    public static ch.bailu.gtk.glib.Bytes resourcesLookupData(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaGio.INST().g_resources_lookup_data(asCPointerNotNull(path), lookup_flags, 0L)));
    }

    /**
     * Looks for a file at the specified &#64;path in the set of
     * <br>globally registered resources and returns a &#35;GInputStream
     * <br>that lets you read the data.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return &#35;GInputStream or %NULL on error.     Free the returned object with g_object_unref()
    */
    public static InputStream resourcesOpenStream(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new InputStream(new PointerContainer(JnaGio.INST().g_resources_open_stream(asCPointerNotNull(path), lookup_flags, 0L)));
    }

    /**
     * Registers the resource with the process-global set of resources.
     * <br>Once a resource is registered the files in it can be accessed
     * <br>with the global resource lookup functions like g_resources_lookup_data().
     * @param resource A &#35;GResource
    */
    public static void resourcesRegister(@Nonnull Resource resource)  {
        JnaGio.INST().g_resources_register(asCPointerNotNull(resource));
    }

    /**
     * Unregisters the resource from the process-global set of resources.
     * @param resource A &#35;GResource
    */
    public static void resourcesUnregister(@Nonnull Resource resource)  {
        JnaGio.INST().g_resources_unregister(asCPointerNotNull(resource));
    }

    /**
     * Gets the default system schema source.
     * <br>
     * <br>This function is not required for normal uses of &#35;GSettings but it
     * <br>may be useful to authors of plugin management systems or to those who
     * <br>want to introspect the content of schemas.
     * <br>
     * <br>If no schemas are installed, %NULL will be returned.
     * <br>
     * <br>The returned source may actually consist of multiple schema sources
     * <br>from different directories, depending on which directories were given
     * <br>in `XDG_DATA_DIRS` and `GSETTINGS_SCHEMA_DIR`. For this reason, all
     * <br>lookups performed against the default source should probably be done
     * <br>recursively.
     * @return the default schema source
    */
    public static SettingsSchemaSource settingsSchemaSourceGetDefault()  {
        return new SettingsSchemaSource(new PointerContainer(JnaGio.INST().g_settings_schema_source_get_default()));
    }

    /**
     * Sorts &#64;targets in place according to the algorithm in RFC 2782.
     * @param targets a &#35;GList of &#35;GSrvTarget
     * @return the head of the sorted list.
    */
    public static ch.bailu.gtk.glib.List srvTargetListSort(@Nonnull ch.bailu.gtk.glib.List targets)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGio.INST().g_srv_target_list_sort(asCPointerNotNull(targets))));
    }

    /**
     * Gets the default &#35;GTlsBackend for the system.
     * @return a &#35;GTlsBackend, which will be a     dummy object if no TLS backend is available
    */
    public static TlsBackend tlsBackendGetDefault()  {
        return new TlsBackend(new PointerContainer(JnaGio.INST().g_tls_backend_get_default()));
    }

    /**
     * Gets the TLS channel binding error quark.
     * @return a &#35;GQuark.
    */
    public static int tlsChannelBindingErrorQuark()  {
        return JnaGio.INST().g_tls_channel_binding_error_quark();
    }

    /**
     * Creates a new &#35;GTlsClientConnection wrapping &#64;base_io_stream (which
     * <br>must have pollable input and output streams) which is assumed to
     * <br>communicate with the server identified by &#64;server_identity.
     * <br>
     * <br>See the documentation for &#35;GTlsConnection:base-io-stream for restrictions
     * <br>on when application code can run operations on the &#64;base_io_stream after
     * <br>this function has returned.
     * @param base_io_stream the &#35;GIOStream to wrap
     * @param server_identity the expected identity of the server
     * @return the new &#35;GTlsClientConnection, or %NULL on error
    */
    public static TlsClientConnection tlsClientConnectionNew(@Nonnull IOStream base_io_stream, @Nullable SocketConnectable server_identity) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsClientConnection(new PointerContainer(JnaGio.INST().g_tls_client_connection_new(asCPointerNotNull(base_io_stream), asCPointer(server_identity), 0L)));
    }

    /**
     * Gets the TLS error quark.
     * @return a &#35;GQuark.
    */
    public static int tlsErrorQuark()  {
        return JnaGio.INST().g_tls_error_quark();
    }

    /**
     * Creates a new &#35;GTlsFileDatabase which uses anchor certificate authorities
     * <br>in &#64;anchors to verify certificate chains.
     * <br>
     * <br>The certificates in &#64;anchors must be PEM encoded.
     * @param anchors filename of anchor certificate authorities.
     * @return the new &#35;GTlsFileDatabase, or %NULL on error
    */
    public static TlsFileDatabase tlsFileDatabaseNew(@Nonnull ch.bailu.gtk.type.Str anchors) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsFileDatabase(new PointerContainer(JnaGio.INST().g_tls_file_database_new(asCPointerNotNull(anchors), 0L)));
    }

    /**
     * Creates a new &#35;GTlsServerConnection wrapping &#64;base_io_stream (which
     * <br>must have pollable input and output streams).
     * <br>
     * <br>See the documentation for &#35;GTlsConnection:base-io-stream for restrictions
     * <br>on when application code can run operations on the &#64;base_io_stream after
     * <br>this function has returned.
     * @param base_io_stream the &#35;GIOStream to wrap
     * @param certificate the default server certificate, or %NULL
     * @return the new &#35;GTlsServerConnection, or %NULL on error
    */
    public static TlsServerConnection tlsServerConnectionNew(@Nonnull IOStream base_io_stream, @Nullable TlsCertificate certificate) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsServerConnection(new PointerContainer(JnaGio.INST().g_tls_server_connection_new(asCPointerNotNull(base_io_stream), asCPointer(certificate), 0L)));
    }

    /**
     * Determines if &#64;mount_path is considered an implementation of the
     * <br>OS. This is primarily used for hiding mountable and mounted volumes
     * <br>that only are used in the OS and has little to no relevance to the
     * <br>casual user.
     * @param mount_path a mount path, e.g. `/media/disk` or `/usr`
     * @return %TRUE if &#64;mount_path is considered an implementation detail     of the OS.
    */
    public static boolean unixIsMountPathSystemInternal(@Nonnull ch.bailu.gtk.type.Str mount_path)  {
        return JnaGio.INST().g_unix_is_mount_path_system_internal(asCPointerNotNull(mount_path));
    }

    /**
     * Determines if &#64;device_path is considered a block device path which is only
     * <br>used in implementation of the OS. This is primarily used for hiding
     * <br>mounted volumes that are intended as APIs for programs to read, and system
     * <br>administrators at a shell; rather than something that should, for example,
     * <br>appear in a GUI. For example, the Linux `/proc` filesystem.
     * <br>
     * <br>The list of device paths considered ‘system’ ones may change over time.
     * @param device_path a device path, e.g. `/dev/loop0` or `nfsd`
     * @return %TRUE if &#64;device_path is considered an implementation detail of    the OS.
    */
    public static boolean unixIsSystemDevicePath(@Nonnull ch.bailu.gtk.type.Str device_path)  {
        return JnaGio.INST().g_unix_is_system_device_path(asCPointerNotNull(device_path));
    }

    /**
     * Determines if &#64;fs_type is considered a type of file system which is only
     * <br>used in implementation of the OS. This is primarily used for hiding
     * <br>mounted volumes that are intended as APIs for programs to read, and system
     * <br>administrators at a shell; rather than something that should, for example,
     * <br>appear in a GUI. For example, the Linux `/proc` filesystem.
     * <br>
     * <br>The list of file system types considered ‘system’ ones may change over time.
     * @param fs_type a file system type, e.g. `procfs` or `tmpfs`
     * @return %TRUE if &#64;fs_type is considered an implementation detail of the OS.
    */
    public static boolean unixIsSystemFsType(@Nonnull ch.bailu.gtk.type.Str fs_type)  {
        return JnaGio.INST().g_unix_is_system_fs_type(asCPointerNotNull(fs_type));
    }

    /**
     * Compares two unix mounts.
     * @param mount1 first &#35;GUnixMountEntry to compare.
     * @param mount2 second &#35;GUnixMountEntry to compare.
     * @return 1, 0 or -1 if &#64;mount1 is greater than, equal to, or less than &#64;mount2, respectively.
    */
    public static int unixMountCompare(@Nonnull UnixMountEntry mount1, @Nonnull UnixMountEntry mount2)  {
        return JnaGio.INST().g_unix_mount_compare(asCPointerNotNull(mount1), asCPointerNotNull(mount2));
    }

    /**
     * Makes a copy of &#64;mount_entry.
     * @param mount_entry a &#35;GUnixMountEntry.
     * @return a new &#35;GUnixMountEntry
    */
    public static UnixMountEntry unixMountCopy(@Nonnull UnixMountEntry mount_entry)  {
        return new UnixMountEntry(new PointerContainer(JnaGio.INST().g_unix_mount_copy(asCPointerNotNull(mount_entry))));
    }

    /**
     * Frees a unix mount.
     * @param mount_entry a &#35;GUnixMountEntry.
    */
    public static void unixMountFree(@Nonnull UnixMountEntry mount_entry)  {
        JnaGio.INST().g_unix_mount_free(asCPointerNotNull(mount_entry));
    }

    /**
     * Gets the device path for a unix mount.
     * @param mount_entry a &#35;GUnixMount.
     * @return a string containing the device path.
    */
    public static ch.bailu.gtk.type.Str unixMountGetDevicePath(@Nonnull UnixMountEntry mount_entry)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_unix_mount_get_device_path(asCPointerNotNull(mount_entry))));
    }

    /**
     * Gets the filesystem type for the unix mount.
     * @param mount_entry a &#35;GUnixMount.
     * @return a string containing the file system type.
    */
    public static ch.bailu.gtk.type.Str unixMountGetFsType(@Nonnull UnixMountEntry mount_entry)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_unix_mount_get_fs_type(asCPointerNotNull(mount_entry))));
    }

    /**
     * Gets the mount path for a unix mount.
     * @param mount_entry input &#35;GUnixMountEntry to get the mount path for.
     * @return the mount path for &#64;mount_entry.
    */
    public static ch.bailu.gtk.type.Str unixMountGetMountPath(@Nonnull UnixMountEntry mount_entry)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_unix_mount_get_mount_path(asCPointerNotNull(mount_entry))));
    }

    /**
     * Gets a comma-separated list of mount options for the unix mount. For example,
     * <br>`rw,relatime,seclabel,data=ordered`.
     * <br>
     * <br>This is similar to g_unix_mount_point_get_options(), but it takes
     * <br>a &#35;GUnixMountEntry as an argument.
     * @param mount_entry a &#35;GUnixMountEntry.
     * @return a string containing the options, or %NULL if not available.
    */
    public static ch.bailu.gtk.type.Str unixMountGetOptions(@Nonnull UnixMountEntry mount_entry)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_unix_mount_get_options(asCPointerNotNull(mount_entry))));
    }

    /**
     * Gets the root of the mount within the filesystem. This is useful e.g. for
     * <br>mounts created by bind operation, or btrfs subvolumes.
     * <br>
     * <br>For example, the root path is equal to &quot;/&quot; for mount created by
     * <br>&quot;mount /dev/sda1 /mnt/foo&quot; and &quot;/bar&quot; for
     * <br>&quot;mount --bind /mnt/foo/bar /mnt/bar&quot;.
     * @param mount_entry a &#35;GUnixMountEntry.
     * @return a string containing the root, or %NULL if not supported.
    */
    public static ch.bailu.gtk.type.Str unixMountGetRootPath(@Nonnull UnixMountEntry mount_entry)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_unix_mount_get_root_path(asCPointerNotNull(mount_entry))));
    }

    /**
     * Guesses whether a Unix mount can be ejected.
     * @param mount_entry a &#35;GUnixMountEntry
     * @return %TRUE if &#64;mount_entry is deemed to be ejectable.
    */
    public static boolean unixMountGuessCanEject(@Nonnull UnixMountEntry mount_entry)  {
        return JnaGio.INST().g_unix_mount_guess_can_eject(asCPointerNotNull(mount_entry));
    }

    /**
     * Guesses the icon of a Unix mount.
     * @param mount_entry a &#35;GUnixMountEntry
     * @return a &#35;GIcon
    */
    public static Icon unixMountGuessIcon(@Nonnull UnixMountEntry mount_entry)  {
        return new Icon(new PointerContainer(JnaGio.INST().g_unix_mount_guess_icon(asCPointerNotNull(mount_entry))));
    }

    /**
     * Guesses the name of a Unix mount.
     * <br>The result is a translated string.
     * @param mount_entry a &#35;GUnixMountEntry
     * @return A newly allocated string that must     be freed with g_free()
    */
    public static ch.bailu.gtk.type.Str unixMountGuessName(@Nonnull UnixMountEntry mount_entry)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGio.INST().g_unix_mount_guess_name(asCPointerNotNull(mount_entry))));
    }

    /**
     * Guesses whether a Unix mount should be displayed in the UI.
     * @param mount_entry a &#35;GUnixMountEntry
     * @return %TRUE if &#64;mount_entry is deemed to be displayable.
    */
    public static boolean unixMountGuessShouldDisplay(@Nonnull UnixMountEntry mount_entry)  {
        return JnaGio.INST().g_unix_mount_guess_should_display(asCPointerNotNull(mount_entry));
    }

    /**
     * Guesses the symbolic icon of a Unix mount.
     * @param mount_entry a &#35;GUnixMountEntry
     * @return a &#35;GIcon
    */
    public static Icon unixMountGuessSymbolicIcon(@Nonnull UnixMountEntry mount_entry)  {
        return new Icon(new PointerContainer(JnaGio.INST().g_unix_mount_guess_symbolic_icon(asCPointerNotNull(mount_entry))));
    }

    /**
     * Checks if a unix mount is mounted read only.
     * @param mount_entry a &#35;GUnixMount.
     * @return %TRUE if &#64;mount_entry is read only.
    */
    public static boolean unixMountIsReadonly(@Nonnull UnixMountEntry mount_entry)  {
        return JnaGio.INST().g_unix_mount_is_readonly(asCPointerNotNull(mount_entry));
    }

    /**
     * Checks if a Unix mount is a system mount. This is the Boolean OR of
     * <br>g_unix_is_system_fs_type(), g_unix_is_system_device_path() and
     * <br>g_unix_is_mount_path_system_internal() on &#64;mount_entry’s properties.
     * <br>
     * <br>The definition of what a ‘system’ mount entry is may change over time as new
     * <br>file system types and device paths are ignored.
     * @param mount_entry a &#35;GUnixMount.
     * @return %TRUE if the unix mount is for a system path.
    */
    public static boolean unixMountIsSystemInternal(@Nonnull UnixMountEntry mount_entry)  {
        return JnaGio.INST().g_unix_mount_is_system_internal(asCPointerNotNull(mount_entry));
    }

    /**
     * Checks if the unix mount points have changed since a given unix time.
     * @param time guint64 to contain a timestamp.
     * @return %TRUE if the mount points have changed since &#64;time.
    */
    public static boolean unixMountPointsChangedSince(long time)  {
        return JnaGio.INST().g_unix_mount_points_changed_since(time);
    }

    /**
     * Checks if the unix mounts have changed since a given unix time.
     * @param time guint64 to contain a timestamp.
     * @return %TRUE if the mounts have changed since &#64;time.
    */
    public static boolean unixMountsChangedSince(long time)  {
        return JnaGio.INST().g_unix_mounts_changed_since(time);
    }

}

/*
package-type

[MethodModel:java-type-not-supported:java-type-not-supported:actionParseDetailedName:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant**}}:{j:}]

[MethodModel:cb-deprecated:asyncInitableNewvAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Parameter:{c:GParameter*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-return-value-not-supported:contentTypeGetMimeDirs:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]

[MethodModel:java-type-not-supported:contentTypeGuess:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gboolean*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:contentTypeGuessForTree:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]

[MethodModel:java-type-not-supported:contentTypeSetMimeDirs:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]

[MethodModel:java-type-not-supported:dbusAddressGetStreamFinish:[ParameterModel:Supported:{Gg:IOStream:{c:GIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:dbusAddressGetStreamSync:[ParameterModel:Supported:{Gg:IOStream:{c:GIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:dbusAnnotationInfoLookup:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDBusAnnotationInfo**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:dbusErrorRegisterErrorDomain:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gsize*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GDBusErrorEntry*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:dbusEscapeObjectPathBytestring:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]

[MethodModel:cb-return-value-not-supported:dbusUnescapeObjectPath:[ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:fileNewTmp:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GFileIOStream**}}:{j:}]

[MethodModel:java-type-not-supported:fileNewTmpFinish:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GFileIOStream**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:initableNewv:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GParameter*}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:ioSchedulerCancelAllJobs:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:ioSchedulerPushJob:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:[MethodModel:Supported:IOSchedulerJobFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:IOSchedulerJob:{c:GIOSchedulerJob*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:simpleAsyncReportErrorInIdle:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-deprecated:simpleAsyncReportGerrorInIdle:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gg:Error:{c:const GError*}}:{j:long}]

[MethodModel:cb-deprecated:simpleAsyncReportTakeGerrorInIdle:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]

[MethodModel:java-type-not-supported:unixMountAt:[ParameterModel:Supported:{Gg:UnixMountEntry:{c:GUnixMountEntry*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]

[MethodModel:java-type-not-supported:unixMountFor:[ParameterModel:Supported:{Gg:UnixMountEntry:{c:GUnixMountEntry*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]

[MethodModel:java-type-not-supported:unixMountPointAt:[ParameterModel:Supported:{Gg:UnixMountPoint:{c:GUnixMountPoint*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]

[MethodModel:java-type-not-supported:unixMountPointsGet:[ParameterModel:Supported:{Gg:List:{c:GList*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]

[MethodModel:java-type-not-supported:unixMountsGet:[ParameterModel:Supported:{Gg:List:{c:GList*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]
*/
