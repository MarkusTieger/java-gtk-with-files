/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeSortable {

    @FunctionalInterface
    public interface OnTreeIterCompareFunc extends com.sun.jna.Callback {
        int invoke(long model, long a, long b, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnSortColumnChanged extends com.sun.jna.Callback {
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
        boolean gtk_tree_sortable_get_sort_column_id(long _self, long sort_column_id, long order);
        boolean gtk_tree_sortable_has_default_sort_func(long _self);
        void gtk_tree_sortable_set_default_sort_func(long _self, com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback destroy);
        void gtk_tree_sortable_set_sort_column_id(long _self, int sort_column_id, int order);
        void gtk_tree_sortable_set_sort_func(long _self, int sort_column_id, com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback destroy);
        void gtk_tree_sortable_sort_column_changed(long _self);
        long gtk_tree_sortable_get_type();
    }

}
