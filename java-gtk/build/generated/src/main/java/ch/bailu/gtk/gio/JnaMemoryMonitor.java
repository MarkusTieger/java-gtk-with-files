/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMemoryMonitor {

    @FunctionalInterface
    public interface OnLowMemoryWarning extends com.sun.jna.Callback {
        void invoke(long _self, int level, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_memory_monitor_dup_default();
        long g_memory_monitor_get_type();
    }

}
