/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketConnectable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_socket_connectable_enumerate(long _self);
        long g_socket_connectable_proxy_enumerate(long _self);
        long g_socket_connectable_to_string(long _self);
        long g_socket_connectable_get_type();
    }

}
