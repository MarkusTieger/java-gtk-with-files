/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaZlibDecompressor {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_zlib_decompressor_new(int format);
        long g_zlib_decompressor_get_file_info(long _self);
        long g_zlib_decompressor_get_type();
    }

}
