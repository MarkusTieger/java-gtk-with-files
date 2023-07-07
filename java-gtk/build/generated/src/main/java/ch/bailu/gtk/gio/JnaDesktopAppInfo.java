/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDesktopAppInfo {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_desktop_app_info_new(long desktop_id);
        long g_desktop_app_info_new(String desktop_id);
        long g_desktop_app_info_new_from_filename(long filename);
        long g_desktop_app_info_new_from_filename(String filename);
        long g_desktop_app_info_new_from_keyfile(long key_file);
        long g_desktop_app_info_get_action_name(long _self, long action_name);
        long g_desktop_app_info_get_action_name(long _self, String action_name);
        boolean g_desktop_app_info_get_boolean(long _self, long key);
        boolean g_desktop_app_info_get_boolean(long _self, String key);
        long g_desktop_app_info_get_categories(long _self);
        long g_desktop_app_info_get_filename(long _self);
        long g_desktop_app_info_get_generic_name(long _self);
        boolean g_desktop_app_info_get_is_hidden(long _self);
        long g_desktop_app_info_get_keywords(long _self);
        long g_desktop_app_info_get_locale_string(long _self, long key);
        long g_desktop_app_info_get_locale_string(long _self, String key);
        boolean g_desktop_app_info_get_nodisplay(long _self);
        boolean g_desktop_app_info_get_show_in(long _self, long desktop_env);
        boolean g_desktop_app_info_get_show_in(long _self, String desktop_env);
        long g_desktop_app_info_get_startup_wm_class(long _self);
        long g_desktop_app_info_get_string(long _self, long key);
        long g_desktop_app_info_get_string(long _self, String key);
        boolean g_desktop_app_info_has_key(long _self, long key);
        boolean g_desktop_app_info_has_key(long _self, String key);
        void g_desktop_app_info_launch_action(long _self, long action_name, long launch_context);
        void g_desktop_app_info_launch_action(long _self, String action_name, long launch_context);
        long g_desktop_app_info_get_implementations(long _interface);
        long g_desktop_app_info_get_type();
    }

}
