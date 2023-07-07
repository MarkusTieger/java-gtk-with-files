/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaShortcutManagerInterface {

    @FunctionalInterface
    public interface OnAddController extends com.sun.jna.Callback {
        void invoke(long self, long controller);
    }

    @FunctionalInterface
    public interface OnRemoveController extends com.sun.jna.Callback {
        void invoke(long self, long controller);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ShortcutManagerInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ShortcutManagerInterface.G_IFACE, ShortcutManagerInterface.ADD_CONTROLLER, ShortcutManagerInterface.REMOVE_CONTROLLER})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnAddController add_controller;
        public OnRemoveController remove_controller;
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
