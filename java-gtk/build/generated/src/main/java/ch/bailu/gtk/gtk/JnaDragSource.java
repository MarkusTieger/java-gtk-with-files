/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDragSource {

    @FunctionalInterface
    public interface OnDragBegin extends com.sun.jna.Callback {
        void invoke(long _self, long drag, long _data);
    }

    @FunctionalInterface
    public interface OnDragCancel extends com.sun.jna.Callback {
        boolean invoke(long _self, long drag, int reason, long _data);
    }

    @FunctionalInterface
    public interface OnDragEnd extends com.sun.jna.Callback {
        void invoke(long _self, long drag, boolean delete_data, long _data);
    }

    @FunctionalInterface
    public interface OnPrepare extends com.sun.jna.Callback {
        long invoke(long _self, double x, double y, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_drag_source_new();
        void gtk_drag_source_drag_cancel(long _self);
        int gtk_drag_source_get_actions(long _self);
        long gtk_drag_source_get_content(long _self);
        long gtk_drag_source_get_drag(long _self);
        void gtk_drag_source_set_actions(long _self, int actions);
        void gtk_drag_source_set_content(long _self, long content);
        void gtk_drag_source_set_icon(long _self, long paintable, int hot_x, int hot_y);
        long gtk_drag_source_get_type();
    }

}
