/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface DBusObjectManagerClientFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * If not set and the
     * <br>  manager is for a well-known name, then request the bus to launch
     * <br>  an owner for the name if no-one owns the name. This flag can only
     * <br>  be used in managers for well-known names.
    */
    int DO_NOT_AUTO_START = 1;

}

/*
enumeration-type
*/
