/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeModelIface {

    @FunctionalInterface
    public interface OnRowChanged extends com.sun.jna.Callback {
        void invoke(long tree_model, long path, long iter);
    }

    @FunctionalInterface
    public interface OnRowInserted extends com.sun.jna.Callback {
        void invoke(long tree_model, long path, long iter);
    }

    @FunctionalInterface
    public interface OnRowHasChildToggled extends com.sun.jna.Callback {
        void invoke(long tree_model, long path, long iter);
    }

    @FunctionalInterface
    public interface OnRowDeleted extends com.sun.jna.Callback {
        void invoke(long tree_model, long path);
    }

    @FunctionalInterface
    public interface OnRowsReordered extends com.sun.jna.Callback {
        void invoke(long tree_model, long path, long iter, long new_order);
    }

    @FunctionalInterface
    public interface OnGetFlags extends com.sun.jna.Callback {
        int invoke(long tree_model);
    }

    @FunctionalInterface
    public interface OnGetNColumns extends com.sun.jna.Callback {
        int invoke(long tree_model);
    }

    @FunctionalInterface
    public interface OnGetColumnType extends com.sun.jna.Callback {
        long invoke(long tree_model, int index_);
    }

    @FunctionalInterface
    public interface OnGetIter extends com.sun.jna.Callback {
        boolean invoke(long tree_model, long iter, long path);
    }

    @FunctionalInterface
    public interface OnGetPath extends com.sun.jna.Callback {
        long invoke(long tree_model, long iter);
    }

    @FunctionalInterface
    public interface OnGetValue extends com.sun.jna.Callback {
        void invoke(long tree_model, long iter, int column, long value);
    }

    @FunctionalInterface
    public interface OnIterNext extends com.sun.jna.Callback {
        boolean invoke(long tree_model, long iter);
    }

    @FunctionalInterface
    public interface OnIterPrevious extends com.sun.jna.Callback {
        boolean invoke(long tree_model, long iter);
    }

    @FunctionalInterface
    public interface OnIterChildren extends com.sun.jna.Callback {
        boolean invoke(long tree_model, long iter, long parent);
    }

    @FunctionalInterface
    public interface OnIterHasChild extends com.sun.jna.Callback {
        boolean invoke(long tree_model, long iter);
    }

    @FunctionalInterface
    public interface OnIterNChildren extends com.sun.jna.Callback {
        int invoke(long tree_model, long iter);
    }

    @FunctionalInterface
    public interface OnIterNthChild extends com.sun.jna.Callback {
        boolean invoke(long tree_model, long iter, long parent, int n);
    }

    @FunctionalInterface
    public interface OnIterParent extends com.sun.jna.Callback {
        boolean invoke(long tree_model, long iter, long child);
    }

    @FunctionalInterface
    public interface OnRefNode extends com.sun.jna.Callback {
        void invoke(long tree_model, long iter);
    }

    @FunctionalInterface
    public interface OnUnrefNode extends com.sun.jna.Callback {
        void invoke(long tree_model, long iter);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TreeModelIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TreeModelIface.G_IFACE, TreeModelIface.ROW_CHANGED, TreeModelIface.ROW_INSERTED, TreeModelIface.ROW_HAS_CHILD_TOGGLED, TreeModelIface.ROW_DELETED, TreeModelIface.ROWS_REORDERED, TreeModelIface.GET_FLAGS, TreeModelIface.GET_N_COLUMNS, TreeModelIface.GET_COLUMN_TYPE, TreeModelIface.GET_ITER, TreeModelIface.GET_PATH, TreeModelIface.GET_VALUE, TreeModelIface.ITER_NEXT, TreeModelIface.ITER_PREVIOUS, TreeModelIface.ITER_CHILDREN, TreeModelIface.ITER_HAS_CHILD, TreeModelIface.ITER_N_CHILDREN, TreeModelIface.ITER_NTH_CHILD, TreeModelIface.ITER_PARENT, TreeModelIface.REF_NODE, TreeModelIface.UNREF_NODE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnRowChanged row_changed;
        public OnRowInserted row_inserted;
        public OnRowHasChildToggled row_has_child_toggled;
        public OnRowDeleted row_deleted;
        public OnRowsReordered rows_reordered;
        public OnGetFlags get_flags;
        public OnGetNColumns get_n_columns;
        public OnGetColumnType get_column_type;
        public OnGetIter get_iter;
        public OnGetPath get_path;
        public OnGetValue get_value;
        public OnIterNext iter_next;
        public OnIterPrevious iter_previous;
        public OnIterChildren iter_children;
        public OnIterHasChild iter_has_child;
        public OnIterNChildren iter_n_children;
        public OnIterNthChild iter_nth_child;
        public OnIterParent iter_parent;
        public OnRefNode ref_node;
        public OnUnrefNode unref_node;
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
