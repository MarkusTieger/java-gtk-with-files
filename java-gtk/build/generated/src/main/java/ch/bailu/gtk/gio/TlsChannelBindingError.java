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
public interface TlsChannelBindingError {

    /**
     * Either entire binding
     * <br>   retrieval facility or specific binding type is not implemented in the
     * <br>   TLS backend.
    */
    int NOT_IMPLEMENTED = 0;

    /**
     * The handshake is not yet
     * <br>   complete on the connection which is a strong requirement for any existing
     * <br>   binding type.
    */
    int INVALID_STATE = 1;

    /**
     * Handshake is complete but
     * <br>   binding data is not available. That normally indicates the TLS
     * <br>   implementation failed to provide the binding data. For example, some
     * <br>   implementations do not provide a peer certificate for resumed connections.
    */
    int NOT_AVAILABLE = 2;

    /**
     * Binding type is not supported
     * <br>   on the current connection. This error could be triggered when requesting
     * <br>   `tls-server-end-point` binding data for a certificate which has no hash
     * <br>   function or uses multiple hash functions.
    */
    int NOT_SUPPORTED = 3;

    /**
     * Any other backend error
     * <br>   preventing binding data retrieval.
    */
    int GENERAL_ERROR = 4;

}

/*
enumeration-type
*/
