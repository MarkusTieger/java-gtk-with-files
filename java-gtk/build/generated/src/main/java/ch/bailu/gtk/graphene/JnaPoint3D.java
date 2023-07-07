/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaPoint3D {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Point3D size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Point3D.X, Point3D.Y, Point3D.Z})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public float x;
        public float y;
        public float z;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_point3d_alloc();
        void graphene_point3d_cross(long _self, long b, long res);
        float graphene_point3d_distance(long _self, long b, long delta);
        float graphene_point3d_dot(long _self, long b);
        boolean graphene_point3d_equal(long _self, long b);
        void graphene_point3d_free(long _self);
        long graphene_point3d_init(long _self, float x, float y, float z);
        long graphene_point3d_init_from_point(long _self, long src);
        long graphene_point3d_init_from_vec3(long _self, long v);
        void graphene_point3d_interpolate(long _self, long b, double factor, long res);
        float graphene_point3d_length(long _self);
        boolean graphene_point3d_near(long _self, long b, float epsilon);
        void graphene_point3d_normalize(long _self, long res);
        void graphene_point3d_normalize_viewport(long _self, long viewport, float z_near, float z_far, long res);
        void graphene_point3d_scale(long _self, float factor, long res);
        void graphene_point3d_to_vec3(long _self, long v);
        long graphene_point3d_zero();
        long graphene_point3d_get_type();
    }

}
