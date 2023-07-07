/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaConicGradientNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        float gsk_conic_gradient_node_get_angle(long _self);
        long gsk_conic_gradient_node_get_center(long _self);
        long gsk_conic_gradient_node_get_n_color_stops(long _self);
        float gsk_conic_gradient_node_get_rotation(long _self);
        long gsk_conic_gradient_node_get_type();
    }

}
