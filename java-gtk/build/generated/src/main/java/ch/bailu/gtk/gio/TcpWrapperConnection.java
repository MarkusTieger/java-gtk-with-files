/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GTcpWrapperConnection can be used to wrap a &#35;GIOStream that is
 * <br>based on a &#35;GSocket, but which is not actually a
 * <br>&#35;GSocketConnection. This is used by &#35;GSocketClient so that it can
 * <br>always return a &#35;GSocketConnection, even when the connection it has
 * <br>actually created is not directly a &#35;GSocketConnection.
 * <p><a href="https://docs.gtk.org/gio/class.TcpWrapperConnection.html">https://docs.gtk.org/gio/class.TcpWrapperConnection.html</a></p>
*/
public class TcpWrapperConnection extends TcpConnection {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TcpWrapperConnection.class.getCanonicalName());
    }

    public TcpWrapperConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Wraps &#64;base_io_stream and &#64;socket together as a &#35;GSocketConnection.
     * @param base_io_stream the &#35;GIOStream to wrap
     * @param socket the &#35;GSocket associated with &#64;base_io_stream
    */
    public TcpWrapperConnection(@Nonnull IOStream base_io_stream, @Nonnull Socket socket) {
        super(cast(JnaTcpWrapperConnection.INST().g_tcp_wrapper_connection_new(asCPointerNotNull(base_io_stream), asCPointerNotNull(socket))));
    }

    /**
     * Gets &#64;conn's base &#35;GIOStream
     * @return &#64;conn's base &#35;GIOStream
    */
    public IOStream getBaseIoStream()  {
        return new IOStream(new PointerContainer(JnaTcpWrapperConnection.INST().g_tcp_wrapper_connection_get_base_io_stream(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaTcpWrapperConnection.INST().g_tcp_wrapper_connection_get_type(); 
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
