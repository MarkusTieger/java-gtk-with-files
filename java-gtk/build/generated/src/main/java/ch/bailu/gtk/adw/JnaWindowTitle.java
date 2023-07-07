/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaWindowTitle {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_window_title_new(long title, long subtitle);
        long adw_window_title_new(String title, String subtitle);
        long adw_window_title_get_subtitle(long _self);
        long adw_window_title_get_title(long _self);
        void adw_window_title_set_subtitle(long _self, long subtitle);
        void adw_window_title_set_subtitle(long _self, String subtitle);
        void adw_window_title_set_title(long _self, long title);
        void adw_window_title_set_title(long _self, String title);
        long adw_window_title_get_type();
    }

}
