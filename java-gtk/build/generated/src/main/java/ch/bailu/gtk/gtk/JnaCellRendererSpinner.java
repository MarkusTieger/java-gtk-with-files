/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRendererSpinner {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_renderer_spinner_new();
        long gtk_cell_renderer_spinner_get_type();
    }

}
