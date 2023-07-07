/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaPollableInputStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_pollable_input_stream_can_poll(long _self);
        long g_pollable_input_stream_create_source(long _self, long cancellable);
        boolean g_pollable_input_stream_is_readable(long _self);
        long g_pollable_input_stream_read_nonblocking(long _self, long buffer, long count, long cancellable, long _error);
        long g_pollable_input_stream_get_type();
    }

}
