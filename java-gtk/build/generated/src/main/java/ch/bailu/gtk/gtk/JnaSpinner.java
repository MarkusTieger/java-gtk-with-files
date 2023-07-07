/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSpinner {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_spinner_new();
        boolean gtk_spinner_get_spinning(long _self);
        void gtk_spinner_set_spinning(long _self, boolean spinning);
        void gtk_spinner_start(long _self);
        void gtk_spinner_stop(long _self);
        long gtk_spinner_get_type();
    }

}
