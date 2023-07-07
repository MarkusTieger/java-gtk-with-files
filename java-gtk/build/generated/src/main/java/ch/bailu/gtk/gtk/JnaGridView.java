/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGridView {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, int position, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_grid_view_new(long model, long factory);
        boolean gtk_grid_view_get_enable_rubberband(long _self);
        long gtk_grid_view_get_factory(long _self);
        int gtk_grid_view_get_max_columns(long _self);
        int gtk_grid_view_get_min_columns(long _self);
        long gtk_grid_view_get_model(long _self);
        boolean gtk_grid_view_get_single_click_activate(long _self);
        void gtk_grid_view_set_enable_rubberband(long _self, boolean enable_rubberband);
        void gtk_grid_view_set_factory(long _self, long factory);
        void gtk_grid_view_set_max_columns(long _self, int max_columns);
        void gtk_grid_view_set_min_columns(long _self, int min_columns);
        void gtk_grid_view_set_model(long _self, long model);
        void gtk_grid_view_set_single_click_activate(long _self, boolean single_click_activate);
        long gtk_grid_view_get_type();
    }

}
