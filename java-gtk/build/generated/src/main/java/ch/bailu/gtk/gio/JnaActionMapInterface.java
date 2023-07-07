/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaActionMapInterface {

    @FunctionalInterface
    public interface OnLookupAction extends com.sun.jna.Callback {
        long invoke(long action_map, long action_name);
    }

    @FunctionalInterface
    public interface OnAddAction extends com.sun.jna.Callback {
        void invoke(long action_map, long action);
    }

    @FunctionalInterface
    public interface OnRemoveAction extends com.sun.jna.Callback {
        void invoke(long action_map, long action_name);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ActionMapInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ActionMapInterface.G_IFACE, ActionMapInterface.LOOKUP_ACTION, ActionMapInterface.ADD_ACTION, ActionMapInterface.REMOVE_ACTION})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnLookupAction lookup_action;
        public OnAddAction add_action;
        public OnRemoveAction remove_action;
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
