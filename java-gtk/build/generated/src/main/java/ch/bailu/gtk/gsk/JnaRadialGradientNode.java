/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaRadialGradientNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_radial_gradient_node_get_center(long _self);
        float gsk_radial_gradient_node_get_end(long _self);
        float gsk_radial_gradient_node_get_hradius(long _self);
        long gsk_radial_gradient_node_get_n_color_stops(long _self);
        float gsk_radial_gradient_node_get_start(long _self);
        float gsk_radial_gradient_node_get_vradius(long _self);
        long gsk_radial_gradient_node_get_type();
    }

}
