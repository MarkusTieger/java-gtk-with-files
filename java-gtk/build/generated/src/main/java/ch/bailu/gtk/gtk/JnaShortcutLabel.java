/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaShortcutLabel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_shortcut_label_new(long accelerator);
        long gtk_shortcut_label_new(String accelerator);
        long gtk_shortcut_label_get_accelerator(long _self);
        long gtk_shortcut_label_get_disabled_text(long _self);
        void gtk_shortcut_label_set_accelerator(long _self, long accelerator);
        void gtk_shortcut_label_set_accelerator(long _self, String accelerator);
        void gtk_shortcut_label_set_disabled_text(long _self, long disabled_text);
        void gtk_shortcut_label_set_disabled_text(long _self, String disabled_text);
        long gtk_shortcut_label_get_type();
    }

}
