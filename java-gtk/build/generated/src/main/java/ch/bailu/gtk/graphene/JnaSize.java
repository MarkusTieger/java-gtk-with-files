/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaSize {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Size size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Size.WIDTH, Size.HEIGHT})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public float width;
        public float height;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_size_alloc();
        boolean graphene_size_equal(long _self, long b);
        void graphene_size_free(long _self);
        long graphene_size_init(long _self, float width, float height);
        long graphene_size_init_from_size(long _self, long src);
        void graphene_size_interpolate(long _self, long b, double factor, long res);
        void graphene_size_scale(long _self, float factor, long res);
        long graphene_size_zero();
        long graphene_size_get_type();
    }

}
