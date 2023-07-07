/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaIOFuncs {

    @FunctionalInterface
    public interface OnIoRead extends com.sun.jna.Callback {
        int invoke(long channel, long buf, long count, long bytes_read, long _error);
    }

    @FunctionalInterface
    public interface OnIoWrite extends com.sun.jna.Callback {
        int invoke(long channel, long buf, long count, long bytes_written, long _error);
    }

    @FunctionalInterface
    public interface OnIoSeek extends com.sun.jna.Callback {
        int invoke(long channel, long offset, int type, long _error);
    }

    @FunctionalInterface
    public interface OnIoClose extends com.sun.jna.Callback {
        int invoke(long channel, long _error);
    }

    @FunctionalInterface
    public interface OnIoCreateWatch extends com.sun.jna.Callback {
        long invoke(long channel, int condition);
    }

    @FunctionalInterface
    public interface OnIoFree extends com.sun.jna.Callback {
        void invoke(long channel);
    }

    @FunctionalInterface
    public interface OnIoSetFlags extends com.sun.jna.Callback {
        int invoke(long channel, int flags, long _error);
    }

    @FunctionalInterface
    public interface OnIoGetFlags extends com.sun.jna.Callback {
        int invoke(long channel);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("IOFuncs size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({IOFuncs.IO_READ, IOFuncs.IO_WRITE, IOFuncs.IO_SEEK, IOFuncs.IO_CLOSE, IOFuncs.IO_CREATE_WATCH, IOFuncs.IO_FREE, IOFuncs.IO_SET_FLAGS, IOFuncs.IO_GET_FLAGS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnIoRead io_read;
        public OnIoWrite io_write;
        public OnIoSeek io_seek;
        public OnIoClose io_close;
        public OnIoCreateWatch io_create_watch;
        public OnIoFree io_free;
        public OnIoSetFlags io_set_flags;
        public OnIoGetFlags io_get_flags;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
