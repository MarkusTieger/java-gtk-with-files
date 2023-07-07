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
public interface AccessibleAutocomplete {

    /**
     * Automatic suggestions are not displayed.
    */
    int NONE = 0;

    /**
     * When a user is providing input, text
     * <br>   suggesting one way to complete the provided input may be dynamically
     * <br>   inserted after the caret.
    */
    int INLINE = 1;

    /**
     * When a user is providing input, an element
     * <br>   containing a collection of values that could complete the provided input
     * <br>   may be displayed.
    */
    int LIST = 2;

    /**
     * When a user is providing input, an element
     * <br>   containing a collection of values that could complete the provided input
     * <br>   may be displayed. If displayed, one value in the collection is automatically
     * <br>   selected, and the text needed to complete the automatically selected value
     * <br>   appears after the caret in the input.
    */
    int BOTH = 3;

}

/*
enumeration-type
*/
