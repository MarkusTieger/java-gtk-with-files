/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusConnection {

    @FunctionalInterface
    public interface OnDBusMessageFilterFunction extends com.sun.jna.Callback {
        long invoke(long connection, long message, boolean incoming, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnDBusSignalCallback extends com.sun.jna.Callback {
        void invoke(long connection, long sender_name, long object_path, long interface_name, long signal_name, long parameters, long user_data);
    }

    @FunctionalInterface
    public interface OnClosed extends com.sun.jna.Callback {
        void invoke(long _self, boolean remote_peer_vanished, long error, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_connection_new_finish(long res, long _error);
        long g_dbus_connection_new_for_address_finish(long res, long _error);
        long g_dbus_connection_new_for_address_sync(long address, int flags, long observer, long cancellable, long _error);
        long g_dbus_connection_new_for_address_sync(String address, int flags, long observer, long cancellable, long _error);
        long g_dbus_connection_new_sync(long stream, long guid, int flags, long observer, long cancellable, long _error);
        long g_dbus_connection_new_sync(long stream, String guid, int flags, long observer, long cancellable, long _error);
        int g_dbus_connection_add_filter(long _self, com.sun.jna.Callback filter_function, long user_data, com.sun.jna.Callback user_data_free_func);
        void g_dbus_connection_call(long _self, long bus_name, long object_path, long interface_name, long method_name, long parameters, long reply_type, int flags, int timeout_msec, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_connection_call(long _self, String bus_name, String object_path, String interface_name, String method_name, long parameters, long reply_type, int flags, int timeout_msec, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_dbus_connection_call_finish(long _self, long res, long _error);
        long g_dbus_connection_call_sync(long _self, long bus_name, long object_path, long interface_name, long method_name, long parameters, long reply_type, int flags, int timeout_msec, long cancellable, long _error);
        long g_dbus_connection_call_sync(long _self, String bus_name, String object_path, String interface_name, String method_name, long parameters, long reply_type, int flags, int timeout_msec, long cancellable, long _error);
        void g_dbus_connection_call_with_unix_fd_list(long _self, long bus_name, long object_path, long interface_name, long method_name, long parameters, long reply_type, int flags, int timeout_msec, long fd_list, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_connection_call_with_unix_fd_list(long _self, String bus_name, String object_path, String interface_name, String method_name, long parameters, long reply_type, int flags, int timeout_msec, long fd_list, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_connection_close(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_dbus_connection_close_finish(long _self, long res, long _error);
        boolean g_dbus_connection_close_sync(long _self, long cancellable, long _error);
        boolean g_dbus_connection_emit_signal(long _self, long destination_bus_name, long object_path, long interface_name, long signal_name, long parameters, long _error);
        boolean g_dbus_connection_emit_signal(long _self, String destination_bus_name, String object_path, String interface_name, String signal_name, long parameters, long _error);
        int g_dbus_connection_export_action_group(long _self, long object_path, long action_group, long _error);
        int g_dbus_connection_export_action_group(long _self, String object_path, long action_group, long _error);
        int g_dbus_connection_export_menu_model(long _self, long object_path, long menu, long _error);
        int g_dbus_connection_export_menu_model(long _self, String object_path, long menu, long _error);
        void g_dbus_connection_flush(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_dbus_connection_flush_finish(long _self, long res, long _error);
        boolean g_dbus_connection_flush_sync(long _self, long cancellable, long _error);
        int g_dbus_connection_get_capabilities(long _self);
        boolean g_dbus_connection_get_exit_on_close(long _self);
        int g_dbus_connection_get_flags(long _self);
        long g_dbus_connection_get_guid(long _self);
        int g_dbus_connection_get_last_serial(long _self);
        long g_dbus_connection_get_peer_credentials(long _self);
        long g_dbus_connection_get_stream(long _self);
        long g_dbus_connection_get_unique_name(long _self);
        boolean g_dbus_connection_is_closed(long _self);
        int g_dbus_connection_register_object(long _self, long object_path, long interface_info, long vtable, long user_data, com.sun.jna.Callback user_data_free_func, long _error);
        int g_dbus_connection_register_object(long _self, String object_path, long interface_info, long vtable, long user_data, com.sun.jna.Callback user_data_free_func, long _error);
        int g_dbus_connection_register_object_with_closures(long _self, long object_path, long interface_info, long method_call_closure, long get_property_closure, long set_property_closure, long _error);
        int g_dbus_connection_register_object_with_closures(long _self, String object_path, long interface_info, long method_call_closure, long get_property_closure, long set_property_closure, long _error);
        int g_dbus_connection_register_subtree(long _self, long object_path, long vtable, int flags, long user_data, com.sun.jna.Callback user_data_free_func, long _error);
        int g_dbus_connection_register_subtree(long _self, String object_path, long vtable, int flags, long user_data, com.sun.jna.Callback user_data_free_func, long _error);
        void g_dbus_connection_remove_filter(long _self, int filter_id);
        long g_dbus_connection_send_message_with_reply_finish(long _self, long res, long _error);
        void g_dbus_connection_set_exit_on_close(long _self, boolean exit_on_close);
        int g_dbus_connection_signal_subscribe(long _self, long sender, long interface_name, long member, long object_path, long arg0, int flags, com.sun.jna.Callback callback, long user_data, com.sun.jna.Callback user_data_free_func);
        int g_dbus_connection_signal_subscribe(long _self, String sender, String interface_name, String member, String object_path, String arg0, int flags, com.sun.jna.Callback callback, long user_data, com.sun.jna.Callback user_data_free_func);
        void g_dbus_connection_signal_unsubscribe(long _self, int subscription_id);
        void g_dbus_connection_start_message_processing(long _self);
        void g_dbus_connection_unexport_action_group(long _self, int export_id);
        void g_dbus_connection_unexport_menu_model(long _self, int export_id);
        boolean g_dbus_connection_unregister_object(long _self, int registration_id);
        boolean g_dbus_connection_unregister_subtree(long _self, int registration_id);
        void g_dbus_connection_new(long stream, long guid, int flags, long observer, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_connection_new_for_address(long address, int flags, long observer, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_dbus_connection_get_type();
    }

}
