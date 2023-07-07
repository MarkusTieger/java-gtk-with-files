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
public interface SelectionMode {

    /**
     * No selection is possible.
    */
    int NONE = 0;

    /**
     * Zero or one element may be selected.
    */
    int SINGLE = 1;

    /**
     * Exactly one element is selected.
     * <br>  In some circumstances, such as initially or during a search
     * <br>  operation, it’s possible for no element to be selected with
     * <br>  %GTK_SELECTION_BROWSE. What is really enforced is that the user
     * <br>  can’t deselect a currently selected element except by selecting
     * <br>  another element.
    */
    int BROWSE = 2;

    /**
     * Any number of elements may be selected.
     * <br>  The Ctrl key may be used to enlarge the selection, and Shift
     * <br>  key to select between the focus and the child pointed to.
     * <br>  Some widgets may also allow Click-drag to select a range of elements.
    */
    int MULTIPLE = 3;

}

/*
enumeration-type
*/
