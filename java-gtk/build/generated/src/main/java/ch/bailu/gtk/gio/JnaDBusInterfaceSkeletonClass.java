/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusInterfaceSkeletonClass {

    @FunctionalInterface
    public interface OnGetInfo extends com.sun.jna.Callback {
        long invoke(long interface_);
    }

    @FunctionalInterface
    public interface OnGetVtable extends com.sun.jna.Callback {
        long invoke(long interface_);
    }

    @FunctionalInterface
    public interface OnGetProperties extends com.sun.jna.Callback {
        long invoke(long interface_);
    }

    @FunctionalInterface
    public interface OnFlush extends com.sun.jna.Callback {
        void invoke(long interface_);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DBusInterfaceSkeletonClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DBusInterfaceSkeletonClass.PARENT_CLASS, DBusInterfaceSkeletonClass.GET_INFO, DBusInterfaceSkeletonClass.GET_VTABLE, DBusInterfaceSkeletonClass.GET_PROPERTIES, DBusInterfaceSkeletonClass.FLUSH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetInfo get_info;
        public OnGetVtable get_vtable;
        public OnGetProperties get_properties;
        public OnFlush flush;
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
