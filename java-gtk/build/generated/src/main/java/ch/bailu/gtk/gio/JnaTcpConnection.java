/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTcpConnection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_tcp_connection_get_graceful_disconnect(long _self);
        void g_tcp_connection_set_graceful_disconnect(long _self, boolean graceful_disconnect);
        long g_tcp_connection_get_type();
    }

}
