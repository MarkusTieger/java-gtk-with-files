/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaParamSpecTypeInfo {

    @FunctionalInterface
    public interface OnInstanceInit extends com.sun.jna.Callback {
        void invoke(long pspec);
    }

    @FunctionalInterface
    public interface OnFinalize extends com.sun.jna.Callback {
        void invoke(long pspec);
    }

    @FunctionalInterface
    public interface OnValueSetDefault extends com.sun.jna.Callback {
        void invoke(long pspec, long value);
    }

    @FunctionalInterface
    public interface OnValueValidate extends com.sun.jna.Callback {
        boolean invoke(long pspec, long value);
    }

    @FunctionalInterface
    public interface OnValuesCmp extends com.sun.jna.Callback {
        int invoke(long pspec, long value1, long value2);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ParamSpecTypeInfo size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ParamSpecTypeInfo.INSTANCE_SIZE, ParamSpecTypeInfo.N_PREALLOCS, ParamSpecTypeInfo.INSTANCE_INIT, ParamSpecTypeInfo.VALUE_TYPE, ParamSpecTypeInfo.FINALIZE, ParamSpecTypeInfo.VALUE_SET_DEFAULT, ParamSpecTypeInfo.VALUE_VALIDATE, ParamSpecTypeInfo.VALUES_CMP})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int instance_size;
        public int n_preallocs;
        public OnInstanceInit instance_init;
        public long value_type;
        public OnFinalize finalize;
        public OnValueSetDefault value_set_default;
        public OnValueValidate value_validate;
        public OnValuesCmp values_cmp;
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
