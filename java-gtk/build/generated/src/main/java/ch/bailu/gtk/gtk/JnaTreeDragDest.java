/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeDragDest {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_tree_drag_dest_drag_data_received(long _self, long dest, long value);
        boolean gtk_tree_drag_dest_row_drop_possible(long _self, long dest_path, long value);
        long gtk_tree_drag_dest_get_type();
    }

}
