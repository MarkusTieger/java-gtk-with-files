/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaSourceCallbackFuncs {

    @FunctionalInterface
    public interface OnRef extends com.sun.jna.Callback {
        void invoke(long cb_data);
    }

    @FunctionalInterface
    public interface OnUnref extends com.sun.jna.Callback {
        void invoke(long cb_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SourceCallbackFuncs size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SourceCallbackFuncs.REF, SourceCallbackFuncs.UNREF})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnRef ref;
        public OnUnref unref;
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
