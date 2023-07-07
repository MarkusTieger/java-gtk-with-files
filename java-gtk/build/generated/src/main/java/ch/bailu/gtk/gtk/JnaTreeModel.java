/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeModel {

    @FunctionalInterface
    public interface OnTreeModelForeachFunc extends com.sun.jna.Callback {
        boolean invoke(long model, long path, long iter, long data);
    }

    @FunctionalInterface
    public interface OnRowChanged extends com.sun.jna.Callback {
        void invoke(long _self, long path, long iter, long _data);
    }

    @FunctionalInterface
    public interface OnRowDeleted extends com.sun.jna.Callback {
        void invoke(long _self, long path, long _data);
    }

    @FunctionalInterface
    public interface OnRowHasChildToggled extends com.sun.jna.Callback {
        void invoke(long _self, long path, long iter, long _data);
    }

    @FunctionalInterface
    public interface OnRowInserted extends com.sun.jna.Callback {
        void invoke(long _self, long path, long iter, long _data);
    }

    @FunctionalInterface
    public interface OnRowsReordered extends com.sun.jna.Callback {
        void invoke(long _self, long path, long iter, long new_order, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_model_filter_new(long _self, long root);
        void gtk_tree_model_foreach(long _self, com.sun.jna.Callback func, long user_data);
        void gtk_tree_model_get(long _self, long iter, java.lang.Object... _elipse);
        long gtk_tree_model_get_column_type(long _self, int index_);
        int gtk_tree_model_get_flags(long _self);
        boolean gtk_tree_model_get_iter(long _self, long iter, long path);
        boolean gtk_tree_model_get_iter_first(long _self, long iter);
        boolean gtk_tree_model_get_iter_from_string(long _self, long iter, long path_string);
        boolean gtk_tree_model_get_iter_from_string(long _self, long iter, String path_string);
        int gtk_tree_model_get_n_columns(long _self);
        long gtk_tree_model_get_path(long _self, long iter);
        long gtk_tree_model_get_string_from_iter(long _self, long iter);
        void gtk_tree_model_get_value(long _self, long iter, int column, long value);
        boolean gtk_tree_model_iter_children(long _self, long iter, long parent);
        boolean gtk_tree_model_iter_has_child(long _self, long iter);
        int gtk_tree_model_iter_n_children(long _self, long iter);
        boolean gtk_tree_model_iter_next(long _self, long iter);
        boolean gtk_tree_model_iter_nth_child(long _self, long iter, long parent, int n);
        boolean gtk_tree_model_iter_parent(long _self, long iter, long child);
        boolean gtk_tree_model_iter_previous(long _self, long iter);
        void gtk_tree_model_ref_node(long _self, long iter);
        void gtk_tree_model_row_changed(long _self, long path, long iter);
        void gtk_tree_model_row_deleted(long _self, long path);
        void gtk_tree_model_row_has_child_toggled(long _self, long path, long iter);
        void gtk_tree_model_row_inserted(long _self, long path, long iter);
        void gtk_tree_model_rows_reordered(long _self, long path, long iter, long new_order);
        void gtk_tree_model_rows_reordered_with_length(long _self, long path, long iter, long new_order, int length);
        void gtk_tree_model_unref_node(long _self, long iter);
        long gtk_tree_model_get_type();
    }

}
