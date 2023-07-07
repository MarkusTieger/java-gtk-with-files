/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaAdw {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        double adw_easing_ease(int self, double value);
        boolean adw_get_enable_animations(long widget);
        int adw_get_major_version();
        int adw_get_micro_version();
        int adw_get_minor_version();
        void adw_init();
        boolean adw_is_initialized();
        double adw_lerp(double a, double b, double t);
        void adw_show_about_window(long parent, long first_property_name, java.lang.Object... _elipse);
    }

}
