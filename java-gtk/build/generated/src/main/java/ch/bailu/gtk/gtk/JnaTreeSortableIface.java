/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeSortableIface {

    @FunctionalInterface
    public interface OnSortColumnChanged extends com.sun.jna.Callback {
        void invoke(long sortable);
    }

    @FunctionalInterface
    public interface OnGetSortColumnId extends com.sun.jna.Callback {
        boolean invoke(long sortable, long sort_column_id, long order);
    }

    @FunctionalInterface
    public interface OnSetSortColumnId extends com.sun.jna.Callback {
        void invoke(long sortable, int sort_column_id, int order);
    }

    @FunctionalInterface
    public interface OnSetSortFunc extends com.sun.jna.Callback {
        void invoke(long sortable, int sort_column_id, com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback destroy);
    }

    @FunctionalInterface
    public interface OnSetDefaultSortFunc extends com.sun.jna.Callback {
        void invoke(long sortable, com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback destroy);
    }

    @FunctionalInterface
    public interface OnHasDefaultSortFunc extends com.sun.jna.Callback {
        boolean invoke(long sortable);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TreeSortableIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TreeSortableIface.G_IFACE, TreeSortableIface.SORT_COLUMN_CHANGED, TreeSortableIface.GET_SORT_COLUMN_ID, TreeSortableIface.SET_SORT_COLUMN_ID, TreeSortableIface.SET_SORT_FUNC, TreeSortableIface.SET_DEFAULT_SORT_FUNC, TreeSortableIface.HAS_DEFAULT_SORT_FUNC})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnSortColumnChanged sort_column_changed;
        public OnGetSortColumnId get_sort_column_id;
        public OnSetSortColumnId set_sort_column_id;
        public OnSetSortFunc set_sort_func;
        public OnSetDefaultSortFunc set_default_sort_func;
        public OnHasDefaultSortFunc has_default_sort_func;
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
