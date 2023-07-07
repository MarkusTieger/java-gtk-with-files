/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkDevice` object represents an input device, such
 * <br>as a keyboard, a mouse, or a touchpad.
 * <br>
 * <br>See the [class&#64;Gdk.Seat] documentation for more information
 * <br>about the various kinds of devices, and their relationships.
 * <p><a href="https://docs.gtk.org/gdk4/class.Device.html">https://docs.gtk.org/gdk4/class.Device.html</a></p>
*/
public class Device extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Device.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted either when the number of either axes or keys changes.
         * <br>
         * <br>On X11 this will normally happen when the physical device
         * <br>routing events through the logical device changes (for
         * <br>example, user switches from the USB mouse to a tablet); in
         * <br>that case the logical device will change to reflect the axes
         * <br>and keys on the new physical device.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaDevice.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnToolChanged {
        /**
         * Emitted on pen/eraser devices whenever tools enter or leave proximity.
         * @param tool The new current tool
        */
        void onToolChanged(@Nonnull DeviceTool tool);
    }
    
    private static com.sun.jna.Callback toOnToolChanged(OnToolChanged in) {
        return (in == null) ? null: (JnaDevice.OnToolChanged) (__self, _tool, __data) -> in.onToolChanged(new DeviceTool(new PointerContainer(_tool)));
    }

    public Device(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves whether the Caps Lock modifier of the keyboard is locked.
     * <br>
     * <br>This is only relevant for keyboard devices.
     * @return %TRUE if Caps Lock is on for &#64;device
    */
    public boolean getCapsLockState()  {
        return JnaDevice.INST().gdk_device_get_caps_lock_state(asCPointer());
    }

    /**
     * Retrieves the current tool for &#64;device.
     * @return the `GdkDeviceTool`
    */
    public DeviceTool getDeviceTool()  {
        return new DeviceTool(new PointerContainer(JnaDevice.INST().gdk_device_get_device_tool(asCPointer())));
    }

    /**
     * Returns the direction of effective layout of the keyboard.
     * <br>
     * <br>This is only relevant for keyboard devices.
     * <br>
     * <br>The direction of a layout is the direction of the majority
     * <br>of its symbols. See [func&#64;Pango.unichar_direction].
     * @return %PANGO_DIRECTION_LTR or %PANGO_DIRECTION_RTL   if it can determine the direction. %PANGO_DIRECTION_NEUTRAL   otherwise
    */
    public int getDirection()  {
        return JnaDevice.INST().gdk_device_get_direction(asCPointer());
    }

    /**
     * Returns the `GdkDisplay` to which &#64;device pertains.
     * @return a `GdkDisplay`
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaDevice.INST().gdk_device_get_display(asCPointer())));
    }

    /**
     * Determines whether the pointer follows device motion.
     * <br>
     * <br>This is not meaningful for keyboard devices, which
     * <br>don't have a pointer.
     * @return %TRUE if the pointer follows device motion
    */
    public boolean getHasCursor()  {
        return JnaDevice.INST().gdk_device_get_has_cursor(asCPointer());
    }

    /**
     * Retrieves the current modifier state of the keyboard.
     * <br>
     * <br>This is only relevant for keyboard devices.
     * @return the current modifier state
    */
    public int getModifierState()  {
        return JnaDevice.INST().gdk_device_get_modifier_state(asCPointer());
    }

    /**
     * The name of the device, suitable for showing in a user interface.
     * @return a name
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDevice.INST().gdk_device_get_name(asCPointer())));
    }

    /**
     * Retrieves whether the Num Lock modifier of the keyboard is locked.
     * <br>
     * <br>This is only relevant for keyboard devices.
     * @return %TRUE if Num Lock is on for &#64;device
    */
    public boolean getNumLockState()  {
        return JnaDevice.INST().gdk_device_get_num_lock_state(asCPointer());
    }

    /**
     * Retrieves the number of touch points associated to &#64;device.
     * @return the number of touch points
    */
    public int getNumTouches()  {
        return JnaDevice.INST().gdk_device_get_num_touches(asCPointer());
    }

    /**
     * Returns the product ID of this device.
     * <br>
     * <br>This ID is retrieved from the device, and does not change.
     * <br>See [method&#64;Gdk.Device.get_vendor_id] for more information.
     * @return the product ID
    */
    public ch.bailu.gtk.type.Str getProductId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDevice.INST().gdk_device_get_product_id(asCPointer())));
    }

    /**
     * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
     * <br>
     * <br>This is only relevant for keyboard devices.
     * @return %TRUE if Scroll Lock is on for &#64;device
    */
    public boolean getScrollLockState()  {
        return JnaDevice.INST().gdk_device_get_scroll_lock_state(asCPointer());
    }

    /**
     * Returns the `GdkSeat` the device belongs to.
     * @return a `GdkSeat`
    */
    public Seat getSeat()  {
        return new Seat(new PointerContainer(JnaDevice.INST().gdk_device_get_seat(asCPointer())));
    }

    /**
     * Determines the type of the device.
     * @return a `GdkInputSource`
    */
    public int getSource()  {
        return JnaDevice.INST().gdk_device_get_source(asCPointer());
    }

    /**
     * Returns the timestamp of the last activity for this device.
     * <br>
     * <br>In practice, this means the timestamp of the last event that was
     * <br>received from the OS for this device. (GTK may occasionally produce
     * <br>events for a device that are not received from the OS, and will not
     * <br>update the timestamp).
     * @return the timestamp of the last activity for this device
    */
    public int getTimestamp()  {
        return JnaDevice.INST().gdk_device_get_timestamp(asCPointer());
    }

    /**
     * Returns the vendor ID of this device.
     * <br>
     * <br>This ID is retrieved from the device, and does not change.
     * <br>
     * <br>This function, together with [method&#64;Gdk.Device.get_product_id],
     * <br>can be used to eg. compose `GSettings` paths to store settings
     * <br>for this device.
     * <br>
     * <br>```c
     * <br> static GSettings *
     * <br> get_device_settings (GdkDevice *device)
     * <br> {
     * <br>   const char *vendor, *product;
     * <br>   GSettings *settings;
     * <br>   GdkDevice *device;
     * <br>   char *path;
     * <br>
     * <br>   vendor = gdk_device_get_vendor_id (device);
     * <br>   product = gdk_device_get_product_id (device);
     * <br>
     * <br>   path = g_strdup_printf (&quot;/org/example/app/devices/%s:%s/&quot;, vendor, product);
     * <br>   settings = g_settings_new_with_path (DEVICE_SCHEMA, path);
     * <br>   g_free (path);
     * <br>
     * <br>   return settings;
     * <br> }
     * <br>```
     * @return the vendor ID
    */
    public ch.bailu.gtk.type.Str getVendorId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDevice.INST().gdk_device_get_vendor_id(asCPointer())));
    }

    /**
     * Determines if layouts for both right-to-left and
     * <br>left-to-right languages are in use on the keyboard.
     * <br>
     * <br>This is only relevant for keyboard devices.
     * @return %TRUE if there are layouts with both directions, %FALSE otherwise
    */
    public boolean hasBidiLayouts()  {
        return JnaDevice.INST().gdk_device_has_bidi_layouts(asCPointer());
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public final static String SIGNAL_ON_TOOL_CHANGED = "tool-changed";
    
    /**
     * Connect to signal "tool-changed".
     * <br>See {@link OnToolChanged#onToolChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOOL_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToolChanged(OnToolChanged signal) {
        return connectSignal(SIGNAL_ON_TOOL_CHANGED, toOnToolChanged(signal));
    }

    public static long getTypeID() { 
        return JnaDevice.INST().gdk_device_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getSurfaceAtPosition:[ParameterModel:Supported:{Gg:Surface:{c:GdkSurface*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
