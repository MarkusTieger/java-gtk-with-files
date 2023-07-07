/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaScale {

    @FunctionalInterface
    public interface OnScaleFormatValueFunc extends com.sun.jna.Callback {
        long invoke(long scale, double value, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_scale_new(int orientation, long adjustment);
        long gtk_scale_new_with_range(int orientation, double min, double max, double step);
        void gtk_scale_add_mark(long _self, double value, int position, long markup);
        void gtk_scale_add_mark(long _self, double value, int position, String markup);
        void gtk_scale_clear_marks(long _self);
        int gtk_scale_get_digits(long _self);
        boolean gtk_scale_get_draw_value(long _self);
        boolean gtk_scale_get_has_origin(long _self);
        long gtk_scale_get_layout(long _self);
        void gtk_scale_get_layout_offsets(long _self, long x, long y);
        int gtk_scale_get_value_pos(long _self);
        void gtk_scale_set_digits(long _self, int digits);
        void gtk_scale_set_draw_value(long _self, boolean draw_value);
        void gtk_scale_set_format_value_func(long _self, com.sun.jna.Callback func, long user_data, com.sun.jna.Callback destroy_notify);
        void gtk_scale_set_has_origin(long _self, boolean has_origin);
        void gtk_scale_set_value_pos(long _self, int pos);
        long gtk_scale_get_type();
    }

}
