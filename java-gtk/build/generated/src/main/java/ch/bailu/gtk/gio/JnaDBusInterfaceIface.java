/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusInterfaceIface {

    @FunctionalInterface
    public interface OnGetInfo extends com.sun.jna.Callback {
        long invoke(long interface_);
    }

    @FunctionalInterface
    public interface OnGetObject extends com.sun.jna.Callback {
        long invoke(long interface_);
    }

    @FunctionalInterface
    public interface OnSetObject extends com.sun.jna.Callback {
        void invoke(long interface_, long object);
    }

    @FunctionalInterface
    public interface OnDupObject extends com.sun.jna.Callback {
        long invoke(long interface_);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DBusInterfaceIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DBusInterfaceIface.PARENT_IFACE, DBusInterfaceIface.GET_INFO, DBusInterfaceIface.GET_OBJECT, DBusInterfaceIface.SET_OBJECT, DBusInterfaceIface.DUP_OBJECT})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetInfo get_info;
        public OnGetObject get_object;
        public OnSetObject set_object;
        public OnDupObject dup_object;
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
