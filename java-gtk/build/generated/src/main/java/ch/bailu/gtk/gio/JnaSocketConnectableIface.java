/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketConnectableIface {

    @FunctionalInterface
    public interface OnEnumerate extends com.sun.jna.Callback {
        long invoke(long connectable);
    }

    @FunctionalInterface
    public interface OnProxyEnumerate extends com.sun.jna.Callback {
        long invoke(long connectable);
    }

    @FunctionalInterface
    public interface OnToString extends com.sun.jna.Callback {
        long invoke(long connectable);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SocketConnectableIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SocketConnectableIface.G_IFACE, SocketConnectableIface.ENUMERATE, SocketConnectableIface.PROXY_ENUMERATE, SocketConnectableIface.TO_STRING})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnEnumerate enumerate;
        public OnProxyEnumerate proxy_enumerate;
        public OnToString to_string;
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
