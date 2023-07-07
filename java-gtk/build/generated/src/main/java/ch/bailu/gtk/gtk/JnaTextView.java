/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextView {

    @FunctionalInterface
    public interface OnBackspace extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCopyClipboard extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCutClipboard extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDeleteFromCursor extends com.sun.jna.Callback {
        void invoke(long _self, int type, int count, long _data);
    }

    @FunctionalInterface
    public interface OnExtendSelection extends com.sun.jna.Callback {
        boolean invoke(long _self, int granularity, long location, long start, long end, long _data);
    }

    @FunctionalInterface
    public interface OnInsertAtCursor extends com.sun.jna.Callback {
        void invoke(long _self, long string, long _data);
    }

    @FunctionalInterface
    public interface OnInsertEmoji extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        void invoke(long _self, int step, int count, boolean extend_selection, long _data);
    }

    @FunctionalInterface
    public interface OnMoveViewport extends com.sun.jna.Callback {
        void invoke(long _self, int step, int count, long _data);
    }

    @FunctionalInterface
    public interface OnPasteClipboard extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPreeditChanged extends com.sun.jna.Callback {
        void invoke(long _self, long preedit, long _data);
    }

    @FunctionalInterface
    public interface OnSelectAll extends com.sun.jna.Callback {
        void invoke(long _self, boolean select, long _data);
    }

    @FunctionalInterface
    public interface OnSetAnchor extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnToggleCursorVisible extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnToggleOverwrite extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_text_view_new();
        long gtk_text_view_new_with_buffer(long buffer);
        void gtk_text_view_add_child_at_anchor(long _self, long child, long anchor);
        void gtk_text_view_add_overlay(long _self, long child, int xpos, int ypos);
        boolean gtk_text_view_backward_display_line(long _self, long iter);
        boolean gtk_text_view_backward_display_line_start(long _self, long iter);
        void gtk_text_view_buffer_to_window_coords(long _self, int win, int buffer_x, int buffer_y, long window_x, long window_y);
        boolean gtk_text_view_forward_display_line(long _self, long iter);
        boolean gtk_text_view_forward_display_line_end(long _self, long iter);
        boolean gtk_text_view_get_accepts_tab(long _self);
        int gtk_text_view_get_bottom_margin(long _self);
        long gtk_text_view_get_buffer(long _self);
        void gtk_text_view_get_cursor_locations(long _self, long iter, long strong, long weak);
        boolean gtk_text_view_get_cursor_visible(long _self);
        boolean gtk_text_view_get_editable(long _self);
        long gtk_text_view_get_extra_menu(long _self);
        long gtk_text_view_get_gutter(long _self, int win);
        int gtk_text_view_get_indent(long _self);
        int gtk_text_view_get_input_hints(long _self);
        int gtk_text_view_get_input_purpose(long _self);
        boolean gtk_text_view_get_iter_at_location(long _self, long iter, int x, int y);
        boolean gtk_text_view_get_iter_at_position(long _self, long iter, long trailing, int x, int y);
        void gtk_text_view_get_iter_location(long _self, long iter, long location);
        int gtk_text_view_get_justification(long _self);
        int gtk_text_view_get_left_margin(long _self);
        void gtk_text_view_get_line_at_y(long _self, long target_iter, int y, long line_top);
        void gtk_text_view_get_line_yrange(long _self, long iter, long y, long height);
        long gtk_text_view_get_ltr_context(long _self);
        boolean gtk_text_view_get_monospace(long _self);
        boolean gtk_text_view_get_overwrite(long _self);
        int gtk_text_view_get_pixels_above_lines(long _self);
        int gtk_text_view_get_pixels_below_lines(long _self);
        int gtk_text_view_get_pixels_inside_wrap(long _self);
        int gtk_text_view_get_right_margin(long _self);
        long gtk_text_view_get_rtl_context(long _self);
        long gtk_text_view_get_tabs(long _self);
        int gtk_text_view_get_top_margin(long _self);
        void gtk_text_view_get_visible_rect(long _self, long visible_rect);
        int gtk_text_view_get_wrap_mode(long _self);
        boolean gtk_text_view_im_context_filter_keypress(long _self, long event);
        boolean gtk_text_view_move_mark_onscreen(long _self, long mark);
        void gtk_text_view_move_overlay(long _self, long child, int xpos, int ypos);
        boolean gtk_text_view_move_visually(long _self, long iter, int count);
        boolean gtk_text_view_place_cursor_onscreen(long _self);
        void gtk_text_view_remove(long _self, long child);
        void gtk_text_view_reset_cursor_blink(long _self);
        void gtk_text_view_reset_im_context(long _self);
        void gtk_text_view_scroll_mark_onscreen(long _self, long mark);
        boolean gtk_text_view_scroll_to_iter(long _self, long iter, double within_margin, boolean use_align, double xalign, double yalign);
        void gtk_text_view_scroll_to_mark(long _self, long mark, double within_margin, boolean use_align, double xalign, double yalign);
        void gtk_text_view_set_accepts_tab(long _self, boolean accepts_tab);
        void gtk_text_view_set_bottom_margin(long _self, int bottom_margin);
        void gtk_text_view_set_buffer(long _self, long buffer);
        void gtk_text_view_set_cursor_visible(long _self, boolean setting);
        void gtk_text_view_set_editable(long _self, boolean setting);
        void gtk_text_view_set_extra_menu(long _self, long model);
        void gtk_text_view_set_gutter(long _self, int win, long widget);
        void gtk_text_view_set_indent(long _self, int indent);
        void gtk_text_view_set_input_hints(long _self, int hints);
        void gtk_text_view_set_input_purpose(long _self, int purpose);
        void gtk_text_view_set_justification(long _self, int justification);
        void gtk_text_view_set_left_margin(long _self, int left_margin);
        void gtk_text_view_set_monospace(long _self, boolean monospace);
        void gtk_text_view_set_overwrite(long _self, boolean overwrite);
        void gtk_text_view_set_pixels_above_lines(long _self, int pixels_above_lines);
        void gtk_text_view_set_pixels_below_lines(long _self, int pixels_below_lines);
        void gtk_text_view_set_pixels_inside_wrap(long _self, int pixels_inside_wrap);
        void gtk_text_view_set_right_margin(long _self, int right_margin);
        void gtk_text_view_set_tabs(long _self, long tabs);
        void gtk_text_view_set_top_margin(long _self, int top_margin);
        void gtk_text_view_set_wrap_mode(long _self, int wrap_mode);
        boolean gtk_text_view_starts_display_line(long _self, long iter);
        void gtk_text_view_window_to_buffer_coords(long _self, int win, int window_x, int window_y, long buffer_x, long buffer_y);
        long gtk_text_view_get_type();
    }

}
