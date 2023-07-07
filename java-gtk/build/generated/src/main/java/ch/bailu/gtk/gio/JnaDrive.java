/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDrive {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDisconnected extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnEjectButton extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnStopButton extends com.sun.jna.Callback {
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
        boolean g_drive_can_eject(long _self);
        boolean g_drive_can_poll_for_media(long _self);
        boolean g_drive_can_start(long _self);
        boolean g_drive_can_start_degraded(long _self);
        boolean g_drive_can_stop(long _self);
        void g_drive_eject_with_operation(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_drive_eject_with_operation_finish(long _self, long result, long _error);
        long g_drive_enumerate_identifiers(long _self);
        long g_drive_get_icon(long _self);
        long g_drive_get_identifier(long _self, long kind);
        long g_drive_get_identifier(long _self, String kind);
        long g_drive_get_name(long _self);
        long g_drive_get_sort_key(long _self);
        int g_drive_get_start_stop_type(long _self);
        long g_drive_get_symbolic_icon(long _self);
        long g_drive_get_volumes(long _self);
        boolean g_drive_has_media(long _self);
        boolean g_drive_has_volumes(long _self);
        boolean g_drive_is_media_check_automatic(long _self);
        boolean g_drive_is_media_removable(long _self);
        boolean g_drive_is_removable(long _self);
        void g_drive_poll_for_media(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_drive_poll_for_media_finish(long _self, long result, long _error);
        void g_drive_start(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_drive_start_finish(long _self, long result, long _error);
        void g_drive_stop(long _self, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_drive_stop_finish(long _self, long result, long _error);
        long g_drive_get_type();
    }

}
