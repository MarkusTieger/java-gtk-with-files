/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeDragDestIface {

    @FunctionalInterface
    public interface OnDragDataReceived extends com.sun.jna.Callback {
        boolean invoke(long drag_dest, long dest, long value);
    }

    @FunctionalInterface
    public interface OnRowDropPossible extends com.sun.jna.Callback {
        boolean invoke(long drag_dest, long dest_path, long value);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TreeDragDestIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TreeDragDestIface.G_IFACE, TreeDragDestIface.DRAG_DATA_RECEIVED, TreeDragDestIface.ROW_DROP_POSSIBLE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnDragDataReceived drag_data_received;
        public OnRowDropPossible row_drop_possible;
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
