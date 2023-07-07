/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaSource {

    @FunctionalInterface
    public interface OnSourceFunc extends com.sun.jna.Callback {
        boolean invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnSourceDisposeFunc extends com.sun.jna.Callback {
        void invoke(long source);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Source size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Source.CALLBACK_DATA, Source.CALLBACK_FUNCS, Source.SOURCE_FUNCS, Source.REF_COUNT, Source.CONTEXT, Source.PRIORITY, Source.FLAGS, Source.SOURCE_ID, Source.POLL_FDS, Source.PREV, Source.NEXT, Source.NAME, Source.PRIV})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long callback_data;
        public long callback_funcs;
        public long source_funcs;
        public int ref_count;
        public long context;
        public int priority;
        public int flags;
        public int source_id;
        public long poll_fds;
        public long prev;
        public long next;
        public long name;
        public long priv;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_source_new(long source_funcs, int struct_size);
        void g_source_add_child_source(long _self, long child_source);
        void g_source_add_poll(long _self, long fd);
        long g_source_add_unix_fd(long _self, int fd, int events);
        int g_source_attach(long _self, long context);
        void g_source_destroy(long _self);
        boolean g_source_get_can_recurse(long _self);
        long g_source_get_context(long _self);
        int g_source_get_id(long _self);
        long g_source_get_name(long _self);
        int g_source_get_priority(long _self);
        long g_source_get_ready_time(long _self);
        long g_source_get_time(long _self);
        boolean g_source_is_destroyed(long _self);
        void g_source_modify_unix_fd(long _self, long tag, int new_events);
        int g_source_query_unix_fd(long _self, long tag);
        long g_source_ref(long _self);
        void g_source_remove_child_source(long _self, long child_source);
        void g_source_remove_poll(long _self, long fd);
        void g_source_remove_unix_fd(long _self, long tag);
        void g_source_set_callback(long _self, com.sun.jna.Callback func, long data, com.sun.jna.Callback notify);
        void g_source_set_callback_indirect(long _self, long callback_data, long callback_funcs);
        void g_source_set_can_recurse(long _self, boolean can_recurse);
        void g_source_set_dispose_function(long _self, com.sun.jna.Callback dispose);
        void g_source_set_funcs(long _self, long funcs);
        void g_source_set_name(long _self, long name);
        void g_source_set_name(long _self, String name);
        void g_source_set_priority(long _self, int priority);
        void g_source_set_ready_time(long _self, long ready_time);
        void g_source_set_static_name(long _self, long name);
        void g_source_set_static_name(long _self, String name);
        void g_source_unref(long _self);
        boolean g_source_remove(int tag);
        boolean g_source_remove_by_funcs_user_data(long funcs, long user_data);
        boolean g_source_remove_by_user_data(long user_data);
        void g_source_set_name_by_id(int tag, long name);
        long g_source_get_type();
    }

}
