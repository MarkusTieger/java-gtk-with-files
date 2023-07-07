/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufSimpleAnim {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gdk_pixbuf-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_pixbuf_simple_anim_new(int width, int height, float rate);
        void gdk_pixbuf_simple_anim_add_frame(long _self, long pixbuf);
        boolean gdk_pixbuf_simple_anim_get_loop(long _self);
        void gdk_pixbuf_simple_anim_set_loop(long _self, boolean loop);
        long gdk_pixbuf_simple_anim_get_type();
    }

}
