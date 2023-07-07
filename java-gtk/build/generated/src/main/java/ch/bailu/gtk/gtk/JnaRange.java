/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRange {

    @FunctionalInterface
    public interface OnAdjustBounds extends com.sun.jna.Callback {
        void invoke(long _self, double value, long _data);
    }

    @FunctionalInterface
    public interface OnChangeValue extends com.sun.jna.Callback {
        boolean invoke(long _self, int scroll, double value, long _data);
    }

    @FunctionalInterface
    public interface OnMoveSlider extends com.sun.jna.Callback {
        void invoke(long _self, int step, long _data);
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
        long gtk_range_get_adjustment(long _self);
        double gtk_range_get_fill_level(long _self);
        boolean gtk_range_get_flippable(long _self);
        boolean gtk_range_get_inverted(long _self);
        void gtk_range_get_range_rect(long _self, long range_rect);
        boolean gtk_range_get_restrict_to_fill_level(long _self);
        int gtk_range_get_round_digits(long _self);
        boolean gtk_range_get_show_fill_level(long _self);
        void gtk_range_get_slider_range(long _self, long slider_start, long slider_end);
        boolean gtk_range_get_slider_size_fixed(long _self);
        double gtk_range_get_value(long _self);
        void gtk_range_set_adjustment(long _self, long adjustment);
        void gtk_range_set_fill_level(long _self, double fill_level);
        void gtk_range_set_flippable(long _self, boolean flippable);
        void gtk_range_set_increments(long _self, double step, double page);
        void gtk_range_set_inverted(long _self, boolean setting);
        void gtk_range_set_range(long _self, double min, double max);
        void gtk_range_set_restrict_to_fill_level(long _self, boolean restrict_to_fill_level);
        void gtk_range_set_round_digits(long _self, int round_digits);
        void gtk_range_set_show_fill_level(long _self, boolean show_fill_level);
        void gtk_range_set_slider_size_fixed(long _self, boolean size_fixed);
        void gtk_range_set_value(long _self, double value);
        long gtk_range_get_type();
    }

}
