/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaAsyncInitable {

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
        void g_async_initable_init_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_async_initable_init_finish(long _self, long res, long _error);
        long g_async_initable_new_finish(long _self, long res, long _error);
        void g_async_initable_new_async(long object_type, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data, long first_property_name, java.lang.Object... _elipse);
        long g_async_initable_get_type();
    }

}
