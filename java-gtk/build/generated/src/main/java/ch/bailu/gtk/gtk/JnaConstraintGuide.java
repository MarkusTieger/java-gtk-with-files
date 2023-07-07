/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaConstraintGuide {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_constraint_guide_new();
        void gtk_constraint_guide_get_max_size(long _self, long width, long height);
        void gtk_constraint_guide_get_min_size(long _self, long width, long height);
        long gtk_constraint_guide_get_name(long _self);
        void gtk_constraint_guide_get_nat_size(long _self, long width, long height);
        int gtk_constraint_guide_get_strength(long _self);
        void gtk_constraint_guide_set_max_size(long _self, int width, int height);
        void gtk_constraint_guide_set_min_size(long _self, int width, int height);
        void gtk_constraint_guide_set_name(long _self, long name);
        void gtk_constraint_guide_set_name(long _self, String name);
        void gtk_constraint_guide_set_nat_size(long _self, int width, int height);
        void gtk_constraint_guide_set_strength(long _self, int strength);
        long gtk_constraint_guide_get_type();
    }

}
