/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDtlsServerConnection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dtls_server_connection_new(long base_socket, long certificate, long _error);
        long g_dtls_server_connection_get_type();
    }

}
