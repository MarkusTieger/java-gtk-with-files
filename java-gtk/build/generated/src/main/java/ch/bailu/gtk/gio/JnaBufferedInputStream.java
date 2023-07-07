/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaBufferedInputStream {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_buffered_input_stream_new(long base_stream);
        long g_buffered_input_stream_new_sized(long base_stream, long size);
        long g_buffered_input_stream_fill(long _self, long count, long cancellable, long _error);
        void g_buffered_input_stream_fill_async(long _self, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_buffered_input_stream_fill_finish(long _self, long result, long _error);
        long g_buffered_input_stream_get_available(long _self);
        long g_buffered_input_stream_get_buffer_size(long _self);
        long g_buffered_input_stream_peek(long _self, long buffer, long offset, long count);
        long g_buffered_input_stream_peek_buffer(long _self, long count);
        int g_buffered_input_stream_read_byte(long _self, long cancellable, long _error);
        void g_buffered_input_stream_set_buffer_size(long _self, long size);
        long g_buffered_input_stream_get_type();
    }

}
