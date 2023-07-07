/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaZlibCompressor {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_zlib_compressor_new(int format, int level);
        long g_zlib_compressor_get_file_info(long _self);
        void g_zlib_compressor_set_file_info(long _self, long file_info);
        long g_zlib_compressor_get_type();
    }

}
