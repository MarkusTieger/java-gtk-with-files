/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDropControllerMotion {

    @FunctionalInterface
    public interface OnEnter extends com.sun.jna.Callback {
        void invoke(long _self, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnLeave extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMotion extends com.sun.jna.Callback {
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
        long gtk_drop_controller_motion_new();
        boolean gtk_drop_controller_motion_contains_pointer(long _self);
        long gtk_drop_controller_motion_get_drop(long _self);
        boolean gtk_drop_controller_motion_is_pointer(long _self);
        long gtk_drop_controller_motion_get_type();
    }

}
