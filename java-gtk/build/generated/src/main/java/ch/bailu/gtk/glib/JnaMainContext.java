/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaMainContext {

    @FunctionalInterface
    public interface OnSourceFunc extends com.sun.jna.Callback {
        boolean invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnPollFunc extends com.sun.jna.Callback {
        int invoke(long ufds, int nfsd, int timeout_);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_main_context_new();
        long g_main_context_new_with_flags(int flags);
        boolean g_main_context_acquire(long _self);
        void g_main_context_add_poll(long _self, long fd, int priority);
        void g_main_context_dispatch(long _self);
        long g_main_context_find_source_by_funcs_user_data(long _self, long funcs, long user_data);
        long g_main_context_find_source_by_id(long _self, int source_id);
        long g_main_context_find_source_by_user_data(long _self, long user_data);
        void g_main_context_invoke(long _self, com.sun.jna.Callback function, long data);
        void g_main_context_invoke_full(long _self, int priority, com.sun.jna.Callback function, long data, com.sun.jna.Callback notify);
        boolean g_main_context_is_owner(long _self);
        boolean g_main_context_iteration(long _self, boolean may_block);
        boolean g_main_context_pending(long _self);
        void g_main_context_pop_thread_default(long _self);
        boolean g_main_context_prepare(long _self, long priority);
        void g_main_context_push_thread_default(long _self);
        long g_main_context_ref(long _self);
        void g_main_context_release(long _self);
        void g_main_context_remove_poll(long _self, long fd);
        void g_main_context_set_poll_func(long _self, com.sun.jna.Callback func);
        void g_main_context_unref(long _self);
        void g_main_context_wakeup(long _self);
        long g_main_context_default();
        long g_main_context_get_thread_default();
        long g_main_context_ref_thread_default();
        long g_main_context_get_type();
    }

}
