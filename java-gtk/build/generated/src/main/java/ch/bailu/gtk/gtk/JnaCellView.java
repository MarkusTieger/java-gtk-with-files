/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellView {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_view_new();
        long gtk_cell_view_new_with_context(long area, long context);
        long gtk_cell_view_new_with_markup(long markup);
        long gtk_cell_view_new_with_markup(String markup);
        long gtk_cell_view_new_with_text(long text);
        long gtk_cell_view_new_with_text(String text);
        long gtk_cell_view_new_with_texture(long texture);
        long gtk_cell_view_get_displayed_row(long _self);
        boolean gtk_cell_view_get_draw_sensitive(long _self);
        boolean gtk_cell_view_get_fit_model(long _self);
        long gtk_cell_view_get_model(long _self);
        void gtk_cell_view_set_displayed_row(long _self, long path);
        void gtk_cell_view_set_draw_sensitive(long _self, boolean draw_sensitive);
        void gtk_cell_view_set_fit_model(long _self, boolean fit_model);
        void gtk_cell_view_set_model(long _self, long model);
        long gtk_cell_view_get_type();
    }

}
