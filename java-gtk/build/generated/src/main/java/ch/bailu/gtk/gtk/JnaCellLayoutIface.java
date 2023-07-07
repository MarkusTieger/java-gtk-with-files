/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellLayoutIface {

    @FunctionalInterface
    public interface OnPackStart extends com.sun.jna.Callback {
        void invoke(long cell_layout, long cell, boolean expand);
    }

    @FunctionalInterface
    public interface OnPackEnd extends com.sun.jna.Callback {
        void invoke(long cell_layout, long cell, boolean expand);
    }

    @FunctionalInterface
    public interface OnClear extends com.sun.jna.Callback {
        void invoke(long cell_layout);
    }

    @FunctionalInterface
    public interface OnAddAttribute extends com.sun.jna.Callback {
        void invoke(long cell_layout, long cell, long attribute, int column);
    }

    @FunctionalInterface
    public interface OnSetCellDataFunc extends com.sun.jna.Callback {
        void invoke(long cell_layout, long cell, com.sun.jna.Callback func, long func_data, com.sun.jna.Callback destroy);
    }

    @FunctionalInterface
    public interface OnClearAttributes extends com.sun.jna.Callback {
        void invoke(long cell_layout, long cell);
    }

    @FunctionalInterface
    public interface OnReorder extends com.sun.jna.Callback {
        void invoke(long cell_layout, long cell, int position);
    }

    @FunctionalInterface
    public interface OnGetCells extends com.sun.jna.Callback {
        long invoke(long cell_layout);
    }

    @FunctionalInterface
    public interface OnGetArea extends com.sun.jna.Callback {
        long invoke(long cell_layout);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("CellLayoutIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({CellLayoutIface.G_IFACE, CellLayoutIface.PACK_START, CellLayoutIface.PACK_END, CellLayoutIface.CLEAR, CellLayoutIface.ADD_ATTRIBUTE, CellLayoutIface.SET_CELL_DATA_FUNC, CellLayoutIface.CLEAR_ATTRIBUTES, CellLayoutIface.REORDER, CellLayoutIface.GET_CELLS, CellLayoutIface.GET_AREA})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnPackStart pack_start;
        public OnPackEnd pack_end;
        public OnClear clear;
        public OnAddAttribute add_attribute;
        public OnSetCellDataFunc set_cell_data_func;
        public OnClearAttributes clear_attributes;
        public OnReorder reorder;
        public OnGetCells get_cells;
        public OnGetArea get_area;
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
