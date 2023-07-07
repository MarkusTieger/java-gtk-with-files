/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaViewStackPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int adw_view_stack_page_get_badge_number(long _self);
        long adw_view_stack_page_get_child(long _self);
        long adw_view_stack_page_get_icon_name(long _self);
        long adw_view_stack_page_get_name(long _self);
        boolean adw_view_stack_page_get_needs_attention(long _self);
        long adw_view_stack_page_get_title(long _self);
        boolean adw_view_stack_page_get_use_underline(long _self);
        boolean adw_view_stack_page_get_visible(long _self);
        void adw_view_stack_page_set_badge_number(long _self, int badge_number);
        void adw_view_stack_page_set_icon_name(long _self, long icon_name);
        void adw_view_stack_page_set_icon_name(long _self, String icon_name);
        void adw_view_stack_page_set_name(long _self, long name);
        void adw_view_stack_page_set_name(long _self, String name);
        void adw_view_stack_page_set_needs_attention(long _self, boolean needs_attention);
        void adw_view_stack_page_set_title(long _self, long title);
        void adw_view_stack_page_set_title(long _self, String title);
        void adw_view_stack_page_set_use_underline(long _self, boolean use_underline);
        void adw_view_stack_page_set_visible(long _self, boolean visible);
        long adw_view_stack_page_get_type();
    }

}
