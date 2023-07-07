/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaPango {

    @FunctionalInterface
    public interface OnAttrDataCopyFunc extends com.sun.jna.Callback {
        long invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_attr_allow_breaks_new(boolean allow_breaks);
        long pango_attr_background_alpha_new(int alpha);
        long pango_attr_background_new(int red, int green, int blue);
        long pango_attr_baseline_shift_new(int shift);
        long pango_attr_fallback_new(boolean enable_fallback);
        long pango_attr_family_new(long family);
        long pango_attr_font_desc_new(long desc);
        long pango_attr_font_features_new(long features);
        long pango_attr_font_scale_new(int scale);
        long pango_attr_foreground_alpha_new(int alpha);
        long pango_attr_foreground_new(int red, int green, int blue);
        long pango_attr_gravity_hint_new(int hint);
        long pango_attr_gravity_new(int gravity);
        long pango_attr_insert_hyphens_new(boolean insert_hyphens);
        long pango_attr_language_new(long language);
        long pango_attr_letter_spacing_new(int letter_spacing);
        long pango_attr_line_height_new(double factor);
        long pango_attr_line_height_new_absolute(int height);
        long pango_attr_list_from_string(long text);
        long pango_attr_overline_color_new(int red, int green, int blue);
        long pango_attr_overline_new(int overline);
        long pango_attr_rise_new(int rise);
        long pango_attr_scale_new(double scale_factor);
        long pango_attr_sentence_new();
        long pango_attr_shape_new(long ink_rect, long logical_rect);
        long pango_attr_shape_new_with_data(long ink_rect, long logical_rect, long data, com.sun.jna.Callback copy_func, com.sun.jna.Callback destroy_func);
        long pango_attr_show_new(int flags);
        long pango_attr_size_new(int size);
        long pango_attr_size_new_absolute(int size);
        long pango_attr_stretch_new(int stretch);
        long pango_attr_strikethrough_color_new(int red, int green, int blue);
        long pango_attr_strikethrough_new(boolean strikethrough);
        long pango_attr_style_new(int style);
        long pango_attr_text_transform_new(int transform);
        long pango_attr_type_get_name(int type);
        int pango_attr_type_register(long name);
        long pango_attr_underline_color_new(int red, int green, int blue);
        long pango_attr_underline_new(int underline);
        long pango_attr_variant_new(int variant);
        long pango_attr_weight_new(int weight);
        long pango_attr_word_new();
        int pango_bidi_type_for_unichar(byte ch);
        void pango_default_break(long text, int length, long analysis, long attrs, int attrs_len);
        void pango_extents_to_pixels(long inclusive, long nearest);
        int pango_find_base_dir(long text, int length);
        void pango_find_paragraph_boundary(long text, int length, long paragraph_delimiter_index, long next_paragraph_start);
        long pango_font_description_from_string(long str);
        int pango_gravity_get_for_matrix(long matrix);
        int pango_gravity_get_for_script(int script, int base_gravity, int hint);
        int pango_gravity_get_for_script_and_width(int script, boolean wide, int base_gravity, int hint);
        double pango_gravity_to_rotation(int gravity);
        boolean pango_is_zero_width(byte ch);
        long pango_itemize(long context, long text, int start_index, int length, long attrs, long cached_iter);
        long pango_itemize_with_base_dir(long context, int base_dir, long text, int start_index, int length, long attrs, long cached_iter);
        long pango_language_from_string(long language);
        long pango_language_get_default();
        int pango_layout_deserialize_error_quark();
        long pango_markup_parser_new(byte accel_marker);
        boolean pango_parse_stretch(long str, long stretch, boolean warn);
        boolean pango_parse_style(long str, long style, boolean warn);
        boolean pango_parse_variant(long str, long variant, boolean warn);
        boolean pango_parse_weight(long str, long weight, boolean warn);
        void pango_quantize_line_geometry(long thickness, long position);
        long pango_reorder_items(long items);
        long pango_script_get_sample_language(int script);
        void pango_shape(long text, int length, long analysis, long glyphs);
        void pango_shape_full(long item_text, int item_length, long paragraph_text, int paragraph_length, long analysis, long glyphs);
        void pango_shape_item(long item, long paragraph_text, int paragraph_length, long log_attrs, long glyphs, int flags);
        void pango_shape_with_flags(long item_text, int item_length, long paragraph_text, int paragraph_length, long analysis, long glyphs, int flags);
        long pango_tab_array_from_string(long text);
        int pango_unichar_direction(byte ch);
        int pango_units_from_double(double d);
        double pango_units_to_double(int i);
        int pango_version();
        long pango_version_check(int required_major, int required_minor, int required_micro);
        long pango_version_string();
    }

}
