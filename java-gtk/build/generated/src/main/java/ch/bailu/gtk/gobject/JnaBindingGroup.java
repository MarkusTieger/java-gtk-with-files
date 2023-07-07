/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaBindingGroup {

    @FunctionalInterface
    public interface OnBindingTransformFunc extends com.sun.jna.Callback {
        boolean invoke(long binding, long from_value, long to_value, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_binding_group_new();
        void g_binding_group_bind(long _self, long source_property, long target, long target_property, int flags);
        void g_binding_group_bind(long _self, String source_property, long target, String target_property, int flags);
        void g_binding_group_bind_full(long _self, long source_property, long target, long target_property, int flags, com.sun.jna.Callback transform_to, com.sun.jna.Callback transform_from, long user_data, com.sun.jna.Callback user_data_destroy);
        void g_binding_group_bind_full(long _self, String source_property, long target, String target_property, int flags, com.sun.jna.Callback transform_to, com.sun.jna.Callback transform_from, long user_data, com.sun.jna.Callback user_data_destroy);
        void g_binding_group_bind_with_closures(long _self, long source_property, long target, long target_property, int flags, long transform_to, long transform_from);
        void g_binding_group_bind_with_closures(long _self, String source_property, long target, String target_property, int flags, long transform_to, long transform_from);
        long g_binding_group_dup_source(long _self);
        void g_binding_group_set_source(long _self, long source);
        long g_binding_group_get_type();
    }

}
