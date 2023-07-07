/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface MountOperationResult {

    /**
     * The request was fulfilled and the
     * <br>    user specified data is now available
    */
    int HANDLED = 0;

    /**
     * The user requested the mount operation
     * <br>    to be aborted
    */
    int ABORTED = 1;

    /**
     * The request was unhandled (i.e. not
     * <br>    implemented)
    */
    int UNHANDLED = 2;

}

/*
enumeration-type
*/
