/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaPreferencesGroup {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_preferences_group_new();
        void adw_preferences_group_add(long _self, long child);
        long adw_preferences_group_get_description(long _self);
        long adw_preferences_group_get_header_suffix(long _self);
        long adw_preferences_group_get_title(long _self);
        void adw_preferences_group_remove(long _self, long child);
        void adw_preferences_group_set_description(long _self, long description);
        void adw_preferences_group_set_description(long _self, String description);
        void adw_preferences_group_set_header_suffix(long _self, long suffix);
        void adw_preferences_group_set_title(long _self, long title);
        void adw_preferences_group_set_title(long _self, String title);
        long adw_preferences_group_get_type();
    }

}
