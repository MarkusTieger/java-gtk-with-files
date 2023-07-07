/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaClipNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_clip_node_new(long child, long clip);
        long gsk_clip_node_get_child(long _self);
        long gsk_clip_node_get_clip(long _self);
        long gsk_clip_node_get_type();
    }

}
