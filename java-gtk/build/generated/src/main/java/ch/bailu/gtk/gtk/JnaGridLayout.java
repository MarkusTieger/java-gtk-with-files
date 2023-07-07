/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGridLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_grid_layout_new();
        int gtk_grid_layout_get_baseline_row(long _self);
        boolean gtk_grid_layout_get_column_homogeneous(long _self);
        int gtk_grid_layout_get_column_spacing(long _self);
        int gtk_grid_layout_get_row_baseline_position(long _self, int row);
        boolean gtk_grid_layout_get_row_homogeneous(long _self);
        int gtk_grid_layout_get_row_spacing(long _self);
        void gtk_grid_layout_set_baseline_row(long _self, int row);
        void gtk_grid_layout_set_column_homogeneous(long _self, boolean homogeneous);
        void gtk_grid_layout_set_column_spacing(long _self, int spacing);
        void gtk_grid_layout_set_row_baseline_position(long _self, int row, int pos);
        void gtk_grid_layout_set_row_homogeneous(long _self, boolean homogeneous);
        void gtk_grid_layout_set_row_spacing(long _self, int spacing);
        long gtk_grid_layout_get_type();
    }

}
