/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEntry {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnIconPress extends com.sun.jna.Callback {
        void invoke(long _self, int icon_pos, long _data);
    }

    @FunctionalInterface
    public interface OnIconRelease extends com.sun.jna.Callback {
        void invoke(long _self, int icon_pos, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_entry_new();
        long gtk_entry_new_with_buffer(long buffer);
        boolean gtk_entry_get_activates_default(long _self);
        float gtk_entry_get_alignment(long _self);
        long gtk_entry_get_attributes(long _self);
        long gtk_entry_get_buffer(long _self);
        long gtk_entry_get_completion(long _self);
        int gtk_entry_get_current_icon_drag_source(long _self);
        long gtk_entry_get_extra_menu(long _self);
        boolean gtk_entry_get_has_frame(long _self);
        boolean gtk_entry_get_icon_activatable(long _self, int icon_pos);
        void gtk_entry_get_icon_area(long _self, int icon_pos, long icon_area);
        int gtk_entry_get_icon_at_pos(long _self, int x, int y);
        long gtk_entry_get_icon_gicon(long _self, int icon_pos);
        long gtk_entry_get_icon_name(long _self, int icon_pos);
        long gtk_entry_get_icon_paintable(long _self, int icon_pos);
        boolean gtk_entry_get_icon_sensitive(long _self, int icon_pos);
        int gtk_entry_get_icon_storage_type(long _self, int icon_pos);
        long gtk_entry_get_icon_tooltip_markup(long _self, int icon_pos);
        long gtk_entry_get_icon_tooltip_text(long _self, int icon_pos);
        int gtk_entry_get_input_hints(long _self);
        int gtk_entry_get_input_purpose(long _self);
        byte gtk_entry_get_invisible_char(long _self);
        int gtk_entry_get_max_length(long _self);
        boolean gtk_entry_get_overwrite_mode(long _self);
        long gtk_entry_get_placeholder_text(long _self);
        double gtk_entry_get_progress_fraction(long _self);
        double gtk_entry_get_progress_pulse_step(long _self);
        long gtk_entry_get_tabs(long _self);
        int gtk_entry_get_text_length(long _self);
        boolean gtk_entry_get_visibility(long _self);
        boolean gtk_entry_grab_focus_without_selecting(long _self);
        void gtk_entry_progress_pulse(long _self);
        void gtk_entry_reset_im_context(long _self);
        void gtk_entry_set_activates_default(long _self, boolean setting);
        void gtk_entry_set_alignment(long _self, float xalign);
        void gtk_entry_set_attributes(long _self, long attrs);
        void gtk_entry_set_buffer(long _self, long buffer);
        void gtk_entry_set_completion(long _self, long completion);
        void gtk_entry_set_extra_menu(long _self, long model);
        void gtk_entry_set_has_frame(long _self, boolean setting);
        void gtk_entry_set_icon_activatable(long _self, int icon_pos, boolean activatable);
        void gtk_entry_set_icon_drag_source(long _self, int icon_pos, long provider, int actions);
        void gtk_entry_set_icon_from_gicon(long _self, int icon_pos, long icon);
        void gtk_entry_set_icon_from_icon_name(long _self, int icon_pos, long icon_name);
        void gtk_entry_set_icon_from_icon_name(long _self, int icon_pos, String icon_name);
        void gtk_entry_set_icon_from_paintable(long _self, int icon_pos, long paintable);
        void gtk_entry_set_icon_sensitive(long _self, int icon_pos, boolean sensitive);
        void gtk_entry_set_icon_tooltip_markup(long _self, int icon_pos, long tooltip);
        void gtk_entry_set_icon_tooltip_markup(long _self, int icon_pos, String tooltip);
        void gtk_entry_set_icon_tooltip_text(long _self, int icon_pos, long tooltip);
        void gtk_entry_set_icon_tooltip_text(long _self, int icon_pos, String tooltip);
        void gtk_entry_set_input_hints(long _self, int hints);
        void gtk_entry_set_input_purpose(long _self, int purpose);
        void gtk_entry_set_invisible_char(long _self, byte ch);
        void gtk_entry_set_max_length(long _self, int max);
        void gtk_entry_set_overwrite_mode(long _self, boolean overwrite);
        void gtk_entry_set_placeholder_text(long _self, long text);
        void gtk_entry_set_placeholder_text(long _self, String text);
        void gtk_entry_set_progress_fraction(long _self, double fraction);
        void gtk_entry_set_progress_pulse_step(long _self, double fraction);
        void gtk_entry_set_tabs(long _self, long tabs);
        void gtk_entry_set_visibility(long _self, boolean visible);
        void gtk_entry_unset_invisible_char(long _self);
        long gtk_entry_get_type();
    }

}
