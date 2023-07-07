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
public interface AnchorHints {

    /**
     * allow flipping anchors horizontally
    */
    int FLIP_X = 1;

    /**
     * allow flipping anchors vertically
    */
    int FLIP_Y = 2;

    /**
     * allow sliding surface horizontally
    */
    int SLIDE_X = 4;

    /**
     * allow sliding surface vertically
    */
    int SLIDE_Y = 8;

    /**
     * allow resizing surface horizontally
    */
    int RESIZE_X = 16;

    /**
     * allow resizing surface vertically
    */
    int RESIZE_Y = 32;

    /**
     * allow flipping anchors on both axes
    */
    int FLIP = 3;

    /**
     * allow sliding surface on both axes
    */
    int SLIDE = 12;

    /**
     * allow resizing surface on both axes
    */
    int RESIZE = 48;

}

/*
enumeration-type
*/
