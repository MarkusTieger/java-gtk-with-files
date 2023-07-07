/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaPreferencesRow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_preferences_row_new();
        long adw_preferences_row_get_title(long _self);
        boolean adw_preferences_row_get_title_selectable(long _self);
        boolean adw_preferences_row_get_use_markup(long _self);
        boolean adw_preferences_row_get_use_underline(long _self);
        void adw_preferences_row_set_title(long _self, long title);
        void adw_preferences_row_set_title(long _self, String title);
        void adw_preferences_row_set_title_selectable(long _self, boolean title_selectable);
        void adw_preferences_row_set_use_markup(long _self, boolean use_markup);
        void adw_preferences_row_set_use_underline(long _self, boolean use_underline);
        long adw_preferences_row_get_type();
    }

}
