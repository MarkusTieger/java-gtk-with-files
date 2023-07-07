/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusMenuModel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_menu_model_get(long connection, long bus_name, long object_path);
        long g_dbus_menu_model_get_type();
    }

}
