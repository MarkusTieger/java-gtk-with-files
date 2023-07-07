/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDragIcon {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_drag_icon_get_child(long _self);
        void gtk_drag_icon_set_child(long _self, long child);
        long gtk_drag_icon_create_widget_for_value(long value);
        long gtk_drag_icon_get_for_drag(long drag);
        void gtk_drag_icon_set_from_paintable(long drag, long paintable, int hot_x, int hot_y);
        long gtk_drag_icon_get_type();
    }

}
