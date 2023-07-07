/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAspectFrame {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_aspect_frame_new(float xalign, float yalign, float ratio, boolean obey_child);
        long gtk_aspect_frame_get_child(long _self);
        boolean gtk_aspect_frame_get_obey_child(long _self);
        float gtk_aspect_frame_get_ratio(long _self);
        float gtk_aspect_frame_get_xalign(long _self);
        float gtk_aspect_frame_get_yalign(long _self);
        void gtk_aspect_frame_set_child(long _self, long child);
        void gtk_aspect_frame_set_obey_child(long _self, boolean obey_child);
        void gtk_aspect_frame_set_ratio(long _self, float ratio);
        void gtk_aspect_frame_set_xalign(long _self, float xalign);
        void gtk_aspect_frame_set_yalign(long _self, float yalign);
        long gtk_aspect_frame_get_type();
    }

}
