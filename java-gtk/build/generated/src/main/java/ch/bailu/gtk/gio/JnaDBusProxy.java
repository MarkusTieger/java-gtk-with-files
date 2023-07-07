/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusProxy {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnGSignal extends com.sun.jna.Callback {
        void invoke(long _self, long sender_name, long signal_name, long parameters, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_proxy_new_finish(long res, long _error);
        long g_dbus_proxy_new_for_bus_finish(long res, long _error);
        long g_dbus_proxy_new_for_bus_sync(int bus_type, int flags, long info, long name, long object_path, long interface_name, long cancellable, long _error);
        long g_dbus_proxy_new_for_bus_sync(int bus_type, int flags, long info, String name, String object_path, String interface_name, long cancellable, long _error);
        long g_dbus_proxy_new_sync(long connection, int flags, long info, long name, long object_path, long interface_name, long cancellable, long _error);
        long g_dbus_proxy_new_sync(long connection, int flags, long info, String name, String object_path, String interface_name, long cancellable, long _error);
        void g_dbus_proxy_call(long _self, long method_name, long parameters, int flags, int timeout_msec, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_proxy_call(long _self, String method_name, long parameters, int flags, int timeout_msec, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_dbus_proxy_call_finish(long _self, long res, long _error);
        long g_dbus_proxy_call_sync(long _self, long method_name, long parameters, int flags, int timeout_msec, long cancellable, long _error);
        long g_dbus_proxy_call_sync(long _self, String method_name, long parameters, int flags, int timeout_msec, long cancellable, long _error);
        void g_dbus_proxy_call_with_unix_fd_list(long _self, long method_name, long parameters, int flags, int timeout_msec, long fd_list, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_proxy_call_with_unix_fd_list(long _self, String method_name, long parameters, int flags, int timeout_msec, long fd_list, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_dbus_proxy_get_cached_property(long _self, long property_name);
        long g_dbus_proxy_get_cached_property(long _self, String property_name);
        long g_dbus_proxy_get_connection(long _self);
        int g_dbus_proxy_get_default_timeout(long _self);
        int g_dbus_proxy_get_flags(long _self);
        long g_dbus_proxy_get_interface_info(long _self);
        long g_dbus_proxy_get_interface_name(long _self);
        long g_dbus_proxy_get_name(long _self);
        long g_dbus_proxy_get_name_owner(long _self);
        long g_dbus_proxy_get_object_path(long _self);
        void g_dbus_proxy_set_cached_property(long _self, long property_name, long value);
        void g_dbus_proxy_set_cached_property(long _self, String property_name, long value);
        void g_dbus_proxy_set_default_timeout(long _self, int timeout_msec);
        void g_dbus_proxy_set_interface_info(long _self, long info);
        void g_dbus_proxy_new(long connection, int flags, long info, long name, long object_path, long interface_name, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_proxy_new_for_bus(int bus_type, int flags, long info, long name, long object_path, long interface_name, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_dbus_proxy_get_type();
    }

}
