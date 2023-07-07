/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureStylus` is a `GtkGesture` specific to stylus input.
 * <br>
 * <br>The provided signals just relay the basic information of the
 * <br>stylus events.
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureStylus.html">https://docs.gtk.org/gtk4/class.GestureStylus.html</a></p>
*/
public class GestureStylus extends GestureSingle {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureStylus.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDown {
        /**
         * Emitted when the stylus touches the device.
         * @param x the X coordinate of the stylus event
         * @param y the Y coordinate of the stylus event
        */
        void onDown(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnDown(OnDown in) {
        return (in == null) ? null: (JnaGestureStylus.OnDown) (__self, _x, _y, __data) -> in.onDown(_x, _y);
    }

    @FunctionalInterface
    public interface OnMotion {
        /**
         * Emitted when the stylus moves while touching the device.
         * @param x the X coordinate of the stylus event
         * @param y the Y coordinate of the stylus event
        */
        void onMotion(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnMotion(OnMotion in) {
        return (in == null) ? null: (JnaGestureStylus.OnMotion) (__self, _x, _y, __data) -> in.onMotion(_x, _y);
    }

    @FunctionalInterface
    public interface OnProximity {
        /**
         * Emitted when the stylus is in proximity of the device.
         * @param x the X coordinate of the stylus event
         * @param y the Y coordinate of the stylus event
        */
        void onProximity(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnProximity(OnProximity in) {
        return (in == null) ? null: (JnaGestureStylus.OnProximity) (__self, _x, _y, __data) -> in.onProximity(_x, _y);
    }

    @FunctionalInterface
    public interface OnUp {
        /**
         * Emitted when the stylus no longer touches the device.
         * @param x the X coordinate of the stylus event
         * @param y the Y coordinate of the stylus event
        */
        void onUp(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnUp(OnUp in) {
        return (in == null) ? null: (JnaGestureStylus.OnUp) (__self, _x, _y, __data) -> in.onUp(_x, _y);
    }

    public GestureStylus(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkGestureStylus`.
    */
    public GestureStylus() {
        super(cast(JnaGestureStylus.INST().gtk_gesture_stylus_new()));
    }

    /**
     * Returns the `GdkDeviceTool` currently driving input through this gesture.
     * <br>
     * <br>This function must be called from the handler of one of the
     * <br>[signal&#64;Gtk.GestureStylus::down], [signal&#64;Gtk.GestureStylus::motion],
     * <br>[signal&#64;Gtk.GestureStylus::up] or [signal&#64;Gtk.GestureStylus::proximity]
     * <br>signals.
     * @return The current stylus tool
    */
    public ch.bailu.gtk.gdk.DeviceTool getDeviceTool()  {
        return new ch.bailu.gtk.gdk.DeviceTool(new PointerContainer(JnaGestureStylus.INST().gtk_gesture_stylus_get_device_tool(asCPointer())));
    }

    public final static String SIGNAL_ON_DOWN = "down";
    
    /**
     * Connect to signal "down".
     * <br>See {@link OnDown#onDown} for signal description.
     * <br>Field {@link #SIGNAL_ON_DOWN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDown(OnDown signal) {
        return connectSignal(SIGNAL_ON_DOWN, toOnDown(signal));
    }

    public final static String SIGNAL_ON_MOTION = "motion";
    
    /**
     * Connect to signal "motion".
     * <br>See {@link OnMotion#onMotion} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMotion(OnMotion signal) {
        return connectSignal(SIGNAL_ON_MOTION, toOnMotion(signal));
    }

    public final static String SIGNAL_ON_PROXIMITY = "proximity";
    
    /**
     * Connect to signal "proximity".
     * <br>See {@link OnProximity#onProximity} for signal description.
     * <br>Field {@link #SIGNAL_ON_PROXIMITY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onProximity(OnProximity signal) {
        return connectSignal(SIGNAL_ON_PROXIMITY, toOnProximity(signal));
    }

    public final static String SIGNAL_ON_UP = "up";
    
    /**
     * Connect to signal "up".
     * <br>See {@link OnUp#onUp} for signal description.
     * <br>Field {@link #SIGNAL_ON_UP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUp(OnUp signal) {
        return connectSignal(SIGNAL_ON_UP, toOnUp(signal));
    }

    public static long getTypeID() { 
        return JnaGestureStylus.INST().gtk_gesture_stylus_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getAxes:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GdkAxisUse*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double**}}:{j:}]

[MethodModel:java-type-not-supported:getAxis:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:GdkAxisUse}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getBacklog:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GdkTimeCoord**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
