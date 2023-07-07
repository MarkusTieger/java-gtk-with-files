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
public interface SorterChange {

    /**
     * The sorter change cannot be described
     * <br>  by any of the other enumeration values
    */
    int DIFFERENT = 0;

    /**
     * The sort order was inverted. Comparisons
     * <br>  that returned %GTK_ORDERING_SMALLER now return %GTK_ORDERING_LARGER
     * <br>  and vice versa. Other comparisons return the same values as before.
    */
    int INVERTED = 1;

    /**
     * The sorter is less strict: Comparisons
     * <br>  may now return %GTK_ORDERING_EQUAL that did not do so before.
    */
    int LESS_STRICT = 2;

    /**
     * The sorter is more strict: Comparisons
     * <br>  that did return %GTK_ORDERING_EQUAL may not do so anymore.
    */
    int MORE_STRICT = 3;

}

/*
enumeration-type
*/
