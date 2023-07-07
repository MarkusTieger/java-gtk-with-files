/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGestureStylus {

    @FunctionalInterface
    public interface OnDown extends com.sun.jna.Callback {
        void invoke(long _self, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnMotion extends com.sun.jna.Callback {
        void invoke(long _self, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnProximity extends com.sun.jna.Callback {
        void invoke(long _self, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnUp extends com.sun.jna.Callback {
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
        long gtk_gesture_stylus_new();
        long gtk_gesture_stylus_get_device_tool(long _self);
        long gtk_gesture_stylus_get_type();
    }

}
