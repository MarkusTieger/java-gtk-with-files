/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMediaFileClass {

    @FunctionalInterface
    public interface OnOpen extends com.sun.jna.Callback {
        void invoke(long self);
    }

    @FunctionalInterface
    public interface OnClose extends com.sun.jna.Callback {
        void invoke(long self);
    }

    @FunctionalInterface
    public interface OnGtkReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("MediaFileClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({MediaFileClass.PARENT_CLASS, MediaFileClass.OPEN, MediaFileClass.CLOSE, MediaFileClass._GTK_RESERVED1, MediaFileClass._GTK_RESERVED2, MediaFileClass._GTK_RESERVED3, MediaFileClass._GTK_RESERVED4})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[MediaStreamClass.getInstanceSize()];
        public OnOpen open;
        public OnClose close;
        public OnGtkReserved1 _gtk_reserved1;
        public OnGtkReserved2 _gtk_reserved2;
        public OnGtkReserved3 _gtk_reserved3;
        public OnGtkReserved4 _gtk_reserved4;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}