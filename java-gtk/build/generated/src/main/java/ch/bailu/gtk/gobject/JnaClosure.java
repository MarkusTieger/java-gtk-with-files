/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaClosure {

    @FunctionalInterface
    public interface OnClosureNotify extends com.sun.jna.Callback {
        void invoke(long data, long closure);
    }

    @FunctionalInterface
    public interface OnMarshal extends com.sun.jna.Callback {
        void invoke(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Closure size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Closure.REF_COUNT, Closure.META_MARSHAL_NOUSE, Closure.N_GUARDS, Closure.N_FNOTIFIERS, Closure.N_INOTIFIERS, Closure.IN_INOTIFY, Closure.FLOATING, Closure.DERIVATIVE_FLAG, Closure.IN_MARSHAL, Closure.IS_INVALID, Closure.MARSHAL, Closure.DATA, Closure.NOTIFIERS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int ref_count;
        public int meta_marshal_nouse;
        public int n_guards;
        public int n_fnotifiers;
        public int n_inotifiers;
        public int in_inotify;
        public int floating;
        public int derivative_flag;
        public int in_marshal;
        public int is_invalid;
        public OnMarshal marshal;
        public long data;
        public long notifiers;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_closure_new_object(int sizeof_closure, long object);
        long g_closure_new_simple(int sizeof_closure, long data);
        void g_closure_add_finalize_notifier(long _self, long notify_data, com.sun.jna.Callback notify_func);
        void g_closure_add_invalidate_notifier(long _self, long notify_data, com.sun.jna.Callback notify_func);
        void g_closure_add_marshal_guards(long _self, long pre_marshal_data, com.sun.jna.Callback pre_marshal_notify, long post_marshal_data, com.sun.jna.Callback post_marshal_notify);
        void g_closure_invalidate(long _self);
        long g_closure_ref(long _self);
        void g_closure_remove_finalize_notifier(long _self, long notify_data, com.sun.jna.Callback notify_func);
        void g_closure_remove_invalidate_notifier(long _self, long notify_data, com.sun.jna.Callback notify_func);
        void g_closure_sink(long _self);
        void g_closure_unref(long _self);
        long g_closure_get_type();
    }

}
