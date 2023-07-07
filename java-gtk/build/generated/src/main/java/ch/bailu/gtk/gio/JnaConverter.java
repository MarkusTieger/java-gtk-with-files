/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaConverter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_converter_convert(long _self, long inbuf, long inbuf_size, long outbuf, long outbuf_size, int flags, long bytes_read, long bytes_written, long _error);
        void g_converter_reset(long _self);
        long g_converter_get_type();
    }

}
