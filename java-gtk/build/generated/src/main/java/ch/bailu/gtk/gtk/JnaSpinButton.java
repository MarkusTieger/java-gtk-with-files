/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSpinButton {

    @FunctionalInterface
    public interface OnChangeValue extends com.sun.jna.Callback {
        void invoke(long _self, int scroll, long _data);
    }

    @FunctionalInterface
    public interface OnInput extends com.sun.jna.Callback {
        int invoke(long _self, long new_value, long _data);
    }

    @FunctionalInterface
    public interface OnOutput extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnValueChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnWrapped extends com.sun.jna.Callback {
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
        long gtk_spin_button_new(long adjustment, double climb_rate, int digits);
        long gtk_spin_button_new_with_range(double min, double max, double step);
        void gtk_spin_button_configure(long _self, long adjustment, double climb_rate, int digits);
        long gtk_spin_button_get_adjustment(long _self);
        double gtk_spin_button_get_climb_rate(long _self);
        int gtk_spin_button_get_digits(long _self);
        boolean gtk_spin_button_get_numeric(long _self);
        boolean gtk_spin_button_get_snap_to_ticks(long _self);
        int gtk_spin_button_get_update_policy(long _self);
        double gtk_spin_button_get_value(long _self);
        int gtk_spin_button_get_value_as_int(long _self);
        boolean gtk_spin_button_get_wrap(long _self);
        void gtk_spin_button_set_adjustment(long _self, long adjustment);
        void gtk_spin_button_set_climb_rate(long _self, double climb_rate);
        void gtk_spin_button_set_digits(long _self, int digits);
        void gtk_spin_button_set_increments(long _self, double step, double page);
        void gtk_spin_button_set_numeric(long _self, boolean numeric);
        void gtk_spin_button_set_range(long _self, double min, double max);
        void gtk_spin_button_set_snap_to_ticks(long _self, boolean snap_to_ticks);
        void gtk_spin_button_set_update_policy(long _self, int policy);
        void gtk_spin_button_set_value(long _self, double value);
        void gtk_spin_button_set_wrap(long _self, boolean wrap);
        void gtk_spin_button_spin(long _self, int direction, double increment);
        void gtk_spin_button_update(long _self);
        long gtk_spin_button_get_type();
    }

}
