/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaInputStream {

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
        void g_input_stream_clear_pending(long _self);
        boolean g_input_stream_close(long _self, long cancellable, long _error);
        void g_input_stream_close_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_input_stream_close_finish(long _self, long result, long _error);
        boolean g_input_stream_has_pending(long _self);
        boolean g_input_stream_is_closed(long _self);
        long g_input_stream_read(long _self, long buffer, long count, long cancellable, long _error);
        boolean g_input_stream_read_all(long _self, long buffer, long count, long bytes_read, long cancellable, long _error);
        void g_input_stream_read_all_async(long _self, long buffer, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_input_stream_read_all_finish(long _self, long result, long bytes_read, long _error);
        void g_input_stream_read_async(long _self, long buffer, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_input_stream_read_bytes(long _self, long count, long cancellable, long _error);
        void g_input_stream_read_bytes_async(long _self, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_input_stream_read_bytes_finish(long _self, long result, long _error);
        long g_input_stream_read_finish(long _self, long result, long _error);
        boolean g_input_stream_set_pending(long _self, long _error);
        long g_input_stream_skip(long _self, long count, long cancellable, long _error);
        void g_input_stream_skip_async(long _self, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_input_stream_skip_finish(long _self, long result, long _error);
        long g_input_stream_get_type();
    }

}
