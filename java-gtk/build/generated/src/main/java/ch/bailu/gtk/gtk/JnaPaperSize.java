/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPaperSize {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_paper_size_new(long name);
        long gtk_paper_size_new(String name);
        long gtk_paper_size_new_custom(long name, long display_name, double width, double height, int unit);
        long gtk_paper_size_new_custom(String name, String display_name, double width, double height, int unit);
        long gtk_paper_size_new_from_gvariant(long variant);
        long gtk_paper_size_new_from_ipp(long ipp_name, double width, double height);
        long gtk_paper_size_new_from_ipp(String ipp_name, double width, double height);
        long gtk_paper_size_new_from_key_file(long key_file, long group_name, long _error);
        long gtk_paper_size_new_from_key_file(long key_file, String group_name, long _error);
        long gtk_paper_size_new_from_ppd(long ppd_name, long ppd_display_name, double width, double height);
        long gtk_paper_size_new_from_ppd(String ppd_name, String ppd_display_name, double width, double height);
        long gtk_paper_size_copy(long _self);
        void gtk_paper_size_free(long _self);
        double gtk_paper_size_get_default_bottom_margin(long _self, int unit);
        double gtk_paper_size_get_default_left_margin(long _self, int unit);
        double gtk_paper_size_get_default_right_margin(long _self, int unit);
        double gtk_paper_size_get_default_top_margin(long _self, int unit);
        long gtk_paper_size_get_display_name(long _self);
        double gtk_paper_size_get_height(long _self, int unit);
        long gtk_paper_size_get_name(long _self);
        long gtk_paper_size_get_ppd_name(long _self);
        double gtk_paper_size_get_width(long _self, int unit);
        boolean gtk_paper_size_is_custom(long _self);
        boolean gtk_paper_size_is_equal(long _self, long size2);
        boolean gtk_paper_size_is_ipp(long _self);
        void gtk_paper_size_set_size(long _self, double width, double height, int unit);
        long gtk_paper_size_to_gvariant(long _self);
        void gtk_paper_size_to_key_file(long _self, long key_file, long group_name);
        void gtk_paper_size_to_key_file(long _self, long key_file, String group_name);
        long gtk_paper_size_get_default();
        long gtk_paper_size_get_paper_sizes(boolean include_custom);
        long gtk_paper_size_get_type();
    }

}
