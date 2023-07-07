/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaObjectClass {

    @FunctionalInterface
    public interface OnConstructor extends com.sun.jna.Callback {
        long invoke(long type, int n_construct_properties, long construct_properties);
    }

    @FunctionalInterface
    public interface OnSetProperty extends com.sun.jna.Callback {
        void invoke(long object, int property_id, long value, long pspec);
    }

    @FunctionalInterface
    public interface OnGetProperty extends com.sun.jna.Callback {
        void invoke(long object, int property_id, long value, long pspec);
    }

    @FunctionalInterface
    public interface OnDispose extends com.sun.jna.Callback {
        void invoke(long object);
    }

    @FunctionalInterface
    public interface OnFinalize extends com.sun.jna.Callback {
        void invoke(long object);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ObjectClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ObjectClass.G_TYPE_CLASS, ObjectClass.CONSTRUCT_PROPERTIES, ObjectClass.CONSTRUCTOR, ObjectClass.SET_PROPERTY, ObjectClass.GET_PROPERTY, ObjectClass.DISPOSE, ObjectClass.FINALIZE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_type_class = new byte[TypeClass.getInstanceSize()];
        public long construct_properties;
        public OnConstructor constructor;
        public OnSetProperty set_property;
        public OnGetProperty get_property;
        public OnDispose dispose;
        public OnFinalize finalize;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_object_class_find_property(long _self, long property_name);
        long g_object_class_find_property(long _self, String property_name);
        void g_object_class_install_property(long _self, int property_id, long pspec);
        void g_object_class_override_property(long _self, int property_id, long name);
        void g_object_class_override_property(long _self, int property_id, String name);
    }

}
