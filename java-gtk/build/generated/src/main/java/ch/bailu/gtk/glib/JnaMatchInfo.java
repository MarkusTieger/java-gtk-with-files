/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaMatchInfo {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_match_info_expand_references(long _self, long string_to_expand, long _error);
        long g_match_info_expand_references(long _self, String string_to_expand, long _error);
        long g_match_info_fetch(long _self, int match_num);
        long g_match_info_fetch_named(long _self, long name);
        long g_match_info_fetch_named(long _self, String name);
        boolean g_match_info_fetch_named_pos(long _self, long name, long start_pos, long end_pos);
        boolean g_match_info_fetch_named_pos(long _self, String name, long start_pos, long end_pos);
        boolean g_match_info_fetch_pos(long _self, int match_num, long start_pos, long end_pos);
        void g_match_info_free(long _self);
        int g_match_info_get_match_count(long _self);
        long g_match_info_get_regex(long _self);
        long g_match_info_get_string(long _self);
        boolean g_match_info_is_partial_match(long _self);
        boolean g_match_info_matches(long _self);
        boolean g_match_info_next(long _self, long _error);
        long g_match_info_ref(long _self);
        void g_match_info_unref(long _self);
        long g_match_info_get_type();
    }

}
