/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMount {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPreUnmount extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUnmounted extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_mount_can_eject(long _self);
        boolean g_mount_can_unmount(long _self);
        void g_mount_eject_with_operation(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_mount_eject_with_operation_finish(long _self, long result, long _error);
        long g_mount_get_default_location(long _self);
        long g_mount_get_drive(long _self);
        long g_mount_get_icon(long _self);
        long g_mount_get_name(long _self);
        long g_mount_get_root(long _self);
        long g_mount_get_sort_key(long _self);
        long g_mount_get_symbolic_icon(long _self);
        long g_mount_get_uuid(long _self);
        long g_mount_get_volume(long _self);
        void g_mount_guess_content_type(long _self, boolean force_rescan, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_mount_is_shadowed(long _self);
        void g_mount_remount(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_mount_remount_finish(long _self, long result, long _error);
        void g_mount_shadow(long _self);
        void g_mount_unmount_with_operation(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_mount_unmount_with_operation_finish(long _self, long result, long _error);
        void g_mount_unshadow(long _self);
        long g_mount_get_type();
    }

}
