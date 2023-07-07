/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufAnimationIter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gdk_pixbuf-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gdk_pixbuf_animation_iter_advance(long _self, long current_time);
        int gdk_pixbuf_animation_iter_get_delay_time(long _self);
        long gdk_pixbuf_animation_iter_get_pixbuf(long _self);
        boolean gdk_pixbuf_animation_iter_on_currently_loading_frame(long _self);
        long gdk_pixbuf_animation_iter_get_type();
    }

}
