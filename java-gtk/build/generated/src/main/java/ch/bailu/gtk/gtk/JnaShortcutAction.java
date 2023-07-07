/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaShortcutAction {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_shortcut_action_parse_string(long string);
        long gtk_shortcut_action_parse_string(String string);
        boolean gtk_shortcut_action_activate(long _self, int flags, long widget, long args);
        void gtk_shortcut_action_print(long _self, long string);
        long gtk_shortcut_action_to_string(long _self);
        long gtk_shortcut_action_get_type();
    }

}
