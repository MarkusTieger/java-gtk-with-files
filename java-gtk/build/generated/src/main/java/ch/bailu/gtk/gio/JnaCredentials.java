/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaCredentials {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_credentials_new();
        long g_credentials_get_native(long _self, int native_type);
        boolean g_credentials_is_same_user(long _self, long other_credentials, long _error);
        void g_credentials_set_native(long _self, int native_type, long _native);
        long g_credentials_to_string(long _self);
        long g_credentials_get_type();
    }

}
