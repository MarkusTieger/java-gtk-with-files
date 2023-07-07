/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaText {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

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
    public interface OnInsertAtCursor extends com.sun.jna.Callback {
        void invoke(long _self, long string, long _data);
    }

    @FunctionalInterface
    public interface OnInsertEmoji extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        void invoke(long _self, int step, int count, boolean extend, long _data);
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
        long gtk_text_new();
        long gtk_text_new_with_buffer(long buffer);
        void gtk_text_compute_cursor_extents(long _self, long position, long strong, long weak);
        boolean gtk_text_get_activates_default(long _self);
        long gtk_text_get_attributes(long _self);
        long gtk_text_get_buffer(long _self);
        boolean gtk_text_get_enable_emoji_completion(long _self);
        long gtk_text_get_extra_menu(long _self);
        int gtk_text_get_input_hints(long _self);
        int gtk_text_get_input_purpose(long _self);
        byte gtk_text_get_invisible_char(long _self);
        int gtk_text_get_max_length(long _self);
        boolean gtk_text_get_overwrite_mode(long _self);
        long gtk_text_get_placeholder_text(long _self);
        boolean gtk_text_get_propagate_text_width(long _self);
        long gtk_text_get_tabs(long _self);
        int gtk_text_get_text_length(long _self);
        boolean gtk_text_get_truncate_multiline(long _self);
        boolean gtk_text_get_visibility(long _self);
        boolean gtk_text_grab_focus_without_selecting(long _self);
        void gtk_text_set_activates_default(long _self, boolean activates);
        void gtk_text_set_attributes(long _self, long attrs);
        void gtk_text_set_buffer(long _self, long buffer);
        void gtk_text_set_enable_emoji_completion(long _self, boolean enable_emoji_completion);
        void gtk_text_set_extra_menu(long _self, long model);
        void gtk_text_set_input_hints(long _self, int hints);
        void gtk_text_set_input_purpose(long _self, int purpose);
        void gtk_text_set_invisible_char(long _self, byte ch);
        void gtk_text_set_max_length(long _self, int length);
        void gtk_text_set_overwrite_mode(long _self, boolean overwrite);
        void gtk_text_set_placeholder_text(long _self, long text);
        void gtk_text_set_placeholder_text(long _self, String text);
        void gtk_text_set_propagate_text_width(long _self, boolean propagate_text_width);
        void gtk_text_set_tabs(long _self, long tabs);
        void gtk_text_set_truncate_multiline(long _self, boolean truncate_multiline);
        void gtk_text_set_visibility(long _self, boolean visible);
        void gtk_text_unset_invisible_char(long _self);
        long gtk_text_get_type();
    }

}
