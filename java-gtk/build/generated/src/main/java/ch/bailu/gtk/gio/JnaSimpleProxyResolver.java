/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSimpleProxyResolver {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_simple_proxy_resolver_set_default_proxy(long _self, long default_proxy);
        void g_simple_proxy_resolver_set_default_proxy(long _self, String default_proxy);
        void g_simple_proxy_resolver_set_uri_proxy(long _self, long uri_scheme, long proxy);
        void g_simple_proxy_resolver_set_uri_proxy(long _self, String uri_scheme, String proxy);
        long g_simple_proxy_resolver_get_type();
    }

}
