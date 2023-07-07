/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface Align {

    /**
     * stretch to fill all space if possible, center if
     * <br>  no meaningful way to stretch
    */
    int FILL = 0;

    /**
     * snap to left or top side, leaving space on right or bottom
    */
    int START = 1;

    /**
     * snap to right or bottom side, leaving space on left or top
    */
    int END = 2;

    /**
     * center natural width of widget inside the allocation
    */
    int CENTER = 3;

    /**
     * align the widget according to the baseline.
     * <br>  See [class&#64;Gtk.Widget].
    */
    int BASELINE = 4;

}

/*
enumeration-type
*/
