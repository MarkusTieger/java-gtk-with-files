/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaShortcut {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_shortcut_new(long trigger, long action);
        long gtk_shortcut_new_with_arguments(long trigger, long action, long format_string, java.lang.Object... _elipse);
        long gtk_shortcut_new_with_arguments(long trigger, long action, String format_string, java.lang.Object... _elipse);
        long gtk_shortcut_get_action(long _self);
        long gtk_shortcut_get_arguments(long _self);
        long gtk_shortcut_get_trigger(long _self);
        void gtk_shortcut_set_action(long _self, long action);
        void gtk_shortcut_set_arguments(long _self, long args);
        void gtk_shortcut_set_trigger(long _self, long trigger);
        long gtk_shortcut_get_type();
    }

}
