/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaDir {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_dir_close(long _self);
        long g_dir_read_name(long _self);
        void g_dir_rewind(long _self);
        long g_dir_make_tmp(long tmpl, long _error);
        long g_dir_open(long path, int flags, long _error);
    }

}
