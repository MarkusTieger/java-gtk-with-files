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
public interface ConstraintAttribute {

    /**
     * No attribute, used for constant
     * <br>  relations
    */
    int NONE = 0;

    /**
     * The left edge of a widget, regardless of
     * <br>  text direction
    */
    int LEFT = 1;

    /**
     * The right edge of a widget, regardless
     * <br>  of text direction
    */
    int RIGHT = 2;

    /**
     * The top edge of a widget
    */
    int TOP = 3;

    /**
     * The bottom edge of a widget
    */
    int BOTTOM = 4;

    /**
     * The leading edge of a widget, depending
     * <br>  on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_LEFT for LTR
     * <br>  languages, and %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for RTL ones
    */
    int START = 5;

    /**
     * The trailing edge of a widget, depending
     * <br>  on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for LTR
     * <br>  languages, and %GTK_CONSTRAINT_ATTRIBUTE_LEFT for RTL ones
    */
    int END = 6;

    /**
     * The width of a widget
    */
    int WIDTH = 7;

    /**
     * The height of a widget
    */
    int HEIGHT = 8;

    /**
     * The center of a widget, on the
     * <br>  horizontal axis
    */
    int CENTER_X = 9;

    /**
     * The center of a widget, on the
     * <br>  vertical axis
    */
    int CENTER_Y = 10;

    /**
     * The baseline of a widget
    */
    int BASELINE = 11;

}

/*
enumeration-type
*/
