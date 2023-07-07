/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeModelSort {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_model_sort_new_with_model(long child_model);
        void gtk_tree_model_sort_clear_cache(long _self);
        boolean gtk_tree_model_sort_convert_child_iter_to_iter(long _self, long sort_iter, long child_iter);
        long gtk_tree_model_sort_convert_child_path_to_path(long _self, long child_path);
        void gtk_tree_model_sort_convert_iter_to_child_iter(long _self, long child_iter, long sorted_iter);
        long gtk_tree_model_sort_convert_path_to_child_path(long _self, long sorted_path);
        long gtk_tree_model_sort_get_model(long _self);
        boolean gtk_tree_model_sort_iter_is_valid(long _self, long iter);
        void gtk_tree_model_sort_reset_default_sort_func(long _self);
        long gtk_tree_model_sort_get_type();
    }

}
