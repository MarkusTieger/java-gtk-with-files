/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTestDBus {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_test_dbus_new(int flags);
        void g_test_dbus_add_service_dir(long _self, long path);
        void g_test_dbus_add_service_dir(long _self, String path);
        void g_test_dbus_down(long _self);
        long g_test_dbus_get_bus_address(long _self);
        int g_test_dbus_get_flags(long _self);
        void g_test_dbus_stop(long _self);
        void g_test_dbus_up(long _self);
        void g_test_dbus_unset();
        long g_test_dbus_get_type();
    }

}
