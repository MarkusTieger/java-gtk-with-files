/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellEditableIface {

    @FunctionalInterface
    public interface OnEditingDone extends com.sun.jna.Callback {
        void invoke(long cell_editable);
    }

    @FunctionalInterface
    public interface OnRemoveWidget extends com.sun.jna.Callback {
        void invoke(long cell_editable);
    }

    @FunctionalInterface
    public interface OnStartEditing extends com.sun.jna.Callback {
        void invoke(long cell_editable, long event);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("CellEditableIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({CellEditableIface.G_IFACE, CellEditableIface.EDITING_DONE, CellEditableIface.REMOVE_WIDGET, CellEditableIface.START_EDITING})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnEditingDone editing_done;
        public OnRemoveWidget remove_widget;
        public OnStartEditing start_editing;
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
