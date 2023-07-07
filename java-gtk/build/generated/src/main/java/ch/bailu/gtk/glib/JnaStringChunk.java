/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaStringChunk {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_string_chunk_clear(long _self);
        void g_string_chunk_free(long _self);
        long g_string_chunk_insert(long _self, long string);
        long g_string_chunk_insert(long _self, String string);
        long g_string_chunk_insert_const(long _self, long string);
        long g_string_chunk_insert_const(long _self, String string);
        long g_string_chunk_insert_len(long _self, long string, long len);
        long g_string_chunk_insert_len(long _self, String string, long len);
        long g_string_chunk_new(long size);
    }

}
