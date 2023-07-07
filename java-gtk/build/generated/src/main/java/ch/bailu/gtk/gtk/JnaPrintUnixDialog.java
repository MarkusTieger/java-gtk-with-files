/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintUnixDialog {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_print_unix_dialog_new(long title, long parent);
        long gtk_print_unix_dialog_new(String title, long parent);
        void gtk_print_unix_dialog_add_custom_tab(long _self, long child, long tab_label);
        int gtk_print_unix_dialog_get_current_page(long _self);
        boolean gtk_print_unix_dialog_get_embed_page_setup(long _self);
        boolean gtk_print_unix_dialog_get_has_selection(long _self);
        int gtk_print_unix_dialog_get_manual_capabilities(long _self);
        long gtk_print_unix_dialog_get_page_setup(long _self);
        boolean gtk_print_unix_dialog_get_page_setup_set(long _self);
        long gtk_print_unix_dialog_get_selected_printer(long _self);
        boolean gtk_print_unix_dialog_get_support_selection(long _self);
        void gtk_print_unix_dialog_set_current_page(long _self, int current_page);
        void gtk_print_unix_dialog_set_embed_page_setup(long _self, boolean embed);
        void gtk_print_unix_dialog_set_has_selection(long _self, boolean has_selection);
        void gtk_print_unix_dialog_set_manual_capabilities(long _self, int capabilities);
        void gtk_print_unix_dialog_set_page_setup(long _self, long page_setup);
        void gtk_print_unix_dialog_set_settings(long _self, long settings);
        void gtk_print_unix_dialog_set_support_selection(long _self, boolean support_selection);
        long gtk_print_unix_dialog_get_type();
    }

}
