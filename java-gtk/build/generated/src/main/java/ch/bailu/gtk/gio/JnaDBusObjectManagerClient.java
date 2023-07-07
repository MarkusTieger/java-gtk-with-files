/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusObjectManagerClient {

    @FunctionalInterface
    public interface OnDBusProxyTypeFunc extends com.sun.jna.Callback {
        long invoke(long manager, long object_path, long interface_name, long user_data);
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
    public interface OnInterfaceProxySignal extends com.sun.jna.Callback {
        void invoke(long _self, long object_proxy, long interface_proxy, long sender_name, long signal_name, long parameters, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_object_manager_client_new_finish(long res, long _error);
        long g_dbus_object_manager_client_new_for_bus_finish(long res, long _error);
        long g_dbus_object_manager_client_new_for_bus_sync(int bus_type, int flags, long name, long object_path, com.sun.jna.Callback get_proxy_type_func, long get_proxy_type_user_data, com.sun.jna.Callback get_proxy_type_destroy_notify, long cancellable, long _error);
        long g_dbus_object_manager_client_new_for_bus_sync(int bus_type, int flags, String name, String object_path, com.sun.jna.Callback get_proxy_type_func, long get_proxy_type_user_data, com.sun.jna.Callback get_proxy_type_destroy_notify, long cancellable, long _error);
        long g_dbus_object_manager_client_new_sync(long connection, int flags, long name, long object_path, com.sun.jna.Callback get_proxy_type_func, long get_proxy_type_user_data, com.sun.jna.Callback get_proxy_type_destroy_notify, long cancellable, long _error);
        long g_dbus_object_manager_client_new_sync(long connection, int flags, String name, String object_path, com.sun.jna.Callback get_proxy_type_func, long get_proxy_type_user_data, com.sun.jna.Callback get_proxy_type_destroy_notify, long cancellable, long _error);
        long g_dbus_object_manager_client_get_connection(long _self);
        int g_dbus_object_manager_client_get_flags(long _self);
        long g_dbus_object_manager_client_get_name(long _self);
        long g_dbus_object_manager_client_get_name_owner(long _self);
        void g_dbus_object_manager_client_new(long connection, int flags, long name, long object_path, com.sun.jna.Callback get_proxy_type_func, long get_proxy_type_user_data, com.sun.jna.Callback get_proxy_type_destroy_notify, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_dbus_object_manager_client_new_for_bus(int bus_type, int flags, long name, long object_path, com.sun.jna.Callback get_proxy_type_func, long get_proxy_type_user_data, com.sun.jna.Callback get_proxy_type_destroy_notify, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_dbus_object_manager_client_get_type();
    }

}
