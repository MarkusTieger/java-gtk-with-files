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
public interface TlsCertificateFlags {

    /**
     * No flags set. Since: 2.74
    */
    int NO_FLAGS = 0;

    /**
     * The signing certificate authority is
     * <br>  not known.
    */
    int UNKNOWN_CA = 1;

    /**
     * The certificate does not match the
     * <br>  expected identity of the site that it was retrieved from.
    */
    int BAD_IDENTITY = 2;

    /**
     * The certificate's activation time
     * <br>  is still in the future
    */
    int NOT_ACTIVATED = 4;

    /**
     * The certificate has expired
    */
    int EXPIRED = 8;

    /**
     * The certificate has been revoked
     * <br>  according to the &#35;GTlsConnection's certificate revocation list.
    */
    int REVOKED = 16;

    /**
     * The certificate's algorithm is
     * <br>  considered insecure.
    */
    int INSECURE = 32;

    /**
     * Some other error occurred validating
     * <br>  the certificate
    */
    int GENERIC_ERROR = 64;

    /**
     * the combination of all of the above
     * <br>  flags
    */
    int VALIDATE_ALL = 127;

}

/*
enumeration-type
*/
