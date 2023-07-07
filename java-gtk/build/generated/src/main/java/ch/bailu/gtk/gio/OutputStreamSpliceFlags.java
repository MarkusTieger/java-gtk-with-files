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
public interface OutputStreamSpliceFlags {

    /**
     * Do not close either stream.
    */
    int NONE = 0;

    /**
     * Close the source stream after
     * <br>    the splice.
    */
    int CLOSE_SOURCE = 1;

    /**
     * Close the target stream after
     * <br>    the splice.
    */
    int CLOSE_TARGET = 2;

}

/*
enumeration-type
*/
