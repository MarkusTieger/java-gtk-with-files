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
public interface SocketClientEvent {

    /**
     * The client is doing a DNS lookup.
    */
    int RESOLVING = 0;

    /**
     * The client has completed a DNS lookup.
    */
    int RESOLVED = 1;

    /**
     * The client is connecting to a remote
     * <br>  host (either a proxy or the destination server).
    */
    int CONNECTING = 2;

    /**
     * The client has connected to a remote
     * <br>  host.
    */
    int CONNECTED = 3;

    /**
     * The client is negotiating
     * <br>  with a proxy to connect to the destination server.
    */
    int PROXY_NEGOTIATING = 4;

    /**
     * The client has negotiated
     * <br>  with the proxy server.
    */
    int PROXY_NEGOTIATED = 5;

    /**
     * The client is performing a
     * <br>  TLS handshake.
    */
    int TLS_HANDSHAKING = 6;

    /**
     * The client has performed a
     * <br>  TLS handshake.
    */
    int TLS_HANDSHAKED = 7;

    /**
     * The client is done with a particular
     * <br>  &#35;GSocketConnectable.
    */
    int COMPLETE = 8;

}

/*
enumeration-type
*/
