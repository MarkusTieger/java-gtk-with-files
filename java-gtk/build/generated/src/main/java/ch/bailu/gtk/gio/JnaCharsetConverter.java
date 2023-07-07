/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaCharsetConverter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_charset_converter_new(long to_charset, long from_charset, long _error);
        long g_charset_converter_new(String to_charset, String from_charset, long _error);
        int g_charset_converter_get_num_fallbacks(long _self);
        boolean g_charset_converter_get_use_fallback(long _self);
        void g_charset_converter_set_use_fallback(long _self, boolean use_fallback);
        long g_charset_converter_get_type();
    }

}
