/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsFileDatabase {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_tls_file_database_new(long anchors, long _error);
        long g_tls_file_database_get_type();
    }

}
