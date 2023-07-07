/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusInterfaceSkeleton {

    @FunctionalInterface
    public interface OnGAuthorizeMethod extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_dbus_interface_skeleton_export(long _self, long connection, long object_path, long _error);
        boolean g_dbus_interface_skeleton_export(long _self, long connection, String object_path, long _error);
        void g_dbus_interface_skeleton_flush(long _self);
        long g_dbus_interface_skeleton_get_connection(long _self);
        long g_dbus_interface_skeleton_get_connections(long _self);
        int g_dbus_interface_skeleton_get_flags(long _self);
        long g_dbus_interface_skeleton_get_info(long _self);
        long g_dbus_interface_skeleton_get_object_path(long _self);
        long g_dbus_interface_skeleton_get_properties(long _self);
        long g_dbus_interface_skeleton_get_vtable(long _self);
        boolean g_dbus_interface_skeleton_has_connection(long _self, long connection);
        void g_dbus_interface_skeleton_set_flags(long _self, int flags);
        void g_dbus_interface_skeleton_unexport(long _self);
        void g_dbus_interface_skeleton_unexport_from_connection(long _self, long connection);
        long g_dbus_interface_skeleton_get_type();
    }

}
