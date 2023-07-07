/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaScaleButton {

    @FunctionalInterface
    public interface OnPopdown extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPopup extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnValueChanged extends com.sun.jna.Callback {
        void invoke(long _self, double value, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_scale_button_new(double min, double max, double step, long icons);
        long gtk_scale_button_get_adjustment(long _self);
        long gtk_scale_button_get_minus_button(long _self);
        long gtk_scale_button_get_plus_button(long _self);
        long gtk_scale_button_get_popup(long _self);
        double gtk_scale_button_get_value(long _self);
        void gtk_scale_button_set_adjustment(long _self, long adjustment);
        void gtk_scale_button_set_icons(long _self, long icons);
        void gtk_scale_button_set_value(long _self, double value);
        long gtk_scale_button_get_type();
    }

}
