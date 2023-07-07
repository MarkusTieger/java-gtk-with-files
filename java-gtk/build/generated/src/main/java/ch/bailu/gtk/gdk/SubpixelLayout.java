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
public interface SubpixelLayout {

    /**
     * The layout is not known
    */
    int UNKNOWN = 0;

    /**
     * Not organized in this way
    */
    int NONE = 1;

    /**
     * The layout is horizontal, the order is RGB
    */
    int HORIZONTAL_RGB = 2;

    /**
     * The layout is horizontal, the order is BGR
    */
    int HORIZONTAL_BGR = 3;

    /**
     * The layout is vertical, the order is RGB
    */
    int VERTICAL_RGB = 4;

    /**
     * The layout is vertical, the order is BGR
    */
    int VERTICAL_BGR = 5;

}

/*
enumeration-type
*/
