/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDrop {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gdk_drop_finish(long _self, int action);
        int gdk_drop_get_actions(long _self);
        long gdk_drop_get_device(long _self);
        long gdk_drop_get_display(long _self);
        long gdk_drop_get_drag(long _self);
        long gdk_drop_get_formats(long _self);
        long gdk_drop_get_surface(long _self);
        void gdk_drop_read_async(long _self, long mime_types, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_drop_read_finish(long _self, long result, long out_mime_type, long _error);
        void gdk_drop_read_value_async(long _self, long type, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_drop_read_value_finish(long _self, long result, long _error);
        void gdk_drop_status(long _self, int actions, int preferred);
        long gdk_drop_get_type();
    }

}
