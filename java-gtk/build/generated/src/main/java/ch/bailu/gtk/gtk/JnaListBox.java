/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaListBox {

    @FunctionalInterface
    public interface OnListBoxCreateWidgetFunc extends com.sun.jna.Callback {
        long invoke(long item, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnListBoxForeachFunc extends com.sun.jna.Callback {
        void invoke(long box, long row, long user_data);
    }

    @FunctionalInterface
    public interface OnListBoxFilterFunc extends com.sun.jna.Callback {
        boolean invoke(long row, long user_data);
    }

    @FunctionalInterface
    public interface OnListBoxUpdateHeaderFunc extends com.sun.jna.Callback {
        void invoke(long row, long before, long user_data);
    }

    @FunctionalInterface
    public interface OnListBoxSortFunc extends com.sun.jna.Callback {
        int invoke(long row1, long row2, long user_data);
    }

    @FunctionalInterface
    public interface OnActivateCursorRow extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        void invoke(long _self, int object, int p0, boolean p1, boolean p2, long _data);
    }

    @FunctionalInterface
    public interface OnRowActivated extends com.sun.jna.Callback {
        void invoke(long _self, long row, long _data);
    }

    @FunctionalInterface
    public interface OnRowSelected extends com.sun.jna.Callback {
        void invoke(long _self, long row, long _data);
    }

    @FunctionalInterface
    public interface OnSelectAll extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSelectedRowsChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnToggleCursorRow extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUnselectAll extends com.sun.jna.Callback {
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
        long gtk_list_box_new();
        void gtk_list_box_append(long _self, long child);
        void gtk_list_box_bind_model(long _self, long model, com.sun.jna.Callback create_widget_func, long user_data, com.sun.jna.Callback user_data_free_func);
        void gtk_list_box_drag_highlight_row(long _self, long row);
        void gtk_list_box_drag_unhighlight_row(long _self);
        boolean gtk_list_box_get_activate_on_single_click(long _self);
        long gtk_list_box_get_adjustment(long _self);
        long gtk_list_box_get_row_at_index(long _self, int index_);
        long gtk_list_box_get_row_at_y(long _self, int y);
        long gtk_list_box_get_selected_row(long _self);
        long gtk_list_box_get_selected_rows(long _self);
        int gtk_list_box_get_selection_mode(long _self);
        boolean gtk_list_box_get_show_separators(long _self);
        void gtk_list_box_insert(long _self, long child, int position);
        void gtk_list_box_invalidate_filter(long _self);
        void gtk_list_box_invalidate_headers(long _self);
        void gtk_list_box_invalidate_sort(long _self);
        void gtk_list_box_prepend(long _self, long child);
        void gtk_list_box_remove(long _self, long child);
        void gtk_list_box_select_all(long _self);
        void gtk_list_box_select_row(long _self, long row);
        void gtk_list_box_selected_foreach(long _self, com.sun.jna.Callback func, long data);
        void gtk_list_box_set_activate_on_single_click(long _self, boolean single);
        void gtk_list_box_set_adjustment(long _self, long adjustment);
        void gtk_list_box_set_filter_func(long _self, com.sun.jna.Callback filter_func, long user_data, com.sun.jna.Callback destroy);
        void gtk_list_box_set_header_func(long _self, com.sun.jna.Callback update_header, long user_data, com.sun.jna.Callback destroy);
        void gtk_list_box_set_placeholder(long _self, long placeholder);
        void gtk_list_box_set_selection_mode(long _self, int mode);
        void gtk_list_box_set_show_separators(long _self, boolean show_separators);
        void gtk_list_box_set_sort_func(long _self, com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback destroy);
        void gtk_list_box_unselect_all(long _self);
        void gtk_list_box_unselect_row(long _self, long row);
        long gtk_list_box_get_type();
    }

}
