/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMemoryInputStream {

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
        long g_memory_input_stream_new();
        long g_memory_input_stream_new_from_bytes(long bytes);
        long g_memory_input_stream_new_from_data(long data, long len, com.sun.jna.Callback destroy);
        void g_memory_input_stream_add_bytes(long _self, long bytes);
        void g_memory_input_stream_add_data(long _self, long data, long len, com.sun.jna.Callback destroy);
        long g_memory_input_stream_get_type();
    }

}
