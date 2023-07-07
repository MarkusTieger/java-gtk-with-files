/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaLocationProxy {

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
        long gclue_location_proxy_new_finish(long res, long _error);
        long gclue_location_proxy_new_for_bus_finish(long res, long _error);
        long gclue_location_proxy_new_for_bus_sync(int bus_type, int flags, long name, long object_path, long cancellable, long _error);
        long gclue_location_proxy_new_for_bus_sync(int bus_type, int flags, String name, String object_path, long cancellable, long _error);
        long gclue_location_proxy_new_sync(long connection, int flags, long name, long object_path, long cancellable, long _error);
        long gclue_location_proxy_new_sync(long connection, int flags, String name, String object_path, long cancellable, long _error);
        void gclue_location_proxy_new(long connection, int flags, long name, long object_path, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gclue_location_proxy_new_for_bus(int bus_type, int flags, long name, long object_path, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gclue_location_proxy_get_type();
    }

}
