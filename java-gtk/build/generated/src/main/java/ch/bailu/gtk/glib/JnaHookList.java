/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaHookList {

    @FunctionalInterface
    public interface OnHookMarshaller extends com.sun.jna.Callback {
        void invoke(long hook, long user_data);
    }

    @FunctionalInterface
    public interface OnHookCheckMarshaller extends com.sun.jna.Callback {
        boolean invoke(long hook, long user_data);
    }

    @FunctionalInterface
    public interface OnHookFinalizeFunc extends com.sun.jna.Callback {
        void invoke(long hook_list, long hook);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("HookList size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({HookList.SEQ_ID, HookList.HOOK_SIZE, HookList.IS_SETUP, HookList.HOOKS, HookList.DUMMY3, HookList.FINALIZE_HOOK})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long seq_id;
        public int hook_size;
        public int is_setup;
        public long hooks;
        public long dummy3;
        public OnHookFinalizeFunc finalize_hook;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_hook_list_clear(long _self);
        void g_hook_list_init(long _self, int hook_size);
        void g_hook_list_invoke(long _self, boolean may_recurse);
        void g_hook_list_invoke_check(long _self, boolean may_recurse);
        void g_hook_list_marshal(long _self, boolean may_recurse, com.sun.jna.Callback marshaller, long marshal_data);
        void g_hook_list_marshal_check(long _self, boolean may_recurse, com.sun.jna.Callback marshaller, long marshal_data);
    }

}
