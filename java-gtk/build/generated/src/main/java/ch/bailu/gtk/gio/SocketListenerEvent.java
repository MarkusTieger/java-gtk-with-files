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
public interface SocketListenerEvent {

    /**
     * The listener is about to bind a socket.
    */
    int BINDING = 0;

    /**
     * The listener has bound a socket.
    */
    int BOUND = 1;

    /**
     * The listener is about to start
     * <br>   listening on this socket.
    */
    int LISTENING = 2;

    /**
     * The listener is now listening on
     * <br>  this socket.
    */
    int LISTENED = 3;

}

/*
enumeration-type
*/
