/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureZoom {

    @FunctionalInterface
    public interface OnScaleChanged extends com.sun.jna.Callback {
        void invoke(long _self, double scale, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gesture_zoom_new();
        double gtk_gesture_zoom_get_scale_delta(long _self);
        long gtk_gesture_zoom_get_type();
    }

}
