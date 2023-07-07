/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This is the subclass of &#35;GSocketConnection that is created
 * <br>for TCP/IP sockets.
 * <p><a href="https://docs.gtk.org/gio/class.TcpConnection.html">https://docs.gtk.org/gio/class.TcpConnection.html</a></p>
*/
public class TcpConnection extends SocketConnection {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TcpConnection.class.getCanonicalName());
    }

    public TcpConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if graceful disconnects are used. See
     * <br>g_tcp_connection_set_graceful_disconnect().
     * @return %TRUE if graceful disconnect is used on close, %FALSE otherwise
    */
    public boolean getGracefulDisconnect()  {
        return JnaTcpConnection.INST().g_tcp_connection_get_graceful_disconnect(asCPointer());
    }

    /**
     * This enables graceful disconnects on close. A graceful disconnect
     * <br>means that we signal the receiving end that the connection is terminated
     * <br>and wait for it to close the connection before closing the connection.
     * <br>
     * <br>A graceful disconnect means that we can be sure that we successfully sent
     * <br>all the outstanding data to the other end, or get an error reported.
     * <br>However, it also means we have to wait for all the data to reach the
     * <br>other side and for it to acknowledge this by closing the socket, which may
     * <br>take a while. For this reason it is disabled by default.
     * @param graceful_disconnect Whether to do graceful disconnects or not
    */
    public void setGracefulDisconnect(boolean graceful_disconnect)  {
        JnaTcpConnection.INST().g_tcp_connection_set_graceful_disconnect(asCPointer(), graceful_disconnect);
    }

    public static long getTypeID() { 
        return JnaTcpConnection.INST().g_tcp_connection_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type
*/
