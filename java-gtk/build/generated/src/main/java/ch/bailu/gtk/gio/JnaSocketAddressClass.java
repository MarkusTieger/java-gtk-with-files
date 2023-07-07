/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketAddressClass {

    @FunctionalInterface
    public interface OnGetFamily extends com.sun.jna.Callback {
        int invoke(long address);
    }

    @FunctionalInterface
    public interface OnGetNativeSize extends com.sun.jna.Callback {
        long invoke(long address);
    }

    @FunctionalInterface
    public interface OnToNative extends com.sun.jna.Callback {
        boolean invoke(long address, long dest, long destlen, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SocketAddressClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SocketAddressClass.PARENT_CLASS, SocketAddressClass.GET_FAMILY, SocketAddressClass.GET_NATIVE_SIZE, SocketAddressClass.TO_NATIVE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetFamily get_family;
        public OnGetNativeSize get_native_size;
        public OnToNative to_native;
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
