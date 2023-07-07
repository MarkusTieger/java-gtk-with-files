/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaRegex {

    @FunctionalInterface
    public interface OnRegexEvalCallback extends com.sun.jna.Callback {
        boolean invoke(long match_info, long result, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_regex_new(long pattern, int compile_options, int match_options, long _error);
        long g_regex_new(String pattern, int compile_options, int match_options, long _error);
        int g_regex_get_capture_count(long _self);
        int g_regex_get_compile_flags(long _self);
        boolean g_regex_get_has_cr_or_lf(long _self);
        int g_regex_get_match_flags(long _self);
        int g_regex_get_max_backref(long _self);
        int g_regex_get_max_lookbehind(long _self);
        long g_regex_get_pattern(long _self);
        int g_regex_get_string_number(long _self, long name);
        int g_regex_get_string_number(long _self, String name);
        long g_regex_ref(long _self);
        long g_regex_replace(long _self, long string, long string_len, int start_position, long replacement, int match_options, long _error);
        long g_regex_replace(long _self, String string, long string_len, int start_position, String replacement, int match_options, long _error);
        long g_regex_replace_eval(long _self, long string, long string_len, int start_position, int match_options, com.sun.jna.Callback eval, long user_data, long _error);
        long g_regex_replace_eval(long _self, String string, long string_len, int start_position, int match_options, com.sun.jna.Callback eval, long user_data, long _error);
        long g_regex_replace_literal(long _self, long string, long string_len, int start_position, long replacement, int match_options, long _error);
        long g_regex_replace_literal(long _self, String string, long string_len, int start_position, String replacement, int match_options, long _error);
        void g_regex_unref(long _self);
        boolean g_regex_check_replacement(long replacement, long has_references, long _error);
        int g_regex_error_quark();
        long g_regex_escape_nul(long string, int length);
        long g_regex_escape_string(long string, int length);
        boolean g_regex_match_simple(long pattern, long string, int compile_options, int match_options);
        long g_regex_get_type();
    }

}
