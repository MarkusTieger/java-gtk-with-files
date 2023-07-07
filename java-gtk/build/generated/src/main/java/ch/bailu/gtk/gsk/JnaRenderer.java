/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaRenderer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_renderer_new_for_surface(long surface);
        long gsk_renderer_get_surface(long _self);
        boolean gsk_renderer_is_realized(long _self);
        boolean gsk_renderer_realize(long _self, long surface, long _error);
        void gsk_renderer_render(long _self, long root, long region);
        long gsk_renderer_render_texture(long _self, long root, long viewport);
        void gsk_renderer_unrealize(long _self);
        long gsk_renderer_get_type();
    }

}
