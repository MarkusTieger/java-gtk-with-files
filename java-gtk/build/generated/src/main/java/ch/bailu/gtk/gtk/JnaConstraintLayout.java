/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaConstraintLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_constraint_layout_new();
        void gtk_constraint_layout_add_constraint(long _self, long constraint);
        long gtk_constraint_layout_add_constraints_from_descriptionv(long _self, long lines, long n_lines, int hspacing, int vspacing, long views, long _error);
        void gtk_constraint_layout_add_guide(long _self, long guide);
        long gtk_constraint_layout_observe_constraints(long _self);
        long gtk_constraint_layout_observe_guides(long _self);
        void gtk_constraint_layout_remove_all_constraints(long _self);
        void gtk_constraint_layout_remove_constraint(long _self, long constraint);
        void gtk_constraint_layout_remove_guide(long _self, long guide);
        long gtk_constraint_layout_get_type();
    }

}
