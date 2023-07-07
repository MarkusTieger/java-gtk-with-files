/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEveryFilter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_every_filter_new();
        long gtk_every_filter_get_type();
    }

}
