/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaTokenValue {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TokenValue size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TokenValue.V_SYMBOL, TokenValue.V_IDENTIFIER, TokenValue.V_BINARY, TokenValue.V_OCTAL, TokenValue.V_INT, TokenValue.V_INT64, TokenValue.V_FLOAT, TokenValue.V_HEX, TokenValue.V_STRING, TokenValue.V_COMMENT})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long v_symbol;
        public long v_identifier;
        public long v_binary;
        public long v_octal;
        public long v_int;
        public long v_int64;
        public double v_float;
        public long v_hex;
        public long v_string;
        public long v_comment;
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
