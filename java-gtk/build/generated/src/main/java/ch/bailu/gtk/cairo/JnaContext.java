/* this file is machine generated */
package ch.bailu.gtk.cairo;




class JnaContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("cairo", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void cairo_save(long _self);
        void cairo_restore(long _self);
        void cairo_rotate(long _self, double angle);
        void cairo_paint(long _self);
        void cairo_paint(long _self, double alpha);
        void cairo_set_source_surface(long _self, long surface, double x, double y);
        void cairo_set_source(long _self, long source);
        void cairo_close_path(long _self);
        void cairo_set_operator(long _self, int operator);
        void cairo_set_line_width(long _self, double width);
        void cairo_set_antialias(long _self, int antialias);
        void cairo_move_to(long _self, double x, double y);
        void cairo_select_font_face(long _self, long utf8, int style, int weight);
        void cairo_select_font_face(long _self, String utf8, int style, int weight);
        void cairo_set_font_size(long _self, double size);
        void cairo_line_to(long _self, double x, double y);
        void cairo_arc(long _self, double xc, double yc, double radius, double angle1, double angle2);
        void cairo_set_fill_rule(long _self, int fill_rule);
        void cairo_curve_to(long _self, double x1, double y1, double x2, double y2, double x3, double y3);
        void cairo_stroke(long _self);
        void cairo_fill(long _self);
        void cairo_fill_preserve(long _self);
        void cairo_rectangle(long _self, double x, double y, double width, double height);
        void cairo_set_dash(long _self, long dashes, int num_dashes, double offset);
        void cairo_set_line_cap(long _self, int line_cap);
        void cairo_set_line_join(long _self, int line_join);
        void cairo_set_source_rgba(long _self, double red, double green, double blue, double alpha);
        void cairo_set_source_rgb(long _self, double red, double green, double blue);
        void cairo_destroy(long _self);
        void cairo_reset_clip(long _self);
        void cairo_clip(long _self);
        void cairo_new_path(long _self);
        void cairo_set_matrix(long _self, long matrix);
        void cairo_transform(long _self, long matrix);
        void cairo_identity_matrix(long _self);
        void cairo_show_text(long _self, long utf8);
        void cairo_show_text(long _self, String utf8);
        long cairo_get_source(long _self);
        void cairo_get_current_point(long _self, long x, long y);
        void cairo_translate(long _self, double x, double y);
        void cairo_scale(long _self, double x, double y);
        long cairo_gobject_context_get_type();
    }

}
