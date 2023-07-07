/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIOModuleScope {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_io_module_scope_block(long _self, long basename);
        void g_io_module_scope_block(long _self, String basename);
        void g_io_module_scope_free(long _self);
        long g_io_module_scope_new(int flags);
    }

}
