/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkWindow` is a toplevel window which can contain other widgets.
 * <br>
 * <br>![An example GtkWindow](window.png)
 * <br>
 * <br>Windows normally have decorations that are under the control
 * <br>of the windowing system and allow the user to manipulate the window
 * <br>(resize it, move it, close it,...).
 * <br>
 * <br>&#35; GtkWindow as GtkBuildable
 * <br>
 * <br>The `GtkWindow` implementation of the [iface&#64;Gtk.Buildable] interface supports
 * <br>setting a child as the titlebar by specifying “titlebar” as the “type”
 * <br>attribute of a &lt;child&gt; element.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>window.background [.csd / .solid-csd / .ssd] [.maximized / .fullscreen / .tiled]
 * <br>├── &lt;child&gt;
 * <br>╰── &lt;titlebar child&gt;.titlebar [.default-decoration]
 * <br>```
 * <br>
 * <br>`GtkWindow` has a main CSS node with name window and style class .background.
 * <br>
 * <br>Style classes that are typically used with the main CSS node are .csd (when
 * <br>client-side decorations are in use), .solid-csd (for client-side decorations
 * <br>without invisible borders), .ssd (used by mutter when rendering server-side
 * <br>decorations). GtkWindow also represents window states with the following
 * <br>style classes on the main node: .maximized, .fullscreen, .tiled (when supported,
 * <br>also .tiled-top, .tiled-left, .tiled-right, .tiled-bottom).
 * <br>
 * <br>`GtkWindow` subclasses often add their own discriminating style classes,
 * <br>such as .dialog, .popup or .tooltip.
 * <br>
 * <br>Generally, some CSS properties don't make sense on the toplevel window node,
 * <br>such as margins or padding. When client-side decorations without invisible
 * <br>borders are in use (i.e. the .solid-csd style class is added to the
 * <br>main window node), the CSS border of the toplevel window is used for
 * <br>resize drags. In the .csd case, the shadow area outside of the window
 * <br>can be used to resize it.
 * <br>
 * <br>`GtkWindow` adds the .titlebar and .default-decoration style classes to the
 * <br>widget that is added as a titlebar child.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkWindow` uses the %GTK_ACCESSIBLE_ROLE_WINDOW role.
 * <br>
 * <br>&#35; Actions
 * <br>
 * <br>`GtkWindow` defines a set of built-in actions:
 * <br>- `default.activate`: Activate the default widget.
 * <br>- `window.minimize`: Minimize the window.
 * <br>- `window.toggle-maximized`: Maximize or restore the window.
 * <br>- `window.close`: Close the window.
 * <p><a href="https://docs.gtk.org/gtk4/class.Window.html">https://docs.gtk.org/gtk4/class.Window.html</a></p>
*/
public class Window extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Window.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateDefault {
        /**
         * Emitted when the user activates the default widget
         * <br>of &#64;window.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
        */
        void onActivateDefault();
    }
    
    private static com.sun.jna.Callback toOnActivateDefault(OnActivateDefault in) {
        return (in == null) ? null: (JnaWindow.OnActivateDefault) (__self, __data) -> in.onActivateDefault();
    }

    @FunctionalInterface
    public interface OnActivateFocus {
        /**
         * Emitted when the user activates the currently focused
         * <br>widget of &#64;window.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
        */
        void onActivateFocus();
    }
    
    private static com.sun.jna.Callback toOnActivateFocus(OnActivateFocus in) {
        return (in == null) ? null: (JnaWindow.OnActivateFocus) (__self, __data) -> in.onActivateFocus();
    }

    @FunctionalInterface
    public interface OnCloseRequest {
        /**
         * Emitted when the user clicks on the close button of the window.
         * @return %TRUE to stop other handlers from being invoked for the signal
        */
        boolean onCloseRequest();
    }
    
    private static com.sun.jna.Callback toOnCloseRequest(OnCloseRequest in) {
        return (in == null) ? null: (JnaWindow.OnCloseRequest) (__self, __data) -> in.onCloseRequest();
    }

    @FunctionalInterface
    public interface OnEnableDebugging {
        /**
         * Emitted when the user enables or disables interactive debugging.
         * <br>
         * <br>When &#64;toggle is %TRUE, interactive debugging is toggled on or off,
         * <br>when it is %FALSE, the debugger will be pointed at the widget
         * <br>under the pointer.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are Ctrl-Shift-I
         * <br>and Ctrl-Shift-D.
         * @param toggle toggle the debugger
         * @return %TRUE if the key binding was handled
        */
        boolean onEnableDebugging(boolean toggle);
    }
    
    private static com.sun.jna.Callback toOnEnableDebugging(OnEnableDebugging in) {
        return (in == null) ? null: (JnaWindow.OnEnableDebugging) (__self, _toggle, __data) -> in.onEnableDebugging(_toggle);
    }

    @FunctionalInterface
    public interface OnKeysChanged {
        /**
         * emitted when the set of accelerators or mnemonics that
         * <br>are associated with &#64;window changes.
        */
        void onKeysChanged();
    }
    
    private static com.sun.jna.Callback toOnKeysChanged(OnKeysChanged in) {
        return (in == null) ? null: (JnaWindow.OnKeysChanged) (__self, __data) -> in.onKeysChanged();
    }

    public Window(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkWindow`.
     * <br>
     * <br>To get an undecorated window (no window borders), use
     * <br>[method&#64;Gtk.Window.set_decorated].
     * <br>
     * <br>All top-level windows created by gtk_window_new() are stored
     * <br>in an internal top-level window list. This list can be obtained
     * <br>from [func&#64;Gtk.Window.list_toplevels]. Due to GTK keeping a
     * <br>reference to the window internally, gtk_window_new() does not
     * <br>return a reference to the caller.
     * <br>
     * <br>To delete a `GtkWindow`, call [method&#64;Gtk.Window.destroy].
    */
    public Window() {
        super(cast(JnaWindow.INST().gtk_window_new()));
    }

    /**
     * Requests that the window is closed.
     * <br>
     * <br>This is similar to what happens when a window manager
     * <br>close button is clicked.
     * <br>
     * <br>This function can be used with close buttons in custom
     * <br>titlebars.
    */
    public void close()  {
        JnaWindow.INST().gtk_window_close(asCPointer());
    }

    /**
     * Drop the internal reference GTK holds on toplevel windows.
    */
    public void destroy()  {
        JnaWindow.INST().gtk_window_destroy(asCPointer());
    }

    /**
     * Asks to place &#64;window in the fullscreen state.
     * <br>
     * <br>Note that you shouldn’t assume the window is definitely fullscreen
     * <br>afterward, because other entities (e.g. the user or window manager
     * <br>unfullscreen it again, and not all window managers honor requests
     * <br>to fullscreen windows.
     * <br>
     * <br>You can track the result of this operation via the
     * <br>[property&#64;Gdk.Toplevel:state] property, or by listening to
     * <br>notifications of the [property&#64;Gtk.Window:fullscreened] property.
    */
    public void fullscreen()  {
        JnaWindow.INST().gtk_window_fullscreen(asCPointer());
    }

    /**
     * Asks to place &#64;window in the fullscreen state on the given &#64;monitor.
     * <br>
     * <br>Note that you shouldn't assume the window is definitely fullscreen
     * <br>afterward, or that the windowing system allows fullscreen windows on
     * <br>any given monitor.
     * <br>
     * <br>You can track the result of this operation via the
     * <br>[property&#64;Gdk.Toplevel:state] property, or by listening to
     * <br>notifications of the [property&#64;Gtk.Window:fullscreened] property.
     * @param monitor which monitor to go fullscreen on
    */
    public void fullscreenOnMonitor(@Nonnull ch.bailu.gtk.gdk.Monitor monitor)  {
        JnaWindow.INST().gtk_window_fullscreen_on_monitor(asCPointer(), asCPointerNotNull(monitor));
    }

    /**
     * Gets the `GtkApplication` associated with the window.
     * @return a `GtkApplication`
    */
    public Application getApplication()  {
        return new Application(new PointerContainer(JnaWindow.INST().gtk_window_get_application(asCPointer())));
    }

    /**
     * Gets the child widget of &#64;window.
     * @return the child widget of &#64;window
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaWindow.INST().gtk_window_get_child(asCPointer())));
    }

    /**
     * Returns whether the window has been set to have decorations.
     * @return %TRUE if the window has been set to have decorations
    */
    public boolean getDecorated()  {
        return JnaWindow.INST().gtk_window_get_decorated(asCPointer());
    }

    /**
     * Gets the default size of the window.
     * <br>
     * <br>A value of 0 for the width or height indicates that a default
     * <br>size has not been explicitly set for that dimension, so the
     * <br>“natural” size of the window will be used.
     * @param width location to store the default width
     * @param height location to store the default height
    */
    public void getDefaultSize(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaWindow.INST().gtk_window_get_default_size(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Returns the default widget for &#64;window.
     * @return the default widget
    */
    public Widget getDefaultWidget()  {
        return new Widget(new PointerContainer(JnaWindow.INST().gtk_window_get_default_widget(asCPointer())));
    }

    /**
     * Returns whether the window has been set to have a close button.
     * @return %TRUE if the window has been set to have a close button
    */
    public boolean getDeletable()  {
        return JnaWindow.INST().gtk_window_get_deletable(asCPointer());
    }

    /**
     * Returns whether the window will be destroyed with its transient parent.
     * @return %TRUE if the window will be destroyed with its transient parent.
    */
    public boolean getDestroyWithParent()  {
        return JnaWindow.INST().gtk_window_get_destroy_with_parent(asCPointer());
    }

    /**
     * Retrieves the current focused widget within the window.
     * <br>
     * <br>Note that this is the widget that would have the focus
     * <br>if the toplevel window focused; if the toplevel window
     * <br>is not focused then `gtk_widget_has_focus (widget)` will
     * <br>not be %TRUE for the widget.
     * @return the currently focused widget
    */
    public Widget getFocus()  {
        return new Widget(new PointerContainer(JnaWindow.INST().gtk_window_get_focus(asCPointer())));
    }

    /**
     * Gets whether “focus rectangles” are supposed to be visible.
     * @return %TRUE if “focus rectangles” are supposed to be visible   in this window.
    */
    public boolean getFocusVisible()  {
        return JnaWindow.INST().gtk_window_get_focus_visible(asCPointer());
    }

    /**
     * Returns the group for &#64;window.
     * <br>
     * <br>If the window has no group, then the default group is returned.
     * @return the `GtkWindowGroup` for a window   or the default group
    */
    public WindowGroup getGroup()  {
        return new WindowGroup(new PointerContainer(JnaWindow.INST().gtk_window_get_group(asCPointer())));
    }

    /**
     * Returns whether this window reacts to F10 key presses by
     * <br>activating a menubar it contains.
     * @return %TRUE if the window handles F10
    */
    public boolean getHandleMenubarAccel()  {
        return JnaWindow.INST().gtk_window_get_handle_menubar_accel(asCPointer());
    }

    /**
     * Returns whether the window will be hidden when the close button is clicked.
     * @return %TRUE if the window will be hidden
    */
    public boolean getHideOnClose()  {
        return JnaWindow.INST().gtk_window_get_hide_on_close(asCPointer());
    }

    /**
     * Returns the name of the themed icon for the window.
     * @return the icon name
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWindow.INST().gtk_window_get_icon_name(asCPointer())));
    }

    /**
     * Gets whether mnemonics are supposed to be visible.
     * @return %TRUE if mnemonics are supposed to be visible   in this window.
    */
    public boolean getMnemonicsVisible()  {
        return JnaWindow.INST().gtk_window_get_mnemonics_visible(asCPointer());
    }

    /**
     * Returns whether the window is modal.
     * @return %TRUE if the window is set to be modal and   establishes a grab when shown
    */
    public boolean getModal()  {
        return JnaWindow.INST().gtk_window_get_modal(asCPointer());
    }

    /**
     * Gets the value set by gtk_window_set_resizable().
     * @return %TRUE if the user can resize the window
    */
    public boolean getResizable()  {
        return JnaWindow.INST().gtk_window_get_resizable(asCPointer());
    }

    /**
     * Retrieves the title of the window.
     * @return the title of the window
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWindow.INST().gtk_window_get_title(asCPointer())));
    }

    /**
     * Returns the custom titlebar that has been set with
     * <br>gtk_window_set_titlebar().
     * @return the custom titlebar
    */
    public Widget getTitlebar()  {
        return new Widget(new PointerContainer(JnaWindow.INST().gtk_window_get_titlebar(asCPointer())));
    }

    /**
     * Fetches the transient parent for this window.
     * @return the transient parent for this window
    */
    public Window getTransientFor()  {
        return new Window(new PointerContainer(JnaWindow.INST().gtk_window_get_transient_for(asCPointer())));
    }

    /**
     * Returns whether &#64;window has an explicit window group.
     * @return %TRUE if &#64;window has an explicit window group.
    */
    public boolean hasGroup()  {
        return JnaWindow.INST().gtk_window_has_group(asCPointer());
    }

    /**
     * Returns whether the window is part of the current active toplevel.
     * <br>
     * <br>The active toplevel is the window receiving keystrokes.
     * <br>
     * <br>The return value is %TRUE if the window is active toplevel itself.
     * <br>You might use this function if you wanted to draw a widget
     * <br>differently in an active window from a widget in an inactive window.
     * @return %TRUE if the window part of the current active window.
    */
    public boolean isActive()  {
        return JnaWindow.INST().gtk_window_is_active(asCPointer());
    }

    /**
     * Retrieves the current fullscreen state of &#64;window.
     * <br>
     * <br>Note that since fullscreening is ultimately handled by the window
     * <br>manager and happens asynchronously to an application request, you
     * <br>shouldn’t assume the return value of this function changing
     * <br>immediately (or at all), as an effect of calling
     * <br>[method&#64;Gtk.Window.fullscreen] or [method&#64;Gtk.Window.unfullscreen].
     * <br>
     * <br>If the window isn't yet mapped, the value returned will whether the
     * <br>initial requested state is fullscreen.
     * @return whether the window has a fullscreen state.
    */
    public boolean isFullscreen()  {
        return JnaWindow.INST().gtk_window_is_fullscreen(asCPointer());
    }

    /**
     * Retrieves the current maximized state of &#64;window.
     * <br>
     * <br>Note that since maximization is ultimately handled by the window
     * <br>manager and happens asynchronously to an application request, you
     * <br>shouldn’t assume the return value of this function changing
     * <br>immediately (or at all), as an effect of calling
     * <br>[method&#64;Gtk.Window.maximize] or [method&#64;Gtk.Window.unmaximize].
     * <br>
     * <br>If the window isn't yet mapped, the value returned will whether the
     * <br>initial requested state is maximized.
     * @return whether the window has a maximized state.
    */
    public boolean isMaximized()  {
        return JnaWindow.INST().gtk_window_is_maximized(asCPointer());
    }

    /**
     * Asks to maximize &#64;window, so that it fills the screen.
     * <br>
     * <br>Note that you shouldn’t assume the window is definitely maximized
     * <br>afterward, because other entities (e.g. the user or window manager
     * <br>could unmaximize it again, and not all window managers support
     * <br>maximization.
     * <br>
     * <br>It’s permitted to call this function before showing a window,
     * <br>in which case the window will be maximized when it appears onscreen
     * <br>initially.
     * <br>
     * <br>You can track the result of this operation via the
     * <br>[property&#64;Gdk.Toplevel:state] property, or by listening to
     * <br>notifications on the [property&#64;Gtk.Window:maximized]
     * <br>property.
    */
    public void maximize()  {
        JnaWindow.INST().gtk_window_maximize(asCPointer());
    }

    /**
     * Asks to minimize the specified &#64;window.
     * <br>
     * <br>Note that you shouldn’t assume the window is definitely minimized
     * <br>afterward, because the windowing system might not support this
     * <br>functionality; other entities (e.g. the user or the window manager
     * <br>could unminimize it again, or there may not be a window manager in
     * <br>which case minimization isn’t possible, etc.
     * <br>
     * <br>It’s permitted to call this function before showing a window,
     * <br>in which case the window will be minimized before it ever appears
     * <br>onscreen.
     * <br>
     * <br>You can track result of this operation via the
     * <br>[property&#64;Gdk.Toplevel:state] property.
    */
    public void minimize()  {
        JnaWindow.INST().gtk_window_minimize(asCPointer());
    }

    /**
     * Presents a window to the user.
     * <br>
     * <br>This function should not be used as when it is called,
     * <br>it is too late to gather a valid timestamp to allow focus
     * <br>stealing prevention to work correctly.
    */
    public void present()  {
        JnaWindow.INST().gtk_window_present(asCPointer());
    }

    /**
     * Presents a window to the user.
     * <br>
     * <br>This may mean raising the window in the stacking order,
     * <br>unminimizing it, moving it to the current desktop, and/or
     * <br>giving it the keyboard focus, possibly dependent on the user’s
     * <br>platform, window manager, and preferences.
     * <br>
     * <br>If &#64;window is hidden, this function calls [method&#64;Gtk.Widget.show]
     * <br>as well.
     * <br>
     * <br>This function should be used when the user tries to open a window
     * <br>that’s already open. Say for example the preferences dialog is
     * <br>currently open, and the user chooses Preferences from the menu
     * <br>a second time; use [method&#64;Gtk.Window.present] to move the
     * <br>already-open dialog where the user can see it.
     * <br>
     * <br>Presents a window to the user in response to a user interaction.
     * <br>The timestamp should be gathered when the window was requested
     * <br>to be shown (when clicking a link for example), rather than once
     * <br>the window is ready to be shown.
     * @param timestamp the timestamp of the user interaction (typically a   button or key press event) which triggered this call
    */
    public void presentWithTime(int timestamp)  {
        JnaWindow.INST().gtk_window_present_with_time(asCPointer(), timestamp);
    }

    /**
     * Sets or unsets the `GtkApplication` associated with the window.
     * <br>
     * <br>The application will be kept alive for at least as long as it has
     * <br>any windows associated with it (see g_application_hold() for a way
     * <br>to keep it alive without windows).
     * <br>
     * <br>Normally, the connection between the application and the window will
     * <br>remain until the window is destroyed, but you can explicitly remove
     * <br>it by setting the &#64;application to %NULL.
     * <br>
     * <br>This is equivalent to calling [method&#64;Gtk.Application.remove_window]
     * <br>and/or [method&#64;Gtk.Application.add_window] on the old/new applications
     * <br>as relevant.
     * @param application a `GtkApplication`, or %NULL to unset
    */
    public void setApplication(@Nullable Application application)  {
        JnaWindow.INST().gtk_window_set_application(asCPointer(), asCPointer(application));
    }

    /**
     * Sets the child widget of &#64;window.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaWindow.INST().gtk_window_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets whether the window should be decorated.
     * <br>
     * <br>By default, windows are decorated with a title bar, resize
     * <br>controls, etc. Some window managers allow GTK to disable these
     * <br>decorations, creating a borderless window. If you set the decorated
     * <br>property to %FALSE using this function, GTK will do its best to
     * <br>convince the window manager not to decorate the window. Depending on
     * <br>the system, this function may not have any effect when called on a
     * <br>window that is already visible, so you should call it before calling
     * <br>[method&#64;Gtk.Widget.show].
     * <br>
     * <br>On Windows, this function always works, since there’s no window manager
     * <br>policy involved.
     * @param setting %TRUE to decorate the window
    */
    public void setDecorated(boolean setting)  {
        JnaWindow.INST().gtk_window_set_decorated(asCPointer(), setting);
    }

    /**
     * Sets the default size of a window.
     * <br>
     * <br>If the window’s “natural” size (its size request) is larger than
     * <br>the default, the default will be ignored.
     * <br>
     * <br>Unlike [method&#64;Gtk.Widget.set_size_request], which sets a size
     * <br>request for a widget and thus would keep users from shrinking
     * <br>the window, this function only sets the initial size, just as
     * <br>if the user had resized the window themselves. Users can still
     * <br>shrink the window again as they normally would. Setting a default
     * <br>size of -1 means to use the “natural” default size (the size request
     * <br>of the window).
     * <br>
     * <br>The default size of a window only affects the first time a window is
     * <br>shown; if a window is hidden and re-shown, it will remember the size
     * <br>it had prior to hiding, rather than using the default size.
     * <br>
     * <br>Windows can’t actually be 0x0 in size, they must be at least 1x1, but
     * <br>passing 0 for &#64;width and &#64;height is OK, resulting in a 1x1 default size.
     * <br>
     * <br>If you use this function to reestablish a previously saved window size,
     * <br>note that the appropriate size to save is the one returned by
     * <br>[method&#64;Gtk.Window.get_default_size]. Using the window allocation
     * <br>directly will not work in all circumstances and can lead to growing
     * <br>or shrinking windows.
     * @param width width in pixels, or -1 to unset the default width
     * @param height height in pixels, or -1 to unset the default height
    */
    public void setDefaultSize(int width, int height)  {
        JnaWindow.INST().gtk_window_set_default_size(asCPointer(), width, height);
    }

    /**
     * Sets the default widget.
     * <br>
     * <br>The default widget is the widget that is activated when the user
     * <br>presses Enter in a dialog (for example).
     * @param default_widget widget to be the default   to unset the default widget for the toplevel
    */
    public void setDefaultWidget(@Nullable Widget default_widget)  {
        JnaWindow.INST().gtk_window_set_default_widget(asCPointer(), asCPointer(default_widget));
    }

    /**
     * Sets whether the window should be deletable.
     * <br>
     * <br>By default, windows have a close button in the window frame.
     * <br>Some  window managers allow GTK to disable this button. If you
     * <br>set the deletable property to %FALSE using this function, GTK
     * <br>will do its best to convince the window manager not to show a
     * <br>close button. Depending on the system, this function may not
     * <br>have any effect when called on a window that is already visible,
     * <br>so you should call it before calling [method&#64;Gtk.Widget.show].
     * <br>
     * <br>On Windows, this function always works, since there’s no window
     * <br>manager policy involved.
     * @param setting %TRUE to decorate the window as deletable
    */
    public void setDeletable(boolean setting)  {
        JnaWindow.INST().gtk_window_set_deletable(asCPointer(), setting);
    }

    /**
     * If &#64;setting is %TRUE, then destroying the transient parent of &#64;window
     * <br>will also destroy &#64;window itself.
     * <br>
     * <br>This is useful for dialogs that shouldn’t persist beyond the lifetime
     * <br>of the main window they are associated with, for example.
     * @param setting whether to destroy &#64;window with its transient parent
    */
    public void setDestroyWithParent(boolean setting)  {
        JnaWindow.INST().gtk_window_set_destroy_with_parent(asCPointer(), setting);
    }

    /**
     * Sets the `GdkDisplay` where the &#64;window is displayed.
     * <br>
     * <br>If the window is already mapped, it will be unmapped,
     * <br>and then remapped on the new display.
     * @param display a `GdkDisplay`
    */
    public void setDisplay(@Nonnull ch.bailu.gtk.gdk.Display display)  {
        JnaWindow.INST().gtk_window_set_display(asCPointer(), asCPointerNotNull(display));
    }

    /**
     * Sets the focus widget.
     * <br>
     * <br>If &#64;focus is not the current focus widget, and is focusable,
     * <br>sets it as the focus widget for the window. If &#64;focus is %NULL,
     * <br>unsets the focus widget for this window. To set the focus to a
     * <br>particular widget in the toplevel, it is usually more convenient
     * <br>to use [method&#64;Gtk.Widget.grab_focus] instead of this function.
     * @param focus widget to be the new focus widget, or %NULL to unset   any focus widget for the toplevel window.
    */
    public void setFocus(@Nullable Widget focus)  {
        JnaWindow.INST().gtk_window_set_focus(asCPointer(), asCPointer(focus));
    }

    /**
     * Sets whether “focus rectangles” are supposed to be visible.
     * @param setting the new value
    */
    public void setFocusVisible(boolean setting)  {
        JnaWindow.INST().gtk_window_set_focus_visible(asCPointer(), setting);
    }

    /**
     * Sets whether this window should react to F10 key presses
     * <br>by activating a menubar it contains.
     * @param handle_menubar_accel %TRUE to make &#64;window handle F10
    */
    public void setHandleMenubarAccel(boolean handle_menubar_accel)  {
        JnaWindow.INST().gtk_window_set_handle_menubar_accel(asCPointer(), handle_menubar_accel);
    }

    /**
     * If &#64;setting is %TRUE, then clicking the close button on the window
     * <br>will not destroy it, but only hide it.
     * @param setting whether to hide the window when it is closed
    */
    public void setHideOnClose(boolean setting)  {
        JnaWindow.INST().gtk_window_set_hide_on_close(asCPointer(), setting);
    }

    /**
     * Sets the icon for the window from a named themed icon.
     * <br>
     * <br>See the docs for [class&#64;Gtk.IconTheme] for more details.
     * <br>On some platforms, the window icon is not used at all.
     * <br>
     * <br>Note that this has nothing to do with the WM_ICON_NAME
     * <br>property which is mentioned in the ICCCM.
     * @param name the name of the themed icon
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaWindow.INST().gtk_window_set_icon_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets the icon for the window from a named themed icon.
     * <br>
     * <br>See the docs for [class&#64;Gtk.IconTheme] for more details.
     * <br>On some platforms, the window icon is not used at all.
     * <br>
     * <br>Note that this has nothing to do with the WM_ICON_NAME
     * <br>property which is mentioned in the ICCCM.
     * @param name the name of the themed icon
    */
    public void setIconName(String name)  {
        JnaWindow.INST().gtk_window_set_icon_name(asCPointer(), name);
    }

    /**
     * Sets whether mnemonics are supposed to be visible.
     * @param setting the new value
    */
    public void setMnemonicsVisible(boolean setting)  {
        JnaWindow.INST().gtk_window_set_mnemonics_visible(asCPointer(), setting);
    }

    /**
     * Sets a window modal or non-modal.
     * <br>
     * <br>Modal windows prevent interaction with other windows in the same
     * <br>application. To keep modal dialogs on top of main application windows,
     * <br>use [method&#64;Gtk.Window.set_transient_for] to make the dialog transient
     * <br>for the parent; most window managers will then disallow lowering the
     * <br>dialog below the parent.
     * @param modal whether the window is modal
    */
    public void setModal(boolean modal)  {
        JnaWindow.INST().gtk_window_set_modal(asCPointer(), modal);
    }

    /**
     * Sets whether the user can resize a window.
     * <br>
     * <br>Windows are user resizable by default.
     * @param resizable %TRUE if the user can resize this window
    */
    public void setResizable(boolean resizable)  {
        JnaWindow.INST().gtk_window_set_resizable(asCPointer(), resizable);
    }

    /**
     * Sets the startup notification ID.
     * <br>
     * <br>Startup notification identifiers are used by desktop environment
     * <br>to track application startup, to provide user feedback and other
     * <br>features. This function changes the corresponding property on the
     * <br>underlying `GdkSurface`.
     * <br>
     * <br>Normally, startup identifier is managed automatically and you should
     * <br>only use this function in special cases like transferring focus from
     * <br>other processes. You should use this function before calling
     * <br>[method&#64;Gtk.Window.present] or any equivalent function generating
     * <br>a window map event.
     * <br>
     * <br>This function is only useful on X11, not with other GTK targets.
     * @param startup_id a string with startup-notification identifier
    */
    public void setStartupId(@Nonnull ch.bailu.gtk.type.Str startup_id)  {
        JnaWindow.INST().gtk_window_set_startup_id(asCPointer(), asCPointerNotNull(startup_id));
    }

    /**
     * Sets the startup notification ID.
     * <br>
     * <br>Startup notification identifiers are used by desktop environment
     * <br>to track application startup, to provide user feedback and other
     * <br>features. This function changes the corresponding property on the
     * <br>underlying `GdkSurface`.
     * <br>
     * <br>Normally, startup identifier is managed automatically and you should
     * <br>only use this function in special cases like transferring focus from
     * <br>other processes. You should use this function before calling
     * <br>[method&#64;Gtk.Window.present] or any equivalent function generating
     * <br>a window map event.
     * <br>
     * <br>This function is only useful on X11, not with other GTK targets.
     * @param startup_id a string with startup-notification identifier
    */
    public void setStartupId(String startup_id)  {
        JnaWindow.INST().gtk_window_set_startup_id(asCPointer(), startup_id);
    }

    /**
     * Sets the title of the `GtkWindow`.
     * <br>
     * <br>The title of a window will be displayed in its title bar; on the
     * <br>X Window System, the title bar is rendered by the window manager
     * <br>so exactly how the title appears to users may vary according to a
     * <br>user’s exact configuration. The title should help a user distinguish
     * <br>this window from other windows they may have open. A good title might
     * <br>include the application name and current document filename, for example.
     * <br>
     * <br>Passing %NULL does the same as setting the title to an empty string.
     * @param title title of the window
    */
    public void setTitle(@Nullable ch.bailu.gtk.type.Str title)  {
        JnaWindow.INST().gtk_window_set_title(asCPointer(), asCPointer(title));
    }

    /**
     * Sets the title of the `GtkWindow`.
     * <br>
     * <br>The title of a window will be displayed in its title bar; on the
     * <br>X Window System, the title bar is rendered by the window manager
     * <br>so exactly how the title appears to users may vary according to a
     * <br>user’s exact configuration. The title should help a user distinguish
     * <br>this window from other windows they may have open. A good title might
     * <br>include the application name and current document filename, for example.
     * <br>
     * <br>Passing %NULL does the same as setting the title to an empty string.
     * @param title title of the window
    */
    public void setTitle(String title)  {
        JnaWindow.INST().gtk_window_set_title(asCPointer(), title);
    }

    /**
     * Sets a custom titlebar for &#64;window.
     * <br>
     * <br>A typical widget used here is [class&#64;Gtk.HeaderBar], as it
     * <br>provides various features expected of a titlebar while allowing
     * <br>the addition of child widgets to it.
     * <br>
     * <br>If you set a custom titlebar, GTK will do its best to convince
     * <br>the window manager not to put its own titlebar on the window.
     * <br>Depending on the system, this function may not work for a window
     * <br>that is already visible, so you set the titlebar before calling
     * <br>[method&#64;Gtk.Widget.show].
     * @param titlebar the widget to use as titlebar
    */
    public void setTitlebar(@Nullable Widget titlebar)  {
        JnaWindow.INST().gtk_window_set_titlebar(asCPointer(), asCPointer(titlebar));
    }

    /**
     * Dialog windows should be set transient for the main application
     * <br>window they were spawned from. This allows window managers to e.g.
     * <br>keep the dialog on top of the main window, or center the dialog
     * <br>over the main window. [ctor&#64;Gtk.Dialog.new_with_buttons] and other
     * <br>convenience functions in GTK will sometimes call
     * <br>gtk_window_set_transient_for() on your behalf.
     * <br>
     * <br>Passing %NULL for &#64;parent unsets the current transient window.
     * <br>
     * <br>On Windows, this function puts the child window on top of the parent,
     * <br>much as the window manager would have done on X.
     * @param parent parent window
    */
    public void setTransientFor(@Nullable Window parent)  {
        JnaWindow.INST().gtk_window_set_transient_for(asCPointer(), asCPointer(parent));
    }

    /**
     * Asks to remove the fullscreen state for &#64;window, and return to
     * <br>its previous state.
     * <br>
     * <br>Note that you shouldn’t assume the window is definitely not
     * <br>fullscreen afterward, because other entities (e.g. the user or
     * <br>window manager could fullscreen it again, and not all window
     * <br>managers honor requests to unfullscreen windows; normally the
     * <br>window will end up restored to its normal state. Just don’t
     * <br>write code that crashes if not.
     * <br>
     * <br>You can track the result of this operation via the
     * <br>[property&#64;Gdk.Toplevel:state] property, or by listening to
     * <br>notifications of the [property&#64;Gtk.Window:fullscreened] property.
    */
    public void unfullscreen()  {
        JnaWindow.INST().gtk_window_unfullscreen(asCPointer());
    }

    /**
     * Asks to unmaximize &#64;window.
     * <br>
     * <br>Note that you shouldn’t assume the window is definitely unmaximized
     * <br>afterward, because other entities (e.g. the user or window manager
     * <br>maximize it again, and not all window managers honor requests to
     * <br>unmaximize.
     * <br>
     * <br>You can track the result of this operation via the
     * <br>[property&#64;Gdk.Toplevel:state] property, or by listening to
     * <br>notifications on the [property&#64;Gtk.Window:maximized] property.
    */
    public void unmaximize()  {
        JnaWindow.INST().gtk_window_unmaximize(asCPointer());
    }

    /**
     * Asks to unminimize the specified &#64;window.
     * <br>
     * <br>Note that you shouldn’t assume the window is definitely unminimized
     * <br>afterward, because the windowing system might not support this
     * <br>functionality; other entities (e.g. the user or the window manager
     * <br>could minimize it again, or there may not be a window manager in
     * <br>which case minimization isn’t possible, etc.
     * <br>
     * <br>You can track result of this operation via the
     * <br>[property&#64;Gdk.Toplevel:state] property.
    */
    public void unminimize()  {
        JnaWindow.INST().gtk_window_unminimize(asCPointer());
    }

    public final static String SIGNAL_ON_ACTIVATE_DEFAULT = "activate-default";
    
    /**
     * Connect to signal "activate-default".
     * <br>See {@link OnActivateDefault#onActivateDefault} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_DEFAULT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateDefault(OnActivateDefault signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_DEFAULT, toOnActivateDefault(signal));
    }

    public final static String SIGNAL_ON_ACTIVATE_FOCUS = "activate-focus";
    
    /**
     * Connect to signal "activate-focus".
     * <br>See {@link OnActivateFocus#onActivateFocus} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_FOCUS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateFocus(OnActivateFocus signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_FOCUS, toOnActivateFocus(signal));
    }

    public final static String SIGNAL_ON_CLOSE_REQUEST = "close-request";
    
    /**
     * Connect to signal "close-request".
     * <br>See {@link OnCloseRequest#onCloseRequest} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSE_REQUEST} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCloseRequest(OnCloseRequest signal) {
        return connectSignal(SIGNAL_ON_CLOSE_REQUEST, toOnCloseRequest(signal));
    }

    public final static String SIGNAL_ON_ENABLE_DEBUGGING = "enable-debugging";
    
    /**
     * Connect to signal "enable-debugging".
     * <br>See {@link OnEnableDebugging#onEnableDebugging} for signal description.
     * <br>Field {@link #SIGNAL_ON_ENABLE_DEBUGGING} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEnableDebugging(OnEnableDebugging signal) {
        return connectSignal(SIGNAL_ON_ENABLE_DEBUGGING, toOnEnableDebugging(signal));
    }

    public final static String SIGNAL_ON_KEYS_CHANGED = "keys-changed";
    
    /**
     * Connect to signal "keys-changed".
     * <br>See {@link OnKeysChanged#onKeysChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_KEYS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onKeysChanged(OnKeysChanged signal) {
        return connectSignal(SIGNAL_ON_KEYS_CHANGED, toOnKeysChanged(signal));
    }

    /**
     * Returns the fallback icon name for windows.
     * <br>
     * <br>The returned string is owned by GTK and should not
     * <br>be modified. It is only valid until the next call to
     * <br>[func&#64;Gtk.Window.set_default_icon_name].
     * @return the fallback icon name for windows
    */
    public static ch.bailu.gtk.type.Str getDefaultIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWindow.INST().gtk_window_get_default_icon_name()));
    }

    /**
     * Returns a list of all existing toplevel windows.
     * <br>
     * <br>If you want to iterate through the list and perform actions involving
     * <br>callbacks that might destroy the widgets or add new ones, be aware that
     * <br>the list of toplevels will change and emit the &quot;items-changed&quot; signal.
     * @return the list   of toplevel widgets
    */
    public static ch.bailu.gtk.gio.ListModel getToplevels()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaWindow.INST().gtk_window_get_toplevels()));
    }

    /**
     * Returns a list of all existing toplevel windows.
     * <br>
     * <br>The widgets in the list are not individually referenced.
     * <br>If you want to iterate through the list and perform actions
     * <br>involving callbacks that might destroy the widgets, you must
     * <br>call `g_list_foreach (result, (GFunc)g_object_ref, NULL)` first,
     * <br>and then unref all the widgets afterwards.
     * @return list of   toplevel widgets
    */
    public static ch.bailu.gtk.glib.List listToplevels()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaWindow.INST().gtk_window_list_toplevels()));
    }

    /**
     * Sets whether the window should request startup notification.
     * <br>
     * <br>By default, after showing the first `GtkWindow`, GTK calls
     * <br>[method&#64;Gdk.Display.notify_startup_complete]. Call this function
     * <br>to disable the automatic startup notification. You might do this
     * <br>if your first window is a splash screen, and you want to delay
     * <br>notification until after your real main window has been shown,
     * <br>for example.
     * <br>
     * <br>In that example, you would disable startup notification
     * <br>temporarily, show your splash screen, then re-enable it so that
     * <br>showing the main window would automatically result in notification.
     * @param setting %TRUE to automatically do startup notification
    */
    public static void setAutoStartupNotification(boolean setting)  {
        JnaWindow.INST().gtk_window_set_auto_startup_notification(setting);
    }

    /**
     * Sets an icon to be used as fallback.
     * <br>
     * <br>The fallback icon is used for windows that
     * <br>haven't had [method&#64;Gtk.Window.set_icon_name]
     * <br>called on them.
     * @param name the name of the themed icon
    */
    public static void setDefaultIconName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaWindow.INST().gtk_window_set_default_icon_name(asCPointerNotNull(name));
    }

    /**
     * Opens or closes the [interactive debugger](running.html&#35;interactive-debugging).
     * <br>
     * <br>The debugger offers access to the widget hierarchy of the application
     * <br>and to useful debugging tools.
     * @param enable %TRUE to enable interactive debugging
    */
    public static void setInteractiveDebugging(boolean enable)  {
        JnaWindow.INST().gtk_window_set_interactive_debugging(enable);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaWindow.INST().gtk_window_get_type(); 
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
