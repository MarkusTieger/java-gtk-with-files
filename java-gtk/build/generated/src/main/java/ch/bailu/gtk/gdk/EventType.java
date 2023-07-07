/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface EventType {

    /**
     * the window manager has requested that the toplevel surface be
     * <br>  hidden or destroyed, usually when the user clicks on a special icon in the
     * <br>  title bar.
    */
    int DELETE = 0;

    /**
     * the pointer (usually a mouse) has moved.
    */
    int MOTION_NOTIFY = 1;

    /**
     * a mouse button has been pressed.
    */
    int BUTTON_PRESS = 2;

    /**
     * a mouse button has been released.
    */
    int BUTTON_RELEASE = 3;

    /**
     * a key has been pressed.
    */
    int KEY_PRESS = 4;

    /**
     * a key has been released.
    */
    int KEY_RELEASE = 5;

    /**
     * the pointer has entered the surface.
    */
    int ENTER_NOTIFY = 6;

    /**
     * the pointer has left the surface.
    */
    int LEAVE_NOTIFY = 7;

    /**
     * the keyboard focus has entered or left the surface.
    */
    int FOCUS_CHANGE = 8;

    /**
     * an input device has moved into contact with a sensing
     * <br>  surface (e.g. a touchscreen or graphics tablet).
    */
    int PROXIMITY_IN = 9;

    /**
     * an input device has moved out of contact with a sensing
     * <br>  surface.
    */
    int PROXIMITY_OUT = 10;

    /**
     * the mouse has entered the surface while a drag is in progress.
    */
    int DRAG_ENTER = 11;

    /**
     * the mouse has left the surface while a drag is in progress.
    */
    int DRAG_LEAVE = 12;

    /**
     * the mouse has moved in the surface while a drag is in
     * <br>  progress.
    */
    int DRAG_MOTION = 13;

    /**
     * a drop operation onto the surface has started.
    */
    int DROP_START = 14;

    /**
     * the scroll wheel was turned
    */
    int SCROLL = 15;

    /**
     * a pointer or keyboard grab was broken.
    */
    int GRAB_BROKEN = 16;

    /**
     * A new touch event sequence has just started.
    */
    int TOUCH_BEGIN = 17;

    /**
     * A touch event sequence has been updated.
    */
    int TOUCH_UPDATE = 18;

    /**
     * A touch event sequence has finished.
    */
    int TOUCH_END = 19;

    /**
     * A touch event sequence has been canceled.
    */
    int TOUCH_CANCEL = 20;

    /**
     * A touchpad swipe gesture event, the current state
     * <br>  is determined by its phase field.
    */
    int TOUCHPAD_SWIPE = 21;

    /**
     * A touchpad pinch gesture event, the current state
     * <br>  is determined by its phase field.
    */
    int TOUCHPAD_PINCH = 22;

    /**
     * A tablet pad button press event.
    */
    int PAD_BUTTON_PRESS = 23;

    /**
     * A tablet pad button release event.
    */
    int PAD_BUTTON_RELEASE = 24;

    /**
     * A tablet pad axis event from a &quot;ring&quot;.
    */
    int PAD_RING = 25;

    /**
     * A tablet pad axis event from a &quot;strip&quot;.
    */
    int PAD_STRIP = 26;

    /**
     * A tablet pad group mode change.
    */
    int PAD_GROUP_MODE = 27;

    /**
     * A touchpad hold gesture event, the current state
     * <br>  is determined by its phase field. Since: 4.6
    */
    int TOUCHPAD_HOLD = 28;

    /**
     * marks the end of the GdkEventType enumeration.
    */
    int EVENT_LAST = 29;

}

/*
enumeration-type
*/
