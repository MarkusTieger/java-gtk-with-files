/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaTextureNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_texture_node_new(long texture, long bounds);
        long gsk_texture_node_get_texture(long _self);
        long gsk_texture_node_get_type();
    }

}
