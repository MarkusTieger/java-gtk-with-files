/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaApplication {

    @FunctionalInterface
    public interface OnQueryEnd extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnWindowAdded extends com.sun.jna.Callback {
        void invoke(long _self, long window, long _data);
    }

    @FunctionalInterface
    public interface OnWindowRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long window, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_application_new(long application_id, int flags);
        long gtk_application_new(String application_id, int flags);
        void gtk_application_add_window(long _self, long window);
        long gtk_application_get_accels_for_action(long _self, long detailed_action_name);
        long gtk_application_get_accels_for_action(long _self, String detailed_action_name);
        long gtk_application_get_actions_for_accel(long _self, long accel);
        long gtk_application_get_actions_for_accel(long _self, String accel);
        long gtk_application_get_active_window(long _self);
        long gtk_application_get_menu_by_id(long _self, long id);
        long gtk_application_get_menu_by_id(long _self, String id);
        long gtk_application_get_menubar(long _self);
        long gtk_application_get_window_by_id(long _self, int id);
        long gtk_application_get_windows(long _self);
        int gtk_application_inhibit(long _self, long window, int flags, long reason);
        int gtk_application_inhibit(long _self, long window, int flags, String reason);
        long gtk_application_list_action_descriptions(long _self);
        void gtk_application_remove_window(long _self, long window);
        void gtk_application_set_accels_for_action(long _self, long detailed_action_name, long accels);
        void gtk_application_set_accels_for_action(long _self, String detailed_action_name, long accels);
        void gtk_application_set_menubar(long _self, long menubar);
        void gtk_application_uninhibit(long _self, int cookie);
        long gtk_application_get_type();
    }

}
