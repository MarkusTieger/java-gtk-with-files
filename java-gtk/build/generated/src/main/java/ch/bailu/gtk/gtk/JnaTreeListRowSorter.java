/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeListRowSorter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_list_row_sorter_new(long sorter);
        long gtk_tree_list_row_sorter_get_sorter(long _self);
        void gtk_tree_list_row_sorter_set_sorter(long _self, long sorter);
        long gtk_tree_list_row_sorter_get_type();
    }

}
