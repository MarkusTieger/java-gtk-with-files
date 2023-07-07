/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDtlsServerConnection is the server-side subclass of &#35;GDtlsConnection,
 * <br>representing a server-side DTLS connection.
 * <p><a href="https://docs.gtk.org/gio/iface.DtlsServerConnection.html">https://docs.gtk.org/gio/iface.DtlsServerConnection.html</a></p>
*/
public class DtlsServerConnection extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DtlsServerConnection.class.getCanonicalName());
    }

    public DtlsServerConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GDtlsServerConnection wrapping &#64;base_socket.
     * @param base_socket the &#35;GDatagramBased to wrap
     * @param certificate the default server certificate, or %NULL
     * @return the new   &#35;GDtlsServerConnection, or %NULL on error
    */
    public static DtlsServerConnection _new(@Nonnull DatagramBased base_socket, @Nullable TlsCertificate certificate) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DtlsServerConnection(new PointerContainer(JnaDtlsServerConnection.INST().g_dtls_server_connection_new(asCPointerNotNull(base_socket), asCPointer(certificate), 0L)));
    }

    public static long getTypeID() { 
        return JnaDtlsServerConnection.INST().g_dtls_server_connection_get_type(); 
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
