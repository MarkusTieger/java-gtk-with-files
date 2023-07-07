/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaBorderNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_border_node_get_colors(long _self);
        long gsk_border_node_get_outline(long _self);
        long gsk_border_node_get_type();
    }

}
