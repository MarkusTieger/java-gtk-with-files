/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaEntryRow {

    @FunctionalInterface
    public interface OnApply extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnEntryActivated extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_entry_row_new();
        void adw_entry_row_add_prefix(long _self, long widget);
        void adw_entry_row_add_suffix(long _self, long widget);
        boolean adw_entry_row_get_activates_default(long _self);
        long adw_entry_row_get_attributes(long _self);
        boolean adw_entry_row_get_enable_emoji_completion(long _self);
        int adw_entry_row_get_input_hints(long _self);
        int adw_entry_row_get_input_purpose(long _self);
        boolean adw_entry_row_get_show_apply_button(long _self);
        void adw_entry_row_remove(long _self, long widget);
        void adw_entry_row_set_activates_default(long _self, boolean activates);
        void adw_entry_row_set_attributes(long _self, long attributes);
        void adw_entry_row_set_enable_emoji_completion(long _self, boolean enable_emoji_completion);
        void adw_entry_row_set_input_hints(long _self, int hints);
        void adw_entry_row_set_input_purpose(long _self, int purpose);
        void adw_entry_row_set_show_apply_button(long _self, boolean show_apply_button);
        long adw_entry_row_get_type();
    }

}
