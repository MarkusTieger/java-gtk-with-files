/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypeModuleClass {

    @FunctionalInterface
    public interface OnLoad extends com.sun.jna.Callback {
        boolean invoke(long module);
    }

    @FunctionalInterface
    public interface OnUnload extends com.sun.jna.Callback {
        void invoke(long module);
    }

    @FunctionalInterface
    public interface OnReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TypeModuleClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TypeModuleClass.PARENT_CLASS, TypeModuleClass.LOAD, TypeModuleClass.UNLOAD, TypeModuleClass.RESERVED1, TypeModuleClass.RESERVED2, TypeModuleClass.RESERVED3, TypeModuleClass.RESERVED4})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ObjectClass.getInstanceSize()];
        public OnLoad load;
        public OnUnload unload;
        public OnReserved1 reserved1;
        public OnReserved2 reserved2;
        public OnReserved3 reserved3;
        public OnReserved4 reserved4;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
