/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRenderer {

    @FunctionalInterface
    public interface OnEditingCanceled extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnEditingStarted extends com.sun.jna.Callback {
        void invoke(long _self, long editable, long path, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_cell_renderer_activate(long _self, long event, long widget, long path, long background_area, long cell_area, int flags);
        boolean gtk_cell_renderer_activate(long _self, long event, long widget, String path, long background_area, long cell_area, int flags);
        void gtk_cell_renderer_get_aligned_area(long _self, long widget, int flags, long cell_area, long aligned_area);
        void gtk_cell_renderer_get_alignment(long _self, long xalign, long yalign);
        void gtk_cell_renderer_get_fixed_size(long _self, long width, long height);
        boolean gtk_cell_renderer_get_is_expanded(long _self);
        boolean gtk_cell_renderer_get_is_expander(long _self);
        void gtk_cell_renderer_get_padding(long _self, long xpad, long ypad);
        void gtk_cell_renderer_get_preferred_height(long _self, long widget, long minimum_size, long natural_size);
        void gtk_cell_renderer_get_preferred_height_for_width(long _self, long widget, int width, long minimum_height, long natural_height);
        void gtk_cell_renderer_get_preferred_size(long _self, long widget, long minimum_size, long natural_size);
        void gtk_cell_renderer_get_preferred_width(long _self, long widget, long minimum_size, long natural_size);
        void gtk_cell_renderer_get_preferred_width_for_height(long _self, long widget, int height, long minimum_width, long natural_width);
        int gtk_cell_renderer_get_request_mode(long _self);
        boolean gtk_cell_renderer_get_sensitive(long _self);
        int gtk_cell_renderer_get_state(long _self, long widget, int cell_state);
        boolean gtk_cell_renderer_get_visible(long _self);
        boolean gtk_cell_renderer_is_activatable(long _self);
        void gtk_cell_renderer_set_alignment(long _self, float xalign, float yalign);
        void gtk_cell_renderer_set_fixed_size(long _self, int width, int height);
        void gtk_cell_renderer_set_is_expanded(long _self, boolean is_expanded);
        void gtk_cell_renderer_set_is_expander(long _self, boolean is_expander);
        void gtk_cell_renderer_set_padding(long _self, int xpad, int ypad);
        void gtk_cell_renderer_set_sensitive(long _self, boolean sensitive);
        void gtk_cell_renderer_set_visible(long _self, boolean visible);
        void gtk_cell_renderer_snapshot(long _self, long snapshot, long widget, long background_area, long cell_area, int flags);
        long gtk_cell_renderer_start_editing(long _self, long event, long widget, long path, long background_area, long cell_area, int flags);
        long gtk_cell_renderer_start_editing(long _self, long event, long widget, String path, long background_area, long cell_area, int flags);
        void gtk_cell_renderer_stop_editing(long _self, boolean canceled);
        long gtk_cell_renderer_get_type();
    }

}
