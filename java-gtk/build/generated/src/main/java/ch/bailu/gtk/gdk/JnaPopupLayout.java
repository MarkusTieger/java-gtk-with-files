/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaPopupLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_popup_layout_new(long anchor_rect, int rect_anchor, int surface_anchor);
        long gdk_popup_layout_copy(long _self);
        boolean gdk_popup_layout_equal(long _self, long other);
        int gdk_popup_layout_get_anchor_hints(long _self);
        long gdk_popup_layout_get_anchor_rect(long _self);
        void gdk_popup_layout_get_offset(long _self, long dx, long dy);
        int gdk_popup_layout_get_rect_anchor(long _self);
        void gdk_popup_layout_get_shadow_width(long _self, long left, long right, long top, long bottom);
        int gdk_popup_layout_get_surface_anchor(long _self);
        long gdk_popup_layout_ref(long _self);
        void gdk_popup_layout_set_anchor_hints(long _self, int anchor_hints);
        void gdk_popup_layout_set_anchor_rect(long _self, long anchor_rect);
        void gdk_popup_layout_set_offset(long _self, int dx, int dy);
        void gdk_popup_layout_set_rect_anchor(long _self, int anchor);
        void gdk_popup_layout_set_shadow_width(long _self, int left, int right, int top, int bottom);
        void gdk_popup_layout_set_surface_anchor(long _self, int anchor);
        void gdk_popup_layout_unref(long _self);
        long gdk_popup_layout_get_type();
    }

}
