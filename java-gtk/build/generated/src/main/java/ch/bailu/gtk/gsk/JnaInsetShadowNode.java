/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaInsetShadowNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_inset_shadow_node_new(long outline, long color, float dx, float dy, float spread, float blur_radius);
        float gsk_inset_shadow_node_get_blur_radius(long _self);
        long gsk_inset_shadow_node_get_color(long _self);
        float gsk_inset_shadow_node_get_dx(long _self);
        float gsk_inset_shadow_node_get_dy(long _self);
        long gsk_inset_shadow_node_get_outline(long _self);
        float gsk_inset_shadow_node_get_spread(long _self);
        long gsk_inset_shadow_node_get_type();
    }

}
