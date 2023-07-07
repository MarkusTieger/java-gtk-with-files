/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIOStream {

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
        void g_io_stream_clear_pending(long _self);
        boolean g_io_stream_close(long _self, long cancellable, long _error);
        void g_io_stream_close_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_io_stream_close_finish(long _self, long result, long _error);
        long g_io_stream_get_input_stream(long _self);
        long g_io_stream_get_output_stream(long _self);
        boolean g_io_stream_has_pending(long _self);
        boolean g_io_stream_is_closed(long _self);
        boolean g_io_stream_set_pending(long _self, long _error);
        void g_io_stream_splice_async(long _self, long stream2, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_io_stream_splice_finish(long result, long _error);
        long g_io_stream_get_type();
    }

}
