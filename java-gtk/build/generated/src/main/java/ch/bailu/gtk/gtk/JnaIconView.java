/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaIconView {

    @FunctionalInterface
    public interface OnIconViewForeachFunc extends com.sun.jna.Callback {
        void invoke(long icon_view, long path, long data);
    }

    @FunctionalInterface
    public interface OnActivateCursorItem extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnItemActivated extends com.sun.jna.Callback {
        void invoke(long _self, long path, long _data);
    }

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        boolean invoke(long _self, int step, int count, boolean extend, boolean modify, long _data);
    }

    @FunctionalInterface
    public interface OnSelectAll extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSelectCursorItem extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSelectionChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnToggleCursorItem extends com.sun.jna.Callback {
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
        long gtk_icon_view_new();
        long gtk_icon_view_new_with_area(long area);
        long gtk_icon_view_new_with_model(long model);
        long gtk_icon_view_create_drag_icon(long _self, long path);
        void gtk_icon_view_enable_model_drag_dest(long _self, long formats, int actions);
        void gtk_icon_view_enable_model_drag_source(long _self, int start_button_mask, long formats, int actions);
        boolean gtk_icon_view_get_activate_on_single_click(long _self);
        boolean gtk_icon_view_get_cell_rect(long _self, long path, long cell, long rect);
        int gtk_icon_view_get_column_spacing(long _self);
        int gtk_icon_view_get_columns(long _self);
        int gtk_icon_view_get_item_column(long _self, long path);
        int gtk_icon_view_get_item_orientation(long _self);
        int gtk_icon_view_get_item_padding(long _self);
        int gtk_icon_view_get_item_row(long _self, long path);
        int gtk_icon_view_get_item_width(long _self);
        int gtk_icon_view_get_margin(long _self);
        int gtk_icon_view_get_markup_column(long _self);
        long gtk_icon_view_get_model(long _self);
        long gtk_icon_view_get_path_at_pos(long _self, int x, int y);
        int gtk_icon_view_get_pixbuf_column(long _self);
        boolean gtk_icon_view_get_reorderable(long _self);
        int gtk_icon_view_get_row_spacing(long _self);
        long gtk_icon_view_get_selected_items(long _self);
        int gtk_icon_view_get_selection_mode(long _self);
        int gtk_icon_view_get_spacing(long _self);
        int gtk_icon_view_get_text_column(long _self);
        int gtk_icon_view_get_tooltip_column(long _self);
        void gtk_icon_view_item_activated(long _self, long path);
        boolean gtk_icon_view_path_is_selected(long _self, long path);
        void gtk_icon_view_scroll_to_path(long _self, long path, boolean use_align, float row_align, float col_align);
        void gtk_icon_view_select_all(long _self);
        void gtk_icon_view_select_path(long _self, long path);
        void gtk_icon_view_selected_foreach(long _self, com.sun.jna.Callback func, long data);
        void gtk_icon_view_set_activate_on_single_click(long _self, boolean single);
        void gtk_icon_view_set_column_spacing(long _self, int column_spacing);
        void gtk_icon_view_set_columns(long _self, int columns);
        void gtk_icon_view_set_cursor(long _self, long path, long cell, boolean start_editing);
        void gtk_icon_view_set_drag_dest_item(long _self, long path, int pos);
        void gtk_icon_view_set_item_orientation(long _self, int orientation);
        void gtk_icon_view_set_item_padding(long _self, int item_padding);
        void gtk_icon_view_set_item_width(long _self, int item_width);
        void gtk_icon_view_set_margin(long _self, int margin);
        void gtk_icon_view_set_markup_column(long _self, int column);
        void gtk_icon_view_set_model(long _self, long model);
        void gtk_icon_view_set_pixbuf_column(long _self, int column);
        void gtk_icon_view_set_reorderable(long _self, boolean reorderable);
        void gtk_icon_view_set_row_spacing(long _self, int row_spacing);
        void gtk_icon_view_set_selection_mode(long _self, int mode);
        void gtk_icon_view_set_spacing(long _self, int spacing);
        void gtk_icon_view_set_text_column(long _self, int column);
        void gtk_icon_view_set_tooltip_cell(long _self, long tooltip, long path, long cell);
        void gtk_icon_view_set_tooltip_column(long _self, int column);
        void gtk_icon_view_set_tooltip_item(long _self, long tooltip, long path);
        void gtk_icon_view_unselect_all(long _self);
        void gtk_icon_view_unselect_path(long _self, long path);
        void gtk_icon_view_unset_model_drag_dest(long _self);
        void gtk_icon_view_unset_model_drag_source(long _self);
        long gtk_icon_view_get_type();
    }

}
