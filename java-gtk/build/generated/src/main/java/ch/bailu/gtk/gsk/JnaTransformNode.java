/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaTransformNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_transform_node_new(long child, long transform);
        long gsk_transform_node_get_child(long _self);
        long gsk_transform_node_get_transform(long _self);
        long gsk_transform_node_get_type();
    }

}
