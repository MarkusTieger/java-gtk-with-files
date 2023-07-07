/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsDatabase {

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
        long g_tls_database_create_certificate_handle(long _self, long certificate);
        long g_tls_database_lookup_certificate_for_handle(long _self, long handle, long interaction, int flags, long cancellable, long _error);
        long g_tls_database_lookup_certificate_for_handle(long _self, String handle, long interaction, int flags, long cancellable, long _error);
        void g_tls_database_lookup_certificate_for_handle_async(long _self, long handle, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_tls_database_lookup_certificate_for_handle_async(long _self, String handle, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_tls_database_lookup_certificate_for_handle_finish(long _self, long result, long _error);
        long g_tls_database_lookup_certificate_issuer(long _self, long certificate, long interaction, int flags, long cancellable, long _error);
        void g_tls_database_lookup_certificate_issuer_async(long _self, long certificate, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_tls_database_lookup_certificate_issuer_finish(long _self, long result, long _error);
        long g_tls_database_lookup_certificates_issued_by(long _self, long issuer_raw_dn, long interaction, int flags, long cancellable, long _error);
        void g_tls_database_lookup_certificates_issued_by_async(long _self, long issuer_raw_dn, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_tls_database_lookup_certificates_issued_by_finish(long _self, long result, long _error);
        int g_tls_database_verify_chain(long _self, long chain, long purpose, long identity, long interaction, int flags, long cancellable, long _error);
        int g_tls_database_verify_chain(long _self, long chain, String purpose, long identity, long interaction, int flags, long cancellable, long _error);
        void g_tls_database_verify_chain_async(long _self, long chain, long purpose, long identity, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_tls_database_verify_chain_async(long _self, long chain, String purpose, long identity, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        int g_tls_database_verify_chain_finish(long _self, long result, long _error);
        long g_tls_database_get_type();
    }

}
