/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaHeaderBar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_header_bar_new();
        int adw_header_bar_get_centering_policy(long _self);
        long adw_header_bar_get_decoration_layout(long _self);
        boolean adw_header_bar_get_show_end_title_buttons(long _self);
        boolean adw_header_bar_get_show_start_title_buttons(long _self);
        long adw_header_bar_get_title_widget(long _self);
        void adw_header_bar_pack_end(long _self, long child);
        void adw_header_bar_pack_start(long _self, long child);
        void adw_header_bar_remove(long _self, long child);
        void adw_header_bar_set_centering_policy(long _self, int centering_policy);
        void adw_header_bar_set_decoration_layout(long _self, long layout);
        void adw_header_bar_set_decoration_layout(long _self, String layout);
        void adw_header_bar_set_show_end_title_buttons(long _self, boolean setting);
        void adw_header_bar_set_show_start_title_buttons(long _self, boolean setting);
        void adw_header_bar_set_title_widget(long _self, long title_widget);
        long adw_header_bar_get_type();
    }

}
