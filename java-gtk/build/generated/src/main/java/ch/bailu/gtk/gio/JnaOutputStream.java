/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaOutputStream {

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
        void g_output_stream_clear_pending(long _self);
        boolean g_output_stream_close(long _self, long cancellable, long _error);
        void g_output_stream_close_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_output_stream_close_finish(long _self, long result, long _error);
        boolean g_output_stream_flush(long _self, long cancellable, long _error);
        void g_output_stream_flush_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_output_stream_flush_finish(long _self, long result, long _error);
        boolean g_output_stream_has_pending(long _self);
        boolean g_output_stream_is_closed(long _self);
        boolean g_output_stream_is_closing(long _self);
        boolean g_output_stream_set_pending(long _self, long _error);
        long g_output_stream_splice(long _self, long source, int flags, long cancellable, long _error);
        void g_output_stream_splice_async(long _self, long source, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_output_stream_splice_finish(long _self, long result, long _error);
        long g_output_stream_write(long _self, long buffer, long count, long cancellable, long _error);
        boolean g_output_stream_write_all(long _self, long buffer, long count, long bytes_written, long cancellable, long _error);
        void g_output_stream_write_all_async(long _self, long buffer, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_output_stream_write_all_finish(long _self, long result, long bytes_written, long _error);
        void g_output_stream_write_async(long _self, long buffer, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_output_stream_write_bytes(long _self, long bytes, long cancellable, long _error);
        void g_output_stream_write_bytes_async(long _self, long bytes, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_output_stream_write_bytes_finish(long _self, long result, long _error);
        long g_output_stream_write_finish(long _self, long result, long _error);
        boolean g_output_stream_writev_all_finish(long _self, long result, long bytes_written, long _error);
        boolean g_output_stream_writev_finish(long _self, long result, long bytes_written, long _error);
        long g_output_stream_get_type();
    }

}
