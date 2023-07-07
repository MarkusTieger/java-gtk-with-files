/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFrame {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_frame_new(long label);
        long gtk_frame_new(String label);
        long gtk_frame_get_child(long _self);
        long gtk_frame_get_label(long _self);
        float gtk_frame_get_label_align(long _self);
        long gtk_frame_get_label_widget(long _self);
        void gtk_frame_set_child(long _self, long child);
        void gtk_frame_set_label(long _self, long label);
        void gtk_frame_set_label(long _self, String label);
        void gtk_frame_set_label_align(long _self, float xalign);
        void gtk_frame_set_label_widget(long _self, long label_widget);
        long gtk_frame_get_type();
    }

}
