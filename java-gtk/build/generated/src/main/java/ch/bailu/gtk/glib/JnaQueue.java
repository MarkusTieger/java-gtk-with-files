/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaQueue {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnCompareFunc extends com.sun.jna.Callback {
        int invoke(long a, long b);
    }

    @FunctionalInterface
    public interface OnFunc extends com.sun.jna.Callback {
        void invoke(long data, long user_data);
    }

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Queue size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Queue.HEAD, Queue.TAIL, Queue.LENGTH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long head;
        public long tail;
        public int length;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_queue_clear(long _self);
        void g_queue_clear_full(long _self, com.sun.jna.Callback free_func);
        long g_queue_copy(long _self);
        void g_queue_delete_link(long _self, long link_);
        long g_queue_find(long _self, long data);
        long g_queue_find_custom(long _self, long data, com.sun.jna.Callback func);
        void g_queue_foreach(long _self, com.sun.jna.Callback func, long user_data);
        void g_queue_free(long _self);
        void g_queue_free_full(long _self, com.sun.jna.Callback free_func);
        int g_queue_get_length(long _self);
        int g_queue_index(long _self, long data);
        void g_queue_init(long _self);
        void g_queue_insert_after(long _self, long sibling, long data);
        void g_queue_insert_after_link(long _self, long sibling, long link_);
        void g_queue_insert_before(long _self, long sibling, long data);
        void g_queue_insert_before_link(long _self, long sibling, long link_);
        void g_queue_insert_sorted(long _self, long data, com.sun.jna.Callback func, long user_data);
        boolean g_queue_is_empty(long _self);
        int g_queue_link_index(long _self, long link_);
        long g_queue_peek_head(long _self);
        long g_queue_peek_head_link(long _self);
        long g_queue_peek_nth(long _self, int n);
        long g_queue_peek_nth_link(long _self, int n);
        long g_queue_peek_tail(long _self);
        long g_queue_peek_tail_link(long _self);
        long g_queue_pop_head(long _self);
        long g_queue_pop_head_link(long _self);
        long g_queue_pop_nth(long _self, int n);
        long g_queue_pop_nth_link(long _self, int n);
        long g_queue_pop_tail(long _self);
        long g_queue_pop_tail_link(long _self);
        void g_queue_push_head(long _self, long data);
        void g_queue_push_head_link(long _self, long link_);
        void g_queue_push_nth(long _self, long data, int n);
        void g_queue_push_nth_link(long _self, int n, long link_);
        void g_queue_push_tail(long _self, long data);
        void g_queue_push_tail_link(long _self, long link_);
        boolean g_queue_remove(long _self, long data);
        int g_queue_remove_all(long _self, long data);
        void g_queue_reverse(long _self);
        void g_queue_sort(long _self, com.sun.jna.Callback compare_func, long user_data);
        void g_queue_unlink(long _self, long link_);
        long g_queue_new();
    }

}
