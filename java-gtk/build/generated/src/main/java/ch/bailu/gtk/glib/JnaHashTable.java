/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaHashTable {

    @FunctionalInterface
    public interface OnHRFunc extends com.sun.jna.Callback {
        boolean invoke(long key, long value, long user_data);
    }

    @FunctionalInterface
    public interface OnHFunc extends com.sun.jna.Callback {
        void invoke(long key, long value, long user_data);
    }

    @FunctionalInterface
    public interface OnHashFunc extends com.sun.jna.Callback {
        int invoke(long key);
    }

    @FunctionalInterface
    public interface OnEqualFunc extends com.sun.jna.Callback {
        boolean invoke(long a, long b);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_hash_table_add(long hash_table, long key);
        boolean g_hash_table_contains(long hash_table, long key);
        void g_hash_table_destroy(long hash_table);
        long g_hash_table_find(long hash_table, com.sun.jna.Callback predicate, long user_data);
        void g_hash_table_foreach(long hash_table, com.sun.jna.Callback func, long user_data);
        int g_hash_table_foreach_remove(long hash_table, com.sun.jna.Callback func, long user_data);
        int g_hash_table_foreach_steal(long hash_table, com.sun.jna.Callback func, long user_data);
        long g_hash_table_get_keys(long hash_table);
        long g_hash_table_get_values(long hash_table);
        boolean g_hash_table_insert(long hash_table, long key, long value);
        long g_hash_table_lookup(long hash_table, long key);
        long g_hash_table_new(com.sun.jna.Callback hash_func, com.sun.jna.Callback key_equal_func);
        long g_hash_table_new_full(com.sun.jna.Callback hash_func, com.sun.jna.Callback key_equal_func, com.sun.jna.Callback key_destroy_func, com.sun.jna.Callback value_destroy_func);
        long g_hash_table_new_similar(long other_hash_table);
        long g_hash_table_ref(long hash_table);
        boolean g_hash_table_remove(long hash_table, long key);
        void g_hash_table_remove_all(long hash_table);
        boolean g_hash_table_replace(long hash_table, long key, long value);
        int g_hash_table_size(long hash_table);
        boolean g_hash_table_steal(long hash_table, long key);
        void g_hash_table_steal_all(long hash_table);
        void g_hash_table_unref(long hash_table);
        long g_hash_table_get_type();
    }

}
