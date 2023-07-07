/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkToplevel` is a freestanding toplevel surface.
 * <br>
 * <br>The `GdkToplevel` interface provides useful APIs for interacting with
 * <br>the windowing system, such as controlling maximization and size of the
 * <br>surface, setting icons and transient parents for dialogs.
 * <p><a href="https://docs.gtk.org/gdk4/iface.Toplevel.html">https://docs.gtk.org/gdk4/iface.Toplevel.html</a></p>
*/
public class Toplevel extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Toplevel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnComputeSize {
        /**
         * Emitted when the size for the surface needs to be computed, when
         * <br>it is present.
         * <br>
         * <br>It will normally be emitted during or after [method&#64;Gdk.Toplevel.present],
         * <br>depending on the configuration received by the windowing system.
         * <br>It may also be emitted at any other point in time, in response
         * <br>to the windowing system spontaneously changing the configuration.
         * <br>
         * <br>It is the responsibility of the toplevel user to handle this signal
         * <br>and compute the desired size of the toplevel, given the information
         * <br>passed via the [struct&#64;Gdk.ToplevelSize] object. Failing to do so
         * <br>will result in an arbitrary size being used as a result.
         * @param size a `GdkToplevelSize`
        */
        void onComputeSize(@Nonnull ToplevelSize size);
    }
    
    private static com.sun.jna.Callback toOnComputeSize(OnComputeSize in) {
        return (in == null) ? null: (JnaToplevel.OnComputeSize) (__self, _size, __data) -> in.onComputeSize(new ToplevelSize(new PointerContainer(_size)));
    }

    public Toplevel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Begins an interactive move operation.
     * <br>
     * <br>You might use this function to implement draggable titlebars.
     * @param device the device used for the operation
     * @param button the button being used to drag, or 0 for a keyboard-initiated drag
     * @param x surface X coordinate of mouse click that began the drag
     * @param y surface Y coordinate of mouse click that began the drag
     * @param timestamp timestamp of mouse click that began the drag (use   [method&#64;Gdk.Event.get_time])
    */
    public void beginMove(@Nonnull Device device, int button, double x, double y, int timestamp)  {
        JnaToplevel.INST().gdk_toplevel_begin_move(asCPointer(), asCPointerNotNull(device), button, x, y, timestamp);
    }

    /**
     * Begins an interactive resize operation.
     * <br>
     * <br>You might use this function to implement a “window resize grip.”
     * @param edge the edge or corner from which the drag is started
     * @param device the device used for the operation
     * @param button the button being used to drag, or 0 for a keyboard-initiated drag
     * @param x surface X coordinate of mouse click that began the drag
     * @param y surface Y coordinate of mouse click that began the drag
     * @param timestamp timestamp of mouse click that began the drag (use   [method&#64;Gdk.Event.get_time])
    */
    public void beginResize(int edge, @Nullable Device device, int button, double x, double y, int timestamp)  {
        JnaToplevel.INST().gdk_toplevel_begin_resize(asCPointer(), edge, asCPointer(device), button, x, y, timestamp);
    }

    /**
     * Sets keyboard focus to &#64;surface.
     * <br>
     * <br>In most cases, [method&#64;Gtk.Window.present_with_time] should be
     * <br>used on a [class&#64;Gtk.Window], rather than calling this function.
     * @param timestamp timestamp of the event triggering the surface focus
    */
    public void focus(int timestamp)  {
        JnaToplevel.INST().gdk_toplevel_focus(asCPointer(), timestamp);
    }

    /**
     * Gets the bitwise or of the currently active surface state flags,
     * <br>from the `GdkToplevelState` enumeration.
     * @return surface state bitfield
    */
    public int getState()  {
        return JnaToplevel.INST().gdk_toplevel_get_state(asCPointer());
    }

    /**
     * Requests that the &#64;toplevel inhibit the system shortcuts.
     * <br>
     * <br>This is asking the desktop environment/windowing system to let all
     * <br>keyboard events reach the surface, as long as it is focused, instead
     * <br>of triggering system actions.
     * <br>
     * <br>If granted, the rerouting remains active until the default shortcuts
     * <br>processing is restored with [method&#64;Gdk.Toplevel.restore_system_shortcuts],
     * <br>or the request is revoked by the desktop environment, windowing system
     * <br>or the user.
     * <br>
     * <br>A typical use case for this API is remote desktop or virtual machine
     * <br>viewers which need to inhibit the default system keyboard shortcuts
     * <br>so that the remote session or virtual host gets those instead of the
     * <br>local environment.
     * <br>
     * <br>The windowing system or desktop environment may ask the user to grant
     * <br>or deny the request or even choose to ignore the request entirely.
     * <br>
     * <br>The caller can be notified whenever the request is granted or revoked
     * <br>by listening to the [property&#64;Gdk.Toplevel:shortcuts-inhibited] property.
     * @param event the `GdkEvent` that is triggering the inhibit   request, or %NULL if none is available
    */
    public void inhibitSystemShortcuts(@Nullable Event event)  {
        JnaToplevel.INST().gdk_toplevel_inhibit_system_shortcuts(asCPointer(), asCPointer(event));
    }

    /**
     * Asks to lower the &#64;toplevel below other windows.
     * <br>
     * <br>The windowing system may choose to ignore the request.
     * @return %TRUE if the surface was lowered
    */
    public boolean lower()  {
        return JnaToplevel.INST().gdk_toplevel_lower(asCPointer());
    }

    /**
     * Asks to minimize the &#64;toplevel.
     * <br>
     * <br>The windowing system may choose to ignore the request.
     * @return %TRUE if the surface was minimized
    */
    public boolean minimize()  {
        return JnaToplevel.INST().gdk_toplevel_minimize(asCPointer());
    }

    /**
     * Present &#64;toplevel after having processed the `GdkToplevelLayout` rules.
     * <br>
     * <br>If the toplevel was previously not showing, it will be showed,
     * <br>otherwise it will change layout according to &#64;layout.
     * <br>
     * <br>GDK may emit the [signal&#64;Gdk.Toplevel::compute-size] signal to let
     * <br>the user of this toplevel compute the preferred size of the toplevel
     * <br>surface.
     * <br>
     * <br>Presenting is asynchronous and the specified layout parameters are not
     * <br>guaranteed to be respected.
     * @param layout the `GdkToplevelLayout` object used to layout
    */
    public void present(@Nonnull ToplevelLayout layout)  {
        JnaToplevel.INST().gdk_toplevel_present(asCPointer(), asCPointerNotNull(layout));
    }

    /**
     * Restore default system keyboard shortcuts which were previously
     * <br>inhibited.
     * <br>
     * <br>This undoes the effect of [method&#64;Gdk.Toplevel.inhibit_system_shortcuts].
    */
    public void restoreSystemShortcuts()  {
        JnaToplevel.INST().gdk_toplevel_restore_system_shortcuts(asCPointer());
    }

    /**
     * Sets the toplevel to be decorated.
     * <br>
     * <br>Setting &#64;decorated to %FALSE hints the desktop environment
     * <br>that the surface has its own, client-side decorations and
     * <br>does not need to have window decorations added.
     * @param decorated %TRUE to request decorations
    */
    public void setDecorated(boolean decorated)  {
        JnaToplevel.INST().gdk_toplevel_set_decorated(asCPointer(), decorated);
    }

    /**
     * Sets the toplevel to be deletable.
     * <br>
     * <br>Setting &#64;deletable to %TRUE hints the desktop environment
     * <br>that it should offer the user a way to close the surface.
     * @param deletable %TRUE to request a delete button
    */
    public void setDeletable(boolean deletable)  {
        JnaToplevel.INST().gdk_toplevel_set_deletable(asCPointer(), deletable);
    }

    /**
     * Sets a list of icons for the surface.
     * <br>
     * <br>One of these will be used to represent the surface in iconic form.
     * <br>The icon may be shown in window lists or task bars. Which icon
     * <br>size is shown depends on the window manager. The window manager
     * <br>can scale the icon but setting several size icons can give better
     * <br>image quality.
     * <br>
     * <br>Note that some platforms don't support surface icons.
     * @param surfaces    A list of textures to use as icon, of different sizes
    */
    public void setIconList(@Nonnull ch.bailu.gtk.glib.List surfaces)  {
        JnaToplevel.INST().gdk_toplevel_set_icon_list(asCPointer(), asCPointerNotNull(surfaces));
    }

    /**
     * Sets the toplevel to be modal.
     * <br>
     * <br>The application can use this hint to tell the
     * <br>window manager that a certain surface has modal
     * <br>behaviour. The window manager can use this information
     * <br>to handle modal surfaces in a special way.
     * <br>
     * <br>You should only use this on surfaces for which you have
     * <br>previously called [method&#64;Gdk.Toplevel.set_transient_for].
     * @param modal %TRUE if the surface is modal, %FALSE otherwise.
    */
    public void setModal(boolean modal)  {
        JnaToplevel.INST().gdk_toplevel_set_modal(asCPointer(), modal);
    }

    /**
     * Sets the startup notification ID.
     * <br>
     * <br>When using GTK, typically you should use
     * <br>[method&#64;Gtk.Window.set_startup_id] instead of this
     * <br>low-level function.
     * @param startup_id a string with startup-notification identifier
    */
    public void setStartupId(@Nonnull ch.bailu.gtk.type.Str startup_id)  {
        JnaToplevel.INST().gdk_toplevel_set_startup_id(asCPointer(), asCPointerNotNull(startup_id));
    }

    /**
     * Sets the startup notification ID.
     * <br>
     * <br>When using GTK, typically you should use
     * <br>[method&#64;Gtk.Window.set_startup_id] instead of this
     * <br>low-level function.
     * @param startup_id a string with startup-notification identifier
    */
    public void setStartupId(String startup_id)  {
        JnaToplevel.INST().gdk_toplevel_set_startup_id(asCPointer(), startup_id);
    }

    /**
     * Sets the title of a toplevel surface.
     * <br>
     * <br>The title maybe be displayed in the titlebar,
     * <br>in lists of windows, etc.
     * @param title title of &#64;surface
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaToplevel.INST().gdk_toplevel_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of a toplevel surface.
     * <br>
     * <br>The title maybe be displayed in the titlebar,
     * <br>in lists of windows, etc.
     * @param title title of &#64;surface
    */
    public void setTitle(String title)  {
        JnaToplevel.INST().gdk_toplevel_set_title(asCPointer(), title);
    }

    /**
     * Sets a transient-for parent.
     * <br>
     * <br>Indicates to the window manager that &#64;surface is a transient
     * <br>dialog associated with the application surface &#64;parent. This
     * <br>allows the window manager to do things like center &#64;surface
     * <br>on &#64;parent and keep &#64;surface above &#64;parent.
     * <br>
     * <br>See [method&#64;Gtk.Window.set_transient_for] if you’re using
     * <br>[class&#64;Gtk.Window] or [class&#64;Gtk.Dialog].
     * @param parent another toplevel `GdkSurface`
    */
    public void setTransientFor(@Nonnull Surface parent)  {
        JnaToplevel.INST().gdk_toplevel_set_transient_for(asCPointer(), asCPointerNotNull(parent));
    }

    /**
     * Asks the windowing system to show the window menu.
     * <br>
     * <br>The window menu is the menu shown when right-clicking the titlebar
     * <br>on traditional windows managed by the window manager. This is useful
     * <br>for windows using client-side decorations, activating it with a
     * <br>right-click on the window decorations.
     * @param event a `GdkEvent` to show the menu for
     * @return %TRUE if the window menu was shown and %FALSE otherwise.
    */
    public boolean showWindowMenu(@Nonnull Event event)  {
        return JnaToplevel.INST().gdk_toplevel_show_window_menu(asCPointer(), asCPointerNotNull(event));
    }

    /**
     * Returns whether the desktop environment supports
     * <br>tiled window states.
     * @return %TRUE if the desktop environment supports tiled window states
    */
    public boolean supportsEdgeConstraints()  {
        return JnaToplevel.INST().gdk_toplevel_supports_edge_constraints(asCPointer());
    }

    /**
     * 
     * @param gesture a `GdkTitlebarGesture`
     * @return 
    */
    public boolean titlebarGesture(int gesture)  {
        return JnaToplevel.INST().gdk_toplevel_titlebar_gesture(asCPointer(), gesture);
    }

    public final static String SIGNAL_ON_COMPUTE_SIZE = "compute-size";
    
    /**
     * Connect to signal "compute-size".
     * <br>See {@link OnComputeSize#onComputeSize} for signal description.
     * <br>Field {@link #SIGNAL_ON_COMPUTE_SIZE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onComputeSize(OnComputeSize signal) {
        return connectSignal(SIGNAL_ON_COMPUTE_SIZE, toOnComputeSize(signal));
    }

    public static long getTypeID() { 
        return JnaToplevel.INST().gdk_toplevel_get_type(); 
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
