/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintSettings {

    @FunctionalInterface
    public interface OnPrintSettingsFunc extends com.sun.jna.Callback {
        void invoke(long key, long value, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_print_settings_new();
        long gtk_print_settings_new_from_file(long file_name, long _error);
        long gtk_print_settings_new_from_file(String file_name, long _error);
        long gtk_print_settings_new_from_gvariant(long variant);
        long gtk_print_settings_new_from_key_file(long key_file, long group_name, long _error);
        long gtk_print_settings_new_from_key_file(long key_file, String group_name, long _error);
        long gtk_print_settings_copy(long _self);
        void gtk_print_settings_foreach(long _self, com.sun.jna.Callback func, long user_data);
        long gtk_print_settings_get(long _self, long key);
        long gtk_print_settings_get(long _self, String key);
        boolean gtk_print_settings_get_bool(long _self, long key);
        boolean gtk_print_settings_get_bool(long _self, String key);
        boolean gtk_print_settings_get_collate(long _self);
        long gtk_print_settings_get_default_source(long _self);
        long gtk_print_settings_get_dither(long _self);
        double gtk_print_settings_get_double(long _self, long key);
        double gtk_print_settings_get_double(long _self, String key);
        double gtk_print_settings_get_double_with_default(long _self, long key, double def);
        double gtk_print_settings_get_double_with_default(long _self, String key, double def);
        int gtk_print_settings_get_duplex(long _self);
        long gtk_print_settings_get_finishings(long _self);
        int gtk_print_settings_get_int(long _self, long key);
        int gtk_print_settings_get_int(long _self, String key);
        int gtk_print_settings_get_int_with_default(long _self, long key, int def);
        int gtk_print_settings_get_int_with_default(long _self, String key, int def);
        double gtk_print_settings_get_length(long _self, long key, int unit);
        double gtk_print_settings_get_length(long _self, String key, int unit);
        long gtk_print_settings_get_media_type(long _self);
        int gtk_print_settings_get_n_copies(long _self);
        int gtk_print_settings_get_number_up(long _self);
        int gtk_print_settings_get_number_up_layout(long _self);
        int gtk_print_settings_get_orientation(long _self);
        long gtk_print_settings_get_output_bin(long _self);
        int gtk_print_settings_get_page_set(long _self);
        double gtk_print_settings_get_paper_height(long _self, int unit);
        long gtk_print_settings_get_paper_size(long _self);
        double gtk_print_settings_get_paper_width(long _self, int unit);
        int gtk_print_settings_get_print_pages(long _self);
        long gtk_print_settings_get_printer(long _self);
        double gtk_print_settings_get_printer_lpi(long _self);
        int gtk_print_settings_get_quality(long _self);
        int gtk_print_settings_get_resolution(long _self);
        int gtk_print_settings_get_resolution_x(long _self);
        int gtk_print_settings_get_resolution_y(long _self);
        boolean gtk_print_settings_get_reverse(long _self);
        double gtk_print_settings_get_scale(long _self);
        boolean gtk_print_settings_get_use_color(long _self);
        boolean gtk_print_settings_has_key(long _self, long key);
        boolean gtk_print_settings_has_key(long _self, String key);
        boolean gtk_print_settings_load_file(long _self, long file_name, long _error);
        boolean gtk_print_settings_load_file(long _self, String file_name, long _error);
        boolean gtk_print_settings_load_key_file(long _self, long key_file, long group_name, long _error);
        boolean gtk_print_settings_load_key_file(long _self, long key_file, String group_name, long _error);
        void gtk_print_settings_set(long _self, long key, long value);
        void gtk_print_settings_set(long _self, String key, String value);
        void gtk_print_settings_set_bool(long _self, long key, boolean value);
        void gtk_print_settings_set_bool(long _self, String key, boolean value);
        void gtk_print_settings_set_collate(long _self, boolean collate);
        void gtk_print_settings_set_default_source(long _self, long default_source);
        void gtk_print_settings_set_default_source(long _self, String default_source);
        void gtk_print_settings_set_dither(long _self, long dither);
        void gtk_print_settings_set_dither(long _self, String dither);
        void gtk_print_settings_set_double(long _self, long key, double value);
        void gtk_print_settings_set_double(long _self, String key, double value);
        void gtk_print_settings_set_duplex(long _self, int duplex);
        void gtk_print_settings_set_finishings(long _self, long finishings);
        void gtk_print_settings_set_finishings(long _self, String finishings);
        void gtk_print_settings_set_int(long _self, long key, int value);
        void gtk_print_settings_set_int(long _self, String key, int value);
        void gtk_print_settings_set_length(long _self, long key, double value, int unit);
        void gtk_print_settings_set_length(long _self, String key, double value, int unit);
        void gtk_print_settings_set_media_type(long _self, long media_type);
        void gtk_print_settings_set_media_type(long _self, String media_type);
        void gtk_print_settings_set_n_copies(long _self, int num_copies);
        void gtk_print_settings_set_number_up(long _self, int number_up);
        void gtk_print_settings_set_number_up_layout(long _self, int number_up_layout);
        void gtk_print_settings_set_orientation(long _self, int orientation);
        void gtk_print_settings_set_output_bin(long _self, long output_bin);
        void gtk_print_settings_set_output_bin(long _self, String output_bin);
        void gtk_print_settings_set_page_set(long _self, int page_set);
        void gtk_print_settings_set_paper_height(long _self, double height, int unit);
        void gtk_print_settings_set_paper_size(long _self, long paper_size);
        void gtk_print_settings_set_paper_width(long _self, double width, int unit);
        void gtk_print_settings_set_print_pages(long _self, int pages);
        void gtk_print_settings_set_printer(long _self, long printer);
        void gtk_print_settings_set_printer(long _self, String printer);
        void gtk_print_settings_set_printer_lpi(long _self, double lpi);
        void gtk_print_settings_set_quality(long _self, int quality);
        void gtk_print_settings_set_resolution(long _self, int resolution);
        void gtk_print_settings_set_resolution_xy(long _self, int resolution_x, int resolution_y);
        void gtk_print_settings_set_reverse(long _self, boolean reverse);
        void gtk_print_settings_set_scale(long _self, double scale);
        void gtk_print_settings_set_use_color(long _self, boolean use_color);
        boolean gtk_print_settings_to_file(long _self, long file_name, long _error);
        boolean gtk_print_settings_to_file(long _self, String file_name, long _error);
        long gtk_print_settings_to_gvariant(long _self);
        void gtk_print_settings_to_key_file(long _self, long key_file, long group_name);
        void gtk_print_settings_to_key_file(long _self, long key_file, String group_name);
        void gtk_print_settings_unset(long _self, long key);
        void gtk_print_settings_unset(long _self, String key);
        long gtk_print_settings_get_type();
    }

}
