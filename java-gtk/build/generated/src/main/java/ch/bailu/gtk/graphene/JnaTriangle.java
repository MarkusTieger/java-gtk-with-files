/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaTriangle {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Triangle size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Triangle.A, Triangle.B, Triangle.C})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] a = new byte[Vec3.getInstanceSize()];
        public byte[] b = new byte[Vec3.getInstanceSize()];
        public byte[] c = new byte[Vec3.getInstanceSize()];
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_triangle_alloc();
        boolean graphene_triangle_contains_point(long _self, long p);
        boolean graphene_triangle_equal(long _self, long b);
        void graphene_triangle_free(long _self);
        float graphene_triangle_get_area(long _self);
        boolean graphene_triangle_get_barycoords(long _self, long p, long res);
        void graphene_triangle_get_bounding_box(long _self, long res);
        void graphene_triangle_get_midpoint(long _self, long res);
        void graphene_triangle_get_normal(long _self, long res);
        void graphene_triangle_get_plane(long _self, long res);
        void graphene_triangle_get_points(long _self, long a, long b, long c);
        boolean graphene_triangle_get_uv(long _self, long p, long uv_a, long uv_b, long uv_c, long res);
        void graphene_triangle_get_vertices(long _self, long a, long b, long c);
        long graphene_triangle_init_from_point3d(long _self, long a, long b, long c);
        long graphene_triangle_init_from_vec3(long _self, long a, long b, long c);
        long graphene_triangle_get_type();
    }

}
