/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMemoryOutputStream {

    @FunctionalInterface
    public interface OnReallocFunc extends com.sun.jna.Callback {
        long invoke(long data, long size);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_memory_output_stream_new(long data, long size, com.sun.jna.Callback realloc_function, com.sun.jna.Callback destroy_function);
        long g_memory_output_stream_new_resizable();
        long g_memory_output_stream_get_data(long _self);
        long g_memory_output_stream_get_data_size(long _self);
        long g_memory_output_stream_get_size(long _self);
        long g_memory_output_stream_steal_as_bytes(long _self);
        long g_memory_output_stream_steal_data(long _self);
        long g_memory_output_stream_get_type();
    }

}
