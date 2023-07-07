/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaKeyFile {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_key_file_new();
        void g_key_file_free(long _self);
        boolean g_key_file_get_boolean(long _self, long group_name, long key, long _error);
        boolean g_key_file_get_boolean(long _self, String group_name, String key, long _error);
        long g_key_file_get_boolean_list(long _self, long group_name, long key, long length, long _error);
        long g_key_file_get_boolean_list(long _self, String group_name, String key, long length, long _error);
        long g_key_file_get_comment(long _self, long group_name, long key, long _error);
        long g_key_file_get_comment(long _self, String group_name, String key, long _error);
        double g_key_file_get_double(long _self, long group_name, long key, long _error);
        double g_key_file_get_double(long _self, String group_name, String key, long _error);
        long g_key_file_get_double_list(long _self, long group_name, long key, long length, long _error);
        long g_key_file_get_double_list(long _self, String group_name, String key, long length, long _error);
        long g_key_file_get_int64(long _self, long group_name, long key, long _error);
        long g_key_file_get_int64(long _self, String group_name, String key, long _error);
        int g_key_file_get_integer(long _self, long group_name, long key, long _error);
        int g_key_file_get_integer(long _self, String group_name, String key, long _error);
        long g_key_file_get_integer_list(long _self, long group_name, long key, long length, long _error);
        long g_key_file_get_integer_list(long _self, String group_name, String key, long length, long _error);
        long g_key_file_get_locale_for_key(long _self, long group_name, long key, long locale);
        long g_key_file_get_locale_for_key(long _self, String group_name, String key, String locale);
        long g_key_file_get_locale_string(long _self, long group_name, long key, long locale, long _error);
        long g_key_file_get_locale_string(long _self, String group_name, String key, String locale, long _error);
        long g_key_file_get_start_group(long _self);
        long g_key_file_get_string(long _self, long group_name, long key, long _error);
        long g_key_file_get_string(long _self, String group_name, String key, long _error);
        long g_key_file_get_uint64(long _self, long group_name, long key, long _error);
        long g_key_file_get_uint64(long _self, String group_name, String key, long _error);
        long g_key_file_get_value(long _self, long group_name, long key, long _error);
        long g_key_file_get_value(long _self, String group_name, String key, long _error);
        boolean g_key_file_has_group(long _self, long group_name);
        boolean g_key_file_has_group(long _self, String group_name);
        boolean g_key_file_has_key(long _self, long group_name, long key, long _error);
        boolean g_key_file_has_key(long _self, String group_name, String key, long _error);
        boolean g_key_file_load_from_bytes(long _self, long bytes, int flags, long _error);
        boolean g_key_file_load_from_data(long _self, long data, long length, int flags, long _error);
        boolean g_key_file_load_from_data(long _self, String data, long length, int flags, long _error);
        boolean g_key_file_load_from_file(long _self, long file, int flags, long _error);
        boolean g_key_file_load_from_file(long _self, String file, int flags, long _error);
        long g_key_file_ref(long _self);
        boolean g_key_file_remove_comment(long _self, long group_name, long key, long _error);
        boolean g_key_file_remove_comment(long _self, String group_name, String key, long _error);
        boolean g_key_file_remove_group(long _self, long group_name, long _error);
        boolean g_key_file_remove_group(long _self, String group_name, long _error);
        boolean g_key_file_remove_key(long _self, long group_name, long key, long _error);
        boolean g_key_file_remove_key(long _self, String group_name, String key, long _error);
        boolean g_key_file_save_to_file(long _self, long filename, long _error);
        boolean g_key_file_save_to_file(long _self, String filename, long _error);
        void g_key_file_set_boolean(long _self, long group_name, long key, boolean value);
        void g_key_file_set_boolean(long _self, String group_name, String key, boolean value);
        void g_key_file_set_boolean_list(long _self, long group_name, long key, long list, long length);
        void g_key_file_set_boolean_list(long _self, String group_name, String key, long list, long length);
        boolean g_key_file_set_comment(long _self, long group_name, long key, long comment, long _error);
        boolean g_key_file_set_comment(long _self, String group_name, String key, String comment, long _error);
        void g_key_file_set_double(long _self, long group_name, long key, double value);
        void g_key_file_set_double(long _self, String group_name, String key, double value);
        void g_key_file_set_double_list(long _self, long group_name, long key, long list, long length);
        void g_key_file_set_double_list(long _self, String group_name, String key, long list, long length);
        void g_key_file_set_int64(long _self, long group_name, long key, long value);
        void g_key_file_set_int64(long _self, String group_name, String key, long value);
        void g_key_file_set_integer(long _self, long group_name, long key, int value);
        void g_key_file_set_integer(long _self, String group_name, String key, int value);
        void g_key_file_set_integer_list(long _self, long group_name, long key, long list, long length);
        void g_key_file_set_integer_list(long _self, String group_name, String key, long list, long length);
        void g_key_file_set_list_separator(long _self, byte separator);
        void g_key_file_set_locale_string(long _self, long group_name, long key, long locale, long string);
        void g_key_file_set_locale_string(long _self, String group_name, String key, String locale, String string);
        void g_key_file_set_string(long _self, long group_name, long key, long string);
        void g_key_file_set_string(long _self, String group_name, String key, String string);
        void g_key_file_set_uint64(long _self, long group_name, long key, long value);
        void g_key_file_set_uint64(long _self, String group_name, String key, long value);
        void g_key_file_set_value(long _self, long group_name, long key, long value);
        void g_key_file_set_value(long _self, String group_name, String key, String value);
        long g_key_file_to_data(long _self, long length, long _error);
        void g_key_file_unref(long _self);
        int g_key_file_error_quark();
        long g_key_file_get_type();
    }

}
