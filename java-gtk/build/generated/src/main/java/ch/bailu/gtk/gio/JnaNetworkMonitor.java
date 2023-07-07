/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaNetworkMonitor {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnNetworkChanged extends com.sun.jna.Callback {
        void invoke(long _self, boolean network_available, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_network_monitor_can_reach(long _self, long connectable, long cancellable, long _error);
        void g_network_monitor_can_reach_async(long _self, long connectable, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_network_monitor_can_reach_finish(long _self, long result, long _error);
        int g_network_monitor_get_connectivity(long _self);
        boolean g_network_monitor_get_network_available(long _self);
        boolean g_network_monitor_get_network_metered(long _self);
        long g_network_monitor_get_default();
        long g_network_monitor_get_type();
    }

}
