/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaSwipeable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        double adw_swipeable_get_cancel_progress(long _self);
        double adw_swipeable_get_distance(long _self);
        double adw_swipeable_get_progress(long _self);
        void adw_swipeable_get_swipe_area(long _self, int navigation_direction, boolean is_drag, long rect);
        long adw_swipeable_get_type();
    }

}
