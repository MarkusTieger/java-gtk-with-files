/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsInteraction {

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
        int g_tls_interaction_ask_password(long _self, long password, long cancellable, long _error);
        void g_tls_interaction_ask_password_async(long _self, long password, long cancellable, com.sun.jna.Callback callback, long user_data);
        int g_tls_interaction_ask_password_finish(long _self, long result, long _error);
        int g_tls_interaction_invoke_ask_password(long _self, long password, long cancellable, long _error);
        int g_tls_interaction_invoke_request_certificate(long _self, long connection, int flags, long cancellable, long _error);
        int g_tls_interaction_request_certificate(long _self, long connection, int flags, long cancellable, long _error);
        void g_tls_interaction_request_certificate_async(long _self, long connection, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        int g_tls_interaction_request_certificate_finish(long _self, long result, long _error);
        long g_tls_interaction_get_type();
    }

}
