/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEventControllerKey {

    @FunctionalInterface
    public interface OnImUpdate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnKeyPressed extends com.sun.jna.Callback {
        boolean invoke(long _self, int keyval, int keycode, int state, long _data);
    }

    @FunctionalInterface
    public interface OnKeyReleased extends com.sun.jna.Callback {
        void invoke(long _self, int keyval, int keycode, int state, long _data);
    }

    @FunctionalInterface
    public interface OnModifiers extends com.sun.jna.Callback {
        boolean invoke(long _self, int keyval, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_event_controller_key_new();
        boolean gtk_event_controller_key_forward(long _self, long widget);
        int gtk_event_controller_key_get_group(long _self);
        long gtk_event_controller_key_get_im_context(long _self);
        void gtk_event_controller_key_set_im_context(long _self, long im_context);
        long gtk_event_controller_key_get_type();
    }

}
