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
public interface TlsInteractionResult {

    /**
     * The interaction was unhandled (i.e. not
     * <br>    implemented).
    */
    int UNHANDLED = 0;

    /**
     * The interaction completed, and resulting data
     * <br>    is available.
    */
    int HANDLED = 1;

    /**
     * The interaction has failed, or was cancelled.
     * <br>    and the operation should be aborted.
    */
    int FAILED = 2;

}

/*
enumeration-type
*/
