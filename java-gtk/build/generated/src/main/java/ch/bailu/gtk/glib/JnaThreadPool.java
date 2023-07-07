/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaThreadPool {

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    @FunctionalInterface
    public interface OnFunc extends com.sun.jna.Callback {
        void invoke(long data, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ThreadPool size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ThreadPool.FUNC, ThreadPool.USER_DATA, ThreadPool.EXCLUSIVE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnFunc func;
        public long user_data;
        public boolean exclusive;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_thread_pool_free(long _self, boolean immediate, boolean wait_);
        int g_thread_pool_get_max_threads(long _self);
        int g_thread_pool_get_num_threads(long _self);
        boolean g_thread_pool_move_to_front(long _self, long data);
        boolean g_thread_pool_push(long _self, long data, long _error);
        boolean g_thread_pool_set_max_threads(long _self, int max_threads, long _error);
        void g_thread_pool_set_sort_function(long _self, com.sun.jna.Callback func, long user_data);
        int g_thread_pool_unprocessed(long _self);
        int g_thread_pool_get_max_idle_time();
        int g_thread_pool_get_max_unused_threads();
        int g_thread_pool_get_num_unused_threads();
        long g_thread_pool_new(com.sun.jna.Callback func, long user_data, int max_threads, boolean exclusive, long _error);
        long g_thread_pool_new_full(com.sun.jna.Callback func, long user_data, com.sun.jna.Callback item_free_func, int max_threads, boolean exclusive, long _error);
        void g_thread_pool_set_max_idle_time(int interval);
        void g_thread_pool_set_max_unused_threads(int max_threads);
        void g_thread_pool_stop_unused_threads();
    }

}
