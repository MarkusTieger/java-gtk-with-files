/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaSphere {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Sphere size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Sphere.CENTER, Sphere.RADIUS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] center = new byte[Vec3.getInstanceSize()];
        public float radius;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_sphere_alloc();
        boolean graphene_sphere_contains_point(long _self, long point);
        float graphene_sphere_distance(long _self, long point);
        boolean graphene_sphere_equal(long _self, long b);
        void graphene_sphere_free(long _self);
        void graphene_sphere_get_bounding_box(long _self, long box);
        void graphene_sphere_get_center(long _self, long center);
        float graphene_sphere_get_radius(long _self);
        long graphene_sphere_init(long _self, long center, float radius);
        boolean graphene_sphere_is_empty(long _self);
        void graphene_sphere_translate(long _self, long point, long res);
        long graphene_sphere_get_type();
    }

}
