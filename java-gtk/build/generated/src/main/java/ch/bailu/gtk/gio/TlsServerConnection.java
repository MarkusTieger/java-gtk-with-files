/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTlsServerConnection is the server-side subclass of &#35;GTlsConnection,
 * <br>representing a server-side TLS connection.
 * <p><a href="https://docs.gtk.org/gio/iface.TlsServerConnection.html">https://docs.gtk.org/gio/iface.TlsServerConnection.html</a></p>
*/
public class TlsServerConnection extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsServerConnection.class.getCanonicalName());
    }

    public TlsServerConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GTlsServerConnection wrapping &#64;base_io_stream (which
     * <br>must have pollable input and output streams).
     * <br>
     * <br>See the documentation for &#35;GTlsConnection:base-io-stream for restrictions
     * <br>on when application code can run operations on the &#64;base_io_stream after
     * <br>this function has returned.
     * @param base_io_stream the &#35;GIOStream to wrap
     * @param certificate the default server certificate, or %NULL
     * @return the new &#35;GTlsServerConnection, or %NULL on error
    */
    public static TlsServerConnection _new(@Nonnull IOStream base_io_stream, @Nullable TlsCertificate certificate) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsServerConnection(new PointerContainer(JnaTlsServerConnection.INST().g_tls_server_connection_new(asCPointerNotNull(base_io_stream), asCPointer(certificate), 0L)));
    }

    public static long getTypeID() { 
        return JnaTlsServerConnection.INST().g_tls_server_connection_get_type(); 
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
interface-type
*/
