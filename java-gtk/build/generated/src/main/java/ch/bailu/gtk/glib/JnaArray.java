/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaArray {

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

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Array size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Array.DATA, Array.LEN})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long data;
        public int len;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_array_append_vals(long array, long data, int len);
        long g_array_copy(long array);
        long g_array_free(long array, boolean free_segment);
        int g_array_get_element_size(long array);
        long g_array_insert_vals(long array, int index_, long data, int len);
        long g_array_new(boolean zero_terminated, boolean clear_, int element_size);
        long g_array_prepend_vals(long array, long data, int len);
        long g_array_ref(long array);
        long g_array_remove_index(long array, int index_);
        long g_array_remove_index_fast(long array, int index_);
        long g_array_remove_range(long array, int index_, int length);
        void g_array_set_clear_func(long array, com.sun.jna.Callback clear_func);
        long g_array_set_size(long array, int length);
        long g_array_sized_new(boolean zero_terminated, boolean clear_, int element_size, int reserved_size);
        void g_array_sort(long array, com.sun.jna.Callback compare_func);
        void g_array_sort_with_data(long array, com.sun.jna.Callback compare_func, long user_data);
        long g_array_steal(long array, long len);
        void g_array_unref(long array);
        long g_array_get_type();
    }

}
