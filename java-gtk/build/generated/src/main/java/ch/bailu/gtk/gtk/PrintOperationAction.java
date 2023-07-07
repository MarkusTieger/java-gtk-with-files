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
public interface PrintOperationAction {

    /**
     * Show the print dialog.
    */
    int PRINT_DIALOG = 0;

    /**
     * Start to print without showing
     * <br>  the print dialog, based on the current print settings.
    */
    int PRINT = 1;

    /**
     * Show the print preview.
    */
    int PREVIEW = 2;

    /**
     * Export to a file. This requires
     * <br>  the export-filename property to be set.
    */
    int EXPORT = 3;

}

/*
enumeration-type
*/
