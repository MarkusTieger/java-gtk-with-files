/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaVec3 {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_vec3_alloc();
        void graphene_vec3_add(long _self, long b, long res);
        void graphene_vec3_cross(long _self, long b, long res);
        void graphene_vec3_divide(long _self, long b, long res);
        float graphene_vec3_dot(long _self, long b);
        boolean graphene_vec3_equal(long _self, long v2);
        void graphene_vec3_free(long _self);
        float graphene_vec3_get_x(long _self);
        void graphene_vec3_get_xy(long _self, long res);
        void graphene_vec3_get_xy0(long _self, long res);
        void graphene_vec3_get_xyz0(long _self, long res);
        void graphene_vec3_get_xyz1(long _self, long res);
        void graphene_vec3_get_xyzw(long _self, float w, long res);
        float graphene_vec3_get_y(long _self);
        float graphene_vec3_get_z(long _self);
        long graphene_vec3_init(long _self, float x, float y, float z);
        long graphene_vec3_init_from_vec3(long _self, long src);
        void graphene_vec3_interpolate(long _self, long v2, double factor, long res);
        float graphene_vec3_length(long _self);
        void graphene_vec3_max(long _self, long b, long res);
        void graphene_vec3_min(long _self, long b, long res);
        void graphene_vec3_multiply(long _self, long b, long res);
        boolean graphene_vec3_near(long _self, long v2, float epsilon);
        void graphene_vec3_negate(long _self, long res);
        void graphene_vec3_normalize(long _self, long res);
        void graphene_vec3_scale(long _self, float factor, long res);
        void graphene_vec3_subtract(long _self, long b, long res);
        void graphene_vec3_to_float(long _self, long dest);
        long graphene_vec3_one();
        long graphene_vec3_x_axis();
        long graphene_vec3_y_axis();
        long graphene_vec3_z_axis();
        long graphene_vec3_zero();
        long graphene_vec3_get_type();
    }

}
