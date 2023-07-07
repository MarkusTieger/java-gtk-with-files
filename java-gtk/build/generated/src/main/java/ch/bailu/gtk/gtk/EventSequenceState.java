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
public interface EventSequenceState {

    /**
     * The sequence is handled, but not grabbed.
    */
    int NONE = 0;

    /**
     * The sequence is handled and grabbed.
    */
    int CLAIMED = 1;

    /**
     * The sequence is denied.
    */
    int DENIED = 2;

}

/*
enumeration-type
*/
