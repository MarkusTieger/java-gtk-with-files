/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaActionableInterface {

    @FunctionalInterface
    public interface OnGetActionName extends com.sun.jna.Callback {
        long invoke(long actionable);
    }

    @FunctionalInterface
    public interface OnSetActionName extends com.sun.jna.Callback {
        void invoke(long actionable, long action_name);
    }

    @FunctionalInterface
    public interface OnGetActionTargetValue extends com.sun.jna.Callback {
        long invoke(long actionable);
    }

    @FunctionalInterface
    public interface OnSetActionTargetValue extends com.sun.jna.Callback {
        void invoke(long actionable, long target_value);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ActionableInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ActionableInterface.G_IFACE, ActionableInterface.GET_ACTION_NAME, ActionableInterface.SET_ACTION_NAME, ActionableInterface.GET_ACTION_TARGET_VALUE, ActionableInterface.SET_ACTION_TARGET_VALUE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetActionName get_action_name;
        public OnSetActionName set_action_name;
        public OnGetActionTargetValue get_action_target_value;
        public OnSetActionTargetValue set_action_target_value;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
