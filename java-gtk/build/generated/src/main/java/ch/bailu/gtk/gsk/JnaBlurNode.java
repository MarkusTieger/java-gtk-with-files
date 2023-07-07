/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaBlurNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_blur_node_new(long child, float radius);
        long gsk_blur_node_get_child(long _self);
        float gsk_blur_node_get_radius(long _self);
        long gsk_blur_node_get_type();
    }

}
