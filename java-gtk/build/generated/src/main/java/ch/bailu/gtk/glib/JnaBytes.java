/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaBytes {

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
        long g_bytes_new(long data, long size);
        long g_bytes_new_static(long data, long size);
        long g_bytes_new_take(long data, long size);
        long g_bytes_new_with_free_func(long data, long size, com.sun.jna.Callback free_func, long user_data);
        int g_bytes_compare(long _self, long bytes2);
        boolean g_bytes_equal(long _self, long bytes2);
        long g_bytes_get_data(long _self, long size);
        long g_bytes_get_region(long _self, long element_size, long offset, long n_elements);
        long g_bytes_get_size(long _self);
        int g_bytes_hash(long _self);
        long g_bytes_new_from_bytes(long _self, long offset, long length);
        long g_bytes_ref(long _self);
        void g_bytes_unref(long _self);
        long g_bytes_unref_to_array(long _self);
        long g_bytes_unref_to_data(long _self, long size);
        long g_bytes_get_type();
    }

}
