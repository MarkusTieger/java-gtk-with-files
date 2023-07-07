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
public interface DBusMessageFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * A reply is not expected.
    */
    int NO_REPLY_EXPECTED = 1;

    /**
     * The bus must not launch an
     * <br>owner for the destination name in response to this message.
    */
    int NO_AUTO_START = 2;

    /**
     * If set on a method
     * <br>call, this flag means that the caller is prepared to wait for interactive
     * <br>authorization. Since 2.46.
    */
    int ALLOW_INTERACTIVE_AUTHORIZATION = 4;

}

/*
enumeration-type
*/
