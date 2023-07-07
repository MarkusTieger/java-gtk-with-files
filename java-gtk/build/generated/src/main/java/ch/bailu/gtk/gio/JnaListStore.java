/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaListStore {

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_list_store_new(long item_type);
        void g_list_store_append(long _self, long item);
        void g_list_store_insert(long _self, int position, long item);
        int g_list_store_insert_sorted(long _self, long item, com.sun.jna.Callback compare_func, long user_data);
        void g_list_store_remove(long _self, int position);
        void g_list_store_remove_all(long _self);
        void g_list_store_sort(long _self, com.sun.jna.Callback compare_func, long user_data);
        long g_list_store_get_type();
    }

}
