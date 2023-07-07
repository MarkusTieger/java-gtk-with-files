/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixMountPoint {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_unix_mount_point_compare(long _self, long mount2);
        long g_unix_mount_point_copy(long _self);
        void g_unix_mount_point_free(long _self);
        long g_unix_mount_point_get_device_path(long _self);
        long g_unix_mount_point_get_fs_type(long _self);
        long g_unix_mount_point_get_mount_path(long _self);
        long g_unix_mount_point_get_options(long _self);
        boolean g_unix_mount_point_guess_can_eject(long _self);
        long g_unix_mount_point_guess_icon(long _self);
        long g_unix_mount_point_guess_name(long _self);
        long g_unix_mount_point_guess_symbolic_icon(long _self);
        boolean g_unix_mount_point_is_loopback(long _self);
        boolean g_unix_mount_point_is_readonly(long _self);
        boolean g_unix_mount_point_is_user_mountable(long _self);
        long g_unix_mount_point_get_type();
    }

}
