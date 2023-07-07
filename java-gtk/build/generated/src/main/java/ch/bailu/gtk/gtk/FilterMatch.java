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
public interface FilterMatch {

    /**
     * The filter matches some items,
     * <br>  gtk_filter_match() may return %TRUE or %FALSE
    */
    int SOME = 0;

    /**
     * The filter does not match any item,
     * <br>  gtk_filter_match() will always return %FALSE.
    */
    int NONE = 1;

    /**
     * The filter matches all items,
     * <br>  gtk_filter_match() will alays return %TRUE.
    */
    int ALL = 2;

}

/*
enumeration-type
*/
