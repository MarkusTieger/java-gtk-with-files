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
public interface AskPasswordFlags {

    /**
     * operation requires a password.
    */
    int NEED_PASSWORD = 1;

    /**
     * operation requires a username.
    */
    int NEED_USERNAME = 2;

    /**
     * operation requires a domain.
    */
    int NEED_DOMAIN = 4;

    /**
     * operation supports saving settings.
    */
    int SAVING_SUPPORTED = 8;

    /**
     * operation supports anonymous users.
    */
    int ANONYMOUS_SUPPORTED = 16;

    /**
     * operation takes TCRYPT parameters (Since: 2.58)
    */
    int TCRYPT = 32;

}

/*
enumeration-type
*/
