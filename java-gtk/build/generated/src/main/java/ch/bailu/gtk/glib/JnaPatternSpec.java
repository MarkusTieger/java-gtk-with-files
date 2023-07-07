/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaPatternSpec {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_pattern_spec_new(long pattern);
        long g_pattern_spec_new(String pattern);
        long g_pattern_spec_copy(long _self);
        boolean g_pattern_spec_equal(long _self, long pspec2);
        void g_pattern_spec_free(long _self);
        boolean g_pattern_spec_match(long _self, long string_length, long string, long string_reversed);
        boolean g_pattern_spec_match(long _self, long string_length, String string, String string_reversed);
        boolean g_pattern_spec_match_string(long _self, long string);
        boolean g_pattern_spec_match_string(long _self, String string);
        long g_pattern_spec_get_type();
    }

}
