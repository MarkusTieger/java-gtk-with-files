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
public interface FileChooserAction {

    /**
     * Indicates open mode.  The file chooser
     * <br> will only let the user pick an existing file.
    */
    int OPEN = 0;

    /**
     * Indicates save mode.  The file chooser
     * <br> will let the user pick an existing file, or type in a new
     * <br> filename.
    */
    int SAVE = 1;

    /**
     * Indicates an Open mode for
     * <br> selecting folders.  The file chooser will let the user pick an
     * <br> existing folder.
    */
    int SELECT_FOLDER = 2;

}

/*
enumeration-type
*/
