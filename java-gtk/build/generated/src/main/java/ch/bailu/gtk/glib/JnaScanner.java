/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaScanner {

    @FunctionalInterface
    public interface OnHFunc extends com.sun.jna.Callback {
        void invoke(long key, long value, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Scanner size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Scanner.USER_DATA, Scanner.MAX_PARSE_ERRORS, Scanner.PARSE_ERRORS, Scanner.INPUT_NAME, Scanner.QDATA, Scanner.CONFIG, Scanner.TOKEN})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long user_data;
        public int max_parse_errors;
        public int parse_errors;
        public long input_name;
        public long qdata;
        public long config;
        public int token;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_scanner_cur_line(long _self);
        int g_scanner_cur_position(long _self);
        int g_scanner_cur_token(long _self);
        void g_scanner_destroy(long _self);
        boolean g_scanner_eof(long _self);
        void g_scanner_error(long _self, long format, java.lang.Object... _elipse);
        void g_scanner_error(long _self, String format, java.lang.Object... _elipse);
        int g_scanner_get_next_token(long _self);
        void g_scanner_input_file(long _self, int input_fd);
        void g_scanner_input_text(long _self, long text, int text_len);
        void g_scanner_input_text(long _self, String text, int text_len);
        long g_scanner_lookup_symbol(long _self, long symbol);
        long g_scanner_lookup_symbol(long _self, String symbol);
        int g_scanner_peek_next_token(long _self);
        void g_scanner_scope_add_symbol(long _self, int scope_id, long symbol, long value);
        void g_scanner_scope_add_symbol(long _self, int scope_id, String symbol, long value);
        void g_scanner_scope_foreach_symbol(long _self, int scope_id, com.sun.jna.Callback func, long user_data);
        long g_scanner_scope_lookup_symbol(long _self, int scope_id, long symbol);
        long g_scanner_scope_lookup_symbol(long _self, int scope_id, String symbol);
        void g_scanner_scope_remove_symbol(long _self, int scope_id, long symbol);
        void g_scanner_scope_remove_symbol(long _self, int scope_id, String symbol);
        int g_scanner_set_scope(long _self, int scope_id);
        void g_scanner_sync_file_offset(long _self);
        void g_scanner_unexp_token(long _self, int expected_token, long identifier_spec, long symbol_spec, long symbol_name, long message, int is_error);
        void g_scanner_unexp_token(long _self, int expected_token, String identifier_spec, String symbol_spec, String symbol_name, String message, int is_error);
        void g_scanner_warn(long _self, long format, java.lang.Object... _elipse);
        void g_scanner_warn(long _self, String format, java.lang.Object... _elipse);
        long g_scanner_new(long config_templ);
    }

}
