/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketAddressEnumerator {

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
        long g_socket_address_enumerator_next(long _self, long cancellable, long _error);
        void g_socket_address_enumerator_next_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_socket_address_enumerator_next_finish(long _self, long result, long _error);
        long g_socket_address_enumerator_get_type();
    }

}
