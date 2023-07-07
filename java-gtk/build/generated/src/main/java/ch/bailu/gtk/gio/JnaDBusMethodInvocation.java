/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusMethodInvocation {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_method_invocation_get_connection(long _self);
        long g_dbus_method_invocation_get_interface_name(long _self);
        long g_dbus_method_invocation_get_message(long _self);
        long g_dbus_method_invocation_get_method_info(long _self);
        long g_dbus_method_invocation_get_method_name(long _self);
        long g_dbus_method_invocation_get_object_path(long _self);
        long g_dbus_method_invocation_get_parameters(long _self);
        long g_dbus_method_invocation_get_property_info(long _self);
        long g_dbus_method_invocation_get_sender(long _self);
        long g_dbus_method_invocation_get_user_data(long _self);
        void g_dbus_method_invocation_return_dbus_error(long _self, long error_name, long error_message);
        void g_dbus_method_invocation_return_dbus_error(long _self, String error_name, String error_message);
        void g_dbus_method_invocation_return_error(long _self, int domain, int code, long format, java.lang.Object... _elipse);
        void g_dbus_method_invocation_return_error(long _self, int domain, int code, String format, java.lang.Object... _elipse);
        void g_dbus_method_invocation_return_error_literal(long _self, int domain, int code, long message);
        void g_dbus_method_invocation_return_error_literal(long _self, int domain, int code, String message);
        void g_dbus_method_invocation_return_gerror(long _self, long error);
        void g_dbus_method_invocation_return_value(long _self, long parameters);
        void g_dbus_method_invocation_return_value_with_unix_fd_list(long _self, long parameters, long fd_list);
        void g_dbus_method_invocation_take_error(long _self, long error);
        long g_dbus_method_invocation_get_type();
    }

}
