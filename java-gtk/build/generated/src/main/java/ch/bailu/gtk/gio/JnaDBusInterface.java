/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusInterface {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_interface_dup_object(long _self);
        long g_dbus_interface_get_info(long _self);
        long g_dbus_interface_get_object(long _self);
        void g_dbus_interface_set_object(long _self, long object);
        long g_dbus_interface_get_type();
    }

}
