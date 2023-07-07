/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaCrossFadeNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_cross_fade_node_new(long start, long end, float progress);
        long gsk_cross_fade_node_get_end_child(long _self);
        float gsk_cross_fade_node_get_progress(long _self);
        long gsk_cross_fade_node_get_start_child(long _self);
        long gsk_cross_fade_node_get_type();
    }

}
