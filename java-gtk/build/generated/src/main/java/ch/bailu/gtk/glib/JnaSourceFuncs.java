/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaSourceFuncs {

    @FunctionalInterface
    public interface OnPrepare extends com.sun.jna.Callback {
        boolean invoke(long source, long timeout_);
    }

    @FunctionalInterface
    public interface OnCheck extends com.sun.jna.Callback {
        boolean invoke(long source);
    }

    @FunctionalInterface
    public interface OnDispatch extends com.sun.jna.Callback {
        boolean invoke(long source, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnFinalize extends com.sun.jna.Callback {
        void invoke(long source);
    }

    @FunctionalInterface
    public interface OnSourceFunc extends com.sun.jna.Callback {
        boolean invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnSourceDummyMarshal extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SourceFuncs size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SourceFuncs.PREPARE, SourceFuncs.CHECK, SourceFuncs.DISPATCH, SourceFuncs.FINALIZE, SourceFuncs.CLOSURE_CALLBACK, SourceFuncs.CLOSURE_MARSHAL})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnPrepare prepare;
        public OnCheck check;
        public OnDispatch dispatch;
        public OnFinalize finalize;
        public OnSourceFunc closure_callback;
        public OnSourceDummyMarshal closure_marshal;
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
