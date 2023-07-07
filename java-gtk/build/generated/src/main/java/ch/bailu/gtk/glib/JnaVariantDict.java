/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaVariantDict {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_variant_dict_new(long from_asv);
        void g_variant_dict_clear(long _self);
        boolean g_variant_dict_contains(long _self, long key);
        boolean g_variant_dict_contains(long _self, String key);
        long g_variant_dict_end(long _self);
        void g_variant_dict_init(long _self, long from_asv);
        void g_variant_dict_insert(long _self, long key, long format_string, java.lang.Object... _elipse);
        void g_variant_dict_insert(long _self, String key, String format_string, java.lang.Object... _elipse);
        void g_variant_dict_insert_value(long _self, long key, long value);
        void g_variant_dict_insert_value(long _self, String key, long value);
        boolean g_variant_dict_lookup(long _self, long key, long format_string, java.lang.Object... _elipse);
        boolean g_variant_dict_lookup(long _self, String key, String format_string, java.lang.Object... _elipse);
        long g_variant_dict_lookup_value(long _self, long key, long expected_type);
        long g_variant_dict_lookup_value(long _self, String key, long expected_type);
        long g_variant_dict_ref(long _self);
        boolean g_variant_dict_remove(long _self, long key);
        boolean g_variant_dict_remove(long _self, String key);
        void g_variant_dict_unref(long _self);
        long g_variant_dict_get_type();
    }

}
