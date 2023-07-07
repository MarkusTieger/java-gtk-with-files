/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketAddress {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_socket_address_new_from_native(long _native, long len);
        int g_socket_address_get_family(long _self);
        long g_socket_address_get_native_size(long _self);
        boolean g_socket_address_to_native(long _self, long dest, long destlen, long _error);
        long g_socket_address_get_type();
    }

}
