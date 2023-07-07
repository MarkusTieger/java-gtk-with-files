/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaRenderNode {

    @FunctionalInterface
    public interface OnParseErrorFunc extends com.sun.jna.Callback {
        void invoke(long start, long end, long error, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gsk_render_node_draw(long _self, long cr);
        void gsk_render_node_get_bounds(long _self, long bounds);
        int gsk_render_node_get_node_type(long _self);
        long gsk_render_node_ref(long _self);
        long gsk_render_node_serialize(long _self);
        void gsk_render_node_unref(long _self);
        boolean gsk_render_node_write_to_file(long _self, long filename, long _error);
        boolean gsk_render_node_write_to_file(long _self, String filename, long _error);
        long gsk_render_node_deserialize(long bytes, com.sun.jna.Callback error_func, long user_data);
        long gsk_render_node_get_type();
    }

}
