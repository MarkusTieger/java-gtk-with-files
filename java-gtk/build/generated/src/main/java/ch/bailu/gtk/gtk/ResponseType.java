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
public interface ResponseType {

    /**
     * Returned if an action widget has no response id,
     * <br>  or if the dialog gets programmatically hidden or destroyed
    */
    int NONE = -1;

    /**
     * Generic response id, not used by GTK dialogs
    */
    int REJECT = -2;

    /**
     * Generic response id, not used by GTK dialogs
    */
    int ACCEPT = -3;

    /**
     * Returned if the dialog is deleted
    */
    int DELETE_EVENT = -4;

    /**
     * Returned by OK buttons in GTK dialogs
    */
    int OK = -5;

    /**
     * Returned by Cancel buttons in GTK dialogs
    */
    int CANCEL = -6;

    /**
     * Returned by Close buttons in GTK dialogs
    */
    int CLOSE = -7;

    /**
     * Returned by Yes buttons in GTK dialogs
    */
    int YES = -8;

    /**
     * Returned by No buttons in GTK dialogs
    */
    int NO = -9;

    /**
     * Returned by Apply buttons in GTK dialogs
    */
    int APPLY = -10;

    /**
     * Returned by Help buttons in GTK dialogs
    */
    int HELP = -11;

}

/*
enumeration-type
*/
