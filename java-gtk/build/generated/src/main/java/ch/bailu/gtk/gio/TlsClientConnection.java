/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTlsClientConnection is the client-side subclass of
 * <br>&#35;GTlsConnection, representing a client-side TLS connection.
 * <p><a href="https://docs.gtk.org/gio/iface.TlsClientConnection.html">https://docs.gtk.org/gio/iface.TlsClientConnection.html</a></p>
*/
public class TlsClientConnection extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsClientConnection.class.getCanonicalName());
    }

    public TlsClientConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Possibly copies session state from one connection to another, for use
     * <br>in TLS session resumption. This is not normally needed, but may be
     * <br>used when the same session needs to be used between different
     * <br>endpoints, as is required by some protocols, such as FTP over TLS.
     * <br>&#64;source should have already completed a handshake and, since TLS 1.3,
     * <br>it should have been used to read data at least once. &#64;conn should not
     * <br>have completed a handshake.
     * <br>
     * <br>It is not possible to know whether a call to this function will
     * <br>actually do anything. Because session resumption is normally used
     * <br>only for performance benefit, the TLS backend might not implement
     * <br>this function. Even if implemented, it may not actually succeed in
     * <br>allowing &#64;conn to resume &#64;source's TLS session, because the server
     * <br>may not have sent a session resumption token to &#64;source, or it may
     * <br>refuse to accept the token from &#64;conn. There is no way to know
     * <br>whether a call to this function is actually successful.
     * <br>
     * <br>Using this function is not required to benefit from session
     * <br>resumption. If the TLS backend supports session resumption, the
     * <br>session will be resumed automatically if it is possible to do so
     * <br>without weakening the privacy guarantees normally provided by TLS,
     * <br>without need to call this function. For example, with TLS 1.3,
     * <br>a session ticket will be automatically copied from any
     * <br>&#35;GTlsClientConnection that has previously received session tickets
     * <br>from the server, provided a ticket is available that has not
     * <br>previously been used for session resumption, since session ticket
     * <br>reuse would be a privacy weakness. Using this function causes the
     * <br>ticket to be copied without regard for privacy considerations.
     * @param source a &#35;GTlsClientConnection
    */
    public void copySessionState(@Nonnull TlsClientConnection source)  {
        JnaTlsClientConnection.INST().g_tls_client_connection_copy_session_state(asCPointer(), asCPointerNotNull(source));
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
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaTlsClientConnection.INST().g_tls_client_connection_get_accepted_cas(asCPointer())));
    }

    /**
     * Gets &#64;conn's expected server identity
     * @return a &#35;GSocketConnectable describing the expected server identity, or %NULL if the expected identity is not known.
    */
    public SocketConnectable getServerIdentity()  {
        return new SocketConnectable(new PointerContainer(JnaTlsClientConnection.INST().g_tls_client_connection_get_server_identity(asCPointer())));
    }

    /**
     * Sets &#64;conn's expected server identity, which is used both to tell
     * <br>servers on virtual hosts which certificate to present, and also
     * <br>to let &#64;conn know what name to look for in the certificate when
     * <br>performing %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
     * @param identity a &#35;GSocketConnectable describing the expected server identity
    */
    public void setServerIdentity(@Nonnull SocketConnectable identity)  {
        JnaTlsClientConnection.INST().g_tls_client_connection_set_server_identity(asCPointer(), asCPointerNotNull(identity));
    }

    /**
     * Creates a new &#35;GTlsClientConnection wrapping &#64;base_io_stream (which
     * <br>must have pollable input and output streams) which is assumed to
     * <br>communicate with the server identified by &#64;server_identity.
     * <br>
     * <br>See the documentation for &#35;GTlsConnection:base-io-stream for restrictions
     * <br>on when application code can run operations on the &#64;base_io_stream after
     * <br>this function has returned.
     * @param base_io_stream the &#35;GIOStream to wrap
     * @param server_identity the expected identity of the server
     * @return the new &#35;GTlsClientConnection, or %NULL on error
    */
    public static TlsClientConnection _new(@Nonnull IOStream base_io_stream, @Nullable SocketConnectable server_identity) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsClientConnection(new PointerContainer(JnaTlsClientConnection.INST().g_tls_client_connection_new(asCPointerNotNull(base_io_stream), asCPointer(server_identity), 0L)));
    }

    public static long getTypeID() { 
        return JnaTlsClientConnection.INST().g_tls_client_connection_get_type(); 
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

[MethodModel:cb-deprecated:getUseSsl3:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:cb-deprecated:getValidationFlags:[ParameterModel:Supported:{G_::{c:GTlsCertificateFlags}}:{j:int}]]

[MethodModel:cb-deprecated:setUseSsl3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:cb-deprecated:setValidationFlags:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GTlsCertificateFlags}}:{j:int}]
*/
