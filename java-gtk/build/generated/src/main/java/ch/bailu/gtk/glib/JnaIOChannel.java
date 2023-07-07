/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaIOChannel {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("IOChannel size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({IOChannel.REF_COUNT, IOChannel.FUNCS, IOChannel.ENCODING})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int ref_count;
        public long funcs;
        public long encoding;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_io_channel_new_file(long filename, long mode, long _error);
        long g_io_channel_new_file(String filename, String mode, long _error);
        long g_io_channel_unix_new(int fd);
        int g_io_channel_flush(long _self, long _error);
        int g_io_channel_get_buffer_condition(long _self);
        long g_io_channel_get_buffer_size(long _self);
        boolean g_io_channel_get_buffered(long _self);
        boolean g_io_channel_get_close_on_unref(long _self);
        long g_io_channel_get_encoding(long _self);
        int g_io_channel_get_flags(long _self);
        long g_io_channel_get_line_term(long _self, long length);
        void g_io_channel_init(long _self);
        int g_io_channel_read_chars(long _self, long buf, long count, long bytes_read, long _error);
        int g_io_channel_read_line_string(long _self, long buffer, long terminator_pos, long _error);
        long g_io_channel_ref(long _self);
        int g_io_channel_seek_position(long _self, long offset, int type, long _error);
        void g_io_channel_set_buffer_size(long _self, long size);
        void g_io_channel_set_buffered(long _self, boolean buffered);
        void g_io_channel_set_close_on_unref(long _self, boolean do_close);
        int g_io_channel_set_encoding(long _self, long encoding, long _error);
        int g_io_channel_set_encoding(long _self, String encoding, long _error);
        int g_io_channel_set_flags(long _self, int flags, long _error);
        void g_io_channel_set_line_term(long _self, long line_term, int length);
        void g_io_channel_set_line_term(long _self, String line_term, int length);
        int g_io_channel_shutdown(long _self, boolean flush, long _error);
        int g_io_channel_unix_get_fd(long _self);
        void g_io_channel_unref(long _self);
        int g_io_channel_write_chars(long _self, long buf, long count, long bytes_written, long _error);
        int g_io_channel_write_chars(long _self, String buf, long count, long bytes_written, long _error);
        int g_io_channel_write_unichar(long _self, byte thechar, long _error);
        int g_io_channel_error_from_errno(int en);
        int g_io_channel_error_quark();
        long g_io_channel_get_type();
    }

}
