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
public interface SorterOrder {

    /**
     * A partial order. Any `GtkOrdering` is possible.
    */
    int PARTIAL = 0;

    /**
     * No order, all elements are considered equal.
     * <br>  gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL.
    */
    int NONE = 1;

    /**
     * A total order. gtk_sorter_compare() will only
     * <br>  return %GTK_ORDERING_EQUAL if an item is compared with itself. Two
     * <br>  different items will never cause this value to be returned.
    */
    int TOTAL = 2;

}

/*
enumeration-type
*/
