/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaPowerProfileMonitor {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_power_profile_monitor_get_power_saver_enabled(long _self);
        long g_power_profile_monitor_dup_default();
        long g_power_profile_monitor_get_type();
    }

}
