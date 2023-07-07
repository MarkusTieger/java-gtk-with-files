/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaSequence {

    @FunctionalInterface
    public interface OnFunc extends com.sun.jna.Callback {
        void invoke(long data, long user_data);
    }

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    @FunctionalInterface
    public interface OnSequenceIterCompareFunc extends com.sun.jna.Callback {
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
        long g_sequence_append(long _self, long data);
        void g_sequence_foreach(long _self, com.sun.jna.Callback func, long user_data);
        void g_sequence_free(long _self);
        long g_sequence_get_begin_iter(long _self);
        long g_sequence_get_end_iter(long _self);
        long g_sequence_get_iter_at_pos(long _self, int pos);
        int g_sequence_get_length(long _self);
        long g_sequence_insert_sorted(long _self, long data, com.sun.jna.Callback cmp_func, long cmp_data);
        long g_sequence_insert_sorted_iter(long _self, long data, com.sun.jna.Callback iter_cmp, long cmp_data);
        boolean g_sequence_is_empty(long _self);
        long g_sequence_lookup(long _self, long data, com.sun.jna.Callback cmp_func, long cmp_data);
        long g_sequence_lookup_iter(long _self, long data, com.sun.jna.Callback iter_cmp, long cmp_data);
        long g_sequence_prepend(long _self, long data);
        long g_sequence_search(long _self, long data, com.sun.jna.Callback cmp_func, long cmp_data);
        long g_sequence_search_iter(long _self, long data, com.sun.jna.Callback iter_cmp, long cmp_data);
        void g_sequence_sort(long _self, com.sun.jna.Callback cmp_func, long cmp_data);
        void g_sequence_sort_iter(long _self, com.sun.jna.Callback cmp_func, long cmp_data);
        void g_sequence_foreach_range(long begin, long end, com.sun.jna.Callback func, long user_data);
        long g_sequence_get(long iter);
        long g_sequence_insert_before(long iter, long data);
        void g_sequence_move(long src, long dest);
        void g_sequence_move_range(long dest, long begin, long end);
        long g_sequence_new(com.sun.jna.Callback data_destroy);
        long g_sequence_range_get_midpoint(long begin, long end);
        void g_sequence_remove(long iter);
        void g_sequence_remove_range(long begin, long end);
        void g_sequence_set(long iter, long data);
        void g_sequence_sort_changed(long iter, com.sun.jna.Callback cmp_func, long cmp_data);
        void g_sequence_sort_changed_iter(long iter, com.sun.jna.Callback iter_cmp, long cmp_data);
        void g_sequence_swap(long a, long b);
    }

}
