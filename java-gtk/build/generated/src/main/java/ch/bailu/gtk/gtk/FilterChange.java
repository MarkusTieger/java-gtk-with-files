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
public interface FilterChange {

    /**
     * The filter change cannot be
     * <br>  described with any of the other enumeration values.
    */
    int DIFFERENT = 0;

    /**
     * The filter is less strict than
     * <br>  it was before: All items that it used to return %TRUE for
     * <br>  still return %TRUE, others now may, too.
    */
    int LESS_STRICT = 1;

    /**
     * The filter is more strict than
     * <br>  it was before: All items that it used to return %FALSE for
     * <br>  still return %FALSE, others now may, too.
    */
    int MORE_STRICT = 2;

}

/*
enumeration-type
*/
