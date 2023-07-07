/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaGLRenderer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_gl_renderer_new();
        long gsk_gl_renderer_get_type();
    }

}
