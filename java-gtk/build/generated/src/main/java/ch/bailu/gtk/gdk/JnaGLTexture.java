/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaGLTexture {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_gl_texture_new(long context, int id, int width, int height, com.sun.jna.Callback destroy, long data);
        void gdk_gl_texture_release(long _self);
        long gdk_gl_texture_get_type();
    }

}
