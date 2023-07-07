/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaBox {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Box size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Box.MIN, Box.MAX})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] min = new byte[Vec3.getInstanceSize()];
        public byte[] max = new byte[Vec3.getInstanceSize()];
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_box_alloc();
        boolean graphene_box_contains_box(long _self, long b);
        boolean graphene_box_contains_point(long _self, long point);
        boolean graphene_box_equal(long _self, long b);
        void graphene_box_expand(long _self, long point, long res);
        void graphene_box_expand_scalar(long _self, float scalar, long res);
        void graphene_box_expand_vec3(long _self, long vec, long res);
        void graphene_box_free(long _self);
        void graphene_box_get_bounding_sphere(long _self, long sphere);
        void graphene_box_get_center(long _self, long center);
        float graphene_box_get_depth(long _self);
        float graphene_box_get_height(long _self);
        void graphene_box_get_max(long _self, long max);
        void graphene_box_get_min(long _self, long min);
        void graphene_box_get_size(long _self, long size);
        float graphene_box_get_width(long _self);
        long graphene_box_init(long _self, long min, long max);
        long graphene_box_init_from_box(long _self, long src);
        long graphene_box_init_from_vec3(long _self, long min, long max);
        boolean graphene_box_intersection(long _self, long b, long res);
        void graphene_box_union(long _self, long b, long res);
        long graphene_box_empty();
        long graphene_box_infinite();
        long graphene_box_minus_one();
        long graphene_box_one();
        long graphene_box_one_minus_one();
        long graphene_box_zero();
        long graphene_box_get_type();
    }

}
