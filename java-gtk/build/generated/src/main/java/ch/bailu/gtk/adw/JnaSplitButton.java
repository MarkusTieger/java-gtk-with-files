/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaSplitButton {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnClicked extends com.sun.jna.Callback {
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
        long adw_split_button_new();
        long adw_split_button_get_child(long _self);
        int adw_split_button_get_direction(long _self);
        long adw_split_button_get_dropdown_tooltip(long _self);
        long adw_split_button_get_icon_name(long _self);
        long adw_split_button_get_label(long _self);
        long adw_split_button_get_menu_model(long _self);
        long adw_split_button_get_popover(long _self);
        boolean adw_split_button_get_use_underline(long _self);
        void adw_split_button_popdown(long _self);
        void adw_split_button_popup(long _self);
        void adw_split_button_set_child(long _self, long child);
        void adw_split_button_set_direction(long _self, int direction);
        void adw_split_button_set_dropdown_tooltip(long _self, long tooltip);
        void adw_split_button_set_dropdown_tooltip(long _self, String tooltip);
        void adw_split_button_set_icon_name(long _self, long icon_name);
        void adw_split_button_set_icon_name(long _self, String icon_name);
        void adw_split_button_set_label(long _self, long label);
        void adw_split_button_set_label(long _self, String label);
        void adw_split_button_set_menu_model(long _self, long menu_model);
        void adw_split_button_set_popover(long _self, long popover);
        void adw_split_button_set_use_underline(long _self, boolean use_underline);
        long adw_split_button_get_type();
    }

}
