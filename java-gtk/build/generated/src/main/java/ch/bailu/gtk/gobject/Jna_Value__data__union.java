/* this file is machine generated */
package ch.bailu.gtk.gobject;




class Jna_Value__data__union {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("_Value__data__union size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({_Value__data__union.V_INT, _Value__data__union.V_UINT, _Value__data__union.V_LONG, _Value__data__union.V_ULONG, _Value__data__union.V_INT64, _Value__data__union.V_UINT64, _Value__data__union.V_FLOAT, _Value__data__union.V_DOUBLE, _Value__data__union.V_POINTER})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int v_int;
        public int v_uint;
        public long v_long;
        public long v_ulong;
        public long v_int64;
        public long v_uint64;
        public float v_float;
        public double v_double;
        public long v_pointer;
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
