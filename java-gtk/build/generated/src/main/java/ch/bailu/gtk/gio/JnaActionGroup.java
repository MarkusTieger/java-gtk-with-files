/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaActionGroup {

    @FunctionalInterface
    public interface OnActionAdded extends com.sun.jna.Callback {
        void invoke(long _self, long action_name, long _data);
    }

    @FunctionalInterface
    public interface OnActionEnabledChanged extends com.sun.jna.Callback {
        void invoke(long _self, long action_name, boolean enabled, long _data);
    }

    @FunctionalInterface
    public interface OnActionRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long action_name, long _data);
    }

    @FunctionalInterface
    public interface OnActionStateChanged extends com.sun.jna.Callback {
        void invoke(long _self, long action_name, long value, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_action_group_action_added(long _self, long action_name);
        void g_action_group_action_added(long _self, String action_name);
        void g_action_group_action_enabled_changed(long _self, long action_name, boolean enabled);
        void g_action_group_action_enabled_changed(long _self, String action_name, boolean enabled);
        void g_action_group_action_removed(long _self, long action_name);
        void g_action_group_action_removed(long _self, String action_name);
        void g_action_group_action_state_changed(long _self, long action_name, long state);
        void g_action_group_action_state_changed(long _self, String action_name, long state);
        void g_action_group_activate_action(long _self, long action_name, long parameter);
        void g_action_group_activate_action(long _self, String action_name, long parameter);
        void g_action_group_change_action_state(long _self, long action_name, long value);
        void g_action_group_change_action_state(long _self, String action_name, long value);
        boolean g_action_group_get_action_enabled(long _self, long action_name);
        boolean g_action_group_get_action_enabled(long _self, String action_name);
        long g_action_group_get_action_parameter_type(long _self, long action_name);
        long g_action_group_get_action_parameter_type(long _self, String action_name);
        long g_action_group_get_action_state(long _self, long action_name);
        long g_action_group_get_action_state(long _self, String action_name);
        long g_action_group_get_action_state_hint(long _self, long action_name);
        long g_action_group_get_action_state_hint(long _self, String action_name);
        long g_action_group_get_action_state_type(long _self, long action_name);
        long g_action_group_get_action_state_type(long _self, String action_name);
        boolean g_action_group_has_action(long _self, long action_name);
        boolean g_action_group_has_action(long _self, String action_name);
        long g_action_group_get_type();
    }

}
