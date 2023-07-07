/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaTimedAnimation {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_timed_animation_new(long widget, double from, double to, int duration, long target);
        boolean adw_timed_animation_get_alternate(long _self);
        int adw_timed_animation_get_duration(long _self);
        int adw_timed_animation_get_easing(long _self);
        int adw_timed_animation_get_repeat_count(long _self);
        boolean adw_timed_animation_get_reverse(long _self);
        double adw_timed_animation_get_value_from(long _self);
        double adw_timed_animation_get_value_to(long _self);
        void adw_timed_animation_set_alternate(long _self, boolean alternate);
        void adw_timed_animation_set_duration(long _self, int duration);
        void adw_timed_animation_set_easing(long _self, int easing);
        void adw_timed_animation_set_repeat_count(long _self, int repeat_count);
        void adw_timed_animation_set_reverse(long _self, boolean reverse);
        void adw_timed_animation_set_value_from(long _self, double value);
        void adw_timed_animation_set_value_to(long _self, double value);
        long adw_timed_animation_get_type();
    }

}
