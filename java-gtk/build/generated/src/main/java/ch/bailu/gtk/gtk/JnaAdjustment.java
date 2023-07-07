/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAdjustment {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnValueChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_adjustment_new(double value, double lower, double upper, double step_increment, double page_increment, double page_size);
        void gtk_adjustment_clamp_page(long _self, double lower, double upper);
        void gtk_adjustment_configure(long _self, double value, double lower, double upper, double step_increment, double page_increment, double page_size);
        double gtk_adjustment_get_lower(long _self);
        double gtk_adjustment_get_minimum_increment(long _self);
        double gtk_adjustment_get_page_increment(long _self);
        double gtk_adjustment_get_page_size(long _self);
        double gtk_adjustment_get_step_increment(long _self);
        double gtk_adjustment_get_upper(long _self);
        double gtk_adjustment_get_value(long _self);
        void gtk_adjustment_set_lower(long _self, double lower);
        void gtk_adjustment_set_page_increment(long _self, double page_increment);
        void gtk_adjustment_set_page_size(long _self, double page_size);
        void gtk_adjustment_set_step_increment(long _self, double step_increment);
        void gtk_adjustment_set_upper(long _self, double upper);
        void gtk_adjustment_set_value(long _self, double value);
        long gtk_adjustment_get_type();
    }

}
