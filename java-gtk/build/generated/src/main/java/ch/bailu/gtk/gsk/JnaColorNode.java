/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaColorNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_color_node_new(long rgba, long bounds);
        long gsk_color_node_get_color(long _self);
        long gsk_color_node_get_type();
    }

}
