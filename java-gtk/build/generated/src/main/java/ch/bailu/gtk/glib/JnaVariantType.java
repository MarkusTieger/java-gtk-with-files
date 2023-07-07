/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaVariantType {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_variant_type_new(long type_string);
        long g_variant_type_new(String type_string);
        long g_variant_type_new_array(long element);
        long g_variant_type_new_dict_entry(long key, long value);
        long g_variant_type_new_maybe(long element);
        long g_variant_type_copy(long _self);
        long g_variant_type_dup_string(long _self);
        long g_variant_type_element(long _self);
        boolean g_variant_type_equal(long _self, long type2);
        long g_variant_type_first(long _self);
        void g_variant_type_free(long _self);
        long g_variant_type_get_string_length(long _self);
        int g_variant_type_hash(long _self);
        boolean g_variant_type_is_array(long _self);
        boolean g_variant_type_is_basic(long _self);
        boolean g_variant_type_is_container(long _self);
        boolean g_variant_type_is_definite(long _self);
        boolean g_variant_type_is_dict_entry(long _self);
        boolean g_variant_type_is_maybe(long _self);
        boolean g_variant_type_is_subtype_of(long _self, long supertype);
        boolean g_variant_type_is_tuple(long _self);
        boolean g_variant_type_is_variant(long _self);
        long g_variant_type_key(long _self);
        long g_variant_type_n_items(long _self);
        long g_variant_type_next(long _self);
        long g_variant_type_peek_string(long _self);
        long g_variant_type_value(long _self);
        long g_variant_type_checked_(long arg0);
        long g_variant_type_string_get_depth_(long type_string);
        boolean g_variant_type_string_is_valid(long type_string);
        long g_variant_type_get_gtype();
    }

}
