/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaFrameTimings {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gdk_frame_timings_get_complete(long _self);
        long gdk_frame_timings_get_frame_counter(long _self);
        long gdk_frame_timings_get_frame_time(long _self);
        long gdk_frame_timings_get_predicted_presentation_time(long _self);
        long gdk_frame_timings_get_presentation_time(long _self);
        long gdk_frame_timings_get_refresh_interval(long _self);
        long gdk_frame_timings_ref(long _self);
        void gdk_frame_timings_unref(long _self);
        long gdk_frame_timings_get_type();
    }

}
