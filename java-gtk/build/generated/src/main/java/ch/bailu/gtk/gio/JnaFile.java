/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFile {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnFileMeasureProgressCallback extends com.sun.jna.Callback {
        void invoke(boolean reporting, long current_size, long num_dirs, long num_files, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_file_append_to(long _self, int flags, long cancellable, long _error);
        void g_file_append_to_async(long _self, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_append_to_finish(long _self, long res, long _error);
        long g_file_build_attribute_list_for_copy(long _self, int flags, long cancellable, long _error);
        boolean g_file_copy_attributes(long _self, long destination, int flags, long cancellable, long _error);
        boolean g_file_copy_finish(long _self, long res, long _error);
        long g_file_create(long _self, int flags, long cancellable, long _error);
        void g_file_create_async(long _self, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_create_finish(long _self, long res, long _error);
        long g_file_create_readwrite(long _self, int flags, long cancellable, long _error);
        void g_file_create_readwrite_async(long _self, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_create_readwrite_finish(long _self, long res, long _error);
        boolean g_file_delete(long _self, long cancellable, long _error);
        void g_file_delete_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_delete_finish(long _self, long result, long _error);
        long g_file_dup(long _self);
        void g_file_eject_mountable_with_operation(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_eject_mountable_with_operation_finish(long _self, long result, long _error);
        long g_file_enumerate_children(long _self, long attributes, int flags, long cancellable, long _error);
        long g_file_enumerate_children(long _self, String attributes, int flags, long cancellable, long _error);
        void g_file_enumerate_children_async(long _self, long attributes, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_enumerate_children_async(long _self, String attributes, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_enumerate_children_finish(long _self, long res, long _error);
        boolean g_file_equal(long _self, long file2);
        long g_file_find_enclosing_mount(long _self, long cancellable, long _error);
        void g_file_find_enclosing_mount_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_find_enclosing_mount_finish(long _self, long res, long _error);
        long g_file_get_basename(long _self);
        long g_file_get_child(long _self, long name);
        long g_file_get_child(long _self, String name);
        long g_file_get_child_for_display_name(long _self, long display_name, long _error);
        long g_file_get_child_for_display_name(long _self, String display_name, long _error);
        long g_file_get_parent(long _self);
        long g_file_get_parse_name(long _self);
        long g_file_get_path(long _self);
        long g_file_get_relative_path(long _self, long descendant);
        long g_file_get_uri(long _self);
        long g_file_get_uri_scheme(long _self);
        boolean g_file_has_parent(long _self, long parent);
        boolean g_file_has_prefix(long _self, long prefix);
        boolean g_file_has_uri_scheme(long _self, long uri_scheme);
        boolean g_file_has_uri_scheme(long _self, String uri_scheme);
        int g_file_hash(long _self);
        boolean g_file_is_native(long _self);
        void g_file_load_bytes_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_load_contents(long _self, long cancellable, long contents, long length, long etag_out, long _error);
        void g_file_load_contents_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_load_contents_finish(long _self, long res, long contents, long length, long etag_out, long _error);
        boolean g_file_load_partial_contents_finish(long _self, long res, long contents, long length, long etag_out, long _error);
        boolean g_file_make_directory(long _self, long cancellable, long _error);
        void g_file_make_directory_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_make_directory_finish(long _self, long result, long _error);
        boolean g_file_make_directory_with_parents(long _self, long cancellable, long _error);
        boolean g_file_make_symbolic_link(long _self, long symlink_value, long cancellable, long _error);
        boolean g_file_make_symbolic_link(long _self, String symlink_value, long cancellable, long _error);
        void g_file_make_symbolic_link_async(long _self, long symlink_value, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_make_symbolic_link_async(long _self, String symlink_value, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_make_symbolic_link_finish(long _self, long result, long _error);
        void g_file_measure_disk_usage_async(long _self, int flags, int io_priority, long cancellable, com.sun.jna.Callback progress_callback, long progress_data, com.sun.jna.Callback callback, long user_data);
        long g_file_monitor(long _self, int flags, long cancellable, long _error);
        long g_file_monitor_directory(long _self, int flags, long cancellable, long _error);
        long g_file_monitor_file(long _self, int flags, long cancellable, long _error);
        void g_file_mount_enclosing_volume(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_mount_enclosing_volume_finish(long _self, long result, long _error);
        void g_file_mount_mountable(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_mount_mountable_finish(long _self, long result, long _error);
        boolean g_file_move_finish(long _self, long result, long _error);
        long g_file_open_readwrite(long _self, long cancellable, long _error);
        void g_file_open_readwrite_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_open_readwrite_finish(long _self, long res, long _error);
        long g_file_peek_path(long _self);
        void g_file_poll_mountable(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_poll_mountable_finish(long _self, long result, long _error);
        long g_file_query_default_handler(long _self, long cancellable, long _error);
        void g_file_query_default_handler_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_query_default_handler_finish(long _self, long result, long _error);
        boolean g_file_query_exists(long _self, long cancellable);
        int g_file_query_file_type(long _self, int flags, long cancellable);
        long g_file_query_filesystem_info(long _self, long attributes, long cancellable, long _error);
        long g_file_query_filesystem_info(long _self, String attributes, long cancellable, long _error);
        void g_file_query_filesystem_info_async(long _self, long attributes, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_query_filesystem_info_async(long _self, String attributes, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_query_filesystem_info_finish(long _self, long res, long _error);
        long g_file_query_info(long _self, long attributes, int flags, long cancellable, long _error);
        long g_file_query_info(long _self, String attributes, int flags, long cancellable, long _error);
        void g_file_query_info_async(long _self, long attributes, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_query_info_async(long _self, String attributes, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_query_info_finish(long _self, long res, long _error);
        long g_file_query_settable_attributes(long _self, long cancellable, long _error);
        long g_file_query_writable_namespaces(long _self, long cancellable, long _error);
        long g_file_read(long _self, long cancellable, long _error);
        void g_file_read_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_read_finish(long _self, long res, long _error);
        long g_file_replace(long _self, long etag, boolean make_backup, int flags, long cancellable, long _error);
        long g_file_replace(long _self, String etag, boolean make_backup, int flags, long cancellable, long _error);
        void g_file_replace_async(long _self, long etag, boolean make_backup, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_replace_async(long _self, String etag, boolean make_backup, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_replace_contents(long _self, long contents, long length, long etag, boolean make_backup, int flags, long new_etag, long cancellable, long _error);
        boolean g_file_replace_contents(long _self, String contents, long length, String etag, boolean make_backup, int flags, long new_etag, long cancellable, long _error);
        void g_file_replace_contents_async(long _self, long contents, long length, long etag, boolean make_backup, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_replace_contents_async(long _self, String contents, long length, String etag, boolean make_backup, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_replace_contents_bytes_async(long _self, long contents, long etag, boolean make_backup, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_replace_contents_bytes_async(long _self, long contents, String etag, boolean make_backup, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_replace_contents_finish(long _self, long res, long new_etag, long _error);
        long g_file_replace_finish(long _self, long res, long _error);
        long g_file_replace_readwrite(long _self, long etag, boolean make_backup, int flags, long cancellable, long _error);
        long g_file_replace_readwrite(long _self, String etag, boolean make_backup, int flags, long cancellable, long _error);
        void g_file_replace_readwrite_async(long _self, long etag, boolean make_backup, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_replace_readwrite_async(long _self, String etag, boolean make_backup, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_replace_readwrite_finish(long _self, long res, long _error);
        long g_file_resolve_relative_path(long _self, long relative_path);
        long g_file_resolve_relative_path(long _self, String relative_path);
        boolean g_file_set_attribute(long _self, long attribute, int type, long value_p, int flags, long cancellable, long _error);
        boolean g_file_set_attribute(long _self, String attribute, int type, long value_p, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_byte_string(long _self, long attribute, long value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_byte_string(long _self, String attribute, String value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_int32(long _self, long attribute, int value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_int32(long _self, String attribute, int value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_int64(long _self, long attribute, long value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_int64(long _self, String attribute, long value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_string(long _self, long attribute, long value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_string(long _self, String attribute, String value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_uint32(long _self, long attribute, int value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_uint32(long _self, String attribute, int value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_uint64(long _self, long attribute, long value, int flags, long cancellable, long _error);
        boolean g_file_set_attribute_uint64(long _self, String attribute, long value, int flags, long cancellable, long _error);
        void g_file_set_attributes_async(long _self, long info, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_set_attributes_from_info(long _self, long info, int flags, long cancellable, long _error);
        long g_file_set_display_name(long _self, long display_name, long cancellable, long _error);
        long g_file_set_display_name(long _self, String display_name, long cancellable, long _error);
        void g_file_set_display_name_async(long _self, long display_name, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_set_display_name_async(long _self, String display_name, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_set_display_name_finish(long _self, long res, long _error);
        void g_file_start_mountable(long _self, int flags, long start_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_start_mountable_finish(long _self, long result, long _error);
        void g_file_stop_mountable(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_stop_mountable_finish(long _self, long result, long _error);
        boolean g_file_supports_thread_contexts(long _self);
        boolean g_file_trash(long _self, long cancellable, long _error);
        void g_file_trash_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_trash_finish(long _self, long result, long _error);
        void g_file_unmount_mountable_with_operation(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_unmount_mountable_with_operation_finish(long _self, long result, long _error);
        long g_file_new_build_filename(long first_element, java.lang.Object... _elipse);
        long g_file_new_for_commandline_arg(long arg);
        long g_file_new_for_commandline_arg_and_cwd(long arg, long cwd);
        long g_file_new_for_path(long path);
        long g_file_new_for_uri(long uri);
        void g_file_new_tmp_async(long tmpl, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_new_tmp_dir_async(long tmpl, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_new_tmp_dir_finish(long result, long _error);
        long g_file_parse_name(long parse_name);
        long g_file_get_type();
    }

}
