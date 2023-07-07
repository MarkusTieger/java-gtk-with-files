/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaConverterOutputStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_converter_output_stream_new(long base_stream, long converter);
        long g_converter_output_stream_get_converter(long _self);
        long g_converter_output_stream_get_type();
    }

}
