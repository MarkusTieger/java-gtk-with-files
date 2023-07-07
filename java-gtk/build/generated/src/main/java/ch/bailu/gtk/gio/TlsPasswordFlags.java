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
public interface TlsPasswordFlags {

    /**
     * No flags
    */
    int NONE = 0;

    /**
     * The password was wrong, and the user should retry.
    */
    int RETRY = 2;

    /**
     * Hint to the user that the password has been
     * <br>   wrong many times, and the user may not have many chances left.
    */
    int MANY_TRIES = 4;

    /**
     * Hint to the user that this is the last try to get
     * <br>   this password right.
    */
    int FINAL_TRY = 8;

    /**
     * For PKCS &#35;11, the user PIN is required.
     * <br>   Since: 2.70.
    */
    int PKCS11_USER = 16;

    /**
     * For PKCS &#35;11, the security officer
     * <br>   PIN is required. Since: 2.70.
    */
    int PKCS11_SECURITY_OFFICER = 32;

    /**
     * For PKCS &#35;11, the context-specific
     * <br>   PIN is required. Since: 2.70.
    */
    int PKCS11_CONTEXT_SPECIFIC = 64;

}

/*
enumeration-type
*/
