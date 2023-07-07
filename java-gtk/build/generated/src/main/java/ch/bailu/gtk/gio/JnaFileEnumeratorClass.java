/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileEnumeratorClass {

    @FunctionalInterface
    public interface OnNextFile extends com.sun.jna.Callback {
        long invoke(long enumerator, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnCloseFn extends com.sun.jna.Callback {
        boolean invoke(long enumerator, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnNextFilesAsync extends com.sun.jna.Callback {
        void invoke(long enumerator, int num_files, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnNextFilesFinish extends com.sun.jna.Callback {
        long invoke(long enumerator, long result, long _error);
    }

    @FunctionalInterface
    public interface OnCloseAsync extends com.sun.jna.Callback {
        void invoke(long enumerator, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnCloseFinish extends com.sun.jna.Callback {
        boolean invoke(long enumerator, long result, long _error);
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

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("FileEnumeratorClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({FileEnumeratorClass.PARENT_CLASS, FileEnumeratorClass.NEXT_FILE, FileEnumeratorClass.CLOSE_FN, FileEnumeratorClass.NEXT_FILES_ASYNC, FileEnumeratorClass.NEXT_FILES_FINISH, FileEnumeratorClass.CLOSE_ASYNC, FileEnumeratorClass.CLOSE_FINISH, FileEnumeratorClass._G_RESERVED1, FileEnumeratorClass._G_RESERVED2, FileEnumeratorClass._G_RESERVED3, FileEnumeratorClass._G_RESERVED4, FileEnumeratorClass._G_RESERVED5, FileEnumeratorClass._G_RESERVED6, FileEnumeratorClass._G_RESERVED7})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnNextFile next_file;
        public OnCloseFn close_fn;
        public OnNextFilesAsync next_files_async;
        public OnNextFilesFinish next_files_finish;
        public OnCloseAsync close_async;
        public OnCloseFinish close_finish;
        public OnGReserved1 _g_reserved1;
        public OnGReserved2 _g_reserved2;
        public OnGReserved3 _g_reserved3;
        public OnGReserved4 _g_reserved4;
        public OnGReserved5 _g_reserved5;
        public OnGReserved6 _g_reserved6;
        public OnGReserved7 _g_reserved7;
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
