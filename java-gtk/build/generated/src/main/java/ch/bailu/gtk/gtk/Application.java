/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkApplication` is a high-level API for writing applications.
 * <br>
 * <br>It supports many aspects of writing a GTK application in a convenient
 * <br>fashion, without enforcing a one-size-fits-all model.
 * <br>
 * <br>Currently, `GtkApplication` handles GTK initialization, application
 * <br>uniqueness, session management, provides some basic scriptability and
 * <br>desktop shell integration by exporting actions and menus and manages a
 * <br>list of toplevel windows whose life-cycle is automatically tied to the
 * <br>life-cycle of your application.
 * <br>
 * <br>While `GtkApplication` works fine with plain [class&#64;Gtk.Window]s, it is
 * <br>recommended to use it together with [class&#64;Gtk.ApplicationWindow].
 * <br>
 * <br>&#35;&#35; Automatic resources
 * <br>
 * <br>`GtkApplication` will automatically load menus from the `GtkBuilder`
 * <br>resource located at &quot;gtk/menus.ui&quot;, relative to the application's
 * <br>resource base path (see [method&#64;Gio.Application.set_resource_base_path]).
 * <br>The menu with the ID &quot;menubar&quot; is taken as the application's
 * <br>menubar. Additional menus (most interesting submenus) can be named
 * <br>and accessed via [method&#64;Gtk.Application.get_menu_by_id] which allows for
 * <br>dynamic population of a part of the menu structure.
 * <br>
 * <br>It is also possible to provide the menubar manually using
 * <br>[method&#64;Gtk.Application.set_menubar].
 * <br>
 * <br>`GtkApplication` will also automatically setup an icon search path for
 * <br>the default icon theme by appending &quot;icons&quot; to the resource base
 * <br>path. This allows your application to easily store its icons as
 * <br>resources. See [method&#64;Gtk.IconTheme.add_resource_path] for more
 * <br>information.
 * <br>
 * <br>If there is a resource located at `gtk/help-overlay.ui` which
 * <br>defines a [class&#64;Gtk.ShortcutsWindow] with ID `help_overlay` then
 * <br>`GtkApplication` associates an instance of this shortcuts window with
 * <br>each [class&#64;Gtk.ApplicationWindow] and sets up the keyboard accelerator
 * <br>&lt;kbd&gt;Control&lt;/kbd&gt;+&lt;kbd&gt;?&lt;/kbd&gt; to open it. To create a menu item that
 * <br>displays the shortcuts window, associate the item with the action
 * <br>`win.show-help-overlay`.
 * <br>
 * <br>&#35;&#35; A simple application
 * <br>
 * <br>[A simple example](https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/bp/bloatpad.c)
 * <br>is available in the GTK source code repository
 * <br>
 * <br>`GtkApplication` optionally registers with a session manager of the
 * <br>users session (if you set the [property&#64;Gtk.Application:register-session]
 * <br>property) and offers various functionality related to the session
 * <br>life-cycle.
 * <br>
 * <br>An application can block various ways to end the session with
 * <br>the [method&#64;Gtk.Application.inhibit] function. Typical use cases for
 * <br>this kind of inhibiting are long-running, uninterruptible operations,
 * <br>such as burning a CD or performing a disk backup. The session
 * <br>manager may not honor the inhibitor, but it can be expected to
 * <br>inform the user about the negative consequences of ending the
 * <br>session while inhibitors are present.
 * <br>
 * <br>&#35;&#35; See Also
 * <br>
 * <br>[HowDoI: Using GtkApplication](https://wiki.gnome.org/HowDoI/GtkApplication),
 * <br>[Getting Started with GTK: Basics](getting_started.html&#35;basics)
 * <p><a href="https://docs.gtk.org/gtk4/class.Application.html">https://docs.gtk.org/gtk4/class.Application.html</a></p>
*/
public class Application extends ch.bailu.gtk.gio.Application {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Application.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnQueryEnd {
        /**
         * Emitted when the session manager is about to end the session.
         * <br>
         * <br>This signal is only emitted if [property&#64;Gtk.Application:register-session]
         * <br>is `TRUE`. Applications can connect to this signal and call
         * <br>[method&#64;Gtk.Application.inhibit] with `GTK_APPLICATION_INHIBIT_LOGOUT`
         * <br>to delay the end of the session until state has been saved.
        */
        void onQueryEnd();
    }
    
    private static com.sun.jna.Callback toOnQueryEnd(OnQueryEnd in) {
        return (in == null) ? null: (JnaApplication.OnQueryEnd) (__self, __data) -> in.onQueryEnd();
    }

    @FunctionalInterface
    public interface OnWindowAdded {
        /**
         * Emitted when a [class&#64;Gtk.Window] is added to `application` through
         * <br>[method&#64;Gtk.Application.add_window].
         * @param window the newly-added [class&#64;Gtk.Window]
        */
        void onWindowAdded(@Nonnull Window window);
    }
    
    private static com.sun.jna.Callback toOnWindowAdded(OnWindowAdded in) {
        return (in == null) ? null: (JnaApplication.OnWindowAdded) (__self, _window, __data) -> in.onWindowAdded(new Window(new PointerContainer(_window)));
    }

    @FunctionalInterface
    public interface OnWindowRemoved {
        /**
         * Emitted when a [class&#64;Gtk.Window] is removed from `application`.
         * <br>
         * <br>This can happen as a side-effect of the window being destroyed
         * <br>or explicitly through [method&#64;Gtk.Application.remove_window].
         * @param window the [class&#64;Gtk.Window] that is being removed
        */
        void onWindowRemoved(@Nonnull Window window);
    }
    
    private static com.sun.jna.Callback toOnWindowRemoved(OnWindowRemoved in) {
        return (in == null) ? null: (JnaApplication.OnWindowRemoved) (__self, _window, __data) -> in.onWindowRemoved(new Window(new PointerContainer(_window)));
    }

    public Application(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkApplication` instance.
     * <br>
     * <br>When using `GtkApplication`, it is not necessary to call [func&#64;Gtk.init]
     * <br>manually. It is called as soon as the application gets registered as
     * <br>the primary instance.
     * <br>
     * <br>Concretely, [func&#64;Gtk.init] is called in the default handler for the
     * <br>`GApplication::startup` signal. Therefore, `GtkApplication` subclasses should
     * <br>always chain up in their `GApplication::startup` handler before using any GTK
     * <br>API.
     * <br>
     * <br>Note that commandline arguments are not passed to [func&#64;Gtk.init].
     * <br>
     * <br>If `application_id` is not %NULL, then it must be valid. See
     * <br>`g_application_id_is_valid()`.
     * <br>
     * <br>If no application ID is given then some features (most notably application
     * <br>uniqueness) will be disabled.
     * @param application_id The application ID
     * @param flags the application flags
    */
    public Application(@Nullable ch.bailu.gtk.type.Str application_id, int flags) {
        super(cast(JnaApplication.INST().gtk_application_new(asCPointer(application_id), flags)));
    }

    /**
     * Creates a new `GtkApplication` instance.
     * <br>
     * <br>When using `GtkApplication`, it is not necessary to call [func&#64;Gtk.init]
     * <br>manually. It is called as soon as the application gets registered as
     * <br>the primary instance.
     * <br>
     * <br>Concretely, [func&#64;Gtk.init] is called in the default handler for the
     * <br>`GApplication::startup` signal. Therefore, `GtkApplication` subclasses should
     * <br>always chain up in their `GApplication::startup` handler before using any GTK
     * <br>API.
     * <br>
     * <br>Note that commandline arguments are not passed to [func&#64;Gtk.init].
     * <br>
     * <br>If `application_id` is not %NULL, then it must be valid. See
     * <br>`g_application_id_is_valid()`.
     * <br>
     * <br>If no application ID is given then some features (most notably application
     * <br>uniqueness) will be disabled.
     * @param application_id The application ID
     * @param flags the application flags
    */
    public Application(String application_id, int flags) {
        super(cast(JnaApplication.INST().gtk_application_new(application_id, flags)));
    }

    /**
     * Adds a window to `application`.
     * <br>
     * <br>This call can only happen after the `application` has started;
     * <br>typically, you should add new application windows in response
     * <br>to the emission of the `GApplication::activate` signal.
     * <br>
     * <br>This call is equivalent to setting the [property&#64;Gtk.Window:application]
     * <br>property of `window` to `application`.
     * <br>
     * <br>Normally, the connection between the application and the window
     * <br>will remain until the window is destroyed, but you can explicitly
     * <br>remove it with [method&#64;Gtk.Application.remove_window].
     * <br>
     * <br>GTK will keep the `application` running as long as it has
     * <br>any windows.
     * @param window a `GtkWindow`
    */
    public void addWindow(@Nonnull Window window)  {
        JnaApplication.INST().gtk_application_add_window(asCPointer(), asCPointerNotNull(window));
    }

    /**
     * Gets the accelerators that are currently associated with
     * <br>the given action.
     * @param detailed_action_name a detailed action name, specifying an action   and target to obtain accelerators for
     * @return    accelerators for `detailed_action_name`
    */
    public ch.bailu.gtk.type.Strs getAccelsForAction(@Nonnull ch.bailu.gtk.type.Str detailed_action_name)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaApplication.INST().gtk_application_get_accels_for_action(asCPointer(), asCPointerNotNull(detailed_action_name))));
    }

    /**
     * Gets the accelerators that are currently associated with
     * <br>the given action.
     * @param detailed_action_name a detailed action name, specifying an action   and target to obtain accelerators for
     * @return    accelerators for `detailed_action_name`
    */
    public ch.bailu.gtk.type.Strs getAccelsForAction(String detailed_action_name)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaApplication.INST().gtk_application_get_accels_for_action(asCPointer(), detailed_action_name)));
    }

    /**
     * Returns the list of actions (possibly empty) that `accel` maps to.
     * <br>
     * <br>Each item in the list is a detailed action name in the usual form.
     * <br>
     * <br>This might be useful to discover if an accel already exists in
     * <br>order to prevent installation of a conflicting accelerator (from
     * <br>an accelerator editor or a plugin system, for example). Note that
     * <br>having more than one action per accelerator may not be a bad thing
     * <br>and might make sense in cases where the actions never appear in the
     * <br>same context.
     * <br>
     * <br>In case there are no actions for a given accelerator, an empty array
     * <br>is returned. `NULL` is never returned.
     * <br>
     * <br>It is a programmer error to pass an invalid accelerator string.
     * <br>
     * <br>If you are unsure, check it with [func&#64;Gtk.accelerator_parse] first.
     * @param accel an accelerator that can be parsed by [func&#64;Gtk.accelerator_parse]
     * @return a %NULL-terminated array of actions for `accel`
    */
    public ch.bailu.gtk.type.Strs getActionsForAccel(@Nonnull ch.bailu.gtk.type.Str accel)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaApplication.INST().gtk_application_get_actions_for_accel(asCPointer(), asCPointerNotNull(accel))));
    }

    /**
     * Returns the list of actions (possibly empty) that `accel` maps to.
     * <br>
     * <br>Each item in the list is a detailed action name in the usual form.
     * <br>
     * <br>This might be useful to discover if an accel already exists in
     * <br>order to prevent installation of a conflicting accelerator (from
     * <br>an accelerator editor or a plugin system, for example). Note that
     * <br>having more than one action per accelerator may not be a bad thing
     * <br>and might make sense in cases where the actions never appear in the
     * <br>same context.
     * <br>
     * <br>In case there are no actions for a given accelerator, an empty array
     * <br>is returned. `NULL` is never returned.
     * <br>
     * <br>It is a programmer error to pass an invalid accelerator string.
     * <br>
     * <br>If you are unsure, check it with [func&#64;Gtk.accelerator_parse] first.
     * @param accel an accelerator that can be parsed by [func&#64;Gtk.accelerator_parse]
     * @return a %NULL-terminated array of actions for `accel`
    */
    public ch.bailu.gtk.type.Strs getActionsForAccel(String accel)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaApplication.INST().gtk_application_get_actions_for_accel(asCPointer(), accel)));
    }

    /**
     * Gets the “active” window for the application.
     * <br>
     * <br>The active window is the one that was most recently focused (within
     * <br>the application).  This window may not have the focus at the moment
     * <br>if another application has it — this is just the most
     * <br>recently-focused window within this application.
     * @return the active window
    */
    public Window getActiveWindow()  {
        return new Window(new PointerContainer(JnaApplication.INST().gtk_application_get_active_window(asCPointer())));
    }

    /**
     * Gets a menu from automatically loaded resources.
     * <br>
     * <br>See [the section on Automatic resources](class.Application.html&#35;automatic-resources)
     * <br>for more information.
     * @param id the id of the menu to look up
     * @return Gets the menu with the   given id from the automatically loaded resources
    */
    public ch.bailu.gtk.gio.Menu getMenuById(@Nonnull ch.bailu.gtk.type.Str id)  {
        return new ch.bailu.gtk.gio.Menu(new PointerContainer(JnaApplication.INST().gtk_application_get_menu_by_id(asCPointer(), asCPointerNotNull(id))));
    }

    /**
     * Gets a menu from automatically loaded resources.
     * <br>
     * <br>See [the section on Automatic resources](class.Application.html&#35;automatic-resources)
     * <br>for more information.
     * @param id the id of the menu to look up
     * @return Gets the menu with the   given id from the automatically loaded resources
    */
    public ch.bailu.gtk.gio.Menu getMenuById(String id)  {
        return new ch.bailu.gtk.gio.Menu(new PointerContainer(JnaApplication.INST().gtk_application_get_menu_by_id(asCPointer(), id)));
    }

    /**
     * Returns the menu model that has been set with
     * <br>[method&#64;Gtk.Application.set_menubar].
     * @return the menubar for windows of `application`
    */
    public ch.bailu.gtk.gio.MenuModel getMenubar()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaApplication.INST().gtk_application_get_menubar(asCPointer())));
    }

    /**
     * Returns the [class&#64;Gtk.ApplicationWindow] with the given ID.
     * <br>
     * <br>The ID of a `GtkApplicationWindow` can be retrieved with
     * <br>[method&#64;Gtk.ApplicationWindow.get_id].
     * @param id an identifier number
     * @return the window for the given `id`
    */
    public Window getWindowById(int id)  {
        return new Window(new PointerContainer(JnaApplication.INST().gtk_application_get_window_by_id(asCPointer(), id)));
    }

    /**
     * Gets a list of the [class&#64;Gtk.Window] instances associated with `application`.
     * <br>
     * <br>The list is sorted by most recently focused window, such that the first
     * <br>element is the currently focused window. (Useful for choosing a parent
     * <br>for a transient window.)
     * <br>
     * <br>The list that is returned should not be modified in any way. It will
     * <br>only remain valid until the next focus change or window creation or
     * <br>deletion.
     * @return a `GList` of `GtkWindow`   instances
    */
    public ch.bailu.gtk.glib.List getWindows()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaApplication.INST().gtk_application_get_windows(asCPointer())));
    }

    /**
     * Inform the session manager that certain types of actions should be
     * <br>inhibited.
     * <br>
     * <br>This is not guaranteed to work on all platforms and for all types of
     * <br>actions.
     * <br>
     * <br>Applications should invoke this method when they begin an operation
     * <br>that should not be interrupted, such as creating a CD or DVD. The
     * <br>types of actions that may be blocked are specified by the `flags`
     * <br>parameter. When the application completes the operation it should
     * <br>call [method&#64;Gtk.Application.uninhibit] to remove the inhibitor. Note
     * <br>that an application can have multiple inhibitors, and all of them must
     * <br>be individually removed. Inhibitors are also cleared when the
     * <br>application exits.
     * <br>
     * <br>Applications should not expect that they will always be able to block
     * <br>the action. In most cases, users will be given the option to force
     * <br>the action to take place.
     * <br>
     * <br>The `reason` message should be short and to the point.
     * <br>
     * <br>If `window` is given, the session manager may point the user to
     * <br>this window to find out more about why the action is inhibited.
     * @param window a `GtkWindow`
     * @param flags what types of actions should be inhibited
     * @param reason a short, human-readable string that explains   why these operations are inhibited
     * @return A non-zero cookie that is used to uniquely identify this   request. It should be used as an argument to [method&#64;Gtk.Application.uninhibit]   in order to remove the request. If the platform does not support   inhibiting or the request failed for some reason, 0 is returned.
    */
    public int inhibit(@Nullable Window window, int flags, @Nullable ch.bailu.gtk.type.Str reason)  {
        return JnaApplication.INST().gtk_application_inhibit(asCPointer(), asCPointer(window), flags, asCPointer(reason));
    }

    /**
     * Inform the session manager that certain types of actions should be
     * <br>inhibited.
     * <br>
     * <br>This is not guaranteed to work on all platforms and for all types of
     * <br>actions.
     * <br>
     * <br>Applications should invoke this method when they begin an operation
     * <br>that should not be interrupted, such as creating a CD or DVD. The
     * <br>types of actions that may be blocked are specified by the `flags`
     * <br>parameter. When the application completes the operation it should
     * <br>call [method&#64;Gtk.Application.uninhibit] to remove the inhibitor. Note
     * <br>that an application can have multiple inhibitors, and all of them must
     * <br>be individually removed. Inhibitors are also cleared when the
     * <br>application exits.
     * <br>
     * <br>Applications should not expect that they will always be able to block
     * <br>the action. In most cases, users will be given the option to force
     * <br>the action to take place.
     * <br>
     * <br>The `reason` message should be short and to the point.
     * <br>
     * <br>If `window` is given, the session manager may point the user to
     * <br>this window to find out more about why the action is inhibited.
     * @param window a `GtkWindow`
     * @param flags what types of actions should be inhibited
     * @param reason a short, human-readable string that explains   why these operations are inhibited
     * @return A non-zero cookie that is used to uniquely identify this   request. It should be used as an argument to [method&#64;Gtk.Application.uninhibit]   in order to remove the request. If the platform does not support   inhibiting or the request failed for some reason, 0 is returned.
    */
    public int inhibit(@Nullable Window window, int flags, String reason)  {
        return JnaApplication.INST().gtk_application_inhibit(asCPointer(), asCPointer(window), flags, reason);
    }

    /**
     * Lists the detailed action names which have associated accelerators.
     * <br>
     * <br>See [method&#64;Gtk.Application.set_accels_for_action].
     * @return the detailed action names
    */
    public ch.bailu.gtk.type.Strs listActionDescriptions()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaApplication.INST().gtk_application_list_action_descriptions(asCPointer())));
    }

    /**
     * Remove a window from `application`.
     * <br>
     * <br>If `window` belongs to `application` then this call is equivalent to
     * <br>setting the [property&#64;Gtk.Window:application] property of `window` to
     * <br>`NULL`.
     * <br>
     * <br>The application may stop running as a result of a call to this
     * <br>function, if `window` was the last window of the `application`.
     * @param window a `GtkWindow`
    */
    public void removeWindow(@Nonnull Window window)  {
        JnaApplication.INST().gtk_application_remove_window(asCPointer(), asCPointerNotNull(window));
    }

    /**
     * Sets zero or more keyboard accelerators that will trigger the
     * <br>given action.
     * <br>
     * <br>The first item in `accels` will be the primary accelerator, which may be
     * <br>displayed in the UI.
     * <br>
     * <br>To remove all accelerators for an action, use an empty, zero-terminated
     * <br>array for `accels`.
     * <br>
     * <br>For the `detailed_action_name`, see `g_action_parse_detailed_name()` and
     * <br>`g_action_print_detailed_name()`.
     * @param detailed_action_name a detailed action name, specifying an action   and target to associate accelerators with
     * @param accels a list of accelerators in the format   understood by [func&#64;Gtk.accelerator_parse]
    */
    public void setAccelsForAction(@Nonnull ch.bailu.gtk.type.Str detailed_action_name, @Nonnull ch.bailu.gtk.type.Strs accels)  {
        JnaApplication.INST().gtk_application_set_accels_for_action(asCPointer(), asCPointerNotNull(detailed_action_name), asCPointerNotNull(accels));
    }

    /**
     * Sets zero or more keyboard accelerators that will trigger the
     * <br>given action.
     * <br>
     * <br>The first item in `accels` will be the primary accelerator, which may be
     * <br>displayed in the UI.
     * <br>
     * <br>To remove all accelerators for an action, use an empty, zero-terminated
     * <br>array for `accels`.
     * <br>
     * <br>For the `detailed_action_name`, see `g_action_parse_detailed_name()` and
     * <br>`g_action_print_detailed_name()`.
     * @param detailed_action_name a detailed action name, specifying an action   and target to associate accelerators with
     * @param accels a list of accelerators in the format   understood by [func&#64;Gtk.accelerator_parse]
    */
    public void setAccelsForAction(String detailed_action_name, @Nonnull ch.bailu.gtk.type.Strs accels)  {
        JnaApplication.INST().gtk_application_set_accels_for_action(asCPointer(), detailed_action_name, asCPointerNotNull(accels));
    }

    /**
     * Sets or unsets the menubar for windows of `application`.
     * <br>
     * <br>This is a menubar in the traditional sense.
     * <br>
     * <br>This can only be done in the primary instance of the application,
     * <br>after it has been registered. `GApplication::startup` is a good place
     * <br>to call this.
     * <br>
     * <br>Depending on the desktop environment, this may appear at the top of
     * <br>each window, or at the top of the screen.  In some environments, if
     * <br>both the application menu and the menubar are set, the application
     * <br>menu will be presented as if it were the first item of the menubar.
     * <br>Other environments treat the two as completely separate — for example,
     * <br>the application menu may be rendered by the desktop shell while the
     * <br>menubar (if set) remains in each individual window.
     * <br>
     * <br>Use the base `GActionMap` interface to add actions, to respond to the
     * <br>user selecting these menu items.
     * @param menubar a `GMenuModel`
    */
    public void setMenubar(@Nullable ch.bailu.gtk.gio.MenuModel menubar)  {
        JnaApplication.INST().gtk_application_set_menubar(asCPointer(), asCPointer(menubar));
    }

    /**
     * Removes an inhibitor that has been previously established.
     * <br>
     * <br>See [method&#64;Gtk.Application.inhibit].
     * <br>
     * <br>Inhibitors are also cleared when the application exits.
     * @param cookie a cookie that was returned by [method&#64;Gtk.Application.inhibit]
    */
    public void uninhibit(int cookie)  {
        JnaApplication.INST().gtk_application_uninhibit(asCPointer(), cookie);
    }

    public final static String SIGNAL_ON_QUERY_END = "query-end";
    
    /**
     * Connect to signal "query-end".
     * <br>See {@link OnQueryEnd#onQueryEnd} for signal description.
     * <br>Field {@link #SIGNAL_ON_QUERY_END} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onQueryEnd(OnQueryEnd signal) {
        return connectSignal(SIGNAL_ON_QUERY_END, toOnQueryEnd(signal));
    }

    public final static String SIGNAL_ON_WINDOW_ADDED = "window-added";
    
    /**
     * Connect to signal "window-added".
     * <br>See {@link OnWindowAdded#onWindowAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_WINDOW_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onWindowAdded(OnWindowAdded signal) {
        return connectSignal(SIGNAL_ON_WINDOW_ADDED, toOnWindowAdded(signal));
    }

    public final static String SIGNAL_ON_WINDOW_REMOVED = "window-removed";
    
    /**
     * Connect to signal "window-removed".
     * <br>See {@link OnWindowRemoved#onWindowRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_WINDOW_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onWindowRemoved(OnWindowRemoved signal) {
        return connectSignal(SIGNAL_ON_WINDOW_REMOVED, toOnWindowRemoved(signal));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ActionGroup}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ActionGroup}
    */
    public ch.bailu.gtk.gio.ActionGroup asActionGroup() {
        return new ch.bailu.gtk.gio.ActionGroup(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ActionMap}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ActionMap}
    */
    public ch.bailu.gtk.gio.ActionMap asActionMap() {
        return new ch.bailu.gtk.gio.ActionMap(cast());
    }

    public static long getTypeID() { 
        return JnaApplication.INST().gtk_application_get_type(); 
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
