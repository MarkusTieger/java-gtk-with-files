/* this file is machine generated */
package ch.bailu.gtk.cairo;




class JnaSurface {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("cairo", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long cairo_create(long _self);
        void cairo_surface_destroy(long _self);
        int cairo_image_surface_get_format(long _self);
        int cairo_image_surface_get_stride(long _self);
        int cairo_image_surface_get_height(long _self);
        int cairo_image_surface_get_width(long _self);
        long cairo_image_surface_get_data(long _self);
        void cairo_surface_flush(long _self);
        void cairo_surface_mark_dirty(long _self);
        long cairo_gobject_surface_get_type();
    }

}
