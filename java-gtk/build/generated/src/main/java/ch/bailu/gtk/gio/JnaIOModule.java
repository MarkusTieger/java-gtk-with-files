/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIOModule {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_io_module_new(long filename);
        long g_io_module_new(String filename);
        void g_io_module_load(long _self);
        void g_io_module_unload(long _self);
        long g_io_module_query();
        long g_io_module_get_type();
    }

}
