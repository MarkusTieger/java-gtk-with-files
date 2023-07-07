/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFilterInputStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_filter_input_stream_get_base_stream(long _self);
        boolean g_filter_input_stream_get_close_base_stream(long _self);
        void g_filter_input_stream_set_close_base_stream(long _self, boolean close_base);
        long g_filter_input_stream_get_type();
    }

}
