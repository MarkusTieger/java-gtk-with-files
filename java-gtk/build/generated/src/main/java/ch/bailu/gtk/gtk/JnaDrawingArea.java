/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDrawingArea {

    @FunctionalInterface
    public interface OnDrawingAreaDrawFunc extends com.sun.jna.Callback {
        void invoke(long drawing_area, long cr, int width, int height, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnResize extends com.sun.jna.Callback {
        void invoke(long _self, int width, int height, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_drawing_area_new();
        int gtk_drawing_area_get_content_height(long _self);
        int gtk_drawing_area_get_content_width(long _self);
        void gtk_drawing_area_set_content_height(long _self, int height);
        void gtk_drawing_area_set_content_width(long _self, int width);
        void gtk_drawing_area_set_draw_func(long _self, com.sun.jna.Callback draw_func, long user_data, com.sun.jna.Callback destroy);
        long gtk_drawing_area_get_type();
    }

}
