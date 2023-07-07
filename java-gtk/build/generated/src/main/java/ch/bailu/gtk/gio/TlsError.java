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
public interface TlsError {

    /**
     * No TLS provider is available
    */
    int UNAVAILABLE = 0;

    /**
     * Miscellaneous TLS error
    */
    int MISC = 1;

    /**
     * The certificate presented could not
     * <br>  be parsed or failed validation.
    */
    int BAD_CERTIFICATE = 2;

    /**
     * The TLS handshake failed because the
     * <br>  peer does not seem to be a TLS server.
    */
    int NOT_TLS = 3;

    /**
     * The TLS handshake failed because the
     * <br>  peer's certificate was not acceptable.
    */
    int HANDSHAKE = 4;

    /**
     * The TLS handshake failed because
     * <br>  the server requested a client-side certificate, but none was
     * <br>  provided. See g_tls_connection_set_certificate().
    */
    int CERTIFICATE_REQUIRED = 5;

    /**
     * The TLS connection was closed without proper
     * <br>  notice, which may indicate an attack. See
     * <br>  g_tls_connection_set_require_close_notify().
    */
    int EOF = 6;

    /**
     * The TLS handshake failed
     * <br>  because the client sent the fallback SCSV, indicating a protocol
     * <br>  downgrade attack. Since: 2.60
    */
    int INAPPROPRIATE_FALLBACK = 7;

    /**
     * The certificate failed
     * <br>  to load because a password was incorrect. Since: 2.72
    */
    int BAD_CERTIFICATE_PASSWORD = 8;

}

/*
enumeration-type
*/
