/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaThreadedSocketService {

    @FunctionalInterface
    public interface OnRun extends com.sun.jna.Callback {
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
        long g_threaded_socket_service_new(int max_threads);
        long g_threaded_socket_service_get_type();
    }

}
