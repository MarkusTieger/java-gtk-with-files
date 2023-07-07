/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIOExtensionPoint {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_io_extension_point_get_extension_by_name(long _self, long name);
        long g_io_extension_point_get_extension_by_name(long _self, String name);
        long g_io_extension_point_get_extensions(long _self);
        long g_io_extension_point_get_required_type(long _self);
        void g_io_extension_point_set_required_type(long _self, long type);
        long g_io_extension_point_implement(long extension_point_name, long type, long extension_name, int priority);
        long g_io_extension_point_lookup(long name);
        long g_io_extension_point_register(long name);
    }

}
