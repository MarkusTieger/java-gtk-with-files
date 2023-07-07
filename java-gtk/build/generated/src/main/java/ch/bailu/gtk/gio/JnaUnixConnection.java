/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixConnection {

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
        long g_unix_connection_receive_credentials(long _self, long cancellable, long _error);
        void g_unix_connection_receive_credentials_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_unix_connection_receive_credentials_finish(long _self, long result, long _error);
        int g_unix_connection_receive_fd(long _self, long cancellable, long _error);
        boolean g_unix_connection_send_credentials(long _self, long cancellable, long _error);
        void g_unix_connection_send_credentials_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_unix_connection_send_credentials_finish(long _self, long result, long _error);
        boolean g_unix_connection_send_fd(long _self, int fd, long cancellable, long _error);
        long g_unix_connection_get_type();
    }

}
