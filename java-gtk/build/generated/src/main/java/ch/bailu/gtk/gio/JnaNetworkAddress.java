/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaNetworkAddress {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_network_address_new(long hostname, int port);
        long g_network_address_new(String hostname, int port);
        long g_network_address_new_loopback(int port);
        long g_network_address_get_hostname(long _self);
        int g_network_address_get_port(long _self);
        long g_network_address_get_scheme(long _self);
        long g_network_address_parse(long host_and_port, int default_port, long _error);
        long g_network_address_parse_uri(long uri, int default_port, long _error);
        long g_network_address_get_type();
    }

}
