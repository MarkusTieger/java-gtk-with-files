/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaSwipeTracker {

    @FunctionalInterface
    public interface OnBeginSwipe extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnEndSwipe extends com.sun.jna.Callback {
        void invoke(long _self, double velocity, double to, long _data);
    }

    @FunctionalInterface
    public interface OnPrepare extends com.sun.jna.Callback {
        void invoke(long _self, int direction, long _data);
    }

    @FunctionalInterface
    public interface OnUpdateSwipe extends com.sun.jna.Callback {
        void invoke(long _self, double progress, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_swipe_tracker_new(long swipeable);
        boolean adw_swipe_tracker_get_allow_long_swipes(long _self);
        boolean adw_swipe_tracker_get_allow_mouse_drag(long _self);
        boolean adw_swipe_tracker_get_enabled(long _self);
        boolean adw_swipe_tracker_get_reversed(long _self);
        long adw_swipe_tracker_get_swipeable(long _self);
        void adw_swipe_tracker_set_allow_long_swipes(long _self, boolean allow_long_swipes);
        void adw_swipe_tracker_set_allow_mouse_drag(long _self, boolean allow_mouse_drag);
        void adw_swipe_tracker_set_enabled(long _self, boolean enabled);
        void adw_swipe_tracker_set_reversed(long _self, boolean reversed);
        void adw_swipe_tracker_shift_position(long _self, double delta);
        long adw_swipe_tracker_get_type();
    }

}
