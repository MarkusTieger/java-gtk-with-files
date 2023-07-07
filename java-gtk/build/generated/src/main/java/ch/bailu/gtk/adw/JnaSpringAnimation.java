/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaSpringAnimation {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_spring_animation_new(long widget, double from, double to, long spring_params, long target);
        boolean adw_spring_animation_get_clamp(long _self);
        double adw_spring_animation_get_epsilon(long _self);
        int adw_spring_animation_get_estimated_duration(long _self);
        double adw_spring_animation_get_initial_velocity(long _self);
        long adw_spring_animation_get_spring_params(long _self);
        double adw_spring_animation_get_value_from(long _self);
        double adw_spring_animation_get_value_to(long _self);
        double adw_spring_animation_get_velocity(long _self);
        void adw_spring_animation_set_clamp(long _self, boolean clamp);
        void adw_spring_animation_set_epsilon(long _self, double epsilon);
        void adw_spring_animation_set_initial_velocity(long _self, double velocity);
        void adw_spring_animation_set_spring_params(long _self, long spring_params);
        void adw_spring_animation_set_value_from(long _self, double value);
        void adw_spring_animation_set_value_to(long _self, double value);
        long adw_spring_animation_get_type();
    }

}
