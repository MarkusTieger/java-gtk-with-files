/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaValue {

    @FunctionalInterface
    public interface OnValueTransform extends com.sun.jna.Callback {
        void invoke(long src_value, long dest_value);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Value size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Value.G_TYPE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long g_type;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_value_copy(long _self, long dest_value);
        long g_value_dup_boxed(long _self);
        long g_value_dup_object(long _self);
        long g_value_dup_param(long _self);
        long g_value_dup_string(long _self);
        long g_value_dup_variant(long _self);
        boolean g_value_fits_pointer(long _self);
        boolean g_value_get_boolean(long _self);
        long g_value_get_boxed(long _self);
        double g_value_get_double(long _self);
        int g_value_get_enum(long _self);
        int g_value_get_flags(long _self);
        float g_value_get_float(long _self);
        long g_value_get_gtype(long _self);
        int g_value_get_int(long _self);
        long g_value_get_int64(long _self);
        long g_value_get_long(long _self);
        long g_value_get_object(long _self);
        long g_value_get_param(long _self);
        long g_value_get_pointer(long _self);
        int g_value_get_schar(long _self);
        long g_value_get_string(long _self);
        int g_value_get_uint(long _self);
        long g_value_get_uint64(long _self);
        long g_value_get_ulong(long _self);
        long g_value_get_variant(long _self);
        long g_value_init(long _self, long g_type);
        void g_value_init_from_instance(long _self, long instance);
        long g_value_peek_pointer(long _self);
        long g_value_reset(long _self);
        void g_value_set_boolean(long _self, boolean v_boolean);
        void g_value_set_boxed(long _self, long v_boxed);
        void g_value_set_double(long _self, double v_double);
        void g_value_set_enum(long _self, int v_enum);
        void g_value_set_flags(long _self, int v_flags);
        void g_value_set_float(long _self, float v_float);
        void g_value_set_gtype(long _self, long v_gtype);
        void g_value_set_instance(long _self, long instance);
        void g_value_set_int(long _self, int v_int);
        void g_value_set_int64(long _self, long v_int64);
        void g_value_set_interned_string(long _self, long v_string);
        void g_value_set_interned_string(long _self, String v_string);
        void g_value_set_long(long _self, long v_long);
        void g_value_set_object(long _self, long v_object);
        void g_value_set_param(long _self, long param);
        void g_value_set_pointer(long _self, long v_pointer);
        void g_value_set_schar(long _self, int v_char);
        void g_value_set_static_boxed(long _self, long v_boxed);
        void g_value_set_static_string(long _self, long v_string);
        void g_value_set_static_string(long _self, String v_string);
        void g_value_set_string(long _self, long v_string);
        void g_value_set_string(long _self, String v_string);
        void g_value_set_uint(long _self, int v_uint);
        void g_value_set_uint64(long _self, long v_uint64);
        void g_value_set_ulong(long _self, long v_ulong);
        void g_value_set_variant(long _self, long variant);
        void g_value_take_boxed(long _self, long v_boxed);
        void g_value_take_object(long _self, long v_object);
        void g_value_take_param(long _self, long param);
        void g_value_take_string(long _self, long v_string);
        void g_value_take_variant(long _self, long variant);
        boolean g_value_transform(long _self, long dest_value);
        void g_value_unset(long _self);
        void g_value_register_transform_func(long src_type, long dest_type, com.sun.jna.Callback transform_func);
        boolean g_value_type_compatible(long src_type, long dest_type);
        boolean g_value_type_transformable(long src_type, long dest_type);
        long g_value_get_type();
    }

}
