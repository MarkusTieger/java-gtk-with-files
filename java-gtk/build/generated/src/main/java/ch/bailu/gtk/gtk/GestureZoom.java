/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureZoom` is a `GtkGesture` for 2-finger pinch/zoom gestures.
 * <br>
 * <br>Whenever the distance between both tracked sequences changes, the
 * <br>[signal&#64;Gtk.GestureZoom::scale-changed] signal is emitted to report
 * <br>the scale factor.
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureZoom.html">https://docs.gtk.org/gtk4/class.GestureZoom.html</a></p>
*/
public class GestureZoom extends Gesture {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureZoom.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnScaleChanged {
        /**
         * Emitted whenever the distance between both tracked sequences changes.
         * @param scale Scale delta, taking the initial state as 1:1
        */
        void onScaleChanged(double scale);
    }
    
    private static com.sun.jna.Callback toOnScaleChanged(OnScaleChanged in) {
        return (in == null) ? null: (JnaGestureZoom.OnScaleChanged) (__self, _scale, __data) -> in.onScaleChanged(_scale);
    }

    public GestureZoom(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes
     * <br>pinch/zoom gestures.
    */
    public GestureZoom() {
        super(cast(JnaGestureZoom.INST().gtk_gesture_zoom_new()));
    }

    /**
     * Gets the scale delta.
     * <br>
     * <br>If &#64;gesture is active, this function returns the zooming
     * <br>difference since the gesture was recognized (hence the
     * <br>starting point is considered 1:1). If &#64;gesture is not
     * <br>active, 1 is returned.
     * @return the scale delta
    */
    public double getScaleDelta()  {
        return JnaGestureZoom.INST().gtk_gesture_zoom_get_scale_delta(asCPointer());
    }

    public final static String SIGNAL_ON_SCALE_CHANGED = "scale-changed";
    
    /**
     * Connect to signal "scale-changed".
     * <br>See {@link OnScaleChanged#onScaleChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SCALE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onScaleChanged(OnScaleChanged signal) {
        return connectSignal(SIGNAL_ON_SCALE_CHANGED, toOnScaleChanged(signal));
    }

    public static long getTypeID() { 
        return JnaGestureZoom.INST().gtk_gesture_zoom_get_type(); 
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
