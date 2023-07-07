/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaTransform {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_transform_new();
        boolean gsk_transform_equal(long _self, long second);
        int gsk_transform_get_category(long _self);
        long gsk_transform_invert(long _self);
        long gsk_transform_matrix(long _self, long matrix);
        long gsk_transform_perspective(long _self, float depth);
        void gsk_transform_print(long _self, long string);
        long gsk_transform_ref(long _self);
        long gsk_transform_rotate(long _self, float angle);
        long gsk_transform_rotate_3d(long _self, float angle, long axis);
        long gsk_transform_scale(long _self, float factor_x, float factor_y);
        long gsk_transform_scale_3d(long _self, float factor_x, float factor_y, float factor_z);
        long gsk_transform_skew(long _self, float skew_x, float skew_y);
        void gsk_transform_to_2d(long _self, long out_xx, long out_yx, long out_xy, long out_yy, long out_dx, long out_dy);
        void gsk_transform_to_2d_components(long _self, long out_skew_x, long out_skew_y, long out_scale_x, long out_scale_y, long out_angle, long out_dx, long out_dy);
        void gsk_transform_to_affine(long _self, long out_scale_x, long out_scale_y, long out_dx, long out_dy);
        void gsk_transform_to_matrix(long _self, long out_matrix);
        long gsk_transform_to_string(long _self);
        void gsk_transform_to_translate(long _self, long out_dx, long out_dy);
        long gsk_transform_transform(long _self, long other);
        void gsk_transform_transform_bounds(long _self, long rect, long out_rect);
        void gsk_transform_transform_point(long _self, long point, long out_point);
        long gsk_transform_translate(long _self, long point);
        long gsk_transform_translate_3d(long _self, long point);
        void gsk_transform_unref(long _self);
        long gsk_transform_get_type();
    }

}
