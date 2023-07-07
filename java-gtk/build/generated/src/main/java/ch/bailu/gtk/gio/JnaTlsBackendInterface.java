/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsBackendInterface {

    @FunctionalInterface
    public interface OnSupportsTls extends com.sun.jna.Callback {
        boolean invoke(long backend);
    }

    @FunctionalInterface
    public interface OnGetCertificateType extends com.sun.jna.Callback {
        long invoke();
    }

    @FunctionalInterface
    public interface OnGetClientConnectionType extends com.sun.jna.Callback {
        long invoke();
    }

    @FunctionalInterface
    public interface OnGetServerConnectionType extends com.sun.jna.Callback {
        long invoke();
    }

    @FunctionalInterface
    public interface OnGetFileDatabaseType extends com.sun.jna.Callback {
        long invoke();
    }

    @FunctionalInterface
    public interface OnGetDefaultDatabase extends com.sun.jna.Callback {
        long invoke(long backend);
    }

    @FunctionalInterface
    public interface OnSupportsDtls extends com.sun.jna.Callback {
        boolean invoke(long backend);
    }

    @FunctionalInterface
    public interface OnGetDtlsClientConnectionType extends com.sun.jna.Callback {
        long invoke();
    }

    @FunctionalInterface
    public interface OnGetDtlsServerConnectionType extends com.sun.jna.Callback {
        long invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TlsBackendInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TlsBackendInterface.G_IFACE, TlsBackendInterface.SUPPORTS_TLS, TlsBackendInterface.GET_CERTIFICATE_TYPE, TlsBackendInterface.GET_CLIENT_CONNECTION_TYPE, TlsBackendInterface.GET_SERVER_CONNECTION_TYPE, TlsBackendInterface.GET_FILE_DATABASE_TYPE, TlsBackendInterface.GET_DEFAULT_DATABASE, TlsBackendInterface.SUPPORTS_DTLS, TlsBackendInterface.GET_DTLS_CLIENT_CONNECTION_TYPE, TlsBackendInterface.GET_DTLS_SERVER_CONNECTION_TYPE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnSupportsTls supports_tls;
        public OnGetCertificateType get_certificate_type;
        public OnGetClientConnectionType get_client_connection_type;
        public OnGetServerConnectionType get_server_connection_type;
        public OnGetFileDatabaseType get_file_database_type;
        public OnGetDefaultDatabase get_default_database;
        public OnSupportsDtls supports_dtls;
        public OnGetDtlsClientConnectionType get_dtls_client_connection_type;
        public OnGetDtlsServerConnectionType get_dtls_server_connection_type;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
