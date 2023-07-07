/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaQuaternion {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Quaternion size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Quaternion.X, Quaternion.Y, Quaternion.Z, Quaternion.W})
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
        public float w;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_quaternion_alloc();
        void graphene_quaternion_add(long _self, long b, long res);
        float graphene_quaternion_dot(long _self, long b);
        boolean graphene_quaternion_equal(long _self, long b);
        void graphene_quaternion_free(long _self);
        long graphene_quaternion_init(long _self, float x, float y, float z, float w);
        long graphene_quaternion_init_from_angle_vec3(long _self, float angle, long axis);
        long graphene_quaternion_init_from_angles(long _self, float deg_x, float deg_y, float deg_z);
        long graphene_quaternion_init_from_euler(long _self, long e);
        long graphene_quaternion_init_from_matrix(long _self, long m);
        long graphene_quaternion_init_from_quaternion(long _self, long src);
        long graphene_quaternion_init_from_radians(long _self, float rad_x, float rad_y, float rad_z);
        long graphene_quaternion_init_from_vec4(long _self, long src);
        long graphene_quaternion_init_identity(long _self);
        void graphene_quaternion_invert(long _self, long res);
        void graphene_quaternion_multiply(long _self, long b, long res);
        void graphene_quaternion_normalize(long _self, long res);
        void graphene_quaternion_scale(long _self, float factor, long res);
        void graphene_quaternion_slerp(long _self, long b, float factor, long res);
        void graphene_quaternion_to_angle_vec3(long _self, long angle, long axis);
        void graphene_quaternion_to_angles(long _self, long deg_x, long deg_y, long deg_z);
        void graphene_quaternion_to_matrix(long _self, long m);
        void graphene_quaternion_to_radians(long _self, long rad_x, long rad_y, long rad_z);
        void graphene_quaternion_to_vec4(long _self, long res);
        long graphene_quaternion_get_type();
    }

}
