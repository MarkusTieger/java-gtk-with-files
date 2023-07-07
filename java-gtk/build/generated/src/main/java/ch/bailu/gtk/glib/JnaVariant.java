/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaVariant {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_variant_new(long format_string, java.lang.Object... _elipse);
        long g_variant_new(String format_string, java.lang.Object... _elipse);
        long g_variant_new_boolean(boolean value);
        long g_variant_new_byte(int value);
        long g_variant_new_bytestring(long string);
        long g_variant_new_bytestring(String string);
        long g_variant_new_dict_entry(long key, long value);
        long g_variant_new_double(double value);
        long g_variant_new_fixed_array(long element_type, long elements, long n_elements, long element_size);
        long g_variant_new_from_bytes(long type, long bytes, boolean trusted);
        long g_variant_new_from_data(long type, long data, long size, boolean trusted, com.sun.jna.Callback notify, long user_data);
        long g_variant_new_handle(int value);
        long g_variant_new_int16(int value);
        long g_variant_new_int32(int value);
        long g_variant_new_int64(long value);
        long g_variant_new_maybe(long child_type, long child);
        long g_variant_new_object_path(long object_path);
        long g_variant_new_object_path(String object_path);
        long g_variant_new_parsed(long format, java.lang.Object... _elipse);
        long g_variant_new_parsed(String format, java.lang.Object... _elipse);
        long g_variant_new_printf(long format_string, java.lang.Object... _elipse);
        long g_variant_new_printf(String format_string, java.lang.Object... _elipse);
        long g_variant_new_signature(long signature);
        long g_variant_new_signature(String signature);
        long g_variant_new_string(long string);
        long g_variant_new_string(String string);
        long g_variant_new_take_string(long string);
        long g_variant_new_uint16(int value);
        long g_variant_new_uint32(int value);
        long g_variant_new_uint64(long value);
        long g_variant_new_variant(long value);
        long g_variant_byteswap(long _self);
        boolean g_variant_check_format_string(long _self, long format_string, boolean copy_only);
        boolean g_variant_check_format_string(long _self, String format_string, boolean copy_only);
        int g_variant_classify(long _self);
        int g_variant_compare(long _self, long two);
        long g_variant_dup_bytestring(long _self, long length);
        long g_variant_dup_string(long _self, long length);
        boolean g_variant_equal(long _self, long two);
        void g_variant_get(long _self, long format_string, java.lang.Object... _elipse);
        void g_variant_get(long _self, String format_string, java.lang.Object... _elipse);
        boolean g_variant_get_boolean(long _self);
        int g_variant_get_byte(long _self);
        long g_variant_get_bytestring(long _self);
        void g_variant_get_child(long _self, long index_, long format_string, java.lang.Object... _elipse);
        void g_variant_get_child(long _self, long index_, String format_string, java.lang.Object... _elipse);
        long g_variant_get_child_value(long _self, long index_);
        long g_variant_get_data(long _self);
        long g_variant_get_data_as_bytes(long _self);
        double g_variant_get_double(long _self);
        long g_variant_get_fixed_array(long _self, long n_elements, long element_size);
        int g_variant_get_handle(long _self);
        int g_variant_get_int16(long _self);
        int g_variant_get_int32(long _self);
        long g_variant_get_int64(long _self);
        long g_variant_get_maybe(long _self);
        long g_variant_get_normal_form(long _self);
        long g_variant_get_size(long _self);
        long g_variant_get_string(long _self, long length);
        long g_variant_get_type(long _self);
        long g_variant_get_type_string(long _self);
        int g_variant_get_uint16(long _self);
        int g_variant_get_uint32(long _self);
        long g_variant_get_uint64(long _self);
        long g_variant_get_variant(long _self);
        int g_variant_hash(long _self);
        boolean g_variant_is_container(long _self);
        boolean g_variant_is_floating(long _self);
        boolean g_variant_is_normal_form(long _self);
        boolean g_variant_is_of_type(long _self, long type);
        long g_variant_iter_new(long _self);
        boolean g_variant_lookup(long _self, long key, long format_string, java.lang.Object... _elipse);
        boolean g_variant_lookup(long _self, String key, String format_string, java.lang.Object... _elipse);
        long g_variant_lookup_value(long _self, long key, long expected_type);
        long g_variant_lookup_value(long _self, String key, long expected_type);
        long g_variant_n_children(long _self);
        long g_variant_print(long _self, boolean type_annotate);
        long g_variant_print_string(long _self, long string, boolean type_annotate);
        long g_variant_ref(long _self);
        long g_variant_ref_sink(long _self);
        void g_variant_store(long _self, long data);
        long g_variant_take_ref(long _self);
        void g_variant_unref(long _self);
        boolean g_variant_is_object_path(long string);
        boolean g_variant_is_signature(long string);
        long g_variant_parse_error_print_context(long error, long source_str);
        int g_variant_parse_error_quark();
        long intern();
    }

}
