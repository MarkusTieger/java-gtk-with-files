/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaProxy {

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
        long g_proxy_connect(long _self, long connection, long proxy_address, long cancellable, long _error);
        void g_proxy_connect_async(long _self, long connection, long proxy_address, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_proxy_connect_finish(long _self, long result, long _error);
        boolean g_proxy_supports_hostname(long _self);
        long g_proxy_get_default_for_protocol(long protocol);
        long g_proxy_get_type();
    }

}
