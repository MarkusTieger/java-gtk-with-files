/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaApplication {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCommandLine extends com.sun.jna.Callback {
        int invoke(long _self, long command_line, long _data);
    }

    @FunctionalInterface
    public interface OnHandleLocalOptions extends com.sun.jna.Callback {
        int invoke(long _self, long options, long _data);
    }

    @FunctionalInterface
    public interface OnNameLost extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnOpen extends com.sun.jna.Callback {
        void invoke(long _self, long files, int n_files, long hint, long _data);
    }

    @FunctionalInterface
    public interface OnShutdown extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnStartup extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_application_new(long application_id, int flags);
        long g_application_new(String application_id, int flags);
        void g_application_activate(long _self);
        void g_application_add_option_group(long _self, long group);
        void g_application_bind_busy_property(long _self, long object, long property);
        void g_application_bind_busy_property(long _self, long object, String property);
        long g_application_get_application_id(long _self);
        long g_application_get_dbus_connection(long _self);
        long g_application_get_dbus_object_path(long _self);
        int g_application_get_flags(long _self);
        int g_application_get_inactivity_timeout(long _self);
        boolean g_application_get_is_busy(long _self);
        boolean g_application_get_is_registered(long _self);
        boolean g_application_get_is_remote(long _self);
        long g_application_get_resource_base_path(long _self);
        void g_application_hold(long _self);
        void g_application_mark_busy(long _self);
        void g_application_quit(long _self);
        boolean g_application_register(long _self, long cancellable, long _error);
        void g_application_release(long _self);
        int g_application_run(long _self, int argc, long argv);
        void g_application_send_notification(long _self, long id, long notification);
        void g_application_send_notification(long _self, String id, long notification);
        void g_application_set_application_id(long _self, long application_id);
        void g_application_set_application_id(long _self, String application_id);
        void g_application_set_default(long _self);
        void g_application_set_flags(long _self, int flags);
        void g_application_set_inactivity_timeout(long _self, int inactivity_timeout);
        void g_application_set_option_context_description(long _self, long description);
        void g_application_set_option_context_description(long _self, String description);
        void g_application_set_option_context_parameter_string(long _self, long parameter_string);
        void g_application_set_option_context_parameter_string(long _self, String parameter_string);
        void g_application_set_option_context_summary(long _self, long summary);
        void g_application_set_option_context_summary(long _self, String summary);
        void g_application_set_resource_base_path(long _self, long resource_path);
        void g_application_set_resource_base_path(long _self, String resource_path);
        void g_application_unbind_busy_property(long _self, long object, long property);
        void g_application_unbind_busy_property(long _self, long object, String property);
        void g_application_unmark_busy(long _self);
        void g_application_withdraw_notification(long _self, long id);
        void g_application_withdraw_notification(long _self, String id);
        long g_application_get_default();
        boolean g_application_id_is_valid(long application_id);
        long g_application_get_type();
    }

}
