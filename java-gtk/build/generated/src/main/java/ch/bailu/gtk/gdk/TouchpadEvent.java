/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a gesture on a touchpad device.
 * <br>
 * <br>Unlike touchscreens, where the windowing system sends basic
 * <br>sequences of begin, update, end events, and leaves gesture
 * <br>recognition to the clients, touchpad gestures are typically
 * <br>processed by the system, resulting in these events.
 * <p><a href="https://docs.gtk.org/gdk4/class.TouchpadEvent.html">https://docs.gtk.org/gdk4/class.TouchpadEvent.html</a></p>
*/
public class TouchpadEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TouchpadEvent.class.getCanonicalName());
    }

    public TouchpadEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts the touchpad gesture phase from a touchpad event.
     * @return the gesture phase of &#64;event
    */
    public int getGesturePhase()  {
        return JnaTouchpadEvent.INST().gdk_touchpad_event_get_gesture_phase(asCPointer());
    }

    /**
     * Extracts the number of fingers from a touchpad event.
     * @return the number of fingers for &#64;event
    */
    public int getNFingers()  {
        return JnaTouchpadEvent.INST().gdk_touchpad_event_get_n_fingers(asCPointer());
    }

    /**
     * Extracts the angle delta from a touchpad pinch event.
     * @return the angle delta of &#64;event
    */
    public double getPinchAngleDelta()  {
        return JnaTouchpadEvent.INST().gdk_touchpad_event_get_pinch_angle_delta(asCPointer());
    }

    /**
     * Extracts the scale from a touchpad pinch event.
     * @return the scale of &#64;event
    */
    public double getPinchScale()  {
        return JnaTouchpadEvent.INST().gdk_touchpad_event_get_pinch_scale(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTouchpadEvent.INST().gdk_touchpad_event_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getDeltas:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
