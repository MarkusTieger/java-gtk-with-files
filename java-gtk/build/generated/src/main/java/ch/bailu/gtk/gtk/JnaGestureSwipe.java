/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureSwipe {

    @FunctionalInterface
    public interface OnSwipe extends com.sun.jna.Callback {
        void invoke(long _self, double velocity_x, double velocity_y, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gesture_swipe_new();
        long gtk_gesture_swipe_get_type();
    }

}
