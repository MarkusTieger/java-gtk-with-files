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
public interface SocketMsgFlags {

    /**
     * No flags.
    */
    int NONE = 0;

    /**
     * Request to send/receive out of band data.
    */
    int OOB = 1;

    /**
     * Read data from the socket without removing it from
     * <br>    the queue.
    */
    int PEEK = 2;

    /**
     * Don't use a gateway to send out the packet,
     * <br>    only send to hosts on directly connected networks.
    */
    int DONTROUTE = 4;

}

/*
enumeration-type
*/
