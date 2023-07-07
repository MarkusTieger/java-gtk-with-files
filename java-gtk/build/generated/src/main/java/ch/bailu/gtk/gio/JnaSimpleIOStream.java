/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSimpleIOStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_simple_io_stream_new(long input_stream, long output_stream);
        long g_simple_io_stream_get_type();
    }

}
