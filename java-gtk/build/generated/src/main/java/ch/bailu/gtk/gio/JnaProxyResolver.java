/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaProxyResolver {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_proxy_resolver_is_supported(long _self);
        void g_proxy_resolver_lookup_async(long _self, long uri, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_proxy_resolver_lookup_async(long _self, String uri, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_proxy_resolver_get_default();
        long g_proxy_resolver_get_type();
    }

}
