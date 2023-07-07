/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaRay {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Ray size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Ray.ORIGIN, Ray.DIRECTION})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] origin = new byte[Vec3.getInstanceSize()];
        public byte[] direction = new byte[Vec3.getInstanceSize()];
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_ray_alloc();
        boolean graphene_ray_equal(long _self, long b);
        void graphene_ray_free(long _self);
        void graphene_ray_get_closest_point_to_point(long _self, long p, long res);
        void graphene_ray_get_direction(long _self, long direction);
        float graphene_ray_get_distance_to_plane(long _self, long p);
        float graphene_ray_get_distance_to_point(long _self, long p);
        void graphene_ray_get_origin(long _self, long origin);
        void graphene_ray_get_position_at(long _self, float t, long position);
        long graphene_ray_init(long _self, long origin, long direction);
        long graphene_ray_init_from_ray(long _self, long src);
        long graphene_ray_init_from_vec3(long _self, long origin, long direction);
        int graphene_ray_intersect_box(long _self, long b, long t_out);
        int graphene_ray_intersect_sphere(long _self, long s, long t_out);
        int graphene_ray_intersect_triangle(long _self, long t, long t_out);
        boolean graphene_ray_intersects_box(long _self, long b);
        boolean graphene_ray_intersects_sphere(long _self, long s);
        boolean graphene_ray_intersects_triangle(long _self, long t);
        long graphene_ray_get_type();
    }

}
