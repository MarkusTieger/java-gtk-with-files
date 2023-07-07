/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaNetworkMonitorInterface {

    @FunctionalInterface
    public interface OnNetworkChanged extends com.sun.jna.Callback {
        void invoke(long monitor, boolean network_available);
    }

    @FunctionalInterface
    public interface OnCanReach extends com.sun.jna.Callback {
        boolean invoke(long monitor, long connectable, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnCanReachAsync extends com.sun.jna.Callback {
        void invoke(long monitor, long connectable, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnCanReachFinish extends com.sun.jna.Callback {
        boolean invoke(long monitor, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("NetworkMonitorInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({NetworkMonitorInterface.G_IFACE, NetworkMonitorInterface.NETWORK_CHANGED, NetworkMonitorInterface.CAN_REACH, NetworkMonitorInterface.CAN_REACH_ASYNC, NetworkMonitorInterface.CAN_REACH_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnNetworkChanged network_changed;
        public OnCanReach can_reach;
        public OnCanReachAsync can_reach_async;
        public OnCanReachFinish can_reach_finish;
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
