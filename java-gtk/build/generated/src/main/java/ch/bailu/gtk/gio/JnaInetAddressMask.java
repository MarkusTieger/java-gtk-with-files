/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaInetAddressMask {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_inet_address_mask_new(long addr, int length, long _error);
        long g_inet_address_mask_new_from_string(long mask_string, long _error);
        long g_inet_address_mask_new_from_string(String mask_string, long _error);
        boolean g_inet_address_mask_equal(long _self, long mask2);
        long g_inet_address_mask_get_address(long _self);
        int g_inet_address_mask_get_family(long _self);
        int g_inet_address_mask_get_length(long _self);
        boolean g_inet_address_mask_matches(long _self, long address);
        long g_inet_address_mask_to_string(long _self);
        long g_inet_address_mask_get_type();
    }

}
