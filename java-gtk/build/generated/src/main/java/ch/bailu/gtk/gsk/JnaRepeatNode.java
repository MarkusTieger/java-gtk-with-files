/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaRepeatNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_repeat_node_new(long bounds, long child, long child_bounds);
        long gsk_repeat_node_get_child(long _self);
        long gsk_repeat_node_get_child_bounds(long _self);
        long gsk_repeat_node_get_type();
    }

}
