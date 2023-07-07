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
public interface AccessibleState {

    /**
     * A “busy” state. This state has boolean values
    */
    int BUSY = 0;

    /**
     * A “checked” state; indicates the current
     * <br>  state of a [class&#64;CheckButton]. Value type: [enum&#64;AccessibleTristate]
    */
    int CHECKED = 1;

    /**
     * A “disabled” state; corresponds to the
     * <br>  [property&#64;Widget:sensitive] property. It indicates a UI element
     * <br>  that is perceivable, but not editable or operable. Value type: boolean
    */
    int DISABLED = 2;

    /**
     * An “expanded” state; corresponds to the
     * <br>  [property&#64;Expander:expanded] property. Value type: boolean
     * <br>  or undefined
    */
    int EXPANDED = 3;

    /**
     * A “hidden” state; corresponds to the
     * <br>  [property&#64;Widget:visible] property. You can use this state
     * <br>  explicitly on UI elements that should not be exposed to an assistive
     * <br>  technology. Value type: boolean
     * <br>  See also: %GTK_ACCESSIBLE_STATE_DISABLED
    */
    int HIDDEN = 4;

    /**
     * An “invalid” state; set when a widget
     * <br>  is showing an error. Value type: [enum&#64;AccessibleInvalidState]
    */
    int INVALID = 5;

    /**
     * A “pressed” state; indicates the current
     * <br>  state of a [class&#64;ToggleButton]. Value type: [enum&#64;AccessibleTristate]
     * <br>  enumeration
    */
    int PRESSED = 6;

    /**
     * A “selected” state; set when a widget
     * <br>  is selected. Value type: boolean or undefined
    */
    int SELECTED = 7;

}

/*
enumeration-type
*/
