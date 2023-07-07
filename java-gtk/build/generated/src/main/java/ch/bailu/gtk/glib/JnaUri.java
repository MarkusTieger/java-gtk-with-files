/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaUri {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_uri_get_auth_params(long _self);
        int g_uri_get_flags(long _self);
        long g_uri_get_fragment(long _self);
        long g_uri_get_host(long _self);
        long g_uri_get_password(long _self);
        long g_uri_get_path(long _self);
        int g_uri_get_port(long _self);
        long g_uri_get_query(long _self);
        long g_uri_get_scheme(long _self);
        long g_uri_get_user(long _self);
        long g_uri_get_userinfo(long _self);
        long g_uri_parse_relative(long _self, long uri_ref, int flags, long _error);
        long g_uri_parse_relative(long _self, String uri_ref, int flags, long _error);
        long g_uri_ref(long _self);
        long g_uri_to_string(long _self);
        long g_uri_to_string_partial(long _self, int flags);
        void g_uri_unref(long _self);
        long g_uri_build(int flags, long scheme, long userinfo, long host, int port, long path, long query, long fragment);
        long g_uri_build_with_user(int flags, long scheme, long user, long password, long auth_params, long host, int port, long path, long query, long fragment);
        int g_uri_error_quark();
        long g_uri_escape_string(long unescaped, long reserved_chars_allowed, boolean allow_utf8);
        boolean g_uri_is_valid(long uri_string, int flags, long _error);
        long g_uri_join(int flags, long scheme, long userinfo, long host, int port, long path, long query, long fragment);
        long g_uri_join_with_user(int flags, long scheme, long user, long password, long auth_params, long host, int port, long path, long query, long fragment);
        long g_uri_parse(long uri_string, int flags, long _error);
        long g_uri_parse_params(long params, long length, long separators, int flags, long _error);
        long g_uri_parse_scheme(long uri);
        long g_uri_peek_scheme(long uri);
        long g_uri_resolve_relative(long base_uri_string, long uri_ref, int flags, long _error);
        long g_uri_unescape_bytes(long escaped_string, long length, long illegal_characters, long _error);
        long g_uri_unescape_segment(long escaped_string, long escaped_string_end, long illegal_characters);
        long g_uri_unescape_string(long escaped_string, long illegal_characters);
        long g_uri_get_type();
    }

}
