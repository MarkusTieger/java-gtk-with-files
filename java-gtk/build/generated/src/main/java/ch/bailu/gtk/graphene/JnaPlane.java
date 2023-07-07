/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaPlane {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Plane size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Plane.NORMAL, Plane.CONSTANT})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] normal = new byte[Vec3.getInstanceSize()];
        public float constant;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_plane_alloc();
        float graphene_plane_distance(long _self, long point);
        boolean graphene_plane_equal(long _self, long b);
        void graphene_plane_free(long _self);
        float graphene_plane_get_constant(long _self);
        void graphene_plane_get_normal(long _self, long normal);
        long graphene_plane_init(long _self, long normal, float constant);
        long graphene_plane_init_from_plane(long _self, long src);
        long graphene_plane_init_from_point(long _self, long normal, long point);
        long graphene_plane_init_from_points(long _self, long a, long b, long c);
        long graphene_plane_init_from_vec4(long _self, long src);
        void graphene_plane_negate(long _self, long res);
        void graphene_plane_normalize(long _self, long res);
        void graphene_plane_transform(long _self, long matrix, long normal_matrix, long res);
        long graphene_plane_get_type();
    }

}
