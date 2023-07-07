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
public interface TlsProtocolVersion {

    /**
     * No protocol version or unknown protocol version
    */
    int UNKNOWN = 0;

    /**
     * SSL 3.0, which is insecure and should not be used
    */
    int SSL_3_0 = 1;

    /**
     * TLS 1.0, which is insecure and should not be used
    */
    int TLS_1_0 = 2;

    /**
     * TLS 1.1, which is insecure and should not be used
    */
    int TLS_1_1 = 3;

    /**
     * TLS 1.2, defined by [RFC 5246](https://datatracker.ietf.org/doc/html/rfc5246)
    */
    int TLS_1_2 = 4;

    /**
     * TLS 1.3, defined by [RFC 8446](https://datatracker.ietf.org/doc/html/rfc8446)
    */
    int TLS_1_3 = 5;

    /**
     * DTLS 1.0, which is insecure and should not be used
    */
    int DTLS_1_0 = 201;

    /**
     * DTLS 1.2, defined by [RFC 6347](https://datatracker.ietf.org/doc/html/rfc6347)
    */
    int DTLS_1_2 = 202;

}

/*
enumeration-type
*/
