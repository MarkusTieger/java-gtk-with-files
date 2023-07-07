/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaPreferencesWindow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_preferences_window_new();
        void adw_preferences_window_add(long _self, long page);
        void adw_preferences_window_add_toast(long _self, long toast);
        void adw_preferences_window_close_subpage(long _self);
        boolean adw_preferences_window_get_can_navigate_back(long _self);
        boolean adw_preferences_window_get_search_enabled(long _self);
        long adw_preferences_window_get_visible_page(long _self);
        long adw_preferences_window_get_visible_page_name(long _self);
        void adw_preferences_window_present_subpage(long _self, long subpage);
        void adw_preferences_window_remove(long _self, long page);
        void adw_preferences_window_set_can_navigate_back(long _self, boolean can_navigate_back);
        void adw_preferences_window_set_search_enabled(long _self, boolean search_enabled);
        void adw_preferences_window_set_visible_page(long _self, long page);
        void adw_preferences_window_set_visible_page_name(long _self, long name);
        void adw_preferences_window_set_visible_page_name(long _self, String name);
        long adw_preferences_window_get_type();
    }

}
