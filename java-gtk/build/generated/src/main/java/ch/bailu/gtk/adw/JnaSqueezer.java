/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaSqueezer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_squeezer_new();
        long adw_squeezer_add(long _self, long child);
        boolean adw_squeezer_get_allow_none(long _self);
        boolean adw_squeezer_get_homogeneous(long _self);
        boolean adw_squeezer_get_interpolate_size(long _self);
        long adw_squeezer_get_page(long _self, long child);
        long adw_squeezer_get_pages(long _self);
        int adw_squeezer_get_switch_threshold_policy(long _self);
        int adw_squeezer_get_transition_duration(long _self);
        boolean adw_squeezer_get_transition_running(long _self);
        int adw_squeezer_get_transition_type(long _self);
        long adw_squeezer_get_visible_child(long _self);
        float adw_squeezer_get_xalign(long _self);
        float adw_squeezer_get_yalign(long _self);
        void adw_squeezer_remove(long _self, long child);
        void adw_squeezer_set_allow_none(long _self, boolean allow_none);
        void adw_squeezer_set_homogeneous(long _self, boolean homogeneous);
        void adw_squeezer_set_interpolate_size(long _self, boolean interpolate_size);
        void adw_squeezer_set_switch_threshold_policy(long _self, int policy);
        void adw_squeezer_set_transition_duration(long _self, int duration);
        void adw_squeezer_set_transition_type(long _self, int transition);
        void adw_squeezer_set_xalign(long _self, float xalign);
        void adw_squeezer_set_yalign(long _self, float yalign);
        long adw_squeezer_get_type();
    }

}
