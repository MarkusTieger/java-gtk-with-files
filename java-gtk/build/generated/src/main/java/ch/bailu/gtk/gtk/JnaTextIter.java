/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextIter {

    @FunctionalInterface
    public interface OnTextCharPredicate extends com.sun.jna.Callback {
        boolean invoke(byte ch, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TextIter size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TextIter.DUMMY1, TextIter.DUMMY2, TextIter.DUMMY3, TextIter.DUMMY4, TextIter.DUMMY5, TextIter.DUMMY6, TextIter.DUMMY7, TextIter.DUMMY8, TextIter.DUMMY9, TextIter.DUMMY10, TextIter.DUMMY11, TextIter.DUMMY12, TextIter.DUMMY13, TextIter.DUMMY14})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long dummy1;
        public long dummy2;
        public int dummy3;
        public int dummy4;
        public int dummy5;
        public int dummy6;
        public int dummy7;
        public int dummy8;
        public long dummy9;
        public long dummy10;
        public int dummy11;
        public int dummy12;
        public int dummy13;
        public long dummy14;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_text_iter_assign(long _self, long other);
        boolean gtk_text_iter_backward_char(long _self);
        boolean gtk_text_iter_backward_chars(long _self, int count);
        boolean gtk_text_iter_backward_cursor_position(long _self);
        boolean gtk_text_iter_backward_cursor_positions(long _self, int count);
        boolean gtk_text_iter_backward_find_char(long _self, com.sun.jna.Callback pred, long user_data, long limit);
        boolean gtk_text_iter_backward_line(long _self);
        boolean gtk_text_iter_backward_lines(long _self, int count);
        boolean gtk_text_iter_backward_search(long _self, long str, int flags, long match_start, long match_end, long limit);
        boolean gtk_text_iter_backward_search(long _self, String str, int flags, long match_start, long match_end, long limit);
        boolean gtk_text_iter_backward_sentence_start(long _self);
        boolean gtk_text_iter_backward_sentence_starts(long _self, int count);
        boolean gtk_text_iter_backward_to_tag_toggle(long _self, long tag);
        boolean gtk_text_iter_backward_visible_cursor_position(long _self);
        boolean gtk_text_iter_backward_visible_cursor_positions(long _self, int count);
        boolean gtk_text_iter_backward_visible_line(long _self);
        boolean gtk_text_iter_backward_visible_lines(long _self, int count);
        boolean gtk_text_iter_backward_visible_word_start(long _self);
        boolean gtk_text_iter_backward_visible_word_starts(long _self, int count);
        boolean gtk_text_iter_backward_word_start(long _self);
        boolean gtk_text_iter_backward_word_starts(long _self, int count);
        boolean gtk_text_iter_can_insert(long _self, boolean default_editability);
        int gtk_text_iter_compare(long _self, long rhs);
        long gtk_text_iter_copy(long _self);
        boolean gtk_text_iter_editable(long _self, boolean default_setting);
        boolean gtk_text_iter_ends_line(long _self);
        boolean gtk_text_iter_ends_sentence(long _self);
        boolean gtk_text_iter_ends_tag(long _self, long tag);
        boolean gtk_text_iter_ends_word(long _self);
        boolean gtk_text_iter_equal(long _self, long rhs);
        boolean gtk_text_iter_forward_char(long _self);
        boolean gtk_text_iter_forward_chars(long _self, int count);
        boolean gtk_text_iter_forward_cursor_position(long _self);
        boolean gtk_text_iter_forward_cursor_positions(long _self, int count);
        boolean gtk_text_iter_forward_find_char(long _self, com.sun.jna.Callback pred, long user_data, long limit);
        boolean gtk_text_iter_forward_line(long _self);
        boolean gtk_text_iter_forward_lines(long _self, int count);
        boolean gtk_text_iter_forward_search(long _self, long str, int flags, long match_start, long match_end, long limit);
        boolean gtk_text_iter_forward_search(long _self, String str, int flags, long match_start, long match_end, long limit);
        boolean gtk_text_iter_forward_sentence_end(long _self);
        boolean gtk_text_iter_forward_sentence_ends(long _self, int count);
        void gtk_text_iter_forward_to_end(long _self);
        boolean gtk_text_iter_forward_to_line_end(long _self);
        boolean gtk_text_iter_forward_to_tag_toggle(long _self, long tag);
        boolean gtk_text_iter_forward_visible_cursor_position(long _self);
        boolean gtk_text_iter_forward_visible_cursor_positions(long _self, int count);
        boolean gtk_text_iter_forward_visible_line(long _self);
        boolean gtk_text_iter_forward_visible_lines(long _self, int count);
        boolean gtk_text_iter_forward_visible_word_end(long _self);
        boolean gtk_text_iter_forward_visible_word_ends(long _self, int count);
        boolean gtk_text_iter_forward_word_end(long _self);
        boolean gtk_text_iter_forward_word_ends(long _self, int count);
        void gtk_text_iter_free(long _self);
        long gtk_text_iter_get_buffer(long _self);
        int gtk_text_iter_get_bytes_in_line(long _self);
        byte gtk_text_iter_get_char(long _self);
        int gtk_text_iter_get_chars_in_line(long _self);
        long gtk_text_iter_get_child_anchor(long _self);
        long gtk_text_iter_get_language(long _self);
        int gtk_text_iter_get_line(long _self);
        int gtk_text_iter_get_line_index(long _self);
        int gtk_text_iter_get_line_offset(long _self);
        long gtk_text_iter_get_marks(long _self);
        int gtk_text_iter_get_offset(long _self);
        long gtk_text_iter_get_paintable(long _self);
        long gtk_text_iter_get_slice(long _self, long end);
        long gtk_text_iter_get_tags(long _self);
        long gtk_text_iter_get_text(long _self, long end);
        long gtk_text_iter_get_toggled_tags(long _self, boolean toggled_on);
        int gtk_text_iter_get_visible_line_index(long _self);
        int gtk_text_iter_get_visible_line_offset(long _self);
        long gtk_text_iter_get_visible_slice(long _self, long end);
        long gtk_text_iter_get_visible_text(long _self, long end);
        boolean gtk_text_iter_has_tag(long _self, long tag);
        boolean gtk_text_iter_in_range(long _self, long start, long end);
        boolean gtk_text_iter_inside_sentence(long _self);
        boolean gtk_text_iter_inside_word(long _self);
        boolean gtk_text_iter_is_cursor_position(long _self);
        boolean gtk_text_iter_is_end(long _self);
        boolean gtk_text_iter_is_start(long _self);
        void gtk_text_iter_order(long _self, long second);
        void gtk_text_iter_set_line(long _self, int line_number);
        void gtk_text_iter_set_line_index(long _self, int byte_on_line);
        void gtk_text_iter_set_line_offset(long _self, int char_on_line);
        void gtk_text_iter_set_offset(long _self, int char_offset);
        void gtk_text_iter_set_visible_line_index(long _self, int byte_on_line);
        void gtk_text_iter_set_visible_line_offset(long _self, int char_on_line);
        boolean gtk_text_iter_starts_line(long _self);
        boolean gtk_text_iter_starts_sentence(long _self);
        boolean gtk_text_iter_starts_tag(long _self, long tag);
        boolean gtk_text_iter_starts_word(long _self);
        boolean gtk_text_iter_toggles_tag(long _self, long tag);
        long gtk_text_iter_get_type();
    }

}
