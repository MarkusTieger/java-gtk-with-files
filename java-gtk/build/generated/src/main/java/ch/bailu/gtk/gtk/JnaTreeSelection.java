/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeSelection {

    @FunctionalInterface
    public interface OnTreeSelectionForeachFunc extends com.sun.jna.Callback {
        void invoke(long model, long path, long iter, long data);
    }

    @FunctionalInterface
    public interface OnTreeSelectionFunc extends com.sun.jna.Callback {
        boolean invoke(long selection, long model, long path, boolean path_currently_selected, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
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
        int gtk_tree_selection_count_selected_rows(long _self);
        int gtk_tree_selection_get_mode(long _self);
        long gtk_tree_selection_get_tree_view(long _self);
        long gtk_tree_selection_get_user_data(long _self);
        boolean gtk_tree_selection_iter_is_selected(long _self, long iter);
        boolean gtk_tree_selection_path_is_selected(long _self, long path);
        void gtk_tree_selection_select_all(long _self);
        void gtk_tree_selection_select_iter(long _self, long iter);
        void gtk_tree_selection_select_path(long _self, long path);
        void gtk_tree_selection_select_range(long _self, long start_path, long end_path);
        void gtk_tree_selection_selected_foreach(long _self, com.sun.jna.Callback func, long data);
        void gtk_tree_selection_set_mode(long _self, int type);
        void gtk_tree_selection_set_select_function(long _self, com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy);
        void gtk_tree_selection_unselect_all(long _self);
        void gtk_tree_selection_unselect_iter(long _self, long iter);
        void gtk_tree_selection_unselect_path(long _self, long path);
        void gtk_tree_selection_unselect_range(long _self, long start_path, long end_path);
        long gtk_tree_selection_get_type();
    }

}
