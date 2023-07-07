/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaPollableOutputStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_pollable_output_stream_can_poll(long _self);
        long g_pollable_output_stream_create_source(long _self, long cancellable);
        boolean g_pollable_output_stream_is_writable(long _self);
        long g_pollable_output_stream_write_nonblocking(long _self, long buffer, long count, long cancellable, long _error);
        long g_pollable_output_stream_get_type();
    }

}
