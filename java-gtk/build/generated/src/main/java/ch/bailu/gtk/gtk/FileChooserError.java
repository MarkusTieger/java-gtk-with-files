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
public interface FileChooserError {

    /**
     * Indicates that a file does not exist.
    */
    int NONEXISTENT = 0;

    /**
     * Indicates a malformed filename.
    */
    int BAD_FILENAME = 1;

    /**
     * Indicates a duplicate path (e.g. when
     * <br> adding a bookmark).
    */
    int ALREADY_EXISTS = 2;

    /**
     * Indicates an incomplete hostname
     * <br> (e.g. &quot;http://foo&quot; without a slash after that).
    */
    int INCOMPLETE_HOSTNAME = 3;

}

/*
enumeration-type
*/
