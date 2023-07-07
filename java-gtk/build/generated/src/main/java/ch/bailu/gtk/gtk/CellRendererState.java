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
public interface CellRendererState {

    /**
     * The cell is currently selected, and
     * <br> probably has a selection colored background to render to.
    */
    int SELECTED = 1;

    /**
     * The mouse is hovering over the cell.
    */
    int PRELIT = 2;

    /**
     * The cell is drawn in an insensitive manner
    */
    int INSENSITIVE = 4;

    /**
     * The cell is in a sorted row
    */
    int SORTED = 8;

    /**
     * The cell is in the focus row.
    */
    int FOCUSED = 16;

    /**
     * The cell is in a row that can be expanded
    */
    int EXPANDABLE = 32;

    /**
     * The cell is in a row that is expanded
    */
    int EXPANDED = 64;

}

/*
enumeration-type
*/
