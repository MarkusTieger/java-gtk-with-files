/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaApplication {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_application_new(long application_id, int flags);
        long adw_application_new(String application_id, int flags);
        long adw_application_get_style_manager(long _self);
        long adw_application_get_type();
    }

}
