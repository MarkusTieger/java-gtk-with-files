/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPageSetupUnixDialog {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_page_setup_unix_dialog_new(long title, long parent);
        long gtk_page_setup_unix_dialog_new(String title, long parent);
        long gtk_page_setup_unix_dialog_get_page_setup(long _self);
        long gtk_page_setup_unix_dialog_get_print_settings(long _self);
        void gtk_page_setup_unix_dialog_set_page_setup(long _self, long page_setup);
        void gtk_page_setup_unix_dialog_set_print_settings(long _self, long print_settings);
        long gtk_page_setup_unix_dialog_get_type();
    }

}
