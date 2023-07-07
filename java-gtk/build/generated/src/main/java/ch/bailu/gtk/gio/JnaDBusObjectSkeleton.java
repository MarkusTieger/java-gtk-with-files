/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusObjectSkeleton {

    @FunctionalInterface
    public interface OnAuthorizeMethod extends com.sun.jna.Callback {
        boolean invoke(long _self, long _interface, long invocation, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_object_skeleton_new(long object_path);
        long g_dbus_object_skeleton_new(String object_path);
        void g_dbus_object_skeleton_add_interface(long _self, long interface_);
        void g_dbus_object_skeleton_flush(long _self);
        void g_dbus_object_skeleton_remove_interface(long _self, long interface_);
        void g_dbus_object_skeleton_remove_interface_by_name(long _self, long interface_name);
        void g_dbus_object_skeleton_remove_interface_by_name(long _self, String interface_name);
        void g_dbus_object_skeleton_set_object_path(long _self, long object_path);
        void g_dbus_object_skeleton_set_object_path(long _self, String object_path);
        long g_dbus_object_skeleton_get_type();
    }

}
