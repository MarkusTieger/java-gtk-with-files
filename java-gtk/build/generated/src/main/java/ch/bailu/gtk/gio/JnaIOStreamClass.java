/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIOStreamClass {

    @FunctionalInterface
    public interface OnGetInputStream extends com.sun.jna.Callback {
        long invoke(long stream);
    }

    @FunctionalInterface
    public interface OnGetOutputStream extends com.sun.jna.Callback {
        long invoke(long stream);
    }

    @FunctionalInterface
    public interface OnCloseFn extends com.sun.jna.Callback {
        boolean invoke(long stream, long cancellable, long _error);
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

    @FunctionalInterface
    public interface OnGReserved6 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved7 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved8 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved9 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved10 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("IOStreamClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({IOStreamClass.PARENT_CLASS, IOStreamClass.GET_INPUT_STREAM, IOStreamClass.GET_OUTPUT_STREAM, IOStreamClass.CLOSE_FN, IOStreamClass.CLOSE_ASYNC, IOStreamClass.CLOSE_FINISH, IOStreamClass._G_RESERVED1, IOStreamClass._G_RESERVED2, IOStreamClass._G_RESERVED3, IOStreamClass._G_RESERVED4, IOStreamClass._G_RESERVED5, IOStreamClass._G_RESERVED6, IOStreamClass._G_RESERVED7, IOStreamClass._G_RESERVED8, IOStreamClass._G_RESERVED9, IOStreamClass._G_RESERVED10})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetInputStream get_input_stream;
        public OnGetOutputStream get_output_stream;
        public OnCloseFn close_fn;
        public OnCloseAsync close_async;
        public OnCloseFinish close_finish;
        public OnGReserved1 _g_reserved1;
        public OnGReserved2 _g_reserved2;
        public OnGReserved3 _g_reserved3;
        public OnGReserved4 _g_reserved4;
        public OnGReserved5 _g_reserved5;
        public OnGReserved6 _g_reserved6;
        public OnGReserved7 _g_reserved7;
        public OnGReserved8 _g_reserved8;
        public OnGReserved9 _g_reserved9;
        public OnGReserved10 _g_reserved10;
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
