/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusObjectManagerServer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_object_manager_server_new(long object_path);
        long g_dbus_object_manager_server_new(String object_path);
        void g_dbus_object_manager_server_export(long _self, long object);
        void g_dbus_object_manager_server_export_uniquely(long _self, long object);
        long g_dbus_object_manager_server_get_connection(long _self);
        boolean g_dbus_object_manager_server_is_exported(long _self, long object);
        void g_dbus_object_manager_server_set_connection(long _self, long connection);
        boolean g_dbus_object_manager_server_unexport(long _self, long object_path);
        boolean g_dbus_object_manager_server_unexport(long _self, String object_path);
        long g_dbus_object_manager_server_get_type();
    }

}
