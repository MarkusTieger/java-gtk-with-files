/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaLabel {

    @FunctionalInterface
    public interface OnActivateCurrentLink extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnActivateLink extends com.sun.jna.Callback {
        boolean invoke(long _self, long uri, long _data);
    }

    @FunctionalInterface
    public interface OnCopyClipboard extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        void invoke(long _self, int step, int count, boolean extend_selection, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_label_new(long str);
        long gtk_label_new(String str);
        long gtk_label_new_with_mnemonic(long str);
        long gtk_label_new_with_mnemonic(String str);
        long gtk_label_get_attributes(long _self);
        long gtk_label_get_current_uri(long _self);
        int gtk_label_get_ellipsize(long _self);
        long gtk_label_get_extra_menu(long _self);
        int gtk_label_get_justify(long _self);
        long gtk_label_get_label(long _self);
        long gtk_label_get_layout(long _self);
        void gtk_label_get_layout_offsets(long _self, long x, long y);
        int gtk_label_get_lines(long _self);
        int gtk_label_get_max_width_chars(long _self);
        int gtk_label_get_mnemonic_keyval(long _self);
        long gtk_label_get_mnemonic_widget(long _self);
        int gtk_label_get_natural_wrap_mode(long _self);
        boolean gtk_label_get_selectable(long _self);
        boolean gtk_label_get_selection_bounds(long _self, long start, long end);
        boolean gtk_label_get_single_line_mode(long _self);
        long gtk_label_get_tabs(long _self);
        long gtk_label_get_text(long _self);
        boolean gtk_label_get_use_markup(long _self);
        boolean gtk_label_get_use_underline(long _self);
        int gtk_label_get_width_chars(long _self);
        boolean gtk_label_get_wrap(long _self);
        int gtk_label_get_wrap_mode(long _self);
        float gtk_label_get_xalign(long _self);
        float gtk_label_get_yalign(long _self);
        void gtk_label_select_region(long _self, int start_offset, int end_offset);
        void gtk_label_set_attributes(long _self, long attrs);
        void gtk_label_set_ellipsize(long _self, int mode);
        void gtk_label_set_extra_menu(long _self, long model);
        void gtk_label_set_justify(long _self, int jtype);
        void gtk_label_set_label(long _self, long str);
        void gtk_label_set_label(long _self, String str);
        void gtk_label_set_lines(long _self, int lines);
        void gtk_label_set_markup(long _self, long str);
        void gtk_label_set_markup(long _self, String str);
        void gtk_label_set_markup_with_mnemonic(long _self, long str);
        void gtk_label_set_markup_with_mnemonic(long _self, String str);
        void gtk_label_set_max_width_chars(long _self, int n_chars);
        void gtk_label_set_mnemonic_widget(long _self, long widget);
        void gtk_label_set_natural_wrap_mode(long _self, int wrap_mode);
        void gtk_label_set_selectable(long _self, boolean setting);
        void gtk_label_set_single_line_mode(long _self, boolean single_line_mode);
        void gtk_label_set_tabs(long _self, long tabs);
        void gtk_label_set_text(long _self, long str);
        void gtk_label_set_text(long _self, String str);
        void gtk_label_set_text_with_mnemonic(long _self, long str);
        void gtk_label_set_text_with_mnemonic(long _self, String str);
        void gtk_label_set_use_markup(long _self, boolean setting);
        void gtk_label_set_use_underline(long _self, boolean setting);
        void gtk_label_set_width_chars(long _self, int n_chars);
        void gtk_label_set_wrap(long _self, boolean wrap);
        void gtk_label_set_wrap_mode(long _self, int wrap_mode);
        void gtk_label_set_xalign(long _self, float xalign);
        void gtk_label_set_yalign(long _self, float yalign);
        long gtk_label_get_type();
    }

}
