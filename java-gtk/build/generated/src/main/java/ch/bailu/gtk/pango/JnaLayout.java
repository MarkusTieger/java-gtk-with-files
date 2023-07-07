/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_layout_new(long context);
        void pango_layout_context_changed(long _self);
        long pango_layout_copy(long _self);
        int pango_layout_get_alignment(long _self);
        long pango_layout_get_attributes(long _self);
        boolean pango_layout_get_auto_dir(long _self);
        int pango_layout_get_baseline(long _self);
        void pango_layout_get_caret_pos(long _self, int index_, long strong_pos, long weak_pos);
        int pango_layout_get_character_count(long _self);
        long pango_layout_get_context(long _self);
        void pango_layout_get_cursor_pos(long _self, int index_, long strong_pos, long weak_pos);
        int pango_layout_get_direction(long _self, int index);
        int pango_layout_get_ellipsize(long _self);
        void pango_layout_get_extents(long _self, long ink_rect, long logical_rect);
        long pango_layout_get_font_description(long _self);
        int pango_layout_get_height(long _self);
        int pango_layout_get_indent(long _self);
        long pango_layout_get_iter(long _self);
        boolean pango_layout_get_justify(long _self);
        boolean pango_layout_get_justify_last_line(long _self);
        long pango_layout_get_line(long _self, int line);
        int pango_layout_get_line_count(long _self);
        long pango_layout_get_line_readonly(long _self, int line);
        float pango_layout_get_line_spacing(long _self);
        long pango_layout_get_lines(long _self);
        long pango_layout_get_lines_readonly(long _self);
        void pango_layout_get_pixel_extents(long _self, long ink_rect, long logical_rect);
        void pango_layout_get_pixel_size(long _self, long width, long height);
        int pango_layout_get_serial(long _self);
        boolean pango_layout_get_single_paragraph_mode(long _self);
        void pango_layout_get_size(long _self, long width, long height);
        int pango_layout_get_spacing(long _self);
        long pango_layout_get_tabs(long _self);
        long pango_layout_get_text(long _self);
        int pango_layout_get_unknown_glyphs_count(long _self);
        int pango_layout_get_width(long _self);
        int pango_layout_get_wrap(long _self);
        void pango_layout_index_to_line_x(long _self, int index_, boolean trailing, long line, long x_pos);
        void pango_layout_index_to_pos(long _self, int index_, long pos);
        boolean pango_layout_is_ellipsized(long _self);
        boolean pango_layout_is_wrapped(long _self);
        void pango_layout_move_cursor_visually(long _self, boolean strong, int old_index, int old_trailing, int direction, long new_index, long new_trailing);
        long pango_layout_serialize(long _self, int flags);
        void pango_layout_set_alignment(long _self, int alignment);
        void pango_layout_set_attributes(long _self, long attrs);
        void pango_layout_set_auto_dir(long _self, boolean auto_dir);
        void pango_layout_set_ellipsize(long _self, int ellipsize);
        void pango_layout_set_font_description(long _self, long desc);
        void pango_layout_set_height(long _self, int height);
        void pango_layout_set_indent(long _self, int indent);
        void pango_layout_set_justify(long _self, boolean justify);
        void pango_layout_set_justify_last_line(long _self, boolean justify);
        void pango_layout_set_line_spacing(long _self, float factor);
        void pango_layout_set_markup(long _self, long markup, int length);
        void pango_layout_set_markup(long _self, String markup, int length);
        void pango_layout_set_single_paragraph_mode(long _self, boolean setting);
        void pango_layout_set_spacing(long _self, int spacing);
        void pango_layout_set_tabs(long _self, long tabs);
        void pango_layout_set_text(long _self, long text, int length);
        void pango_layout_set_text(long _self, String text, int length);
        void pango_layout_set_width(long _self, int width);
        void pango_layout_set_wrap(long _self, int wrap);
        boolean pango_layout_write_to_file(long _self, int flags, long filename, long _error);
        boolean pango_layout_write_to_file(long _self, int flags, String filename, long _error);
        boolean pango_layout_xy_to_index(long _self, int x, int y, long index_, long trailing);
        long pango_layout_deserialize(long context, long bytes, int flags, long _error);
        long pango_layout_get_type();
    }

}
