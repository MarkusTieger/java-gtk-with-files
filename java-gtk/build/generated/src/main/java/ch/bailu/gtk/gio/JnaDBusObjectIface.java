/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusObjectIface {

    @FunctionalInterface
    public interface OnGetObjectPath extends com.sun.jna.Callback {
        long invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetInterfaces extends com.sun.jna.Callback {
        long invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetInterface extends com.sun.jna.Callback {
        long invoke(long object, long interface_name);
    }

    @FunctionalInterface
    public interface OnInterfaceAdded extends com.sun.jna.Callback {
        void invoke(long object, long interface_);
    }

    @FunctionalInterface
    public interface OnInterfaceRemoved extends com.sun.jna.Callback {
        void invoke(long object, long interface_);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DBusObjectIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DBusObjectIface.PARENT_IFACE, DBusObjectIface.GET_OBJECT_PATH, DBusObjectIface.GET_INTERFACES, DBusObjectIface.GET_INTERFACE, DBusObjectIface.INTERFACE_ADDED, DBusObjectIface.INTERFACE_REMOVED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetObjectPath get_object_path;
        public OnGetInterfaces get_interfaces;
        public OnGetInterface get_interface;
        public OnInterfaceAdded interface_added;
        public OnInterfaceRemoved interface_removed;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
