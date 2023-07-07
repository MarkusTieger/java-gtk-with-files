/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaActionRow {

    @FunctionalInterface
    public interface OnActivated extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_action_row_new();
        void adw_action_row_add_prefix(long _self, long widget);
        void adw_action_row_add_suffix(long _self, long widget);
        long adw_action_row_get_activatable_widget(long _self);
        long adw_action_row_get_icon_name(long _self);
        long adw_action_row_get_subtitle(long _self);
        int adw_action_row_get_subtitle_lines(long _self);
        int adw_action_row_get_title_lines(long _self);
        void adw_action_row_remove(long _self, long widget);
        void adw_action_row_set_activatable_widget(long _self, long widget);
        void adw_action_row_set_icon_name(long _self, long icon_name);
        void adw_action_row_set_icon_name(long _self, String icon_name);
        void adw_action_row_set_subtitle(long _self, long subtitle);
        void adw_action_row_set_subtitle(long _self, String subtitle);
        void adw_action_row_set_subtitle_lines(long _self, int subtitle_lines);
        void adw_action_row_set_title_lines(long _self, int title_lines);
        long adw_action_row_get_type();
    }

}
