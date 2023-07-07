/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCenterBox {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_center_box_new();
        int gtk_center_box_get_baseline_position(long _self);
        long gtk_center_box_get_center_widget(long _self);
        long gtk_center_box_get_end_widget(long _self);
        long gtk_center_box_get_start_widget(long _self);
        void gtk_center_box_set_baseline_position(long _self, int position);
        void gtk_center_box_set_center_widget(long _self, long child);
        void gtk_center_box_set_end_widget(long _self, long child);
        void gtk_center_box_set_start_widget(long _self, long child);
        long gtk_center_box_get_type();
    }

}
