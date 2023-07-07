/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypeInfo {

    @FunctionalInterface
    public interface OnBaseInitFunc extends com.sun.jna.Callback {
        void invoke(long g_class);
    }

    @FunctionalInterface
    public interface OnBaseFinalizeFunc extends com.sun.jna.Callback {
        void invoke(long g_class);
    }

    @FunctionalInterface
    public interface OnClassInitFunc extends com.sun.jna.Callback {
        void invoke(long g_class, long class_data);
    }

    @FunctionalInterface
    public interface OnClassFinalizeFunc extends com.sun.jna.Callback {
        void invoke(long g_class, long class_data);
    }

    @FunctionalInterface
    public interface OnInstanceInitFunc extends com.sun.jna.Callback {
        void invoke(long instance, long g_class);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TypeInfo size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TypeInfo.CLASS_SIZE, TypeInfo.BASE_INIT, TypeInfo.BASE_FINALIZE, TypeInfo.CLASS_INIT, TypeInfo.CLASS_FINALIZE, TypeInfo.CLASS_DATA, TypeInfo.INSTANCE_SIZE, TypeInfo.N_PREALLOCS, TypeInfo.INSTANCE_INIT, TypeInfo.VALUE_TABLE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int class_size;
        public OnBaseInitFunc base_init;
        public OnBaseFinalizeFunc base_finalize;
        public OnClassInitFunc class_init;
        public OnClassFinalizeFunc class_finalize;
        public long class_data;
        public int instance_size;
        public int n_preallocs;
        public OnInstanceInitFunc instance_init;
        public long value_table;
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
