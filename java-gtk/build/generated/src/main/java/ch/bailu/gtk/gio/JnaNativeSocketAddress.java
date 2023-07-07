/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaNativeSocketAddress {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_native_socket_address_new(long _native, long len);
        long g_native_socket_address_get_type();
    }

}
