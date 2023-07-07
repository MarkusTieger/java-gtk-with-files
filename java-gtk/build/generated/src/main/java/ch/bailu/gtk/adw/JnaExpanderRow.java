/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaExpanderRow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_expander_row_new();
        void adw_expander_row_add_action(long _self, long widget);
        void adw_expander_row_add_prefix(long _self, long widget);
        void adw_expander_row_add_row(long _self, long child);
        boolean adw_expander_row_get_enable_expansion(long _self);
        boolean adw_expander_row_get_expanded(long _self);
        long adw_expander_row_get_icon_name(long _self);
        boolean adw_expander_row_get_show_enable_switch(long _self);
        long adw_expander_row_get_subtitle(long _self);
        void adw_expander_row_remove(long _self, long child);
        void adw_expander_row_set_enable_expansion(long _self, boolean enable_expansion);
        void adw_expander_row_set_expanded(long _self, boolean expanded);
        void adw_expander_row_set_icon_name(long _self, long icon_name);
        void adw_expander_row_set_icon_name(long _self, String icon_name);
        void adw_expander_row_set_show_enable_switch(long _self, boolean show_enable_switch);
        void adw_expander_row_set_subtitle(long _self, long subtitle);
        void adw_expander_row_set_subtitle(long _self, String subtitle);
        long adw_expander_row_get_type();
    }

}
