/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGrid {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_grid_new();
        void gtk_grid_attach(long _self, long child, int column, int row, int width, int height);
        void gtk_grid_attach_next_to(long _self, long child, long sibling, int side, int width, int height);
        int gtk_grid_get_baseline_row(long _self);
        long gtk_grid_get_child_at(long _self, int column, int row);
        boolean gtk_grid_get_column_homogeneous(long _self);
        int gtk_grid_get_column_spacing(long _self);
        int gtk_grid_get_row_baseline_position(long _self, int row);
        boolean gtk_grid_get_row_homogeneous(long _self);
        int gtk_grid_get_row_spacing(long _self);
        void gtk_grid_insert_column(long _self, int position);
        void gtk_grid_insert_next_to(long _self, long sibling, int side);
        void gtk_grid_insert_row(long _self, int position);
        void gtk_grid_query_child(long _self, long child, long column, long row, long width, long height);
        void gtk_grid_remove(long _self, long child);
        void gtk_grid_remove_column(long _self, int position);
        void gtk_grid_remove_row(long _self, int position);
        void gtk_grid_set_baseline_row(long _self, int row);
        void gtk_grid_set_column_homogeneous(long _self, boolean homogeneous);
        void gtk_grid_set_column_spacing(long _self, int spacing);
        void gtk_grid_set_row_baseline_position(long _self, int row, int pos);
        void gtk_grid_set_row_homogeneous(long _self, boolean homogeneous);
        void gtk_grid_set_row_spacing(long _self, int spacing);
        long gtk_grid_get_type();
    }

}
