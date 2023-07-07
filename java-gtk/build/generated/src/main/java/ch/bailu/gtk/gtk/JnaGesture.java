/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGesture {

    @FunctionalInterface
    public interface OnBegin extends com.sun.jna.Callback {
        void invoke(long _self, long sequence, long _data);
    }

    @FunctionalInterface
    public interface OnCancel extends com.sun.jna.Callback {
        void invoke(long _self, long sequence, long _data);
    }

    @FunctionalInterface
    public interface OnEnd extends com.sun.jna.Callback {
        void invoke(long _self, long sequence, long _data);
    }

    @FunctionalInterface
    public interface OnSequenceStateChanged extends com.sun.jna.Callback {
        void invoke(long _self, long sequence, int state, long _data);
    }

    @FunctionalInterface
    public interface OnUpdate extends com.sun.jna.Callback {
        void invoke(long _self, long sequence, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_gesture_get_bounding_box(long _self, long rect);
        long gtk_gesture_get_device(long _self);
        long gtk_gesture_get_group(long _self);
        long gtk_gesture_get_last_event(long _self, long sequence);
        long gtk_gesture_get_last_updated_sequence(long _self);
        int gtk_gesture_get_sequence_state(long _self, long sequence);
        long gtk_gesture_get_sequences(long _self);
        void gtk_gesture_group(long _self, long gesture);
        boolean gtk_gesture_handles_sequence(long _self, long sequence);
        boolean gtk_gesture_is_active(long _self);
        boolean gtk_gesture_is_grouped_with(long _self, long other);
        boolean gtk_gesture_is_recognized(long _self);
        boolean gtk_gesture_set_sequence_state(long _self, long sequence, int state);
        boolean gtk_gesture_set_state(long _self, int state);
        void gtk_gesture_ungroup(long _self);
        long gtk_gesture_get_type();
    }

}
