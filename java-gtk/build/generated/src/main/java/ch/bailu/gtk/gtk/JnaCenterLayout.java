/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCenterLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_center_layout_new();
        int gtk_center_layout_get_baseline_position(long _self);
        long gtk_center_layout_get_center_widget(long _self);
        long gtk_center_layout_get_end_widget(long _self);
        int gtk_center_layout_get_orientation(long _self);
        long gtk_center_layout_get_start_widget(long _self);
        void gtk_center_layout_set_baseline_position(long _self, int baseline_position);
        void gtk_center_layout_set_center_widget(long _self, long widget);
        void gtk_center_layout_set_end_widget(long _self, long widget);
        void gtk_center_layout_set_orientation(long _self, int orientation);
        void gtk_center_layout_set_start_widget(long _self, long widget);
        long gtk_center_layout_get_type();
    }

}
