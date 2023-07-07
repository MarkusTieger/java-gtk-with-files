/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaOutputStreamClass {

    @FunctionalInterface
    public interface OnWriteFn extends com.sun.jna.Callback {
        long invoke(long stream, long buffer, long count, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnSplice extends com.sun.jna.Callback {
        long invoke(long stream, long source, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnFlush extends com.sun.jna.Callback {
        boolean invoke(long stream, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnCloseFn extends com.sun.jna.Callback {
        boolean invoke(long stream, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnWriteAsync extends com.sun.jna.Callback {
        void invoke(long stream, long buffer, long count, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnWriteFinish extends com.sun.jna.Callback {
        long invoke(long stream, long result, long _error);
    }

    @FunctionalInterface
    public interface OnSpliceAsync extends com.sun.jna.Callback {
        void invoke(long stream, long source, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnSpliceFinish extends com.sun.jna.Callback {
        long invoke(long stream, long result, long _error);
    }

    @FunctionalInterface
    public interface OnFlushAsync extends com.sun.jna.Callback {
        void invoke(long stream, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnFlushFinish extends com.sun.jna.Callback {
        boolean invoke(long stream, long result, long _error);
    }

    @FunctionalInterface
    public interface OnCloseAsync extends com.sun.jna.Callback {
        void invoke(long stream, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnCloseFinish extends com.sun.jna.Callback {
        boolean invoke(long stream, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("OutputStreamClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({OutputStreamClass.PARENT_CLASS, OutputStreamClass.WRITE_FN, OutputStreamClass.SPLICE, OutputStreamClass.FLUSH, OutputStreamClass.CLOSE_FN, OutputStreamClass.WRITE_ASYNC, OutputStreamClass.WRITE_FINISH, OutputStreamClass.SPLICE_ASYNC, OutputStreamClass.SPLICE_FINISH, OutputStreamClass.FLUSH_ASYNC, OutputStreamClass.FLUSH_FINISH, OutputStreamClass.CLOSE_ASYNC, OutputStreamClass.CLOSE_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnWriteFn write_fn;
        public OnSplice splice;
        public OnFlush flush;
        public OnCloseFn close_fn;
        public OnWriteAsync write_async;
        public OnWriteFinish write_finish;
        public OnSpliceAsync splice_async;
        public OnSpliceFinish splice_finish;
        public OnFlushAsync flush_async;
        public OnFlushFinish flush_finish;
        public OnCloseAsync close_async;
        public OnCloseFinish close_finish;
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
