/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaVec2 {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_vec2_alloc();
        void graphene_vec2_add(long _self, long b, long res);
        void graphene_vec2_divide(long _self, long b, long res);
        float graphene_vec2_dot(long _self, long b);
        boolean graphene_vec2_equal(long _self, long v2);
        void graphene_vec2_free(long _self);
        float graphene_vec2_get_x(long _self);
        float graphene_vec2_get_y(long _self);
        long graphene_vec2_init(long _self, float x, float y);
        long graphene_vec2_init_from_vec2(long _self, long src);
        void graphene_vec2_interpolate(long _self, long v2, double factor, long res);
        float graphene_vec2_length(long _self);
        void graphene_vec2_max(long _self, long b, long res);
        void graphene_vec2_min(long _self, long b, long res);
        void graphene_vec2_multiply(long _self, long b, long res);
        boolean graphene_vec2_near(long _self, long v2, float epsilon);
        void graphene_vec2_negate(long _self, long res);
        void graphene_vec2_normalize(long _self, long res);
        void graphene_vec2_scale(long _self, float factor, long res);
        void graphene_vec2_subtract(long _self, long b, long res);
        void graphene_vec2_to_float(long _self, long dest);
        long graphene_vec2_one();
        long graphene_vec2_x_axis();
        long graphene_vec2_y_axis();
        long graphene_vec2_zero();
        long graphene_vec2_get_type();
    }

}
