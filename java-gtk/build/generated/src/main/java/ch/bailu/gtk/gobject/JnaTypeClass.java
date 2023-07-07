/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypeClass {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TypeClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TypeClass.G_TYPE})
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
        int g_type_class_get_instance_private_offset(long _self);
        long g_type_class_get_private(long _self, long private_type);
        long g_type_class_peek_parent(long _self);
        void g_type_class_unref(long _self);
        void g_type_class_unref_uncached(long _self);
        void g_type_class_adjust_private_offset(long g_class, long private_size_or_offset);
        long g_type_class_peek(long type);
        long g_type_class_peek_static(long type);
        long g_type_class_ref(long type);
    }

}
