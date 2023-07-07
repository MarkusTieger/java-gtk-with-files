/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaGsk {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gsk_serialization_error_quark();
        long gsk_value_dup_render_node(long value);
        long gsk_value_get_render_node(long value);
        void gsk_value_set_render_node(long value, long node);
        void gsk_value_take_render_node(long value, long node);
    }

}
