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
public interface AccessibleProperty {

    /**
     * Indicates whether inputting text
     * <br>   could trigger display of one or more predictions of the user's intended
     * <br>   value for a combobox, searchbox, or textbox and specifies how predictions
     * <br>   would be presented if they were made. Value type: [enum&#64;AccessibleAutocomplete]
    */
    int AUTOCOMPLETE = 0;

    /**
     * Defines a string value that describes
     * <br>   or annotates the current element. Value type: string
    */
    int DESCRIPTION = 1;

    /**
     * Indicates the availability and type of
     * <br>   interactive popup element, such as menu or dialog, that can be triggered
     * <br>   by an element.
    */
    int HAS_POPUP = 2;

    /**
     * Indicates keyboard shortcuts that an
     * <br>   author has implemented to activate or give focus to an element. Value type:
     * <br>   string
    */
    int KEY_SHORTCUTS = 3;

    /**
     * Defines a string value that labels the current
     * <br>   element. Value type: string
    */
    int LABEL = 4;

    /**
     * Defines the hierarchical level of an element
     * <br>   within a structure. Value type: integer
    */
    int LEVEL = 5;

    /**
     * Indicates whether an element is modal when
     * <br>   displayed. Value type: boolean
    */
    int MODAL = 6;

    /**
     * Indicates whether a text box accepts
     * <br>   multiple lines of input or only a single line. Value type: boolean
    */
    int MULTI_LINE = 7;

    /**
     * Indicates that the user may select
     * <br>   more than one item from the current selectable descendants. Value type:
     * <br>   boolean
    */
    int MULTI_SELECTABLE = 8;

    /**
     * Indicates whether the element's
     * <br>   orientation is horizontal, vertical, or unknown/ambiguous. Value type:
     * <br>   [enum&#64;Orientation]
    */
    int ORIENTATION = 9;

    /**
     * Defines a short hint (a word or short
     * <br>   phrase) intended to aid the user with data entry when the control has no
     * <br>   value. A hint could be a sample value or a brief description of the expected
     * <br>   format. Value type: string
    */
    int PLACEHOLDER = 10;

    /**
     * Indicates that the element is not editable,
     * <br>   but is otherwise operable. Value type: boolean
    */
    int READ_ONLY = 11;

    /**
     * Indicates that user input is required on
     * <br>   the element before a form may be submitted. Value type: boolean
    */
    int REQUIRED = 12;

    /**
     * Defines a human-readable,
     * <br>   author-localized description for the role of an element. Value type: string
    */
    int ROLE_DESCRIPTION = 13;

    /**
     * Indicates if items in a table or grid are
     * <br>   sorted in ascending or descending order. Value type: [enum&#64;AccessibleSort]
    */
    int SORT = 14;

    /**
     * Defines the maximum allowed value for a
     * <br>   range widget. Value type: double
    */
    int VALUE_MAX = 15;

    /**
     * Defines the minimum allowed value for a
     * <br>   range widget. Value type: double
    */
    int VALUE_MIN = 16;

    /**
     * Defines the current value for a range widget.
     * <br>   Value type: double
    */
    int VALUE_NOW = 17;

    /**
     * Defines the human readable text alternative
     * <br>   of aria-valuenow for a range widget. Value type: string
    */
    int VALUE_TEXT = 18;

}

/*
enumeration-type
*/
