/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPageSetup {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_page_setup_new();
        long gtk_page_setup_new_from_file(long file_name, long _error);
        long gtk_page_setup_new_from_file(String file_name, long _error);
        long gtk_page_setup_new_from_gvariant(long variant);
        long gtk_page_setup_new_from_key_file(long key_file, long group_name, long _error);
        long gtk_page_setup_new_from_key_file(long key_file, String group_name, long _error);
        long gtk_page_setup_copy(long _self);
        double gtk_page_setup_get_bottom_margin(long _self, int unit);
        double gtk_page_setup_get_left_margin(long _self, int unit);
        int gtk_page_setup_get_orientation(long _self);
        double gtk_page_setup_get_page_height(long _self, int unit);
        double gtk_page_setup_get_page_width(long _self, int unit);
        double gtk_page_setup_get_paper_height(long _self, int unit);
        long gtk_page_setup_get_paper_size(long _self);
        double gtk_page_setup_get_paper_width(long _self, int unit);
        double gtk_page_setup_get_right_margin(long _self, int unit);
        double gtk_page_setup_get_top_margin(long _self, int unit);
        boolean gtk_page_setup_load_file(long _self, long file_name, long _error);
        boolean gtk_page_setup_load_file(long _self, String file_name, long _error);
        boolean gtk_page_setup_load_key_file(long _self, long key_file, long group_name, long _error);
        boolean gtk_page_setup_load_key_file(long _self, long key_file, String group_name, long _error);
        void gtk_page_setup_set_bottom_margin(long _self, double margin, int unit);
        void gtk_page_setup_set_left_margin(long _self, double margin, int unit);
        void gtk_page_setup_set_orientation(long _self, int orientation);
        void gtk_page_setup_set_paper_size(long _self, long size);
        void gtk_page_setup_set_paper_size_and_default_margins(long _self, long size);
        void gtk_page_setup_set_right_margin(long _self, double margin, int unit);
        void gtk_page_setup_set_top_margin(long _self, double margin, int unit);
        boolean gtk_page_setup_to_file(long _self, long file_name, long _error);
        boolean gtk_page_setup_to_file(long _self, String file_name, long _error);
        long gtk_page_setup_to_gvariant(long _self);
        void gtk_page_setup_to_key_file(long _self, long key_file, long group_name);
        void gtk_page_setup_to_key_file(long _self, long key_file, String group_name);
        long gtk_page_setup_get_type();
    }

}
