/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsPassword {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_tls_password_new(int flags, long description);
        long g_tls_password_new(int flags, String description);
        long g_tls_password_get_description(long _self);
        int g_tls_password_get_flags(long _self);
        long g_tls_password_get_warning(long _self);
        void g_tls_password_set_description(long _self, long description);
        void g_tls_password_set_description(long _self, String description);
        void g_tls_password_set_flags(long _self, int flags);
        void g_tls_password_set_warning(long _self, long warning);
        void g_tls_password_set_warning(long _self, String warning);
        long g_tls_password_get_type();
    }

}
