/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWindowClass {

    @FunctionalInterface
    public interface OnActivateFocus extends com.sun.jna.Callback {
        void invoke(long window);
    }

    @FunctionalInterface
    public interface OnActivateDefault extends com.sun.jna.Callback {
        void invoke(long window);
    }

    @FunctionalInterface
    public interface OnKeysChanged extends com.sun.jna.Callback {
        void invoke(long window);
    }

    @FunctionalInterface
    public interface OnEnableDebugging extends com.sun.jna.Callback {
        boolean invoke(long window, boolean toggle);
    }

    @FunctionalInterface
    public interface OnCloseRequest extends com.sun.jna.Callback {
        boolean invoke(long window);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("WindowClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({WindowClass.PARENT_CLASS, WindowClass.ACTIVATE_FOCUS, WindowClass.ACTIVATE_DEFAULT, WindowClass.KEYS_CHANGED, WindowClass.ENABLE_DEBUGGING, WindowClass.CLOSE_REQUEST})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[WidgetClass.getInstanceSize()];
        public OnActivateFocus activate_focus;
        public OnActivateDefault activate_default;
        public OnKeysChanged keys_changed;
        public OnEnableDebugging enable_debugging;
        public OnCloseRequest close_request;
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
