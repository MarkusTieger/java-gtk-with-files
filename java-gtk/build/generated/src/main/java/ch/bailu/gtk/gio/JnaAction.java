/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaAction {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_action_activate(long _self, long parameter);
        void g_action_change_state(long _self, long value);
        boolean g_action_get_enabled(long _self);
        long g_action_get_name(long _self);
        long g_action_get_parameter_type(long _self);
        long g_action_get_state(long _self);
        long g_action_get_state_hint(long _self);
        long g_action_get_state_type(long _self);
        boolean g_action_name_is_valid(long action_name);
        long g_action_print_detailed_name(long action_name, long target_value);
        long g_action_get_type();
    }

}
