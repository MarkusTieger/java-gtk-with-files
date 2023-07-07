/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaRemoteActionGroup {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_remote_action_group_activate_action_full(long _self, long action_name, long parameter, long platform_data);
        void g_remote_action_group_activate_action_full(long _self, String action_name, long parameter, long platform_data);
        void g_remote_action_group_change_action_state_full(long _self, long action_name, long value, long platform_data);
        void g_remote_action_group_change_action_state_full(long _self, String action_name, long value, long platform_data);
        long g_remote_action_group_get_type();
    }

}
