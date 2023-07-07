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
public interface PrintOperationResult {

    /**
     * An error has occurred.
    */
    int ERROR = 0;

    /**
     * The print settings should be stored.
    */
    int APPLY = 1;

    /**
     * The print operation has been canceled,
     * <br>  the print settings should not be stored.
    */
    int CANCEL = 2;

    /**
     * The print operation is not complete
     * <br>  yet. This value will only be returned when running asynchronously.
    */
    int IN_PROGRESS = 3;

}

/*
enumeration-type
*/
