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
public interface AxisUse {

    /**
     * the axis is ignored.
    */
    int IGNORE = 0;

    /**
     * the axis is used as the x axis.
    */
    int X = 1;

    /**
     * the axis is used as the y axis.
    */
    int Y = 2;

    /**
     * the axis is used as the scroll x delta
    */
    int DELTA_X = 3;

    /**
     * the axis is used as the scroll y delta
    */
    int DELTA_Y = 4;

    /**
     * the axis is used for pressure information.
    */
    int PRESSURE = 5;

    /**
     * the axis is used for x tilt information.
    */
    int XTILT = 6;

    /**
     * the axis is used for y tilt information.
    */
    int YTILT = 7;

    /**
     * the axis is used for wheel information.
    */
    int WHEEL = 8;

    /**
     * the axis is used for pen/tablet distance information
    */
    int DISTANCE = 9;

    /**
     * the axis is used for pen rotation information
    */
    int ROTATION = 10;

    /**
     * the axis is used for pen slider information
    */
    int SLIDER = 11;

    /**
     * a constant equal to the numerically highest axis value.
    */
    int LAST = 12;

}

/*
enumeration-type
*/
