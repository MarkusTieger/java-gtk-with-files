/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusMessage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_message_new();
        long g_dbus_message_new_method_call(long name, long path, long interface_, long method);
        long g_dbus_message_new_method_call(String name, String path, String interface_, String method);
        long g_dbus_message_new_signal(long path, long interface_, long signal);
        long g_dbus_message_new_signal(String path, String interface_, String signal);
        long g_dbus_message_copy(long _self, long _error);
        long g_dbus_message_get_arg0(long _self);
        long g_dbus_message_get_body(long _self);
        int g_dbus_message_get_byte_order(long _self);
        long g_dbus_message_get_destination(long _self);
        long g_dbus_message_get_error_name(long _self);
        int g_dbus_message_get_flags(long _self);
        long g_dbus_message_get_header(long _self, int header_field);
        long g_dbus_message_get_interface(long _self);
        boolean g_dbus_message_get_locked(long _self);
        long g_dbus_message_get_member(long _self);
        int g_dbus_message_get_message_type(long _self);
        int g_dbus_message_get_num_unix_fds(long _self);
        long g_dbus_message_get_path(long _self);
        int g_dbus_message_get_reply_serial(long _self);
        long g_dbus_message_get_sender(long _self);
        int g_dbus_message_get_serial(long _self);
        long g_dbus_message_get_signature(long _self);
        long g_dbus_message_get_unix_fd_list(long _self);
        void g_dbus_message_lock(long _self);
        long g_dbus_message_new_method_error(long _self, long error_name, long error_message_format, java.lang.Object... _elipse);
        long g_dbus_message_new_method_error(long _self, String error_name, String error_message_format, java.lang.Object... _elipse);
        long g_dbus_message_new_method_error_literal(long _self, long error_name, long error_message);
        long g_dbus_message_new_method_error_literal(long _self, String error_name, String error_message);
        long g_dbus_message_new_method_reply(long _self);
        long g_dbus_message_print(long _self, int indent);
        void g_dbus_message_set_body(long _self, long body);
        void g_dbus_message_set_byte_order(long _self, int byte_order);
        void g_dbus_message_set_destination(long _self, long value);
        void g_dbus_message_set_destination(long _self, String value);
        void g_dbus_message_set_error_name(long _self, long value);
        void g_dbus_message_set_error_name(long _self, String value);
        void g_dbus_message_set_flags(long _self, int flags);
        void g_dbus_message_set_header(long _self, int header_field, long value);
        void g_dbus_message_set_interface(long _self, long value);
        void g_dbus_message_set_interface(long _self, String value);
        void g_dbus_message_set_member(long _self, long value);
        void g_dbus_message_set_member(long _self, String value);
        void g_dbus_message_set_message_type(long _self, int type);
        void g_dbus_message_set_num_unix_fds(long _self, int value);
        void g_dbus_message_set_path(long _self, long value);
        void g_dbus_message_set_path(long _self, String value);
        void g_dbus_message_set_reply_serial(long _self, int value);
        void g_dbus_message_set_sender(long _self, long value);
        void g_dbus_message_set_sender(long _self, String value);
        void g_dbus_message_set_serial(long _self, int serial);
        void g_dbus_message_set_signature(long _self, long value);
        void g_dbus_message_set_signature(long _self, String value);
        void g_dbus_message_set_unix_fd_list(long _self, long fd_list);
        boolean g_dbus_message_to_gerror(long _self, long _error);
        long g_dbus_message_get_type();
    }

}
