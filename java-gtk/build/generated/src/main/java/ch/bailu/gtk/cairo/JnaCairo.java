/* this file is machine generated */
package ch.bailu.gtk.cairo;




class JnaCairo {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("cairo", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long cairo_image_surface_create(int format, int width, int height);
        long cairo_image_surface_create_for_data(long data, int format, int width, int height, int stride);
        int cairo_format_stride_for_width(int format, int width);
    }

}
