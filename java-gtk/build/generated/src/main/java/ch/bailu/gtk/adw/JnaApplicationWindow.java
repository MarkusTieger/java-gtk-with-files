/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaApplicationWindow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_application_window_new(long app);
        long adw_application_window_get_content(long _self);
        void adw_application_window_set_content(long _self, long content);
        long adw_application_window_get_type();
    }

}
