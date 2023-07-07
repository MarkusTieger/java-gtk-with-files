/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface MainContextFlags {

    /**
     * Default behaviour.
    */
    int NONE = 0;

    /**
     * Assume that polling for events will
     * <br>free the thread to process other jobs. That's useful if you're using
     * <br>`g_main_context_{prepare,query,check,dispatch}` to integrate GMainContext in
     * <br>other event loops.
    */
    int OWNERLESS_POLLING = 1;

}

/*
enumeration-type
*/
