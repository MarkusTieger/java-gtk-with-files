/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileAttributeMatcher {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_file_attribute_matcher_new(long attributes);
        long g_file_attribute_matcher_new(String attributes);
        boolean g_file_attribute_matcher_enumerate_namespace(long _self, long ns);
        boolean g_file_attribute_matcher_enumerate_namespace(long _self, String ns);
        long g_file_attribute_matcher_enumerate_next(long _self);
        boolean g_file_attribute_matcher_matches(long _self, long attribute);
        boolean g_file_attribute_matcher_matches(long _self, String attribute);
        boolean g_file_attribute_matcher_matches_only(long _self, long attribute);
        boolean g_file_attribute_matcher_matches_only(long _self, String attribute);
        long g_file_attribute_matcher_ref(long _self);
        long g_file_attribute_matcher_subtract(long _self, long subtract);
        long g_file_attribute_matcher_to_string(long _self);
        void g_file_attribute_matcher_unref(long _self);
        long g_file_attribute_matcher_get_type();
    }

}
