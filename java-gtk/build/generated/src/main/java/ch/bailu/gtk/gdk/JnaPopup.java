/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaPopup {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gdk_popup_get_autohide(long _self);
        long gdk_popup_get_parent(long _self);
        int gdk_popup_get_position_x(long _self);
        int gdk_popup_get_position_y(long _self);
        int gdk_popup_get_rect_anchor(long _self);
        int gdk_popup_get_surface_anchor(long _self);
        boolean gdk_popup_present(long _self, int width, int height, long layout);
        long gdk_popup_get_type();
    }

}
