/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSorterClass {

    @FunctionalInterface
    public interface OnCompare extends com.sun.jna.Callback {
        int invoke(long self, long item1, long item2);
    }

    @FunctionalInterface
    public interface OnGetOrder extends com.sun.jna.Callback {
        int invoke(long self);
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

    @FunctionalInterface
    public interface OnGtkReserved5 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved6 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved7 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved8 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SorterClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SorterClass.PARENT_CLASS, SorterClass.COMPARE, SorterClass.GET_ORDER, SorterClass._GTK_RESERVED1, SorterClass._GTK_RESERVED2, SorterClass._GTK_RESERVED3, SorterClass._GTK_RESERVED4, SorterClass._GTK_RESERVED5, SorterClass._GTK_RESERVED6, SorterClass._GTK_RESERVED7, SorterClass._GTK_RESERVED8})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnCompare compare;
        public OnGetOrder get_order;
        public OnGtkReserved1 _gtk_reserved1;
        public OnGtkReserved2 _gtk_reserved2;
        public OnGtkReserved3 _gtk_reserved3;
        public OnGtkReserved4 _gtk_reserved4;
        public OnGtkReserved5 _gtk_reserved5;
        public OnGtkReserved6 _gtk_reserved6;
        public OnGtkReserved7 _gtk_reserved7;
        public OnGtkReserved8 _gtk_reserved8;
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
