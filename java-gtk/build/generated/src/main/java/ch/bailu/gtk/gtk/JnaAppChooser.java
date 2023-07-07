/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAppChooser {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_app_chooser_get_app_info(long _self);
        long gtk_app_chooser_get_content_type(long _self);
        void gtk_app_chooser_refresh(long _self);
        long gtk_app_chooser_get_type();
    }

}
