/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaTimer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_timer_continue(long _self);
        void g_timer_destroy(long _self);
        boolean g_timer_is_active(long _self);
        void g_timer_reset(long _self);
        void g_timer_start(long _self);
        void g_timer_stop(long _self);
        long g_timer_new();
    }

}
