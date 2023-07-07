/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaAsyncResult {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_async_result_get_source_object(long _self);
        long g_async_result_get_user_data(long _self);
        boolean g_async_result_is_tagged(long _self, long source_tag);
        boolean g_async_result_legacy_propagate_error(long _self, long _error);
        long g_async_result_get_type();
    }

}
