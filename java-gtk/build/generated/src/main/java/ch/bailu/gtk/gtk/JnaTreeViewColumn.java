/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeViewColumn {

    @FunctionalInterface
    public interface OnTreeCellDataFunc extends com.sun.jna.Callback {
        void invoke(long tree_column, long cell, long tree_model, long iter, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnClicked extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_view_column_new();
        long gtk_tree_view_column_new_with_area(long area);
        long gtk_tree_view_column_new_with_attributes(long title, long cell, java.lang.Object... _elipse);
        long gtk_tree_view_column_new_with_attributes(String title, long cell, java.lang.Object... _elipse);
        void gtk_tree_view_column_add_attribute(long _self, long cell_renderer, long attribute, int column);
        void gtk_tree_view_column_add_attribute(long _self, long cell_renderer, String attribute, int column);
        boolean gtk_tree_view_column_cell_get_position(long _self, long cell_renderer, long x_offset, long width);
        void gtk_tree_view_column_cell_get_size(long _self, long x_offset, long y_offset, long width, long height);
        boolean gtk_tree_view_column_cell_is_visible(long _self);
        void gtk_tree_view_column_cell_set_cell_data(long _self, long tree_model, long iter, boolean is_expander, boolean is_expanded);
        void gtk_tree_view_column_clear(long _self);
        void gtk_tree_view_column_clear_attributes(long _self, long cell_renderer);
        void gtk_tree_view_column_clicked(long _self);
        void gtk_tree_view_column_focus_cell(long _self, long cell);
        float gtk_tree_view_column_get_alignment(long _self);
        long gtk_tree_view_column_get_button(long _self);
        boolean gtk_tree_view_column_get_clickable(long _self);
        boolean gtk_tree_view_column_get_expand(long _self);
        int gtk_tree_view_column_get_fixed_width(long _self);
        int gtk_tree_view_column_get_max_width(long _self);
        int gtk_tree_view_column_get_min_width(long _self);
        boolean gtk_tree_view_column_get_reorderable(long _self);
        boolean gtk_tree_view_column_get_resizable(long _self);
        int gtk_tree_view_column_get_sizing(long _self);
        int gtk_tree_view_column_get_sort_column_id(long _self);
        boolean gtk_tree_view_column_get_sort_indicator(long _self);
        int gtk_tree_view_column_get_sort_order(long _self);
        int gtk_tree_view_column_get_spacing(long _self);
        long gtk_tree_view_column_get_title(long _self);
        long gtk_tree_view_column_get_tree_view(long _self);
        boolean gtk_tree_view_column_get_visible(long _self);
        long gtk_tree_view_column_get_widget(long _self);
        int gtk_tree_view_column_get_width(long _self);
        int gtk_tree_view_column_get_x_offset(long _self);
        void gtk_tree_view_column_pack_end(long _self, long cell, boolean expand);
        void gtk_tree_view_column_pack_start(long _self, long cell, boolean expand);
        void gtk_tree_view_column_queue_resize(long _self);
        void gtk_tree_view_column_set_alignment(long _self, float xalign);
        void gtk_tree_view_column_set_attributes(long _self, long cell_renderer, java.lang.Object... _elipse);
        void gtk_tree_view_column_set_cell_data_func(long _self, long cell_renderer, com.sun.jna.Callback func, long func_data, com.sun.jna.Callback destroy);
        void gtk_tree_view_column_set_clickable(long _self, boolean clickable);
        void gtk_tree_view_column_set_expand(long _self, boolean expand);
        void gtk_tree_view_column_set_fixed_width(long _self, int fixed_width);
        void gtk_tree_view_column_set_max_width(long _self, int max_width);
        void gtk_tree_view_column_set_min_width(long _self, int min_width);
        void gtk_tree_view_column_set_reorderable(long _self, boolean reorderable);
        void gtk_tree_view_column_set_resizable(long _self, boolean resizable);
        void gtk_tree_view_column_set_sizing(long _self, int type);
        void gtk_tree_view_column_set_sort_column_id(long _self, int sort_column_id);
        void gtk_tree_view_column_set_sort_indicator(long _self, boolean setting);
        void gtk_tree_view_column_set_sort_order(long _self, int order);
        void gtk_tree_view_column_set_spacing(long _self, int spacing);
        void gtk_tree_view_column_set_title(long _self, long title);
        void gtk_tree_view_column_set_title(long _self, String title);
        void gtk_tree_view_column_set_visible(long _self, boolean visible);
        void gtk_tree_view_column_set_widget(long _self, long widget);
        long gtk_tree_view_column_get_type();
    }

}
