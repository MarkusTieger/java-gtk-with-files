/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureRotate` is a `GtkGesture` for 2-finger rotations.
 * <br>
 * <br>Whenever the angle between both handled sequences changes, the
 * <br>[signal&#64;Gtk.GestureRotate::angle-changed] signal is emitted.
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureRotate.html">https://docs.gtk.org/gtk4/class.GestureRotate.html</a></p>
*/
public class GestureRotate extends Gesture {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureRotate.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAngleChanged {
        /**
         * Emitted when the angle between both tracked points changes.
         * @param angle Current angle in radians
         * @param angle_delta Difference with the starting angle, in radians
        */
        void onAngleChanged(double angle, double angle_delta);
    }
    
    private static com.sun.jna.Callback toOnAngleChanged(OnAngleChanged in) {
        return (in == null) ? null: (JnaGestureRotate.OnAngleChanged) (__self, _angle, _angle_delta, __data) -> in.onAngleChanged(_angle, _angle_delta);
    }

    public GestureRotate(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes 2-touch
     * <br>rotation gestures.
    */
    public GestureRotate() {
        super(cast(JnaGestureRotate.INST().gtk_gesture_rotate_new()));
    }

    /**
     * Gets the angle delta in radians.
     * <br>
     * <br>If &#64;gesture is active, this function returns the angle difference
     * <br>in radians since the gesture was first recognized. If &#64;gesture is
     * <br>not active, 0 is returned.
     * @return the angle delta in radians
    */
    public double getAngleDelta()  {
        return JnaGestureRotate.INST().gtk_gesture_rotate_get_angle_delta(asCPointer());
    }

    public final static String SIGNAL_ON_ANGLE_CHANGED = "angle-changed";
    
    /**
     * Connect to signal "angle-changed".
     * <br>See {@link OnAngleChanged#onAngleChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_ANGLE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAngleChanged(OnAngleChanged signal) {
        return connectSignal(SIGNAL_ON_ANGLE_CHANGED, toOnAngleChanged(signal));
    }

    public static long getTypeID() { 
        return JnaGestureRotate.INST().gtk_gesture_rotate_get_type(); 
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
