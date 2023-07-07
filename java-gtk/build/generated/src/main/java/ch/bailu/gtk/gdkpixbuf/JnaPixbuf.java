/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbuf {

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
        long gdk_pixbuf_new(int colorspace, boolean has_alpha, int bits_per_sample, int width, int height);
        long gdk_pixbuf_new_from_bytes(long data, int colorspace, boolean has_alpha, int bits_per_sample, int width, int height, int rowstride);
        long gdk_pixbuf_new_from_file(long filename, long _error);
        long gdk_pixbuf_new_from_file(String filename, long _error);
        long gdk_pixbuf_new_from_file_at_scale(long filename, int width, int height, boolean preserve_aspect_ratio, long _error);
        long gdk_pixbuf_new_from_file_at_scale(String filename, int width, int height, boolean preserve_aspect_ratio, long _error);
        long gdk_pixbuf_new_from_file_at_size(long filename, int width, int height, long _error);
        long gdk_pixbuf_new_from_file_at_size(String filename, int width, int height, long _error);
        long gdk_pixbuf_new_from_resource(long resource_path, long _error);
        long gdk_pixbuf_new_from_resource(String resource_path, long _error);
        long gdk_pixbuf_new_from_resource_at_scale(long resource_path, int width, int height, boolean preserve_aspect_ratio, long _error);
        long gdk_pixbuf_new_from_resource_at_scale(String resource_path, int width, int height, boolean preserve_aspect_ratio, long _error);
        long gdk_pixbuf_new_from_stream(long stream, long cancellable, long _error);
        long gdk_pixbuf_new_from_stream_at_scale(long stream, int width, int height, boolean preserve_aspect_ratio, long cancellable, long _error);
        long gdk_pixbuf_new_from_stream_finish(long async_result, long _error);
        long gdk_pixbuf_new_from_xpm_data(long data);
        long gdk_pixbuf_apply_embedded_orientation(long _self);
        void gdk_pixbuf_composite(long _self, long dest, int dest_x, int dest_y, int dest_width, int dest_height, double offset_x, double offset_y, double scale_x, double scale_y, int interp_type, int overall_alpha);
        void gdk_pixbuf_composite_color(long _self, long dest, int dest_x, int dest_y, int dest_width, int dest_height, double offset_x, double offset_y, double scale_x, double scale_y, int interp_type, int overall_alpha, int check_x, int check_y, int check_size, int color1, int color2);
        long gdk_pixbuf_composite_color_simple(long _self, int dest_width, int dest_height, int interp_type, int overall_alpha, int check_size, int color1, int color2);
        long gdk_pixbuf_copy(long _self);
        void gdk_pixbuf_copy_area(long _self, int src_x, int src_y, int width, int height, long dest_pixbuf, int dest_x, int dest_y);
        boolean gdk_pixbuf_copy_options(long _self, long dest_pixbuf);
        void gdk_pixbuf_fill(long _self, int pixel);
        long gdk_pixbuf_flip(long _self, boolean horizontal);
        int gdk_pixbuf_get_bits_per_sample(long _self);
        long gdk_pixbuf_get_byte_length(long _self);
        int gdk_pixbuf_get_colorspace(long _self);
        boolean gdk_pixbuf_get_has_alpha(long _self);
        int gdk_pixbuf_get_height(long _self);
        int gdk_pixbuf_get_n_channels(long _self);
        long gdk_pixbuf_get_option(long _self, long key);
        long gdk_pixbuf_get_option(long _self, String key);
        long gdk_pixbuf_get_options(long _self);
        int gdk_pixbuf_get_rowstride(long _self);
        int gdk_pixbuf_get_width(long _self);
        long gdk_pixbuf_new_subpixbuf(long _self, int src_x, int src_y, int width, int height);
        long gdk_pixbuf_read_pixel_bytes(long _self);
        boolean gdk_pixbuf_remove_option(long _self, long key);
        boolean gdk_pixbuf_remove_option(long _self, String key);
        long gdk_pixbuf_rotate_simple(long _self, int angle);
        void gdk_pixbuf_saturate_and_pixelate(long _self, long dest, float saturation, boolean pixelate);
        void gdk_pixbuf_save_to_stream_async(long _self, long stream, long type, long cancellable, com.sun.jna.Callback callback, long user_data, java.lang.Object... _elipse);
        void gdk_pixbuf_save_to_stream_async(long _self, long stream, String type, long cancellable, com.sun.jna.Callback callback, long user_data, java.lang.Object... _elipse);
        boolean gdk_pixbuf_save_to_streamv(long _self, long stream, long type, long option_keys, long option_values, long cancellable, long _error);
        boolean gdk_pixbuf_save_to_streamv(long _self, long stream, String type, long option_keys, long option_values, long cancellable, long _error);
        boolean gdk_pixbuf_savev(long _self, long filename, long type, long option_keys, long option_values, long _error);
        boolean gdk_pixbuf_savev(long _self, String filename, String type, long option_keys, long option_values, long _error);
        void gdk_pixbuf_scale(long _self, long dest, int dest_x, int dest_y, int dest_width, int dest_height, double offset_x, double offset_y, double scale_x, double scale_y, int interp_type);
        long gdk_pixbuf_scale_simple(long _self, int dest_width, int dest_height, int interp_type);
        boolean gdk_pixbuf_set_option(long _self, long key, long value);
        boolean gdk_pixbuf_set_option(long _self, String key, String value);
        int gdk_pixbuf_calculate_rowstride(int colorspace, boolean has_alpha, int bits_per_sample, int width, int height);
        long gdk_pixbuf_get_file_info(long filename, long width, long height);
        void gdk_pixbuf_get_file_info_async(long filename, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_pixbuf_get_file_info_finish(long async_result, long width, long height, long _error);
        long gdk_pixbuf_get_formats();
        boolean gdk_pixbuf_init_modules(long path, long _error);
        void gdk_pixbuf_new_from_stream_async(long stream, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gdk_pixbuf_new_from_stream_at_scale_async(long stream, int width, int height, boolean preserve_aspect_ratio, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gdk_pixbuf_save_to_stream_finish(long async_result, long _error);
        long gdk_pixbuf_get_type();
    }

}
