/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeModelFilter {

    @FunctionalInterface
    public interface OnTreeModelFilterModifyFunc extends com.sun.jna.Callback {
        void invoke(long model, long iter, long value, int column, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnTreeModelFilterVisibleFunc extends com.sun.jna.Callback {
        boolean invoke(long model, long iter, long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_tree_model_filter_clear_cache(long _self);
        boolean gtk_tree_model_filter_convert_child_iter_to_iter(long _self, long filter_iter, long child_iter);
        long gtk_tree_model_filter_convert_child_path_to_path(long _self, long child_path);
        void gtk_tree_model_filter_convert_iter_to_child_iter(long _self, long child_iter, long filter_iter);
        long gtk_tree_model_filter_convert_path_to_child_path(long _self, long filter_path);
        long gtk_tree_model_filter_get_model(long _self);
        void gtk_tree_model_filter_refilter(long _self);
        void gtk_tree_model_filter_set_modify_func(long _self, int n_columns, long types, com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy);
        void gtk_tree_model_filter_set_visible_column(long _self, int column);
        void gtk_tree_model_filter_set_visible_func(long _self, com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy);
        long gtk_tree_model_filter_get_type();
    }

}
