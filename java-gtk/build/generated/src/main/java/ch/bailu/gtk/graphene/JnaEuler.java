/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaEuler {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Euler size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Euler.ANGLES, Euler.ORDER})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] angles = new byte[Vec3.getInstanceSize()];
        public int order;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_euler_alloc();
        boolean graphene_euler_equal(long _self, long b);
        void graphene_euler_free(long _self);
        float graphene_euler_get_alpha(long _self);
        float graphene_euler_get_beta(long _self);
        float graphene_euler_get_gamma(long _self);
        int graphene_euler_get_order(long _self);
        float graphene_euler_get_x(long _self);
        float graphene_euler_get_y(long _self);
        float graphene_euler_get_z(long _self);
        long graphene_euler_init(long _self, float x, float y, float z);
        long graphene_euler_init_from_euler(long _self, long src);
        long graphene_euler_init_from_matrix(long _self, long m, int order);
        long graphene_euler_init_from_quaternion(long _self, long q, int order);
        long graphene_euler_init_from_radians(long _self, float x, float y, float z, int order);
        long graphene_euler_init_from_vec3(long _self, long v, int order);
        long graphene_euler_init_with_order(long _self, float x, float y, float z, int order);
        void graphene_euler_reorder(long _self, int order, long res);
        void graphene_euler_to_matrix(long _self, long res);
        void graphene_euler_to_quaternion(long _self, long res);
        void graphene_euler_to_vec3(long _self, long res);
        long graphene_euler_get_type();
    }

}
