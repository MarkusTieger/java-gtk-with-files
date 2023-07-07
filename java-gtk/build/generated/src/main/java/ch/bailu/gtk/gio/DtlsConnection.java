/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDtlsConnection is the base DTLS connection class type, which wraps
 * <br>a &#35;GDatagramBased and provides DTLS encryption on top of it. Its
 * <br>subclasses, &#35;GDtlsClientConnection and &#35;GDtlsServerConnection,
 * <br>implement client-side and server-side DTLS, respectively.
 * <br>
 * <br>For TLS support, see &#35;GTlsConnection.
 * <br>
 * <br>As DTLS is datagram based, &#35;GDtlsConnection implements &#35;GDatagramBased,
 * <br>presenting a datagram-socket-like API for the encrypted connection. This
 * <br>operates over a base datagram connection, which is also a &#35;GDatagramBased
 * <br>(&#35;GDtlsConnection:base-socket).
 * <br>
 * <br>To close a DTLS connection, use g_dtls_connection_close().
 * <br>
 * <br>Neither &#35;GDtlsServerConnection or &#35;GDtlsClientConnection set the peer address
 * <br>on their base &#35;GDatagramBased if it is a &#35;GSocket — it is up to the caller to
 * <br>do that if they wish. If they do not, and g_socket_close() is called on the
 * <br>base socket, the &#35;GDtlsConnection will not raise a %G_IO_ERROR_NOT_CONNECTED
 * <br>error on further I/O.
 * <p><a href="https://docs.gtk.org/gio/iface.DtlsConnection.html">https://docs.gtk.org/gio/iface.DtlsConnection.html</a></p>
*/
public class DtlsConnection extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DtlsConnection.class.getCanonicalName());
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
    
    private static JnaDtlsConnection.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaDtlsConnection.OnAsyncReadyCallback out = null;
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
         * <br>&#35;GDtlsClientConnection:validation_flags. If you would like the
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
         * <br>&#35;GDtlsServerConnection:authentication_mode. On the server side,
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
        return (in == null) ? null: (JnaDtlsConnection.OnAcceptCertificate) (__self, _peer_cert, _errors, __data) -> in.onAcceptCertificate(new TlsCertificate(new PointerContainer(_peer_cert)), _errors);
    }

    public DtlsConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Close the DTLS connection. This is equivalent to calling
     * <br>g_dtls_connection_shutdown() to shut down both sides of the connection.
     * <br>
     * <br>Closing a &#35;GDtlsConnection waits for all buffered but untransmitted data to
     * <br>be sent before it completes. It then sends a `close_notify` DTLS alert to the
     * <br>peer and may wait for a `close_notify` to be received from the peer. It does
     * <br>not close the underlying &#35;GDtlsConnection:base-socket; that must be closed
     * <br>separately.
     * <br>
     * <br>Once &#64;conn is closed, all other operations will return %G_IO_ERROR_CLOSED.
     * <br>Closing a &#35;GDtlsConnection multiple times will not return an error.
     * <br>
     * <br>&#35;GDtlsConnections will be automatically closed when the last reference is
     * <br>dropped, but you might want to call this function to make sure resources are
     * <br>released as early as possible.
     * <br>
     * <br>If &#64;cancellable is cancelled, the &#35;GDtlsConnection may be left
     * <br>partially-closed and any pending untransmitted data may be lost. Call
     * <br>g_dtls_connection_close() again to complete closing the &#35;GDtlsConnection.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE on success, %FALSE otherwise
    */
    public boolean close(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDtlsConnection.INST().g_dtls_connection_close(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously close the DTLS connection. See g_dtls_connection_close() for
     * <br>more information.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the close operation is complete
     * @param user_data the data to pass to the callback function
    */
    public void closeAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDtlsConnection.INST().g_dtls_connection_close_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "closeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous TLS close operation. See g_dtls_connection_close()
     * <br>for more information.
     * @param result a &#35;GAsyncResult
     * @return %TRUE on success, %FALSE on failure, in which case &#64;error will be set
    */
    public boolean closeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDtlsConnection.INST().g_dtls_connection_close_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Used by &#35;GDtlsConnection implementations to emit the
     * <br>&#35;GDtlsConnection::accept-certificate signal.
     * @param peer_cert the peer's &#35;GTlsCertificate
     * @param errors the problems with &#64;peer_cert
     * @return %TRUE if one of the signal handlers has returned     %TRUE to accept &#64;peer_cert
    */
    public boolean emitAcceptCertificate(@Nonnull TlsCertificate peer_cert, int errors)  {
        return JnaDtlsConnection.INST().g_dtls_connection_emit_accept_certificate(asCPointer(), asCPointerNotNull(peer_cert), errors);
    }

    /**
     * Gets &#64;conn's certificate, as set by
     * <br>g_dtls_connection_set_certificate().
     * @return &#64;conn's certificate, or %NULL
    */
    public TlsCertificate getCertificate()  {
        return new TlsCertificate(new PointerContainer(JnaDtlsConnection.INST().g_dtls_connection_get_certificate(asCPointer())));
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
        return JnaDtlsConnection.INST().g_dtls_connection_get_channel_binding_data(asCPointer(), type, asCPointer(data), 0L);
    }

    /**
     * Returns the name of the current DTLS ciphersuite, or %NULL if the
     * <br>connection has not handshaked or has been closed. Beware that the TLS
     * <br>backend may use any of multiple different naming conventions, because
     * <br>OpenSSL and GnuTLS have their own ciphersuite naming conventions that
     * <br>are different from each other and different from the standard, IANA-
     * <br>registered ciphersuite names. The ciphersuite name is intended to be
     * <br>displayed to the user for informative purposes only, and parsing it
     * <br>is not recommended.
     * @return The name of the current DTLS ciphersuite, or %NULL
    */
    public ch.bailu.gtk.type.Str getCiphersuiteName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDtlsConnection.INST().g_dtls_connection_get_ciphersuite_name(asCPointer())));
    }

    /**
     * Gets the certificate database that &#64;conn uses to verify
     * <br>peer certificates. See g_dtls_connection_set_database().
     * @return the certificate database that &#64;conn uses or %NULL
    */
    public TlsDatabase getDatabase()  {
        return new TlsDatabase(new PointerContainer(JnaDtlsConnection.INST().g_dtls_connection_get_database(asCPointer())));
    }

    /**
     * Get the object that will be used to interact with the user. It will be used
     * <br>for things like prompting the user for passwords. If %NULL is returned, then
     * <br>no user interaction will occur for this connection.
     * @return The interaction object.
    */
    public TlsInteraction getInteraction()  {
        return new TlsInteraction(new PointerContainer(JnaDtlsConnection.INST().g_dtls_connection_get_interaction(asCPointer())));
    }

    /**
     * Gets the name of the application-layer protocol negotiated during
     * <br>the handshake.
     * <br>
     * <br>If the peer did not use the ALPN extension, or did not advertise a
     * <br>protocol that matched one of &#64;conn's protocols, or the TLS backend
     * <br>does not support ALPN, then this will be %NULL. See
     * <br>g_dtls_connection_set_advertised_protocols().
     * @return the negotiated protocol, or %NULL
    */
    public ch.bailu.gtk.type.Str getNegotiatedProtocol()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDtlsConnection.INST().g_dtls_connection_get_negotiated_protocol(asCPointer())));
    }

    /**
     * Gets &#64;conn's peer's certificate after the handshake has completed
     * <br>or failed. (It is not set during the emission of
     * <br>&#35;GDtlsConnection::accept-certificate.)
     * @return &#64;conn's peer's certificate, or %NULL
    */
    public TlsCertificate getPeerCertificate()  {
        return new TlsCertificate(new PointerContainer(JnaDtlsConnection.INST().g_dtls_connection_get_peer_certificate(asCPointer())));
    }

    /**
     * Gets the errors associated with validating &#64;conn's peer's
     * <br>certificate, after the handshake has completed or failed. (It is
     * <br>not set during the emission of &#35;GDtlsConnection::accept-certificate.)
     * @return &#64;conn's peer's certificate errors
    */
    public int getPeerCertificateErrors()  {
        return JnaDtlsConnection.INST().g_dtls_connection_get_peer_certificate_errors(asCPointer());
    }

    /**
     * Returns the current DTLS protocol version, which may be
     * <br>%G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
     * <br>has been closed, or if the TLS backend has implemented a protocol version
     * <br>that is not a recognized &#35;GTlsProtocolVersion.
     * @return The current DTLS protocol version
    */
    public int getProtocolVersion()  {
        return JnaDtlsConnection.INST().g_dtls_connection_get_protocol_version(asCPointer());
    }

    /**
     * Tests whether or not &#64;conn expects a proper TLS close notification
     * <br>when the connection is closed. See
     * <br>g_dtls_connection_set_require_close_notify() for details.
     * @return %TRUE if &#64;conn requires a proper TLS close notification.
    */
    public boolean getRequireCloseNotify()  {
        return JnaDtlsConnection.INST().g_dtls_connection_get_require_close_notify(asCPointer());
    }

    /**
     * Attempts a TLS handshake on &#64;conn.
     * <br>
     * <br>On the client side, it is never necessary to call this method;
     * <br>although the connection needs to perform a handshake after
     * <br>connecting, &#35;GDtlsConnection will handle this for you automatically
     * <br>when you try to send or receive data on the connection. You can call
     * <br>g_dtls_connection_handshake() manually if you want to know whether
     * <br>the initial handshake succeeded or failed (as opposed to just
     * <br>immediately trying to use &#64;conn to read or write, in which case,
     * <br>if it fails, it may not be possible to tell if it failed before
     * <br>or after completing the handshake), but beware that servers may reject
     * <br>client authentication after the handshake has completed, so a
     * <br>successful handshake does not indicate the connection will be usable.
     * <br>
     * <br>Likewise, on the server side, although a handshake is necessary at
     * <br>the beginning of the communication, you do not need to call this
     * <br>function explicitly unless you want clearer error reporting.
     * <br>
     * <br>Previously, calling g_dtls_connection_handshake() after the initial
     * <br>handshake would trigger a rehandshake; however, this usage was
     * <br>deprecated in GLib 2.60 because rehandshaking was removed from the
     * <br>TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * <br>the initial handshake will no longer do anything.
     * <br>
     * <br>&#35;GDtlsConnection::accept_certificate may be emitted during the
     * <br>handshake.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return success or failure
    */
    public boolean handshake(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDtlsConnection.INST().g_dtls_connection_handshake(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously performs a TLS handshake on &#64;conn. See
     * <br>g_dtls_connection_handshake() for more information.
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the handshake is complete
     * @param user_data the data to pass to the callback function
    */
    public void handshakeAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDtlsConnection.INST().g_dtls_connection_handshake_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "handshakeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous TLS handshake operation. See
     * <br>g_dtls_connection_handshake() for more information.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE on success, %FALSE on failure, in which case &#64;error will be set.
    */
    public boolean handshakeFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDtlsConnection.INST().g_dtls_connection_handshake_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * This sets the certificate that &#64;conn will present to its peer
     * <br>during the TLS handshake. For a &#35;GDtlsServerConnection, it is
     * <br>mandatory to set this, and that will normally be done at construct
     * <br>time.
     * <br>
     * <br>For a &#35;GDtlsClientConnection, this is optional. If a handshake fails
     * <br>with %G_TLS_ERROR_CERTIFICATE_REQUIRED, that means that the server
     * <br>requires a certificate, and if you try connecting again, you should
     * <br>call this method first. You can call
     * <br>g_dtls_client_connection_get_accepted_cas() on the failed connection
     * <br>to get a list of Certificate Authorities that the server will
     * <br>accept certificates from.
     * <br>
     * <br>(It is also possible that a server will allow the connection with
     * <br>or without a certificate; in that case, if you don't provide a
     * <br>certificate, you can tell that the server requested one by the fact
     * <br>that g_dtls_client_connection_get_accepted_cas() will return
     * <br>non-%NULL.)
     * @param certificate the certificate to use for &#64;conn
    */
    public void setCertificate(@Nonnull TlsCertificate certificate)  {
        JnaDtlsConnection.INST().g_dtls_connection_set_certificate(asCPointer(), asCPointerNotNull(certificate));
    }

    /**
     * Sets the certificate database that is used to verify peer certificates.
     * <br>This is set to the default database by default. See
     * <br>g_tls_backend_get_default_database(). If set to %NULL, then
     * <br>peer certificate validation will always set the
     * <br>%G_TLS_CERTIFICATE_UNKNOWN_CA error (meaning
     * <br>&#35;GDtlsConnection::accept-certificate will always be emitted on
     * <br>client-side connections, unless that bit is not set in
     * <br>&#35;GDtlsClientConnection:validation-flags).
     * <br>
     * <br>There are nonintuitive security implications when using a non-default
     * <br>database. See &#35;GDtlsConnection:database for details.
     * @param database a &#35;GTlsDatabase
    */
    public void setDatabase(@Nullable TlsDatabase database)  {
        JnaDtlsConnection.INST().g_dtls_connection_set_database(asCPointer(), asCPointer(database));
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
        JnaDtlsConnection.INST().g_dtls_connection_set_interaction(asCPointer(), asCPointer(interaction));
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
     * <br>redundant and may be omitted. You
     * <br>can use g_dtls_connection_set_require_close_notify() to tell &#64;conn
     * <br>to allow an &quot;unannounced&quot; connection close, in which case the close
     * <br>will show up as a 0-length read, as in a non-TLS
     * <br>&#35;GDatagramBased, and it is up to the application to check that
     * <br>the data has been fully received.
     * <br>
     * <br>Note that this only affects the behavior when the peer closes the
     * <br>connection; when the application calls g_dtls_connection_close_async() on
     * <br>&#64;conn itself, this will send a close notification regardless of the
     * <br>setting of this property. If you explicitly want to do an unclean
     * <br>close, you can close &#64;conn's &#35;GDtlsConnection:base-socket rather
     * <br>than closing &#64;conn itself.
     * @param require_close_notify whether or not to require close notification
    */
    public void setRequireCloseNotify(boolean require_close_notify)  {
        JnaDtlsConnection.INST().g_dtls_connection_set_require_close_notify(asCPointer(), require_close_notify);
    }

    /**
     * Shut down part or all of a DTLS connection.
     * <br>
     * <br>If &#64;shutdown_read is %TRUE then the receiving side of the connection is shut
     * <br>down, and further reading is disallowed. Subsequent calls to
     * <br>g_datagram_based_receive_messages() will return %G_IO_ERROR_CLOSED.
     * <br>
     * <br>If &#64;shutdown_write is %TRUE then the sending side of the connection is shut
     * <br>down, and further writing is disallowed. Subsequent calls to
     * <br>g_datagram_based_send_messages() will return %G_IO_ERROR_CLOSED.
     * <br>
     * <br>It is allowed for both &#64;shutdown_read and &#64;shutdown_write to be TRUE — this
     * <br>is equivalent to calling g_dtls_connection_close().
     * <br>
     * <br>If &#64;cancellable is cancelled, the &#35;GDtlsConnection may be left
     * <br>partially-closed and any pending untransmitted data may be lost. Call
     * <br>g_dtls_connection_shutdown() again to complete closing the &#35;GDtlsConnection.
     * @param shutdown_read %TRUE to stop reception of incoming datagrams
     * @param shutdown_write %TRUE to stop sending outgoing datagrams
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE on success, %FALSE otherwise
    */
    public boolean shutdown(boolean shutdown_read, boolean shutdown_write, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDtlsConnection.INST().g_dtls_connection_shutdown(asCPointer(), shutdown_read, shutdown_write, asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously shut down part or all of the DTLS connection. See
     * <br>g_dtls_connection_shutdown() for more information.
     * @param shutdown_read %TRUE to stop reception of incoming datagrams
     * @param shutdown_write %TRUE to stop sending outgoing datagrams
     * @param io_priority the [I/O priority][io-priority] of the request
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the shutdown operation is complete
     * @param user_data the data to pass to the callback function
    */
    public void shutdownAsync(boolean shutdown_read, boolean shutdown_write, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDtlsConnection.INST().g_dtls_connection_shutdown_async(asCPointer(), shutdown_read, shutdown_write, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "shutdownAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous TLS shutdown operation. See
     * <br>g_dtls_connection_shutdown() for more information.
     * @param result a &#35;GAsyncResult
     * @return %TRUE on success, %FALSE on failure, in which case &#64;error will be set
    */
    public boolean shutdownFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDtlsConnection.INST().g_dtls_connection_shutdown_finish(asCPointer(), asCPointerNotNull(result), 0L);
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
        return JnaDtlsConnection.INST().g_dtls_connection_get_type(); 
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

[MethodModel:cb-deprecated:getRehandshakeMode:[ParameterModel:Supported:{G_::{c:GTlsRehandshakeMode}}:{j:int}]]

[MethodModel:java-type-not-supported:setAdvertisedProtocols:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]

[MethodModel:cb-deprecated:setRehandshakeMode:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GTlsRehandshakeMode}}:{j:int}]
*/
