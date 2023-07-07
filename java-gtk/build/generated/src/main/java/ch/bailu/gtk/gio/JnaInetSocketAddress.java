/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaInetSocketAddress {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_inet_socket_address_new(long address, int port);
        long g_inet_socket_address_new_from_string(long address, int port);
        long g_inet_socket_address_new_from_string(String address, int port);
        long g_inet_socket_address_get_address(long _self);
        int g_inet_socket_address_get_flowinfo(long _self);
        int g_inet_socket_address_get_port(long _self);
        int g_inet_socket_address_get_scope_id(long _self);
        long g_inet_socket_address_get_type();
    }

}
