/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaViewSwitcherBar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_view_switcher_bar_new();
        boolean adw_view_switcher_bar_get_reveal(long _self);
        long adw_view_switcher_bar_get_stack(long _self);
        void adw_view_switcher_bar_set_reveal(long _self, boolean reveal);
        void adw_view_switcher_bar_set_stack(long _self, long stack);
        long adw_view_switcher_bar_get_type();
    }

}
