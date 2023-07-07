/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaFlap {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_flap_new();
        long adw_flap_get_content(long _self);
        long adw_flap_get_flap(long _self);
        int adw_flap_get_flap_position(long _self);
        int adw_flap_get_fold_duration(long _self);
        int adw_flap_get_fold_policy(long _self);
        int adw_flap_get_fold_threshold_policy(long _self);
        boolean adw_flap_get_folded(long _self);
        boolean adw_flap_get_locked(long _self);
        boolean adw_flap_get_modal(long _self);
        boolean adw_flap_get_reveal_flap(long _self);
        long adw_flap_get_reveal_params(long _self);
        double adw_flap_get_reveal_progress(long _self);
        long adw_flap_get_separator(long _self);
        boolean adw_flap_get_swipe_to_close(long _self);
        boolean adw_flap_get_swipe_to_open(long _self);
        int adw_flap_get_transition_type(long _self);
        void adw_flap_set_content(long _self, long content);
        void adw_flap_set_flap(long _self, long flap);
        void adw_flap_set_flap_position(long _self, int position);
        void adw_flap_set_fold_duration(long _self, int duration);
        void adw_flap_set_fold_policy(long _self, int policy);
        void adw_flap_set_fold_threshold_policy(long _self, int policy);
        void adw_flap_set_locked(long _self, boolean locked);
        void adw_flap_set_modal(long _self, boolean modal);
        void adw_flap_set_reveal_flap(long _self, boolean reveal_flap);
        void adw_flap_set_reveal_params(long _self, long params);
        void adw_flap_set_separator(long _self, long separator);
        void adw_flap_set_swipe_to_close(long _self, boolean swipe_to_close);
        void adw_flap_set_swipe_to_open(long _self, boolean swipe_to_open);
        void adw_flap_set_transition_type(long _self, int transition_type);
        long adw_flap_get_type();
    }

}
