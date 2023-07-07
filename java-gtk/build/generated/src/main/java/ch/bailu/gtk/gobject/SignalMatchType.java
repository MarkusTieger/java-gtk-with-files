/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface SignalMatchType {

    /**
     * The signal id must be equal.
    */
    int ID = 1;

    /**
     * The signal detail must be equal.
    */
    int DETAIL = 2;

    /**
     * The closure must be the same.
    */
    int CLOSURE = 4;

    /**
     * The C closure callback must be the same.
    */
    int FUNC = 8;

    /**
     * The closure data must be the same.
    */
    int DATA = 16;

    /**
     * Only unblocked signals may be matched.
    */
    int UNBLOCKED = 32;

}

/*
enumeration-type
*/
