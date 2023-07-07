/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFlowBox {

    @FunctionalInterface
    public interface OnFlowBoxCreateWidgetFunc extends com.sun.jna.Callback {
        long invoke(long item, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnFlowBoxForeachFunc extends com.sun.jna.Callback {
        void invoke(long box, long child, long user_data);
    }

    @FunctionalInterface
    public interface OnFlowBoxFilterFunc extends com.sun.jna.Callback {
        boolean invoke(long child, long user_data);
    }

    @FunctionalInterface
    public interface OnFlowBoxSortFunc extends com.sun.jna.Callback {
        int invoke(long child1, long child2, long user_data);
    }

    @FunctionalInterface
    public interface OnActivateCursorChild extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnChildActivated extends com.sun.jna.Callback {
        void invoke(long _self, long child, long _data);
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
    public interface OnSelectedChildrenChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnToggleCursorChild extends com.sun.jna.Callback {
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
        long gtk_flow_box_new();
        void gtk_flow_box_append(long _self, long child);
        void gtk_flow_box_bind_model(long _self, long model, com.sun.jna.Callback create_widget_func, long user_data, com.sun.jna.Callback user_data_free_func);
        boolean gtk_flow_box_get_activate_on_single_click(long _self);
        long gtk_flow_box_get_child_at_index(long _self, int idx);
        long gtk_flow_box_get_child_at_pos(long _self, int x, int y);
        int gtk_flow_box_get_column_spacing(long _self);
        boolean gtk_flow_box_get_homogeneous(long _self);
        int gtk_flow_box_get_max_children_per_line(long _self);
        int gtk_flow_box_get_min_children_per_line(long _self);
        int gtk_flow_box_get_row_spacing(long _self);
        long gtk_flow_box_get_selected_children(long _self);
        int gtk_flow_box_get_selection_mode(long _self);
        void gtk_flow_box_insert(long _self, long widget, int position);
        void gtk_flow_box_invalidate_filter(long _self);
        void gtk_flow_box_invalidate_sort(long _self);
        void gtk_flow_box_prepend(long _self, long child);
        void gtk_flow_box_remove(long _self, long widget);
        void gtk_flow_box_select_all(long _self);
        void gtk_flow_box_select_child(long _self, long child);
        void gtk_flow_box_selected_foreach(long _self, com.sun.jna.Callback func, long data);
        void gtk_flow_box_set_activate_on_single_click(long _self, boolean single);
        void gtk_flow_box_set_column_spacing(long _self, int spacing);
        void gtk_flow_box_set_filter_func(long _self, com.sun.jna.Callback filter_func, long user_data, com.sun.jna.Callback destroy);
        void gtk_flow_box_set_hadjustment(long _self, long adjustment);
        void gtk_flow_box_set_homogeneous(long _self, boolean homogeneous);
        void gtk_flow_box_set_max_children_per_line(long _self, int n_children);
        void gtk_flow_box_set_min_children_per_line(long _self, int n_children);
        void gtk_flow_box_set_row_spacing(long _self, int spacing);
        void gtk_flow_box_set_selection_mode(long _self, int mode);
        void gtk_flow_box_set_sort_func(long _self, com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback destroy);
        void gtk_flow_box_set_vadjustment(long _self, long adjustment);
        void gtk_flow_box_unselect_all(long _self);
        void gtk_flow_box_unselect_child(long _self, long child);
        long gtk_flow_box_get_type();
    }

}
