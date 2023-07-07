/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeDragSource {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_tree_drag_source_drag_data_delete(long _self, long path);
        long gtk_tree_drag_source_drag_data_get(long _self, long path);
        boolean gtk_tree_drag_source_row_draggable(long _self, long path);
        long gtk_tree_drag_source_get_type();
    }

}
