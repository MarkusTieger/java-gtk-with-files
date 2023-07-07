/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufAnimation {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gdk_pixbuf-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_pixbuf_animation_new_from_file(long filename, long _error);
        long gdk_pixbuf_animation_new_from_file(String filename, long _error);
        long gdk_pixbuf_animation_new_from_resource(long resource_path, long _error);
        long gdk_pixbuf_animation_new_from_resource(String resource_path, long _error);
        long gdk_pixbuf_animation_new_from_stream(long stream, long cancellable, long _error);
        long gdk_pixbuf_animation_new_from_stream_finish(long async_result, long _error);
        int gdk_pixbuf_animation_get_height(long _self);
        long gdk_pixbuf_animation_get_iter(long _self, long start_time);
        long gdk_pixbuf_animation_get_static_image(long _self);
        int gdk_pixbuf_animation_get_width(long _self);
        boolean gdk_pixbuf_animation_is_static_image(long _self);
        void gdk_pixbuf_animation_new_from_stream_async(long stream, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_pixbuf_animation_get_type();
    }

}
