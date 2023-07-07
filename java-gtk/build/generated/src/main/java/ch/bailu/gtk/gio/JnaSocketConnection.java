/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketConnection {

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
        boolean g_socket_connection_connect(long _self, long address, long cancellable, long _error);
        void g_socket_connection_connect_async(long _self, long address, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_socket_connection_connect_finish(long _self, long result, long _error);
        long g_socket_connection_get_local_address(long _self, long _error);
        long g_socket_connection_get_remote_address(long _self, long _error);
        long g_socket_connection_get_socket(long _self);
        boolean g_socket_connection_is_connected(long _self);
        long g_socket_connection_factory_lookup_type(int family, int type, int protocol_id);
        void g_socket_connection_factory_register_type(long g_type, int family, int type, int protocol);
        long g_socket_connection_get_type();
    }

}
