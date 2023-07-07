/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaApplicationWindow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_application_window_new(long application);
        long gtk_application_window_get_help_overlay(long _self);
        int gtk_application_window_get_id(long _self);
        boolean gtk_application_window_get_show_menubar(long _self);
        void gtk_application_window_set_help_overlay(long _self, long help_overlay);
        void gtk_application_window_set_show_menubar(long _self, boolean show_menubar);
        long gtk_application_window_get_type();
    }

}
