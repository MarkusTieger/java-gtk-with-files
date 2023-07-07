/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaBufferedInputStreamClass {

    @FunctionalInterface
    public interface OnFill extends com.sun.jna.Callback {
        long invoke(long stream, long count, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnFillAsync extends com.sun.jna.Callback {
        void invoke(long stream, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnFillFinish extends com.sun.jna.Callback {
        long invoke(long stream, long result, long _error);
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
            System.out.println("BufferedInputStreamClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({BufferedInputStreamClass.PARENT_CLASS, BufferedInputStreamClass.FILL, BufferedInputStreamClass.FILL_ASYNC, BufferedInputStreamClass.FILL_FINISH, BufferedInputStreamClass._G_RESERVED1, BufferedInputStreamClass._G_RESERVED2, BufferedInputStreamClass._G_RESERVED3, BufferedInputStreamClass._G_RESERVED4, BufferedInputStreamClass._G_RESERVED5})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[FilterInputStreamClass.getInstanceSize()];
        public OnFill fill;
        public OnFillAsync fill_async;
        public OnFillFinish fill_finish;
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
