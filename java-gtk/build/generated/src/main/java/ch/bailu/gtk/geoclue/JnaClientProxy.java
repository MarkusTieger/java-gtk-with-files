/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaClientProxy {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gclue_client_proxy_new_finish(long res, long _error);
        long gclue_client_proxy_new_for_bus_finish(long res, long _error);
        long gclue_client_proxy_new_for_bus_sync(int bus_type, int flags, long name, long object_path, long cancellable, long _error);
        long gclue_client_proxy_new_for_bus_sync(int bus_type, int flags, String name, String object_path, long cancellable, long _error);
        long gclue_client_proxy_new_sync(long connection, int flags, long name, long object_path, long cancellable, long _error);
        long gclue_client_proxy_new_sync(long connection, int flags, String name, String object_path, long cancellable, long _error);
        void gclue_client_proxy_create(long desktop_id, int accuracy_level, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gclue_client_proxy_create_finish(long result, long _error);
        void gclue_client_proxy_create_full(long desktop_id, int accuracy_level, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gclue_client_proxy_create_full_finish(long result, long _error);
        long gclue_client_proxy_create_full_sync(long desktop_id, int accuracy_level, int flags, long cancellable, long _error);
        long gclue_client_proxy_create_sync(long desktop_id, int accuracy_level, long cancellable, long _error);
        void gclue_client_proxy_new(long connection, int flags, long name, long object_path, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gclue_client_proxy_new_for_bus(int bus_type, int flags, long name, long object_path, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gclue_client_proxy_get_type();
    }

}
