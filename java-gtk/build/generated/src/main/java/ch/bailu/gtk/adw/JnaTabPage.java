/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaTabPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_tab_page_get_child(long _self);
        long adw_tab_page_get_icon(long _self);
        boolean adw_tab_page_get_indicator_activatable(long _self);
        long adw_tab_page_get_indicator_icon(long _self);
        long adw_tab_page_get_indicator_tooltip(long _self);
        boolean adw_tab_page_get_loading(long _self);
        boolean adw_tab_page_get_needs_attention(long _self);
        long adw_tab_page_get_parent(long _self);
        boolean adw_tab_page_get_pinned(long _self);
        boolean adw_tab_page_get_selected(long _self);
        long adw_tab_page_get_title(long _self);
        long adw_tab_page_get_tooltip(long _self);
        void adw_tab_page_set_icon(long _self, long icon);
        void adw_tab_page_set_indicator_activatable(long _self, boolean activatable);
        void adw_tab_page_set_indicator_icon(long _self, long indicator_icon);
        void adw_tab_page_set_indicator_tooltip(long _self, long tooltip);
        void adw_tab_page_set_indicator_tooltip(long _self, String tooltip);
        void adw_tab_page_set_loading(long _self, boolean loading);
        void adw_tab_page_set_needs_attention(long _self, boolean needs_attention);
        void adw_tab_page_set_title(long _self, long title);
        void adw_tab_page_set_title(long _self, String title);
        void adw_tab_page_set_tooltip(long _self, long tooltip);
        void adw_tab_page_set_tooltip(long _self, String tooltip);
        long adw_tab_page_get_type();
    }

}
