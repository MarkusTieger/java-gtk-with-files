/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaScrolledWindow {

    @FunctionalInterface
    public interface OnEdgeOvershot extends com.sun.jna.Callback {
        void invoke(long _self, int pos, long _data);
    }

    @FunctionalInterface
    public interface OnEdgeReached extends com.sun.jna.Callback {
        void invoke(long _self, int pos, long _data);
    }

    @FunctionalInterface
    public interface OnMoveFocusOut extends com.sun.jna.Callback {
        void invoke(long _self, int direction_type, long _data);
    }

    @FunctionalInterface
    public interface OnScrollChild extends com.sun.jna.Callback {
        boolean invoke(long _self, int scroll, boolean horizontal, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_scrolled_window_new();
        long gtk_scrolled_window_get_child(long _self);
        long gtk_scrolled_window_get_hadjustment(long _self);
        boolean gtk_scrolled_window_get_has_frame(long _self);
        long gtk_scrolled_window_get_hscrollbar(long _self);
        boolean gtk_scrolled_window_get_kinetic_scrolling(long _self);
        int gtk_scrolled_window_get_max_content_height(long _self);
        int gtk_scrolled_window_get_max_content_width(long _self);
        int gtk_scrolled_window_get_min_content_height(long _self);
        int gtk_scrolled_window_get_min_content_width(long _self);
        boolean gtk_scrolled_window_get_overlay_scrolling(long _self);
        int gtk_scrolled_window_get_placement(long _self);
        void gtk_scrolled_window_get_policy(long _self, long hscrollbar_policy, long vscrollbar_policy);
        boolean gtk_scrolled_window_get_propagate_natural_height(long _self);
        boolean gtk_scrolled_window_get_propagate_natural_width(long _self);
        long gtk_scrolled_window_get_vadjustment(long _self);
        long gtk_scrolled_window_get_vscrollbar(long _self);
        void gtk_scrolled_window_set_child(long _self, long child);
        void gtk_scrolled_window_set_hadjustment(long _self, long hadjustment);
        void gtk_scrolled_window_set_has_frame(long _self, boolean has_frame);
        void gtk_scrolled_window_set_kinetic_scrolling(long _self, boolean kinetic_scrolling);
        void gtk_scrolled_window_set_max_content_height(long _self, int height);
        void gtk_scrolled_window_set_max_content_width(long _self, int width);
        void gtk_scrolled_window_set_min_content_height(long _self, int height);
        void gtk_scrolled_window_set_min_content_width(long _self, int width);
        void gtk_scrolled_window_set_overlay_scrolling(long _self, boolean overlay_scrolling);
        void gtk_scrolled_window_set_placement(long _self, int window_placement);
        void gtk_scrolled_window_set_policy(long _self, int hscrollbar_policy, int vscrollbar_policy);
        void gtk_scrolled_window_set_propagate_natural_height(long _self, boolean propagate);
        void gtk_scrolled_window_set_propagate_natural_width(long _self, boolean propagate);
        void gtk_scrolled_window_set_vadjustment(long _self, long vadjustment);
        void gtk_scrolled_window_unset_placement(long _self);
        long gtk_scrolled_window_get_type();
    }

}
