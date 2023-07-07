/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaGio {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnBusAcquiredCallback extends com.sun.jna.Callback {
        void invoke(long connection, long name, long user_data);
    }

    @FunctionalInterface
    public interface OnBusNameAcquiredCallback extends com.sun.jna.Callback {
        void invoke(long connection, long name, long user_data);
    }

    @FunctionalInterface
    public interface OnBusNameLostCallback extends com.sun.jna.Callback {
        void invoke(long connection, long name, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnBusNameAppearedCallback extends com.sun.jna.Callback {
        void invoke(long connection, long name, long name_owner, long user_data);
    }

    @FunctionalInterface
    public interface OnBusNameVanishedCallback extends com.sun.jna.Callback {
        void invoke(long connection, long name, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_action_name_is_valid(long action_name);
        long g_action_print_detailed_name(long action_name, long target_value);
        long g_app_info_create_from_commandline(long commandline, long application_name, int flags, long _error);
        long g_app_info_get_all();
        long g_app_info_get_all_for_type(long content_type);
        long g_app_info_get_default_for_type(long content_type, boolean must_support_uris);
        void g_app_info_get_default_for_type_async(long content_type, boolean must_support_uris, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_app_info_get_default_for_type_finish(long result, long _error);
        long g_app_info_get_default_for_uri_scheme(long uri_scheme);
        void g_app_info_get_default_for_uri_scheme_async(long uri_scheme, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_app_info_get_default_for_uri_scheme_finish(long result, long _error);
        long g_app_info_get_fallback_for_type(long content_type);
        long g_app_info_get_recommended_for_type(long content_type);
        boolean g_app_info_launch_default_for_uri(long uri, long context, long _error);
        void g_app_info_launch_default_for_uri_async(long uri, long context, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_app_info_launch_default_for_uri_finish(long result, long _error);
        void g_app_info_reset_type_associations(long content_type);
        void g_bus_get(int bus_type, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_bus_get_finish(long res, long _error);
        long g_bus_get_sync(int bus_type, long cancellable, long _error);
        int g_bus_own_name(int bus_type, long name, int flags, com.sun.jna.Callback bus_acquired_handler, com.sun.jna.Callback name_acquired_handler, com.sun.jna.Callback name_lost_handler, long user_data, com.sun.jna.Callback user_data_free_func);
        int g_bus_own_name_on_connection(long connection, long name, int flags, com.sun.jna.Callback name_acquired_handler, com.sun.jna.Callback name_lost_handler, long user_data, com.sun.jna.Callback user_data_free_func);
        int g_bus_own_name_on_connection_with_closures(long connection, long name, int flags, long name_acquired_closure, long name_lost_closure);
        int g_bus_own_name_with_closures(int bus_type, long name, int flags, long bus_acquired_closure, long name_acquired_closure, long name_lost_closure);
        void g_bus_unown_name(int owner_id);
        void g_bus_unwatch_name(int watcher_id);
        int g_bus_watch_name(int bus_type, long name, int flags, com.sun.jna.Callback name_appeared_handler, com.sun.jna.Callback name_vanished_handler, long user_data, com.sun.jna.Callback user_data_free_func);
        int g_bus_watch_name_on_connection(long connection, long name, int flags, com.sun.jna.Callback name_appeared_handler, com.sun.jna.Callback name_vanished_handler, long user_data, com.sun.jna.Callback user_data_free_func);
        int g_bus_watch_name_on_connection_with_closures(long connection, long name, int flags, long name_appeared_closure, long name_vanished_closure);
        int g_bus_watch_name_with_closures(int bus_type, long name, int flags, long name_appeared_closure, long name_vanished_closure);
        boolean g_content_type_can_be_executable(long type);
        boolean g_content_type_equals(long type1, long type2);
        long g_content_type_from_mime_type(long mime_type);
        long g_content_type_get_description(long type);
        long g_content_type_get_generic_icon_name(long type);
        long g_content_type_get_icon(long type);
        long g_content_type_get_mime_type(long type);
        long g_content_type_get_symbolic_icon(long type);
        boolean g_content_type_is_a(long type, long supertype);
        boolean g_content_type_is_mime_type(long type, long mime_type);
        boolean g_content_type_is_unknown(long type);
        long g_content_types_get_registered();
        long g_dbus_address_escape_value(long string);
        long g_dbus_address_get_for_bus_sync(int bus_type, long cancellable, long _error);
        void g_dbus_address_get_stream(long address, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_dbus_error_encode_gerror(long error);
        long g_dbus_error_get_remote_error(long error);
        boolean g_dbus_error_is_remote_error(long error);
        long g_dbus_error_new_for_dbus_error(long dbus_error_name, long dbus_error_message);
        int g_dbus_error_quark();
        boolean g_dbus_error_register_error(int error_domain, int error_code, long dbus_error_name);
        boolean g_dbus_error_strip_remote_error(long error);
        boolean g_dbus_error_unregister_error(int error_domain, int error_code, long dbus_error_name);
        long g_dbus_escape_object_path(long s);
        long g_dbus_generate_guid();
        long g_dbus_gvalue_to_gvariant(long gvalue, long type);
        void g_dbus_gvariant_to_gvalue(long value, long out_gvalue);
        boolean g_dbus_is_address(long string);
        boolean g_dbus_is_error_name(long string);
        boolean g_dbus_is_guid(long string);
        boolean g_dbus_is_interface_name(long string);
        boolean g_dbus_is_member_name(long string);
        boolean g_dbus_is_name(long string);
        boolean g_dbus_is_supported_address(long string, long _error);
        boolean g_dbus_is_unique_name(long string);
        long g_dtls_client_connection_new(long base_socket, long server_identity, long _error);
        long g_dtls_server_connection_new(long base_socket, long certificate, long _error);
        long g_file_new_for_commandline_arg(long arg);
        long g_file_new_for_commandline_arg_and_cwd(long arg, long cwd);
        long g_file_new_for_path(long path);
        long g_file_new_for_uri(long uri);
        void g_file_new_tmp_async(long tmpl, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_new_tmp_dir_async(long tmpl, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_new_tmp_dir_finish(long result, long _error);
        long g_file_parse_name(long parse_name);
        long g_icon_deserialize(long value);
        int g_icon_hash(long icon);
        long g_icon_new_for_string(long str, long _error);
        int g_io_error_from_errno(int err_no);
        int g_io_error_from_file_error(int file_error);
        int g_io_error_quark();
        long g_io_extension_point_implement(long extension_point_name, long type, long extension_name, int priority);
        long g_io_extension_point_lookup(long name);
        long g_io_extension_point_register(long name);
        long g_io_modules_load_all_in_directory(long dirname);
        long g_io_modules_load_all_in_directory_with_scope(long dirname, long scope);
        void g_io_modules_scan_all_in_directory(long dirname);
        void g_io_modules_scan_all_in_directory_with_scope(long dirname, long scope);
        long g_keyfile_settings_backend_new(long filename, long root_path, long root_group);
        long g_memory_monitor_dup_default();
        long g_memory_settings_backend_new();
        long g_network_monitor_get_default();
        void g_networking_init();
        long g_null_settings_backend_new();
        long g_pollable_source_new(long pollable_stream);
        long g_pollable_source_new_full(long pollable_stream, long child_source, long cancellable);
        long g_pollable_stream_read(long stream, long buffer, long count, boolean blocking, long cancellable, long _error);
        long g_pollable_stream_write(long stream, long buffer, long count, boolean blocking, long cancellable, long _error);
        boolean g_pollable_stream_write_all(long stream, long buffer, long count, boolean blocking, long bytes_written, long cancellable, long _error);
        long g_power_profile_monitor_dup_default();
        long g_proxy_get_default_for_protocol(long protocol);
        long g_proxy_resolver_get_default();
        int g_resolver_error_quark();
        int g_resource_error_quark();
        long g_resource_load(long filename, long _error);
        long g_resources_enumerate_children(long path, int lookup_flags, long _error);
        boolean g_resources_get_info(long path, int lookup_flags, long size, long flags, long _error);
        long g_resources_lookup_data(long path, int lookup_flags, long _error);
        long g_resources_open_stream(long path, int lookup_flags, long _error);
        void g_resources_register(long resource);
        void g_resources_unregister(long resource);
        long g_settings_schema_source_get_default();
        long g_srv_target_list_sort(long targets);
        long g_tls_backend_get_default();
        int g_tls_channel_binding_error_quark();
        long g_tls_client_connection_new(long base_io_stream, long server_identity, long _error);
        int g_tls_error_quark();
        long g_tls_file_database_new(long anchors, long _error);
        long g_tls_server_connection_new(long base_io_stream, long certificate, long _error);
        boolean g_unix_is_mount_path_system_internal(long mount_path);
        boolean g_unix_is_system_device_path(long device_path);
        boolean g_unix_is_system_fs_type(long fs_type);
        int g_unix_mount_compare(long mount1, long mount2);
        long g_unix_mount_copy(long mount_entry);
        void g_unix_mount_free(long mount_entry);
        long g_unix_mount_get_device_path(long mount_entry);
        long g_unix_mount_get_fs_type(long mount_entry);
        long g_unix_mount_get_mount_path(long mount_entry);
        long g_unix_mount_get_options(long mount_entry);
        long g_unix_mount_get_root_path(long mount_entry);
        boolean g_unix_mount_guess_can_eject(long mount_entry);
        long g_unix_mount_guess_icon(long mount_entry);
        long g_unix_mount_guess_name(long mount_entry);
        boolean g_unix_mount_guess_should_display(long mount_entry);
        long g_unix_mount_guess_symbolic_icon(long mount_entry);
        boolean g_unix_mount_is_readonly(long mount_entry);
        boolean g_unix_mount_is_system_internal(long mount_entry);
        boolean g_unix_mount_points_changed_since(long time);
        boolean g_unix_mounts_changed_since(long time);
    }

}
