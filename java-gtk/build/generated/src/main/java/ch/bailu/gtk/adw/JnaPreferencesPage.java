/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaPreferencesPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_preferences_page_new();
        void adw_preferences_page_add(long _self, long group);
        long adw_preferences_page_get_icon_name(long _self);
        long adw_preferences_page_get_name(long _self);
        long adw_preferences_page_get_title(long _self);
        boolean adw_preferences_page_get_use_underline(long _self);
        void adw_preferences_page_remove(long _self, long group);
        void adw_preferences_page_set_icon_name(long _self, long icon_name);
        void adw_preferences_page_set_icon_name(long _self, String icon_name);
        void adw_preferences_page_set_name(long _self, long name);
        void adw_preferences_page_set_name(long _self, String name);
        void adw_preferences_page_set_title(long _self, long title);
        void adw_preferences_page_set_title(long _self, String title);
        void adw_preferences_page_set_use_underline(long _self, boolean use_underline);
        long adw_preferences_page_get_type();
    }

}
