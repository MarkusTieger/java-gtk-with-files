/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class for &#35;GTlsDatabase. Derived classes should implement the various
 * <br>virtual methods. _async and _finish methods have a default
 * <br>implementation that runs the corresponding sync method in a thread.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsDatabaseClass.html">https://docs.gtk.org/gio/struct.TlsDatabaseClass.html</a></p>
*/
public class TlsDatabaseClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsDatabaseClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnVerifyChain {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param chain a &#35;GTlsCertificate chain
         * @param purpose the purpose that this certificate chain will be used for.
         * @param identity the expected peer identity
         * @param interaction used to interact with the user if necessary
         * @param flags additional verify flags
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return the appropriate &#35;GTlsCertificateFlags which represents the result of verification.
        */
        int onVerifyChain(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull TlsCertificate chain, @Nonnull ch.bailu.gtk.type.Str purpose, @Nullable SocketConnectable identity, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaTlsDatabaseClass.OnVerifyChain toOnVerifyChain(ch.bailu.gtk.type.Pointer instance, String methodName, OnVerifyChain in) {
        JnaTlsDatabaseClass.OnVerifyChain out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _chain, _purpose, _identity, _interaction, _flags, _cancellable, _error) -> in.onVerifyChain(__callback, new TlsDatabase(new PointerContainer(_self)), new TlsCertificate(new PointerContainer(_chain)), new ch.bailu.gtk.type.Str(new PointerContainer(_purpose)), new SocketConnectable(new PointerContainer(_identity)), new TlsInteraction(new PointerContainer(_interaction)), _flags, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnVerifyChainFinish {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param result a &#35;GAsyncResult.
         * @return the appropriate &#35;GTlsCertificateFlags which represents the result of verification.
        */
        int onVerifyChainFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull AsyncResult result);
    }
    
    private static JnaTlsDatabaseClass.OnVerifyChainFinish toOnVerifyChainFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnVerifyChainFinish in) {
        JnaTlsDatabaseClass.OnVerifyChainFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _result, _error) -> in.onVerifyChainFinish(__callback, new TlsDatabase(new PointerContainer(_self)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateCertificateHandle {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param certificate certificate for which to create a handle.
         * @return a newly allocated string containing the handle.
        */
        ch.bailu.gtk.type.Str onCreateCertificateHandle(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull TlsCertificate certificate);
    }
    
    private static JnaTlsDatabaseClass.OnCreateCertificateHandle toOnCreateCertificateHandle(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateCertificateHandle in) {
        JnaTlsDatabaseClass.OnCreateCertificateHandle out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _certificate) -> in.onCreateCertificateHandle(__callback, new TlsDatabase(new PointerContainer(_self)), new TlsCertificate(new PointerContainer(_certificate))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupCertificateForHandle {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param handle a certificate handle
         * @param interaction used to interact with the user if necessary
         * @param flags Flags which affect the lookup.
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a newly allocated &#35;GTlsCertificate, or %NULL. Use g_object_unref() to release the certificate.
        */
        TlsCertificate onLookupCertificateForHandle(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull ch.bailu.gtk.type.Str handle, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaTlsDatabaseClass.OnLookupCertificateForHandle toOnLookupCertificateForHandle(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupCertificateForHandle in) {
        JnaTlsDatabaseClass.OnLookupCertificateForHandle out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _handle, _interaction, _flags, _cancellable, _error) -> in.onLookupCertificateForHandle(__callback, new TlsDatabase(new PointerContainer(_self)), new ch.bailu.gtk.type.Str(new PointerContainer(_handle)), new TlsInteraction(new PointerContainer(_interaction)), _flags, new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupCertificateForHandleFinish {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param result a &#35;GAsyncResult.
         * @return a newly allocated &#35;GTlsCertificate object. Use g_object_unref() to release the certificate.
        */
        TlsCertificate onLookupCertificateForHandleFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull AsyncResult result);
    }
    
    private static JnaTlsDatabaseClass.OnLookupCertificateForHandleFinish toOnLookupCertificateForHandleFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupCertificateForHandleFinish in) {
        JnaTlsDatabaseClass.OnLookupCertificateForHandleFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _result, _error) -> in.onLookupCertificateForHandleFinish(__callback, new TlsDatabase(new PointerContainer(_self)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupCertificateIssuer {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param certificate a &#35;GTlsCertificate
         * @param interaction used to interact with the user if necessary
         * @param flags flags which affect the lookup operation
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a newly allocated issuer &#35;GTlsCertificate, or %NULL. Use g_object_unref() to release the certificate.
        */
        TlsCertificate onLookupCertificateIssuer(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull TlsCertificate certificate, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaTlsDatabaseClass.OnLookupCertificateIssuer toOnLookupCertificateIssuer(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupCertificateIssuer in) {
        JnaTlsDatabaseClass.OnLookupCertificateIssuer out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _certificate, _interaction, _flags, _cancellable, _error) -> in.onLookupCertificateIssuer(__callback, new TlsDatabase(new PointerContainer(_self)), new TlsCertificate(new PointerContainer(_certificate)), new TlsInteraction(new PointerContainer(_interaction)), _flags, new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupCertificateIssuerFinish {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param result a &#35;GAsyncResult.
         * @return a newly allocated issuer &#35;GTlsCertificate, or %NULL. Use g_object_unref() to release the certificate.
        */
        TlsCertificate onLookupCertificateIssuerFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull AsyncResult result);
    }
    
    private static JnaTlsDatabaseClass.OnLookupCertificateIssuerFinish toOnLookupCertificateIssuerFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupCertificateIssuerFinish in) {
        JnaTlsDatabaseClass.OnLookupCertificateIssuerFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _result, _error) -> in.onLookupCertificateIssuerFinish(__callback, new TlsDatabase(new PointerContainer(_self)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupCertificatesIssuedBy {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param issuer_raw_dn a &#35;GByteArray which holds the DER encoded issuer DN.
         * @param interaction used to interact with the user if necessary
         * @param flags Flags which affect the lookup operation.
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a newly allocated list of &#35;GTlsCertificate objects. Use g_object_unref() on each certificate, and g_list_free() on the release the list.
        */
        ch.bailu.gtk.glib.List onLookupCertificatesIssuedBy(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull ch.bailu.gtk.glib.ByteArray issuer_raw_dn, @Nullable TlsInteraction interaction, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaTlsDatabaseClass.OnLookupCertificatesIssuedBy toOnLookupCertificatesIssuedBy(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupCertificatesIssuedBy in) {
        JnaTlsDatabaseClass.OnLookupCertificatesIssuedBy out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _issuer_raw_dn, _interaction, _flags, _cancellable, _error) -> in.onLookupCertificatesIssuedBy(__callback, new TlsDatabase(new PointerContainer(_self)), new ch.bailu.gtk.glib.ByteArray(new PointerContainer(_issuer_raw_dn)), new TlsInteraction(new PointerContainer(_interaction)), _flags, new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupCertificatesIssuedByFinish {
        /**
         * 
         * @param self a &#35;GTlsDatabase
         * @param result a &#35;GAsyncResult.
         * @return a newly allocated list of &#35;GTlsCertificate objects. Use g_object_unref() on each certificate, and g_list_free() on the release the list.
        */
        ch.bailu.gtk.glib.List onLookupCertificatesIssuedByFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsDatabase self, @Nonnull AsyncResult result);
    }
    
    private static JnaTlsDatabaseClass.OnLookupCertificatesIssuedByFinish toOnLookupCertificatesIssuedByFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupCertificatesIssuedByFinish in) {
        JnaTlsDatabaseClass.OnLookupCertificatesIssuedByFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _result, _error) -> in.onLookupCertificatesIssuedByFinish(__callback, new TlsDatabase(new PointerContainer(_self)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public TlsDatabaseClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTlsDatabaseClass.Fields _fields;
    
    JnaTlsDatabaseClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsDatabaseClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnVerifyChain#onVerifyChain}
    */
    public static final String VERIFY_CHAIN = "verify_chain";

    /**
     * 
     * <br>See {@link OnVerifyChain#onVerifyChain}
    */
    public void setFieldVerifyChain(OnVerifyChain verify_chain) {
        toFields().verify_chain = toOnVerifyChain(this, VERIFY_CHAIN, verify_chain);
        toFields().writeField(VERIFY_CHAIN);
    }

    /**
     * 
     * <br>See {@link OnVerifyChain#onVerifyChain}
    */
    public JnaTlsDatabaseClass.OnVerifyChain getFieldVerifyChain() {
       toFields().readField(VERIFY_CHAIN);
       return toFields().verify_chain;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String VERIFY_CHAIN_ASYNC = "verify_chain_async";

    /**
     * 
     * <br>See {@link OnVerifyChainFinish#onVerifyChainFinish}
    */
    public static final String VERIFY_CHAIN_FINISH = "verify_chain_finish";

    /**
     * 
     * <br>See {@link OnVerifyChainFinish#onVerifyChainFinish}
    */
    public void setFieldVerifyChainFinish(OnVerifyChainFinish verify_chain_finish) {
        toFields().verify_chain_finish = toOnVerifyChainFinish(this, VERIFY_CHAIN_FINISH, verify_chain_finish);
        toFields().writeField(VERIFY_CHAIN_FINISH);
    }

    /**
     * 
     * <br>See {@link OnVerifyChainFinish#onVerifyChainFinish}
    */
    public JnaTlsDatabaseClass.OnVerifyChainFinish getFieldVerifyChainFinish() {
       toFields().readField(VERIFY_CHAIN_FINISH);
       return toFields().verify_chain_finish;
    } 

    /**
     * 
     * <br>See {@link OnCreateCertificateHandle#onCreateCertificateHandle}
    */
    public static final String CREATE_CERTIFICATE_HANDLE = "create_certificate_handle";

    /**
     * 
     * <br>See {@link OnCreateCertificateHandle#onCreateCertificateHandle}
    */
    public void setFieldCreateCertificateHandle(OnCreateCertificateHandle create_certificate_handle) {
        toFields().create_certificate_handle = toOnCreateCertificateHandle(this, CREATE_CERTIFICATE_HANDLE, create_certificate_handle);
        toFields().writeField(CREATE_CERTIFICATE_HANDLE);
    }

    /**
     * 
     * <br>See {@link OnCreateCertificateHandle#onCreateCertificateHandle}
    */
    public JnaTlsDatabaseClass.OnCreateCertificateHandle getFieldCreateCertificateHandle() {
       toFields().readField(CREATE_CERTIFICATE_HANDLE);
       return toFields().create_certificate_handle;
    } 

    /**
     * 
     * <br>See {@link OnLookupCertificateForHandle#onLookupCertificateForHandle}
    */
    public static final String LOOKUP_CERTIFICATE_FOR_HANDLE = "lookup_certificate_for_handle";

    /**
     * 
     * <br>See {@link OnLookupCertificateForHandle#onLookupCertificateForHandle}
    */
    public void setFieldLookupCertificateForHandle(OnLookupCertificateForHandle lookup_certificate_for_handle) {
        toFields().lookup_certificate_for_handle = toOnLookupCertificateForHandle(this, LOOKUP_CERTIFICATE_FOR_HANDLE, lookup_certificate_for_handle);
        toFields().writeField(LOOKUP_CERTIFICATE_FOR_HANDLE);
    }

    /**
     * 
     * <br>See {@link OnLookupCertificateForHandle#onLookupCertificateForHandle}
    */
    public JnaTlsDatabaseClass.OnLookupCertificateForHandle getFieldLookupCertificateForHandle() {
       toFields().readField(LOOKUP_CERTIFICATE_FOR_HANDLE);
       return toFields().lookup_certificate_for_handle;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_CERTIFICATE_FOR_HANDLE_ASYNC = "lookup_certificate_for_handle_async";

    /**
     * 
     * <br>See {@link OnLookupCertificateForHandleFinish#onLookupCertificateForHandleFinish}
    */
    public static final String LOOKUP_CERTIFICATE_FOR_HANDLE_FINISH = "lookup_certificate_for_handle_finish";

    /**
     * 
     * <br>See {@link OnLookupCertificateForHandleFinish#onLookupCertificateForHandleFinish}
    */
    public void setFieldLookupCertificateForHandleFinish(OnLookupCertificateForHandleFinish lookup_certificate_for_handle_finish) {
        toFields().lookup_certificate_for_handle_finish = toOnLookupCertificateForHandleFinish(this, LOOKUP_CERTIFICATE_FOR_HANDLE_FINISH, lookup_certificate_for_handle_finish);
        toFields().writeField(LOOKUP_CERTIFICATE_FOR_HANDLE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupCertificateForHandleFinish#onLookupCertificateForHandleFinish}
    */
    public JnaTlsDatabaseClass.OnLookupCertificateForHandleFinish getFieldLookupCertificateForHandleFinish() {
       toFields().readField(LOOKUP_CERTIFICATE_FOR_HANDLE_FINISH);
       return toFields().lookup_certificate_for_handle_finish;
    } 

    /**
     * 
     * <br>See {@link OnLookupCertificateIssuer#onLookupCertificateIssuer}
    */
    public static final String LOOKUP_CERTIFICATE_ISSUER = "lookup_certificate_issuer";

    /**
     * 
     * <br>See {@link OnLookupCertificateIssuer#onLookupCertificateIssuer}
    */
    public void setFieldLookupCertificateIssuer(OnLookupCertificateIssuer lookup_certificate_issuer) {
        toFields().lookup_certificate_issuer = toOnLookupCertificateIssuer(this, LOOKUP_CERTIFICATE_ISSUER, lookup_certificate_issuer);
        toFields().writeField(LOOKUP_CERTIFICATE_ISSUER);
    }

    /**
     * 
     * <br>See {@link OnLookupCertificateIssuer#onLookupCertificateIssuer}
    */
    public JnaTlsDatabaseClass.OnLookupCertificateIssuer getFieldLookupCertificateIssuer() {
       toFields().readField(LOOKUP_CERTIFICATE_ISSUER);
       return toFields().lookup_certificate_issuer;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_CERTIFICATE_ISSUER_ASYNC = "lookup_certificate_issuer_async";

    /**
     * 
     * <br>See {@link OnLookupCertificateIssuerFinish#onLookupCertificateIssuerFinish}
    */
    public static final String LOOKUP_CERTIFICATE_ISSUER_FINISH = "lookup_certificate_issuer_finish";

    /**
     * 
     * <br>See {@link OnLookupCertificateIssuerFinish#onLookupCertificateIssuerFinish}
    */
    public void setFieldLookupCertificateIssuerFinish(OnLookupCertificateIssuerFinish lookup_certificate_issuer_finish) {
        toFields().lookup_certificate_issuer_finish = toOnLookupCertificateIssuerFinish(this, LOOKUP_CERTIFICATE_ISSUER_FINISH, lookup_certificate_issuer_finish);
        toFields().writeField(LOOKUP_CERTIFICATE_ISSUER_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupCertificateIssuerFinish#onLookupCertificateIssuerFinish}
    */
    public JnaTlsDatabaseClass.OnLookupCertificateIssuerFinish getFieldLookupCertificateIssuerFinish() {
       toFields().readField(LOOKUP_CERTIFICATE_ISSUER_FINISH);
       return toFields().lookup_certificate_issuer_finish;
    } 

    /**
     * 
     * <br>See {@link OnLookupCertificatesIssuedBy#onLookupCertificatesIssuedBy}
    */
    public static final String LOOKUP_CERTIFICATES_ISSUED_BY = "lookup_certificates_issued_by";

    /**
     * 
     * <br>See {@link OnLookupCertificatesIssuedBy#onLookupCertificatesIssuedBy}
    */
    public void setFieldLookupCertificatesIssuedBy(OnLookupCertificatesIssuedBy lookup_certificates_issued_by) {
        toFields().lookup_certificates_issued_by = toOnLookupCertificatesIssuedBy(this, LOOKUP_CERTIFICATES_ISSUED_BY, lookup_certificates_issued_by);
        toFields().writeField(LOOKUP_CERTIFICATES_ISSUED_BY);
    }

    /**
     * 
     * <br>See {@link OnLookupCertificatesIssuedBy#onLookupCertificatesIssuedBy}
    */
    public JnaTlsDatabaseClass.OnLookupCertificatesIssuedBy getFieldLookupCertificatesIssuedBy() {
       toFields().readField(LOOKUP_CERTIFICATES_ISSUED_BY);
       return toFields().lookup_certificates_issued_by;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_CERTIFICATES_ISSUED_BY_ASYNC = "lookup_certificates_issued_by_async";

    /**
     * 
     * <br>See {@link OnLookupCertificatesIssuedByFinish#onLookupCertificatesIssuedByFinish}
    */
    public static final String LOOKUP_CERTIFICATES_ISSUED_BY_FINISH = "lookup_certificates_issued_by_finish";

    /**
     * 
     * <br>See {@link OnLookupCertificatesIssuedByFinish#onLookupCertificatesIssuedByFinish}
    */
    public void setFieldLookupCertificatesIssuedByFinish(OnLookupCertificatesIssuedByFinish lookup_certificates_issued_by_finish) {
        toFields().lookup_certificates_issued_by_finish = toOnLookupCertificatesIssuedByFinish(this, LOOKUP_CERTIFICATES_ISSUED_BY_FINISH, lookup_certificates_issued_by_finish);
        toFields().writeField(LOOKUP_CERTIFICATES_ISSUED_BY_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupCertificatesIssuedByFinish#onLookupCertificatesIssuedByFinish}
    */
    public JnaTlsDatabaseClass.OnLookupCertificatesIssuedByFinish getFieldLookupCertificatesIssuedByFinish() {
       toFields().readField(LOOKUP_CERTIFICATES_ISSUED_BY_FINISH);
       return toFields().lookup_certificates_issued_by_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsDatabase.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsDatabase.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
