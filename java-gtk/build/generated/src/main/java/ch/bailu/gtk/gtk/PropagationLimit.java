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
public interface PropagationLimit {

    /**
     * Events are handled regardless of what their
     * <br>  target is.
    */
    int NONE = 0;

    /**
     * Events are only handled if their target
     * <br>  is in the same [iface&#64;Native] as the event controllers widget. Note
     * <br>  that some event types have two targets (origin and destination).
    */
    int SAME_NATIVE = 1;

}

/*
enumeration-type
*/
