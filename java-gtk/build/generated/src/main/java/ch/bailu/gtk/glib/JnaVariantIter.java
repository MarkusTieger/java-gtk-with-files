/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaVariantIter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_variant_iter_copy(long _self);
        void g_variant_iter_free(long _self);
        long g_variant_iter_init(long _self, long value);
        boolean g_variant_iter_loop(long _self, long format_string, java.lang.Object... _elipse);
        boolean g_variant_iter_loop(long _self, String format_string, java.lang.Object... _elipse);
        long g_variant_iter_n_children(long _self);
        boolean g_variant_iter_next(long _self, long format_string, java.lang.Object... _elipse);
        boolean g_variant_iter_next(long _self, String format_string, java.lang.Object... _elipse);
        long g_variant_iter_next_value(long _self);
    }

}
