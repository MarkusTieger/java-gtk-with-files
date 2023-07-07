/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaOptionGroup {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnOptionErrorFunc extends com.sun.jna.Callback {
        void invoke(long context, long group, long user_data, long _error);
    }

    @FunctionalInterface
    public interface OnOptionParseFunc extends com.sun.jna.Callback {
        boolean invoke(long context, long group, long user_data, long _error);
    }

    @FunctionalInterface
    public interface OnTranslateFunc extends com.sun.jna.Callback {
        long invoke(long str, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_option_group_new(long name, long description, long help_description, long user_data, com.sun.jna.Callback destroy);
        long g_option_group_new(String name, String description, String help_description, long user_data, com.sun.jna.Callback destroy);
        long g_option_group_ref(long _self);
        void g_option_group_set_error_hook(long _self, com.sun.jna.Callback error_func);
        void g_option_group_set_parse_hooks(long _self, com.sun.jna.Callback pre_parse_func, com.sun.jna.Callback post_parse_func);
        void g_option_group_set_translate_func(long _self, com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy_notify);
        void g_option_group_set_translation_domain(long _self, long domain);
        void g_option_group_set_translation_domain(long _self, String domain);
        void g_option_group_unref(long _self);
        long g_option_group_get_type();
    }

}
