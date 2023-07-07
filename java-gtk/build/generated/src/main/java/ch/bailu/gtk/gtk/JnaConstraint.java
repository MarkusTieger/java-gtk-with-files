/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaConstraint {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_constraint_new(long target, int target_attribute, int relation, long source, int source_attribute, double multiplier, double constant, int strength);
        long gtk_constraint_new_constant(long target, int target_attribute, int relation, double constant, int strength);
        double gtk_constraint_get_constant(long _self);
        double gtk_constraint_get_multiplier(long _self);
        int gtk_constraint_get_relation(long _self);
        long gtk_constraint_get_source(long _self);
        int gtk_constraint_get_source_attribute(long _self);
        int gtk_constraint_get_strength(long _self);
        long gtk_constraint_get_target(long _self);
        int gtk_constraint_get_target_attribute(long _self);
        boolean gtk_constraint_is_attached(long _self);
        boolean gtk_constraint_is_constant(long _self);
        boolean gtk_constraint_is_required(long _self);
        long gtk_constraint_get_type();
    }

}
