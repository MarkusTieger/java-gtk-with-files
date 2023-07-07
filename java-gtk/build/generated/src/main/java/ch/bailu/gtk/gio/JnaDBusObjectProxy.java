/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusObjectProxy {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_object_proxy_new(long connection, long object_path);
        long g_dbus_object_proxy_new(long connection, String object_path);
        long g_dbus_object_proxy_get_connection(long _self);
        long g_dbus_object_proxy_get_type();
    }

}
