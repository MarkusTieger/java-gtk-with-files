/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface PixbufError {

    /**
     * An image file was broken somehow.
    */
    int CORRUPT_IMAGE = 0;

    /**
     * Not enough memory.
    */
    int INSUFFICIENT_MEMORY = 1;

    /**
     * A bad option was passed to a pixbuf save module.
    */
    int BAD_OPTION = 2;

    /**
     * Unknown image type.
    */
    int UNKNOWN_TYPE = 3;

    /**
     * Don't know how to perform the
     * <br> given operation on the type of image at hand.
    */
    int UNSUPPORTED_OPERATION = 4;

    /**
     * Generic failure code, something went wrong.
    */
    int FAILED = 5;

    /**
     * Only part of the animation was loaded.
    */
    int INCOMPLETE_ANIMATION = 6;

}

/*
enumeration-type
*/
