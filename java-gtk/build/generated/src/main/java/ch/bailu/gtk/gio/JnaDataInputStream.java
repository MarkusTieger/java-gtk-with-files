/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDataInputStream {

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
        long g_data_input_stream_new(long base_stream);
        int g_data_input_stream_get_byte_order(long _self);
        int g_data_input_stream_get_newline_type(long _self);
        int g_data_input_stream_read_int16(long _self, long cancellable, long _error);
        int g_data_input_stream_read_int32(long _self, long cancellable, long _error);
        long g_data_input_stream_read_int64(long _self, long cancellable, long _error);
        long g_data_input_stream_read_line(long _self, long length, long cancellable, long _error);
        void g_data_input_stream_read_line_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_data_input_stream_read_line_finish(long _self, long result, long length, long _error);
        long g_data_input_stream_read_line_finish_utf8(long _self, long result, long length, long _error);
        long g_data_input_stream_read_line_utf8(long _self, long length, long cancellable, long _error);
        int g_data_input_stream_read_uint16(long _self, long cancellable, long _error);
        int g_data_input_stream_read_uint32(long _self, long cancellable, long _error);
        long g_data_input_stream_read_uint64(long _self, long cancellable, long _error);
        long g_data_input_stream_read_upto(long _self, long stop_chars, long stop_chars_len, long length, long cancellable, long _error);
        long g_data_input_stream_read_upto(long _self, String stop_chars, long stop_chars_len, long length, long cancellable, long _error);
        void g_data_input_stream_read_upto_async(long _self, long stop_chars, long stop_chars_len, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_data_input_stream_read_upto_async(long _self, String stop_chars, long stop_chars_len, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_data_input_stream_read_upto_finish(long _self, long result, long length, long _error);
        void g_data_input_stream_set_byte_order(long _self, int order);
        void g_data_input_stream_set_newline_type(long _self, int type);
        long g_data_input_stream_get_type();
    }

}
