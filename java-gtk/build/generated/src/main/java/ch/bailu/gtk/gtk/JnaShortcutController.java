/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaShortcutController {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_shortcut_controller_new();
        long gtk_shortcut_controller_new_for_model(long model);
        void gtk_shortcut_controller_add_shortcut(long _self, long shortcut);
        int gtk_shortcut_controller_get_mnemonics_modifiers(long _self);
        int gtk_shortcut_controller_get_scope(long _self);
        void gtk_shortcut_controller_remove_shortcut(long _self, long shortcut);
        void gtk_shortcut_controller_set_mnemonics_modifiers(long _self, int modifiers);
        void gtk_shortcut_controller_set_scope(long _self, int scope);
        long gtk_shortcut_controller_get_type();
    }

}
