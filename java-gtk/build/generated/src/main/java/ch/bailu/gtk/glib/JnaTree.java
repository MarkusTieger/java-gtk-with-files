/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaTree {

    @FunctionalInterface
    public interface OnCompareFunc extends com.sun.jna.Callback {
        int invoke(long a, long b);
    }

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnTraverseFunc extends com.sun.jna.Callback {
        boolean invoke(long key, long value, long user_data);
    }

    @FunctionalInterface
    public interface OnTraverseNodeFunc extends com.sun.jna.Callback {
        boolean invoke(long node, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_tree_new(com.sun.jna.Callback key_compare_func);
        long g_tree_new_full(com.sun.jna.Callback key_compare_func, long key_compare_data, com.sun.jna.Callback key_destroy_func, com.sun.jna.Callback value_destroy_func);
        long g_tree_new_with_data(com.sun.jna.Callback key_compare_func, long key_compare_data);
        void g_tree_destroy(long _self);
        void g_tree_foreach(long _self, com.sun.jna.Callback func, long user_data);
        void g_tree_foreach_node(long _self, com.sun.jna.Callback func, long user_data);
        int g_tree_height(long _self);
        void g_tree_insert(long _self, long key, long value);
        long g_tree_insert_node(long _self, long key, long value);
        long g_tree_lookup(long _self, long key);
        long g_tree_lookup_node(long _self, long key);
        long g_tree_lower_bound(long _self, long key);
        int g_tree_nnodes(long _self);
        long g_tree_node_first(long _self);
        long g_tree_node_last(long _self);
        long g_tree_ref(long _self);
        boolean g_tree_remove(long _self, long key);
        void g_tree_remove_all(long _self);
        void g_tree_replace(long _self, long key, long value);
        long g_tree_replace_node(long _self, long key, long value);
        long g_tree_search(long _self, com.sun.jna.Callback search_func, long user_data);
        long g_tree_search_node(long _self, com.sun.jna.Callback search_func, long user_data);
        boolean g_tree_steal(long _self, long key);
        void g_tree_unref(long _self);
        long g_tree_upper_bound(long _self, long key);
        long g_tree_get_type();
    }

}
