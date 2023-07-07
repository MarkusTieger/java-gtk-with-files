/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEntryCompletion {

    @FunctionalInterface
    public interface OnEntryCompletionMatchFunc extends com.sun.jna.Callback {
        boolean invoke(long completion, long key, long iter, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnCursorOnMatch extends com.sun.jna.Callback {
        boolean invoke(long _self, long model, long iter, long _data);
    }

    @FunctionalInterface
    public interface OnInsertPrefix extends com.sun.jna.Callback {
        boolean invoke(long _self, long prefix, long _data);
    }

    @FunctionalInterface
    public interface OnMatchSelected extends com.sun.jna.Callback {
        boolean invoke(long _self, long model, long iter, long _data);
    }

    @FunctionalInterface
    public interface OnNoMatches extends com.sun.jna.Callback {
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
        long gtk_entry_completion_new();
        long gtk_entry_completion_new_with_area(long area);
        void gtk_entry_completion_complete(long _self);
        long gtk_entry_completion_compute_prefix(long _self, long key);
        long gtk_entry_completion_compute_prefix(long _self, String key);
        long gtk_entry_completion_get_completion_prefix(long _self);
        long gtk_entry_completion_get_entry(long _self);
        boolean gtk_entry_completion_get_inline_completion(long _self);
        boolean gtk_entry_completion_get_inline_selection(long _self);
        int gtk_entry_completion_get_minimum_key_length(long _self);
        long gtk_entry_completion_get_model(long _self);
        boolean gtk_entry_completion_get_popup_completion(long _self);
        boolean gtk_entry_completion_get_popup_set_width(long _self);
        boolean gtk_entry_completion_get_popup_single_match(long _self);
        int gtk_entry_completion_get_text_column(long _self);
        void gtk_entry_completion_insert_prefix(long _self);
        void gtk_entry_completion_set_inline_completion(long _self, boolean inline_completion);
        void gtk_entry_completion_set_inline_selection(long _self, boolean inline_selection);
        void gtk_entry_completion_set_match_func(long _self, com.sun.jna.Callback func, long func_data, com.sun.jna.Callback func_notify);
        void gtk_entry_completion_set_minimum_key_length(long _self, int length);
        void gtk_entry_completion_set_model(long _self, long model);
        void gtk_entry_completion_set_popup_completion(long _self, boolean popup_completion);
        void gtk_entry_completion_set_popup_set_width(long _self, boolean popup_set_width);
        void gtk_entry_completion_set_popup_single_match(long _self, boolean popup_single_match);
        void gtk_entry_completion_set_text_column(long _self, int column);
        long gtk_entry_completion_get_type();
    }

}
