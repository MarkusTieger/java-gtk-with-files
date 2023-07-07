/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixMountMonitor {

    @FunctionalInterface
    public interface OnMountpointsChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMountsChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_unix_mount_monitor_get();
        long g_unix_mount_monitor_get_type();
    }

}
