/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeView {

    @FunctionalInterface
    public interface OnTreeCellDataFunc extends com.sun.jna.Callback {
        void invoke(long tree_column, long cell, long tree_model, long iter, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnTreeViewMappingFunc extends com.sun.jna.Callback {
        void invoke(long tree_view, long path, long user_data);
    }

    @FunctionalInterface
    public interface OnTreeViewColumnDropFunc extends com.sun.jna.Callback {
        boolean invoke(long tree_view, long column, long prev_column, long next_column, long data);
    }

    @FunctionalInterface
    public interface OnTreeViewRowSeparatorFunc extends com.sun.jna.Callback {
        boolean invoke(long model, long iter, long data);
    }

    @FunctionalInterface
    public interface OnTreeViewSearchEqualFunc extends com.sun.jna.Callback {
        boolean invoke(long model, int column, long key, long iter, long search_data);
    }

    @FunctionalInterface
    public interface OnColumnsChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCursorChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnExpandCollapseCursorRow extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean object, boolean p0, boolean p1, long _data);
    }

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        boolean invoke(long _self, int step, int direction, boolean extend, boolean modify, long _data);
    }

    @FunctionalInterface
    public interface OnRowActivated extends com.sun.jna.Callback {
        void invoke(long _self, long path, long column, long _data);
    }

    @FunctionalInterface
    public interface OnRowCollapsed extends com.sun.jna.Callback {
        void invoke(long _self, long iter, long path, long _data);
    }

    @FunctionalInterface
    public interface OnRowExpanded extends com.sun.jna.Callback {
        void invoke(long _self, long iter, long path, long _data);
    }

    @FunctionalInterface
    public interface OnSelectAll extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSelectCursorParent extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSelectCursorRow extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean object, long _data);
    }

    @FunctionalInterface
    public interface OnStartInteractiveSearch extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnTestCollapseRow extends com.sun.jna.Callback {
        boolean invoke(long _self, long iter, long path, long _data);
    }

    @FunctionalInterface
    public interface OnTestExpandRow extends com.sun.jna.Callback {
        boolean invoke(long _self, long iter, long path, long _data);
    }

    @FunctionalInterface
    public interface OnToggleCursorRow extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUnselectAll extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_view_new();
        long gtk_tree_view_new_with_model(long model);
        int gtk_tree_view_append_column(long _self, long column);
        void gtk_tree_view_collapse_all(long _self);
        boolean gtk_tree_view_collapse_row(long _self, long path);
        void gtk_tree_view_columns_autosize(long _self);
        void gtk_tree_view_convert_bin_window_to_tree_coords(long _self, int bx, int by, long tx, long ty);
        void gtk_tree_view_convert_bin_window_to_widget_coords(long _self, int bx, int by, long wx, long wy);
        void gtk_tree_view_convert_tree_to_bin_window_coords(long _self, int tx, int ty, long bx, long by);
        void gtk_tree_view_convert_tree_to_widget_coords(long _self, int tx, int ty, long wx, long wy);
        void gtk_tree_view_convert_widget_to_bin_window_coords(long _self, int wx, int wy, long bx, long by);
        void gtk_tree_view_convert_widget_to_tree_coords(long _self, int wx, int wy, long tx, long ty);
        long gtk_tree_view_create_row_drag_icon(long _self, long path);
        void gtk_tree_view_enable_model_drag_dest(long _self, long formats, int actions);
        void gtk_tree_view_enable_model_drag_source(long _self, int start_button_mask, long formats, int actions);
        void gtk_tree_view_expand_all(long _self);
        boolean gtk_tree_view_expand_row(long _self, long path, boolean open_all);
        void gtk_tree_view_expand_to_path(long _self, long path);
        boolean gtk_tree_view_get_activate_on_single_click(long _self);
        void gtk_tree_view_get_background_area(long _self, long path, long column, long rect);
        void gtk_tree_view_get_cell_area(long _self, long path, long column, long rect);
        long gtk_tree_view_get_column(long _self, int n);
        long gtk_tree_view_get_columns(long _self);
        boolean gtk_tree_view_get_enable_search(long _self);
        boolean gtk_tree_view_get_enable_tree_lines(long _self);
        long gtk_tree_view_get_expander_column(long _self);
        boolean gtk_tree_view_get_fixed_height_mode(long _self);
        int gtk_tree_view_get_grid_lines(long _self);
        boolean gtk_tree_view_get_headers_clickable(long _self);
        boolean gtk_tree_view_get_headers_visible(long _self);
        boolean gtk_tree_view_get_hover_expand(long _self);
        boolean gtk_tree_view_get_hover_selection(long _self);
        int gtk_tree_view_get_level_indentation(long _self);
        long gtk_tree_view_get_model(long _self);
        int gtk_tree_view_get_n_columns(long _self);
        boolean gtk_tree_view_get_reorderable(long _self);
        boolean gtk_tree_view_get_rubber_banding(long _self);
        int gtk_tree_view_get_search_column(long _self);
        long gtk_tree_view_get_search_entry(long _self);
        long gtk_tree_view_get_selection(long _self);
        boolean gtk_tree_view_get_show_expanders(long _self);
        int gtk_tree_view_get_tooltip_column(long _self);
        void gtk_tree_view_get_visible_rect(long _self, long visible_rect);
        int gtk_tree_view_insert_column(long _self, long column, int position);
        int gtk_tree_view_insert_column_with_attributes(long _self, int position, long title, long cell, java.lang.Object... _elipse);
        int gtk_tree_view_insert_column_with_attributes(long _self, int position, String title, long cell, java.lang.Object... _elipse);
        int gtk_tree_view_insert_column_with_data_func(long _self, int position, long title, long cell, com.sun.jna.Callback func, long data, com.sun.jna.Callback dnotify);
        int gtk_tree_view_insert_column_with_data_func(long _self, int position, String title, long cell, com.sun.jna.Callback func, long data, com.sun.jna.Callback dnotify);
        boolean gtk_tree_view_is_rubber_banding_active(long _self);
        void gtk_tree_view_map_expanded_rows(long _self, com.sun.jna.Callback func, long data);
        void gtk_tree_view_move_column_after(long _self, long column, long base_column);
        int gtk_tree_view_remove_column(long _self, long column);
        void gtk_tree_view_row_activated(long _self, long path, long column);
        boolean gtk_tree_view_row_expanded(long _self, long path);
        void gtk_tree_view_scroll_to_cell(long _self, long path, long column, boolean use_align, float row_align, float col_align);
        void gtk_tree_view_scroll_to_point(long _self, int tree_x, int tree_y);
        void gtk_tree_view_set_activate_on_single_click(long _self, boolean single);
        void gtk_tree_view_set_column_drag_function(long _self, com.sun.jna.Callback func, long user_data, com.sun.jna.Callback destroy);
        void gtk_tree_view_set_cursor(long _self, long path, long focus_column, boolean start_editing);
        void gtk_tree_view_set_cursor_on_cell(long _self, long path, long focus_column, long focus_cell, boolean start_editing);
        void gtk_tree_view_set_drag_dest_row(long _self, long path, int pos);
        void gtk_tree_view_set_enable_search(long _self, boolean enable_search);
        void gtk_tree_view_set_enable_tree_lines(long _self, boolean enabled);
        void gtk_tree_view_set_expander_column(long _self, long column);
        void gtk_tree_view_set_fixed_height_mode(long _self, boolean enable);
        void gtk_tree_view_set_grid_lines(long _self, int grid_lines);
        void gtk_tree_view_set_headers_clickable(long _self, boolean setting);
        void gtk_tree_view_set_headers_visible(long _self, boolean headers_visible);
        void gtk_tree_view_set_hover_expand(long _self, boolean expand);
        void gtk_tree_view_set_hover_selection(long _self, boolean hover);
        void gtk_tree_view_set_level_indentation(long _self, int indentation);
        void gtk_tree_view_set_model(long _self, long model);
        void gtk_tree_view_set_reorderable(long _self, boolean reorderable);
        void gtk_tree_view_set_row_separator_func(long _self, com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy);
        void gtk_tree_view_set_rubber_banding(long _self, boolean enable);
        void gtk_tree_view_set_search_column(long _self, int column);
        void gtk_tree_view_set_search_entry(long _self, long entry);
        void gtk_tree_view_set_search_equal_func(long _self, com.sun.jna.Callback search_equal_func, long search_user_data, com.sun.jna.Callback search_destroy);
        void gtk_tree_view_set_show_expanders(long _self, boolean enabled);
        void gtk_tree_view_set_tooltip_cell(long _self, long tooltip, long path, long column, long cell);
        void gtk_tree_view_set_tooltip_column(long _self, int column);
        void gtk_tree_view_set_tooltip_row(long _self, long tooltip, long path);
        void gtk_tree_view_unset_rows_drag_dest(long _self);
        void gtk_tree_view_unset_rows_drag_source(long _self);
        long gtk_tree_view_get_type();
    }

}
