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
public interface SeatCapabilities {

    /**
     * No input capabilities
    */
    int NONE = 0;

    /**
     * The seat has a pointer (e.g. mouse)
    */
    int POINTER = 1;

    /**
     * The seat has touchscreen(s) attached
    */
    int TOUCH = 2;

    /**
     * The seat has drawing tablet(s) attached
    */
    int TABLET_STYLUS = 4;

    /**
     * The seat has keyboard(s) attached
    */
    int KEYBOARD = 8;

    /**
     * The seat has drawing tablet pad(s) attached
    */
    int TABLET_PAD = 16;

    /**
     * The union of all pointing capabilities
    */
    int ALL_POINTING = 7;

    /**
     * The union of all capabilities
    */
    int ALL = 15;

}

/*
enumeration-type
*/
