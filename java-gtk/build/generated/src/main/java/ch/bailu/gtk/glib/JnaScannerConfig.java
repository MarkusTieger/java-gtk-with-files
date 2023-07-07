/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaScannerConfig {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ScannerConfig size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ScannerConfig.CSET_SKIP_CHARACTERS, ScannerConfig.CSET_IDENTIFIER_FIRST, ScannerConfig.CSET_IDENTIFIER_NTH, ScannerConfig.CPAIR_COMMENT_SINGLE, ScannerConfig.CASE_SENSITIVE, ScannerConfig.SKIP_COMMENT_MULTI, ScannerConfig.SKIP_COMMENT_SINGLE, ScannerConfig.SCAN_COMMENT_MULTI, ScannerConfig.SCAN_IDENTIFIER, ScannerConfig.SCAN_IDENTIFIER_1CHAR, ScannerConfig.SCAN_IDENTIFIER_NULL, ScannerConfig.SCAN_SYMBOLS, ScannerConfig.SCAN_BINARY, ScannerConfig.SCAN_OCTAL, ScannerConfig.SCAN_FLOAT, ScannerConfig.SCAN_HEX, ScannerConfig.SCAN_HEX_DOLLAR, ScannerConfig.SCAN_STRING_SQ, ScannerConfig.SCAN_STRING_DQ, ScannerConfig.NUMBERS_2_INT, ScannerConfig.INT_2_FLOAT, ScannerConfig.IDENTIFIER_2_STRING, ScannerConfig.CHAR_2_TOKEN, ScannerConfig.SYMBOL_2_TOKEN, ScannerConfig.SCOPE_0_FALLBACK, ScannerConfig.STORE_INT64, ScannerConfig.PADDING_DUMMY})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long cset_skip_characters;
        public long cset_identifier_first;
        public long cset_identifier_nth;
        public long cpair_comment_single;
        public int case_sensitive;
        public int skip_comment_multi;
        public int skip_comment_single;
        public int scan_comment_multi;
        public int scan_identifier;
        public int scan_identifier_1char;
        public int scan_identifier_NULL;
        public int scan_symbols;
        public int scan_binary;
        public int scan_octal;
        public int scan_float;
        public int scan_hex;
        public int scan_hex_dollar;
        public int scan_string_sq;
        public int scan_string_dq;
        public int numbers_2_int;
        public int int_2_float;
        public int identifier_2_string;
        public int char_2_token;
        public int symbol_2_token;
        public int scope_0_fallback;
        public int store_int64;
        public int padding_dummy;
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
