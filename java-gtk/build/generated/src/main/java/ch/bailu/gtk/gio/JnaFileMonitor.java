/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileMonitor {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long file, long other_file, int event_type, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_file_monitor_cancel(long _self);
        void g_file_monitor_emit_event(long _self, long child, long other_file, int event_type);
        boolean g_file_monitor_is_cancelled(long _self);
        void g_file_monitor_set_rate_limit(long _self, int limit_msecs);
        long g_file_monitor_get_type();
    }

}
