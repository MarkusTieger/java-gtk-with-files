/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaViewSwitcher {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_view_switcher_new();
        int adw_view_switcher_get_policy(long _self);
        long adw_view_switcher_get_stack(long _self);
        void adw_view_switcher_set_policy(long _self, int policy);
        void adw_view_switcher_set_stack(long _self, long stack);
        long adw_view_switcher_get_type();
    }

}
