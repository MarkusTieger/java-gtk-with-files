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
public interface ErrorType {

    /**
     * unknown error
    */
    int UNKNOWN = 0;

    /**
     * unexpected end of file
    */
    int UNEXP_EOF = 1;

    /**
     * unterminated string constant
    */
    int UNEXP_EOF_IN_STRING = 2;

    /**
     * unterminated comment
    */
    int UNEXP_EOF_IN_COMMENT = 3;

    /**
     * non-digit character in a number
    */
    int NON_DIGIT_IN_CONST = 4;

    /**
     * digit beyond radix in a number
    */
    int DIGIT_RADIX = 5;

    /**
     * non-decimal floating point number
    */
    int FLOAT_RADIX = 6;

    /**
     * malformed floating point number
    */
    int FLOAT_MALFORMED = 7;

}

/*
enumeration-type
*/
