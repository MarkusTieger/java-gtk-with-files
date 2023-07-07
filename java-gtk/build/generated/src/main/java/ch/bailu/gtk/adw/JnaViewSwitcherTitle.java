/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaViewSwitcherTitle {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_view_switcher_title_new();
        long adw_view_switcher_title_get_stack(long _self);
        long adw_view_switcher_title_get_subtitle(long _self);
        long adw_view_switcher_title_get_title(long _self);
        boolean adw_view_switcher_title_get_title_visible(long _self);
        boolean adw_view_switcher_title_get_view_switcher_enabled(long _self);
        void adw_view_switcher_title_set_stack(long _self, long stack);
        void adw_view_switcher_title_set_subtitle(long _self, long subtitle);
        void adw_view_switcher_title_set_subtitle(long _self, String subtitle);
        void adw_view_switcher_title_set_title(long _self, long title);
        void adw_view_switcher_title_set_title(long _self, String title);
        void adw_view_switcher_title_set_view_switcher_enabled(long _self, boolean enabled);
        long adw_view_switcher_title_get_type();
    }

}
