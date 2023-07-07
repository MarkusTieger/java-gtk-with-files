/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface TouchpadGesturePhase {

    /**
     * The gesture has begun.
    */
    int BEGIN = 0;

    /**
     * The gesture has been updated.
    */
    int UPDATE = 1;

    /**
     * The gesture was finished, changes
     * <br>  should be permanently applied.
    */
    int END = 2;

    /**
     * The gesture was cancelled, all
     * <br>  changes should be undone.
    */
    int CANCEL = 3;

}

/*
enumeration-type
*/
