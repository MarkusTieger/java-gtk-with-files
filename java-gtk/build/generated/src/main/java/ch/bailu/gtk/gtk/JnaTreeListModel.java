/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeListModel {

    @FunctionalInterface
    public interface OnTreeListModelCreateModelFunc extends com.sun.jna.Callback {
        long invoke(long item, long user_data);
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
        long gtk_tree_list_model_new(long root, boolean passthrough, boolean autoexpand, com.sun.jna.Callback create_func, long user_data, com.sun.jna.Callback user_destroy);
        boolean gtk_tree_list_model_get_autoexpand(long _self);
        long gtk_tree_list_model_get_child_row(long _self, int position);
        long gtk_tree_list_model_get_model(long _self);
        boolean gtk_tree_list_model_get_passthrough(long _self);
        long gtk_tree_list_model_get_row(long _self, int position);
        void gtk_tree_list_model_set_autoexpand(long _self, boolean autoexpand);
        long gtk_tree_list_model_get_type();
    }

}
