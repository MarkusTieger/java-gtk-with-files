/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsBackend {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_tls_backend_get_certificate_type(long _self);
        long g_tls_backend_get_client_connection_type(long _self);
        long g_tls_backend_get_default_database(long _self);
        long g_tls_backend_get_dtls_client_connection_type(long _self);
        long g_tls_backend_get_dtls_server_connection_type(long _self);
        long g_tls_backend_get_file_database_type(long _self);
        long g_tls_backend_get_server_connection_type(long _self);
        void g_tls_backend_set_default_database(long _self, long database);
        boolean g_tls_backend_supports_dtls(long _self);
        boolean g_tls_backend_supports_tls(long _self);
        long g_tls_backend_get_default();
        long g_tls_backend_get_type();
    }

}
