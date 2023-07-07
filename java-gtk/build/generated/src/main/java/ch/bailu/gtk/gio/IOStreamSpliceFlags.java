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
public interface IOStreamSpliceFlags {

    /**
     * Do not close either stream.
    */
    int NONE = 0;

    /**
     * Close the first stream after
     * <br>    the splice.
    */
    int CLOSE_STREAM1 = 1;

    /**
     * Close the second stream after
     * <br>    the splice.
    */
    int CLOSE_STREAM2 = 2;

    /**
     * Wait for both splice operations to finish
     * <br>    before calling the callback.
    */
    int WAIT_FOR_BOTH = 4;

}

/*
enumeration-type
*/
