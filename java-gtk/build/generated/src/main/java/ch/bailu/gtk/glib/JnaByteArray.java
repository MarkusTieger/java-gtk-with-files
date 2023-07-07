/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaByteArray {

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
        long g_byte_array_free_to_bytes(long array);
        long g_byte_array_new();
        long g_byte_array_ref(long array);
        long g_byte_array_remove_index(long array, int index_);
        long g_byte_array_remove_index_fast(long array, int index_);
        long g_byte_array_remove_range(long array, int index_, int length);
        long g_byte_array_set_size(long array, int length);
        long g_byte_array_sized_new(int reserved_size);
        void g_byte_array_sort(long array, com.sun.jna.Callback compare_func);
        void g_byte_array_sort_with_data(long array, com.sun.jna.Callback compare_func, long user_data);
        void g_byte_array_unref(long array);
        long g_byte_array_get_type();
    }

}
