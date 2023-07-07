/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSettingsBackend {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_settings_backend_changed(long _self, long key, long origin_tag);
        void g_settings_backend_changed(long _self, String key, long origin_tag);
        void g_settings_backend_changed_tree(long _self, long tree, long origin_tag);
        void g_settings_backend_path_changed(long _self, long path, long origin_tag);
        void g_settings_backend_path_changed(long _self, String path, long origin_tag);
        void g_settings_backend_path_writable_changed(long _self, long path);
        void g_settings_backend_path_writable_changed(long _self, String path);
        void g_settings_backend_writable_changed(long _self, long key);
        void g_settings_backend_writable_changed(long _self, String key);
        long g_settings_backend_get_default();
        long g_settings_backend_get_type();
    }

}
