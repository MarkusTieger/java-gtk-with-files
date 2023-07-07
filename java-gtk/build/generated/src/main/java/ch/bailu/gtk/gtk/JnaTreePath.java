/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreePath {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_path_new();
        long gtk_tree_path_new_first();
        long gtk_tree_path_new_from_indices(int first_index, java.lang.Object... _elipse);
        long gtk_tree_path_new_from_indicesv(long indices, long length);
        long gtk_tree_path_new_from_string(long path);
        long gtk_tree_path_new_from_string(String path);
        void gtk_tree_path_append_index(long _self, int index_);
        int gtk_tree_path_compare(long _self, long b);
        long gtk_tree_path_copy(long _self);
        void gtk_tree_path_down(long _self);
        void gtk_tree_path_free(long _self);
        int gtk_tree_path_get_depth(long _self);
        long gtk_tree_path_get_indices(long _self);
        long gtk_tree_path_get_indices_with_depth(long _self, long depth);
        boolean gtk_tree_path_is_ancestor(long _self, long descendant);
        boolean gtk_tree_path_is_descendant(long _self, long ancestor);
        void gtk_tree_path_next(long _self);
        void gtk_tree_path_prepend_index(long _self, int index_);
        boolean gtk_tree_path_prev(long _self);
        long gtk_tree_path_to_string(long _self);
        boolean gtk_tree_path_up(long _self);
        long gtk_tree_path_get_type();
    }

}
