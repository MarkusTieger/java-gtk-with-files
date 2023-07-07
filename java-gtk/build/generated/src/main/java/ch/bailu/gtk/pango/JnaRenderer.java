/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaRenderer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void pango_renderer_activate(long _self);
        void pango_renderer_deactivate(long _self);
        void pango_renderer_draw_error_underline(long _self, int x, int y, int width, int height);
        void pango_renderer_draw_glyph_item(long _self, long text, long glyph_item, int x, int y);
        void pango_renderer_draw_glyph_item(long _self, String text, long glyph_item, int x, int y);
        void pango_renderer_draw_glyphs(long _self, long font, long glyphs, int x, int y);
        void pango_renderer_draw_layout(long _self, long layout, int x, int y);
        void pango_renderer_draw_layout_line(long _self, long line, int x, int y);
        void pango_renderer_draw_rectangle(long _self, int part, int x, int y, int width, int height);
        void pango_renderer_draw_trapezoid(long _self, int part, double y1_, double x11, double x21, double y2, double x12, double x22);
        int pango_renderer_get_alpha(long _self, int part);
        long pango_renderer_get_color(long _self, int part);
        long pango_renderer_get_layout(long _self);
        long pango_renderer_get_layout_line(long _self);
        long pango_renderer_get_matrix(long _self);
        void pango_renderer_part_changed(long _self, int part);
        void pango_renderer_set_alpha(long _self, int part, int alpha);
        void pango_renderer_set_color(long _self, int part, long color);
        void pango_renderer_set_matrix(long _self, long matrix);
        long pango_renderer_get_type();
    }

}
