/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypeInterface {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TypeInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TypeInterface.G_TYPE, TypeInterface.G_INSTANCE_TYPE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long g_type;
        public long g_instance_type;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_type_interface_peek_parent(long _self);
        void g_type_interface_add_prerequisite(long interface_type, long prerequisite_type);
        long g_type_interface_get_plugin(long instance_type, long interface_type);
        long g_type_interface_instantiatable_prerequisite(long interface_type);
        long g_type_interface_peek(long instance_class, long iface_type);
    }

}
