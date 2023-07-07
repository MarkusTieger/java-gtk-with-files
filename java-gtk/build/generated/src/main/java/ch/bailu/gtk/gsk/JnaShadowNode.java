/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaShadowNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_shadow_node_get_child(long _self);
        long gsk_shadow_node_get_n_shadows(long _self);
        long gsk_shadow_node_get_shadow(long _self, long i);
        long gsk_shadow_node_get_type();
    }

}
