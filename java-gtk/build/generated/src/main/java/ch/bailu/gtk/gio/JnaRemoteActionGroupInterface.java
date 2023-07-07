/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaRemoteActionGroupInterface {

    @FunctionalInterface
    public interface OnActivateActionFull extends com.sun.jna.Callback {
        void invoke(long remote, long action_name, long parameter, long platform_data);
    }

    @FunctionalInterface
    public interface OnChangeActionStateFull extends com.sun.jna.Callback {
        void invoke(long remote, long action_name, long value, long platform_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RemoteActionGroupInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RemoteActionGroupInterface.G_IFACE, RemoteActionGroupInterface.ACTIVATE_ACTION_FULL, RemoteActionGroupInterface.CHANGE_ACTION_STATE_FULL})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnActivateActionFull activate_action_full;
        public OnChangeActionStateFull change_action_state_full;
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
