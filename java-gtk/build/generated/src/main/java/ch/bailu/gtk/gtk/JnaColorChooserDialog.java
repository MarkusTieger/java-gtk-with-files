/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaColorChooserDialog {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_color_chooser_dialog_new(long title, long parent);
        long gtk_color_chooser_dialog_new(String title, long parent);
        long gtk_color_chooser_dialog_get_type();
    }

}
