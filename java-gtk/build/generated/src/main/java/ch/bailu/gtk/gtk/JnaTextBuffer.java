/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextBuffer {

    @FunctionalInterface
    public interface OnApplyTag extends com.sun.jna.Callback {
        void invoke(long _self, long tag, long start, long end, long _data);
    }

    @FunctionalInterface
    public interface OnBeginUserAction extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDeleteRange extends com.sun.jna.Callback {
        void invoke(long _self, long start, long end, long _data);
    }

    @FunctionalInterface
    public interface OnEndUserAction extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnInsertChildAnchor extends com.sun.jna.Callback {
        void invoke(long _self, long location, long anchor, long _data);
    }

    @FunctionalInterface
    public interface OnInsertPaintable extends com.sun.jna.Callback {
        void invoke(long _self, long location, long paintable, long _data);
    }

    @FunctionalInterface
    public interface OnInsertText extends com.sun.jna.Callback {
        void invoke(long _self, long location, long text, int len, long _data);
    }

    @FunctionalInterface
    public interface OnMarkDeleted extends com.sun.jna.Callback {
        void invoke(long _self, long mark, long _data);
    }

    @FunctionalInterface
    public interface OnMarkSet extends com.sun.jna.Callback {
        void invoke(long _self, long location, long mark, long _data);
    }

    @FunctionalInterface
    public interface OnModifiedChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPasteDone extends com.sun.jna.Callback {
        void invoke(long _self, long clipboard, long _data);
    }

    @FunctionalInterface
    public interface OnRedo extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnRemoveTag extends com.sun.jna.Callback {
        void invoke(long _self, long tag, long start, long end, long _data);
    }

    @FunctionalInterface
    public interface OnUndo extends com.sun.jna.Callback {
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
        long gtk_text_buffer_new(long table);
        void gtk_text_buffer_add_mark(long _self, long mark, long where);
        void gtk_text_buffer_add_selection_clipboard(long _self, long clipboard);
        void gtk_text_buffer_apply_tag(long _self, long tag, long start, long end);
        void gtk_text_buffer_apply_tag_by_name(long _self, long name, long start, long end);
        void gtk_text_buffer_apply_tag_by_name(long _self, String name, long start, long end);
        boolean gtk_text_buffer_backspace(long _self, long iter, boolean interactive, boolean default_editable);
        void gtk_text_buffer_begin_irreversible_action(long _self);
        void gtk_text_buffer_begin_user_action(long _self);
        void gtk_text_buffer_copy_clipboard(long _self, long clipboard);
        long gtk_text_buffer_create_child_anchor(long _self, long iter);
        long gtk_text_buffer_create_mark(long _self, long mark_name, long where, boolean left_gravity);
        long gtk_text_buffer_create_mark(long _self, String mark_name, long where, boolean left_gravity);
        long gtk_text_buffer_create_tag(long _self, long tag_name, long first_property_name, java.lang.Object... _elipse);
        long gtk_text_buffer_create_tag(long _self, String tag_name, String first_property_name, java.lang.Object... _elipse);
        void gtk_text_buffer_cut_clipboard(long _self, long clipboard, boolean default_editable);
        void gtk_text_buffer_delete(long _self, long start, long end);
        boolean gtk_text_buffer_delete_interactive(long _self, long start_iter, long end_iter, boolean default_editable);
        void gtk_text_buffer_delete_mark(long _self, long mark);
        void gtk_text_buffer_delete_mark_by_name(long _self, long name);
        void gtk_text_buffer_delete_mark_by_name(long _self, String name);
        boolean gtk_text_buffer_delete_selection(long _self, boolean interactive, boolean default_editable);
        void gtk_text_buffer_end_irreversible_action(long _self);
        void gtk_text_buffer_end_user_action(long _self);
        void gtk_text_buffer_get_bounds(long _self, long start, long end);
        boolean gtk_text_buffer_get_can_redo(long _self);
        boolean gtk_text_buffer_get_can_undo(long _self);
        int gtk_text_buffer_get_char_count(long _self);
        boolean gtk_text_buffer_get_enable_undo(long _self);
        void gtk_text_buffer_get_end_iter(long _self, long iter);
        boolean gtk_text_buffer_get_has_selection(long _self);
        long gtk_text_buffer_get_insert(long _self);
        void gtk_text_buffer_get_iter_at_child_anchor(long _self, long iter, long anchor);
        boolean gtk_text_buffer_get_iter_at_line(long _self, long iter, int line_number);
        boolean gtk_text_buffer_get_iter_at_line_index(long _self, long iter, int line_number, int byte_index);
        boolean gtk_text_buffer_get_iter_at_line_offset(long _self, long iter, int line_number, int char_offset);
        void gtk_text_buffer_get_iter_at_mark(long _self, long iter, long mark);
        void gtk_text_buffer_get_iter_at_offset(long _self, long iter, int char_offset);
        int gtk_text_buffer_get_line_count(long _self);
        long gtk_text_buffer_get_mark(long _self, long name);
        long gtk_text_buffer_get_mark(long _self, String name);
        int gtk_text_buffer_get_max_undo_levels(long _self);
        boolean gtk_text_buffer_get_modified(long _self);
        long gtk_text_buffer_get_selection_bound(long _self);
        boolean gtk_text_buffer_get_selection_bounds(long _self, long start, long end);
        long gtk_text_buffer_get_selection_content(long _self);
        long gtk_text_buffer_get_slice(long _self, long start, long end, boolean include_hidden_chars);
        void gtk_text_buffer_get_start_iter(long _self, long iter);
        long gtk_text_buffer_get_tag_table(long _self);
        long gtk_text_buffer_get_text(long _self, long start, long end, boolean include_hidden_chars);
        void gtk_text_buffer_insert(long _self, long iter, long text, int len);
        void gtk_text_buffer_insert(long _self, long iter, String text, int len);
        void gtk_text_buffer_insert_at_cursor(long _self, long text, int len);
        void gtk_text_buffer_insert_at_cursor(long _self, String text, int len);
        void gtk_text_buffer_insert_child_anchor(long _self, long iter, long anchor);
        boolean gtk_text_buffer_insert_interactive(long _self, long iter, long text, int len, boolean default_editable);
        boolean gtk_text_buffer_insert_interactive(long _self, long iter, String text, int len, boolean default_editable);
        boolean gtk_text_buffer_insert_interactive_at_cursor(long _self, long text, int len, boolean default_editable);
        boolean gtk_text_buffer_insert_interactive_at_cursor(long _self, String text, int len, boolean default_editable);
        void gtk_text_buffer_insert_markup(long _self, long iter, long markup, int len);
        void gtk_text_buffer_insert_markup(long _self, long iter, String markup, int len);
        void gtk_text_buffer_insert_paintable(long _self, long iter, long paintable);
        void gtk_text_buffer_insert_range(long _self, long iter, long start, long end);
        boolean gtk_text_buffer_insert_range_interactive(long _self, long iter, long start, long end, boolean default_editable);
        void gtk_text_buffer_insert_with_tags(long _self, long iter, long text, int len, long first_tag, java.lang.Object... _elipse);
        void gtk_text_buffer_insert_with_tags(long _self, long iter, String text, int len, long first_tag, java.lang.Object... _elipse);
        void gtk_text_buffer_insert_with_tags_by_name(long _self, long iter, long text, int len, long first_tag_name, java.lang.Object... _elipse);
        void gtk_text_buffer_insert_with_tags_by_name(long _self, long iter, String text, int len, String first_tag_name, java.lang.Object... _elipse);
        void gtk_text_buffer_move_mark(long _self, long mark, long where);
        void gtk_text_buffer_move_mark_by_name(long _self, long name, long where);
        void gtk_text_buffer_move_mark_by_name(long _self, String name, long where);
        void gtk_text_buffer_paste_clipboard(long _self, long clipboard, long override_location, boolean default_editable);
        void gtk_text_buffer_place_cursor(long _self, long where);
        void gtk_text_buffer_redo(long _self);
        void gtk_text_buffer_remove_all_tags(long _self, long start, long end);
        void gtk_text_buffer_remove_selection_clipboard(long _self, long clipboard);
        void gtk_text_buffer_remove_tag(long _self, long tag, long start, long end);
        void gtk_text_buffer_remove_tag_by_name(long _self, long name, long start, long end);
        void gtk_text_buffer_remove_tag_by_name(long _self, String name, long start, long end);
        void gtk_text_buffer_select_range(long _self, long ins, long bound);
        void gtk_text_buffer_set_enable_undo(long _self, boolean enable_undo);
        void gtk_text_buffer_set_max_undo_levels(long _self, int max_undo_levels);
        void gtk_text_buffer_set_modified(long _self, boolean setting);
        void gtk_text_buffer_set_text(long _self, long text, int len);
        void gtk_text_buffer_set_text(long _self, String text, int len);
        void gtk_text_buffer_undo(long _self);
        long gtk_text_buffer_get_type();
    }

}
