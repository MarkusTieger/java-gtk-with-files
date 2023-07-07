/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaNode {

    @FunctionalInterface
    public interface OnNodeForeachFunc extends com.sun.jna.Callback {
        void invoke(long node, long user_data);
    }

    @FunctionalInterface
    public interface OnCopyFunc extends com.sun.jna.Callback {
        long invoke(long src, long user_data);
    }

    @FunctionalInterface
    public interface OnNodeTraverseFunc extends com.sun.jna.Callback {
        boolean invoke(long node, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Node size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Node.DATA, Node.NEXT, Node.PREV, Node.PARENT, Node.CHILDREN})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long data;
        public long next;
        public long prev;
        public long parent;
        public long children;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_node_child_index(long _self, long data);
        int g_node_child_position(long _self, long child);
        void g_node_children_foreach(long _self, int flags, com.sun.jna.Callback func, long data);
        long g_node_copy(long _self);
        long g_node_copy_deep(long _self, com.sun.jna.Callback copy_func, long data);
        int g_node_depth(long _self);
        void g_node_destroy(long _self);
        long g_node_find(long _self, int order, int flags, long data);
        long g_node_find_child(long _self, int flags, long data);
        long g_node_first_sibling(long _self);
        long g_node_get_root(long _self);
        long g_node_insert(long _self, int position, long node);
        long g_node_insert_after(long _self, long sibling, long node);
        long g_node_insert_before(long _self, long sibling, long node);
        boolean g_node_is_ancestor(long _self, long descendant);
        long g_node_last_child(long _self);
        long g_node_last_sibling(long _self);
        int g_node_max_height(long _self);
        int g_node_n_children(long _self);
        int g_node_n_nodes(long _self, int flags);
        long g_node_nth_child(long _self, int n);
        long g_node_prepend(long _self, long node);
        void g_node_reverse_children(long _self);
        void g_node_traverse(long _self, int order, int flags, int max_depth, com.sun.jna.Callback func, long data);
        void g_node_unlink(long _self);
        long g_node_new(long data);
    }

}
