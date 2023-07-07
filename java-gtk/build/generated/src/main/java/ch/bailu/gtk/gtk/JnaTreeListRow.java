/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeListRow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_list_row_get_child_row(long _self, int position);
        long gtk_tree_list_row_get_children(long _self);
        int gtk_tree_list_row_get_depth(long _self);
        boolean gtk_tree_list_row_get_expanded(long _self);
        long gtk_tree_list_row_get_item(long _self);
        long gtk_tree_list_row_get_parent(long _self);
        int gtk_tree_list_row_get_position(long _self);
        boolean gtk_tree_list_row_is_expandable(long _self);
        void gtk_tree_list_row_set_expanded(long _self, boolean expanded);
        long gtk_tree_list_row_get_type();
    }

}
