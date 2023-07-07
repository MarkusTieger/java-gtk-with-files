/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for describing TLS-related types.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsBackendInterface.html">https://docs.gtk.org/gio/struct.TlsBackendInterface.html</a></p>
*/
public class TlsBackendInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsBackendInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSupportsTls {
        /**
         * 
         * @param backend the &#35;GTlsBackend
         * @return whether or not TLS is supported
        */
        boolean onSupportsTls(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsBackend backend);
    }
    
    private static JnaTlsBackendInterface.OnSupportsTls toOnSupportsTls(ch.bailu.gtk.type.Pointer instance, String methodName, OnSupportsTls in) {
        JnaTlsBackendInterface.OnSupportsTls out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend) -> in.onSupportsTls(__callback, new TlsBackend(new PointerContainer(_backend)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetCertificateType {
        /**
         * 
         * @return 
        */
        long onGetCertificateType(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTlsBackendInterface.OnGetCertificateType toOnGetCertificateType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetCertificateType in) {
        JnaTlsBackendInterface.OnGetCertificateType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGetCertificateType(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetClientConnectionType {
        /**
         * 
         * @return 
        */
        long onGetClientConnectionType(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTlsBackendInterface.OnGetClientConnectionType toOnGetClientConnectionType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetClientConnectionType in) {
        JnaTlsBackendInterface.OnGetClientConnectionType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGetClientConnectionType(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetServerConnectionType {
        /**
         * 
         * @return 
        */
        long onGetServerConnectionType(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTlsBackendInterface.OnGetServerConnectionType toOnGetServerConnectionType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetServerConnectionType in) {
        JnaTlsBackendInterface.OnGetServerConnectionType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGetServerConnectionType(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFileDatabaseType {
        /**
         * 
         * @return 
        */
        long onGetFileDatabaseType(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTlsBackendInterface.OnGetFileDatabaseType toOnGetFileDatabaseType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFileDatabaseType in) {
        JnaTlsBackendInterface.OnGetFileDatabaseType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGetFileDatabaseType(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDefaultDatabase {
        /**
         * 
         * @param backend the &#35;GTlsBackend
         * @return the default database, which should be               unreffed when done.
        */
        TlsDatabase onGetDefaultDatabase(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsBackend backend);
    }
    
    private static JnaTlsBackendInterface.OnGetDefaultDatabase toOnGetDefaultDatabase(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDefaultDatabase in) {
        JnaTlsBackendInterface.OnGetDefaultDatabase out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend) -> in.onGetDefaultDatabase(__callback, new TlsBackend(new PointerContainer(_backend))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSupportsDtls {
        /**
         * 
         * @param backend the &#35;GTlsBackend
         * @return whether DTLS is supported
        */
        boolean onSupportsDtls(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsBackend backend);
    }
    
    private static JnaTlsBackendInterface.OnSupportsDtls toOnSupportsDtls(ch.bailu.gtk.type.Pointer instance, String methodName, OnSupportsDtls in) {
        JnaTlsBackendInterface.OnSupportsDtls out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend) -> in.onSupportsDtls(__callback, new TlsBackend(new PointerContainer(_backend)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDtlsClientConnectionType {
        /**
         * 
         * @return 
        */
        long onGetDtlsClientConnectionType(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTlsBackendInterface.OnGetDtlsClientConnectionType toOnGetDtlsClientConnectionType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDtlsClientConnectionType in) {
        JnaTlsBackendInterface.OnGetDtlsClientConnectionType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGetDtlsClientConnectionType(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDtlsServerConnectionType {
        /**
         * 
         * @return 
        */
        long onGetDtlsServerConnectionType(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTlsBackendInterface.OnGetDtlsServerConnectionType toOnGetDtlsServerConnectionType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDtlsServerConnectionType in) {
        JnaTlsBackendInterface.OnGetDtlsServerConnectionType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGetDtlsServerConnectionType(__callback);
            __callback.register(out);
        }
        return out;
    }

    public TlsBackendInterface(PointerContainer pointer) {
        super(pointer);
    }

    public TlsBackendInterface() {
        super(cast(JnaTlsBackendInterface.allocateStructure()));
    }

    private JnaTlsBackendInterface.Fields _fields;
    
    JnaTlsBackendInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsBackendInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnSupportsTls#onSupportsTls}
    */
    public static final String SUPPORTS_TLS = "supports_tls";

    /**
     * 
     * <br>See {@link OnSupportsTls#onSupportsTls}
    */
    public void setFieldSupportsTls(OnSupportsTls supports_tls) {
        toFields().supports_tls = toOnSupportsTls(this, SUPPORTS_TLS, supports_tls);
        toFields().writeField(SUPPORTS_TLS);
    }

    /**
     * 
     * <br>See {@link OnSupportsTls#onSupportsTls}
    */
    public JnaTlsBackendInterface.OnSupportsTls getFieldSupportsTls() {
       toFields().readField(SUPPORTS_TLS);
       return toFields().supports_tls;
    } 

    /**
     * 
     * <br>See {@link OnGetCertificateType#onGetCertificateType}
    */
    public static final String GET_CERTIFICATE_TYPE = "get_certificate_type";

    /**
     * 
     * <br>See {@link OnGetCertificateType#onGetCertificateType}
    */
    public void setFieldGetCertificateType(OnGetCertificateType get_certificate_type) {
        toFields().get_certificate_type = toOnGetCertificateType(this, GET_CERTIFICATE_TYPE, get_certificate_type);
        toFields().writeField(GET_CERTIFICATE_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetCertificateType#onGetCertificateType}
    */
    public JnaTlsBackendInterface.OnGetCertificateType getFieldGetCertificateType() {
       toFields().readField(GET_CERTIFICATE_TYPE);
       return toFields().get_certificate_type;
    } 

    /**
     * 
     * <br>See {@link OnGetClientConnectionType#onGetClientConnectionType}
    */
    public static final String GET_CLIENT_CONNECTION_TYPE = "get_client_connection_type";

    /**
     * 
     * <br>See {@link OnGetClientConnectionType#onGetClientConnectionType}
    */
    public void setFieldGetClientConnectionType(OnGetClientConnectionType get_client_connection_type) {
        toFields().get_client_connection_type = toOnGetClientConnectionType(this, GET_CLIENT_CONNECTION_TYPE, get_client_connection_type);
        toFields().writeField(GET_CLIENT_CONNECTION_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetClientConnectionType#onGetClientConnectionType}
    */
    public JnaTlsBackendInterface.OnGetClientConnectionType getFieldGetClientConnectionType() {
       toFields().readField(GET_CLIENT_CONNECTION_TYPE);
       return toFields().get_client_connection_type;
    } 

    /**
     * 
     * <br>See {@link OnGetServerConnectionType#onGetServerConnectionType}
    */
    public static final String GET_SERVER_CONNECTION_TYPE = "get_server_connection_type";

    /**
     * 
     * <br>See {@link OnGetServerConnectionType#onGetServerConnectionType}
    */
    public void setFieldGetServerConnectionType(OnGetServerConnectionType get_server_connection_type) {
        toFields().get_server_connection_type = toOnGetServerConnectionType(this, GET_SERVER_CONNECTION_TYPE, get_server_connection_type);
        toFields().writeField(GET_SERVER_CONNECTION_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetServerConnectionType#onGetServerConnectionType}
    */
    public JnaTlsBackendInterface.OnGetServerConnectionType getFieldGetServerConnectionType() {
       toFields().readField(GET_SERVER_CONNECTION_TYPE);
       return toFields().get_server_connection_type;
    } 

    /**
     * 
     * <br>See {@link OnGetFileDatabaseType#onGetFileDatabaseType}
    */
    public static final String GET_FILE_DATABASE_TYPE = "get_file_database_type";

    /**
     * 
     * <br>See {@link OnGetFileDatabaseType#onGetFileDatabaseType}
    */
    public void setFieldGetFileDatabaseType(OnGetFileDatabaseType get_file_database_type) {
        toFields().get_file_database_type = toOnGetFileDatabaseType(this, GET_FILE_DATABASE_TYPE, get_file_database_type);
        toFields().writeField(GET_FILE_DATABASE_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetFileDatabaseType#onGetFileDatabaseType}
    */
    public JnaTlsBackendInterface.OnGetFileDatabaseType getFieldGetFileDatabaseType() {
       toFields().readField(GET_FILE_DATABASE_TYPE);
       return toFields().get_file_database_type;
    } 

    /**
     * 
     * <br>See {@link OnGetDefaultDatabase#onGetDefaultDatabase}
    */
    public static final String GET_DEFAULT_DATABASE = "get_default_database";

    /**
     * 
     * <br>See {@link OnGetDefaultDatabase#onGetDefaultDatabase}
    */
    public void setFieldGetDefaultDatabase(OnGetDefaultDatabase get_default_database) {
        toFields().get_default_database = toOnGetDefaultDatabase(this, GET_DEFAULT_DATABASE, get_default_database);
        toFields().writeField(GET_DEFAULT_DATABASE);
    }

    /**
     * 
     * <br>See {@link OnGetDefaultDatabase#onGetDefaultDatabase}
    */
    public JnaTlsBackendInterface.OnGetDefaultDatabase getFieldGetDefaultDatabase() {
       toFields().readField(GET_DEFAULT_DATABASE);
       return toFields().get_default_database;
    } 

    /**
     * 
     * <br>See {@link OnSupportsDtls#onSupportsDtls}
    */
    public static final String SUPPORTS_DTLS = "supports_dtls";

    /**
     * 
     * <br>See {@link OnSupportsDtls#onSupportsDtls}
    */
    public void setFieldSupportsDtls(OnSupportsDtls supports_dtls) {
        toFields().supports_dtls = toOnSupportsDtls(this, SUPPORTS_DTLS, supports_dtls);
        toFields().writeField(SUPPORTS_DTLS);
    }

    /**
     * 
     * <br>See {@link OnSupportsDtls#onSupportsDtls}
    */
    public JnaTlsBackendInterface.OnSupportsDtls getFieldSupportsDtls() {
       toFields().readField(SUPPORTS_DTLS);
       return toFields().supports_dtls;
    } 

    /**
     * 
     * <br>See {@link OnGetDtlsClientConnectionType#onGetDtlsClientConnectionType}
    */
    public static final String GET_DTLS_CLIENT_CONNECTION_TYPE = "get_dtls_client_connection_type";

    /**
     * 
     * <br>See {@link OnGetDtlsClientConnectionType#onGetDtlsClientConnectionType}
    */
    public void setFieldGetDtlsClientConnectionType(OnGetDtlsClientConnectionType get_dtls_client_connection_type) {
        toFields().get_dtls_client_connection_type = toOnGetDtlsClientConnectionType(this, GET_DTLS_CLIENT_CONNECTION_TYPE, get_dtls_client_connection_type);
        toFields().writeField(GET_DTLS_CLIENT_CONNECTION_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetDtlsClientConnectionType#onGetDtlsClientConnectionType}
    */
    public JnaTlsBackendInterface.OnGetDtlsClientConnectionType getFieldGetDtlsClientConnectionType() {
       toFields().readField(GET_DTLS_CLIENT_CONNECTION_TYPE);
       return toFields().get_dtls_client_connection_type;
    } 

    /**
     * 
     * <br>See {@link OnGetDtlsServerConnectionType#onGetDtlsServerConnectionType}
    */
    public static final String GET_DTLS_SERVER_CONNECTION_TYPE = "get_dtls_server_connection_type";

    /**
     * 
     * <br>See {@link OnGetDtlsServerConnectionType#onGetDtlsServerConnectionType}
    */
    public void setFieldGetDtlsServerConnectionType(OnGetDtlsServerConnectionType get_dtls_server_connection_type) {
        toFields().get_dtls_server_connection_type = toOnGetDtlsServerConnectionType(this, GET_DTLS_SERVER_CONNECTION_TYPE, get_dtls_server_connection_type);
        toFields().writeField(GET_DTLS_SERVER_CONNECTION_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetDtlsServerConnectionType#onGetDtlsServerConnectionType}
    */
    public JnaTlsBackendInterface.OnGetDtlsServerConnectionType getFieldGetDtlsServerConnectionType() {
       toFields().readField(GET_DTLS_SERVER_CONNECTION_TYPE);
       return toFields().get_dtls_server_connection_type;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsBackend.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsBackend.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
