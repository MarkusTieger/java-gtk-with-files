/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaPermission {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_permission_acquire(long _self, long cancellable, long _error);
        void g_permission_acquire_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_permission_acquire_finish(long _self, long result, long _error);
        boolean g_permission_get_allowed(long _self);
        boolean g_permission_get_can_acquire(long _self);
        boolean g_permission_get_can_release(long _self);
        void g_permission_impl_update(long _self, boolean allowed, boolean can_acquire, boolean can_release);
        boolean g_permission_release(long _self, long cancellable, long _error);
        void g_permission_release_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_permission_release_finish(long _self, long result, long _error);
        long g_permission_get_type();
    }

}
