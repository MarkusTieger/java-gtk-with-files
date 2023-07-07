/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaInputStreamClass {

    @FunctionalInterface
    public interface OnReadFn extends com.sun.jna.Callback {
        long invoke(long stream, long buffer, long count, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnSkip extends com.sun.jna.Callback {
        long invoke(long stream, long count, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnCloseFn extends com.sun.jna.Callback {
        boolean invoke(long stream, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnReadAsync extends com.sun.jna.Callback {
        void invoke(long stream, long buffer, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnReadFinish extends com.sun.jna.Callback {
        long invoke(long stream, long result, long _error);
    }

    @FunctionalInterface
    public interface OnSkipAsync extends com.sun.jna.Callback {
        void invoke(long stream, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnSkipFinish extends com.sun.jna.Callback {
        long invoke(long stream, long result, long _error);
    }

    @FunctionalInterface
    public interface OnCloseAsync extends com.sun.jna.Callback {
        void invoke(long stream, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnCloseFinish extends com.sun.jna.Callback {
        boolean invoke(long stream, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved5 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("InputStreamClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({InputStreamClass.PARENT_CLASS, InputStreamClass.READ_FN, InputStreamClass.SKIP, InputStreamClass.CLOSE_FN, InputStreamClass.READ_ASYNC, InputStreamClass.READ_FINISH, InputStreamClass.SKIP_ASYNC, InputStreamClass.SKIP_FINISH, InputStreamClass.CLOSE_ASYNC, InputStreamClass.CLOSE_FINISH, InputStreamClass._G_RESERVED1, InputStreamClass._G_RESERVED2, InputStreamClass._G_RESERVED3, InputStreamClass._G_RESERVED4, InputStreamClass._G_RESERVED5})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnReadFn read_fn;
        public OnSkip skip;
        public OnCloseFn close_fn;
        public OnReadAsync read_async;
        public OnReadFinish read_finish;
        public OnSkipAsync skip_async;
        public OnSkipFinish skip_finish;
        public OnCloseAsync close_async;
        public OnCloseFinish close_finish;
        public OnGReserved1 _g_reserved1;
        public OnGReserved2 _g_reserved2;
        public OnGReserved3 _g_reserved3;
        public OnGReserved4 _g_reserved4;
        public OnGReserved5 _g_reserved5;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
