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
public interface ApplicationInhibitFlags {

    /**
     * Inhibit ending the user session
     * <br>  by logging out or by shutting down the computer
    */
    int LOGOUT = 1;

    /**
     * Inhibit user switching
    */
    int SWITCH = 2;

    /**
     * Inhibit suspending the
     * <br>  session or computer
    */
    int SUSPEND = 4;

    /**
     * Inhibit the session being
     * <br>  marked as idle (and possibly locked)
    */
    int IDLE = 8;

}

/*
enumeration-type
*/
