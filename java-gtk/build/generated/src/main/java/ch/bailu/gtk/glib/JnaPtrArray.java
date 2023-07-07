/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaPtrArray {

    @FunctionalInterface
    public interface OnCopyFunc extends com.sun.jna.Callback {
        long invoke(long src, long user_data);
    }

    @FunctionalInterface
    public interface OnFunc extends com.sun.jna.Callback {
        void invoke(long data, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnCompareFunc extends com.sun.jna.Callback {
        int invoke(long a, long b);
    }

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_ptr_array_add(long array, long data);
        long g_ptr_array_copy(long array, com.sun.jna.Callback func, long user_data);
        void g_ptr_array_extend(long array_to_extend, long array, com.sun.jna.Callback func, long user_data);
        void g_ptr_array_extend_and_steal(long array_to_extend, long array);
        void g_ptr_array_foreach(long array, com.sun.jna.Callback func, long user_data);
        void g_ptr_array_insert(long array, int index_, long data);
        boolean g_ptr_array_is_null_terminated(long array);
        long g_ptr_array_new();
        long g_ptr_array_new_full(int reserved_size, com.sun.jna.Callback element_free_func);
        long g_ptr_array_new_null_terminated(int reserved_size, com.sun.jna.Callback element_free_func, boolean null_terminated);
        long g_ptr_array_new_with_free_func(com.sun.jna.Callback element_free_func);
        long g_ptr_array_ref(long array);
        boolean g_ptr_array_remove(long array, long data);
        boolean g_ptr_array_remove_fast(long array, long data);
        long g_ptr_array_remove_index(long array, int index_);
        long g_ptr_array_remove_index_fast(long array, int index_);
        long g_ptr_array_remove_range(long array, int index_, int length);
        void g_ptr_array_set_free_func(long array, com.sun.jna.Callback element_free_func);
        void g_ptr_array_set_size(long array, int length);
        long g_ptr_array_sized_new(int reserved_size);
        void g_ptr_array_sort(long array, com.sun.jna.Callback compare_func);
        void g_ptr_array_sort_with_data(long array, com.sun.jna.Callback compare_func, long user_data);
        long g_ptr_array_steal_index(long array, int index_);
        long g_ptr_array_steal_index_fast(long array, int index_);
        void g_ptr_array_unref(long array);
        long g_ptr_array_get_type();
    }

}
