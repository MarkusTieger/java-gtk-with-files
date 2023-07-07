/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTcpWrapperConnection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_tcp_wrapper_connection_new(long base_io_stream, long socket);
        long g_tcp_wrapper_connection_get_base_io_stream(long _self);
        long g_tcp_wrapper_connection_get_type();
    }

}
