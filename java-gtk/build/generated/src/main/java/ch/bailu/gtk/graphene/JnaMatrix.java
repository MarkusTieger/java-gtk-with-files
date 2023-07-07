/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaMatrix {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_matrix_alloc();
        boolean graphene_matrix_decompose(long _self, long translate, long scale, long rotate, long shear, long perspective);
        float graphene_matrix_determinant(long _self);
        boolean graphene_matrix_equal(long _self, long b);
        boolean graphene_matrix_equal_fast(long _self, long b);
        void graphene_matrix_free(long _self);
        float graphene_matrix_get_x_scale(long _self);
        float graphene_matrix_get_x_translation(long _self);
        float graphene_matrix_get_y_scale(long _self);
        float graphene_matrix_get_y_translation(long _self);
        float graphene_matrix_get_z_scale(long _self);
        float graphene_matrix_get_z_translation(long _self);
        long graphene_matrix_init_from_2d(long _self, double xx, double yx, double xy, double yy, double x_0, double y_0);
        long graphene_matrix_init_from_matrix(long _self, long src);
        long graphene_matrix_init_from_vec4(long _self, long v0, long v1, long v2, long v3);
        long graphene_matrix_init_frustum(long _self, float left, float right, float bottom, float top, float z_near, float z_far);
        long graphene_matrix_init_identity(long _self);
        long graphene_matrix_init_look_at(long _self, long eye, long center, long up);
        long graphene_matrix_init_ortho(long _self, float left, float right, float top, float bottom, float z_near, float z_far);
        long graphene_matrix_init_perspective(long _self, float fovy, float aspect, float z_near, float z_far);
        long graphene_matrix_init_rotate(long _self, float angle, long axis);
        long graphene_matrix_init_scale(long _self, float x, float y, float z);
        long graphene_matrix_init_skew(long _self, float x_skew, float y_skew);
        long graphene_matrix_init_translate(long _self, long p);
        void graphene_matrix_interpolate(long _self, long b, double factor, long res);
        boolean graphene_matrix_inverse(long _self, long res);
        boolean graphene_matrix_is_2d(long _self);
        boolean graphene_matrix_is_backface_visible(long _self);
        boolean graphene_matrix_is_identity(long _self);
        boolean graphene_matrix_is_singular(long _self);
        void graphene_matrix_multiply(long _self, long b, long res);
        boolean graphene_matrix_near(long _self, long b, float epsilon);
        void graphene_matrix_normalize(long _self, long res);
        void graphene_matrix_perspective(long _self, float depth, long res);
        void graphene_matrix_print(long _self);
        void graphene_matrix_project_point(long _self, long p, long res);
        void graphene_matrix_project_rect(long _self, long r, long res);
        void graphene_matrix_project_rect_bounds(long _self, long r, long res);
        void graphene_matrix_rotate(long _self, float angle, long axis);
        void graphene_matrix_rotate_euler(long _self, long e);
        void graphene_matrix_rotate_quaternion(long _self, long q);
        void graphene_matrix_rotate_x(long _self, float angle);
        void graphene_matrix_rotate_y(long _self, float angle);
        void graphene_matrix_rotate_z(long _self, float angle);
        void graphene_matrix_scale(long _self, float factor_x, float factor_y, float factor_z);
        void graphene_matrix_skew_xy(long _self, float factor);
        void graphene_matrix_skew_xz(long _self, float factor);
        void graphene_matrix_skew_yz(long _self, float factor);
        void graphene_matrix_to_float(long _self, long v);
        void graphene_matrix_transform_bounds(long _self, long r, long res);
        void graphene_matrix_transform_box(long _self, long b, long res);
        void graphene_matrix_transform_point(long _self, long p, long res);
        void graphene_matrix_transform_point3d(long _self, long p, long res);
        void graphene_matrix_transform_ray(long _self, long r, long res);
        void graphene_matrix_transform_rect(long _self, long r, long res);
        void graphene_matrix_transform_sphere(long _self, long s, long res);
        void graphene_matrix_transform_vec3(long _self, long v, long res);
        void graphene_matrix_transform_vec4(long _self, long v, long res);
        void graphene_matrix_translate(long _self, long pos);
        void graphene_matrix_transpose(long _self, long res);
        void graphene_matrix_unproject_point3d(long _self, long modelview, long point, long res);
        void graphene_matrix_untransform_bounds(long _self, long r, long bounds, long res);
        boolean graphene_matrix_untransform_point(long _self, long p, long bounds, long res);
        long graphene_matrix_get_type();
    }

}
