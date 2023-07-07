/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGesturePan` is a `GtkGesture` for pan gestures.
 * <br>
 * <br>These are drags that are locked to happen along one axis. The axis
 * <br>that a `GtkGesturePan` handles is defined at construct time, and
 * <br>can be changed through [method&#64;Gtk.GesturePan.set_orientation].
 * <br>
 * <br>When the gesture starts to be recognized, `GtkGesturePan` will
 * <br>attempt to determine as early as possible whether the sequence
 * <br>is moving in the expected direction, and denying the sequence if
 * <br>this does not happen.
 * <br>
 * <br>Once a panning gesture along the expected axis is recognized,
 * <br>the [signal&#64;Gtk.GesturePan::pan] signal will be emitted as input
 * <br>events are received, containing the offset in the given axis.
 * <p><a href="https://docs.gtk.org/gtk4/class.GesturePan.html">https://docs.gtk.org/gtk4/class.GesturePan.html</a></p>
*/
public class GesturePan extends GestureDrag {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GesturePan.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPan {
        /**
         * Emitted once a panning gesture along the expected axis is detected.
         * @param direction current direction of the pan gesture
         * @param offset Offset along the gesture orientation
        */
        void onPan(int direction, double offset);
    }
    
    private static com.sun.jna.Callback toOnPan(OnPan in) {
        return (in == null) ? null: (JnaGesturePan.OnPan) (__self, _direction, _offset, __data) -> in.onPan(_direction, _offset);
    }

    public GesturePan(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes pan gestures.
     * @param orientation expected orientation
    */
    public GesturePan(int orientation) {
        super(cast(JnaGesturePan.INST().gtk_gesture_pan_new(orientation)));
    }

    /**
     * Returns the orientation of the pan gestures that this &#64;gesture expects.
     * @return the expected orientation for pan gestures
    */
    public int getOrientation()  {
        return JnaGesturePan.INST().gtk_gesture_pan_get_orientation(asCPointer());
    }

    /**
     * Sets the orientation to be expected on pan gestures.
     * @param orientation expected orientation
    */
    public void setOrientation(int orientation)  {
        JnaGesturePan.INST().gtk_gesture_pan_set_orientation(asCPointer(), orientation);
    }

    public final static String SIGNAL_ON_PAN = "pan";
    
    /**
     * Connect to signal "pan".
     * <br>See {@link OnPan#onPan} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPan(OnPan signal) {
        return connectSignal(SIGNAL_ON_PAN, toOnPan(signal));
    }

    public static long getTypeID() { 
        return JnaGesturePan.INST().gtk_gesture_pan_get_type(); 
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
