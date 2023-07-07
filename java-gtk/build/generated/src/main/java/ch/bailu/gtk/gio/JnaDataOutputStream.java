/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDataOutputStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_data_output_stream_new(long base_stream);
        int g_data_output_stream_get_byte_order(long _self);
        boolean g_data_output_stream_put_int16(long _self, int data, long cancellable, long _error);
        boolean g_data_output_stream_put_int32(long _self, int data, long cancellable, long _error);
        boolean g_data_output_stream_put_int64(long _self, long data, long cancellable, long _error);
        boolean g_data_output_stream_put_string(long _self, long str, long cancellable, long _error);
        boolean g_data_output_stream_put_string(long _self, String str, long cancellable, long _error);
        boolean g_data_output_stream_put_uint16(long _self, int data, long cancellable, long _error);
        boolean g_data_output_stream_put_uint32(long _self, int data, long cancellable, long _error);
        boolean g_data_output_stream_put_uint64(long _self, long data, long cancellable, long _error);
        void g_data_output_stream_set_byte_order(long _self, int order);
        long g_data_output_stream_get_type();
    }

}
