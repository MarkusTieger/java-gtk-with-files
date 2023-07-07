/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSettingsSchemaSource {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_settings_schema_source_new_from_directory(long directory, long parent, boolean trusted, long _error);
        long g_settings_schema_source_new_from_directory(String directory, long parent, boolean trusted, long _error);
        long g_settings_schema_source_lookup(long _self, long schema_id, boolean recursive);
        long g_settings_schema_source_lookup(long _self, String schema_id, boolean recursive);
        long g_settings_schema_source_ref(long _self);
        void g_settings_schema_source_unref(long _self);
        long g_settings_schema_source_get_default();
        long g_settings_schema_source_get_type();
    }

}
