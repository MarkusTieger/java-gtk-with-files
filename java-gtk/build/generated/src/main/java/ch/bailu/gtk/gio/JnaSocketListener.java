/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketListener {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnEvent extends com.sun.jna.Callback {
        void invoke(long _self, int event, long socket, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_socket_listener_new();
        void g_socket_listener_accept_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_socket_listener_accept_socket_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        int g_socket_listener_add_any_inet_port(long _self, long source_object, long _error);
        boolean g_socket_listener_add_inet_port(long _self, int port, long source_object, long _error);
        boolean g_socket_listener_add_socket(long _self, long socket, long source_object, long _error);
        void g_socket_listener_close(long _self);
        void g_socket_listener_set_backlog(long _self, int listen_backlog);
        long g_socket_listener_get_type();
    }

}
