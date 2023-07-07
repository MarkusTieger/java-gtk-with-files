/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaStatusPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_status_page_new();
        long adw_status_page_get_child(long _self);
        long adw_status_page_get_description(long _self);
        long adw_status_page_get_icon_name(long _self);
        long adw_status_page_get_paintable(long _self);
        long adw_status_page_get_title(long _self);
        void adw_status_page_set_child(long _self, long child);
        void adw_status_page_set_description(long _self, long description);
        void adw_status_page_set_description(long _self, String description);
        void adw_status_page_set_icon_name(long _self, long icon_name);
        void adw_status_page_set_icon_name(long _self, String icon_name);
        void adw_status_page_set_paintable(long _self, long paintable);
        void adw_status_page_set_title(long _self, long title);
        void adw_status_page_set_title(long _self, String title);
        long adw_status_page_get_type();
    }

}
