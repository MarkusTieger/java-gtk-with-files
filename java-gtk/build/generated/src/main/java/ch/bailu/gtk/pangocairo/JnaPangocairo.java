/* this file is machine generated */
package ch.bailu.gtk.pangocairo;




class JnaPangocairo {

    @FunctionalInterface
    public interface OnShapeRendererFunc extends com.sun.jna.Callback {
        void invoke(long cr, long attr, boolean do_path, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pangocairo-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_cairo_context_get_font_options(long context);
        double pango_cairo_context_get_resolution(long context);
        void pango_cairo_context_set_font_options(long context, long options);
        void pango_cairo_context_set_resolution(long context, double dpi);
        void pango_cairo_context_set_shape_renderer(long context, com.sun.jna.Callback func, long data, com.sun.jna.Callback dnotify);
        long pango_cairo_create_context(long cr);
        long pango_cairo_create_layout(long cr);
        void pango_cairo_error_underline_path(long cr, double x, double y, double width, double height);
        long pango_cairo_font_map_get_default();
        long pango_cairo_font_map_new();
        long pango_cairo_font_map_new_for_font_type(int fonttype);
        void pango_cairo_glyph_string_path(long cr, long font, long glyphs);
        void pango_cairo_layout_line_path(long cr, long line);
        void pango_cairo_layout_path(long cr, long layout);
        void pango_cairo_show_error_underline(long cr, double x, double y, double width, double height);
        void pango_cairo_show_glyph_item(long cr, long text, long glyph_item);
        void pango_cairo_show_glyph_string(long cr, long font, long glyphs);
        void pango_cairo_show_layout(long cr, long layout);
        void pango_cairo_show_layout_line(long cr, long line);
        void pango_cairo_update_context(long cr, long context);
        void pango_cairo_update_layout(long cr, long layout);
    }

}
