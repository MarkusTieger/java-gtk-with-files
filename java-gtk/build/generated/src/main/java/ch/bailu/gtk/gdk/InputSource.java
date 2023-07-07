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
public interface InputSource {

    /**
     * the device is a mouse. (This will be reported for the core
     * <br>  pointer, even if it is something else, such as a trackball.)
    */
    int MOUSE = 0;

    /**
     * the device is a stylus of a graphics tablet or similar device.
    */
    int PEN = 1;

    /**
     * the device is a keyboard.
    */
    int KEYBOARD = 2;

    /**
     * the device is a direct-input touch device, such
     * <br>  as a touchscreen or tablet
    */
    int TOUCHSCREEN = 3;

    /**
     * the device is an indirect touch device, such
     * <br>  as a touchpad
    */
    int TOUCHPAD = 4;

    /**
     * the device is a trackpoint
    */
    int TRACKPOINT = 5;

    /**
     * the device is a &quot;pad&quot;, a collection of buttons,
     * <br>  rings and strips found in drawing tablets
    */
    int TABLET_PAD = 6;

}

/*
enumeration-type
*/
