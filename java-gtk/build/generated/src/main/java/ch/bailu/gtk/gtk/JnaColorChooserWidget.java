/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaColorChooserWidget {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_color_chooser_widget_new();
        long gtk_color_chooser_widget_get_type();
    }

}
