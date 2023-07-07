/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaMappedFile {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_mapped_file_new(long filename, boolean writable, long _error);
        long g_mapped_file_new(String filename, boolean writable, long _error);
        long g_mapped_file_new_from_fd(int fd, boolean writable, long _error);
        long g_mapped_file_get_bytes(long _self);
        long g_mapped_file_get_contents(long _self);
        long g_mapped_file_get_length(long _self);
        long g_mapped_file_ref(long _self);
        void g_mapped_file_unref(long _self);
        long g_mapped_file_get_type();
    }

}
