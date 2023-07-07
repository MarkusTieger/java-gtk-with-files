/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileInfo {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_file_info_new();
        void g_file_info_clear_status(long _self);
        void g_file_info_copy_into(long _self, long dest_info);
        long g_file_info_dup(long _self);
        long g_file_info_get_access_date_time(long _self);
        long g_file_info_get_attribute_as_string(long _self, long attribute);
        long g_file_info_get_attribute_as_string(long _self, String attribute);
        boolean g_file_info_get_attribute_boolean(long _self, long attribute);
        boolean g_file_info_get_attribute_boolean(long _self, String attribute);
        long g_file_info_get_attribute_byte_string(long _self, long attribute);
        long g_file_info_get_attribute_byte_string(long _self, String attribute);
        int g_file_info_get_attribute_int32(long _self, long attribute);
        int g_file_info_get_attribute_int32(long _self, String attribute);
        long g_file_info_get_attribute_int64(long _self, long attribute);
        long g_file_info_get_attribute_int64(long _self, String attribute);
        long g_file_info_get_attribute_object(long _self, long attribute);
        long g_file_info_get_attribute_object(long _self, String attribute);
        int g_file_info_get_attribute_status(long _self, long attribute);
        int g_file_info_get_attribute_status(long _self, String attribute);
        long g_file_info_get_attribute_string(long _self, long attribute);
        long g_file_info_get_attribute_string(long _self, String attribute);
        long g_file_info_get_attribute_stringv(long _self, long attribute);
        long g_file_info_get_attribute_stringv(long _self, String attribute);
        int g_file_info_get_attribute_type(long _self, long attribute);
        int g_file_info_get_attribute_type(long _self, String attribute);
        int g_file_info_get_attribute_uint32(long _self, long attribute);
        int g_file_info_get_attribute_uint32(long _self, String attribute);
        long g_file_info_get_attribute_uint64(long _self, long attribute);
        long g_file_info_get_attribute_uint64(long _self, String attribute);
        long g_file_info_get_content_type(long _self);
        long g_file_info_get_creation_date_time(long _self);
        long g_file_info_get_deletion_date(long _self);
        long g_file_info_get_display_name(long _self);
        long g_file_info_get_edit_name(long _self);
        long g_file_info_get_etag(long _self);
        int g_file_info_get_file_type(long _self);
        long g_file_info_get_icon(long _self);
        boolean g_file_info_get_is_backup(long _self);
        boolean g_file_info_get_is_hidden(long _self);
        boolean g_file_info_get_is_symlink(long _self);
        long g_file_info_get_modification_date_time(long _self);
        long g_file_info_get_name(long _self);
        int g_file_info_get_sort_order(long _self);
        long g_file_info_get_symbolic_icon(long _self);
        long g_file_info_get_symlink_target(long _self);
        boolean g_file_info_has_attribute(long _self, long attribute);
        boolean g_file_info_has_attribute(long _self, String attribute);
        boolean g_file_info_has_namespace(long _self, long name_space);
        boolean g_file_info_has_namespace(long _self, String name_space);
        long g_file_info_list_attributes(long _self, long name_space);
        long g_file_info_list_attributes(long _self, String name_space);
        void g_file_info_remove_attribute(long _self, long attribute);
        void g_file_info_remove_attribute(long _self, String attribute);
        void g_file_info_set_access_date_time(long _self, long atime);
        void g_file_info_set_attribute(long _self, long attribute, int type, long value_p);
        void g_file_info_set_attribute(long _self, String attribute, int type, long value_p);
        void g_file_info_set_attribute_boolean(long _self, long attribute, boolean attr_value);
        void g_file_info_set_attribute_boolean(long _self, String attribute, boolean attr_value);
        void g_file_info_set_attribute_byte_string(long _self, long attribute, long attr_value);
        void g_file_info_set_attribute_byte_string(long _self, String attribute, String attr_value);
        void g_file_info_set_attribute_int32(long _self, long attribute, int attr_value);
        void g_file_info_set_attribute_int32(long _self, String attribute, int attr_value);
        void g_file_info_set_attribute_int64(long _self, long attribute, long attr_value);
        void g_file_info_set_attribute_int64(long _self, String attribute, long attr_value);
        void g_file_info_set_attribute_mask(long _self, long mask);
        void g_file_info_set_attribute_object(long _self, long attribute, long attr_value);
        void g_file_info_set_attribute_object(long _self, String attribute, long attr_value);
        boolean g_file_info_set_attribute_status(long _self, long attribute, int status);
        boolean g_file_info_set_attribute_status(long _self, String attribute, int status);
        void g_file_info_set_attribute_string(long _self, long attribute, long attr_value);
        void g_file_info_set_attribute_string(long _self, String attribute, String attr_value);
        void g_file_info_set_attribute_stringv(long _self, long attribute, long attr_value);
        void g_file_info_set_attribute_stringv(long _self, String attribute, long attr_value);
        void g_file_info_set_attribute_uint32(long _self, long attribute, int attr_value);
        void g_file_info_set_attribute_uint32(long _self, String attribute, int attr_value);
        void g_file_info_set_attribute_uint64(long _self, long attribute, long attr_value);
        void g_file_info_set_attribute_uint64(long _self, String attribute, long attr_value);
        void g_file_info_set_content_type(long _self, long content_type);
        void g_file_info_set_content_type(long _self, String content_type);
        void g_file_info_set_creation_date_time(long _self, long creation_time);
        void g_file_info_set_display_name(long _self, long display_name);
        void g_file_info_set_display_name(long _self, String display_name);
        void g_file_info_set_edit_name(long _self, long edit_name);
        void g_file_info_set_edit_name(long _self, String edit_name);
        void g_file_info_set_file_type(long _self, int type);
        void g_file_info_set_icon(long _self, long icon);
        void g_file_info_set_is_hidden(long _self, boolean is_hidden);
        void g_file_info_set_is_symlink(long _self, boolean is_symlink);
        void g_file_info_set_modification_date_time(long _self, long mtime);
        void g_file_info_set_name(long _self, long name);
        void g_file_info_set_name(long _self, String name);
        void g_file_info_set_sort_order(long _self, int sort_order);
        void g_file_info_set_symbolic_icon(long _self, long icon);
        void g_file_info_set_symlink_target(long _self, long symlink_target);
        void g_file_info_set_symlink_target(long _self, String symlink_target);
        void g_file_info_unset_attribute_mask(long _self);
        long g_file_info_get_type();
    }

}
