/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaTextNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_text_node_new(long font, long glyphs, long color, long offset);
        long gsk_text_node_get_color(long _self);
        long gsk_text_node_get_font(long _self);
        int gsk_text_node_get_num_glyphs(long _self);
        long gsk_text_node_get_offset(long _self);
        boolean gsk_text_node_has_color_glyphs(long _self);
        long gsk_text_node_get_type();
    }

}
