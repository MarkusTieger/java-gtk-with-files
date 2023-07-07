/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeDragSourceIface {

    @FunctionalInterface
    public interface OnRowDraggable extends com.sun.jna.Callback {
        boolean invoke(long drag_source, long path);
    }

    @FunctionalInterface
    public interface OnDragDataGet extends com.sun.jna.Callback {
        long invoke(long drag_source, long path);
    }

    @FunctionalInterface
    public interface OnDragDataDelete extends com.sun.jna.Callback {
        boolean invoke(long drag_source, long path);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TreeDragSourceIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TreeDragSourceIface.G_IFACE, TreeDragSourceIface.ROW_DRAGGABLE, TreeDragSourceIface.DRAG_DATA_GET, TreeDragSourceIface.DRAG_DATA_DELETE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnRowDraggable row_draggable;
        public OnDragDataGet drag_data_get;
        public OnDragDataDelete drag_data_delete;
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
