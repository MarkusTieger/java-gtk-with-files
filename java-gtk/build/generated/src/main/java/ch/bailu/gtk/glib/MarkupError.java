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
public interface MarkupError {

    /**
     * text being parsed was not valid UTF-8
    */
    int BAD_UTF8 = 0;

    /**
     * document contained nothing, or only whitespace
    */
    int EMPTY = 1;

    /**
     * document was ill-formed
    */
    int PARSE = 2;

    /**
     * error should be set by &#35;GMarkupParser
     * <br>    functions; element wasn't known
    */
    int UNKNOWN_ELEMENT = 3;

    /**
     * error should be set by &#35;GMarkupParser
     * <br>    functions; attribute wasn't known
    */
    int UNKNOWN_ATTRIBUTE = 4;

    /**
     * error should be set by &#35;GMarkupParser
     * <br>    functions; content was invalid
    */
    int INVALID_CONTENT = 5;

    /**
     * error should be set by &#35;GMarkupParser
     * <br>    functions; a required attribute was missing
    */
    int MISSING_ATTRIBUTE = 6;

}

/*
enumeration-type
*/
