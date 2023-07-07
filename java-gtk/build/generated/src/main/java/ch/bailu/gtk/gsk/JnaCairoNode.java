/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaCairoNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_cairo_node_new(long bounds);
        long gsk_cairo_node_get_draw_context(long _self);
        long gsk_cairo_node_get_surface(long _self);
        long gsk_cairo_node_get_type();
    }

}
