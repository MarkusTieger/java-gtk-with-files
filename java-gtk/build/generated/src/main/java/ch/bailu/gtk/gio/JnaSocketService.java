/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketService {

    @FunctionalInterface
    public interface OnIncoming extends com.sun.jna.Callback {
        boolean invoke(long _self, long connection, long source_object, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_socket_service_new();
        boolean g_socket_service_is_active(long _self);
        void g_socket_service_start(long _self);
        void g_socket_service_stop(long _self);
        long g_socket_service_get_type();
    }

}
