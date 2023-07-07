/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureSingle {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gtk_gesture_single_get_button(long _self);
        int gtk_gesture_single_get_current_button(long _self);
        long gtk_gesture_single_get_current_sequence(long _self);
        boolean gtk_gesture_single_get_exclusive(long _self);
        boolean gtk_gesture_single_get_touch_only(long _self);
        void gtk_gesture_single_set_button(long _self, int button);
        void gtk_gesture_single_set_exclusive(long _self, boolean exclusive);
        void gtk_gesture_single_set_touch_only(long _self, boolean touch_only);
        long gtk_gesture_single_get_type();
    }

}
