/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaQuad {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_quad_alloc();
        void graphene_quad_bounds(long _self, long r);
        boolean graphene_quad_contains(long _self, long p);
        void graphene_quad_free(long _self);
        long graphene_quad_init(long _self, long p1, long p2, long p3, long p4);
        long graphene_quad_init_from_rect(long _self, long r);
        long graphene_quad_get_type();
    }

}
