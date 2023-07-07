/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixSocketAddress {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_unix_socket_address_new(long path);
        long g_unix_socket_address_new(String path);
        long g_unix_socket_address_new_with_type(long path, int path_len, int type);
        long g_unix_socket_address_new_with_type(String path, int path_len, int type);
        int g_unix_socket_address_get_address_type(long _self);
        long g_unix_socket_address_get_path(long _self);
        long g_unix_socket_address_get_path_len(long _self);
        boolean g_unix_socket_address_abstract_names_supported();
        long g_unix_socket_address_get_type();
    }

}
