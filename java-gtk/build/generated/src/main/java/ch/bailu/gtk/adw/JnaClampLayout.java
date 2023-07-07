/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaClampLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_clamp_layout_new();
        int adw_clamp_layout_get_maximum_size(long _self);
        int adw_clamp_layout_get_tightening_threshold(long _self);
        void adw_clamp_layout_set_maximum_size(long _self, int maximum_size);
        void adw_clamp_layout_set_tightening_threshold(long _self, int tightening_threshold);
        long adw_clamp_layout_get_type();
    }

}
