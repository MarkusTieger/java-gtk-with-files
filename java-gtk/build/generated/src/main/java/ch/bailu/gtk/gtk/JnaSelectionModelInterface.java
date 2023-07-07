/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSelectionModelInterface {

    @FunctionalInterface
    public interface OnIsSelected extends com.sun.jna.Callback {
        boolean invoke(long model, int position);
    }

    @FunctionalInterface
    public interface OnGetSelectionInRange extends com.sun.jna.Callback {
        long invoke(long model, int position, int n_items);
    }

    @FunctionalInterface
    public interface OnSelectItem extends com.sun.jna.Callback {
        boolean invoke(long model, int position, boolean unselect_rest);
    }

    @FunctionalInterface
    public interface OnUnselectItem extends com.sun.jna.Callback {
        boolean invoke(long model, int position);
    }

    @FunctionalInterface
    public interface OnSelectRange extends com.sun.jna.Callback {
        boolean invoke(long model, int position, int n_items, boolean unselect_rest);
    }

    @FunctionalInterface
    public interface OnUnselectRange extends com.sun.jna.Callback {
        boolean invoke(long model, int position, int n_items);
    }

    @FunctionalInterface
    public interface OnSelectAll extends com.sun.jna.Callback {
        boolean invoke(long model);
    }

    @FunctionalInterface
    public interface OnUnselectAll extends com.sun.jna.Callback {
        boolean invoke(long model);
    }

    @FunctionalInterface
    public interface OnSetSelection extends com.sun.jna.Callback {
        boolean invoke(long model, long selected, long mask);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SelectionModelInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SelectionModelInterface.G_IFACE, SelectionModelInterface.IS_SELECTED, SelectionModelInterface.GET_SELECTION_IN_RANGE, SelectionModelInterface.SELECT_ITEM, SelectionModelInterface.UNSELECT_ITEM, SelectionModelInterface.SELECT_RANGE, SelectionModelInterface.UNSELECT_RANGE, SelectionModelInterface.SELECT_ALL, SelectionModelInterface.UNSELECT_ALL, SelectionModelInterface.SET_SELECTION})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnIsSelected is_selected;
        public OnGetSelectionInRange get_selection_in_range;
        public OnSelectItem select_item;
        public OnUnselectItem unselect_item;
        public OnSelectRange select_range;
        public OnUnselectRange unselect_range;
        public OnSelectAll select_all;
        public OnUnselectAll unselect_all;
        public OnSetSelection set_selection;
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
