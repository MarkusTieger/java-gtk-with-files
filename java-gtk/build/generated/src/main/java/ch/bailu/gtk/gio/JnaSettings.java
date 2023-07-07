/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSettings {

    @FunctionalInterface
    public interface OnSettingsBindGetMapping extends com.sun.jna.Callback {
        boolean invoke(long value, long variant, long user_data);
    }

    @FunctionalInterface
    public interface OnSettingsBindSetMapping extends com.sun.jna.Callback {
        long invoke(long value, long expected_type, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnChangeEvent extends com.sun.jna.Callback {
        boolean invoke(long _self, long keys, int n_keys, long _data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long key, long _data);
    }

    @FunctionalInterface
    public interface OnWritableChangeEvent extends com.sun.jna.Callback {
        boolean invoke(long _self, int key, long _data);
    }

    @FunctionalInterface
    public interface OnWritableChanged extends com.sun.jna.Callback {
        void invoke(long _self, long key, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_settings_new(long schema_id);
        long g_settings_new(String schema_id);
        long g_settings_new_full(long schema, long backend, long path);
        long g_settings_new_full(long schema, long backend, String path);
        long g_settings_new_with_backend(long schema_id, long backend);
        long g_settings_new_with_backend(String schema_id, long backend);
        long g_settings_new_with_backend_and_path(long schema_id, long backend, long path);
        long g_settings_new_with_backend_and_path(String schema_id, long backend, String path);
        long g_settings_new_with_path(long schema_id, long path);
        long g_settings_new_with_path(String schema_id, String path);
        void g_settings_apply(long _self);
        void g_settings_bind(long _self, long key, long object, long property, int flags);
        void g_settings_bind(long _self, String key, long object, String property, int flags);
        void g_settings_bind_with_mapping(long _self, long key, long object, long property, int flags, com.sun.jna.Callback get_mapping, com.sun.jna.Callback set_mapping, long user_data, com.sun.jna.Callback destroy);
        void g_settings_bind_with_mapping(long _self, String key, long object, String property, int flags, com.sun.jna.Callback get_mapping, com.sun.jna.Callback set_mapping, long user_data, com.sun.jna.Callback destroy);
        void g_settings_bind_writable(long _self, long key, long object, long property, boolean inverted);
        void g_settings_bind_writable(long _self, String key, long object, String property, boolean inverted);
        long g_settings_create_action(long _self, long key);
        long g_settings_create_action(long _self, String key);
        void g_settings_delay(long _self);
        void g_settings_get(long _self, long key, long format, java.lang.Object... _elipse);
        void g_settings_get(long _self, String key, String format, java.lang.Object... _elipse);
        boolean g_settings_get_boolean(long _self, long key);
        boolean g_settings_get_boolean(long _self, String key);
        long g_settings_get_child(long _self, long name);
        long g_settings_get_child(long _self, String name);
        long g_settings_get_default_value(long _self, long key);
        long g_settings_get_default_value(long _self, String key);
        double g_settings_get_double(long _self, long key);
        double g_settings_get_double(long _self, String key);
        int g_settings_get_enum(long _self, long key);
        int g_settings_get_enum(long _self, String key);
        int g_settings_get_flags(long _self, long key);
        int g_settings_get_flags(long _self, String key);
        boolean g_settings_get_has_unapplied(long _self);
        int g_settings_get_int(long _self, long key);
        int g_settings_get_int(long _self, String key);
        long g_settings_get_int64(long _self, long key);
        long g_settings_get_int64(long _self, String key);
        long g_settings_get_string(long _self, long key);
        long g_settings_get_string(long _self, String key);
        int g_settings_get_uint(long _self, long key);
        int g_settings_get_uint(long _self, String key);
        long g_settings_get_uint64(long _self, long key);
        long g_settings_get_uint64(long _self, String key);
        long g_settings_get_user_value(long _self, long key);
        long g_settings_get_user_value(long _self, String key);
        long g_settings_get_value(long _self, long key);
        long g_settings_get_value(long _self, String key);
        boolean g_settings_is_writable(long _self, long name);
        boolean g_settings_is_writable(long _self, String name);
        void g_settings_reset(long _self, long key);
        void g_settings_reset(long _self, String key);
        void g_settings_revert(long _self);
        boolean g_settings_set(long _self, long key, long format, java.lang.Object... _elipse);
        boolean g_settings_set(long _self, String key, String format, java.lang.Object... _elipse);
        boolean g_settings_set_boolean(long _self, long key, boolean value);
        boolean g_settings_set_boolean(long _self, String key, boolean value);
        boolean g_settings_set_double(long _self, long key, double value);
        boolean g_settings_set_double(long _self, String key, double value);
        boolean g_settings_set_enum(long _self, long key, int value);
        boolean g_settings_set_enum(long _self, String key, int value);
        boolean g_settings_set_flags(long _self, long key, int value);
        boolean g_settings_set_flags(long _self, String key, int value);
        boolean g_settings_set_int(long _self, long key, int value);
        boolean g_settings_set_int(long _self, String key, int value);
        boolean g_settings_set_int64(long _self, long key, long value);
        boolean g_settings_set_int64(long _self, String key, long value);
        boolean g_settings_set_string(long _self, long key, long value);
        boolean g_settings_set_string(long _self, String key, String value);
        boolean g_settings_set_uint(long _self, long key, int value);
        boolean g_settings_set_uint(long _self, String key, int value);
        boolean g_settings_set_uint64(long _self, long key, long value);
        boolean g_settings_set_uint64(long _self, String key, long value);
        boolean g_settings_set_value(long _self, long key, long value);
        boolean g_settings_set_value(long _self, String key, long value);
        void g_settings_sync();
        void g_settings_unbind(long object, long property);
        long g_settings_get_type();
    }

}
