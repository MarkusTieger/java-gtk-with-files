/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaCarousel {

    @FunctionalInterface
    public interface OnPageChanged extends com.sun.jna.Callback {
        void invoke(long _self, int index, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_carousel_new();
        void adw_carousel_append(long _self, long child);
        boolean adw_carousel_get_allow_long_swipes(long _self);
        boolean adw_carousel_get_allow_mouse_drag(long _self);
        boolean adw_carousel_get_allow_scroll_wheel(long _self);
        boolean adw_carousel_get_interactive(long _self);
        int adw_carousel_get_n_pages(long _self);
        long adw_carousel_get_nth_page(long _self, int n);
        double adw_carousel_get_position(long _self);
        int adw_carousel_get_reveal_duration(long _self);
        long adw_carousel_get_scroll_params(long _self);
        int adw_carousel_get_spacing(long _self);
        void adw_carousel_insert(long _self, long child, int position);
        void adw_carousel_prepend(long _self, long child);
        void adw_carousel_remove(long _self, long child);
        void adw_carousel_reorder(long _self, long child, int position);
        void adw_carousel_scroll_to(long _self, long widget, boolean animate);
        void adw_carousel_set_allow_long_swipes(long _self, boolean allow_long_swipes);
        void adw_carousel_set_allow_mouse_drag(long _self, boolean allow_mouse_drag);
        void adw_carousel_set_allow_scroll_wheel(long _self, boolean allow_scroll_wheel);
        void adw_carousel_set_interactive(long _self, boolean interactive);
        void adw_carousel_set_reveal_duration(long _self, int reveal_duration);
        void adw_carousel_set_scroll_params(long _self, long params);
        void adw_carousel_set_spacing(long _self, int spacing);
        long adw_carousel_get_type();
    }

}
