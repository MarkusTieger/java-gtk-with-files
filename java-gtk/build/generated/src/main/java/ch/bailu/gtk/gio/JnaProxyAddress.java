/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaProxyAddress {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_proxy_address_new(long inetaddr, int port, long protocol, long dest_hostname, int dest_port, long username, long password);
        long g_proxy_address_new(long inetaddr, int port, String protocol, String dest_hostname, int dest_port, String username, String password);
        long g_proxy_address_get_destination_hostname(long _self);
        int g_proxy_address_get_destination_port(long _self);
        long g_proxy_address_get_destination_protocol(long _self);
        long g_proxy_address_get_password(long _self);
        long g_proxy_address_get_protocol(long _self);
        long g_proxy_address_get_uri(long _self);
        long g_proxy_address_get_username(long _self);
        long g_proxy_address_get_type();
    }

}
