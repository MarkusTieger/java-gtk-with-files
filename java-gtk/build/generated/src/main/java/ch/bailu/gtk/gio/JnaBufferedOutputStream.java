/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaBufferedOutputStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_buffered_output_stream_new(long base_stream);
        long g_buffered_output_stream_new_sized(long base_stream, long size);
        boolean g_buffered_output_stream_get_auto_grow(long _self);
        long g_buffered_output_stream_get_buffer_size(long _self);
        void g_buffered_output_stream_set_auto_grow(long _self, boolean auto_grow);
        void g_buffered_output_stream_set_buffer_size(long _self, long size);
        long g_buffered_output_stream_get_type();
    }

}
