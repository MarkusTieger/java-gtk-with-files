/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaNetworkService {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_network_service_new(long service, long protocol, long domain);
        long g_network_service_new(String service, String protocol, String domain);
        long g_network_service_get_domain(long _self);
        long g_network_service_get_protocol(long _self);
        long g_network_service_get_scheme(long _self);
        long g_network_service_get_service(long _self);
        void g_network_service_set_scheme(long _self, long scheme);
        void g_network_service_set_scheme(long _self, String scheme);
        long g_network_service_get_type();
    }

}
