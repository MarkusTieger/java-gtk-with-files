/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaOpacityNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_opacity_node_new(long child, float opacity);
        long gsk_opacity_node_get_child(long _self);
        float gsk_opacity_node_get_opacity(long _self);
        long gsk_opacity_node_get_type();
    }

}
