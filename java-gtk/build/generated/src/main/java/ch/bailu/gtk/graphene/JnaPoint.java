/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaPoint {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Point size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Point.X, Point.Y})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public float x;
        public float y;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_point_alloc();
        float graphene_point_distance(long _self, long b, long d_x, long d_y);
        boolean graphene_point_equal(long _self, long b);
        void graphene_point_free(long _self);
        long graphene_point_init(long _self, float x, float y);
        long graphene_point_init_from_point(long _self, long src);
        long graphene_point_init_from_vec2(long _self, long src);
        void graphene_point_interpolate(long _self, long b, double factor, long res);
        boolean graphene_point_near(long _self, long b, float epsilon);
        void graphene_point_to_vec2(long _self, long v);
        long graphene_point_zero();
        long graphene_point_get_type();
    }

}
