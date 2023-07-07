/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketControlMessageClass {

    @FunctionalInterface
    public interface OnGetSize extends com.sun.jna.Callback {
        long invoke(long message);
    }

    @FunctionalInterface
    public interface OnGetLevel extends com.sun.jna.Callback {
        int invoke(long message);
    }

    @FunctionalInterface
    public interface OnGetType extends com.sun.jna.Callback {
        int invoke(long message);
    }

    @FunctionalInterface
    public interface OnSerialize extends com.sun.jna.Callback {
        void invoke(long message, long data);
    }

    @FunctionalInterface
    public interface OnDeserialize extends com.sun.jna.Callback {
        long invoke(int level, int type, long size, long data);
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
            System.out.println("SocketControlMessageClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SocketControlMessageClass.PARENT_CLASS, SocketControlMessageClass.GET_SIZE, SocketControlMessageClass.GET_LEVEL, SocketControlMessageClass.GET_TYPE, SocketControlMessageClass.SERIALIZE, SocketControlMessageClass.DESERIALIZE, SocketControlMessageClass._G_RESERVED1, SocketControlMessageClass._G_RESERVED2, SocketControlMessageClass._G_RESERVED3, SocketControlMessageClass._G_RESERVED4, SocketControlMessageClass._G_RESERVED5})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetSize get_size;
        public OnGetLevel get_level;
        public OnGetType get_type;
        public OnSerialize serialize;
        public OnDeserialize deserialize;
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
