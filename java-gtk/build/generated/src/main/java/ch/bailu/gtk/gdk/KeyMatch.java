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
public interface KeyMatch {

    /**
     * The key event does not match
    */
    int NONE = 0;

    /**
     * The key event matches if keyboard state
     * <br>  (specifically, the currently active group) is ignored
    */
    int PARTIAL = 1;

    /**
     * The key event matches
    */
    int EXACT = 2;

}

/*
enumeration-type
*/
