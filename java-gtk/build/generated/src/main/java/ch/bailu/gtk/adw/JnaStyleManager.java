/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaStyleManager {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int adw_style_manager_get_color_scheme(long _self);
        boolean adw_style_manager_get_dark(long _self);
        long adw_style_manager_get_display(long _self);
        boolean adw_style_manager_get_high_contrast(long _self);
        boolean adw_style_manager_get_system_supports_color_schemes(long _self);
        void adw_style_manager_set_color_scheme(long _self, int color_scheme);
        long adw_style_manager_get_default();
        long adw_style_manager_get_for_display(long display);
        long adw_style_manager_get_type();
    }

}
