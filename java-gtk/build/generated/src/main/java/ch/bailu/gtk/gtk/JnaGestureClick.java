/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureClick {

    @FunctionalInterface
    public interface OnPressed extends com.sun.jna.Callback {
        void invoke(long _self, int n_press, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnReleased extends com.sun.jna.Callback {
        void invoke(long _self, int n_press, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnStopped extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUnpairedRelease extends com.sun.jna.Callback {
        void invoke(long _self, double x, double y, int button, long sequence, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gesture_click_new();
        long gtk_gesture_click_get_type();
    }

}
