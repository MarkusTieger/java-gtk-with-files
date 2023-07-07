/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkMonitor` objects represent the individual outputs that are
 * <br>associated with a `GdkDisplay`.
 * <br>
 * <br>`GdkDisplay` keeps a `GListModel` to enumerate and monitor
 * <br>monitors with [method&#64;Gdk.Display.get_monitors]. You can use
 * <br>[method&#64;Gdk.Display.get_monitor_at_surface] to find a particular
 * <br>monitor.
 * <p><a href="https://docs.gtk.org/gdk4/class.Monitor.html">https://docs.gtk.org/gdk4/class.Monitor.html</a></p>
*/
public class Monitor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Monitor.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInvalidate {
        /**
         * Emitted when the output represented by &#64;monitor gets disconnected.
        */
        void onInvalidate();
    }
    
    private static com.sun.jna.Callback toOnInvalidate(OnInvalidate in) {
        return (in == null) ? null: (JnaMonitor.OnInvalidate) (__self, __data) -> in.onInvalidate();
    }

    public Monitor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the name of the monitor's connector, if available.
     * @return the name of the connector
    */
    public ch.bailu.gtk.type.Str getConnector()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMonitor.INST().gdk_monitor_get_connector(asCPointer())));
    }

    /**
     * Gets the display that this monitor belongs to.
     * @return the display
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaMonitor.INST().gdk_monitor_get_display(asCPointer())));
    }

    /**
     * Retrieves the size and position of the monitor within the
     * <br>display coordinate space.
     * <br>
     * <br>The returned geometry is in  ”application pixels”, not in
     * <br>”device pixels” (see [method&#64;Gdk.Monitor.get_scale_factor]).
     * @param geometry a `GdkRectangle` to be filled with the monitor geometry
    */
    public void getGeometry(@Nonnull Rectangle geometry)  {
        JnaMonitor.INST().gdk_monitor_get_geometry(asCPointer(), asCPointerNotNull(geometry));
    }

    /**
     * Gets the height in millimeters of the monitor.
     * @return the physical height of the monitor
    */
    public int getHeightMm()  {
        return JnaMonitor.INST().gdk_monitor_get_height_mm(asCPointer());
    }

    /**
     * Gets the name or PNP ID of the monitor's manufacturer.
     * <br>
     * <br>Note that this value might also vary depending on actual
     * <br>display backend.
     * <br>
     * <br>The PNP ID registry is located at
     * <br>[https://uefi.org/pnp_id_list](https://uefi.org/pnp_id_list).
     * @return the name of the manufacturer
    */
    public ch.bailu.gtk.type.Str getManufacturer()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMonitor.INST().gdk_monitor_get_manufacturer(asCPointer())));
    }

    /**
     * Gets the string identifying the monitor model, if available.
     * @return the monitor model
    */
    public ch.bailu.gtk.type.Str getModel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMonitor.INST().gdk_monitor_get_model(asCPointer())));
    }

    /**
     * Gets the refresh rate of the monitor, if available.
     * <br>
     * <br>The value is in milli-Hertz, so a refresh rate of 60Hz
     * <br>is returned as 60000.
     * @return the refresh rate in milli-Hertz, or 0
    */
    public int getRefreshRate()  {
        return JnaMonitor.INST().gdk_monitor_get_refresh_rate(asCPointer());
    }

    /**
     * Gets the internal scale factor that maps from monitor coordinates
     * <br>to device pixels.
     * <br>
     * <br>On traditional systems this is 1, but on very high density outputs
     * <br>it can be a higher value (often 2).
     * <br>
     * <br>This can be used if you want to create pixel based data for a
     * <br>particular monitor, but most of the time you’re drawing to a surface
     * <br>where it is better to use [method&#64;Gdk.Surface.get_scale_factor] instead.
     * @return the scale factor
    */
    public int getScaleFactor()  {
        return JnaMonitor.INST().gdk_monitor_get_scale_factor(asCPointer());
    }

    /**
     * Gets information about the layout of red, green and blue
     * <br>primaries for pixels.
     * @return the subpixel layout
    */
    public int getSubpixelLayout()  {
        return JnaMonitor.INST().gdk_monitor_get_subpixel_layout(asCPointer());
    }

    /**
     * Gets the width in millimeters of the monitor.
     * @return the physical width of the monitor
    */
    public int getWidthMm()  {
        return JnaMonitor.INST().gdk_monitor_get_width_mm(asCPointer());
    }

    /**
     * Returns %TRUE if the &#64;monitor object corresponds to a
     * <br>physical monitor.
     * <br>
     * <br>The &#64;monitor becomes invalid when the physical monitor
     * <br>is unplugged or removed.
     * @return %TRUE if the object corresponds to a physical monitor
    */
    public boolean isValid()  {
        return JnaMonitor.INST().gdk_monitor_is_valid(asCPointer());
    }

    public final static String SIGNAL_ON_INVALIDATE = "invalidate";
    
    /**
     * Connect to signal "invalidate".
     * <br>See {@link OnInvalidate#onInvalidate} for signal description.
     * <br>Field {@link #SIGNAL_ON_INVALIDATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInvalidate(OnInvalidate signal) {
        return connectSignal(SIGNAL_ON_INVALIDATE, toOnInvalidate(signal));
    }

    public static long getTypeID() { 
        return JnaMonitor.INST().gdk_monitor_get_type(); 
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
