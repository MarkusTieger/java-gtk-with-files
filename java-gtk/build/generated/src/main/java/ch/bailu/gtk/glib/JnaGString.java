/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaGString {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("GString size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({GString.STR, GString.LEN, GString.ALLOCATED_LEN})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long str;
        public long len;
        public long allocated_len;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_string_new(long init);
        long g_string_new(String init);
        long g_string_new_len(long init, long len);
        long g_string_new_len(String init, long len);
        long g_string_sized_new(long dfl_size);
        long g_string_append(long _self, long val);
        long g_string_append(long _self, String val);
        long g_string_append_c(long _self, byte c);
        long g_string_append_len(long _self, long val, long len);
        long g_string_append_len(long _self, String val, long len);
        void g_string_append_printf(long _self, long format, java.lang.Object... _elipse);
        void g_string_append_printf(long _self, String format, java.lang.Object... _elipse);
        long g_string_append_unichar(long _self, byte wc);
        long g_string_append_uri_escaped(long _self, long unescaped, long reserved_chars_allowed, boolean allow_utf8);
        long g_string_append_uri_escaped(long _self, String unescaped, String reserved_chars_allowed, boolean allow_utf8);
        long g_string_ascii_down(long _self);
        long g_string_ascii_up(long _self);
        long g_string_assign(long _self, long rval);
        long g_string_assign(long _self, String rval);
        boolean g_string_equal(long _self, long v2);
        long g_string_erase(long _self, long pos, long len);
        long g_string_free(long _self, boolean free_segment);
        long g_string_free_to_bytes(long _self);
        int g_string_hash(long _self);
        long g_string_insert(long _self, long pos, long val);
        long g_string_insert(long _self, long pos, String val);
        long g_string_insert_c(long _self, long pos, byte c);
        long g_string_insert_len(long _self, long pos, long val, long len);
        long g_string_insert_len(long _self, long pos, String val, long len);
        long g_string_insert_unichar(long _self, long pos, byte wc);
        long g_string_overwrite(long _self, long pos, long val);
        long g_string_overwrite(long _self, long pos, String val);
        long g_string_overwrite_len(long _self, long pos, long val, long len);
        long g_string_overwrite_len(long _self, long pos, String val, long len);
        long g_string_prepend(long _self, long val);
        long g_string_prepend(long _self, String val);
        long g_string_prepend_c(long _self, byte c);
        long g_string_prepend_len(long _self, long val, long len);
        long g_string_prepend_len(long _self, String val, long len);
        long g_string_prepend_unichar(long _self, byte wc);
        void g_string_printf(long _self, long format, java.lang.Object... _elipse);
        void g_string_printf(long _self, String format, java.lang.Object... _elipse);
        int g_string_replace(long _self, long find, long replace, int limit);
        int g_string_replace(long _self, String find, String replace, int limit);
        long g_string_set_size(long _self, long len);
        long g_string_truncate(long _self, long len);
        long g_gstring_get_type();
    }

}
