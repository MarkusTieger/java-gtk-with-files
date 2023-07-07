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
public interface SpinButtonUpdatePolicy {

    /**
     * When refreshing your `GtkSpinButton`, the value is
     * <br>  always displayed
    */
    int ALWAYS = 0;

    /**
     * When refreshing your `GtkSpinButton`, the value is
     * <br>  only displayed if it is valid within the bounds of the spin button's
     * <br>  adjustment
    */
    int IF_VALID = 1;

}

/*
enumeration-type
*/
