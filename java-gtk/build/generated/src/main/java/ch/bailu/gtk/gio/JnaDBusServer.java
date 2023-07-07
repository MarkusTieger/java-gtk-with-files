/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusServer {

    @FunctionalInterface
    public interface OnNewConnection extends com.sun.jna.Callback {
        boolean invoke(long _self, long connection, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_server_new_sync(long address, int flags, long guid, long observer, long cancellable, long _error);
        long g_dbus_server_new_sync(String address, int flags, String guid, long observer, long cancellable, long _error);
        long g_dbus_server_get_client_address(long _self);
        int g_dbus_server_get_flags(long _self);
        long g_dbus_server_get_guid(long _self);
        boolean g_dbus_server_is_active(long _self);
        void g_dbus_server_start(long _self);
        void g_dbus_server_stop(long _self);
        long g_dbus_server_get_type();
    }

}
