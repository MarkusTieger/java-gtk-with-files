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
public interface CellRendererMode {

    /**
     * The cell is just for display
     * <br> and cannot be interacted with.  Note that this doesn’t mean that eg. the
     * <br> row being drawn can’t be selected -- just that a particular element of
     * <br> it cannot be individually modified.
    */
    int INERT = 0;

    /**
     * The cell can be clicked.
    */
    int ACTIVATABLE = 1;

    /**
     * The cell can be edited or otherwise modified.
    */
    int EDITABLE = 2;

}

/*
enumeration-type
*/
