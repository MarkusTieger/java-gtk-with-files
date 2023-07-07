/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDropTargetAsync {

    @FunctionalInterface
    public interface OnAccept extends com.sun.jna.Callback {
        boolean invoke(long _self, long drop, long _data);
    }

    @FunctionalInterface
    public interface OnDragEnter extends com.sun.jna.Callback {
        int invoke(long _self, long drop, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnDragLeave extends com.sun.jna.Callback {
        void invoke(long _self, long drop, long _data);
    }

    @FunctionalInterface
    public interface OnDragMotion extends com.sun.jna.Callback {
        int invoke(long _self, long drop, double x, double y, long _data);
    }

    @FunctionalInterface
    public interface OnDrop extends com.sun.jna.Callback {
        boolean invoke(long _self, long drop, double x, double y, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_drop_target_async_new(long formats, int actions);
        int gtk_drop_target_async_get_actions(long _self);
        long gtk_drop_target_async_get_formats(long _self);
        void gtk_drop_target_async_reject_drop(long _self, long drop);
        void gtk_drop_target_async_set_actions(long _self, int actions);
        void gtk_drop_target_async_set_formats(long _self, long formats);
        long gtk_drop_target_async_get_type();
    }

}
