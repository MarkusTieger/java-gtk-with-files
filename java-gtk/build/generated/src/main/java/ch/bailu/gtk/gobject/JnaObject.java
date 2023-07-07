/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaObject {

    @FunctionalInterface
    public interface OnToggleNotify extends com.sun.jna.Callback {
        void invoke(long data, long object, boolean is_last_ref);
    }

    @FunctionalInterface
    public interface OnBindingTransformFunc extends com.sun.jna.Callback {
        boolean invoke(long binding, long from_value, long to_value, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnDuplicateFunc extends com.sun.jna.Callback {
        long invoke(long data, long user_data);
    }

    @FunctionalInterface
    public interface OnWeakNotify extends com.sun.jna.Callback {
        void invoke(long data, long where_the_object_was);
    }

    @FunctionalInterface
    public interface OnNotify extends com.sun.jna.Callback {
        void invoke(long _self, long pspec, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_object_new(long object_type, long first_property_name, java.lang.Object... _elipse);
        long g_object_new(long object_type, String first_property_name, java.lang.Object... _elipse);
        void g_object_add_toggle_ref(long _self, com.sun.jna.Callback notify, long data);
        long g_object_bind_property(long _self, long source_property, long target, long target_property, int flags);
        long g_object_bind_property(long _self, String source_property, long target, String target_property, int flags);
        long g_object_bind_property_full(long _self, long source_property, long target, long target_property, int flags, com.sun.jna.Callback transform_to, com.sun.jna.Callback transform_from, long user_data, com.sun.jna.Callback notify);
        long g_object_bind_property_full(long _self, String source_property, long target, String target_property, int flags, com.sun.jna.Callback transform_to, com.sun.jna.Callback transform_from, long user_data, com.sun.jna.Callback notify);
        long g_object_bind_property_with_closures(long _self, long source_property, long target, long target_property, int flags, long transform_to, long transform_from);
        long g_object_bind_property_with_closures(long _self, String source_property, long target, String target_property, int flags, long transform_to, long transform_from);
        long g_object_connect(long _self, long signal_spec, java.lang.Object... _elipse);
        long g_object_connect(long _self, String signal_spec, java.lang.Object... _elipse);
        void g_object_disconnect(long _self, long signal_spec, java.lang.Object... _elipse);
        void g_object_disconnect(long _self, String signal_spec, java.lang.Object... _elipse);
        long g_object_dup_data(long _self, long key, com.sun.jna.Callback dup_func, long user_data);
        long g_object_dup_data(long _self, String key, com.sun.jna.Callback dup_func, long user_data);
        long g_object_dup_qdata(long _self, int quark, com.sun.jna.Callback dup_func, long user_data);
        void g_object_force_floating(long _self);
        void g_object_freeze_notify(long _self);
        void g_object_get(long _self, long first_property_name, java.lang.Object... _elipse);
        void g_object_get(long _self, String first_property_name, java.lang.Object... _elipse);
        long g_object_get_data(long _self, long key);
        long g_object_get_data(long _self, String key);
        void g_object_get_property(long _self, long property_name, long value);
        void g_object_get_property(long _self, String property_name, long value);
        long g_object_get_qdata(long _self, int quark);
        boolean g_object_is_floating(long _self);
        void g_object_notify(long _self, long property_name);
        void g_object_notify(long _self, String property_name);
        void g_object_notify_by_pspec(long _self, long pspec);
        long g_object_ref(long _self);
        long g_object_ref_sink(long _self);
        void g_object_remove_toggle_ref(long _self, com.sun.jna.Callback notify, long data);
        boolean g_object_replace_data(long _self, long key, long oldval, long newval, com.sun.jna.Callback destroy, com.sun.jna.Callback old_destroy);
        boolean g_object_replace_data(long _self, String key, long oldval, long newval, com.sun.jna.Callback destroy, com.sun.jna.Callback old_destroy);
        boolean g_object_replace_qdata(long _self, int quark, long oldval, long newval, com.sun.jna.Callback destroy, com.sun.jna.Callback old_destroy);
        void g_object_run_dispose(long _self);
        void g_object_set(long _self, long first_property_name, java.lang.Object... _elipse);
        void g_object_set(long _self, String first_property_name, java.lang.Object... _elipse);
        void g_object_set_data(long _self, long key, long data);
        void g_object_set_data(long _self, String key, long data);
        void g_object_set_data_full(long _self, long key, long data, com.sun.jna.Callback destroy);
        void g_object_set_data_full(long _self, String key, long data, com.sun.jna.Callback destroy);
        void g_object_set_property(long _self, long property_name, long value);
        void g_object_set_property(long _self, String property_name, long value);
        void g_object_set_qdata(long _self, int quark, long data);
        void g_object_set_qdata_full(long _self, int quark, long data, com.sun.jna.Callback destroy);
        long g_object_steal_data(long _self, long key);
        long g_object_steal_data(long _self, String key);
        long g_object_steal_qdata(long _self, int quark);
        long g_object_take_ref(long _self);
        void g_object_thaw_notify(long _self);
        void g_object_unref(long _self);
        void g_object_watch_closure(long _self, long closure);
        void g_object_weak_ref(long _self, com.sun.jna.Callback notify, long data);
        void g_object_weak_unref(long _self, com.sun.jna.Callback notify, long data);
        long g_object_compat_control(long what, long data);
        long g_object_interface_find_property(long g_iface, long property_name);
        void g_object_interface_install_property(long g_iface, long pspec);
        long g_object_get_type();
    }

}
