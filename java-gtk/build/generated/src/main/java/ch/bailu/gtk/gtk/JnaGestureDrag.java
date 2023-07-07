/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureDrag {

    @FunctionalInterface
    public interface OnDragBegin extends com.sun.jna.Callback {
        void invoke(long _self, double start_x, double start_y, long _data);
    }

    @FunctionalInterface
    public interface OnDragEnd extends com.sun.jna.Callback {
        void invoke(long _self, double offset_x, double offset_y, long _data);
    }

    @FunctionalInterface
    public interface OnDragUpdate extends com.sun.jna.Callback {
        void invoke(long _self, double offset_x, double offset_y, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gesture_drag_new();
        long gtk_gesture_drag_get_type();
    }

}
