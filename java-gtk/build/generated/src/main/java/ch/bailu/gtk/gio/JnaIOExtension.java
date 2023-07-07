/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIOExtension {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_io_extension_get_name(long _self);
        int g_io_extension_get_priority(long _self);
        long g_io_extension_get_type(long _self);
        long g_io_extension_ref_class(long _self);
    }

}
