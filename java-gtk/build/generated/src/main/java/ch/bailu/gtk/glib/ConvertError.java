/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface ConvertError {

    /**
     * Conversion between the requested character
     * <br>    sets is not supported.
    */
    int NO_CONVERSION = 0;

    /**
     * Invalid byte sequence in conversion input;
     * <br>   or the character sequence could not be represented in the target
     * <br>   character set.
    */
    int ILLEGAL_SEQUENCE = 1;

    /**
     * Conversion failed for some reason.
    */
    int FAILED = 2;

    /**
     * Partial character sequence at end of input.
    */
    int PARTIAL_INPUT = 3;

    /**
     * URI is invalid.
    */
    int BAD_URI = 4;

    /**
     * Pathname is not an absolute path.
    */
    int NOT_ABSOLUTE_PATH = 5;

    /**
     * No memory available. Since: 2.40
    */
    int NO_MEMORY = 6;

    /**
     * An embedded NUL character is present in
     * <br>    conversion output where a NUL-terminated string is expected.
     * <br>    Since: 2.56
    */
    int EMBEDDED_NUL = 7;

}

/*
enumeration-type
*/
