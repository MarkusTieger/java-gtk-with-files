/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaGdk {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnContentDeserializeFunc extends com.sun.jna.Callback {
        void invoke(long deserializer);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnContentSerializeFunc extends com.sun.jna.Callback {
        void invoke(long serializer);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gdk_cairo_rectangle(long cr, long rectangle);
        void gdk_cairo_region(long cr, long region);
        long gdk_cairo_region_create_from_surface(long surface);
        void gdk_cairo_set_source_pixbuf(long cr, long pixbuf, double pixbuf_x, double pixbuf_y);
        void gdk_cairo_set_source_rgba(long cr, long rgba);
        void gdk_content_deserialize_async(long stream, long mime_type, long type, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gdk_content_deserialize_finish(long result, long value, long _error);
        long gdk_content_formats_parse(long string);
        void gdk_content_register_deserializer(long mime_type, long type, com.sun.jna.Callback deserialize, long data, com.sun.jna.Callback notify);
        void gdk_content_register_serializer(long type, long mime_type, com.sun.jna.Callback serialize, long data, com.sun.jna.Callback notify);
        void gdk_content_serialize_async(long stream, long mime_type, long value, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gdk_content_serialize_finish(long result, long _error);
        boolean gdk_drag_action_is_unique(int action);
        int gdk_gl_error_quark();
        long gdk_intern_mime_type(long string);
        int gdk_keyval_from_name(long keyval_name);
        boolean gdk_keyval_is_lower(int keyval);
        boolean gdk_keyval_is_upper(int keyval);
        long gdk_keyval_name(int keyval);
        int gdk_keyval_to_lower(int keyval);
        int gdk_keyval_to_unicode(int keyval);
        int gdk_keyval_to_upper(int keyval);
        long gdk_paintable_new_empty(int intrinsic_width, int intrinsic_height);
        long gdk_pixbuf_get_from_surface(long surface, int src_x, int src_y, int width, int height);
        long gdk_pixbuf_get_from_texture(long texture);
        void gdk_set_allowed_backends(long backends);
        int gdk_texture_error_quark();
        long gdk_toplevel_size_get_type();
        int gdk_unicode_to_keyval(int wc);
        int gdk_vulkan_error_quark();
    }

}
