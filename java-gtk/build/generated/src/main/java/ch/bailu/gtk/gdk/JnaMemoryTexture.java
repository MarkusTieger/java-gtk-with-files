/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaMemoryTexture {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_memory_texture_new(int width, int height, int format, long bytes, long stride);
        long gdk_memory_texture_get_type();
    }

}
