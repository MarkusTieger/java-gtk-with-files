/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaSequenceIter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_sequence_iter_compare(long _self, long b);
        int g_sequence_iter_get_position(long _self);
        long g_sequence_iter_get_sequence(long _self);
        boolean g_sequence_iter_is_begin(long _self);
        boolean g_sequence_iter_is_end(long _self);
        long g_sequence_iter_move(long _self, int delta);
        long g_sequence_iter_next(long _self);
        long g_sequence_iter_prev(long _self);
    }

}
