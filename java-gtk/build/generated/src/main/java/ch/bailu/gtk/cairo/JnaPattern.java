/* this file is machine generated */
package ch.bailu.gtk.cairo;




class JnaPattern {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("cairo", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long cairo_pattern_create_linear(double x0, double y0, double x1, double y1);
        long cairo_pattern_create_for_surface(long surface);
        void cairo_pattern_add_color_stop_rgb(long _self, double offset, double red, double green, double blue);
        void cairo_pattern_add_color_stop_rgba(long _self, double offset, double red, double green, double blue, double alpha);
        void cairo_pattern_set_extend(long _self, int extend);
        void cairo_pattern_destroy(long _self);
        long cairo_gobject_pattern_get_type();
    }

}
