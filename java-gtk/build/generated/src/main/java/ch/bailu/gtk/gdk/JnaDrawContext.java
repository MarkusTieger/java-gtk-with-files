/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDrawContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gdk_draw_context_begin_frame(long _self, long region);
        void gdk_draw_context_end_frame(long _self);
        long gdk_draw_context_get_display(long _self);
        long gdk_draw_context_get_frame_region(long _self);
        long gdk_draw_context_get_surface(long _self);
        boolean gdk_draw_context_is_in_frame(long _self);
        long gdk_draw_context_get_type();
    }

}
