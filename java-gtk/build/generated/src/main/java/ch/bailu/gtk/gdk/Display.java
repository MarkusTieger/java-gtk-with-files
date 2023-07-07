/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkDisplay` objects are the GDK representation of a workstation.
 * <br>
 * <br>Their purpose are two-fold:
 * <br>
 * <br>- To manage and provide information about input devices (pointers, keyboards, etc)
 * <br>- To manage and provide information about output devices (monitors, projectors, etc)
 * <br>
 * <br>Most of the input device handling has been factored out into separate
 * <br>[class&#64;Gdk.Seat] objects. Every display has a one or more seats, which
 * <br>can be accessed with [method&#64;Gdk.Display.get_default_seat] and
 * <br>[method&#64;Gdk.Display.list_seats].
 * <br>
 * <br>Output devices are represented by [class&#64;Gdk.Monitor] objects, which can
 * <br>be accessed with [method&#64;Gdk.Display.get_monitor_at_surface] and similar APIs.
 * <p><a href="https://docs.gtk.org/gdk4/class.Display.html">https://docs.gtk.org/gdk4/class.Display.html</a></p>
*/
public class Display extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Display.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClosed {
        /**
         * Emitted when the connection to the windowing system for &#64;display is closed.
         * @param is_error %TRUE if the display was closed due to an error
        */
        void onClosed(boolean is_error);
    }
    
    private static com.sun.jna.Callback toOnClosed(OnClosed in) {
        return (in == null) ? null: (JnaDisplay.OnClosed) (__self, _is_error, __data) -> in.onClosed(_is_error);
    }

    @FunctionalInterface
    public interface OnOpened {
        /**
         * Emitted when the connection to the windowing system for &#64;display is opened.
        */
        void onOpened();
    }
    
    private static com.sun.jna.Callback toOnOpened(OnOpened in) {
        return (in == null) ? null: (JnaDisplay.OnOpened) (__self, __data) -> in.onOpened();
    }

    @FunctionalInterface
    public interface OnSeatAdded {
        /**
         * Emitted whenever a new seat is made known to the windowing system.
         * @param seat the seat that was just added
        */
        void onSeatAdded(@Nonnull Seat seat);
    }
    
    private static com.sun.jna.Callback toOnSeatAdded(OnSeatAdded in) {
        return (in == null) ? null: (JnaDisplay.OnSeatAdded) (__self, _seat, __data) -> in.onSeatAdded(new Seat(new PointerContainer(_seat)));
    }

    @FunctionalInterface
    public interface OnSeatRemoved {
        /**
         * Emitted whenever a seat is removed by the windowing system.
         * @param seat the seat that was just removed
        */
        void onSeatRemoved(@Nonnull Seat seat);
    }
    
    private static com.sun.jna.Callback toOnSeatRemoved(OnSeatRemoved in) {
        return (in == null) ? null: (JnaDisplay.OnSeatRemoved) (__self, _seat, __data) -> in.onSeatRemoved(new Seat(new PointerContainer(_seat)));
    }

    @FunctionalInterface
    public interface OnSettingChanged {
        /**
         * Emitted whenever a setting changes its value.
         * @param setting the name of the setting that changed
        */
        void onSettingChanged(@Nonnull ch.bailu.gtk.type.Str setting);
    }
    
    private static com.sun.jna.Callback toOnSettingChanged(OnSettingChanged in) {
        return (in == null) ? null: (JnaDisplay.OnSettingChanged) (__self, _setting, __data) -> in.onSettingChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_setting)));
    }

    public Display(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Emits a short beep on &#64;display
    */
    public void beep()  {
        JnaDisplay.INST().gdk_display_beep(asCPointer());
    }

    /**
     * Closes the connection to the windowing system for the given display.
     * <br>
     * <br>This cleans up associated resources.
    */
    public void close()  {
        JnaDisplay.INST().gdk_display_close(asCPointer());
    }

    /**
     * Creates a new `GdkGLContext` for the `GdkDisplay`.
     * <br>
     * <br>The context is disconnected from any particular surface or surface
     * <br>and cannot be used to draw to any surface. It can only be used to
     * <br>draw to non-surface framebuffers like textures.
     * <br>
     * <br>If the creation of the `GdkGLContext` failed, &#64;error will be set.
     * <br>Before using the returned `GdkGLContext`, you will need to
     * <br>call [method&#64;Gdk.GLContext.make_current] or [method&#64;Gdk.GLContext.realize].
     * @return the newly created `GdkGLContext`
    */
    public GLContext createGlContext() throws ch.bailu.gtk.type.exception.AllocationError {
        return new GLContext(new PointerContainer(JnaDisplay.INST().gdk_display_create_gl_context(asCPointer(), 0L)));
    }

    /**
     * Returns %TRUE if there is an ongoing grab on &#64;device for &#64;display.
     * @param device a `GdkDevice`
     * @return %TRUE if there is a grab in effect for &#64;device.
    */
    public boolean deviceIsGrabbed(@Nonnull Device device)  {
        return JnaDisplay.INST().gdk_display_device_is_grabbed(asCPointer(), asCPointerNotNull(device));
    }

    /**
     * Flushes any requests queued for the windowing system.
     * <br>
     * <br>This happens automatically when the main loop blocks waiting for new events,
     * <br>but if your application is drawing without returning control to the main loop,
     * <br>you may need to call this function explicitly. A common case where this function
     * <br>needs to be called is when an application is executing drawing commands
     * <br>from a thread other than the thread where the main loop is running.
     * <br>
     * <br>This is most useful for X11. On windowing systems where requests are
     * <br>handled synchronously, this function will do nothing.
    */
    public void flush()  {
        JnaDisplay.INST().gdk_display_flush(asCPointer());
    }

    /**
     * Returns a `GdkAppLaunchContext` suitable for launching
     * <br>applications on the given display.
     * @return a new `GdkAppLaunchContext` for &#64;display
    */
    public AppLaunchContext getAppLaunchContext()  {
        return new AppLaunchContext(new PointerContainer(JnaDisplay.INST().gdk_display_get_app_launch_context(asCPointer())));
    }

    /**
     * Gets the clipboard used for copy/paste operations.
     * @return the display's clipboard
    */
    public Clipboard getClipboard()  {
        return new Clipboard(new PointerContainer(JnaDisplay.INST().gdk_display_get_clipboard(asCPointer())));
    }

    /**
     * Returns the default `GdkSeat` for this display.
     * <br>
     * <br>Note that a display may not have a seat. In this case,
     * <br>this function will return %NULL.
     * @return the default seat.
    */
    public Seat getDefaultSeat()  {
        return new Seat(new PointerContainer(JnaDisplay.INST().gdk_display_get_default_seat(asCPointer())));
    }

    /**
     * Gets the monitor in which the largest area of &#64;surface
     * <br>resides.
     * <br>
     * <br>Returns a monitor close to &#64;surface if it is outside
     * <br>of all monitors.
     * @param surface a `GdkSurface`
     * @return the monitor with the largest   overlap with &#64;surface
    */
    public Monitor getMonitorAtSurface(@Nonnull Surface surface)  {
        return new Monitor(new PointerContainer(JnaDisplay.INST().gdk_display_get_monitor_at_surface(asCPointer(), asCPointerNotNull(surface))));
    }

    /**
     * Gets the list of monitors associated with this display.
     * <br>
     * <br>Subsequent calls to this function will always return the
     * <br>same list for the same display.
     * <br>
     * <br>You can listen to the GListModel::items-changed signal on
     * <br>this list to monitor changes to the monitor of this display.
     * @return a `GListModel` of `GdkMonitor`
    */
    public ch.bailu.gtk.gio.ListModel getMonitors()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaDisplay.INST().gdk_display_get_monitors(asCPointer())));
    }

    /**
     * Gets the name of the display.
     * @return a string representing the display name. This string is owned   by GDK and should not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDisplay.INST().gdk_display_get_name(asCPointer())));
    }

    /**
     * Gets the clipboard used for the primary selection.
     * <br>
     * <br>On backends where the primary clipboard is not supported natively,
     * <br>GDK emulates this clipboard locally.
     * @return the primary clipboard
    */
    public Clipboard getPrimaryClipboard()  {
        return new Clipboard(new PointerContainer(JnaDisplay.INST().gdk_display_get_primary_clipboard(asCPointer())));
    }

    /**
     * Retrieves a desktop-wide setting such as double-click time
     * <br>for the &#64;display.
     * @param name the name of the setting
     * @param value location to store the value of the setting
     * @return %TRUE if the setting existed and a value was stored   in &#64;value, %FALSE otherwise
    */
    public boolean getSetting(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        return JnaDisplay.INST().gdk_display_get_setting(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(value));
    }

    /**
     * Retrieves a desktop-wide setting such as double-click time
     * <br>for the &#64;display.
     * @param name the name of the setting
     * @param value location to store the value of the setting
     * @return %TRUE if the setting existed and a value was stored   in &#64;value, %FALSE otherwise
    */
    public boolean getSetting(String name, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        return JnaDisplay.INST().gdk_display_get_setting(asCPointer(), name, asCPointerNotNull(value));
    }

    /**
     * Gets the startup notification ID for a Wayland display, or %NULL
     * <br>if no ID has been defined.
     * @return the startup notification ID for &#64;display
    */
    public ch.bailu.gtk.type.Str getStartupNotificationId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDisplay.INST().gdk_display_get_startup_notification_id(asCPointer())));
    }

    /**
     * Finds out if the display has been closed.
     * @return %TRUE if the display is closed.
    */
    public boolean isClosed()  {
        return JnaDisplay.INST().gdk_display_is_closed(asCPointer());
    }

    /**
     * Returns whether surfaces can reasonably be expected to have
     * <br>their alpha channel drawn correctly on the screen.
     * <br>
     * <br>Check [method&#64;Gdk.Display.is_rgba] for whether the display
     * <br>supports an alpha channel.
     * <br>
     * <br>On X11 this function returns whether a compositing manager is
     * <br>compositing on &#64;display.
     * <br>
     * <br>On modern displays, this value is always %TRUE.
     * @return Whether surfaces with RGBA visuals can reasonably   be expected to have their alpha channels drawn correctly   on the screen.
    */
    public boolean isComposited()  {
        return JnaDisplay.INST().gdk_display_is_composited(asCPointer());
    }

    /**
     * Returns whether surfaces on this &#64;display are created with an
     * <br>alpha channel.
     * <br>
     * <br>Even if a %TRUE is returned, it is possible that the
     * <br>surface’s alpha channel won’t be honored when displaying the
     * <br>surface on the screen: in particular, for X an appropriate
     * <br>windowing manager and compositing manager must be running to
     * <br>provide appropriate display. Use [method&#64;Gdk.Display.is_composited]
     * <br>to check if that is the case.
     * <br>
     * <br>On modern displays, this value is always %TRUE.
     * @return %TRUE if surfaces are created with an alpha channel or   %FALSE if the display does not support this functionality.
    */
    public boolean isRgba()  {
        return JnaDisplay.INST().gdk_display_is_rgba(asCPointer());
    }

    /**
     * Returns the list of seats known to &#64;display.
     * @return the   list of seats known to the `GdkDisplay`
    */
    public ch.bailu.gtk.glib.List listSeats()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaDisplay.INST().gdk_display_list_seats(asCPointer())));
    }

    /**
     * Indicates to the GUI environment that the application has
     * <br>finished loading, using a given identifier.
     * <br>
     * <br>GTK will call this function automatically for [class&#64;Gtk.Window]
     * <br>with custom startup-notification identifier unless
     * <br>[method&#64;Gtk.Window.set_auto_startup_notification]
     * <br>is called to disable that feature.
     * @param startup_id a startup-notification identifier, for which   notification process should be completed
    */
    public void notifyStartupComplete(@Nonnull ch.bailu.gtk.type.Str startup_id)  {
        JnaDisplay.INST().gdk_display_notify_startup_complete(asCPointer(), asCPointerNotNull(startup_id));
    }

    /**
     * Indicates to the GUI environment that the application has
     * <br>finished loading, using a given identifier.
     * <br>
     * <br>GTK will call this function automatically for [class&#64;Gtk.Window]
     * <br>with custom startup-notification identifier unless
     * <br>[method&#64;Gtk.Window.set_auto_startup_notification]
     * <br>is called to disable that feature.
     * @param startup_id a startup-notification identifier, for which   notification process should be completed
    */
    public void notifyStartupComplete(String startup_id)  {
        JnaDisplay.INST().gdk_display_notify_startup_complete(asCPointer(), startup_id);
    }

    /**
     * Checks that OpenGL is available for &#64;self and ensures that it is
     * <br>properly initialized.
     * <br>When this fails, an &#64;error will be set describing the error and this
     * <br>function returns %FALSE.
     * <br>
     * <br>Note that even if this function succeeds, creating a `GdkGLContext`
     * <br>may still fail.
     * <br>
     * <br>This function is idempotent. Calling it multiple times will just
     * <br>return the same value or error.
     * <br>
     * <br>You never need to call this function, GDK will call it automatically
     * <br>as needed. But you can use it as a check when setting up code that
     * <br>might make use of OpenGL.
     * @return %TRUE if the display supports OpenGL
    */
    public boolean prepareGl() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDisplay.INST().gdk_display_prepare_gl(asCPointer(), 0L);
    }

    /**
     * Appends the given event onto the front of the event
     * <br>queue for &#64;display.
     * <br>
     * <br>This function is only useful in very special situations
     * <br>and should not be used by applications.
     * @param event a `GdkEvent`
    */
    public void putEvent(@Nonnull Event event)  {
        JnaDisplay.INST().gdk_display_put_event(asCPointer(), asCPointerNotNull(event));
    }

    /**
     * Returns %TRUE if the display supports input shapes.
     * <br>
     * <br>This means that [method&#64;Gdk.Surface.set_input_region] can
     * <br>be used to modify the input shape of surfaces on &#64;display.
     * <br>
     * <br>On modern displays, this value is always %TRUE.
     * @return %TRUE if surfaces with modified input shape are supported
    */
    public boolean supportsInputShapes()  {
        return JnaDisplay.INST().gdk_display_supports_input_shapes(asCPointer());
    }

    /**
     * Flushes any requests queued for the windowing system and waits until all
     * <br>requests have been handled.
     * <br>
     * <br>This is often used for making sure that the display is synchronized
     * <br>with the current state of the program. Calling [method&#64;Gdk.Display.sync]
     * <br>before [method&#64;GdkX11.Display.error_trap_pop] makes sure that any errors
     * <br>generated from earlier requests are handled before the error trap is removed.
     * <br>
     * <br>This is most useful for X11. On windowing systems where requests are
     * <br>handled synchronously, this function will do nothing.
    */
    public void sync()  {
        JnaDisplay.INST().gdk_display_sync(asCPointer());
    }

    public final static String SIGNAL_ON_CLOSED = "closed";
    
    /**
     * Connect to signal "closed".
     * <br>See {@link OnClosed#onClosed} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClosed(OnClosed signal) {
        return connectSignal(SIGNAL_ON_CLOSED, toOnClosed(signal));
    }

    public final static String SIGNAL_ON_OPENED = "opened";
    
    /**
     * Connect to signal "opened".
     * <br>See {@link OnOpened#onOpened} for signal description.
     * <br>Field {@link #SIGNAL_ON_OPENED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onOpened(OnOpened signal) {
        return connectSignal(SIGNAL_ON_OPENED, toOnOpened(signal));
    }

    public final static String SIGNAL_ON_SEAT_ADDED = "seat-added";
    
    /**
     * Connect to signal "seat-added".
     * <br>See {@link OnSeatAdded#onSeatAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_SEAT_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSeatAdded(OnSeatAdded signal) {
        return connectSignal(SIGNAL_ON_SEAT_ADDED, toOnSeatAdded(signal));
    }

    public final static String SIGNAL_ON_SEAT_REMOVED = "seat-removed";
    
    /**
     * Connect to signal "seat-removed".
     * <br>See {@link OnSeatRemoved#onSeatRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_SEAT_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSeatRemoved(OnSeatRemoved signal) {
        return connectSignal(SIGNAL_ON_SEAT_REMOVED, toOnSeatRemoved(signal));
    }

    public final static String SIGNAL_ON_SETTING_CHANGED = "setting-changed";
    
    /**
     * Connect to signal "setting-changed".
     * <br>See {@link OnSettingChanged#onSettingChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SETTING_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSettingChanged(OnSettingChanged signal) {
        return connectSignal(SIGNAL_ON_SETTING_CHANGED, toOnSettingChanged(signal));
    }

    /**
     * Gets the default `GdkDisplay`.
     * <br>
     * <br>This is a convenience function for:
     * <br>
     * <br>    gdk_display_manager_get_default_display (gdk_display_manager_get ())
     * @return a `GdkDisplay`, or %NULL if   there is no default display
    */
    public static Display getDefault()  {
        return new Display(new PointerContainer(JnaDisplay.INST().gdk_display_get_default()));
    }

    /**
     * Opens a display.
     * <br>
     * <br>If opening the display fails, `NULL` is returned.
     * @param display_name the name of the display to open
     * @return a `GdkDisplay`
    */
    public static Display open(@Nonnull ch.bailu.gtk.type.Str display_name)  {
        return new Display(new PointerContainer(JnaDisplay.INST().gdk_display_open(asCPointerNotNull(display_name))));
    }

    public static long getTypeID() { 
        return JnaDisplay.INST().gdk_display_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:mapKeycode:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GdkKeymapKey**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:java-type-not-supported:mapKeyval:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GdkKeymapKey**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:java-type-not-supported:translateKey:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GdkModifierType}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
*/
