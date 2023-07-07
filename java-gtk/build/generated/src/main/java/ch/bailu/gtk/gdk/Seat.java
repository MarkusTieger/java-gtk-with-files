/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkSeat` object represents a collection of input devices
 * <br>that belong to a user.
 * <p><a href="https://docs.gtk.org/gdk4/class.Seat.html">https://docs.gtk.org/gdk4/class.Seat.html</a></p>
*/
public class Seat extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Seat.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDeviceAdded {
        /**
         * Emitted when a new input device is related to this seat.
         * @param device the newly added `GdkDevice`.
        */
        void onDeviceAdded(@Nonnull Device device);
    }
    
    private static com.sun.jna.Callback toOnDeviceAdded(OnDeviceAdded in) {
        return (in == null) ? null: (JnaSeat.OnDeviceAdded) (__self, _device, __data) -> in.onDeviceAdded(new Device(new PointerContainer(_device)));
    }

    @FunctionalInterface
    public interface OnDeviceRemoved {
        /**
         * Emitted when an input device is removed (e.g. unplugged).
         * @param device the just removed `GdkDevice`.
        */
        void onDeviceRemoved(@Nonnull Device device);
    }
    
    private static com.sun.jna.Callback toOnDeviceRemoved(OnDeviceRemoved in) {
        return (in == null) ? null: (JnaSeat.OnDeviceRemoved) (__self, _device, __data) -> in.onDeviceRemoved(new Device(new PointerContainer(_device)));
    }

    @FunctionalInterface
    public interface OnToolAdded {
        /**
         * Emitted whenever a new tool is made known to the seat.
         * <br>
         * <br>The tool may later be assigned to a device (i.e. on
         * <br>proximity with a tablet). The device will emit the
         * <br>[signal&#64;Gdk.Device::tool-changed] signal accordingly.
         * <br>
         * <br>A same tool may be used by several devices.
         * @param tool the new `GdkDeviceTool` known to the seat
        */
        void onToolAdded(@Nonnull DeviceTool tool);
    }
    
    private static com.sun.jna.Callback toOnToolAdded(OnToolAdded in) {
        return (in == null) ? null: (JnaSeat.OnToolAdded) (__self, _tool, __data) -> in.onToolAdded(new DeviceTool(new PointerContainer(_tool)));
    }

    @FunctionalInterface
    public interface OnToolRemoved {
        /**
         * Emitted whenever a tool is no longer known to this &#64;seat.
         * @param tool the just removed `GdkDeviceTool`
        */
        void onToolRemoved(@Nonnull DeviceTool tool);
    }
    
    private static com.sun.jna.Callback toOnToolRemoved(OnToolRemoved in) {
        return (in == null) ? null: (JnaSeat.OnToolRemoved) (__self, _tool, __data) -> in.onToolRemoved(new DeviceTool(new PointerContainer(_tool)));
    }

    public Seat(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the capabilities this `GdkSeat` currently has.
     * @return the seat capabilities
    */
    public int getCapabilities()  {
        return JnaSeat.INST().gdk_seat_get_capabilities(asCPointer());
    }

    /**
     * Returns the devices that match the given capabilities.
     * @param capabilities capabilities to get devices for
     * @return A list   of `GdkDevices`. The list must be freed with g_list_free(),   the elements are owned by GTK and must not be freed.
    */
    public ch.bailu.gtk.glib.List getDevices(int capabilities)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaSeat.INST().gdk_seat_get_devices(asCPointer(), capabilities)));
    }

    /**
     * Returns the `GdkDisplay` this seat belongs to.
     * @return a `GdkDisplay`. This object   is owned by GTK and must not be freed.
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaSeat.INST().gdk_seat_get_display(asCPointer())));
    }

    /**
     * Returns the device that routes keyboard events.
     * @return a `GdkDevice` with keyboard   capabilities. This object is owned by GTK and must not be freed.
    */
    public Device getKeyboard()  {
        return new Device(new PointerContainer(JnaSeat.INST().gdk_seat_get_keyboard(asCPointer())));
    }

    /**
     * Returns the device that routes pointer events.
     * @return a `GdkDevice` with pointer   capabilities. This object is owned by GTK and must not be freed.
    */
    public Device getPointer()  {
        return new Device(new PointerContainer(JnaSeat.INST().gdk_seat_get_pointer(asCPointer())));
    }

    /**
     * Returns all `GdkDeviceTools` that are known to the application.
     * @return    A list of tools. Free with g_list_free().
    */
    public ch.bailu.gtk.glib.List getTools()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaSeat.INST().gdk_seat_get_tools(asCPointer())));
    }

    public final static String SIGNAL_ON_DEVICE_ADDED = "device-added";
    
    /**
     * Connect to signal "device-added".
     * <br>See {@link OnDeviceAdded#onDeviceAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_DEVICE_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDeviceAdded(OnDeviceAdded signal) {
        return connectSignal(SIGNAL_ON_DEVICE_ADDED, toOnDeviceAdded(signal));
    }

    public final static String SIGNAL_ON_DEVICE_REMOVED = "device-removed";
    
    /**
     * Connect to signal "device-removed".
     * <br>See {@link OnDeviceRemoved#onDeviceRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_DEVICE_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDeviceRemoved(OnDeviceRemoved signal) {
        return connectSignal(SIGNAL_ON_DEVICE_REMOVED, toOnDeviceRemoved(signal));
    }

    public final static String SIGNAL_ON_TOOL_ADDED = "tool-added";
    
    /**
     * Connect to signal "tool-added".
     * <br>See {@link OnToolAdded#onToolAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOOL_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToolAdded(OnToolAdded signal) {
        return connectSignal(SIGNAL_ON_TOOL_ADDED, toOnToolAdded(signal));
    }

    public final static String SIGNAL_ON_TOOL_REMOVED = "tool-removed";
    
    /**
     * Connect to signal "tool-removed".
     * <br>See {@link OnToolRemoved#onToolRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOOL_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToolRemoved(OnToolRemoved signal) {
        return connectSignal(SIGNAL_ON_TOOL_REMOVED, toOnToolRemoved(signal));
    }

    public static long getTypeID() { 
        return JnaSeat.INST().gdk_seat_get_type(); 
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
