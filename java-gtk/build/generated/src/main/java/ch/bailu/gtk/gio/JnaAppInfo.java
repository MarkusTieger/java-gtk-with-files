/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaAppInfo {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_app_info_add_supports_type(long _self, long content_type, long _error);
        boolean g_app_info_add_supports_type(long _self, String content_type, long _error);
        boolean g_app_info_can_delete(long _self);
        boolean g_app_info_can_remove_supports_type(long _self);
        boolean g_app_info_delete(long _self);
        long g_app_info_dup(long _self);
        boolean g_app_info_equal(long _self, long appinfo2);
        long g_app_info_get_commandline(long _self);
        long g_app_info_get_description(long _self);
        long g_app_info_get_display_name(long _self);
        long g_app_info_get_executable(long _self);
        long g_app_info_get_icon(long _self);
        long g_app_info_get_id(long _self);
        long g_app_info_get_name(long _self);
        long g_app_info_get_supported_types(long _self);
        boolean g_app_info_launch(long _self, long files, long context, long _error);
        boolean g_app_info_launch_uris(long _self, long uris, long context, long _error);
        void g_app_info_launch_uris_async(long _self, long uris, long context, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_app_info_launch_uris_finish(long _self, long result, long _error);
        boolean g_app_info_remove_supports_type(long _self, long content_type, long _error);
        boolean g_app_info_remove_supports_type(long _self, String content_type, long _error);
        boolean g_app_info_set_as_default_for_extension(long _self, long extension, long _error);
        boolean g_app_info_set_as_default_for_extension(long _self, String extension, long _error);
        boolean g_app_info_set_as_default_for_type(long _self, long content_type, long _error);
        boolean g_app_info_set_as_default_for_type(long _self, String content_type, long _error);
        boolean g_app_info_set_as_last_used_for_type(long _self, long content_type, long _error);
        boolean g_app_info_set_as_last_used_for_type(long _self, String content_type, long _error);
        boolean g_app_info_should_show(long _self);
        boolean g_app_info_supports_files(long _self);
        boolean g_app_info_supports_uris(long _self);
        long g_app_info_create_from_commandline(long commandline, long application_name, int flags, long _error);
        long g_app_info_get_all();
        long g_app_info_get_all_for_type(long content_type);
        long g_app_info_get_default_for_type(long content_type, boolean must_support_uris);
        void g_app_info_get_default_for_type_async(long content_type, boolean must_support_uris, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_app_info_get_default_for_type_finish(long result, long _error);
        long g_app_info_get_default_for_uri_scheme(long uri_scheme);
        void g_app_info_get_default_for_uri_scheme_async(long uri_scheme, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_app_info_get_default_for_uri_scheme_finish(long result, long _error);
        long g_app_info_get_fallback_for_type(long content_type);
        long g_app_info_get_recommended_for_type(long content_type);
        boolean g_app_info_launch_default_for_uri(long uri, long context, long _error);
        void g_app_info_launch_default_for_uri_async(long uri, long context, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_app_info_launch_default_for_uri_finish(long result, long _error);
        void g_app_info_reset_type_associations(long content_type);
        long g_app_info_get_type();
    }

}
