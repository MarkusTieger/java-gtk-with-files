/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaOptionContext {

    @FunctionalInterface
    public interface OnTranslateFunc extends com.sun.jna.Callback {
        long invoke(long str, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_option_context_add_group(long _self, long group);
        void g_option_context_free(long _self);
        long g_option_context_get_description(long _self);
        long g_option_context_get_help(long _self, boolean main_help, long group);
        boolean g_option_context_get_help_enabled(long _self);
        boolean g_option_context_get_ignore_unknown_options(long _self);
        long g_option_context_get_main_group(long _self);
        boolean g_option_context_get_strict_posix(long _self);
        long g_option_context_get_summary(long _self);
        void g_option_context_set_description(long _self, long description);
        void g_option_context_set_description(long _self, String description);
        void g_option_context_set_help_enabled(long _self, boolean help_enabled);
        void g_option_context_set_ignore_unknown_options(long _self, boolean ignore_unknown);
        void g_option_context_set_main_group(long _self, long group);
        void g_option_context_set_strict_posix(long _self, boolean strict_posix);
        void g_option_context_set_summary(long _self, long summary);
        void g_option_context_set_summary(long _self, String summary);
        void g_option_context_set_translate_func(long _self, com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy_notify);
        void g_option_context_set_translation_domain(long _self, long domain);
        void g_option_context_set_translation_domain(long _self, String domain);
        long g_option_context_new(long parameter_string);
    }

}
