/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSettingsSchemaKey {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_settings_schema_key_get_default_value(long _self);
        long g_settings_schema_key_get_description(long _self);
        long g_settings_schema_key_get_name(long _self);
        long g_settings_schema_key_get_range(long _self);
        long g_settings_schema_key_get_summary(long _self);
        long g_settings_schema_key_get_value_type(long _self);
        boolean g_settings_schema_key_range_check(long _self, long value);
        long g_settings_schema_key_ref(long _self);
        void g_settings_schema_key_unref(long _self);
        long g_settings_schema_key_get_type();
    }

}
