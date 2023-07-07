/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAppChooserDialog {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_app_chooser_dialog_new(long parent, int flags, long file);
        long gtk_app_chooser_dialog_new_for_content_type(long parent, int flags, long content_type);
        long gtk_app_chooser_dialog_new_for_content_type(long parent, int flags, String content_type);
        long gtk_app_chooser_dialog_get_heading(long _self);
        long gtk_app_chooser_dialog_get_widget(long _self);
        void gtk_app_chooser_dialog_set_heading(long _self, long heading);
        void gtk_app_chooser_dialog_set_heading(long _self, String heading);
        long gtk_app_chooser_dialog_get_type();
    }

}
