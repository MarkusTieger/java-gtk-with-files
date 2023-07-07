/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureRotate {

    @FunctionalInterface
    public interface OnAngleChanged extends com.sun.jna.Callback {
        void invoke(long _self, double angle, double angle_delta, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gesture_rotate_new();
        double gtk_gesture_rotate_get_angle_delta(long _self);
        long gtk_gesture_rotate_get_type();
    }

}
