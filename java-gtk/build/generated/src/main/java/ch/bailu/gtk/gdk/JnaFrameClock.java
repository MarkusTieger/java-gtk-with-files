/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaFrameClock {

    @FunctionalInterface
    public interface OnAfterPaint extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnBeforePaint extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnFlushEvents extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnLayout extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPaint extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnResumeEvents extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUpdate extends com.sun.jna.Callback {
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
        void gdk_frame_clock_begin_updating(long _self);
        void gdk_frame_clock_end_updating(long _self);
        long gdk_frame_clock_get_current_timings(long _self);
        double gdk_frame_clock_get_fps(long _self);
        long gdk_frame_clock_get_frame_counter(long _self);
        long gdk_frame_clock_get_frame_time(long _self);
        long gdk_frame_clock_get_history_start(long _self);
        long gdk_frame_clock_get_timings(long _self, long frame_counter);
        void gdk_frame_clock_request_phase(long _self, int phase);
        long gdk_frame_clock_get_type();
    }

}
