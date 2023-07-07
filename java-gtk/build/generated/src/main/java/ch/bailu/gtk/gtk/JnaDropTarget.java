/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDropTarget {

    @FunctionalInterface
    public interface OnAccept extends com.sun.jna.Callback {
        boolean invoke(long _self, long drop, long _data);
    }

    @FunctionalInterface
    public interface OnDrop extends com.sun.jna.Callback {
        boolean invoke(long _self, long value, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnEnter extends com.sun.jna.Callback {
        int invoke(long _self, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnLeave extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMotion extends com.sun.jna.Callback {
        int invoke(long _self, double x, double y, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_drop_target_new(long type, int actions);
        int gtk_drop_target_get_actions(long _self);
        long gtk_drop_target_get_current_drop(long _self);
        long gtk_drop_target_get_formats(long _self);
        boolean gtk_drop_target_get_preload(long _self);
        long gtk_drop_target_get_value(long _self);
        void gtk_drop_target_reject(long _self);
        void gtk_drop_target_set_actions(long _self, int actions);
        void gtk_drop_target_set_gtypes(long _self, long types, long n_types);
        void gtk_drop_target_set_preload(long _self, boolean preload);
        long gtk_drop_target_get_type();
    }

}
