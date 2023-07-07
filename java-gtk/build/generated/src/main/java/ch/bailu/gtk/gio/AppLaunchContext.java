/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Integrating the launch with the launching application. This is used to
 * <br>handle for instance startup notification and launching the new application
 * <br>on the same screen as the launching window.
 * <p><a href="https://docs.gtk.org/gio/class.AppLaunchContext.html">https://docs.gtk.org/gio/class.AppLaunchContext.html</a></p>
*/
public class AppLaunchContext extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppLaunchContext.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnLaunchFailed {
        /**
         * The &#35;GAppLaunchContext::launch-failed signal is emitted when a &#35;GAppInfo launch
         * <br>fails. The startup notification id is provided, so that the launcher
         * <br>can cancel the startup notification.
         * <br>
         * <br>Because a launch operation may involve spawning multiple instances of the
         * <br>target application, you should expect this signal to be emitted multiple
         * <br>times, one for each spawned instance.
         * @param startup_notify_id the startup notification id for the failed launch
        */
        void onLaunchFailed(@Nonnull ch.bailu.gtk.type.Str startup_notify_id);
    }
    
    private static com.sun.jna.Callback toOnLaunchFailed(OnLaunchFailed in) {
        return (in == null) ? null: (JnaAppLaunchContext.OnLaunchFailed) (__self, _startup_notify_id, __data) -> in.onLaunchFailed(new ch.bailu.gtk.type.Str(new PointerContainer(_startup_notify_id)));
    }

    @FunctionalInterface
    public interface OnLaunchStarted {
        /**
         * The &#35;GAppLaunchContext::launch-started signal is emitted when a &#35;GAppInfo is
         * <br>about to be launched. If non-null the &#64;platform_data is an
         * <br>GVariant dictionary mapping strings to variants (ie `a{sv}`), which
         * <br>contains additional, platform-specific data about this launch. On
         * <br>UNIX, at least the `startup-notification-id` keys will be
         * <br>present.
         * <br>
         * <br>The value of the `startup-notification-id` key (type `s`) is a startup
         * <br>notification ID corresponding to the format from the [startup-notification
         * <br>specification](https://specifications.freedesktop.org/startup-notification-spec/startup-notification-0.1.txt).
         * <br>It allows tracking the progress of the launchee through startup.
         * <br>
         * <br>It is guaranteed that this signal is followed by either a &#35;GAppLaunchContext::launched or
         * <br>&#35;GAppLaunchContext::launch-failed signal.
         * <br>
         * <br>Because a launch operation may involve spawning multiple instances of the
         * <br>target application, you should expect this signal to be emitted multiple
         * <br>times, one for each spawned instance.
         * @param info the &#35;GAppInfo that is about to be launched
         * @param platform_data additional platform-specific data for this launch
        */
        void onLaunchStarted(@Nonnull AppInfo info, @Nullable ch.bailu.gtk.glib.Variant platform_data);
    }
    
    private static com.sun.jna.Callback toOnLaunchStarted(OnLaunchStarted in) {
        return (in == null) ? null: (JnaAppLaunchContext.OnLaunchStarted) (__self, _info, _platform_data, __data) -> in.onLaunchStarted(new AppInfo(new PointerContainer(_info)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_platform_data)));
    }

    @FunctionalInterface
    public interface OnLaunched {
        /**
         * The &#35;GAppLaunchContext::launched signal is emitted when a &#35;GAppInfo is successfully
         * <br>launched.
         * <br>
         * <br>Because a launch operation may involve spawning multiple instances of the
         * <br>target application, you should expect this signal to be emitted multiple
         * <br>times, one time for each spawned instance.
         * <br>
         * <br>The &#64;platform_data is an GVariant dictionary mapping
         * <br>strings to variants (ie `a{sv}`), which contains additional,
         * <br>platform-specific data about this launch. On UNIX, at least the
         * <br>`pid` and `startup-notification-id` keys will be present.
         * <br>
         * <br>Since 2.72 the `pid` may be 0 if the process id wasn't known (for
         * <br>example if the process was launched via D-Bus). The `pid` may not be
         * <br>set at all in subsequent releases.
         * <br>
         * <br>On Windows, `pid` is guaranteed to be valid only for the duration of the
         * <br>&#35;GAppLaunchContext::launched signal emission; after the signal is emitted,
         * <br>GLib will call g_spawn_close_pid(). If you need to keep the &#35;GPid after the
         * <br>signal has been emitted, then you can duplicate `pid` using `DuplicateHandle()`.
         * @param info the &#35;GAppInfo that was just launched
         * @param platform_data additional platform-specific data for this launch
        */
        void onLaunched(@Nonnull AppInfo info, @Nonnull ch.bailu.gtk.glib.Variant platform_data);
    }
    
    private static com.sun.jna.Callback toOnLaunched(OnLaunched in) {
        return (in == null) ? null: (JnaAppLaunchContext.OnLaunched) (__self, _info, _platform_data, __data) -> in.onLaunched(new AppInfo(new PointerContainer(_info)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_platform_data)));
    }

    public AppLaunchContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new application launch context. This is not normally used,
     * <br>instead you instantiate a subclass of this, such as &#35;GdkAppLaunchContext.
    */
    public AppLaunchContext() {
        super(cast(JnaAppLaunchContext.INST().g_app_launch_context_new()));
    }

    /**
     * Gets the display string for the &#64;context. This is used to ensure new
     * <br>applications are started on the same display as the launching
     * <br>application, by setting the `DISPLAY` environment variable.
     * @param info a &#35;GAppInfo
     * @param files a &#35;GList of &#35;GFile objects
     * @return a display string for the display.
    */
    public ch.bailu.gtk.type.Str getDisplay(@Nonnull AppInfo info, @Nonnull ch.bailu.gtk.glib.List files)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppLaunchContext.INST().g_app_launch_context_get_display(asCPointer(), asCPointerNotNull(info), asCPointerNotNull(files))));
    }

    /**
     * Gets the complete environment variable list to be passed to
     * <br>the child process when &#64;context is used to launch an application.
     * <br>This is a %NULL-terminated array of strings, where each string has
     * <br>the form `KEY=VALUE`.
     * @return      the child's environment
    */
    public ch.bailu.gtk.type.Strs getEnvironment()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAppLaunchContext.INST().g_app_launch_context_get_environment(asCPointer())));
    }

    /**
     * Initiates startup notification for the application and returns the
     * <br>`DESKTOP_STARTUP_ID` for the launched operation, if supported.
     * <br>
     * <br>Startup notification IDs are defined in the
     * <br>[FreeDesktop.Org Startup Notifications standard](http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt).
     * @param info a &#35;GAppInfo
     * @param files a &#35;GList of of &#35;GFile objects
     * @return a startup notification ID for the application, or %NULL if     not supported.
    */
    public ch.bailu.gtk.type.Str getStartupNotifyId(@Nonnull AppInfo info, @Nonnull ch.bailu.gtk.glib.List files)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppLaunchContext.INST().g_app_launch_context_get_startup_notify_id(asCPointer(), asCPointerNotNull(info), asCPointerNotNull(files))));
    }

    /**
     * Called when an application has failed to launch, so that it can cancel
     * <br>the application startup notification started in g_app_launch_context_get_startup_notify_id().
     * @param startup_notify_id the startup notification id that was returned by g_app_launch_context_get_startup_notify_id().
    */
    public void launchFailed(@Nonnull ch.bailu.gtk.type.Str startup_notify_id)  {
        JnaAppLaunchContext.INST().g_app_launch_context_launch_failed(asCPointer(), asCPointerNotNull(startup_notify_id));
    }

    /**
     * Called when an application has failed to launch, so that it can cancel
     * <br>the application startup notification started in g_app_launch_context_get_startup_notify_id().
     * @param startup_notify_id the startup notification id that was returned by g_app_launch_context_get_startup_notify_id().
    */
    public void launchFailed(String startup_notify_id)  {
        JnaAppLaunchContext.INST().g_app_launch_context_launch_failed(asCPointer(), startup_notify_id);
    }

    /**
     * Arranges for &#64;variable to be set to &#64;value in the child's
     * <br>environment when &#64;context is used to launch an application.
     * @param variable the environment variable to set
     * @param value the value for to set the variable to.
    */
    public void setenv(@Nonnull ch.bailu.gtk.type.Str variable, @Nonnull ch.bailu.gtk.type.Str value)  {
        JnaAppLaunchContext.INST().g_app_launch_context_setenv(asCPointer(), asCPointerNotNull(variable), asCPointerNotNull(value));
    }

    /**
     * Arranges for &#64;variable to be set to &#64;value in the child's
     * <br>environment when &#64;context is used to launch an application.
     * @param variable the environment variable to set
     * @param value the value for to set the variable to.
    */
    public void setenv(String variable, String value)  {
        JnaAppLaunchContext.INST().g_app_launch_context_setenv(asCPointer(), variable, value);
    }

    /**
     * Arranges for &#64;variable to be unset in the child's environment
     * <br>when &#64;context is used to launch an application.
     * @param variable the environment variable to remove
    */
    public void unsetenv(@Nonnull ch.bailu.gtk.type.Str variable)  {
        JnaAppLaunchContext.INST().g_app_launch_context_unsetenv(asCPointer(), asCPointerNotNull(variable));
    }

    /**
     * Arranges for &#64;variable to be unset in the child's environment
     * <br>when &#64;context is used to launch an application.
     * @param variable the environment variable to remove
    */
    public void unsetenv(String variable)  {
        JnaAppLaunchContext.INST().g_app_launch_context_unsetenv(asCPointer(), variable);
    }

    public final static String SIGNAL_ON_LAUNCH_FAILED = "launch-failed";
    
    /**
     * Connect to signal "launch-failed".
     * <br>See {@link OnLaunchFailed#onLaunchFailed} for signal description.
     * <br>Field {@link #SIGNAL_ON_LAUNCH_FAILED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLaunchFailed(OnLaunchFailed signal) {
        return connectSignal(SIGNAL_ON_LAUNCH_FAILED, toOnLaunchFailed(signal));
    }

    public final static String SIGNAL_ON_LAUNCH_STARTED = "launch-started";
    
    /**
     * Connect to signal "launch-started".
     * <br>See {@link OnLaunchStarted#onLaunchStarted} for signal description.
     * <br>Field {@link #SIGNAL_ON_LAUNCH_STARTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLaunchStarted(OnLaunchStarted signal) {
        return connectSignal(SIGNAL_ON_LAUNCH_STARTED, toOnLaunchStarted(signal));
    }

    public final static String SIGNAL_ON_LAUNCHED = "launched";
    
    /**
     * Connect to signal "launched".
     * <br>See {@link OnLaunched#onLaunched} for signal description.
     * <br>Field {@link #SIGNAL_ON_LAUNCHED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLaunched(OnLaunched signal) {
        return connectSignal(SIGNAL_ON_LAUNCHED, toOnLaunched(signal));
    }

    public static long getTypeID() { 
        return JnaAppLaunchContext.INST().g_app_launch_context_get_type(); 
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
