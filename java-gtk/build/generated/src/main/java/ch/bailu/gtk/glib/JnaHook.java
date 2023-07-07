/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaHook {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnHookFindFunc extends com.sun.jna.Callback {
        boolean invoke(long hook, long user_data);
    }

    @FunctionalInterface
    public interface OnHookCompareFunc extends com.sun.jna.Callback {
        int invoke(long new_hook, long sibling);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Hook size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Hook.DATA, Hook.NEXT, Hook.PREV, Hook.REF_COUNT, Hook.HOOK_ID, Hook.FLAGS, Hook.FUNC, Hook.DESTROY})
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
        public int ref_count;
        public long hook_id;
        public int flags;
        public long func;
        public OnDestroyNotify destroy;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_hook_compare_ids(long _self, long sibling);
        long g_hook_alloc(long hook_list);
        boolean g_hook_destroy(long hook_list, long hook_id);
        void g_hook_destroy_link(long hook_list, long hook);
        long g_hook_find(long hook_list, boolean need_valids, com.sun.jna.Callback func, long data);
        long g_hook_find_data(long hook_list, boolean need_valids, long data);
        long g_hook_find_func(long hook_list, boolean need_valids, long func);
        long g_hook_find_func_data(long hook_list, boolean need_valids, long func, long data);
        long g_hook_first_valid(long hook_list, boolean may_be_in_call);
        void g_hook_free(long hook_list, long hook);
        long g_hook_get(long hook_list, long hook_id);
        void g_hook_insert_before(long hook_list, long sibling, long hook);
        void g_hook_insert_sorted(long hook_list, long hook, com.sun.jna.Callback func);
        long g_hook_next_valid(long hook_list, long hook, boolean may_be_in_call);
        void g_hook_prepend(long hook_list, long hook);
        long g_hook_ref(long hook_list, long hook);
        void g_hook_unref(long hook_list, long hook);
    }

}
