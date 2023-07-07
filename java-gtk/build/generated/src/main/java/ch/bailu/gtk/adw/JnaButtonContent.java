/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaButtonContent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_button_content_new();
        long adw_button_content_get_icon_name(long _self);
        long adw_button_content_get_label(long _self);
        boolean adw_button_content_get_use_underline(long _self);
        void adw_button_content_set_icon_name(long _self, long icon_name);
        void adw_button_content_set_icon_name(long _self, String icon_name);
        void adw_button_content_set_label(long _self, long label);
        void adw_button_content_set_label(long _self, String label);
        void adw_button_content_set_use_underline(long _self, boolean use_underline);
        long adw_button_content_get_type();
    }

}
