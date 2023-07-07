/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaFrustum {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_frustum_alloc();
        boolean graphene_frustum_contains_point(long _self, long point);
        boolean graphene_frustum_equal(long _self, long b);
        void graphene_frustum_free(long _self);
        long graphene_frustum_init(long _self, long p0, long p1, long p2, long p3, long p4, long p5);
        long graphene_frustum_init_from_frustum(long _self, long src);
        long graphene_frustum_init_from_matrix(long _self, long matrix);
        boolean graphene_frustum_intersects_box(long _self, long box);
        boolean graphene_frustum_intersects_sphere(long _self, long sphere);
        long graphene_frustum_get_type();
    }

}
