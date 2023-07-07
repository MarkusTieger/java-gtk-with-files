/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaPollableOutputStreamInterface {

    @FunctionalInterface
    public interface OnCanPoll extends com.sun.jna.Callback {
        boolean invoke(long stream);
    }

    @FunctionalInterface
    public interface OnIsWritable extends com.sun.jna.Callback {
        boolean invoke(long stream);
    }

    @FunctionalInterface
    public interface OnCreateSource extends com.sun.jna.Callback {
        long invoke(long stream, long cancellable);
    }

    @FunctionalInterface
    public interface OnWriteNonblocking extends com.sun.jna.Callback {
        long invoke(long stream, long buffer, long count, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PollableOutputStreamInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PollableOutputStreamInterface.G_IFACE, PollableOutputStreamInterface.CAN_POLL, PollableOutputStreamInterface.IS_WRITABLE, PollableOutputStreamInterface.CREATE_SOURCE, PollableOutputStreamInterface.WRITE_NONBLOCKING})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnCanPoll can_poll;
        public OnIsWritable is_writable;
        public OnCreateSource create_source;
        public OnWriteNonblocking write_nonblocking;
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
