/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaChecksum {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_checksum_new(int checksum_type);
        long g_checksum_copy(long _self);
        void g_checksum_free(long _self);
        long g_checksum_get_string(long _self);
        void g_checksum_reset(long _self);
        long g_checksum_type_get_length(int checksum_type);
        long g_checksum_get_type();
    }

}
