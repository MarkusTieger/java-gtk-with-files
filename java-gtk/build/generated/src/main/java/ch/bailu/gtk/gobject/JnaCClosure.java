/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaCClosure {

    @FunctionalInterface
    public interface OnCallback extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnClosureNotify extends com.sun.jna.Callback {
        void invoke(long data, long closure);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("CClosure size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({CClosure.CLOSURE, CClosure.CALLBACK})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] closure = new byte[Closure.getInstanceSize()];
        public long callback;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_cclosure_marshal_BOOLEAN__BOXED_BOXED(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_BOOLEAN__FLAGS(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_STRING__OBJECT_POINTER(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__BOOLEAN(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__BOXED(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__CHAR(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__DOUBLE(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__ENUM(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__FLAGS(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__FLOAT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__INT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__LONG(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__OBJECT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__PARAM(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__POINTER(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__STRING(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__UCHAR(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__UINT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__UINT_POINTER(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__ULONG(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__VARIANT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__VOID(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_generic(long closure, long return_gvalue, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        long g_cclosure_new(com.sun.jna.Callback callback_func, long user_data, com.sun.jna.Callback destroy_data);
        long g_cclosure_new_object(com.sun.jna.Callback callback_func, long object);
        long g_cclosure_new_object_swap(com.sun.jna.Callback callback_func, long object);
        long g_cclosure_new_swap(com.sun.jna.Callback callback_func, long user_data, com.sun.jna.Callback destroy_data);
    }

}
