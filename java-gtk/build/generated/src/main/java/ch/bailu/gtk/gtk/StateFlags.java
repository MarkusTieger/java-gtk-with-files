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
public interface StateFlags {

    /**
     * State during normal operation
    */
    int NORMAL = 0;

    /**
     * Widget is active
    */
    int ACTIVE = 1;

    /**
     * Widget has a mouse pointer over it
    */
    int PRELIGHT = 2;

    /**
     * Widget is selected
    */
    int SELECTED = 4;

    /**
     * Widget is insensitive
    */
    int INSENSITIVE = 8;

    /**
     * Widget is inconsistent
    */
    int INCONSISTENT = 16;

    /**
     * Widget has the keyboard focus
    */
    int FOCUSED = 32;

    /**
     * Widget is in a background toplevel window
    */
    int BACKDROP = 64;

    /**
     * Widget is in left-to-right text direction
    */
    int DIR_LTR = 128;

    /**
     * Widget is in right-to-left text direction
    */
    int DIR_RTL = 256;

    /**
     * Widget is a link
    */
    int LINK = 512;

    /**
     * The location the widget points to has already been visited
    */
    int VISITED = 1024;

    /**
     * Widget is checked
    */
    int CHECKED = 2048;

    /**
     * Widget is highlighted as a drop target for DND
    */
    int DROP_ACTIVE = 4096;

    /**
     * Widget has the visible focus
    */
    int FOCUS_VISIBLE = 8192;

    /**
     * Widget contains the keyboard focus
    */
    int FOCUS_WITHIN = 16384;

}

/*
enumeration-type
*/
