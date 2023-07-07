/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_print_context_create_pango_context(long _self);
        long gtk_print_context_create_pango_layout(long _self);
        long gtk_print_context_get_cairo_context(long _self);
        double gtk_print_context_get_dpi_x(long _self);
        double gtk_print_context_get_dpi_y(long _self);
        double gtk_print_context_get_height(long _self);
        long gtk_print_context_get_page_setup(long _self);
        long gtk_print_context_get_pango_fontmap(long _self);
        double gtk_print_context_get_width(long _self);
        void gtk_print_context_set_cairo_context(long _self, long cr, double dpi_x, double dpi_y);
        long gtk_print_context_get_type();
    }

}
