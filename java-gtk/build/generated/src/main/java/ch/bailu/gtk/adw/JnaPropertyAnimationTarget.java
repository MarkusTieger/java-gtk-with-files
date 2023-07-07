/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaPropertyAnimationTarget {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_property_animation_target_new(long object, long property_name);
        long adw_property_animation_target_new(long object, String property_name);
        long adw_property_animation_target_new_for_pspec(long object, long pspec);
        long adw_property_animation_target_get_object(long _self);
        long adw_property_animation_target_get_pspec(long _self);
        long adw_property_animation_target_get_type();
    }

}
