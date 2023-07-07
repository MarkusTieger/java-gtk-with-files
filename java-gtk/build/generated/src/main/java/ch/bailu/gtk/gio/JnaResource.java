/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaResource {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_resource_new_from_data(long data, long _error);
        void g_resources_register(long _self);
        void g_resources_unregister(long _self);
        long g_resource_enumerate_children(long _self, long path, int lookup_flags, long _error);
        long g_resource_enumerate_children(long _self, String path, int lookup_flags, long _error);
        boolean g_resource_get_info(long _self, long path, int lookup_flags, long size, long flags, long _error);
        boolean g_resource_get_info(long _self, String path, int lookup_flags, long size, long flags, long _error);
        long g_resource_lookup_data(long _self, long path, int lookup_flags, long _error);
        long g_resource_lookup_data(long _self, String path, int lookup_flags, long _error);
        long g_resource_open_stream(long _self, long path, int lookup_flags, long _error);
        long g_resource_open_stream(long _self, String path, int lookup_flags, long _error);
        long g_resource_ref(long _self);
        void g_resource_unref(long _self);
        long g_resource_load(long filename, long _error);
        long g_resource_get_type();
    }

}
