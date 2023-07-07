/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaProxyAddressEnumeratorClass {

    @FunctionalInterface
    public interface OnGReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved5 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved6 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved7 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ProxyAddressEnumeratorClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ProxyAddressEnumeratorClass.PARENT_CLASS, ProxyAddressEnumeratorClass._G_RESERVED1, ProxyAddressEnumeratorClass._G_RESERVED2, ProxyAddressEnumeratorClass._G_RESERVED3, ProxyAddressEnumeratorClass._G_RESERVED4, ProxyAddressEnumeratorClass._G_RESERVED5, ProxyAddressEnumeratorClass._G_RESERVED6, ProxyAddressEnumeratorClass._G_RESERVED7})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[SocketAddressEnumeratorClass.getInstanceSize()];
        public OnGReserved1 _g_reserved1;
        public OnGReserved2 _g_reserved2;
        public OnGReserved3 _g_reserved3;
        public OnGReserved4 _g_reserved4;
        public OnGReserved5 _g_reserved5;
        public OnGReserved6 _g_reserved6;
        public OnGReserved7 _g_reserved7;
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
