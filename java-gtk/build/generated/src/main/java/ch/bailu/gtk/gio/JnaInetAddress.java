/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaInetAddress {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_inet_address_new_any(int family);
        long g_inet_address_new_from_string(long string);
        long g_inet_address_new_from_string(String string);
        long g_inet_address_new_loopback(int family);
        boolean g_inet_address_equal(long _self, long other_address);
        int g_inet_address_get_family(long _self);
        boolean g_inet_address_get_is_any(long _self);
        boolean g_inet_address_get_is_link_local(long _self);
        boolean g_inet_address_get_is_loopback(long _self);
        boolean g_inet_address_get_is_mc_global(long _self);
        boolean g_inet_address_get_is_mc_link_local(long _self);
        boolean g_inet_address_get_is_mc_node_local(long _self);
        boolean g_inet_address_get_is_mc_org_local(long _self);
        boolean g_inet_address_get_is_mc_site_local(long _self);
        boolean g_inet_address_get_is_multicast(long _self);
        boolean g_inet_address_get_is_site_local(long _self);
        long g_inet_address_get_native_size(long _self);
        long g_inet_address_to_string(long _self);
        long g_inet_address_get_type();
    }

}
