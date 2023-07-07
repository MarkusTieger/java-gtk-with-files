/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaIMContext {

    @FunctionalInterface
    public interface OnCommit extends com.sun.jna.Callback {
        void invoke(long _self, long str, long _data);
    }

    @FunctionalInterface
    public interface OnDeleteSurrounding extends com.sun.jna.Callback {
        boolean invoke(long _self, int offset, int n_chars, long _data);
    }

    @FunctionalInterface
    public interface OnPreeditChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPreeditEnd extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPreeditStart extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnRetrieveSurrounding extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_im_context_delete_surrounding(long _self, int offset, int n_chars);
        boolean gtk_im_context_filter_key(long _self, boolean press, long surface, long device, int time, int keycode, int state, int group);
        boolean gtk_im_context_filter_keypress(long _self, long event);
        void gtk_im_context_focus_in(long _self);
        void gtk_im_context_focus_out(long _self);
        boolean gtk_im_context_get_surrounding_with_selection(long _self, long text, long cursor_index, long anchor_index);
        void gtk_im_context_reset(long _self);
        void gtk_im_context_set_client_widget(long _self, long widget);
        void gtk_im_context_set_cursor_location(long _self, long area);
        void gtk_im_context_set_surrounding_with_selection(long _self, long text, int len, int cursor_index, int anchor_index);
        void gtk_im_context_set_surrounding_with_selection(long _self, String text, int len, int cursor_index, int anchor_index);
        void gtk_im_context_set_use_preedit(long _self, boolean use_preedit);
        long gtk_im_context_get_type();
    }

}
