/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaActionInterface {

    @FunctionalInterface
    public interface OnGetName extends com.sun.jna.Callback {
        long invoke(long action);
    }

    @FunctionalInterface
    public interface OnGetParameterType extends com.sun.jna.Callback {
        long invoke(long action);
    }

    @FunctionalInterface
    public interface OnGetStateType extends com.sun.jna.Callback {
        long invoke(long action);
    }

    @FunctionalInterface
    public interface OnGetStateHint extends com.sun.jna.Callback {
        long invoke(long action);
    }

    @FunctionalInterface
    public interface OnGetEnabled extends com.sun.jna.Callback {
        boolean invoke(long action);
    }

    @FunctionalInterface
    public interface OnGetState extends com.sun.jna.Callback {
        long invoke(long action);
    }

    @FunctionalInterface
    public interface OnChangeState extends com.sun.jna.Callback {
        void invoke(long action, long value);
    }

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long action, long parameter);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ActionInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ActionInterface.G_IFACE, ActionInterface.GET_NAME, ActionInterface.GET_PARAMETER_TYPE, ActionInterface.GET_STATE_TYPE, ActionInterface.GET_STATE_HINT, ActionInterface.GET_ENABLED, ActionInterface.GET_STATE, ActionInterface.CHANGE_STATE, ActionInterface.ACTIVATE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetName get_name;
        public OnGetParameterType get_parameter_type;
        public OnGetStateType get_state_type;
        public OnGetStateHint get_state_hint;
        public OnGetEnabled get_enabled;
        public OnGetState get_state;
        public OnChangeState change_state;
        public OnActivate activate;
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
