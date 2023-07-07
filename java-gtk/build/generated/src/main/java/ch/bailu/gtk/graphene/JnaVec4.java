/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaVec4 {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_vec4_alloc();
        void graphene_vec4_add(long _self, long b, long res);
        void graphene_vec4_divide(long _self, long b, long res);
        float graphene_vec4_dot(long _self, long b);
        boolean graphene_vec4_equal(long _self, long v2);
        void graphene_vec4_free(long _self);
        float graphene_vec4_get_w(long _self);
        float graphene_vec4_get_x(long _self);
        void graphene_vec4_get_xy(long _self, long res);
        void graphene_vec4_get_xyz(long _self, long res);
        float graphene_vec4_get_y(long _self);
        float graphene_vec4_get_z(long _self);
        long graphene_vec4_init(long _self, float x, float y, float z, float w);
        long graphene_vec4_init_from_vec2(long _self, long src, float z, float w);
        long graphene_vec4_init_from_vec3(long _self, long src, float w);
        long graphene_vec4_init_from_vec4(long _self, long src);
        void graphene_vec4_interpolate(long _self, long v2, double factor, long res);
        float graphene_vec4_length(long _self);
        void graphene_vec4_max(long _self, long b, long res);
        void graphene_vec4_min(long _self, long b, long res);
        void graphene_vec4_multiply(long _self, long b, long res);
        boolean graphene_vec4_near(long _self, long v2, float epsilon);
        void graphene_vec4_negate(long _self, long res);
        void graphene_vec4_normalize(long _self, long res);
        void graphene_vec4_scale(long _self, float factor, long res);
        void graphene_vec4_subtract(long _self, long b, long res);
        void graphene_vec4_to_float(long _self, long dest);
        long graphene_vec4_one();
        long graphene_vec4_w_axis();
        long graphene_vec4_x_axis();
        long graphene_vec4_y_axis();
        long graphene_vec4_z_axis();
        long graphene_vec4_zero();
        long graphene_vec4_get_type();
    }

}
