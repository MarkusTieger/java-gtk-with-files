/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsCertificate {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_tls_certificate_new_from_file(long file, long _error);
        long g_tls_certificate_new_from_file(String file, long _error);
        long g_tls_certificate_new_from_file_with_password(long file, long password, long _error);
        long g_tls_certificate_new_from_file_with_password(String file, String password, long _error);
        long g_tls_certificate_new_from_files(long cert_file, long key_file, long _error);
        long g_tls_certificate_new_from_files(String cert_file, String key_file, long _error);
        long g_tls_certificate_new_from_pem(long data, long length, long _error);
        long g_tls_certificate_new_from_pem(String data, long length, long _error);
        long g_tls_certificate_new_from_pkcs11_uris(long pkcs11_uri, long private_key_pkcs11_uri, long _error);
        long g_tls_certificate_new_from_pkcs11_uris(String pkcs11_uri, String private_key_pkcs11_uri, long _error);
        long g_tls_certificate_get_dns_names(long _self);
        long g_tls_certificate_get_ip_addresses(long _self);
        long g_tls_certificate_get_issuer(long _self);
        long g_tls_certificate_get_issuer_name(long _self);
        long g_tls_certificate_get_not_valid_after(long _self);
        long g_tls_certificate_get_not_valid_before(long _self);
        long g_tls_certificate_get_subject_name(long _self);
        boolean g_tls_certificate_is_same(long _self, long cert_two);
        int g_tls_certificate_verify(long _self, long identity, long trusted_ca);
        long g_tls_certificate_list_new_from_file(long file, long _error);
        long g_tls_certificate_get_type();
    }

}
