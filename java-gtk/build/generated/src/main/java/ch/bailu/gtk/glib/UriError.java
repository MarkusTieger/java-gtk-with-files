/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface UriError {

    /**
     * Generic error if no more specific error is available.
     * <br>    See the error message for details.
    */
    int FAILED = 0;

    /**
     * The scheme of a URI could not be parsed.
    */
    int BAD_SCHEME = 1;

    /**
     * The user/userinfo of a URI could not be parsed.
    */
    int BAD_USER = 2;

    /**
     * The password of a URI could not be parsed.
    */
    int BAD_PASSWORD = 3;

    /**
     * The authentication parameters of a URI could not be parsed.
    */
    int BAD_AUTH_PARAMS = 4;

    /**
     * The host of a URI could not be parsed.
    */
    int BAD_HOST = 5;

    /**
     * The port of a URI could not be parsed.
    */
    int BAD_PORT = 6;

    /**
     * The path of a URI could not be parsed.
    */
    int BAD_PATH = 7;

    /**
     * The query of a URI could not be parsed.
    */
    int BAD_QUERY = 8;

    /**
     * The fragment of a URI could not be parsed.
    */
    int BAD_FRAGMENT = 9;

}

/*
enumeration-type
*/
