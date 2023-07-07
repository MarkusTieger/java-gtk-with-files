/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaTabBar {

    @FunctionalInterface
    public interface OnExtraDragDrop extends com.sun.jna.Callback {
        boolean invoke(long _self, long page, long value, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_tab_bar_new();
        boolean adw_tab_bar_get_autohide(long _self);
        long adw_tab_bar_get_end_action_widget(long _self);
        boolean adw_tab_bar_get_expand_tabs(long _self);
        boolean adw_tab_bar_get_inverted(long _self);
        boolean adw_tab_bar_get_is_overflowing(long _self);
        long adw_tab_bar_get_start_action_widget(long _self);
        boolean adw_tab_bar_get_tabs_revealed(long _self);
        long adw_tab_bar_get_view(long _self);
        void adw_tab_bar_set_autohide(long _self, boolean autohide);
        void adw_tab_bar_set_end_action_widget(long _self, long widget);
        void adw_tab_bar_set_expand_tabs(long _self, boolean expand_tabs);
        void adw_tab_bar_set_inverted(long _self, boolean inverted);
        void adw_tab_bar_set_start_action_widget(long _self, long widget);
        void adw_tab_bar_set_view(long _self, long view);
        void adw_tab_bar_setup_extra_drop_target(long _self, int actions, long types, long n_types);
        long adw_tab_bar_get_type();
    }

}
