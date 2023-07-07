/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMediaControls {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_media_controls_new(long stream);
        long gtk_media_controls_get_media_stream(long _self);
        void gtk_media_controls_set_media_stream(long _self, long stream);
        long gtk_media_controls_get_type();
    }

}
