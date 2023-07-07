/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSeekable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_seekable_can_seek(long _self);
        boolean g_seekable_can_truncate(long _self);
        long g_seekable_get_type();
    }

}
