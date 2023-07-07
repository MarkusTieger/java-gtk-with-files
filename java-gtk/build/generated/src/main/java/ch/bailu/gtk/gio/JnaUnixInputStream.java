/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixInputStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_unix_input_stream_new(int fd, boolean close_fd);
        boolean g_unix_input_stream_get_close_fd(long _self);
        int g_unix_input_stream_get_fd(long _self);
        void g_unix_input_stream_set_close_fd(long _self, boolean close_fd);
        long g_unix_input_stream_get_type();
    }

}
