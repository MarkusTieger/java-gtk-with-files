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
public interface AccessibleRelation {

    /**
     * Identifies the currently active
     * <br>   element when focus is on a composite widget, combobox, textbox, group,
     * <br>   or application. Value type: reference
    */
    int ACTIVE_DESCENDANT = 0;

    /**
     * Defines the total number of columns
     * <br>   in a table, grid, or treegrid. Value type: integer
    */
    int COL_COUNT = 1;

    /**
     * Defines an element's column index or
     * <br>   position with respect to the total number of columns within a table,
     * <br>   grid, or treegrid. Value type: integer
    */
    int COL_INDEX = 2;

    /**
     * Defines a human readable text
     * <br>  alternative of %GTK_ACCESSIBLE_RELATION_COL_INDEX. Value type: string
    */
    int COL_INDEX_TEXT = 3;

    /**
     * Defines the number of columns spanned
     * <br>  by a cell or gridcell within a table, grid, or treegrid. Value type: integer
    */
    int COL_SPAN = 4;

    /**
     * Identifies the element (or elements) whose
     * <br>   contents or presence are controlled by the current element. Value type: reference
    */
    int CONTROLS = 5;

    /**
     * Identifies the element (or elements)
     * <br>   that describes the object. Value type: reference
    */
    int DESCRIBED_BY = 6;

    /**
     * Identifies the element (or elements) that
     * <br>   provide additional information related to the object. Value type: reference
    */
    int DETAILS = 7;

    /**
     * Identifies the element that provides
     * <br>   an error message for an object. Value type: reference
    */
    int ERROR_MESSAGE = 8;

    /**
     * Identifies the next element (or elements)
     * <br>   in an alternate reading order of content which, at the user's discretion,
     * <br>   allows assistive technology to override the general default of reading in
     * <br>   document source order. Value type: reference
    */
    int FLOW_TO = 9;

    /**
     * Identifies the element (or elements)
     * <br>   that labels the current element. Value type: reference
    */
    int LABELLED_BY = 10;

    /**
     * Identifies an element (or elements) in order
     * <br>   to define a visual, functional, or contextual parent/child relationship
     * <br>   between elements where the widget hierarchy cannot be used to represent
     * <br>   the relationship. Value type: reference
    */
    int OWNS = 11;

    /**
     * Defines an element's number or position
     * <br>   in the current set of listitems or treeitems. Value type: integer
    */
    int POS_IN_SET = 12;

    /**
     * Defines the total number of rows in a table,
     * <br>   grid, or treegrid. Value type: integer
    */
    int ROW_COUNT = 13;

    /**
     * Defines an element's row index or position
     * <br>   with respect to the total number of rows within a table, grid, or treegrid.
     * <br>   Value type: integer
    */
    int ROW_INDEX = 14;

    /**
     * Defines a human readable text
     * <br>   alternative of aria-rowindex. Value type: string
    */
    int ROW_INDEX_TEXT = 15;

    /**
     * Defines the number of rows spanned by a
     * <br>   cell or gridcell within a table, grid, or treegrid. Value type: integer
    */
    int ROW_SPAN = 16;

    /**
     * Defines the number of items in the current
     * <br>   set of listitems or treeitems. Value type: integer
    */
    int SET_SIZE = 17;

}

/*
enumeration-type
*/
