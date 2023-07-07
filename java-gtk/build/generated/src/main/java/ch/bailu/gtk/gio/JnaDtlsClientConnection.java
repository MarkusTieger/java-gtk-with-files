/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDtlsClientConnection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dtls_client_connection_get_accepted_cas(long _self);
        long g_dtls_client_connection_get_server_identity(long _self);
        void g_dtls_client_connection_set_server_identity(long _self, long identity);
        long g_dtls_client_connection_new(long base_socket, long server_identity, long _error);
        long g_dtls_client_connection_get_type();
    }

}
