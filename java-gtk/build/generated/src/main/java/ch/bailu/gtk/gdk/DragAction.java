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
public interface DragAction {

    /**
     * Copy the data.
    */
    int COPY = 1;

    /**
     * Move the data, i.e. first copy it, then delete
     * <br>  it from the source using the DELETE target of the X selection protocol.
    */
    int MOVE = 2;

    /**
     * Add a link to the data. Note that this is only
     * <br>  useful if source and destination agree on what it means, and is not
     * <br>  supported on all platforms.
    */
    int LINK = 4;

    /**
     * Ask the user what to do with the data.
    */
    int ASK = 8;

}

/*
enumeration-type
*/
