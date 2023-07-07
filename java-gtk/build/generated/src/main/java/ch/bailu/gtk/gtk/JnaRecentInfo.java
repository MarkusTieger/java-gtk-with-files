/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRecentInfo {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_recent_info_create_app_info(long _self, long app_name, long _error);
        long gtk_recent_info_create_app_info(long _self, String app_name, long _error);
        boolean gtk_recent_info_exists(long _self);
        long gtk_recent_info_get_added(long _self);
        int gtk_recent_info_get_age(long _self);
        long gtk_recent_info_get_applications(long _self, long length);
        long gtk_recent_info_get_description(long _self);
        long gtk_recent_info_get_display_name(long _self);
        long gtk_recent_info_get_gicon(long _self);
        long gtk_recent_info_get_groups(long _self, long length);
        long gtk_recent_info_get_mime_type(long _self);
        long gtk_recent_info_get_modified(long _self);
        boolean gtk_recent_info_get_private_hint(long _self);
        long gtk_recent_info_get_short_name(long _self);
        long gtk_recent_info_get_uri(long _self);
        long gtk_recent_info_get_uri_display(long _self);
        long gtk_recent_info_get_visited(long _self);
        boolean gtk_recent_info_has_application(long _self, long app_name);
        boolean gtk_recent_info_has_application(long _self, String app_name);
        boolean gtk_recent_info_has_group(long _self, long group_name);
        boolean gtk_recent_info_has_group(long _self, String group_name);
        boolean gtk_recent_info_is_local(long _self);
        long gtk_recent_info_last_application(long _self);
        boolean gtk_recent_info_match(long _self, long info_b);
        long gtk_recent_info_ref(long _self);
        void gtk_recent_info_unref(long _self);
        long gtk_recent_info_get_type();
    }

}
