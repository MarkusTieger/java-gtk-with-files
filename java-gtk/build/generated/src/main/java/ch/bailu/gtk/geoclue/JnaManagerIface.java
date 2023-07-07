/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaManagerIface {

    @FunctionalInterface
    public interface OnHandleAddAgent extends com.sun.jna.Callback {
        boolean invoke(long object, long invocation, long arg_id);
    }

    @FunctionalInterface
    public interface OnHandleCreateClient extends com.sun.jna.Callback {
        boolean invoke(long object, long invocation);
    }

    @FunctionalInterface
    public interface OnHandleDeleteClient extends com.sun.jna.Callback {
        boolean invoke(long object, long invocation, long arg_client);
    }

    @FunctionalInterface
    public interface OnHandleGetClient extends com.sun.jna.Callback {
        boolean invoke(long object, long invocation);
    }

    @FunctionalInterface
    public interface OnGetAvailableAccuracyLevel extends com.sun.jna.Callback {
        int invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetInUse extends com.sun.jna.Callback {
        boolean invoke(long object);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ManagerIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ManagerIface.PARENT_IFACE, ManagerIface.HANDLE_ADD_AGENT, ManagerIface.HANDLE_CREATE_CLIENT, ManagerIface.HANDLE_DELETE_CLIENT, ManagerIface.HANDLE_GET_CLIENT, ManagerIface.GET_AVAILABLE_ACCURACY_LEVEL, ManagerIface.GET_IN_USE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnHandleAddAgent handle_add_agent;
        public OnHandleCreateClient handle_create_client;
        public OnHandleDeleteClient handle_delete_client;
        public OnHandleGetClient handle_get_client;
        public OnGetAvailableAccuracyLevel get_available_accuracy_level;
        public OnGetInUse get_in_use;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
