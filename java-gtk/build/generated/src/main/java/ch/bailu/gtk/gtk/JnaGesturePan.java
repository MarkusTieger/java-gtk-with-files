/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGesturePan {

    @FunctionalInterface
    public interface OnPan extends com.sun.jna.Callback {
        void invoke(long _self, int direction, double offset, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gesture_pan_new(int orientation);
        int gtk_gesture_pan_get_orientation(long _self);
        void gtk_gesture_pan_set_orientation(long _self, int orientation);
        long gtk_gesture_pan_get_type();
    }

}
