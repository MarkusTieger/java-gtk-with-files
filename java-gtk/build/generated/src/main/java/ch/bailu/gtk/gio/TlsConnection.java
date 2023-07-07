/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTlsConnection is the base TLS connection class type, which wraps
 * <br>a &#35;GIOStream and provides TLS encryption on top of it. Its
 * <br>subclasses, &#35;GTlsClientConnection and &#35;GTlsServerConnection,
 * <br>implement client-side and server-side TLS, respectively.
 * <br>
 * <br>For DTLS (Datagram TLS) support, see &#35;GDtlsConnection.
 * <p><a href="https://docs.gtk.org/gio/class.TlsConnection.html">https://docs.gtk.org/gio/class.TlsConnection.html</a></p>
*/
public class TlsConnection extends IOStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsConnection.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTlsConnection.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaTlsConnection.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAcceptCertificate {
        /**
         * Emitted during the TLS handshake after the peer certificate has
         * <br>been received. You can examine &#64;peer_cert's certification path by
         * <br>calling g_tls_certificate_get_issuer() on it.
         * <br>
         * <br>For a client-side connection, &#64;peer_cert is the server's
         * <br>certificate, and the signal will only be emitted if the
         * <br>certificate was not acceptable according to &#64;conn's
         * <br>&#35;GTlsClientConnection:validation_flags. If you would like the
         * <br>certificate to be accepted despite &#64;errors, return %TRUE from the
         * <br>signal handler. Otherwise, if no handler accepts the certificate,
         * <br>the handshake will fail with %G_TLS_ERROR_BAD_CERTIFICATE.
         * <br>
         * <br>GLib guarantees that if certificate verification fails, this signal
         * <br>will be emitted with at least one error will be set in &#64;errors, but
         * <br>it does not guarantee that all possible errors will be set.
         * <br>Accordingly, you may not safely decide to ignore any particular
         * <br>type of error. For example, it would be incorrect to ignore
         * <br>%G_TLS_CERTIFICATE_EXPIRED if you want to allow expired
         * <br>certificates, because this could potentially be the only error flag
         * <br>set even if other problems exist with the certificate.
         * <br>
         * <br>For a server-side connection, &#64;peer_cert is the certificate
         * <br>presented by the client, if this was requested via the server's
         * <br>&#35;GTlsServerConnection:authentication_mode. On the server side,
         * <br>the signal is always emitted when the client presents a
         * <br>certificate, and the certificate will only be accepted if a
         * <br>handler returns %TRUE.
         * <br>
         * <br>Note that if this signal is emitted as part of asynchronous I/O
         * <br>in the main thread, then you should not attempt to interact with
         * <br>the user before returning from the signal handler. If you want to
         * <br>let the user decide whether or not to accept the certificate, you
         * <br>would have to return %FALSE from the signal handler on the first
         * <br>attempt, and then after the connection attempt returns a
         * <br>%G_TLS_ERROR_BAD_CERTIFICATE, you can interact with the user, and
         * <br>if the user decides to accept the certificate, remember that fact,
         * <br>create a new connection, and return %TRUE from the signal handler
         * <br>the next time.
         * <br>
         * <br>If you are doing I/O in another thread, you do not
         * <br>need to worry about this, and can simply block in the signal
         * <br>handler until the UI thread returns an answer.
         * @param peer_cert the peer's &#35;GTlsCertificate
         * @param errors the problems with &#64;peer_cert.
         * @return %TRUE to accept &#64;peer_cert (which will also immediately end the signal emission). %FALSE to allow the signal emission to continue, which will cause the handshake to fail if no one else overrides it.
        */
        boolean onAcceptCertificate(@Nonnull TlsCertificate peer_cert, int errors);
    }
    
    private static com.sun.jna.Callback toOnAcceptCertificate(OnAcceptCertificate in) {
        return (in == null) ? null: (JnaTlsConnection.OnAcceptCertificate) (__self, _peer_cert, _errors, __data) -> in.onAcceptCertificate(new TlsCertificate(new PointerContainer(_peer_cert)), _errors);
    }

    public TlsConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Used by &#35;GTlsConnection implementations to emit the
     * <br>&#35;GTlsConnection::accept-certificate signal.
     * @param peer_cert the peer's &#35;GTlsCertificate
     * @param errors the problems with &#64;peer_cert
     * @return %TRUE if one of the signal handlers has returned     %TRUE to accept &#64;peer_cert
    */
    public boolean emitAcceptCertificate(@Nonnull TlsCertificate peer_cert, int errors)  {
        return JnaTlsConnection.INST().g_tls_connection_emit_accept_certificate(asCPointer(), asCPointerNotNull(peer_cert), errors);
    }

    /**
     * Gets &#64;conn's certificate, as set by
     * <br>g_tls_connection_set_certificate().
     * @return &#64;conn's certificate, or %NULL
    */
    public TlsCertificate getCertificate()  {
        return new TlsCertificate(new PointerContainer(JnaTlsConnection.INST().g_tls_connection_get_certificate(asCPointer())));
    }

    /**
     * Query the TLS backend for TLS channel binding data of &#64;type for &#64;conn.
     * <br>
     * <br>This call retrieves TLS channel binding data as specified in RFC
     * <br>[5056](https://tools.ietf.org/html/rfc5056), RFC
     * <br>[5929](https://tools.ietf.org/html/rfc5929), and related RFCs.  The
     * <br>binding data is returned in &#64;data.  The &#64;data is resized by the callee
     * <br>using &#35;GByteArray buffer management and will be freed when the &#64;data
     * <br>is destroyed by g_byte_array_unref(). If &#64;data is %NULL, it will only
     * <br>check whether TLS backend is able to fetch the data (e.g. whether &#64;type
     * <br>is supported by the TLS backend). It does not guarantee that the data
     * <br>will be available though.  That could happen if TLS connection does not
     * <br>support &#64;type or the binding data is not available yet due to additional
     * <br>negotiation or input required.
     * @param type &#35;GTlsChannelBindingType type of data to fetch
     * @param data &#35;GByteArray is        filled with the binding data, or %NULL
     * @return %TRUE on success, %FALSE otherwise
    */
    public boolean getChannelBindingData(int type, @Nullable ch.bailu.gtk.glib.ByteArray data) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsConnection.INST().g_tls_connection_get_channel_binding_data(asCPointer(), type, asCPointer(data), 0L);
    }

    /**
     * Returns the name of the current TLS ciphersuite, or %NULL if the
     * <br>connection has not handshaked or has been closed. Beware that the TLS
     * <br>backend may use any of multiple different naming conventions, because
     * <br>OpenSSL and GnuTLS have their own ciphersuite naming conventions that
     * <br>are different from each other and different from the standard, IANA-
     * <br>registered ciphersuite names. The ciphersuite name is intended to be
     * <br>displayed to the user for informative purposes only, and parsing it
     * <br>is not recommended.
     * @return The name of the current TLS ciphersuite, or %NULL
    */
    public ch.bailu.gtk.type.Str getCiphersuiteName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTlsConnection.INST().g_tls_connection_get_ciphersuite_name(asCPointer())));
    }

    /**
     * Gets the certificate database that &#64;conn uses to verify
     * <br>peer certificates. See g_tls_connection_set_database().
     * @return the certificate database that &#64;conn uses or %NULL
    */
    public TlsDatabase getDatabase()  {
        return new TlsDatabase(new PointerContainer(JnaTlsConnection.INST().g_tls_connection_get_database(asCPointer())));
    }

    /**
     * Get the object that will be used to interact with the user. It will be used
     * <br>for things like prompting the user for passwords. If %NULL is returned, then
     * <br>no user interaction will occur for this connection.
     * @return The interaction object.
    */
    public TlsInteraction getInteraction()  {
        return new TlsInteraction(new PointerContainer(JnaTlsConnection.INST().g_tls_connection_get_interaction(asCPointer())));
    }

    /**
     * Gets the name of the application-layer protocol negotiated during
     * <br>the handshake.
     * <br>
     * <br>If the peer did not use the ALPN extension, or did not advertise a
     * <br>protocol that matched one of &#64;conn's protocols, or the TLS backend
     * <br>does not support ALPN, then this will be %NULL. See
     * <br>g_tls_connection_set_advertised_protocols().
     * @return the negotiated protocol, or %NULL
    */
    public ch.bailu.gtk.type.Str getNegotiatedProtocol()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTlsConnection.INST().g_tls_connection_get_negotiated_protocol(asCPointer())));
    }

    /**
     * Gets &#64;conn's peer's certificate after the handshake has completed
     * <br>or failed. (It is not set during the emission of
     * <br>&#35;GTlsConnection::accept-certificate.)
     * @return &#64;conn's peer's certificate, or %NULL
    */
    public TlsCertificate getPeerCertificate()  {
        return new TlsCertificate(new PointerContainer(JnaTlsConnection.INST().g_tls_connection_get_peer_certificate(asCPointer())));
    }

    /**
     * Gets the errors associated with validating &#64;conn's peer's
     * <br>certificate, after the handshake has completed or failed. (It is
     * <br>not set during the emission of &#35;GTlsConnection::accept-certificate.)
     * <br>
     * <br>See &#35;GTlsConnection:peer-certificate-errors for more information.
     * @return &#64;conn's peer's certificate errors
    */
    public int getPeerCertificateErrors()  {
        return JnaTlsConnection.INST().g_tls_connection_get_peer_certificate_errors(asCPointer());
    }

    /**
     * Returns the current TLS protocol version, which may be
     * <br>%G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
     * <br>has been closed, or if the TLS backend has implemented a protocol version
     * <br>that is not a recognized &#35;GTlsProtocolVersion.
     * @return The current TLS protocol version
    */
    public int getProtocolVersion()  {
        return JnaTlsConnection.INST().g_tls_connection_get_protocol_version(asCPointer());
    }

    /**
     * Tests whether or not &#64;conn expects a proper TLS close notification
     * <br>when the connection is closed. See
     * <br>g_tls_connection_set_require_close_notify() for details.
     * @return %TRUE if &#64;conn requires a proper TLS close notification.
    */
    public boolean getRequireCloseNotify()  {
        return JnaTlsConnection.INST().g_tls_connection_get_require_close_notify(asCPointer());
    }

    /**
     * Attempts a TLS handshake on &#64;conn.
     * <br>
     * <br>On the client side, it is never necessary to call this method;
     * <br>although the connection needs to perform a handshake after
     * <br>connecting (or after sending a &quot;STARTTLS&quot;-type command),
     * <br>&#35;GTlsConnection will handle this for you automatically when you try
     * <br>to send or receive data on the connection. You can call
     * <br>g_tls_connection_handshake() manually if you want to know whether
     * <br>the initial handshake succeeded or failed (as opposed to just
     * <br>immediately trying to use &#64;conn to read or write, in which case,
     * <br>if it fails, it may not be possible to tell if it failed before or
     * <br>after completing the handshake), but beware that servers may reject
     * <br>client authentication after the handshake has completed, so a
     * <br>successful handshake does not indicate the connection will be usable.
     * <br>
     * <br>Likewise, on the server side, although a handshake is necessary at
     * <br>the beginning of the communication, you do not need to call this
     * <br>function explicitly unless you want clearer error reporting.
     * <br>
     * <br>Previously, calling g_tls_connection_handshake() after the initial
     * <br>handshake would trigger a rehandshake; however, this usage was
     * <br>deprecated in GLib 2.60 because rehandshaking was removed from the
     * <br>TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * <br>the initial handshake will no longer do anything.
     * <br>
     * <br>When using a &#35;GTlsConnection created by &#35;GSocketClient, the
     * <br>&#35;GSocketClient performs the initial handshake, so calling this
     * <br>function manually is not recommended.
     * <br>
     * <br>&#35;GTlsConnection::accept_certificate may be emitted during the
     * <br>handshake.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return success or failure
    */
    public boolean handshake(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsConnection.INST().g_tls_connection_handshake(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously performs a TLS handshake on &#64;conn. See
     * <br>g_tls_connection_handshake() for more information.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the handshake is complete
     * @param user_data the data to pass to the callback function
    */
    public void handshakeAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsConnection.INST().g_tls_connection_handshake_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "handshakeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous TLS handshake operation. See
     * <br>g_tls_connection_handshake() for more information.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE on success, %FALSE on failure, in which case &#64;error will be set.
    */
    public boolean handshakeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsConnection.INST().g_tls_connection_handshake_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * This sets the certificate that &#64;conn will present to its peer
     * <br>during the TLS handshake. For a &#35;GTlsServerConnection, it is
     * <br>mandatory to set this, and that will normally be done at construct
     * <br>time.
     * <br>
     * <br>For a &#35;GTlsClientConnection, this is optional. If a handshake fails
     * <br>with %G_TLS_ERROR_CERTIFICATE_REQUIRED, that means that the server
     * <br>requires a certificate, and if you try connecting again, you should
     * <br>call this method first. You can call
     * <br>g_tls_client_connection_get_accepted_cas() on the failed connection
     * <br>to get a list of Certificate Authorities that the server will
     * <br>accept certificates from.
     * <br>
     * <br>(It is also possible that a server will allow the connection with
     * <br>or without a certificate; in that case, if you don't provide a
     * <br>certificate, you can tell that the server requested one by the fact
     * <br>that g_tls_client_connection_get_accepted_cas() will return
     * <br>non-%NULL.)
     * @param certificate the certificate to use for &#64;conn
    */
    public void setCertificate(@Nonnull TlsCertificate certificate)  {
        JnaTlsConnection.INST().g_tls_connection_set_certificate(asCPointer(), asCPointerNotNull(certificate));
    }

    /**
     * Sets the certificate database that is used to verify peer certificates.
     * <br>This is set to the default database by default. See
     * <br>g_tls_backend_get_default_database(). If set to %NULL, then
     * <br>peer certificate validation will always set the
     * <br>%G_TLS_CERTIFICATE_UNKNOWN_CA error (meaning
     * <br>&#35;GTlsConnection::accept-certificate will always be emitted on
     * <br>client-side connections, unless that bit is not set in
     * <br>&#35;GTlsClientConnection:validation-flags).
     * <br>
     * <br>There are nonintuitive security implications when using a non-default
     * <br>database. See &#35;GTlsConnection:database for details.
     * @param database a &#35;GTlsDatabase
    */
    public void setDatabase(@Nullable TlsDatabase database)  {
        JnaTlsConnection.INST().g_tls_connection_set_database(asCPointer(), asCPointer(database));
    }

    /**
     * Set the object that will be used to interact with the user. It will be used
     * <br>for things like prompting the user for passwords.
     * <br>
     * <br>The &#64;interaction argument will normally be a derived subclass of
     * <br>&#35;GTlsInteraction. %NULL can also be provided if no user interaction
     * <br>should occur for this connection.
     * @param interaction an interaction object, or %NULL
    */
    public void setInteraction(@Nullable TlsInteraction interaction)  {
        JnaTlsConnection.INST().g_tls_connection_set_interaction(asCPointer(), asCPointer(interaction));
    }

    /**
     * Sets whether or not &#64;conn expects a proper TLS close notification
     * <br>before the connection is closed. If this is %TRUE (the default),
     * <br>then &#64;conn will expect to receive a TLS close notification from its
     * <br>peer before the connection is closed, and will return a
     * <br>%G_TLS_ERROR_EOF error if the connection is closed without proper
     * <br>notification (since this may indicate a network error, or
     * <br>man-in-the-middle attack).
     * <br>
     * <br>In some protocols, the application will know whether or not the
     * <br>connection was closed cleanly based on application-level data
     * <br>(because the application-level data includes a length field, or is
     * <br>somehow self-delimiting); in this case, the close notify is
     * <br>redundant and sometimes omitted. (TLS 1.1 explicitly allows this;
     * <br>in TLS 1.0 it is technically an error, but often done anyway.) You
     * <br>can use g_tls_connection_set_require_close_notify() to tell &#64;conn
     * <br>to allow an &quot;unannounced&quot; connection close, in which case the close
     * <br>will show up as a 0-length read, as in a non-TLS
     * <br>&#35;GSocketConnection, and it is up to the application to check that
     * <br>the data has been fully received.
     * <br>
     * <br>Note that this only affects the behavior when the peer closes the
     * <br>connection; when the application calls g_io_stream_close() itself
     * <br>on &#64;conn, this will send a close notification regardless of the
     * <br>setting of this property. If you explicitly want to do an unclean
     * <br>close, you can close &#64;conn's &#35;GTlsConnection:base-io-stream rather
     * <br>than closing &#64;conn itself, but note that this may only be done when no other
     * <br>operations are pending on &#64;conn or the base I/O stream.
     * @param require_close_notify whether or not to require close notification
    */
    public void setRequireCloseNotify(boolean require_close_notify)  {
        JnaTlsConnection.INST().g_tls_connection_set_require_close_notify(asCPointer(), require_close_notify);
    }

    public final static String SIGNAL_ON_ACCEPT_CERTIFICATE = "accept-certificate";
    
    /**
     * Connect to signal "accept-certificate".
     * <br>See {@link OnAcceptCertificate#onAcceptCertificate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACCEPT_CERTIFICATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAcceptCertificate(OnAcceptCertificate signal) {
        return connectSignal(SIGNAL_ON_ACCEPT_CERTIFICATE, toOnAcceptCertificate(signal));
    }

    public static long getTypeID() { 
        return JnaTlsConnection.INST().g_tls_connection_get_type(); 
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

[MethodModel:cb-deprecated:getRehandshakeMode:[ParameterModel:Supported:{G_::{c:GTlsRehandshakeMode}}:{j:int}]]

[MethodModel:cb-deprecated:getUseSystemCertdb:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:java-type-not-supported:setAdvertisedProtocols:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]

[MethodModel:cb-deprecated:setRehandshakeMode:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GTlsRehandshakeMode}}:{j:int}]

[MethodModel:cb-deprecated:setUseSystemCertdb:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
*/
