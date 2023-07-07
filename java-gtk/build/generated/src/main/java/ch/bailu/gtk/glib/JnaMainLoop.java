/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaMainLoop {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_main_loop_new(long context, boolean is_running);
        long g_main_loop_get_context(long _self);
        boolean g_main_loop_is_running(long _self);
        void g_main_loop_quit(long _self);
        long g_main_loop_ref(long _self);
        void g_main_loop_run(long _self);
        void g_main_loop_unref(long _self);
        long g_main_loop_get_type();
    }

}
