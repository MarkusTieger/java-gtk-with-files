/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaSpringParams {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_spring_params_new(double damping_ratio, double mass, double stiffness);
        long adw_spring_params_new_full(double damping, double mass, double stiffness);
        double adw_spring_params_get_damping(long _self);
        double adw_spring_params_get_damping_ratio(long _self);
        double adw_spring_params_get_mass(long _self);
        double adw_spring_params_get_stiffness(long _self);
        long adw_spring_params_ref(long _self);
        void adw_spring_params_unref(long _self);
        long adw_spring_params_get_type();
    }

}
