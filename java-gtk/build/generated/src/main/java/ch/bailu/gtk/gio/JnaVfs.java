/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaVfs {

    @FunctionalInterface
    public interface OnVfsFileLookupFunc extends com.sun.jna.Callback {
        long invoke(long vfs, long identifier, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_vfs_get_file_for_path(long _self, long path);
        long g_vfs_get_file_for_path(long _self, String path);
        long g_vfs_get_file_for_uri(long _self, long uri);
        long g_vfs_get_file_for_uri(long _self, String uri);
        boolean g_vfs_is_active(long _self);
        long g_vfs_parse_name(long _self, long parse_name);
        long g_vfs_parse_name(long _self, String parse_name);
        boolean g_vfs_register_uri_scheme(long _self, long scheme, com.sun.jna.Callback uri_func, long uri_data, com.sun.jna.Callback uri_destroy, com.sun.jna.Callback parse_name_func, long parse_name_data, com.sun.jna.Callback parse_name_destroy);
        boolean g_vfs_register_uri_scheme(long _self, String scheme, com.sun.jna.Callback uri_func, long uri_data, com.sun.jna.Callback uri_destroy, com.sun.jna.Callback parse_name_func, long parse_name_data, com.sun.jna.Callback parse_name_destroy);
        boolean g_vfs_unregister_uri_scheme(long _self, long scheme);
        boolean g_vfs_unregister_uri_scheme(long _self, String scheme);
        long g_vfs_get_default();
        long g_vfs_get_local();
        long g_vfs_get_type();
    }

}
