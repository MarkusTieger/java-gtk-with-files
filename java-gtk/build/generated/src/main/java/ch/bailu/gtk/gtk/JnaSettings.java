/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSettings {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_settings_reset_property(long _self, long name);
        void gtk_settings_reset_property(long _self, String name);
        long gtk_settings_get_default();
        long gtk_settings_get_for_display(long display);
        long gtk_settings_get_type();
    }

}
