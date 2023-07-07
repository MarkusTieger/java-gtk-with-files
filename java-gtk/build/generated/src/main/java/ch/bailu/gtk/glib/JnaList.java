/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaList {

    @FunctionalInterface
    public interface OnCopyFunc extends com.sun.jna.Callback {
        long invoke(long src, long user_data);
    }

    @FunctionalInterface
    public interface OnCompareFunc extends com.sun.jna.Callback {
        int invoke(long a, long b);
    }

    @FunctionalInterface
    public interface OnFunc extends com.sun.jna.Callback {
        void invoke(long data, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("List size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({List.DATA, List.NEXT, List.PREV})
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
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_list_alloc();
        long g_list_append(long list, long data);
        long g_list_concat(long list1, long list2);
        long g_list_copy(long list);
        long g_list_copy_deep(long list, com.sun.jna.Callback func, long user_data);
        long g_list_delete_link(long list, long link_);
        long g_list_find(long list, long data);
        long g_list_find_custom(long list, long data, com.sun.jna.Callback func);
        long g_list_first(long list);
        void g_list_foreach(long list, com.sun.jna.Callback func, long user_data);
        void g_list_free(long list);
        void g_list_free_1(long list);
        void g_list_free_full(long list, com.sun.jna.Callback free_func);
        int g_list_index(long list, long data);
        long g_list_insert(long list, long data, int position);
        long g_list_insert_before(long list, long sibling, long data);
        long g_list_insert_before_link(long list, long sibling, long link_);
        long g_list_insert_sorted(long list, long data, com.sun.jna.Callback func);
        long g_list_insert_sorted_with_data(long list, long data, com.sun.jna.Callback func, long user_data);
        long g_list_last(long list);
        int g_list_length(long list);
        long g_list_nth(long list, int n);
        long g_list_nth_data(long list, int n);
        long g_list_nth_prev(long list, int n);
        int g_list_position(long list, long llink);
        long g_list_prepend(long list, long data);
        long g_list_remove(long list, long data);
        long g_list_remove_all(long list, long data);
        long g_list_remove_link(long list, long llink);
        long g_list_reverse(long list);
        long g_list_sort(long list, com.sun.jna.Callback compare_func);
        long g_list_sort_with_data(long list, com.sun.jna.Callback compare_func, long user_data);
    }

}
