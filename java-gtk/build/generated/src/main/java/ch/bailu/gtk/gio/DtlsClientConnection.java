/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDtlsClientConnection is the client-side subclass of
 * <br>&#35;GDtlsConnection, representing a client-side DTLS connection.
 * <p><a href="https://docs.gtk.org/gio/iface.DtlsClientConnection.html">https://docs.gtk.org/gio/iface.DtlsClientConnection.html</a></p>
*/
public class DtlsClientConnection extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DtlsClientConnection.class.getCanonicalName());
    }

    public DtlsClientConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the list of distinguished names of the Certificate Authorities
     * <br>that the server will accept certificates from. This will be set
     * <br>during the TLS handshake if the server requests a certificate.
     * <br>Otherwise, it will be %NULL.
     * <br>
     * <br>Each item in the list is a &#35;GByteArray which contains the complete
     * <br>subject DN of the certificate authority.
     * @return the list of CA DNs. You should unref each element with g_byte_array_unref() and then the free the list with g_list_free().
    */
    public ch.bailu.gtk.glib.List getAcceptedCas()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaDtlsClientConnection.INST().g_dtls_client_connection_get_accepted_cas(asCPointer())));
    }

    /**
     * Gets &#64;conn's expected server identity
     * @return a &#35;GSocketConnectable describing the expected server identity, or %NULL if the expected identity is not known.
    */
    public SocketConnectable getServerIdentity()  {
        return new SocketConnectable(new PointerContainer(JnaDtlsClientConnection.INST().g_dtls_client_connection_get_server_identity(asCPointer())));
    }

    /**
     * Sets &#64;conn's expected server identity, which is used both to tell
     * <br>servers on virtual hosts which certificate to present, and also
     * <br>to let &#64;conn know what name to look for in the certificate when
     * <br>performing %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
     * @param identity a &#35;GSocketConnectable describing the expected server identity
    */
    public void setServerIdentity(@Nonnull SocketConnectable identity)  {
        JnaDtlsClientConnection.INST().g_dtls_client_connection_set_server_identity(asCPointer(), asCPointerNotNull(identity));
    }

    /**
     * Creates a new &#35;GDtlsClientConnection wrapping &#64;base_socket which is
     * <br>assumed to communicate with the server identified by &#64;server_identity.
     * @param base_socket the &#35;GDatagramBased to wrap
     * @param server_identity the expected identity of the server
     * @return the new   &#35;GDtlsClientConnection, or %NULL on error
    */
    public static DtlsClientConnection _new(@Nonnull DatagramBased base_socket, @Nullable SocketConnectable server_identity) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DtlsClientConnection(new PointerContainer(JnaDtlsClientConnection.INST().g_dtls_client_connection_new(asCPointerNotNull(base_socket), asCPointer(server_identity), 0L)));
    }

    public static long getTypeID() { 
        return JnaDtlsClientConnection.INST().g_dtls_client_connection_get_type(); 
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

[MethodModel:cb-deprecated:getValidationFlags:[ParameterModel:Supported:{G_::{c:GTlsCertificateFlags}}:{j:int}]]

[MethodModel:cb-deprecated:setValidationFlags:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GTlsCertificateFlags}}:{j:int}]
*/
