/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDebugController {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_debug_controller_get_debug_enabled(long _self);
        void g_debug_controller_set_debug_enabled(long _self, boolean debug_enabled);
        long g_debug_controller_get_type();
    }

}
