/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureSwipe` is a `GtkGesture` for swipe gestures.
 * <br>
 * <br>After a press/move/.../move/release sequence happens, the
 * <br>[signal&#64;Gtk.GestureSwipe::swipe] signal will be emitted,
 * <br>providing the velocity and directionality of the sequence
 * <br>at the time it was lifted.
 * <br>
 * <br>If the velocity is desired in intermediate points,
 * <br>[method&#64;Gtk.GestureSwipe.get_velocity] can be called in a
 * <br>[signal&#64;Gtk.Gesture::update] handler.
 * <br>
 * <br>All velocities are reported in pixels/sec units.
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureSwipe.html">https://docs.gtk.org/gtk4/class.GestureSwipe.html</a></p>
*/
public class GestureSwipe extends GestureSingle {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureSwipe.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSwipe {
        /**
         * Emitted when the recognized gesture is finished.
         * <br>
         * <br>Velocity and direction are a product of previously recorded events.
         * @param velocity_x velocity in the X axis, in pixels/sec
         * @param velocity_y velocity in the Y axis, in pixels/sec
        */
        void onSwipe(double velocity_x, double velocity_y);
    }
    
    private static com.sun.jna.Callback toOnSwipe(OnSwipe in) {
        return (in == null) ? null: (JnaGestureSwipe.OnSwipe) (__self, _velocity_x, _velocity_y, __data) -> in.onSwipe(_velocity_x, _velocity_y);
    }

    public GestureSwipe(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes swipes.
    */
    public GestureSwipe() {
        super(cast(JnaGestureSwipe.INST().gtk_gesture_swipe_new()));
    }

    public final static String SIGNAL_ON_SWIPE = "swipe";
    
    /**
     * Connect to signal "swipe".
     * <br>See {@link OnSwipe#onSwipe} for signal description.
     * <br>Field {@link #SIGNAL_ON_SWIPE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSwipe(OnSwipe signal) {
        return connectSignal(SIGNAL_ON_SWIPE, toOnSwipe(signal));
    }

    public static long getTypeID() { 
        return JnaGestureSwipe.INST().gtk_gesture_swipe_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getVelocity:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
