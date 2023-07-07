/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaActionable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_actionable_get_action_name(long _self);
        long gtk_actionable_get_action_target_value(long _self);
        void gtk_actionable_set_action_name(long _self, long action_name);
        void gtk_actionable_set_action_name(long _self, String action_name);
        void gtk_actionable_set_action_target(long _self, long format_string, java.lang.Object... _elipse);
        void gtk_actionable_set_action_target(long _self, String format_string, java.lang.Object... _elipse);
        void gtk_actionable_set_action_target_value(long _self, long target_value);
        void gtk_actionable_set_detailed_action_name(long _self, long detailed_action_name);
        void gtk_actionable_set_detailed_action_name(long _self, String detailed_action_name);
        long gtk_actionable_get_type();
    }

}
