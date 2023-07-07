/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellLayout {

    @FunctionalInterface
    public interface OnCellLayoutDataFunc extends com.sun.jna.Callback {
        void invoke(long cell_layout, long cell, long tree_model, long iter, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_cell_layout_add_attribute(long _self, long cell, long attribute, int column);
        void gtk_cell_layout_add_attribute(long _self, long cell, String attribute, int column);
        void gtk_cell_layout_clear(long _self);
        void gtk_cell_layout_clear_attributes(long _self, long cell);
        long gtk_cell_layout_get_area(long _self);
        long gtk_cell_layout_get_cells(long _self);
        void gtk_cell_layout_pack_end(long _self, long cell, boolean expand);
        void gtk_cell_layout_pack_start(long _self, long cell, boolean expand);
        void gtk_cell_layout_reorder(long _self, long cell, int position);
        void gtk_cell_layout_set_attributes(long _self, long cell, java.lang.Object... _elipse);
        void gtk_cell_layout_set_cell_data_func(long _self, long cell, com.sun.jna.Callback func, long func_data, com.sun.jna.Callback destroy);
        long gtk_cell_layout_get_type();
    }

}
