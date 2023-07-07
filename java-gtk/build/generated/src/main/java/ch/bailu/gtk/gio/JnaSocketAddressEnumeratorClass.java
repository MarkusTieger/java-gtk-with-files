/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketAddressEnumeratorClass {

    @FunctionalInterface
    public interface OnNext extends com.sun.jna.Callback {
        long invoke(long enumerator, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnNextAsync extends com.sun.jna.Callback {
        void invoke(long enumerator, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnNextFinish extends com.sun.jna.Callback {
        long invoke(long enumerator, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SocketAddressEnumeratorClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SocketAddressEnumeratorClass.PARENT_CLASS, SocketAddressEnumeratorClass.NEXT, SocketAddressEnumeratorClass.NEXT_ASYNC, SocketAddressEnumeratorClass.NEXT_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnNext next;
        public OnNextAsync next_async;
        public OnNextFinish next_finish;
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
