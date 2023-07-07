/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaLoadableIcon {

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
        long g_loadable_icon_load(long _self, int size, long type, long cancellable, long _error);
        void g_loadable_icon_load_async(long _self, int size, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_loadable_icon_load_finish(long _self, long res, long type, long _error);
        long g_loadable_icon_get_type();
    }

}
