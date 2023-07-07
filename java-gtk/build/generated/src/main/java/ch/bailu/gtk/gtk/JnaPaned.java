/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPaned {

    @FunctionalInterface
    public interface OnAcceptPosition extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCancelPosition extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCycleChildFocus extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean reversed, long _data);
    }

    @FunctionalInterface
    public interface OnCycleHandleFocus extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean reversed, long _data);
    }

    @FunctionalInterface
    public interface OnMoveHandle extends com.sun.jna.Callback {
        boolean invoke(long _self, int scroll_type, long _data);
    }

    @FunctionalInterface
    public interface OnToggleHandleFocus extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_paned_new(int orientation);
        long gtk_paned_get_end_child(long _self);
        int gtk_paned_get_position(long _self);
        boolean gtk_paned_get_resize_end_child(long _self);
        boolean gtk_paned_get_resize_start_child(long _self);
        boolean gtk_paned_get_shrink_end_child(long _self);
        boolean gtk_paned_get_shrink_start_child(long _self);
        long gtk_paned_get_start_child(long _self);
        boolean gtk_paned_get_wide_handle(long _self);
        void gtk_paned_set_end_child(long _self, long child);
        void gtk_paned_set_position(long _self, int position);
        void gtk_paned_set_resize_end_child(long _self, boolean resize);
        void gtk_paned_set_resize_start_child(long _self, boolean resize);
        void gtk_paned_set_shrink_end_child(long _self, boolean resize);
        void gtk_paned_set_shrink_start_child(long _self, boolean resize);
        void gtk_paned_set_start_child(long _self, long child);
        void gtk_paned_set_wide_handle(long _self, boolean wide);
        long gtk_paned_get_type();
    }

}
