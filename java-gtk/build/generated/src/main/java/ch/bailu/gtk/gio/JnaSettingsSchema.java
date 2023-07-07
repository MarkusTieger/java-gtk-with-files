/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSettingsSchema {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_settings_schema_get_id(long _self);
        long g_settings_schema_get_key(long _self, long name);
        long g_settings_schema_get_key(long _self, String name);
        long g_settings_schema_get_path(long _self);
        boolean g_settings_schema_has_key(long _self, long name);
        boolean g_settings_schema_has_key(long _self, String name);
        long g_settings_schema_ref(long _self);
        void g_settings_schema_unref(long _self);
        long g_settings_schema_get_type();
    }

}
