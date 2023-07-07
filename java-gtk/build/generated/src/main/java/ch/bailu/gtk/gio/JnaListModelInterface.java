/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaListModelInterface {

    @FunctionalInterface
    public interface OnGetItemType extends com.sun.jna.Callback {
        long invoke(long list);
    }

    @FunctionalInterface
    public interface OnGetNItems extends com.sun.jna.Callback {
        int invoke(long list);
    }

    @FunctionalInterface
    public interface OnGetItem extends com.sun.jna.Callback {
        long invoke(long list, int position);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ListModelInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ListModelInterface.G_IFACE, ListModelInterface.GET_ITEM_TYPE, ListModelInterface.GET_N_ITEMS, ListModelInterface.GET_ITEM})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetItemType get_item_type;
        public OnGetNItems get_n_items;
        public OnGetItem get_item;
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
