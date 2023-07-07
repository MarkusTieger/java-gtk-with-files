/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaAsyncQueue {

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_async_queue_length(long _self);
        int g_async_queue_length_unlocked(long _self);
        void g_async_queue_lock(long _self);
        long g_async_queue_pop(long _self);
        long g_async_queue_pop_unlocked(long _self);
        void g_async_queue_push(long _self, long data);
        void g_async_queue_push_front(long _self, long item);
        void g_async_queue_push_front_unlocked(long _self, long item);
        void g_async_queue_push_sorted(long _self, long data, com.sun.jna.Callback func, long user_data);
        void g_async_queue_push_sorted_unlocked(long _self, long data, com.sun.jna.Callback func, long user_data);
        void g_async_queue_push_unlocked(long _self, long data);
        long g_async_queue_ref(long _self);
        boolean g_async_queue_remove(long _self, long item);
        boolean g_async_queue_remove_unlocked(long _self, long item);
        void g_async_queue_sort(long _self, com.sun.jna.Callback func, long user_data);
        void g_async_queue_sort_unlocked(long _self, com.sun.jna.Callback func, long user_data);
        long g_async_queue_timeout_pop(long _self, long timeout);
        long g_async_queue_timeout_pop_unlocked(long _self, long timeout);
        long g_async_queue_try_pop(long _self);
        long g_async_queue_try_pop_unlocked(long _self);
        void g_async_queue_unlock(long _self);
        void g_async_queue_unref(long _self);
        long g_async_queue_new();
        long g_async_queue_new_full(com.sun.jna.Callback item_free_func);
    }

}
