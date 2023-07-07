/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTlsDatabase is used to look up certificates and other information
 * <br>from a certificate or key store. It is an abstract base class which
 * <br>TLS library specific subtypes override.
 * <br>
 * <br>A &#35;GTlsDatabase may be accessed from multiple threads by the TLS backend.
 * <br>All implementations are required to be fully thread-safe.
 * <br>
 * <br>Most common client applications will not directly interact with
 * <br>&#35;GTlsDatabase. It is used internally by &#35;GTlsConnection.
 * <p><a href="https://docs.gtk.org/gio/class.TlsDatabase.html">https://docs.gtk.org/gio/class.TlsDatabase.html</a></p>
*/
public class TlsDatabase extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsDatabase.class.getCanonicalName());
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
    
    private static JnaTlsDatabase.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaTlsDatabase.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public TlsDatabase(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a handle string for the certificate. The database will only be able
     * <br>to create a handle for certificates that originate from the database. In
     * <br>cases where the database cannot create a handle for a certificate, %NULL
     * <br>will be returned.
     * <br>
     * <br>This handle should be stable across various instances of the application,
     * <br>and between applications. If a certificate is modified in the database,
     * <br>then it is not guaranteed that this handle will continue to point to it.
     * @param certificate certificate for which to create a handle.
     * @return a newly allocated string containing the handle.
    */
    public ch.bailu.gtk.type.Str createCertificateHandle(@Nonnull TlsCertificate certificate)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_create_certificate_handle(asCPointer(), asCPointerNotNull(certificate))));
    }

    /**
     * Look up a certificate by its handle.
     * <br>
     * <br>The handle should have been created by calling
     * <br>g_tls_database_create_certificate_handle() on a &#35;GTlsDatabase object of
     * <br>the same TLS backend. The handle is designed to remain valid across
     * <br>instantiations of the database.
     * <br>
     * <br>If the handle is no longer valid, or does not point to a certificate in
     * <br>this database, then %NULL will be returned.
     * <br>
     * <br>This function can block, use g_tls_database_lookup_certificate_for_handle_async() to perform
     * <br>the lookup operation asynchronously.
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a newly allocated &#35;GTlsCertificate, or %NULL. Use g_object_unref() to release the certificate.
    */
    public TlsCertificate lookupCertificateForHandle(@Nonnull ch.bailu.gtk.type.Str handle, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsCertificate(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_lookup_certificate_for_handle(asCPointer(), asCPointerNotNull(handle), asCPointer(interaction), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Look up a certificate by its handle.
     * <br>
     * <br>The handle should have been created by calling
     * <br>g_tls_database_create_certificate_handle() on a &#35;GTlsDatabase object of
     * <br>the same TLS backend. The handle is designed to remain valid across
     * <br>instantiations of the database.
     * <br>
     * <br>If the handle is no longer valid, or does not point to a certificate in
     * <br>this database, then %NULL will be returned.
     * <br>
     * <br>This function can block, use g_tls_database_lookup_certificate_for_handle_async() to perform
     * <br>the lookup operation asynchronously.
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a newly allocated &#35;GTlsCertificate, or %NULL. Use g_object_unref() to release the certificate.
    */
    public TlsCertificate lookupCertificateForHandle(String handle, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsCertificate(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_lookup_certificate_for_handle(asCPointer(), handle, asCPointer(interaction), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously look up a certificate by its handle in the database. See
     * <br>g_tls_database_lookup_certificate_for_handle() for more information.
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the operation completes
     * @param user_data the data to pass to the callback function
    */
    public void lookupCertificateForHandleAsync(@Nonnull ch.bailu.gtk.type.Str handle, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsDatabase.INST().g_tls_database_lookup_certificate_for_handle_async(asCPointer(), asCPointerNotNull(handle), asCPointer(interaction), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupCertificateForHandleAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously look up a certificate by its handle in the database. See
     * <br>g_tls_database_lookup_certificate_for_handle() for more information.
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the operation completes
     * @param user_data the data to pass to the callback function
    */
    public void lookupCertificateForHandleAsync(String handle, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsDatabase.INST().g_tls_database_lookup_certificate_for_handle_async(asCPointer(), handle, asCPointer(interaction), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupCertificateForHandleAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous lookup of a certificate by its handle. See
     * <br>g_tls_database_lookup_certificate_for_handle() for more information.
     * <br>
     * <br>If the handle is no longer valid, or does not point to a certificate in
     * <br>this database, then %NULL will be returned.
     * @param result a &#35;GAsyncResult.
     * @return a newly allocated &#35;GTlsCertificate object. Use g_object_unref() to release the certificate.
    */
    public TlsCertificate lookupCertificateForHandleFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsCertificate(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_lookup_certificate_for_handle_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Look up the issuer of &#64;certificate in the database. The
     * <br>&#35;GTlsCertificate:issuer property of &#64;certificate is not modified, and
     * <br>the two certificates are not hooked into a chain.
     * <br>
     * <br>This function can block. Use g_tls_database_lookup_certificate_issuer_async()
     * <br>to perform the lookup operation asynchronously.
     * <br>
     * <br>Beware this function cannot be used to build certification paths. The
     * <br>issuer certificate returned by this function may not be the same as
     * <br>the certificate that would actually be used to construct a valid
     * <br>certification path during certificate verification.
     * <br>[RFC 4158](https://datatracker.ietf.org/doc/html/rfc4158) explains
     * <br>why an issuer certificate cannot be naively assumed to be part of the
     * <br>the certification path (though GLib's TLS backends may not follow the
     * <br>path building strategies outlined in this RFC). Due to the complexity
     * <br>of certification path building, GLib does not provide any way to know
     * <br>which certification path will actually be used when verifying a TLS
     * <br>certificate. Accordingly, this function cannot be used to make
     * <br>security-related decisions. Only GLib itself should make security
     * <br>decisions about TLS certificates.
     * @param certificate a &#35;GTlsCertificate
     * @param interaction used to interact with the user if necessary
     * @param flags flags which affect the lookup operation
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a newly allocated issuer &#35;GTlsCertificate, or %NULL. Use g_object_unref() to release the certificate.
    */
    public TlsCertificate lookupCertificateIssuer(@Nonnull TlsCertificate certificate, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsCertificate(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_lookup_certificate_issuer(asCPointer(), asCPointerNotNull(certificate), asCPointer(interaction), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously look up the issuer of &#64;certificate in the database. See
     * <br>g_tls_database_lookup_certificate_issuer() for more information.
     * @param certificate a &#35;GTlsCertificate
     * @param interaction used to interact with the user if necessary
     * @param flags flags which affect the lookup operation
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the operation completes
     * @param user_data the data to pass to the callback function
    */
    public void lookupCertificateIssuerAsync(@Nonnull TlsCertificate certificate, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsDatabase.INST().g_tls_database_lookup_certificate_issuer_async(asCPointer(), asCPointerNotNull(certificate), asCPointer(interaction), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupCertificateIssuerAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous lookup issuer operation. See
     * <br>g_tls_database_lookup_certificate_issuer() for more information.
     * @param result a &#35;GAsyncResult.
     * @return a newly allocated issuer &#35;GTlsCertificate, or %NULL. Use g_object_unref() to release the certificate.
    */
    public TlsCertificate lookupCertificateIssuerFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsCertificate(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_lookup_certificate_issuer_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Look up certificates issued by this issuer in the database.
     * <br>
     * <br>This function can block, use g_tls_database_lookup_certificates_issued_by_async() to perform
     * <br>the lookup operation asynchronously.
     * @param issuer_raw_dn a &#35;GByteArray which holds the DER encoded issuer DN.
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup operation.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a newly allocated list of &#35;GTlsCertificate objects. Use g_object_unref() on each certificate, and g_list_free() on the release the list.
    */
    public ch.bailu.gtk.glib.List lookupCertificatesIssuedBy(@Nonnull ch.bailu.gtk.glib.ByteArray issuer_raw_dn, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_lookup_certificates_issued_by(asCPointer(), asCPointerNotNull(issuer_raw_dn), asCPointer(interaction), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously look up certificates issued by this issuer in the database. See
     * <br>g_tls_database_lookup_certificates_issued_by() for more information.
     * <br>
     * <br>The database may choose to hold a reference to the issuer byte array for the duration
     * <br>of of this asynchronous operation. The byte array should not be modified during
     * <br>this time.
     * @param issuer_raw_dn a &#35;GByteArray which holds the DER encoded issuer DN.
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup operation.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the operation completes
     * @param user_data the data to pass to the callback function
    */
    public void lookupCertificatesIssuedByAsync(@Nonnull ch.bailu.gtk.glib.ByteArray issuer_raw_dn, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsDatabase.INST().g_tls_database_lookup_certificates_issued_by_async(asCPointer(), asCPointerNotNull(issuer_raw_dn), asCPointer(interaction), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupCertificatesIssuedByAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous lookup of certificates. See
     * <br>g_tls_database_lookup_certificates_issued_by() for more information.
     * @param result a &#35;GAsyncResult.
     * @return a newly allocated list of &#35;GTlsCertificate objects. Use g_object_unref() on each certificate, and g_list_free() on the release the list.
    */
    public ch.bailu.gtk.glib.List lookupCertificatesIssuedByFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaTlsDatabase.INST().g_tls_database_lookup_certificates_issued_by_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Determines the validity of a certificate chain, outside the context
     * <br>of a TLS session.
     * <br>
     * <br>&#64;chain is a chain of &#35;GTlsCertificate objects each pointing to the next
     * <br>certificate in the chain by its &#35;GTlsCertificate:issuer property.
     * <br>
     * <br>&#64;purpose describes the purpose (or usage) for which the certificate
     * <br>is being used. Typically &#64;purpose will be set to %G_TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER
     * <br>which means that the certificate is being used to authenticate a server
     * <br>(and we are acting as the client).
     * <br>
     * <br>The &#64;identity is used to ensure the server certificate is valid for
     * <br>the expected peer identity. If the identity does not match the
     * <br>certificate, %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the
     * <br>return value. If &#64;identity is %NULL, that bit will never be set in
     * <br>the return value. The peer identity may also be used to check for
     * <br>pinned certificates (trust exceptions) in the database. These may
     * <br>override the normal verification process on a host-by-host basis.
     * <br>
     * <br>Currently there are no &#64;flags, and %G_TLS_DATABASE_VERIFY_NONE should be
     * <br>used.
     * <br>
     * <br>If &#64;chain is found to be valid, then the return value will be 0. If
     * <br>&#64;chain is found to be invalid, then the return value will indicate at
     * <br>least one problem found. If the function is unable to determine
     * <br>whether &#64;chain is valid (for example, because &#64;cancellable is
     * <br>triggered before it completes) then the return value will be
     * <br>%G_TLS_CERTIFICATE_GENERIC_ERROR and &#64;error will be set accordingly.
     * <br>&#64;error is not set when &#64;chain is successfully analyzed but found to
     * <br>be invalid.
     * <br>
     * <br>GLib guarantees that if certificate verification fails, at least one
     * <br>error will be set in the return value, but it does not guarantee
     * <br>that all possible errors will be set. Accordingly, you may not safely
     * <br>decide to ignore any particular type of error. For example, it would
     * <br>be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow
     * <br>expired certificates, because this could potentially be the only
     * <br>error flag set even if other problems exist with the certificate.
     * <br>
     * <br>Prior to GLib 2.48, GLib's default TLS backend modified &#64;chain to
     * <br>represent the certification path built by &#35;GTlsDatabase during
     * <br>certificate verification by adjusting the &#35;GTlsCertificate:issuer
     * <br>property of each certificate in &#64;chain. Since GLib 2.48, this no
     * <br>longer occurs, so you cannot rely on &#35;GTlsCertificate:issuer to
     * <br>represent the actual certification path used during certificate
     * <br>verification.
     * <br>
     * <br>Because TLS session context is not used, &#35;GTlsDatabase may not
     * <br>perform as many checks on the certificates as &#35;GTlsConnection would.
     * <br>For example, certificate constraints may not be honored, and
     * <br>revocation checks may not be performed. The best way to verify TLS
     * <br>certificates used by a TLS connection is to let &#35;GTlsConnection
     * <br>handle the verification.
     * <br>
     * <br>The TLS backend may attempt to look up and add missing certificates
     * <br>to the chain. This may involve HTTP requests to download missing
     * <br>certificates.
     * <br>
     * <br>This function can block. Use g_tls_database_verify_chain_async() to
     * <br>perform the verification operation asynchronously.
     * @param chain a &#35;GTlsCertificate chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return the appropriate &#35;GTlsCertificateFlags which represents the result of verification.
    */
    public int verifyChain(@Nonnull TlsCertificate chain, @Nonnull ch.bailu.gtk.type.Str purpose, @Nullable SocketConnectable identity, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsDatabase.INST().g_tls_database_verify_chain(asCPointer(), asCPointerNotNull(chain), asCPointerNotNull(purpose), asCPointer(identity), asCPointer(interaction), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Determines the validity of a certificate chain, outside the context
     * <br>of a TLS session.
     * <br>
     * <br>&#64;chain is a chain of &#35;GTlsCertificate objects each pointing to the next
     * <br>certificate in the chain by its &#35;GTlsCertificate:issuer property.
     * <br>
     * <br>&#64;purpose describes the purpose (or usage) for which the certificate
     * <br>is being used. Typically &#64;purpose will be set to %G_TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER
     * <br>which means that the certificate is being used to authenticate a server
     * <br>(and we are acting as the client).
     * <br>
     * <br>The &#64;identity is used to ensure the server certificate is valid for
     * <br>the expected peer identity. If the identity does not match the
     * <br>certificate, %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the
     * <br>return value. If &#64;identity is %NULL, that bit will never be set in
     * <br>the return value. The peer identity may also be used to check for
     * <br>pinned certificates (trust exceptions) in the database. These may
     * <br>override the normal verification process on a host-by-host basis.
     * <br>
     * <br>Currently there are no &#64;flags, and %G_TLS_DATABASE_VERIFY_NONE should be
     * <br>used.
     * <br>
     * <br>If &#64;chain is found to be valid, then the return value will be 0. If
     * <br>&#64;chain is found to be invalid, then the return value will indicate at
     * <br>least one problem found. If the function is unable to determine
     * <br>whether &#64;chain is valid (for example, because &#64;cancellable is
     * <br>triggered before it completes) then the return value will be
     * <br>%G_TLS_CERTIFICATE_GENERIC_ERROR and &#64;error will be set accordingly.
     * <br>&#64;error is not set when &#64;chain is successfully analyzed but found to
     * <br>be invalid.
     * <br>
     * <br>GLib guarantees that if certificate verification fails, at least one
     * <br>error will be set in the return value, but it does not guarantee
     * <br>that all possible errors will be set. Accordingly, you may not safely
     * <br>decide to ignore any particular type of error. For example, it would
     * <br>be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow
     * <br>expired certificates, because this could potentially be the only
     * <br>error flag set even if other problems exist with the certificate.
     * <br>
     * <br>Prior to GLib 2.48, GLib's default TLS backend modified &#64;chain to
     * <br>represent the certification path built by &#35;GTlsDatabase during
     * <br>certificate verification by adjusting the &#35;GTlsCertificate:issuer
     * <br>property of each certificate in &#64;chain. Since GLib 2.48, this no
     * <br>longer occurs, so you cannot rely on &#35;GTlsCertificate:issuer to
     * <br>represent the actual certification path used during certificate
     * <br>verification.
     * <br>
     * <br>Because TLS session context is not used, &#35;GTlsDatabase may not
     * <br>perform as many checks on the certificates as &#35;GTlsConnection would.
     * <br>For example, certificate constraints may not be honored, and
     * <br>revocation checks may not be performed. The best way to verify TLS
     * <br>certificates used by a TLS connection is to let &#35;GTlsConnection
     * <br>handle the verification.
     * <br>
     * <br>The TLS backend may attempt to look up and add missing certificates
     * <br>to the chain. This may involve HTTP requests to download missing
     * <br>certificates.
     * <br>
     * <br>This function can block. Use g_tls_database_verify_chain_async() to
     * <br>perform the verification operation asynchronously.
     * @param chain a &#35;GTlsCertificate chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return the appropriate &#35;GTlsCertificateFlags which represents the result of verification.
    */
    public int verifyChain(@Nonnull TlsCertificate chain, String purpose, @Nullable SocketConnectable identity, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsDatabase.INST().g_tls_database_verify_chain(asCPointer(), asCPointerNotNull(chain), purpose, asCPointer(identity), asCPointer(interaction), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously determines the validity of a certificate chain after
     * <br>looking up and adding any missing certificates to the chain. See
     * <br>g_tls_database_verify_chain() for more information.
     * @param chain a &#35;GTlsCertificate chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the operation completes
     * @param user_data the data to pass to the callback function
    */
    public void verifyChainAsync(@Nonnull TlsCertificate chain, @Nonnull ch.bailu.gtk.type.Str purpose, @Nullable SocketConnectable identity, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsDatabase.INST().g_tls_database_verify_chain_async(asCPointer(), asCPointerNotNull(chain), asCPointerNotNull(purpose), asCPointer(identity), asCPointer(interaction), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "verifyChainAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously determines the validity of a certificate chain after
     * <br>looking up and adding any missing certificates to the chain. See
     * <br>g_tls_database_verify_chain() for more information.
     * @param chain a &#35;GTlsCertificate chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call when the operation completes
     * @param user_data the data to pass to the callback function
    */
    public void verifyChainAsync(@Nonnull TlsCertificate chain, String purpose, @Nullable SocketConnectable identity, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsDatabase.INST().g_tls_database_verify_chain_async(asCPointer(), asCPointerNotNull(chain), purpose, asCPointer(identity), asCPointer(interaction), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "verifyChainAsync", callback), asCPointer(user_data));
    }

    /**
     * Finish an asynchronous verify chain operation. See
     * <br>g_tls_database_verify_chain() for more information.
     * <br>
     * <br>If &#64;chain is found to be valid, then the return value will be 0. If
     * <br>&#64;chain is found to be invalid, then the return value will indicate
     * <br>the problems found. If the function is unable to determine whether
     * <br>&#64;chain is valid or not (eg, because &#64;cancellable is triggered
     * <br>before it completes) then the return value will be
     * <br>%G_TLS_CERTIFICATE_GENERIC_ERROR and &#64;error will be set
     * <br>accordingly. &#64;error is not set when &#64;chain is successfully analyzed
     * <br>but found to be invalid.
     * @param result a &#35;GAsyncResult.
     * @return the appropriate &#35;GTlsCertificateFlags which represents the result of verification.
    */
    public int verifyChainFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsDatabase.INST().g_tls_database_verify_chain_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    public static long getTypeID() { 
        return JnaTlsDatabase.INST().g_tls_database_get_type(); 
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
