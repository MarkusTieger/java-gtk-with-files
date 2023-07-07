/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaProxyInterface {

    @FunctionalInterface
    public interface OnConnect extends com.sun.jna.Callback {
        long invoke(long proxy, long connection, long proxy_address, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnConnectAsync extends com.sun.jna.Callback {
        void invoke(long proxy, long connection, long proxy_address, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnConnectFinish extends com.sun.jna.Callback {
        long invoke(long proxy, long result, long _error);
    }

    @FunctionalInterface
    public interface OnSupportsHostname extends com.sun.jna.Callback {
        boolean invoke(long proxy);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ProxyInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ProxyInterface.G_IFACE, ProxyInterface.CONNECT, ProxyInterface.CONNECT_ASYNC, ProxyInterface.CONNECT_FINISH, ProxyInterface.SUPPORTS_HOSTNAME})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnConnect connect;
        public OnConnectAsync connect_async;
        public OnConnectFinish connect_finish;
        public OnSupportsHostname supports_hostname;
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
