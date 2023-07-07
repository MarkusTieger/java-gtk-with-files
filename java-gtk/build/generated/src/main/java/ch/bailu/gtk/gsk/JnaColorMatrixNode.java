/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaColorMatrixNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_color_matrix_node_new(long child, long color_matrix, long color_offset);
        long gsk_color_matrix_node_get_child(long _self);
        long gsk_color_matrix_node_get_color_matrix(long _self);
        long gsk_color_matrix_node_get_color_offset(long _self);
        long gsk_color_matrix_node_get_type();
    }

}
