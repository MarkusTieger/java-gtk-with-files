/* this file is machine generated */
package ch.bailu.gtk.pangocairo;




class JnaFontMap {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pangocairo-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int pango_cairo_font_map_get_font_type(long _self);
        double pango_cairo_font_map_get_resolution(long _self);
        void pango_cairo_font_map_set_default(long _self);
        void pango_cairo_font_map_set_resolution(long _self, double dpi);
        long pango_cairo_font_map_get_default();
        long pango_cairo_font_map_new();
        long pango_cairo_font_map_new_for_font_type(int fonttype);
        long pango_cairo_font_map_get_type();
    }

}
