/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaTouchpadEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_touchpad_event_get_gesture_phase(long _self);
        int gdk_touchpad_event_get_n_fingers(long _self);
        double gdk_touchpad_event_get_pinch_angle_delta(long _self);
        double gdk_touchpad_event_get_pinch_scale(long _self);
        long gdk_touchpad_event_get_type();
    }

}
