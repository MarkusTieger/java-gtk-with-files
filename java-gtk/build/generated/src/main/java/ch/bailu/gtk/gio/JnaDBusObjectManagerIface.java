/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusObjectManagerIface {

    @FunctionalInterface
    public interface OnGetObjectPath extends com.sun.jna.Callback {
        long invoke(long manager);
    }

    @FunctionalInterface
    public interface OnGetObjects extends com.sun.jna.Callback {
        long invoke(long manager);
    }

    @FunctionalInterface
    public interface OnGetObject extends com.sun.jna.Callback {
        long invoke(long manager, long object_path);
    }

    @FunctionalInterface
    public interface OnGetInterface extends com.sun.jna.Callback {
        long invoke(long manager, long object_path, long interface_name);
    }

    @FunctionalInterface
    public interface OnObjectAdded extends com.sun.jna.Callback {
        void invoke(long manager, long object);
    }

    @FunctionalInterface
    public interface OnObjectRemoved extends com.sun.jna.Callback {
        void invoke(long manager, long object);
    }

    @FunctionalInterface
    public interface OnInterfaceAdded extends com.sun.jna.Callback {
        void invoke(long manager, long object, long interface_);
    }

    @FunctionalInterface
    public interface OnInterfaceRemoved extends com.sun.jna.Callback {
        void invoke(long manager, long object, long interface_);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DBusObjectManagerIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DBusObjectManagerIface.PARENT_IFACE, DBusObjectManagerIface.GET_OBJECT_PATH, DBusObjectManagerIface.GET_OBJECTS, DBusObjectManagerIface.GET_OBJECT, DBusObjectManagerIface.GET_INTERFACE, DBusObjectManagerIface.OBJECT_ADDED, DBusObjectManagerIface.OBJECT_REMOVED, DBusObjectManagerIface.INTERFACE_ADDED, DBusObjectManagerIface.INTERFACE_REMOVED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetObjectPath get_object_path;
        public OnGetObjects get_objects;
        public OnGetObject get_object;
        public OnGetInterface get_interface;
        public OnObjectAdded object_added;
        public OnObjectRemoved object_removed;
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
