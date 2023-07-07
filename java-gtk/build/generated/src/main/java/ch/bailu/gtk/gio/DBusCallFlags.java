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
public interface DBusCallFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * The bus must not launch
     * <br>an owner for the destination name in response to this method
     * <br>invocation.
    */
    int NO_AUTO_START = 1;

    /**
     * the caller is prepared to
     * <br>wait for interactive authorization. Since 2.46.
    */
    int ALLOW_INTERACTIVE_AUTHORIZATION = 2;

}

/*
enumeration-type
*/
