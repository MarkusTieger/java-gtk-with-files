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
public interface StringFilterMatchMode {

    /**
     * The search string and
     * <br>  text must match exactly.
    */
    int EXACT = 0;

    /**
     * The search string
     * <br>  must be contained as a substring inside the text.
    */
    int SUBSTRING = 1;

    /**
     * The text must begin
     * <br>  with the search string.
    */
    int PREFIX = 2;

}

/*
enumeration-type
*/
