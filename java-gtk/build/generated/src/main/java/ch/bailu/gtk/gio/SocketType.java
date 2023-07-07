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
public interface SocketType {

    /**
     * Type unknown or wrong
    */
    int INVALID = 0;

    /**
     * Reliable connection-based byte streams (e.g. TCP).
    */
    int STREAM = 1;

    /**
     * Connectionless, unreliable datagram passing.
     * <br>    (e.g. UDP)
    */
    int DATAGRAM = 2;

    /**
     * Reliable connection-based passing of datagrams
     * <br>    of fixed maximum length (e.g. SCTP).
    */
    int SEQPACKET = 3;

}

/*
enumeration-type
*/
