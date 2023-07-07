/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaVariantBuilder {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_variant_builder_new(long type);
        void g_variant_builder_add(long _self, long format_string, java.lang.Object... _elipse);
        void g_variant_builder_add(long _self, String format_string, java.lang.Object... _elipse);
        void g_variant_builder_add_parsed(long _self, long format, java.lang.Object... _elipse);
        void g_variant_builder_add_parsed(long _self, String format, java.lang.Object... _elipse);
        void g_variant_builder_add_value(long _self, long value);
        void g_variant_builder_clear(long _self);
        void g_variant_builder_close(long _self);
        long g_variant_builder_end(long _self);
        void g_variant_builder_init(long _self, long type);
        void g_variant_builder_open(long _self, long type);
        long g_variant_builder_ref(long _self);
        void g_variant_builder_unref(long _self);
        long g_variant_builder_get_type();
    }

}
