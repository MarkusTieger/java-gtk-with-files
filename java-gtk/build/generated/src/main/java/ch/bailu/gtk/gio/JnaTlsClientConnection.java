/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsClientConnection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_tls_client_connection_copy_session_state(long _self, long source);
        long g_tls_client_connection_get_accepted_cas(long _self);
        long g_tls_client_connection_get_server_identity(long _self);
        void g_tls_client_connection_set_server_identity(long _self, long identity);
        long g_tls_client_connection_new(long base_io_stream, long server_identity, long _error);
        long g_tls_client_connection_get_type();
    }

}
