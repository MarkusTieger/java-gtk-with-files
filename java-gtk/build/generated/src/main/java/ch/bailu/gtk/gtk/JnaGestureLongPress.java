/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureLongPress {

    @FunctionalInterface
    public interface OnCancelled extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPressed extends com.sun.jna.Callback {
        void invoke(long _self, double x, double y, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gesture_long_press_new();
        double gtk_gesture_long_press_get_delay_factor(long _self);
        void gtk_gesture_long_press_set_delay_factor(long _self, double delay_factor);
        long gtk_gesture_long_press_get_type();
    }

}
