/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GApplication is the foundation of an application.  It wraps some
 * <br>low-level platform-specific services and is intended to act as the
 * <br>foundation for higher-level application classes such as
 * <br>&#35;GtkApplication or &#35;MxApplication.  In general, you should not use
 * <br>this class outside of a higher level framework.
 * <br>
 * <br>GApplication provides convenient life cycle management by maintaining
 * <br>a &quot;use count&quot; for the primary application instance. The use count can
 * <br>be changed using g_application_hold() and g_application_release(). If
 * <br>it drops to zero, the application exits. Higher-level classes such as
 * <br>&#35;GtkApplication employ the use count to ensure that the application
 * <br>stays alive as long as it has any opened windows.
 * <br>
 * <br>Another feature that GApplication (optionally) provides is process
 * <br>uniqueness. Applications can make use of this functionality by
 * <br>providing a unique application ID. If given, only one application
 * <br>with this ID can be running at a time per session. The session
 * <br>concept is platform-dependent, but corresponds roughly to a graphical
 * <br>desktop login. When your application is launched again, its
 * <br>arguments are passed through platform communication to the already
 * <br>running program. The already running instance of the program is
 * <br>called the &quot;primary instance&quot;; for non-unique applications this is
 * <br>always the current instance. On Linux, the D-Bus session bus
 * <br>is used for communication.
 * <br>
 * <br>The use of &#35;GApplication differs from some other commonly-used
 * <br>uniqueness libraries (such as libunique) in important ways. The
 * <br>application is not expected to manually register itself and check
 * <br>if it is the primary instance. Instead, the main() function of a
 * <br>&#35;GApplication should do very little more than instantiating the
 * <br>application instance, possibly connecting signal handlers, then
 * <br>calling g_application_run(). All checks for uniqueness are done
 * <br>internally. If the application is the primary instance then the
 * <br>startup signal is emitted and the mainloop runs. If the application
 * <br>is not the primary instance then a signal is sent to the primary
 * <br>instance and g_application_run() promptly returns. See the code
 * <br>examples below.
 * <br>
 * <br>If used, the expected form of an application identifier is the same as
 * <br>that of of a
 * <br>[D-Bus well-known bus name](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;message-protocol-names-bus).
 * <br>Examples include: `com.example.MyApp`, `org.example.internal_apps.Calculator`,
 * <br>`org._7_zip.Archiver`.
 * <br>For details on valid application identifiers, see g_application_id_is_valid().
 * <br>
 * <br>On Linux, the application identifier is claimed as a well-known bus name
 * <br>on the user's session bus.  This means that the uniqueness of your
 * <br>application is scoped to the current session.  It also means that your
 * <br>application may provide additional services (through registration of other
 * <br>object paths) at that bus name.  The registration of these object paths
 * <br>should be done with the shared GDBus session bus.  Note that due to the
 * <br>internal architecture of GDBus, method calls can be dispatched at any time
 * <br>(even if a main loop is not running).  For this reason, you must ensure that
 * <br>any object paths that you wish to register are registered before &#35;GApplication
 * <br>attempts to acquire the bus name of your application (which happens in
 * <br>g_application_register()).  Unfortunately, this means that you cannot use
 * <br>g_application_get_is_remote() to decide if you want to register object paths.
 * <br>
 * <br>GApplication also implements the &#35;GActionGroup and &#35;GActionMap
 * <br>interfaces and lets you easily export actions by adding them with
 * <br>g_action_map_add_action(). When invoking an action by calling
 * <br>g_action_group_activate_action() on the application, it is always
 * <br>invoked in the primary instance. The actions are also exported on
 * <br>the session bus, and GIO provides the &#35;GDBusActionGroup wrapper to
 * <br>conveniently access them remotely. GIO provides a &#35;GDBusMenuModel wrapper
 * <br>for remote access to exported &#35;GMenuModels.
 * <br>
 * <br>There is a number of different entry points into a GApplication:
 * <br>
 * <br>- via 'Activate' (i.e. just starting the application)
 * <br>
 * <br>- via 'Open' (i.e. opening some files)
 * <br>
 * <br>- by handling a command-line
 * <br>
 * <br>- via activating an action
 * <br>
 * <br>The &#35;GApplication::startup signal lets you handle the application
 * <br>initialization for all of these in a single place.
 * <br>
 * <br>Regardless of which of these entry points is used to start the
 * <br>application, GApplication passes some ‘platform data’ from the
 * <br>launching instance to the primary instance, in the form of a
 * <br>&#35;GVariant dictionary mapping strings to variants. To use platform
 * <br>data, override the &#64;before_emit or &#64;after_emit virtual functions
 * <br>in your &#35;GApplication subclass. When dealing with
 * <br>&#35;GApplicationCommandLine objects, the platform data is
 * <br>directly available via g_application_command_line_get_cwd(),
 * <br>g_application_command_line_get_environ() and
 * <br>g_application_command_line_get_platform_data().
 * <br>
 * <br>As the name indicates, the platform data may vary depending on the
 * <br>operating system, but it always includes the current directory (key
 * <br>&quot;cwd&quot;), and optionally the environment (ie the set of environment
 * <br>variables and their values) of the calling process (key &quot;environ&quot;).
 * <br>The environment is only added to the platform data if the
 * <br>%G_APPLICATION_SEND_ENVIRONMENT flag is set. &#35;GApplication subclasses
 * <br>can add their own platform data by overriding the &#64;add_platform_data
 * <br>virtual function. For instance, &#35;GtkApplication adds startup notification
 * <br>data in this way.
 * <br>
 * <br>To parse commandline arguments you may handle the
 * <br>&#35;GApplication::command-line signal or override the local_command_line()
 * <br>vfunc, to parse them in either the primary instance or the local instance,
 * <br>respectively.
 * <br>
 * <br>For an example of opening files with a GApplication, see
 * <br>[gapplication-example-open.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-open.c).
 * <br>
 * <br>For an example of using actions with GApplication, see
 * <br>[gapplication-example-actions.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-actions.c).
 * <br>
 * <br>For an example of using extra D-Bus hooks with GApplication, see
 * <br>[gapplication-example-dbushooks.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-dbushooks.c).
 * <p><a href="https://docs.gtk.org/gio/class.Application.html">https://docs.gtk.org/gio/class.Application.html</a></p>
*/
public class Application extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Application.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * The ::activate signal is emitted on the primary instance when an
         * <br>activation occurs. See g_application_activate().
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaApplication.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnCommandLine {
        /**
         * The ::command-line signal is emitted on the primary instance when
         * <br>a commandline is not handled locally. See g_application_run() and
         * <br>the &#35;GApplicationCommandLine documentation for more information.
         * @param command_line a &#35;GApplicationCommandLine representing the     passed commandline
         * @return An integer that is set as the exit status for the calling   process. See g_application_command_line_set_exit_status().
        */
        int onCommandLine(@Nonnull ApplicationCommandLine command_line);
    }
    
    private static com.sun.jna.Callback toOnCommandLine(OnCommandLine in) {
        return (in == null) ? null: (JnaApplication.OnCommandLine) (__self, _command_line, __data) -> in.onCommandLine(new ApplicationCommandLine(new PointerContainer(_command_line)));
    }

    @FunctionalInterface
    public interface OnHandleLocalOptions {
        /**
         * The ::handle-local-options signal is emitted on the local instance
         * <br>after the parsing of the commandline options has occurred.
         * <br>
         * <br>You can add options to be recognised during commandline option
         * <br>parsing using g_application_add_main_option_entries() and
         * <br>g_application_add_option_group().
         * <br>
         * <br>Signal handlers can inspect &#64;options (along with values pointed to
         * <br>from the &#64;arg_data of an installed &#35;GOptionEntrys) in order to
         * <br>decide to perform certain actions, including direct local handling
         * <br>(which may be useful for options like --version).
         * <br>
         * <br>In the event that the application is marked
         * <br>%G_APPLICATION_HANDLES_COMMAND_LINE the &quot;normal processing&quot; will
         * <br>send the &#64;options dictionary to the primary instance where it can be
         * <br>read with g_application_command_line_get_options_dict().  The signal
         * <br>handler can modify the dictionary before returning, and the
         * <br>modified dictionary will be sent.
         * <br>
         * <br>In the event that %G_APPLICATION_HANDLES_COMMAND_LINE is not set,
         * <br>&quot;normal processing&quot; will treat the remaining uncollected command
         * <br>line arguments as filenames or URIs.  If there are no arguments,
         * <br>the application is activated by g_application_activate().  One or
         * <br>more arguments results in a call to g_application_open().
         * <br>
         * <br>If you want to handle the local commandline arguments for yourself
         * <br>by converting them to calls to g_application_open() or
         * <br>g_action_group_activate_action() then you must be sure to register
         * <br>the application first.  You should probably not call
         * <br>g_application_activate() for yourself, however: just return -1 and
         * <br>allow the default handler to do it for you.  This will ensure that
         * <br>the `--gapplication-service` switch works properly (i.e. no activation
         * <br>in that case).
         * <br>
         * <br>Note that this signal is emitted from the default implementation of
         * <br>local_command_line().  If you override that function and don't
         * <br>chain up then this signal will never be emitted.
         * <br>
         * <br>You can override local_command_line() if you need more powerful
         * <br>capabilities than what is provided here, but this should not
         * <br>normally be required.
         * @param options the options dictionary
         * @return an exit code. If you have handled your options and want to exit the process, return a non-negative option, 0 for success, and a positive value for failure. To continue, return -1 to let the default option processing continue.
        */
        int onHandleLocalOptions(@Nonnull ch.bailu.gtk.glib.VariantDict options);
    }
    
    private static com.sun.jna.Callback toOnHandleLocalOptions(OnHandleLocalOptions in) {
        return (in == null) ? null: (JnaApplication.OnHandleLocalOptions) (__self, _options, __data) -> in.onHandleLocalOptions(new ch.bailu.gtk.glib.VariantDict(new PointerContainer(_options)));
    }

    @FunctionalInterface
    public interface OnNameLost {
        /**
         * The ::name-lost signal is emitted only on the registered primary instance
         * <br>when a new instance has taken over. This can only happen if the application
         * <br>is using the %G_APPLICATION_ALLOW_REPLACEMENT flag.
         * <br>
         * <br>The default handler for this signal calls g_application_quit().
         * @return %TRUE if the signal has been handled
        */
        boolean onNameLost();
    }
    
    private static com.sun.jna.Callback toOnNameLost(OnNameLost in) {
        return (in == null) ? null: (JnaApplication.OnNameLost) (__self, __data) -> in.onNameLost();
    }

    @FunctionalInterface
    public interface OnOpen {
        /**
         * The ::open signal is emitted on the primary instance when there are
         * <br>files to open. See g_application_open() for more information.
         * @param files an array of &#35;GFiles
         * @param n_files the length of &#64;files
         * @param hint a hint provided by the calling instance
        */
        void onOpen(@Nonnull ch.bailu.gtk.type.Pointer files, int n_files, @Nonnull ch.bailu.gtk.type.Str hint);
    }
    
    private static com.sun.jna.Callback toOnOpen(OnOpen in) {
        return (in == null) ? null: (JnaApplication.OnOpen) (__self, _files, _n_files, _hint, __data) -> in.onOpen(new ch.bailu.gtk.type.Pointer(new PointerContainer(_files)), _n_files, new ch.bailu.gtk.type.Str(new PointerContainer(_hint)));
    }

    @FunctionalInterface
    public interface OnShutdown {
        /**
         * The ::shutdown signal is emitted only on the registered primary instance
         * <br>immediately after the main loop terminates.
        */
        void onShutdown();
    }
    
    private static com.sun.jna.Callback toOnShutdown(OnShutdown in) {
        return (in == null) ? null: (JnaApplication.OnShutdown) (__self, __data) -> in.onShutdown();
    }

    @FunctionalInterface
    public interface OnStartup {
        /**
         * The ::startup signal is emitted on the primary instance immediately
         * <br>after registration. See g_application_register().
        */
        void onStartup();
    }
    
    private static com.sun.jna.Callback toOnStartup(OnStartup in) {
        return (in == null) ? null: (JnaApplication.OnStartup) (__self, __data) -> in.onStartup();
    }

    public Application(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GApplication instance.
     * <br>
     * <br>If non-%NULL, the application id must be valid.  See
     * <br>g_application_id_is_valid().
     * <br>
     * <br>If no application ID is given then some features of &#35;GApplication
     * <br>(most notably application uniqueness) will be disabled.
     * @param application_id the application id
     * @param flags the application flags
    */
    public Application(@Nullable ch.bailu.gtk.type.Str application_id, int flags) {
        super(cast(JnaApplication.INST().g_application_new(asCPointer(application_id), flags)));
    }

    /**
     * Creates a new &#35;GApplication instance.
     * <br>
     * <br>If non-%NULL, the application id must be valid.  See
     * <br>g_application_id_is_valid().
     * <br>
     * <br>If no application ID is given then some features of &#35;GApplication
     * <br>(most notably application uniqueness) will be disabled.
     * @param application_id the application id
     * @param flags the application flags
    */
    public Application(String application_id, int flags) {
        super(cast(JnaApplication.INST().g_application_new(application_id, flags)));
    }

    /**
     * Activates the application.
     * <br>
     * <br>In essence, this results in the &#35;GApplication::activate signal being
     * <br>emitted in the primary instance.
     * <br>
     * <br>The application must be registered before calling this function.
    */
    public void activate()  {
        JnaApplication.INST().g_application_activate(asCPointer());
    }

    /**
     * Adds a &#35;GOptionGroup to the commandline handling of &#64;application.
     * <br>
     * <br>This function is comparable to g_option_context_add_group().
     * <br>
     * <br>Unlike g_application_add_main_option_entries(), this function does
     * <br>not deal with %NULL &#64;arg_data and never transmits options to the
     * <br>primary instance.
     * <br>
     * <br>The reason for that is because, by the time the options arrive at the
     * <br>primary instance, it is typically too late to do anything with them.
     * <br>Taking the GTK option group as an example: GTK will already have been
     * <br>initialised by the time the &#35;GApplication::command-line handler runs.
     * <br>In the case that this is not the first-running instance of the
     * <br>application, the existing instance may already have been running for
     * <br>a very long time.
     * <br>
     * <br>This means that the options from &#35;GOptionGroup are only really usable
     * <br>in the case that the instance of the application being run is the
     * <br>first instance.  Passing options like `--display=` or `--gdk-debug=`
     * <br>on future runs will have no effect on the existing primary instance.
     * <br>
     * <br>Calling this function will cause the options in the supplied option
     * <br>group to be parsed, but it does not cause you to be &quot;opted in&quot; to the
     * <br>new functionality whereby unrecognised options are rejected even if
     * <br>%G_APPLICATION_HANDLES_COMMAND_LINE was given.
     * @param group a &#35;GOptionGroup
    */
    public void addOptionGroup(@Nonnull ch.bailu.gtk.glib.OptionGroup group)  {
        JnaApplication.INST().g_application_add_option_group(asCPointer(), asCPointerNotNull(group));
    }

    /**
     * Marks &#64;application as busy (see g_application_mark_busy()) while
     * <br>&#64;property on &#64;object is %TRUE.
     * <br>
     * <br>The binding holds a reference to &#64;application while it is active, but
     * <br>not to &#64;object. Instead, the binding is destroyed when &#64;object is
     * <br>finalized.
     * @param object a &#35;GObject
     * @param property the name of a boolean property of &#64;object
    */
    public void bindBusyProperty(@Nonnull ch.bailu.gtk.type.Pointer object, @Nonnull ch.bailu.gtk.type.Str property)  {
        JnaApplication.INST().g_application_bind_busy_property(asCPointer(), asCPointerNotNull(object), asCPointerNotNull(property));
    }

    /**
     * Marks &#64;application as busy (see g_application_mark_busy()) while
     * <br>&#64;property on &#64;object is %TRUE.
     * <br>
     * <br>The binding holds a reference to &#64;application while it is active, but
     * <br>not to &#64;object. Instead, the binding is destroyed when &#64;object is
     * <br>finalized.
     * @param object a &#35;GObject
     * @param property the name of a boolean property of &#64;object
    */
    public void bindBusyProperty(@Nonnull ch.bailu.gtk.type.Pointer object, String property)  {
        JnaApplication.INST().g_application_bind_busy_property(asCPointer(), asCPointerNotNull(object), property);
    }

    /**
     * Gets the unique identifier for &#64;application.
     * @return the identifier for &#64;application, owned by &#64;application
    */
    public ch.bailu.gtk.type.Str getApplicationId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaApplication.INST().g_application_get_application_id(asCPointer())));
    }

    /**
     * Gets the &#35;GDBusConnection being used by the application, or %NULL.
     * <br>
     * <br>If &#35;GApplication is using its D-Bus backend then this function will
     * <br>return the &#35;GDBusConnection being used for uniqueness and
     * <br>communication with the desktop environment and other instances of the
     * <br>application.
     * <br>
     * <br>If &#35;GApplication is not using D-Bus then this function will return
     * <br>%NULL.  This includes the situation where the D-Bus backend would
     * <br>normally be in use but we were unable to connect to the bus.
     * <br>
     * <br>This function must not be called before the application has been
     * <br>registered.  See g_application_get_is_registered().
     * @return a &#35;GDBusConnection, or %NULL
    */
    public DBusConnection getDbusConnection()  {
        return new DBusConnection(new PointerContainer(JnaApplication.INST().g_application_get_dbus_connection(asCPointer())));
    }

    /**
     * Gets the D-Bus object path being used by the application, or %NULL.
     * <br>
     * <br>If &#35;GApplication is using its D-Bus backend then this function will
     * <br>return the D-Bus object path that &#35;GApplication is using.  If the
     * <br>application is the primary instance then there is an object published
     * <br>at this path.  If the application is not the primary instance then
     * <br>the result of this function is undefined.
     * <br>
     * <br>If &#35;GApplication is not using D-Bus then this function will return
     * <br>%NULL.  This includes the situation where the D-Bus backend would
     * <br>normally be in use but we were unable to connect to the bus.
     * <br>
     * <br>This function must not be called before the application has been
     * <br>registered.  See g_application_get_is_registered().
     * @return the object path, or %NULL
    */
    public ch.bailu.gtk.type.Str getDbusObjectPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaApplication.INST().g_application_get_dbus_object_path(asCPointer())));
    }

    /**
     * Gets the flags for &#64;application.
     * <br>
     * <br>See &#35;GApplicationFlags.
     * @return the flags for &#64;application
    */
    public int getFlags()  {
        return JnaApplication.INST().g_application_get_flags(asCPointer());
    }

    /**
     * Gets the current inactivity timeout for the application.
     * <br>
     * <br>This is the amount of time (in milliseconds) after the last call to
     * <br>g_application_release() before the application stops running.
     * @return the timeout, in milliseconds
    */
    public int getInactivityTimeout()  {
        return JnaApplication.INST().g_application_get_inactivity_timeout(asCPointer());
    }

    /**
     * Gets the application's current busy state, as set through
     * <br>g_application_mark_busy() or g_application_bind_busy_property().
     * @return %TRUE if &#64;application is currently marked as busy
    */
    public boolean getIsBusy()  {
        return JnaApplication.INST().g_application_get_is_busy(asCPointer());
    }

    /**
     * Checks if &#64;application is registered.
     * <br>
     * <br>An application is registered if g_application_register() has been
     * <br>successfully called.
     * @return %TRUE if &#64;application is registered
    */
    public boolean getIsRegistered()  {
        return JnaApplication.INST().g_application_get_is_registered(asCPointer());
    }

    /**
     * Checks if &#64;application is remote.
     * <br>
     * <br>If &#64;application is remote then it means that another instance of
     * <br>application already exists (the 'primary' instance).  Calls to
     * <br>perform actions on &#64;application will result in the actions being
     * <br>performed by the primary instance.
     * <br>
     * <br>The value of this property cannot be accessed before
     * <br>g_application_register() has been called.  See
     * <br>g_application_get_is_registered().
     * @return %TRUE if &#64;application is remote
    */
    public boolean getIsRemote()  {
        return JnaApplication.INST().g_application_get_is_remote(asCPointer());
    }

    /**
     * Gets the resource base path of &#64;application.
     * <br>
     * <br>See g_application_set_resource_base_path() for more information.
     * @return the base resource path, if one is set
    */
    public ch.bailu.gtk.type.Str getResourceBasePath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaApplication.INST().g_application_get_resource_base_path(asCPointer())));
    }

    /**
     * Increases the use count of &#64;application.
     * <br>
     * <br>Use this function to indicate that the application has a reason to
     * <br>continue to run.  For example, g_application_hold() is called by GTK+
     * <br>when a toplevel window is on the screen.
     * <br>
     * <br>To cancel the hold, call g_application_release().
    */
    public void hold()  {
        JnaApplication.INST().g_application_hold(asCPointer());
    }

    /**
     * Increases the busy count of &#64;application.
     * <br>
     * <br>Use this function to indicate that the application is busy, for instance
     * <br>while a long running operation is pending.
     * <br>
     * <br>The busy state will be exposed to other processes, so a session shell will
     * <br>use that information to indicate the state to the user (e.g. with a
     * <br>spinner).
     * <br>
     * <br>To cancel the busy indication, use g_application_unmark_busy().
     * <br>
     * <br>The application must be registered before calling this function.
    */
    public void markBusy()  {
        JnaApplication.INST().g_application_mark_busy(asCPointer());
    }

    /**
     * Immediately quits the application.
     * <br>
     * <br>Upon return to the mainloop, g_application_run() will return,
     * <br>calling only the 'shutdown' function before doing so.
     * <br>
     * <br>The hold count is ignored.
     * <br>Take care if your code has called g_application_hold() on the application and
     * <br>is therefore still expecting it to exist.
     * <br>(Note that you may have called g_application_hold() indirectly, for example
     * <br>through gtk_application_add_window().)
     * <br>
     * <br>The result of calling g_application_run() again after it returns is
     * <br>unspecified.
    */
    public void quit()  {
        JnaApplication.INST().g_application_quit(asCPointer());
    }

    /**
     * Attempts registration of the application.
     * <br>
     * <br>This is the point at which the application discovers if it is the
     * <br>primary instance or merely acting as a remote for an already-existing
     * <br>primary instance.  This is implemented by attempting to acquire the
     * <br>application identifier as a unique bus name on the session bus using
     * <br>GDBus.
     * <br>
     * <br>If there is no application ID or if %G_APPLICATION_NON_UNIQUE was
     * <br>given, then this process will always become the primary instance.
     * <br>
     * <br>Due to the internal architecture of GDBus, method calls can be
     * <br>dispatched at any time (even if a main loop is not running).  For
     * <br>this reason, you must ensure that any object paths that you wish to
     * <br>register are registered before calling this function.
     * <br>
     * <br>If the application has already been registered then %TRUE is
     * <br>returned with no work performed.
     * <br>
     * <br>The &#35;GApplication::startup signal is emitted if registration succeeds
     * <br>and &#64;application is the primary instance (including the non-unique
     * <br>case).
     * <br>
     * <br>In the event of an error (such as &#64;cancellable being cancelled, or a
     * <br>failure to connect to the session bus), %FALSE is returned and &#64;error
     * <br>is set appropriately.
     * <br>
     * <br>Note: the return value of this function is not an indicator that this
     * <br>instance is or is not the primary instance of the application.  See
     * <br>g_application_get_is_remote() for that.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE if registration succeeded
    */
    public boolean register(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaApplication.INST().g_application_register(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Decrease the use count of &#64;application.
     * <br>
     * <br>When the use count reaches zero, the application will stop running.
     * <br>
     * <br>Never call this function except to cancel the effect of a previous
     * <br>call to g_application_hold().
    */
    public void release()  {
        JnaApplication.INST().g_application_release(asCPointer());
    }

    /**
     * Runs the application.
     * <br>
     * <br>This function is intended to be run from main() and its return value
     * <br>is intended to be returned by main(). Although you are expected to pass
     * <br>the &#64;argc, &#64;argv parameters from main() to this function, it is possible
     * <br>to pass %NULL if &#64;argv is not available or commandline handling is not
     * <br>required.  Note that on Windows, &#64;argc and &#64;argv are ignored, and
     * <br>g_win32_get_command_line() is called internally (for proper support
     * <br>of Unicode commandline arguments).
     * <br>
     * <br>&#35;GApplication will attempt to parse the commandline arguments.  You
     * <br>can add commandline flags to the list of recognised options by way of
     * <br>g_application_add_main_option_entries().  After this, the
     * <br>&#35;GApplication::handle-local-options signal is emitted, from which the
     * <br>application can inspect the values of its &#35;GOptionEntrys.
     * <br>
     * <br>&#35;GApplication::handle-local-options is a good place to handle options
     * <br>such as `--version`, where an immediate reply from the local process is
     * <br>desired (instead of communicating with an already-running instance).
     * <br>A &#35;GApplication::handle-local-options handler can stop further processing
     * <br>by returning a non-negative value, which then becomes the exit status of
     * <br>the process.
     * <br>
     * <br>What happens next depends on the flags: if
     * <br>%G_APPLICATION_HANDLES_COMMAND_LINE was specified then the remaining
     * <br>commandline arguments are sent to the primary instance, where a
     * <br>&#35;GApplication::command-line signal is emitted.  Otherwise, the
     * <br>remaining commandline arguments are assumed to be a list of files.
     * <br>If there are no files listed, the application is activated via the
     * <br>&#35;GApplication::activate signal.  If there are one or more files, and
     * <br>%G_APPLICATION_HANDLES_OPEN was specified then the files are opened
     * <br>via the &#35;GApplication::open signal.
     * <br>
     * <br>If you are interested in doing more complicated local handling of the
     * <br>commandline then you should implement your own &#35;GApplication subclass
     * <br>and override local_command_line(). In this case, you most likely want
     * <br>to return %TRUE from your local_command_line() implementation to
     * <br>suppress the default handling. See
     * <br>[gapplication-example-cmdline2.c][https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c]
     * <br>for an example.
     * <br>
     * <br>If, after the above is done, the use count of the application is zero
     * <br>then the exit status is returned immediately.  If the use count is
     * <br>non-zero then the default main context is iterated until the use count
     * <br>falls to zero, at which point 0 is returned.
     * <br>
     * <br>If the %G_APPLICATION_IS_SERVICE flag is set, then the service will
     * <br>run for as much as 10 seconds with a use count of zero while waiting
     * <br>for the message that caused the activation to arrive.  After that,
     * <br>if the use count falls to zero the application will exit immediately,
     * <br>except in the case that g_application_set_inactivity_timeout() is in
     * <br>use.
     * <br>
     * <br>This function sets the prgname (g_set_prgname()), if not already set,
     * <br>to the basename of argv[0].
     * <br>
     * <br>Much like g_main_loop_run(), this function will acquire the main context
     * <br>for the duration that the application is running.
     * <br>
     * <br>Since 2.40, applications that are not explicitly flagged as services
     * <br>or launchers (ie: neither %G_APPLICATION_IS_SERVICE or
     * <br>%G_APPLICATION_IS_LAUNCHER are given as flags) will check (from the
     * <br>default handler for local_command_line) if &quot;--gapplication-service&quot;
     * <br>was given in the command line.  If this flag is present then normal
     * <br>commandline processing is interrupted and the
     * <br>%G_APPLICATION_IS_SERVICE flag is set.  This provides a &quot;compromise&quot;
     * <br>solution whereby running an application directly from the commandline
     * <br>will invoke it in the normal way (which can be useful for debugging)
     * <br>while still allowing applications to be D-Bus activated in service
     * <br>mode.  The D-Bus service file should invoke the executable with
     * <br>&quot;--gapplication-service&quot; as the sole commandline argument.  This
     * <br>approach is suitable for use by most graphical applications but
     * <br>should not be used from applications like editors that need precise
     * <br>control over when processes invoked via the commandline will exit and
     * <br>what their exit status will be.
     * @param argc the argc from main() (or 0 if &#64;argv is %NULL)
     * @param argv      the argv from main(), or %NULL
     * @return the exit status
    */
    public int run(int argc, @Nullable ch.bailu.gtk.type.Strs argv)  {
        return JnaApplication.INST().g_application_run(asCPointer(), argc, asCPointer(argv));
    }

    /**
     * Sends a notification on behalf of &#64;application to the desktop shell.
     * <br>There is no guarantee that the notification is displayed immediately,
     * <br>or even at all.
     * <br>
     * <br>Notifications may persist after the application exits. It will be
     * <br>D-Bus-activated when the notification or one of its actions is
     * <br>activated.
     * <br>
     * <br>Modifying &#64;notification after this call has no effect. However, the
     * <br>object can be reused for a later call to this function.
     * <br>
     * <br>&#64;id may be any string that uniquely identifies the event for the
     * <br>application. It does not need to be in any special format. For
     * <br>example, &quot;new-message&quot; might be appropriate for a notification about
     * <br>new messages.
     * <br>
     * <br>If a previous notification was sent with the same &#64;id, it will be
     * <br>replaced with &#64;notification and shown again as if it was a new
     * <br>notification. This works even for notifications sent from a previous
     * <br>execution of the application, as long as &#64;id is the same string.
     * <br>
     * <br>&#64;id may be %NULL, but it is impossible to replace or withdraw
     * <br>notifications without an id.
     * <br>
     * <br>If &#64;notification is no longer relevant, it can be withdrawn with
     * <br>g_application_withdraw_notification().
     * @param id id of the notification, or %NULL
     * @param notification the &#35;GNotification to send
    */
    public void sendNotification(@Nullable ch.bailu.gtk.type.Str id, @Nonnull Notification notification)  {
        JnaApplication.INST().g_application_send_notification(asCPointer(), asCPointer(id), asCPointerNotNull(notification));
    }

    /**
     * Sends a notification on behalf of &#64;application to the desktop shell.
     * <br>There is no guarantee that the notification is displayed immediately,
     * <br>or even at all.
     * <br>
     * <br>Notifications may persist after the application exits. It will be
     * <br>D-Bus-activated when the notification or one of its actions is
     * <br>activated.
     * <br>
     * <br>Modifying &#64;notification after this call has no effect. However, the
     * <br>object can be reused for a later call to this function.
     * <br>
     * <br>&#64;id may be any string that uniquely identifies the event for the
     * <br>application. It does not need to be in any special format. For
     * <br>example, &quot;new-message&quot; might be appropriate for a notification about
     * <br>new messages.
     * <br>
     * <br>If a previous notification was sent with the same &#64;id, it will be
     * <br>replaced with &#64;notification and shown again as if it was a new
     * <br>notification. This works even for notifications sent from a previous
     * <br>execution of the application, as long as &#64;id is the same string.
     * <br>
     * <br>&#64;id may be %NULL, but it is impossible to replace or withdraw
     * <br>notifications without an id.
     * <br>
     * <br>If &#64;notification is no longer relevant, it can be withdrawn with
     * <br>g_application_withdraw_notification().
     * @param id id of the notification, or %NULL
     * @param notification the &#35;GNotification to send
    */
    public void sendNotification(String id, @Nonnull Notification notification)  {
        JnaApplication.INST().g_application_send_notification(asCPointer(), id, asCPointerNotNull(notification));
    }

    /**
     * Sets the unique identifier for &#64;application.
     * <br>
     * <br>The application id can only be modified if &#64;application has not yet
     * <br>been registered.
     * <br>
     * <br>If non-%NULL, the application id must be valid.  See
     * <br>g_application_id_is_valid().
     * @param application_id the identifier for &#64;application
    */
    public void setApplicationId(@Nullable ch.bailu.gtk.type.Str application_id)  {
        JnaApplication.INST().g_application_set_application_id(asCPointer(), asCPointer(application_id));
    }

    /**
     * Sets the unique identifier for &#64;application.
     * <br>
     * <br>The application id can only be modified if &#64;application has not yet
     * <br>been registered.
     * <br>
     * <br>If non-%NULL, the application id must be valid.  See
     * <br>g_application_id_is_valid().
     * @param application_id the identifier for &#64;application
    */
    public void setApplicationId(String application_id)  {
        JnaApplication.INST().g_application_set_application_id(asCPointer(), application_id);
    }

    /**
     * Sets or unsets the default application for the process, as returned
     * <br>by g_application_get_default().
     * <br>
     * <br>This function does not take its own reference on &#64;application.  If
     * <br>&#64;application is destroyed then the default application will revert
     * <br>back to %NULL.
    */
    public void setDefault()  {
        JnaApplication.INST().g_application_set_default(asCPointer());
    }

    /**
     * Sets the flags for &#64;application.
     * <br>
     * <br>The flags can only be modified if &#64;application has not yet been
     * <br>registered.
     * <br>
     * <br>See &#35;GApplicationFlags.
     * @param flags the flags for &#64;application
    */
    public void setFlags(int flags)  {
        JnaApplication.INST().g_application_set_flags(asCPointer(), flags);
    }

    /**
     * Sets the current inactivity timeout for the application.
     * <br>
     * <br>This is the amount of time (in milliseconds) after the last call to
     * <br>g_application_release() before the application stops running.
     * <br>
     * <br>This call has no side effects of its own.  The value set here is only
     * <br>used for next time g_application_release() drops the use count to
     * <br>zero.  Any timeouts currently in progress are not impacted.
     * @param inactivity_timeout the timeout, in milliseconds
    */
    public void setInactivityTimeout(int inactivity_timeout)  {
        JnaApplication.INST().g_application_set_inactivity_timeout(asCPointer(), inactivity_timeout);
    }

    /**
     * Adds a description to the &#64;application option context.
     * <br>
     * <br>See g_option_context_set_description() for more information.
     * @param description a string to be shown in `--help` output  after the list of options, or %NULL
    */
    public void setOptionContextDescription(@Nullable ch.bailu.gtk.type.Str description)  {
        JnaApplication.INST().g_application_set_option_context_description(asCPointer(), asCPointer(description));
    }

    /**
     * Adds a description to the &#64;application option context.
     * <br>
     * <br>See g_option_context_set_description() for more information.
     * @param description a string to be shown in `--help` output  after the list of options, or %NULL
    */
    public void setOptionContextDescription(String description)  {
        JnaApplication.INST().g_application_set_option_context_description(asCPointer(), description);
    }

    /**
     * Sets the parameter string to be used by the commandline handling of &#64;application.
     * <br>
     * <br>This function registers the argument to be passed to g_option_context_new()
     * <br>when the internal &#35;GOptionContext of &#64;application is created.
     * <br>
     * <br>See g_option_context_new() for more information about &#64;parameter_string.
     * @param parameter_string a string which is displayed   in the first line of `--help` output, after the usage summary `programname [OPTION...]`.
    */
    public void setOptionContextParameterString(@Nullable ch.bailu.gtk.type.Str parameter_string)  {
        JnaApplication.INST().g_application_set_option_context_parameter_string(asCPointer(), asCPointer(parameter_string));
    }

    /**
     * Sets the parameter string to be used by the commandline handling of &#64;application.
     * <br>
     * <br>This function registers the argument to be passed to g_option_context_new()
     * <br>when the internal &#35;GOptionContext of &#64;application is created.
     * <br>
     * <br>See g_option_context_new() for more information about &#64;parameter_string.
     * @param parameter_string a string which is displayed   in the first line of `--help` output, after the usage summary `programname [OPTION...]`.
    */
    public void setOptionContextParameterString(String parameter_string)  {
        JnaApplication.INST().g_application_set_option_context_parameter_string(asCPointer(), parameter_string);
    }

    /**
     * Adds a summary to the &#64;application option context.
     * <br>
     * <br>See g_option_context_set_summary() for more information.
     * @param summary a string to be shown in `--help` output  before the list of options, or %NULL
    */
    public void setOptionContextSummary(@Nullable ch.bailu.gtk.type.Str summary)  {
        JnaApplication.INST().g_application_set_option_context_summary(asCPointer(), asCPointer(summary));
    }

    /**
     * Adds a summary to the &#64;application option context.
     * <br>
     * <br>See g_option_context_set_summary() for more information.
     * @param summary a string to be shown in `--help` output  before the list of options, or %NULL
    */
    public void setOptionContextSummary(String summary)  {
        JnaApplication.INST().g_application_set_option_context_summary(asCPointer(), summary);
    }

    /**
     * Sets (or unsets) the base resource path of &#64;application.
     * <br>
     * <br>The path is used to automatically load various [application
     * <br>resources][gresource] such as menu layouts and action descriptions.
     * <br>The various types of resources will be found at fixed names relative
     * <br>to the given base path.
     * <br>
     * <br>By default, the resource base path is determined from the application
     * <br>ID by prefixing '/' and replacing each '.' with '/'.  This is done at
     * <br>the time that the &#35;GApplication object is constructed.  Changes to
     * <br>the application ID after that point will not have an impact on the
     * <br>resource base path.
     * <br>
     * <br>As an example, if the application has an ID of &quot;org.example.app&quot; then
     * <br>the default resource base path will be &quot;/org/example/app&quot;.  If this
     * <br>is a &#35;GtkApplication (and you have not manually changed the path)
     * <br>then Gtk will then search for the menus of the application at
     * <br>&quot;/org/example/app/gtk/menus.ui&quot;.
     * <br>
     * <br>See &#35;GResource for more information about adding resources to your
     * <br>application.
     * <br>
     * <br>You can disable automatic resource loading functionality by setting
     * <br>the path to %NULL.
     * <br>
     * <br>Changing the resource base path once the application is running is
     * <br>not recommended.  The point at which the resource path is consulted
     * <br>for forming paths for various purposes is unspecified.  When writing
     * <br>a sub-class of &#35;GApplication you should either set the
     * <br>&#35;GApplication:resource-base-path property at construction time, or call
     * <br>this function during the instance initialization. Alternatively, you
     * <br>can call this function in the &#35;GApplicationClass.startup virtual function,
     * <br>before chaining up to the parent implementation.
     * @param resource_path the resource path to use
    */
    public void setResourceBasePath(@Nullable ch.bailu.gtk.type.Str resource_path)  {
        JnaApplication.INST().g_application_set_resource_base_path(asCPointer(), asCPointer(resource_path));
    }

    /**
     * Sets (or unsets) the base resource path of &#64;application.
     * <br>
     * <br>The path is used to automatically load various [application
     * <br>resources][gresource] such as menu layouts and action descriptions.
     * <br>The various types of resources will be found at fixed names relative
     * <br>to the given base path.
     * <br>
     * <br>By default, the resource base path is determined from the application
     * <br>ID by prefixing '/' and replacing each '.' with '/'.  This is done at
     * <br>the time that the &#35;GApplication object is constructed.  Changes to
     * <br>the application ID after that point will not have an impact on the
     * <br>resource base path.
     * <br>
     * <br>As an example, if the application has an ID of &quot;org.example.app&quot; then
     * <br>the default resource base path will be &quot;/org/example/app&quot;.  If this
     * <br>is a &#35;GtkApplication (and you have not manually changed the path)
     * <br>then Gtk will then search for the menus of the application at
     * <br>&quot;/org/example/app/gtk/menus.ui&quot;.
     * <br>
     * <br>See &#35;GResource for more information about adding resources to your
     * <br>application.
     * <br>
     * <br>You can disable automatic resource loading functionality by setting
     * <br>the path to %NULL.
     * <br>
     * <br>Changing the resource base path once the application is running is
     * <br>not recommended.  The point at which the resource path is consulted
     * <br>for forming paths for various purposes is unspecified.  When writing
     * <br>a sub-class of &#35;GApplication you should either set the
     * <br>&#35;GApplication:resource-base-path property at construction time, or call
     * <br>this function during the instance initialization. Alternatively, you
     * <br>can call this function in the &#35;GApplicationClass.startup virtual function,
     * <br>before chaining up to the parent implementation.
     * @param resource_path the resource path to use
    */
    public void setResourceBasePath(String resource_path)  {
        JnaApplication.INST().g_application_set_resource_base_path(asCPointer(), resource_path);
    }

    /**
     * Destroys a binding between &#64;property and the busy state of
     * <br>&#64;application that was previously created with
     * <br>g_application_bind_busy_property().
     * @param object a &#35;GObject
     * @param property the name of a boolean property of &#64;object
    */
    public void unbindBusyProperty(@Nonnull ch.bailu.gtk.type.Pointer object, @Nonnull ch.bailu.gtk.type.Str property)  {
        JnaApplication.INST().g_application_unbind_busy_property(asCPointer(), asCPointerNotNull(object), asCPointerNotNull(property));
    }

    /**
     * Destroys a binding between &#64;property and the busy state of
     * <br>&#64;application that was previously created with
     * <br>g_application_bind_busy_property().
     * @param object a &#35;GObject
     * @param property the name of a boolean property of &#64;object
    */
    public void unbindBusyProperty(@Nonnull ch.bailu.gtk.type.Pointer object, String property)  {
        JnaApplication.INST().g_application_unbind_busy_property(asCPointer(), asCPointerNotNull(object), property);
    }

    /**
     * Decreases the busy count of &#64;application.
     * <br>
     * <br>When the busy count reaches zero, the new state will be propagated
     * <br>to other processes.
     * <br>
     * <br>This function must only be called to cancel the effect of a previous
     * <br>call to g_application_mark_busy().
    */
    public void unmarkBusy()  {
        JnaApplication.INST().g_application_unmark_busy(asCPointer());
    }

    /**
     * Withdraws a notification that was sent with
     * <br>g_application_send_notification().
     * <br>
     * <br>This call does nothing if a notification with &#64;id doesn't exist or
     * <br>the notification was never sent.
     * <br>
     * <br>This function works even for notifications sent in previous
     * <br>executions of this application, as long &#64;id is the same as it was for
     * <br>the sent notification.
     * <br>
     * <br>Note that notifications are dismissed when the user clicks on one
     * <br>of the buttons in a notification or triggers its default action, so
     * <br>there is no need to explicitly withdraw the notification in that case.
     * @param id id of a previously sent notification
    */
    public void withdrawNotification(@Nonnull ch.bailu.gtk.type.Str id)  {
        JnaApplication.INST().g_application_withdraw_notification(asCPointer(), asCPointerNotNull(id));
    }

    /**
     * Withdraws a notification that was sent with
     * <br>g_application_send_notification().
     * <br>
     * <br>This call does nothing if a notification with &#64;id doesn't exist or
     * <br>the notification was never sent.
     * <br>
     * <br>This function works even for notifications sent in previous
     * <br>executions of this application, as long &#64;id is the same as it was for
     * <br>the sent notification.
     * <br>
     * <br>Note that notifications are dismissed when the user clicks on one
     * <br>of the buttons in a notification or triggers its default action, so
     * <br>there is no need to explicitly withdraw the notification in that case.
     * @param id id of a previously sent notification
    */
    public void withdrawNotification(String id)  {
        JnaApplication.INST().g_application_withdraw_notification(asCPointer(), id);
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
    }

    public final static String SIGNAL_ON_COMMAND_LINE = "command-line";
    
    /**
     * Connect to signal "command-line".
     * <br>See {@link OnCommandLine#onCommandLine} for signal description.
     * <br>Field {@link #SIGNAL_ON_COMMAND_LINE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCommandLine(OnCommandLine signal) {
        return connectSignal(SIGNAL_ON_COMMAND_LINE, toOnCommandLine(signal));
    }

    public final static String SIGNAL_ON_HANDLE_LOCAL_OPTIONS = "handle-local-options";
    
    /**
     * Connect to signal "handle-local-options".
     * <br>See {@link OnHandleLocalOptions#onHandleLocalOptions} for signal description.
     * <br>Field {@link #SIGNAL_ON_HANDLE_LOCAL_OPTIONS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHandleLocalOptions(OnHandleLocalOptions signal) {
        return connectSignal(SIGNAL_ON_HANDLE_LOCAL_OPTIONS, toOnHandleLocalOptions(signal));
    }

    public final static String SIGNAL_ON_NAME_LOST = "name-lost";
    
    /**
     * Connect to signal "name-lost".
     * <br>See {@link OnNameLost#onNameLost} for signal description.
     * <br>Field {@link #SIGNAL_ON_NAME_LOST} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNameLost(OnNameLost signal) {
        return connectSignal(SIGNAL_ON_NAME_LOST, toOnNameLost(signal));
    }

    public final static String SIGNAL_ON_OPEN = "open";
    
    /**
     * Connect to signal "open".
     * <br>See {@link OnOpen#onOpen} for signal description.
     * <br>Field {@link #SIGNAL_ON_OPEN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onOpen(OnOpen signal) {
        return connectSignal(SIGNAL_ON_OPEN, toOnOpen(signal));
    }

    public final static String SIGNAL_ON_SHUTDOWN = "shutdown";
    
    /**
     * Connect to signal "shutdown".
     * <br>See {@link OnShutdown#onShutdown} for signal description.
     * <br>Field {@link #SIGNAL_ON_SHUTDOWN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onShutdown(OnShutdown signal) {
        return connectSignal(SIGNAL_ON_SHUTDOWN, toOnShutdown(signal));
    }

    public final static String SIGNAL_ON_STARTUP = "startup";
    
    /**
     * Connect to signal "startup".
     * <br>See {@link OnStartup#onStartup} for signal description.
     * <br>Field {@link #SIGNAL_ON_STARTUP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStartup(OnStartup signal) {
        return connectSignal(SIGNAL_ON_STARTUP, toOnStartup(signal));
    }

    /**
     * Returns the default &#35;GApplication instance for this process.
     * <br>
     * <br>Normally there is only one &#35;GApplication per process and it becomes
     * <br>the default when it is created.  You can exercise more control over
     * <br>this by using g_application_set_default().
     * <br>
     * <br>If there is no default application then %NULL is returned.
     * @return the default application for this process, or %NULL
    */
    public static Application getDefault()  {
        return new Application(new PointerContainer(JnaApplication.INST().g_application_get_default()));
    }

    /**
     * Checks if &#64;application_id is a valid application identifier.
     * <br>
     * <br>A valid ID is required for calls to g_application_new() and
     * <br>g_application_set_application_id().
     * <br>
     * <br>Application identifiers follow the same format as
     * <br>[D-Bus well-known bus names](https://dbus.freedesktop.org/doc/dbus-specification.html&#35;message-protocol-names-bus).
     * <br>For convenience, the restrictions on application identifiers are
     * <br>reproduced here:
     * <br>
     * <br>- Application identifiers are composed of 1 or more elements separated by a
     * <br>  period (`.`) character. All elements must contain at least one character.
     * <br>
     * <br>- Each element must only contain the ASCII characters `[A-Z][a-z][0-9]_-`,
     * <br>  with `-` discouraged in new application identifiers. Each element must not
     * <br>  begin with a digit.
     * <br>
     * <br>- Application identifiers must contain at least one `.` (period) character
     * <br>  (and thus at least two elements).
     * <br>
     * <br>- Application identifiers must not begin with a `.` (period) character.
     * <br>
     * <br>- Application identifiers must not exceed 255 characters.
     * <br>
     * <br>Note that the hyphen (`-`) character is allowed in application identifiers,
     * <br>but is problematic or not allowed in various specifications and APIs that
     * <br>refer to D-Bus, such as
     * <br>[Flatpak application IDs](http://docs.flatpak.org/en/latest/introduction.html&#35;identifiers),
     * <br>the
     * <br>[`DBusActivatable` interface in the Desktop Entry Specification](https://specifications.freedesktop.org/desktop-entry-spec/desktop-entry-spec-latest.html&#35;dbus),
     * <br>and the convention that an application's &quot;main&quot; interface and object path
     * <br>resemble its application identifier and bus name. To avoid situations that
     * <br>require special-case handling, it is recommended that new application
     * <br>identifiers consistently replace hyphens with underscores.
     * <br>
     * <br>Like D-Bus interface names, application identifiers should start with the
     * <br>reversed DNS domain name of the author of the interface (in lower-case), and
     * <br>it is conventional for the rest of the application identifier to consist of
     * <br>words run together, with initial capital letters.
     * <br>
     * <br>As with D-Bus interface names, if the author's DNS domain name contains
     * <br>hyphen/minus characters they should be replaced by underscores, and if it
     * <br>contains leading digits they should be escaped by prepending an underscore.
     * <br>For example, if the owner of 7-zip.org used an application identifier for an
     * <br>archiving application, it might be named `org._7_zip.Archiver`.
     * @param application_id a potential application identifier
     * @return %TRUE if &#64;application_id is valid
    */
    public static boolean idIsValid(@Nonnull ch.bailu.gtk.type.Str application_id)  {
        return JnaApplication.INST().g_application_id_is_valid(asCPointerNotNull(application_id));
    }

    /**
     * Implements interface {@link ActionGroup}. Call this to get access to interface functions.
     * @return {@link ActionGroup}
    */
    public ActionGroup asActionGroup() {
        return new ActionGroup(cast());
    }

    /**
     * Implements interface {@link ActionMap}. Call this to get access to interface functions.
     * @return {@link ActionMap}
    */
    public ActionMap asActionMap() {
        return new ActionMap(cast());
    }

    public static long getTypeID() { 
        return JnaApplication.INST().g_application_get_type(); 
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

[MethodModel:java-type-not-supported:addMainOption:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:char}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GOptionFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GOptionArg}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[MethodModel:java-type-not-supported:addMainOptionEntries:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GOptionEntry*}}:{j:}]

[MethodModel:java-type-not-supported:open:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GFile**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-deprecated:setActionGroup:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
*/
