/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDrag {

    @FunctionalInterface
    public interface OnCancel extends com.sun.jna.Callback {
        void invoke(long _self, int reason, long _data);
    }

    @FunctionalInterface
    public interface OnDndFinished extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDropPerformed extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gdk_drag_drop_done(long _self, boolean success);
        int gdk_drag_get_actions(long _self);
        long gdk_drag_get_content(long _self);
        long gdk_drag_get_device(long _self);
        long gdk_drag_get_display(long _self);
        long gdk_drag_get_drag_surface(long _self);
        long gdk_drag_get_formats(long _self);
        int gdk_drag_get_selected_action(long _self);
        long gdk_drag_get_surface(long _self);
        void gdk_drag_set_hotspot(long _self, int hot_x, int hot_y);
        long gdk_drag_begin(long surface, long device, long content, int actions, double dx, double dy);
        long gdk_drag_get_type();
    }

}
