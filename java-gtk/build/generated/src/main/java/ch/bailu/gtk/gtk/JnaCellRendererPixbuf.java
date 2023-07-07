/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRendererPixbuf {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_renderer_pixbuf_new();
        long gtk_cell_renderer_pixbuf_get_type();
    }

}
