/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGridLayoutChild {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gtk_grid_layout_child_get_column(long _self);
        int gtk_grid_layout_child_get_column_span(long _self);
        int gtk_grid_layout_child_get_row(long _self);
        int gtk_grid_layout_child_get_row_span(long _self);
        void gtk_grid_layout_child_set_column(long _self, int column);
        void gtk_grid_layout_child_set_column_span(long _self, int span);
        void gtk_grid_layout_child_set_row(long _self, int row);
        void gtk_grid_layout_child_set_row_span(long _self, int span);
        long gtk_grid_layout_child_get_type();
    }

}
