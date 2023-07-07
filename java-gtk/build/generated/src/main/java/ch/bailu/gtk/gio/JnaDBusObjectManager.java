/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusObjectManager {

    @FunctionalInterface
    public interface OnInterfaceAdded extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _interface, long _data);
    }

    @FunctionalInterface
    public interface OnInterfaceRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _interface, long _data);
    }

    @FunctionalInterface
    public interface OnObjectAdded extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _data);
    }

    @FunctionalInterface
    public interface OnObjectRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_object_manager_get_interface(long _self, long object_path, long interface_name);
        long g_dbus_object_manager_get_interface(long _self, String object_path, String interface_name);
        long g_dbus_object_manager_get_object(long _self, long object_path);
        long g_dbus_object_manager_get_object(long _self, String object_path);
        long g_dbus_object_manager_get_object_path(long _self);
        long g_dbus_object_manager_get_objects(long _self);
        long g_dbus_object_manager_get_type();
    }

}
