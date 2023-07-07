/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaVolume {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnRemoved extends com.sun.jna.Callback {
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
        boolean g_volume_can_eject(long _self);
        boolean g_volume_can_mount(long _self);
        void g_volume_eject_with_operation(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_volume_eject_with_operation_finish(long _self, long result, long _error);
        long g_volume_enumerate_identifiers(long _self);
        long g_volume_get_activation_root(long _self);
        long g_volume_get_drive(long _self);
        long g_volume_get_icon(long _self);
        long g_volume_get_identifier(long _self, long kind);
        long g_volume_get_identifier(long _self, String kind);
        long g_volume_get_mount(long _self);
        long g_volume_get_name(long _self);
        long g_volume_get_sort_key(long _self);
        long g_volume_get_symbolic_icon(long _self);
        long g_volume_get_uuid(long _self);
        void g_volume_mount(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_volume_mount_finish(long _self, long result, long _error);
        boolean g_volume_should_automount(long _self);
        long g_volume_get_type();
    }

}
