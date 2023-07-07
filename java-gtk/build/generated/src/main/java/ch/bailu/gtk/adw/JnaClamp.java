/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaClamp {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_clamp_new();
        long adw_clamp_get_child(long _self);
        int adw_clamp_get_maximum_size(long _self);
        int adw_clamp_get_tightening_threshold(long _self);
        void adw_clamp_set_child(long _self, long child);
        void adw_clamp_set_maximum_size(long _self, int maximum_size);
        void adw_clamp_set_tightening_threshold(long _self, int tightening_threshold);
        long adw_clamp_get_type();
    }

}
