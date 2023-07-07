/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileOutputStream {

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
        long g_file_output_stream_get_etag(long _self);
        long g_file_output_stream_query_info(long _self, long attributes, long cancellable, long _error);
        long g_file_output_stream_query_info(long _self, String attributes, long cancellable, long _error);
        void g_file_output_stream_query_info_async(long _self, long attributes, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_file_output_stream_query_info_async(long _self, String attributes, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_output_stream_query_info_finish(long _self, long result, long _error);
        long g_file_output_stream_get_type();
    }

}
