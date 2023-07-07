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
public interface ConnectFlags {

    /**
     * Default behaviour (no special flags). Since: 2.74
    */
    int DEFAULT = 0;

    /**
     * If set, the handler should be called after the
     * <br> default handler of the signal. Normally, the handler is called before
     * <br> the default handler.
    */
    int AFTER = 1;

    /**
     * If set, the instance and data should be swapped when
     * <br> calling the handler; see g_signal_connect_swapped() for an example.
    */
    int SWAPPED = 2;

}

/*
enumeration-type
*/
