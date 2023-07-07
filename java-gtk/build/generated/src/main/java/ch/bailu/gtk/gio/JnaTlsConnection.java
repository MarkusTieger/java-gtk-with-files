/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsConnection {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnAcceptCertificate extends com.sun.jna.Callback {
        boolean invoke(long _self, long peer_cert, int errors, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_tls_connection_emit_accept_certificate(long _self, long peer_cert, int errors);
        long g_tls_connection_get_certificate(long _self);
        boolean g_tls_connection_get_channel_binding_data(long _self, int type, long data, long _error);
        long g_tls_connection_get_ciphersuite_name(long _self);
        long g_tls_connection_get_database(long _self);
        long g_tls_connection_get_interaction(long _self);
        long g_tls_connection_get_negotiated_protocol(long _self);
        long g_tls_connection_get_peer_certificate(long _self);
        int g_tls_connection_get_peer_certificate_errors(long _self);
        int g_tls_connection_get_protocol_version(long _self);
        boolean g_tls_connection_get_require_close_notify(long _self);
        boolean g_tls_connection_handshake(long _self, long cancellable, long _error);
        void g_tls_connection_handshake_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_tls_connection_handshake_finish(long _self, long result, long _error);
        void g_tls_connection_set_certificate(long _self, long certificate);
        void g_tls_connection_set_database(long _self, long database);
        void g_tls_connection_set_interaction(long _self, long interaction);
        void g_tls_connection_set_require_close_notify(long _self, boolean require_close_notify);
        long g_tls_connection_get_type();
    }

}
