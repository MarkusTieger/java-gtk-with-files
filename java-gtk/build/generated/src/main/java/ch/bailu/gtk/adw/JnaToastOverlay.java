/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaToastOverlay {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_toast_overlay_new();
        void adw_toast_overlay_add_toast(long _self, long toast);
        long adw_toast_overlay_get_child(long _self);
        void adw_toast_overlay_set_child(long _self, long child);
        long adw_toast_overlay_get_type();
    }

}
