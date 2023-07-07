/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaActionMap {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_action_map_add_action(long _self, long action);
        long g_action_map_lookup_action(long _self, long action_name);
        long g_action_map_lookup_action(long _self, String action_name);
        void g_action_map_remove_action(long _self, long action_name);
        void g_action_map_remove_action(long _self, String action_name);
        long g_action_map_get_type();
    }

}
