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
public interface CrossingMode {

    /**
     * crossing because of pointer motion.
    */
    int NORMAL = 0;

    /**
     * crossing because a grab is activated.
    */
    int GRAB = 1;

    /**
     * crossing because a grab is deactivated.
    */
    int UNGRAB = 2;

    /**
     * crossing because a GTK grab is activated.
    */
    int GTK_GRAB = 3;

    /**
     * crossing because a GTK grab is deactivated.
    */
    int GTK_UNGRAB = 4;

    /**
     * crossing because a GTK widget changed
     * <br>  state (e.g. sensitivity).
    */
    int STATE_CHANGED = 5;

    /**
     * crossing because a touch sequence has begun,
     * <br>  this event is synthetic as the pointer might have not left the surface.
    */
    int TOUCH_BEGIN = 6;

    /**
     * crossing because a touch sequence has ended,
     * <br>  this event is synthetic as the pointer might have not left the surface.
    */
    int TOUCH_END = 7;

    /**
     * crossing because of a device switch (i.e.
     * <br>  a mouse taking control of the pointer after a touch device), this event
     * <br>  is synthetic as the pointer didn’t leave the surface.
    */
    int DEVICE_SWITCH = 8;

}

/*
enumeration-type
*/
