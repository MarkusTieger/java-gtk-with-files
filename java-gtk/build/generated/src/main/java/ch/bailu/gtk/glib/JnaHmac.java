/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaHmac {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_hmac_copy(long _self);
        long g_hmac_get_string(long _self);
        long g_hmac_ref(long _self);
        void g_hmac_unref(long _self);
    }

}
