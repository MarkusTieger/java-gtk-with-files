/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaInterfaceInfo {

    @FunctionalInterface
    public interface OnInterfaceInitFunc extends com.sun.jna.Callback {
        void invoke(long g_iface, long iface_data);
    }

    @FunctionalInterface
    public interface OnInterfaceFinalizeFunc extends com.sun.jna.Callback {
        void invoke(long g_iface, long iface_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("InterfaceInfo size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({InterfaceInfo.INTERFACE_INIT, InterfaceInfo.INTERFACE_FINALIZE, InterfaceInfo.INTERFACE_DATA})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnInterfaceInitFunc interface_init;
        public OnInterfaceFinalizeFunc interface_finalize;
        public long interface_data;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
