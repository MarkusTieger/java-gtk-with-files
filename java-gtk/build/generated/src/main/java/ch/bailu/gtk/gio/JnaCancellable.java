/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaCancellable {

    @FunctionalInterface
    public interface OnCallback extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnCancelled extends com.sun.jna.Callback {
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
        long g_cancellable_new();
        void g_cancellable_cancel(long _self);
        long g_cancellable_connect(long _self, com.sun.jna.Callback callback, long data, com.sun.jna.Callback data_destroy_func);
        void g_cancellable_disconnect(long _self, long handler_id);
        int g_cancellable_get_fd(long _self);
        boolean g_cancellable_is_cancelled(long _self);
        boolean g_cancellable_make_pollfd(long _self, long pollfd);
        void g_cancellable_pop_current(long _self);
        void g_cancellable_push_current(long _self);
        void g_cancellable_release_fd(long _self);
        void g_cancellable_reset(long _self);
        boolean g_cancellable_set_error_if_cancelled(long _self, long _error);
        long g_cancellable_source_new(long _self);
        long g_cancellable_get_current();
        long g_cancellable_get_type();
    }

}
